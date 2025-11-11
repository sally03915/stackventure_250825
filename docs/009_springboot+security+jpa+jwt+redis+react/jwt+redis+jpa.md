#### ⚙️ 1. 프로젝트 생성

##### 1. **설정 항목:**
- **Project:** Gradle - Groovy
- **Language:** Java
- **Spring Boot:** 3.1.x 이상
- **Packaging:** Jar (JSP 사용 시 War)
- **Java Version:** 17 또는 21

##### 2. **필수 Dependencies:**
- Spring Web
- Spring Security
- Spring Data Redis
- Spring Data JPA
- Lombok
- Spring Boot DevTools
- Oracle Driver
- Validation

> JWT는 별도 라이브러리로 추가  Initializr에서는 선택하지 않아도 됨.

```
src/
└── main/
    ├── java/
    │   └── com.d2big/
    │       ├── config/              # 🔧 설정 클래스 (Security, JWT, Redis 등)
    │       ├── controller/          # 🎮 REST API 컨트롤러
    │       ├── dto/                 # 📦 요청/응답 DTO
    │       ├── entity/              # 🧬 JPA 엔티티 클래스
    │       ├── repository/          # 🗃️ JPA Repository 인터페이스
    │       ├── service/             # ⚙️ 비즈니스 로직
    │       ├── security/            # 🔐 JWT, 필터, 인증 관련 클래스
    │       └── util/                # 🧰 유틸리티 클래스 (토큰, 암호화 등)
    └── resources/
        ├── application.yml          # ⚙️ 설정 파일
        ├── static/                  # 🌐 정적 리소스 (필요 시)
        └── templates/               # 🧾 템플릿 파일 (Thymeleaf 등 사용 시)
```


##### 3.   `build.gradle` 설정

```groovy
plugins {
	id 'java'
	id 'org.springframework.boot' version '3.4.11'
	id 'io.spring.dependency-management' version '1.1.7'
}

group = 'com.d2big'
version = '0.0.1-SNAPSHOT'
description = 'Demo project for Spring Boot'
sourceCompatibility = '17'

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

configurations {
	compileOnly {
		extendsFrom annotationProcessor
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-data-redis'
	implementation 'org.springframework.boot:spring-boot-starter-security'
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	runtimeOnly 'com.oracle.database.jdbc:ojdbc11'
	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'org.springframework.security:spring-security-test'
	testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}

tasks.named('test') {
	useJUnitPlatform()
}

```

---

#### ⚙️ 🧾 4. `application.yml` 설정

```yaml
spring:
  datasource:
    driver-class-name: oracle.jdbc.OracleDriver
    url: jdbc:oracle:thin:@localhost:1521:xe
    username: your_oracle_user
    password: your_oracle_password

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true

  redis:
    host: localhost
    port: 6379

jwt:
  secret: your-super-secret-key
  access-token-expiration: 3600000
  refresh-token-expiration: 1209600000

logging:
  level:
    org.springframework.security: DEBUG
```

---

#### ⚙️ 🧱 4. Redis 서버 설치 및 실행

