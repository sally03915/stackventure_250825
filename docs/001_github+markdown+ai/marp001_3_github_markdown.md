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
    background-image: url('./images_github/워터마크_dbdbig.png'); /* 로고 이미지 경로 */
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
<!-- _class: cover-githubai -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 01
</h4>  
<h1 style="color:#FF69B4;">GitHub + AI 활용</h1>  
<h3 style="color:#FFD700;">Repo · API · Prompt · Collaboration</h3>

<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 3 · <em>Markdown 파일 만들기</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">Markdown으로 문서화하고 GitHub에 공유하는 실전 스킬</span><br>
  <span class="fragment" style="color:#495057;">개발자와 AI가 함께 정리하고 기록하는 협업 문서 환경</span>
</blockquote>

---

<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub + AI 활용편 </h2>

<div class="track-outline">
  <span>▶ Chapter 1: GitHub 기본 명령어 배우기</span>
  <span>▶ Chapter 2: 파일 올리고 내리기 (Push & Pull)</span>
  <span class="current-chapter">✅▶ Chapter 3: Markdown 파일 만들기</span>
  <span>▶ Chapter 4: GitHub에서 협업하기</span>
  <span>▶ Chapter 5: Copilot에게 질문하며 개발하기</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 개발자와 AI가 함께 협업하는 <br/> 미래형 개발 환경을 실습 중심으로 안내합니다.
</p>

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념
---

<!-- _class: aqua -->
## 🧠 개념 1: Markdown이란?

- **간단한 문서 작성 언어**  
- HTML보다 쉬운 문법으로 웹 문서 작성 가능  
- README, 문서화, 블로그 등 다양한 용도로 사용됨


---
<!-- _class: aqua -->

## 🧠 개념 2: Markdown의 기본 문법

