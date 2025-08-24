## 🧪 실습 1: GitHub 회원가입 및 원격 저장소 생성  [chapter001]

1. [GitHub](https://github.com/)에 회원가입 후 로그인  
2. 원격 저장소 생성  
   - 저장소 주소: `https://github.com/sally03915/git0.git`

---

## 🧪 실습 2: Git 설치

1. [Git 공식 사이트](https://git-scm.com/) 접속  
2. Git 다운로드 및 설치

---

## 🧪 실습 3: Git 사용자 정보 설정

### 🔧 사용자 정보 등록
```bash
$ git config --global user.name "sally An"
$ git config --global user.email "sally03915@gmail.com"
```

### 🔍 설정 확인
```bash
$ git config --list
```

📋 예시 출력:
```bash
user.name=sally An
user.email=sally03915@gmail.com
...
```

---

## 🧪 실습 4: 프로젝트 폴더 생성 및 Git 초기화

### 📁 폴더 생성 및 VS Code로 열기
```bash
C:\> mkdir git0
C:\> cd git0
C:\git0> code .
```

### 🖥️ VS Code에서 터미널 열기
- 메뉴: [Terminal] → [New Terminal]

### 📄 파일 생성
- `basic001.html` 파일 생성

### 🧵 Git 저장소 초기화 및 커밋
```bash
PS C:\git0> git init                     # 저장소 초기화
PS C:\git0> git add .                   # 모든 파일 추가
PS C:\git0> git status                  # 상태 확인
PS C:\git0> git commit -m "first commit"  # 첫 커밋
```

### 🌐 원격 저장소 연결 및 푸시
```bash
PS C:\git0> git remote add origin https://github.com/sally03915/git0.git
PS C:\git0> git remote -v               # 연결 확인
PS C:\git0> git push origin master      # 원격 저장소로 푸시
```

### ✅ GitHub에서 업로드 확인

---

## ⚠️ 오류 발생 시 대처 방법

### ❌ 오류 메시지 예시
```bash
remote: Permission to newaccount/projectname.git denied to oldaccount.
fatal: unable to access 'https://github.com/newaccount/projectname.git/': The requested URL returned error: 403
```

### 🛠️ 해결 방법
1. 제어판 → Windows 자격 증명 → 일반 자격 증명 탭 확인  
2. 기존 GitHub 토큰 삭제 또는 새 사용자 계정 추가

#### 🔐 사용자 계정 추가 예시
- 항목: `git:https://github.com`
- 사용자 이름: `sally03915`
- 암호: GitHub 로그인 시 사용하는 비밀번호

---

## 🧪 실습 5: pull & push  [chapter002]

### 실습 시나리오
1. GitHub에서 track001.md 파일을 수정
2. 로컬에서도 같은 파일을 수정 후 커밋
```bash
git  add  track001.md
git commit -m "chapter2-1.  track001.md"
git pull origin master 
```
3. 실행 시 충돌 발생 - 에러확인
- 콘솔 맨밑에 2줄
```bash
CONFLICT (content): Merge conflict in track001.md
Automatic merge failed; fix conflicts and then commit the result.
```
4. 해결방법
```bash
1. 오류파일 수정하고 
2. 다시 시도
git  add  track001.md
git commit -m "오류해결.  track001.md"
git pull origin master 
git push origin master
```

---
## 🧪 실습 6: pull & push  [chapter003]
1. 마크다운기본 -  `chapter003_markdown.md`
2. 마크다운실습 -  README.md 

---
## 🧪 실습 7: 협업 [chapter004]
1. https://github.com/explore
2. fork 누르기
```bash
https://github.com/home-assistant/frontend
```
3. 내 컴퓨터로 가져오기 (Clone)
```
git clone https://github.com/내아이디/복사된저장소.git
cd 복사된저장소
```

```
git clone https://github.com/sally03915/frontend-assistant
cd  frontend-assistant
```

4. 새 작업 공간 만들기 (Branch)
- 원본은 그대로 두고, 새 그림을 그릴 공간을 만든 거예요
```bash
git checkout -b feature-sally03915 
```

5. 파일 수정하고 저장하기
```bash
basic001.html 파일에 내용 추가
git add .
git commit -m "메시지"
```

6. GitHub에 올리기
```bash
git push origin feature-sally03915
```

7.  Pull Request 보내기
```bash
1. GitHub 저장소 접속
2. "Compare & pull request" 버튼 클릭
3. 설명 작성 후 "Create pull request" 클릭
4. 친구에게  이거 어때요~ 하고 제안하는 거예요
```

8. 7: 코드 리뷰 & 병합하기
```bash
친구가 코드를 확인하고 승인
"Merge pull request" 클릭
"Confirm merge"로 병합 완료
```