##### ✅ Windows
1. [Redis for Windows GitHub](https://github.com/microsoftarchive/redis/releases)에서 `.msi` 또는 `.zip` 설치 파일 다운로드
2. 설치 후 `redis-server.exe` 실행
3. `redis-cli.exe`로 `ping` 테스트 → `PONG` 나오면 성공

##### ✅ macOS
```bash
brew install redis
brew services start redis
```

##### ✅ Ubuntu / Debian
```bash
sudo apt update
sudo apt install redis-server
sudo systemctl enable redis
sudo systemctl start redis
```

##### ✅ 실행 확인
```bash
redis-cli ping
```
결과가 `PONG`이면 Redis 서버가 정상적으로 실행 중입니다.



---

#### ⚙️ 🧾 5.  entity / repository / dto

src/
└── main/
    ├── java/
    │   └── com.d2big/
    │       ├── config/              # 🔧 설정 클래스 (Security, JWT, Redis 등)
    │       ├── controller/          # 🎮 REST API 컨트롤러
    │       ├── dto/                 # 📦 요청/응답 DTO
    │       ├── entity/              # 🧬 JPA 엔티티 클래스
    │       ├── repository/          # 🗃️ JPA Repository 인터페이스
    │       ├── service/             # ⚙️ 비즈니스 로직
    │       ├── security/            # 🔐 JWT, 필터, 인증 관련 클래스
    │       └── util/                # 🧰 유틸리티 클래스 (토큰, 암호화 등)
    └── resources/
        ├── application.yml          # ⚙️ 설정 파일
        ├── static/                  # 🌐 정적 리소스 (필요 시)
        └── templates/               # 🧾 템플릿 파일 (Thymeleaf 등 사용 시)


## 🧭 **0단계: Entity, Repository 정의**
1. com.d2big.entity  - Board, Member
2. com.d2big.repository  - BoardRepository, MemberRepository

## 🧭 **1단계: DTO 정의**
먼저 데이터 흐름을 명확히 하기 위해 요청/응답 DTO를 먼저 만듭니다.

- `MemberSignupRequest`
- `MemberLoginRequest`
- `TokenResponse`

- com.d2big.dto
    MemberSignupRequest: 회원가입 요청
    MemberLoginRequest: 로그인 요청
    TokenResponse: 로그인/재발급 응답


> 이렇게 하면 Service와 Controller에서 어떤 데이터를 주고받는지 명확
---

## 🧭 **2단계: JWT & Redis 유틸 클래스**
JWT 발급과 Redis 저장을 담당할 유틸리티 클래스들을 먼저 만들어둡니다.

- `JwtUtil`: Access/Refresh Token 생성, 검증, 파싱
- `RedisUtil`: Refresh Token 저장, 조회, 삭제

> 이 유틸들이 있어야 Service에서 인증 로직을 구현할 수 있어요.

---

## 🧭 **3단계: MemberService 구현**
DTO와 유틸을 기반으로 실제 비즈니스 로직을 작성합니다.

- 회원가입
- 로그인 (JWT 발급 + Redis 저장)
- 로그아웃 (Redis 삭제)
- 토큰 재발급

---

## 🧭 **4단계: MemberRepository 구현**
JPA 기반으로 `MemberRepository`를 작성합니다.

- `findByUsername`, `findById`, `deleteById` 등

---

## 🧭 **5단계: Controller 작성**
Service를 호출하는 REST API를 구성합니다.

- `/api/auth/signup`
- `/api/auth/login`
- `/api/auth/logout`
- `/api/auth/reissue`



---

## 🧭 **6단계: SecurityConfig + JwtFilter 작성** 
- 로그인한 사용자만 특정 API에 접근 가능
- BoardService에서 "글쓴 사람만 수정/삭제 가능" 조건을 안전하게 구현
- 토큰 기반 인증 흐름을 전체 프로젝트에 적용

🔧 구성해야 할 것들
SecurityConfig.java → JWT 필터 등록, 인증/인가 경로 설정
JwtFilter.java → 요청마다 토큰 검증, 사용자 인증 처리
JwtAuthenticationProvider 또는 JwtAuthenticationToken (선택) → 인증 객체 생성 및 관리



---

## 🧭 **7단계: Board 작성** 
- Board Service
- Board Controller 정리



---

## 🧭 **8단계: Upgrade (1)  Board 기능에 DTO 적용** 
- Board 기능에 DTO 적용
BoardRequestDto, BoardResponseDto를 만들어서 Controller와 Service 간 데이터 흐름을 명확하게 분리

엔티티 직접 노출을 피하고, 클라이언트에 필요한 정보만 전달

BoardRequestDto, BoardResponseDto , BoardController , BoardService



---

## 🧭 **8단계: Upgrade (2)  댓글(Comment) 기능  적용** 
- 댓글(Comment) 기능 추가
Comment 엔티티 생성 → Board와 Member에 연관관계 설정

댓글 작성/조회/삭제 기능 구현
인증된 사용자만 댓글 작성 가능하게 설정

- Comment, CommentRepository , CommentRequestDto & CommentResponseDto , CommentService , CommentController
- 대댓글, 수정




---

## 🧭 **8단계: Upgrade (3)  파일 업로드 기능  적용** 
- 파일 업로드 기능 구현
게시글에 이미지나 첨부파일을 업로드할 수 있도록 MultipartFile 처리
파일 저장 경로 설정 + DB에 파일명 저장
 

## ✅ 1. Board 엔티티 수정 – 파일명 저장

```java
@Column(name = "bfile")
private String bfile; // 실제 파일명 또는 저장된 경로
```

이미 포함되어 있다면 그대로 사용하면 됩니다.

---

## ✅ 2. 이미지 업로드용 Controller 엔드포인트

```java
@PostMapping("/upload")
public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
    String uploadDir = "uploads/";
    String originalFilename = file.getOriginalFilename();
    String filePath = uploadDir + UUID.randomUUID() + "_" + originalFilename;

    File dest = new File(filePath);
    dest.getParentFile().mkdirs(); // 디렉토리 없으면 생성
    file.transferTo(dest);

    return ResponseEntity.ok(filePath); // 또는 URL 반환
}
```

> 🔐 이 경로는 `@PreAuthorize` 없이 공개해도 되고, 인증 필요하게 설정해도 됩니다.

---

## ✅ 3. application.properties 설정

```properties
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=10MB
```

---

## ✅ 4. 업로드된 파일 제공 (정적 리소스 설정)

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:uploads/");
    }
}
```

> 이렇게 하면 `/uploads/파일명`으로 접근 가능해집니다.

---

## ✅ 5. 게시글 작성 시 이미지 경로 저장

`BoardRequestDto`의 `bfile` 필드에 업로드된 파일 경로를 넣어주면 됩니다. 예:

```json
{
  "btitle": "제목",
  "bcontent": "내용",
  "bfile": "/uploads/uuid_filename.jpg"
}
```
 


---

## 🧭 **8단계: Upgrade (4)  마이페이지 또는 사용자 정보 조회 API  적용** 
- 로그인한 사용자의 정보, 작성한 글, 댓글 등을 조회하는 /api/member/me 또는 /api/profile API 구성

MemberResponseDto


좋아요! 아래는 JWT 인증 기반으로 구성된 **마이페이지 또는 사용자 정보 조회 API** 전체 구성입니다. 로그인한 사용자가 자신의 정보를 확인할 수 있도록 `MemberController`, `MemberService`, 그리고 DTO를 활용합니다.

---

## ✅ 1. MemberResponseDto – 사용자 정보 응답용 DTO

```java
package com.d2big.dto;

