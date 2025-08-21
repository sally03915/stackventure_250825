---
marp: true
theme: uncover
paginate: true
style: |
  @import url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2107@1.0/D2CodingBig.css');

  /* 공통 스타일 */
  section {
    font-family: 'D2CodingBig', monospace;
    text-align: center;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 60px;
  }

  section h1 {
    font-size: 1.8em;
    margin-bottom: 20px;
    letter-spacing: 0.5px;
  }

  section.cover h1 {
    font-size: 2.5em;
  }

  section h2 {
    font-size: 1.2em;
    margin-bottom: 10px;
    color: #222;
  }



  section h3 {
    font-size: 1em;
    margin-top: 20px;
    margin-bottom: 10px;
    color: #333;
  }

  pre code {
    font-size: 0.9em;
    max-width: 90%;
    text-align: left;
  }

  /* 공통 cover 스타일 */
  section[class^="cover"] {
    background: linear-gradient(135deg, #feda75, #fa7e1e, #d62976, #962fbf, #4f5bd5);
    position: relative;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 100px;
    font-size: 2.5em; /* 살짝 키움 */
    color: #fefefe;   /* 더 밝고 세련된 톤 */
    text-shadow: 0 2px 4px rgba(0, 0, 0, 0.3); /* 입체감 추가 */
    line-height: 1.4;
    letter-spacing: 0.8px;
  }

  section[class^="cover"] h1 {
    font-size: 3em;
    font-weight: 700;
    margin-bottom: 20px;
    color: #ffffff;
  }

  section[class^="cover"] h2 {
    font-size: 1.6em;
    font-weight: 400;
    color: #f0f0f0;
    margin-bottom: 10px;
  }

  section.cover::after {
    content: "";
    background-image: url('회사로고_URL');
    background-size: 80px;
    background-repeat: no-repeat;
    opacity: 0.05;
    position: absolute;
    bottom: 20px;
    right: 20px;
    width: 80px;
    height: 80px;
    pointer-events: none;
  }

  /* 과목별 cover 배경 */
  section.cover-githubai {
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364, #3a6186, #89253e, #ff6e7f);
    color: #fefefe;
  }


  section.cover-html         { background: linear-gradient(135deg, #ffecd2, #fcb69f, #ff9a9e, #fad0c4, #ffe0b2, #ffccbc); color: #222; }
  section.cover-java         { background: linear-gradient(135deg, #f7ff00, #db36a4, #ff6f61, #ff8a65, #ffb74d, #ffd54f); color: #fff; }
  section.cover-mysql        { background: linear-gradient(135deg, #89f7fe, #66a6ff, #4fc3f7, #29b6f6, #0288d1, #01579b); color: #fff; }
  section.cover-python       { background: linear-gradient(135deg, #43cea2, #185a9d, #2b5876, #4e4376, #6a3093, #a044ff); color: #fff; }
  section.cover-jsp          { background: linear-gradient(135deg, #ff9a9e, #fad0c4, #fbc2eb, #a6c1ee, #d4fc79, #96e6a1); color: #222; }
  section.cover-ai           { background: linear-gradient(135deg, #8e2de2, #4a00e0, #6a11cb, #2575fc, #00c6ff, #0072ff); color: #fff; }
  section.cover-docker       { background: linear-gradient(135deg, #00c6ff, #0072ff, #2193b0, #6dd5ed, #b2fefa, #e0f7fa); color: #fff; }
  section.cover-aws          { background: linear-gradient(135deg, #fdfbfb, #ebedee, #d7d2cc, #f0f0f0, #cfd9df, #e2ebf0); color: #333; }
  section.cover-springjpa    { background: linear-gradient(135deg, #00b09b, #96c93d, #56ab2f, #a8e063, #dce35b, #f3f9a7); color: #fff; }
  section.cover-nodereact    { background: linear-gradient(135deg, #ff6a00, #ee0979, #ff4e50, #f9d423, #fbc2eb, #a6c1ee); color: #fff; }
  section.cover-fullstack    { background: linear-gradient(135deg, #f7971e, #ffd200, #ffcc00, #ffb347, #ff7043, #ff5722); color: #222; }
  section.cover-springflutter{ background: linear-gradient(135deg, #a1c4fd, #c2e9fb, #d4fc79, #96e6a1, #fbc2eb, #a6c1ee); color: #222; }

  /* 강조 박스: 현재 챕터 위치 표시용 */
  .chapter-highlight {
    background: linear-gradient(135deg, #1c1c1e, #2c2c2e, #3a3a3c);
    color: #fefefe;
    font-size: 0.95em;
    padding: 5px 50px;
    border-radius: 12px;
    margin: 60px;
    max-width: 120%;
    box-shadow: 0 4px 12px rgba(0,0,0,0.3);
    text-align: left;
  }


  /* 목차 박스 - 밝고 깔끔한 스타일 */
  .track-outline {
    background: linear-gradient(135deg, #ffffff, #f7f9fc);
    color: #333;
    font-size: 1.05em;
    line-height: 1.8;
    padding: 20px;
    border-radius: 12px;
    margin: 40px  10px;
    max-width: 150% ;
    text-align: left;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.08);
  }

  .track-outline strong {
    font-size: 1.1em;
    color: #007acc;
  }

  .track-outline span {
    display: block;
    margin-bottom: 6px;
    color: #007acc;
  }

  /* 현재 챕터 강조 */
  .track-outline .current-chapter {
    background: #e6f7ff;
    border-left: 4px solid #007acc;
    padding: 6px 12px;
    border-radius: 6px;
    font-weight: bold;
    color: #005999;
  }

  /* 일반 섹션 배경 */
  section.orange   { background: linear-gradient(135deg, #fca65e, #f76b1c); color: #fff; }
  section.blue     { background: linear-gradient(135deg, #6fa3ef, #4169E1); color: #ffffcc; }
  section.green    { background: linear-gradient(135deg, #3cb371, #2E8B57); color: #fff; }
  section.purple   { background: linear-gradient(135deg, #b19cd9, #6A5ACD); color: #ffebff; }
  section.red      { background: linear-gradient(135deg, #ff6f61, #DC143C); color: #ffecec; }
  section.aqua     { background-color: #E0FFFF; color: #222; }
  section.thanks   { background-color: #FDF5E6; color: #444; }
  
---

<!-- _class: cover -->

# Stackventure_250825
## 📘 CodeCraft Series · Track Index

> <strong class="chapter-highlight">통합형 개발자를 위한 실전 중심의 기술 트랙 모음</strong>  
> 백엔드, 프론트엔드, 데이터, 인프라, AI까지 전방위 실습 중심으로 구성된 시리즈입니다.

---

### 🚀 Track 01 · GitHub + Markdown + AI 사용법  
**GitHub 저장소 관리, 마크다운 문서화, AI 프롬프트 활용까지 협업의 기본기 습득**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track01-github-ai)

---

### 🚀 Track 02 · HTML + CSS + JavaScript + jQuery + Bootstrap  
**웹 페이지의 구조, 스타일, 동작을 구현하는 프론트엔드 핵심 기술 총정리**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track02-html-css-js)

---

### 🚀 Track 03 · Java  
**객체지향 프로그래밍의 기초부터 클래스, 상속, 예외 처리까지 Java 핵심 문법 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track03-java)

---

### 🚀 Track 04 · MySQL + ERD  
**데이터베이스 설계, SQL 문법, ERD 모델링을 통한 구조적 데이터 관리 학습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track04-mysql-erd)

---

### 🚀 Track 05 · Python + Django  
**Python 문법과 Django 프레임워크를 활용한 백엔드 웹 서비스 구축 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track05-python-django)

---

### 🚀 Track 06 · JSP  
**JSP 페이지 구조, 내장 객체, 액션 태그를 활용한 동적 웹 페이지 개발**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track06-jsp)

---

### 🚀 Track 07 · AI API  
**OpenAI API를 활용한 프롬프트 설계, JSON 응답 처리, 챗봇 구현 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track07-ai-api)

---

### 🚀 Track 08 · Docker  
**이미지 생성, 컨테이너 실행, 볼륨과 네트워크 설정을 통한 DevOps 환경 구성**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track08-docker)

---

### 🚀 Track 09 · AWS  
**EC2, S3, IAM, RDS 등 AWS 핵심 서비스를 활용한 클라우드 인프라 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track09-aws)

---

### 🚀 Track 10 · Spring + Security + JPA + Thymeleaf  
**Spring Boot 기반의 인증, 데이터 처리, UI 템플릿 통합 웹 서비스 개발**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track10-spring-jpa)

---

### 🚀 Track 11 · Node + React  
**Express 서버와 React 컴포넌트를 연결한 풀스택 SPA 구현 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track11-node-react)

---

### 🚀 Track 12 · Spring + MyBatis + React  
**Spring과 MyBatis를 통한 데이터 처리, React 프론트엔드 연동까지 통합 개발 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track12-spring-mybatis-react)

---

### 🚀 Track 13 · Spring + Flutter  
**Spring API와 Flutter UI를 연결한 크로스 플랫폼 앱 개발 실습**  
`→` [브랜치 보기](https://github.com/sally03915/stackventure_250825/tree/track13-spring-flutter)
 
