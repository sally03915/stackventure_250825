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
  📍 <strong>현재 위치:</strong> Chapter 2 · <em>HTML 태그 · id/class · 레이아웃</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">태그의 의미를 이해하고 구조를 설계하는 능력</span><br>
  <span class="fragment" style="color:#495057;">시맨틱 마크업으로 웹 접근성과 유지보수 향상</span>
</blockquote>

---
<!-- _class: cover-html -->
<h2 style="font-size:1.6em; color:#555;">목차 : Web Essentials 트랙</h2>

<div class="track-outline">
  <span>▶ Chapter 1: 웹 개발 시작과 HTML 구조</span>
  <span class="current-chapter">✅▶ Chapter 2: HTML 태그 · id/class · 레이아웃</span>
  <span>▶ Chapter 3:  Bootstrap</span>
  <span>▶ Chapter 4: JavaScript 문법 · 이벤트 · 배열</span>
  <span>▶ Chapter 5: jQuery와 프레임워크 활용</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 챕터에서는 HTML의 기본 태그와 구조를 이해하고,<br/>
  id/class를 활용한 선택자 개념과 레이아웃 설계 방법을 배웁니다.
</p>


---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념

---
<!-- _class: aqua -->
## 🧪 개념 1: 선택자란?

- <span class="fragment">HTML 요소에 <span class="mark">이름을 붙여</span> 스타일을 적용하는 방법</span>  
- <span class="fragment">id/class를 통해 <span class="mark">구조적 설계와 동작 제어</span> 가능</span>  
- <span class="fragment">CSS와 JavaScript에서 <span class="mark">선택자</span>로 활용됨</span>

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->
## ✅ HTML 예시 코드

<pre class="codeblock">
&lt;div id="header"&gt;상단 영역&lt;/div&gt;
&lt;p class="highlight"&gt;강조된 문장&lt;/p&gt;
&lt;p class="highlight"&gt;또 다른 강조 문장&lt;/p&gt;
</pre>

> <span class="fragment">**id="header"** 는 <span class="mark">단 하나의 요소</span>를 지정</span>  
> <span class="fragment">**class="highlight"** 는 <span class="mark">여러 요소에 반복 적용</span> 가능</span>

---
<!-- _class: aqua -->
## ✅ CSS 선택자 예시

<pre class="codeblock">
#header {
  background-color: lightblue;
}

.highlight {
  font-weight: bold;
  color: red;
}
</pre>

> <span class="fragment">**#id명**은 <span class="mark">고유 요소</span>를 스타일링</span>  
> <span class="fragment">**.class명**은 <span class="mark">공통 그룹</span>을 스타일링</span>

---

<!-- _class: green -->
# 🛠️ Step 3: 실습 과제

---
<!-- _class: aqua -->
## 🧪 실습: id/class 선택자 연습
- **<mark>web004.html</mark>**
- **<mark>web004-1.html</mark>** 

<pre class="codeblock">
&lt;div id="main"&gt;
  &lt;h2 class="title"&gt;나의 웹페이지&lt;/h2&gt;
  &lt;p class="desc"&gt;이건 설명 문장입니다&lt;/p&gt;
&lt;/div&gt;
</pre>

> <span class="fragment">위 구조에 맞춰 CSS 선택자를 직접 작성해보세요!</span>

---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장
> 단순히 id/class를 붙이는 것만으로도 <br/> 웹페이지는 훨씬 더 유연해져요

---
<!-- _class: aqua -->
## ✅ 왜 선택자를 잘 써야 할까?

- <span class="fragment">스타일을 <span class="mark">정확하게 적용</span>할 수 있어요</span>  
- <span class="fragment">JavaScript로 <span class="mark">동작 제어</span>가 쉬워져요</span>  
- <span class="fragment">코드가 <span class="mark">재사용성과 유지보수</span>에 강해져요</span>  
- <span class="fragment">여러 요소를 <span class="mark">그룹화하거나 구분</span>할 수 있어요</span>

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---
<!-- _class: aqua -->
## ❓ 퀴즈 ①: id 선택자는 어떻게 표시할까요?

- A. **.header**  
- B. **#header** ✅  
- C. **header**

---
<!-- _class: aqua -->
## ❓ 퀴즈 ②: class 선택자는 어떻게 표시할까요?

- A. **.highlight** ✅  
- B. **#highlight**  
- C. **highlight**

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">선택자는 웹을 디자인하는 <strong>손끝의 마법</strong>입니다</span>  
> <span class="fragment">다음 챕터에서 더 멋진 구조를 만들어봐요!</span>  
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>