import com.d2big.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {
    private Long id;
    private String username;
    private String nickname;
    private String email;

    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.nickname = member.getNickname();
        this.email = member.getEmail();
    }
}
```

---

## ✅ 2. MemberService – 사용자 정보 조회 메서드

```java
public MemberResponseDto getMyInfo(String username) {
    Member member = memberRepository.findByUsername(username)
        .orElseThrow(() -> new IllegalArgumentException("사용자 정보를 찾을 수 없습니다."));
    return new MemberResponseDto(member);
}
```

---

## ✅ 3. MemberController – 마이페이지 API

```java
@GetMapping("/me")
public ResponseEntity<MemberResponseDto> getMyPage(Authentication authentication) {
    String username = authentication.getName();
    MemberResponseDto response = memberService.getMyInfo(username);
    return ResponseEntity.ok(response);
}
```

> 이 API는 `/api/auth/me` 또는 `/api/member/me` 경로로 설정할 수 있습니다.

---

## ✅ 4. SecurityConfig – 인증 필요 설정 확인

```java
.requestMatchers("/api/auth/**").permitAll()
.anyRequest().authenticated()
```

> `/me`는 인증된 사용자만 접근 가능하므로 `authenticated()` 설정이 필요합니다.

---

## 🧠 결과

- 로그인한 사용자가 자신의 정보를 확인할 수 있음
- JWT 토큰 기반으로 `username` 추출 → DB에서 사용자 정보 조회
- DTO로 필요한 정보만 응답 → 보안 + 유지보수에 유리

---

다음으로 마이페이지에서 사용자가 작성한 게시글/댓글 목록을 함께 조회하거나, 프로필 수정 기능도 확장할 수 있어요. 어떤 걸 이어서 도와드릴까요?


---

## 🧭 **8단계: Upgrade (5)  권한(Role) 기반 접근 제어  적용** 
- ADMIN, MEMBER 역할에 따라 접근 가능한 API 구분
예: 관리자만 게시글 삭제 가능, 일반 사용자는 본인 글만 수정 가능
    

권한(Role) 기반 접근 제어는 Spring Security에서 사용자에게 부여된 역할(Role)에 따라 특정 API나 기능에 대한 접근을 제한하는 방식입니다. 예를 들어, `ADMIN`만 접근 가능한 관리자 페이지, `USER`만 수정 가능한 본인 게시글 등이 이에 해당합니다.

---

## ✅ 1. Member 엔티티에 Role 필드 추가

```java
@Enumerated(EnumType.STRING)
@Column(nullable = false)
private Role role;
```

### 🔧 Role Enum 정의

```java
public enum Role {
    USER, ADMIN
}
```

---

## ✅ 2. JWT 토큰에 Role 포함

JWT 생성 시 사용자 권한을 포함해야 합니다. 예:

```java
claims.put("role", member.getRole().name());
```

그리고 `JwtFilter`에서 `UsernamePasswordAuthenticationToken` 생성 시 권한을 부여합니다:

```java
String role = claims.get("role", String.class);
List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_" + role));
```

---

## ✅ 3. SecurityConfig에서 Role 기반 접근 제어

```java
http
    .authorizeHttpRequests()
    .requestMatchers("/api/admin/**").hasRole("ADMIN")
    .requestMatchers("/api/member/**").hasAnyRole("USER", "ADMIN")
    .anyRequest().authenticated();
