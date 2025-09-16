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
    position: relative;
    
  } 
   /*
  section::before {
    content: ":D2BIG";
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) rotate(-30deg);
    font-size: 8em;
    color: #000;
    opacity: 0.03;
    white-space: nowrap;
    pointer-events: none;
    z-index: 0;
    letter-spacing:-25px;
  } */
  section::before {
    content: "";
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) rotate(-45deg); /* 대각선 배치 */
    
    width: 90%;
    height: 90%;
    background-image: url('./images/워터마크_dbdbig.png'); /* 로고 이미지 경로 */
    background-repeat: no-repeat;
    background-size: contain;
    opacity: 0.65; /* 은은하게 보이도록 조정 */
    pointer-events: none;
    z-index: 0;
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
    padding: 12px 50px;
    border-radius: 12px;
    margin: 20px;
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



  table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
  }

  td, th {
    padding: 12px 16px;
    border-bottom: 1px solid #ddd;
  }

  .mark {
    color: #007acc;
    font-weight: bold;
  }  

  code, pre {
    font-size: 1.2em;
    font-weight: bold;
    background-color: #eef;
    padding: 12px 16px;
    border-radius: 6px;
    display: block;
    width: 120%;              /* 전체 너비 사용 */
    white-space: pre-wrap;    /* 줄바꿈 허용 */
    overflow-x: auto;         /* 가로 스크롤 가능 */
    box-sizing: border-box;   /* padding 포함한 너비 계산 */
  }

  pre code {
    display: block;
    width: 100%;               /* 전체 너비 사용 */
    max-width: 800px;          /* 최대 너비 설정 */
    margin: 0 auto;            /* 가운데 정렬 */
    white-space: pre;          /* 줄바꿈 방지 */
    overflow-x: auto;          /* 가로 스크롤 허용 */
    font-size: 1.2em;
    padding: 12px 20px;
    background-color: #f5f5f5;
    border-radius: 8px;
    color: #007acc;
  }


 
  pre {
    max-width: 100%;
    width: fit-content;
  }

  .codeblock {
    background: #f4f4f4;
    color: #007acc;
    padding: 1em;
    border-radius: 8px;
    font-family: 'Courier New', monospace; 
    white-space: pre-wrap; 
    font-size:0.7em;
  }

  /* 일반 섹션 배경 */
  section.orange   { background: linear-gradient(135deg, #fca65e, #f76b1c); color: #fff; }
  section.blue     { background: linear-gradient(135deg, #6fa3ef, #4169E1); color: #ffffcc; }
  section.green    { background: linear-gradient(135deg, #3cb371, #2E8B57); color: #fff; }
  section.purple   { background: linear-gradient(135deg, #b19cd9, #6A5ACD); color: #ffebff; }
  section.red      { background: linear-gradient(135deg, #ff6f61, #DC143C); color: #ffecec; }
  section.aqua     { background-color: #E0FFFF; color: #222; }
  section.thanks   { background-color: #FDF5E6; color: #444; }
  section.ex       { background-color: #96e6a1; color:#333; }
  


---
<!-- _class: cover-html -->
<h4 style="color:#6C757D;">
  <span style="color:#ff9a9e; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 02
</h4>  
<h1 style="color:#007BFF;">Web Essentials</h1>  
<h3 style="color:#17A2B8;">HTML · CSS · JavaScript · jQuery · Bootstrap</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 1 · <em>웹 개발 시작과 HTML 구조</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">디자인과 인터랙션의 경계를 넘나드는 기술</span><br>
  <span class="fragment" style="color:#495057;">기초부터 프레임워크까지, 웹의 모든 것을 담다</span>
</blockquote>

---
<!-- _class: cover-html -->
<h2 style="font-size:1.6em; color:#555 ; ">목차 : Web Essentials 트랙</h2>

<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 1: 웹 개발 시작과 HTML 구조</span>
  <span>▶ Chapter 2: HTML 태그 · id/class · 레이아웃</span>
  <span>▶ Chapter 3: Bootstrap</span>
  <span>▶ Chapter 4: JavaScript 문법 · 이벤트 · 배열</span>
  <span>▶ Chapter 5: jQuery와 프레임워크 활용</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 웹 개발의 핵심 기술을 <br/> 실습 중심으로 배우며, 프론트엔드의 기초를 다집니다.
</p>

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념

---
<!-- _class: aqua -->
## 🧪 개념 1: 웹 개발의 기본 흐름

- <span class="fragment"><span class="mark">웹 개발</span>은 구조 → 스타일 → 동작 → 서버 흐름으로 구성</span>  
- <span class="fragment"><span class="mark">HTML</span>은 구조, <span class="mark">CSS</span>는 꾸밈, <span class="mark">JS</span>는 동작</span>  
- <span class="fragment"><span class="mark">VS Code</span> 설치부터 프로젝트 생성까지 실습 중심</span>

---

<!-- _class: aqua -->
## 🧪 개념 2: 웹 작업 순서

| 순서 | 작업내용 |
|------|----------|
| HTML | 구조 (예: 회원가입 폼) |
| CSS | 꾸미기 (예: 폼 스타일링) |
| JS / jQuery / React | 동작 (예: 유효성 검사) |
| PHP / JSP + DB | 서버 전송 + 데이터 저장 |

> <span class="fragment">웹은 <span class="mark">구조 → 스타일 → 동작 → 서버</span> 흐름으로 구성됩니다</span>

---

<!-- _class: aqua -->
## 🧪 개념 3: HTML5 기본 구조

- <span class="fragment"><span class="mark">! + Enter</span>로 HTML 기본 구조 자동완성</span>  
- <span class="fragment"><span class="mark">&lt;!DOCTYPE html&gt;</span>: HTML5 문서 선언</span>  
- <span class="fragment"><span class="mark">&lt;html lang="ko"&gt;</span>: 문서 루트, 언어 설정</span>  
- <span class="fragment"><span class="mark">&lt;head&gt;</span>: 문서 정보 (메타데이터, 제목, 스타일 등)</span>  
- <span class="fragment"><span class="mark">&lt;body&gt;</span>: 사용자에게 보여지는 콘텐츠 영역</span>

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->
<pre class="codeblock">
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>

</body>
</html>
</pre>

> <span class="fragment">이 구조는 HTML 문서의 기본 틀입니다</span>  
> <span class="fragment">VS Code에서 <span class="mark">! + Enter</span>로 자동완성 가능</span>


---

<!-- _class: green -->
# 🛠️ Step 3: 실습 과제


--- 
## 🧪 실습 1:  VS Code 설치 과정

---
<!-- _class: aqua -->
## 🧪 설치 Step 1
<img src="./images/001_setting_vs_code_001.png" alt="VS Code 설치 Step1" width="100%"/>

---
<!-- _class: aqua -->
## 🧪 설치 Step 2
<img src="./images/001_setting_vs_code_002.png" alt="VS Code 설치 Step2" width="100%"/>

---
<!-- _class: aqua -->
## 🧪 설치 Step 3
<img src="./images/001_setting_vs_code_003.png" alt="VS Code 설치 Step3" width="60%"/>


---
<!-- _class: aqua -->
## 🧪 설치 Step 4
<img src="./images/001_setting_vs_code_004.png" alt="VS Code 설치 Step4" width="60%"/>

---
<!-- _class: aqua -->
## 🧪 설치 Step 5
<img src="./images/001_setting_vs_code_005.png" alt="VS Code 설치 Step5" width="60%"/>


---
<!-- _class: aqua -->
## 🧪 설치 Step 6
<img src="./images/001_setting_vs_code_006.png" alt="VS Code 설치 Step6" width="60%"/>


---
<!-- _class: aqua -->
## 🧪 설치 Step 7
<img src="./images/001_setting_vs_code_007.png" alt="VS Code 설치 Step7" width="60%"/>



---
<!-- _class: aqua -->
## 🧪 확장플러그인 1
<img src="./images/001_setting_vs_code_009.png" alt="VS Code 설치 Step9" width="100%"/>


---
<!-- _class: aqua -->
## 🧪 확장플러그인 2
<img src="./images/001_setting_vs_code_010.png" alt="VS Code 설치 Step10" width="100%"/>


---
<!-- _class: aqua -->
## 🧪 확장플러그인 3
<img src="./images/001_setting_vs_code_011.png" alt="VS Code 설치 Step11" width="100%"/>



---
## 🧪 실습 2: web001.html 만들기

- <span class="fragment">VS Code에서 프로젝트 생성</span>  
- <span class="fragment">HTML 파일 만들고 기본 구조 작성</span>  
- <span class="fragment">파일명은 반드시 <span class="mark">.html</span> 확장자 사용</span>  


---
<!-- _class: aqua -->
<pre class="codeblock">
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>

</body>
</html>
</pre>

> <span class="fragment">기본 HTML 문서를 직접 작성해보세요</span>

---
<!-- _class: purple -->
# 💡 Step 4: 사고 확장
> 이제 우리가 배운 내용을 조금 더 생각해볼까요?

---
<!-- _class: aqua -->
## ❓ 궁금한 이야기 ①:  HTML은 시맨틱 구조를 강조할까?
- <span class="fragment">태그는 단순한 표시가 아니라 <span class="mark">의미</span>를 담는다</span>  
- <span class="fragment">예: <span class="mark">&lt;header&gt;</span>, <span class="mark">&lt;section&gt;</span>, <span class="mark">&lt;footer&gt;</span> 등은 역할이 명확함</span>

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ②:  HTML의 역할?
- <span class="fragment">정보를 표현하기 위한 <span class="mark">마크업 언어</span></span>  
- <span class="fragment">브라우저가 해석할 수 있는 <span class="mark">구조 제공</span></span>

---
<!-- _class: aqua -->
## ❓ 궁금한 이야기 ③:  &lt;head&gt;와 &lt;body&gt;의 차이

- <span class="fragment"><span class="mark">&lt;head&gt;</span>: 문서 정보</span>  
- <span class="fragment"><span class="mark">&lt;body&gt;</span>: 사용자에게 보이는 내용</span>

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: HTML은 어떤 역할을 하나요?

- <span class="fragment">A. 동작을 처리한다</span>  
- <span class="fragment">B. 구조를 정의한다 ✅</span>  
- <span class="fragment">C. 스타일을 적용한다</span>

 
---

<!-- _class: aqua -->
## ❓ 퀴즈 2: HTML 문서의 시작과 끝을 나타내는 태그는?

- <span class="fragment">A. **<body>**</span>  
- <span class="fragment">B. **<head>**</span>  
- <span class="fragment">C. **<html>** ✅</span>

---
<!-- _class: thanks -->
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>