| 문법 | 설명 | 예시 |
|------|------|------|
| **#** | 제목 | # 제목 → 큰 제목 |
| **\*** 또는 **-** | 리스트 | **\* 항목1** → 목록 생성 |
| **\*\*텍스트\*\*** | 굵게 | **\*\*중요\*\*** → **중요** |
| **[텍스트](링크)** | 링크 | **\[GitHub](https://github.com)** |
| **\!\[텍스트](이미지주소)** | 이미지 삽입 | **\!\[로고](logo.png)** |

---

<!-- _class: aqua -->
## 🧠 개념 3: Markdown 파일 만들기

- **.md** 확장자를 가진 텍스트 파일  
- GitHub에서 자동으로 렌더링됨  
- 프로젝트 설명, 사용법, 팀 소개 등 다양한 정보 담기  

---

<!-- _class: aqua -->
## 🧠 개념 4: GitHub에서 Markdown 활용

| 용도 | 설명 |
|------|------|
| 📘 README.md | 프로젝트 소개 및 사용법 |
| 📄 ISSUE 템플릿 | 버그/기능 요청 양식 |
| 📝 WIKI 문서 | 팀 내 문서화 및 가이드 |
| 💬 COMMENT | 협업 시 Markdown으로 의견 정리 가능 |

---

<!-- _class: aqua -->
## 🧠 개념 5: 기억하기 쉽게!

- <span class="mark">Markdown</span>은 개발자의 문서 언어  
- <span class="mark">README.md</span>는 프로젝트의 얼굴  
- <span class="mark">간단한 문법</span>으로 강력한 표현 가능  
- <span class="mark">GitHub</span>과 찰떡궁합!



---
<!-- _class: blue -->
# 🧪 Step 2: Markdown BASIC - <br/>
 `markdown.md`


---

<!-- _class: aqua -->
## 기본 1: Markdown 파일 만들기

```bash
touch README.md
```

> "새로운 문서 상자를 만들었어요! 이름은 README.md 🎁"

---

<!-- _class: aqua -->
## 기본 2: 내용 작성하기

<pre class="codeblock">
# 프로젝트 소개

이 프로젝트는 GitHub과 AI를 활용한 협업 실습입니다.
</pre>

> "문서에 제목과 설명을 적었어요! ✍️"

---

<!-- _class: aqua -->
## 기본 3: 저장소에 추가하기

```bash
git add README.md
```

> "Markdown 파일을 Git 상자에 넣었어요 📦"

---

<!-- _class: aqua -->
## 기본 4: 저장 기록 남기기

<pre class="codeblock">
git commit -m "README.md 작성 완료"
</pre>

> "문서 작업을 저장했어요! 이제 이력서처럼 남아요 🗂️"

---

<!-- _class: aqua -->
## 기본 5: GitHub에 올리기

<pre class="codeblock">
git push origin main
</pre>

> "작성한 문서를 GitHub에 올렸어요! <br/>
모두가 볼 수 있어요 🌐"

 

---
<!-- _class: green -->
# 🛠️ Step 3: 실습 과제 
### `README.md` 

---

<!-- _class: aqua -->
## 🧪 실습 1: Markdown 파일 만들기

1. VS Code에서 새 파일 생성  
2. 이름: **README.md**

```bash
touch README.md
```

> ✨ 나만의 문서 상자를 만들었어요!

---

<!-- _class: aqua -->
## 🧪 실습 2: 내용 작성하기

<pre class="codeblock">
# 프로젝트 소개

이 프로젝트는 Git과 Markdown을 활용한 협업 실습입니다.
</pre>

> ✍️ 문서에 제목과 설명을 적었어요!

---

<!-- _class: aqua -->
## 🧪 실습 3: Git에 추가하고 저장하기

<pre class="codeblock">
git add README.md
git commit -m "README.md 작성 완료"
</pre>

> ✅ 문서를 Git 상자에 넣고 저장했어요!

---

<!-- _class: aqua -->
## 🧪 실습 4: GitHub에 업로드하기

```bash
git push origin main
```

> 🌐 문서를 GitHub에 올렸어요! 모두가 볼 수 있어요

---

<!-- _class: aqua -->
## 🧪 실습 5: GitHub에서 확인하기

- GitHub 웹사이트 접속  
- 저장소에 **README.md** 파일이 올라갔는지 확인

---

<!-- _class: green -->
## ✅ 실습 요약

| 단계 | 명령어 | 설명 |
|------|--------|------|
| ①   | **touch README.md** | Markdown 파일 생성 |
| ②   | 내용 작성 | 문서에 텍스트 입력 |
| ③   | **git add**, **commit** | Git에 추가하고 저장 |
| ④   | **git push** | GitHub에 업로드 |
| ⑤   | 웹 확인 | GitHub에서 결과 확인

> 이제 여러분의 프로젝트 소개 문서가 완성됐어요! 🎉






---
<!-- _class: purple -->
# 💡 Step 4: 사고 확장  
> 우리가 만든 Markdown 문서, 왜 중요한 걸까요?

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ①: 왜 README.md를 만들까요?

- <span class="fragment">내 프로젝트를 소개하려고요 📢</span>  
- <span class="fragment">다른 사람이 쉽게 이해하게 하려고요 👀</span>  
- <span class="fragment">나중에 내가 봐도 기억나게 하려고요 🧠</span>

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ②: Markdown이 왜 좋을까요?

- <span class="fragment">쉽고 간단한 문법이에요 ✍️</span>  
- <span class="fragment">웹에서도 예쁘게 보여요 🌐</span>  
- <span class="fragment">GitHub에서 자동으로 읽어줘요 🤖</span>

> ✅ Markdown은 개발자의 **소개서**이자 **설명서**예요!



---
<!-- _class: red -->
# 🧠 Step 5: 기억 테스트  
> 지금까지 배운 내용을 퀴즈로 확인해볼까요?

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: ***README.md***는 어떤 파일일까요?

- A. 그림 파일  
- B. **프로젝트 소개 문서** ✅  
- C. 음악 파일

---

<!-- _class: aqua -->
## ❓ 퀴즈 2: ***git add README.md***는 뭐예요?

- A. 문서를 삭제해요  
- B. **문서를 Git 상자에 넣어요** ✅  
- C. 문서를 복사해요

---

<!-- _class: aqua -->
## 🎯 오늘 배운 것 요약

- <span class="mark">README.md</span> → 프로젝트 소개 문서  
- <span class="mark">Markdown</span> → 간단한 문서 작성 언어  
- <span class="mark">git add</span> → 문서를 Git에 추가  
- <span class="mark">git commit</span> → 작업 기록 남기기  
- <span class="mark">git push</span> → GitHub에 올리기

> Markdown은 내 프로젝트를 설명하는 **첫 번째 인사말**

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">우리가 만든 README.md는 단순한 파일이 아니에요.</span>  
> <span class="fragment">그건 나의 프로젝트를 소개하는 **작은 이야기책**이에요 📖</span>  
> <span class="fragment">다음엔 더 멋진 문서와 협업 방법도 배워봐요!</span>