```

---

## ✅ 4. Controller에서 메서드 단위 Role 제한

```java
@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/admin/dashboard")
public ResponseEntity<String> adminOnly() {
    return ResponseEntity.ok("관리자 전용 페이지입니다.");
}
```

또는 사용자 본인만 접근 가능하도록:

```java
@PreAuthorize("#username == authentication.name")
@DeleteMapping("/member/{username}")
public ResponseEntity<Void> deleteMyAccount(@PathVariable String username) {
    // 본인 확인 후 삭제
    return ResponseEntity.ok().build();
}
```

---

## ✅ 5. 사용자 권한 확인 API (선택)

```java
@GetMapping("/role")
public ResponseEntity<String> getMyRole(Authentication authentication) {
    return ResponseEntity.ok(authentication.getAuthorities().toString());
}
```

---

## 🧠 요약

| 기능 | 설명 |
|------|------|
| `@PreAuthorize` | 메서드 단위 Role 제한 |
| `hasRole('ADMIN')` | 특정 Role만 접근 허용 |
| `authentication.name` | 현재 로그인한 사용자 이름 |
| `authentication.authorities` | 현재 사용자 권한 목록 |

---

다음으로 관리자 전용 게시글 관리 기능이나, 사용자 권한 변경 기능도 확장할 수 있어요. 어떤 걸 이어서 해볼까요?    


.......................................................................

물론 가능합니다! Spring Boot 기반 애플리케이션에서 **Kakao, Naver, Google, Facebook, Instagram** 등 다양한 소셜 로그인 서비스를 하나로 통합하려면 다음과 같은 방식으로 구성할 수 있습니다:

---

## ✅ 전체 구성 전략

| 구성 요소 | 설명 |
|-----------|------|
| Spring Security + OAuth2 | 기본 인증/인가 프레임워크 |
| OAuth2 Client 설정 | 각 소셜 서비스의 클라이언트 ID/Secret 등록 |
| CustomOAuth2UserService | 사용자 정보 매핑 및 회원가입 처리 |
| JWT 연동 | 로그인 후 JWT 발급 및 인증 유지 |
| Provider 구분 | Kakao, Naver 등은 커스텀 Provider로 처리 필요 |

---

## ✅ 1. 의존성 추가 (Gradle 기준)

```groovy
implementation 'org.springframework.boot:spring-boot-starter-oauth2-client'
implementation 'org.springframework.boot:spring-boot-starter-security'
```

---

## ✅ 2. application.yml 설정 예시

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: YOUR_GOOGLE_CLIENT_ID
            client-secret: YOUR_GOOGLE_SECRET
            scope: profile, email
            redirect-uri: "{baseUrl}/login/oauth2/code/google"
            client-name: Google
          facebook:
            client-id: YOUR_FACEBOOK_CLIENT_ID
            client-secret: YOUR_FACEBOOK_SECRET
            scope: public_profile, email
            redirect-uri: "{baseUrl}/login/oauth2/code/facebook"
            client-name: Facebook
          kakao:
            client-id: YOUR_KAKAO_CLIENT_ID
            client-secret: YOUR_KAKAO_SECRET
            redirect-uri: "{baseUrl}/login/oauth2/code/kakao"
            client-name: Kakao
            authorization-grant-type: authorization_code
            client-authentication-method: POST
          naver:
            client-id: YOUR_NAVER_CLIENT_ID
            client-secret: YOUR_NAVER_SECRET
            redirect-uri: "{baseUrl}/login/oauth2/code/naver"
            client-name: Naver
        provider:
          kakao:
            authorization-uri: https://kauth.kakao.com/oauth/authorize
            token-uri: https://kauth.kakao.com/oauth/token
            user-info-uri: https://kapi.kakao.com/v2/user/me
            user-name-attribute: id
          naver:
            authorization-uri: https://nid.naver.com/oauth2.0/authorize
            token-uri: https://nid.naver.com/oauth2.0/token
            user-info-uri: https://openapi.naver.com/v1/nid/me
            user-name-attribute: response
```

> 🔹 Instagram은 Facebook과 통합되어 있으므로 Facebook OAuth로 처리하거나 별도 API 연동이 필요합니다.

---

## ✅ 3. CustomOAuth2UserService 구현

```java
@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final MemberRepository memberRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        String registrationId = userRequest.getClientRegistration().getRegistrationId(); // kakao, naver, google 등
        String userNameAttr = userRequest.getClientRegistration().getProviderDetails().getUserInfoEndpoint().getUserNameAttributeName();

        Map<String, Object> attributes = oAuth2User.getAttributes();
        OAuthAttributes oauthAttributes = OAuthAttributes.of(registrationId, userNameAttr, attributes);

        Member member = saveOrUpdate(oauthAttributes);
        return new DefaultOAuth2User(
            Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")),
            oauthAttributes.getAttributes(),
            oauthAttributes.getNameAttributeKey()
        );
    }

    private Member saveOrUpdate(OAuthAttributes attributes) {
        return memberRepository.findByEmail(attributes.getEmail())
            .orElseGet(() -> memberRepository.save(attributes.toEntity()));
    }
}
```

---

## ✅ 4. SecurityConfig에 OAuth2 설정 추가

```java
.oauth2Login(oauth2 -> oauth2
    .userInfoEndpoint(userInfo -> userInfo
        .userService(customOAuth2UserService)
    )
)
```

---

## ✅ 5. OAuthAttributes 클래스 생성

```java
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String email;

    public static OAuthAttributes of(String registrationId, String userNameAttributeName, Map<String, Object> attributes) {
        if ("kakao".equals(registrationId)) {
            Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
            return new OAuthAttributes(kakaoAccount.get("email").toString(), attributes, userNameAttributeName);
        }
        if ("naver".equals(registrationId)) {
            Map<String, Object> response = (Map<String, Object>) attributes.get("response");
            return new OAuthAttributes(response.get("email").toString(), attributes, userNameAttributeName);
        }
        // google, facebook 등
        return new OAuthAttributes(attributes.get("email").toString(), attributes, userNameAttributeName);
    }

    public Member toEntity() {
        return Member.builder()
            .email(email)
            .role(Role.USER)
            .build();
    }

    // getters
}
```

---

## 🧠 결과

- `/oauth2/authorization/{provider}` 경로로 소셜 로그인 가능
  - 예: `/oauth2/authorization/kakao`, `/oauth2/authorization/google`
- 로그인 성공 시 사용자 정보 저장 및 JWT 발급 가능
- 하나의 서비스에서 모든 소셜 로그인 통합

---

다음으로 JWT 발급 연동, 프론트엔드 로그인 버튼 구성, 또는 소셜 사용자 정보 수정 기능도 확장할 수 있어요. 어떤 걸 이어서 도와드릴까요?