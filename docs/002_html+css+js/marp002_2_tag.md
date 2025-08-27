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
  <span>▶ Chapter 3: CSS 스타일 · 폰트 · Bootstrap</span>
  <span>▶ Chapter 4: JavaScript 문법 · 이벤트 · 배열</span>
  <span>▶ Chapter 5: jQuery와 프레임워크 활용</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 챕터에서는 HTML의 기본 태그와 구조를 이해하고,<br/>
  id/class를 활용한 선택자 개념과 레이아웃 설계 방법을 배웁니다.
</p>


---
<!-- _class: orange -->
# 🧩 PART001 (1/2) - HTML TAG
- HTML
- CSS

---
<!-- _class: orange -->
# 🧩 Step 1: 태그란?
## 📘 Chapter 2-1: HTML 태그 기본 이해

---

<!-- _class: aqua -->
## 🧪 태그는 웹의 언어예요!

- HTML 태그는 웹페이지의 **구성 요소**를 알려주는
 **표시 언어**예요  
- 예: **&lt;h1&gt;** 은 제목, **&lt;p&gt;** 는 문장, **&lt;img&gt;** 는 그림  
- 태그는 **&lt;p&gt;내용&lt;/p&gt;** 처럼 **열고 닫는 구조**로 되어 있어요

 

---
<!-- _class: aqua -->
## ✅ 제목 태그: h1~h6

<pre class="codeblock">
&lt;h1&gt;가장 큰 제목&lt;/h1&gt;
&lt;h2&gt;두 번째 제목&lt;/h2&gt;
&lt;h3&gt;세 번째 제목&lt;/h3&gt;
&lt;h4&gt;네 번째 제목&lt;/h4&gt;
&lt;h5&gt;다섯 번째 제목&lt;/h5&gt;
&lt;h6&gt;가장 작은 제목&lt;/h6&gt;
</pre>

- **&lt;h1&gt;~&lt;h6&gt;** 은 제목의 **중요도와 크기**를 나타내요  
- **&lt;h1&gt;** 은 대표 제목, **&lt;h6&gt;** 은 가장 작은 소제목  
- 검색엔진도 **&lt;h1&gt;** 을 가장 중요하게 봐요 <br/> (SEO에 영향 있음)

---

<!-- _class: aqua -->
## ✅ 문단 태그: p, pre

<pre class="codeblock">
&lt;p&gt;이건 일반 문장이에요&lt;/p&gt;

&lt;pre&gt;
이건 줄바꿈과 공백이
그대로 유지되는 문장이에요
    들여쓰기까지 보존돼요
&lt;/pre&gt;
</pre>

- **&lt;p&gt;** 는 일반 문단  
- **&lt;pre&gt;** 는 줄바꿈과 공백을 유지하는 서식 텍스트  
- 코드나 시처럼 줄 구조가 중요한 경우에 사용해요

---

<!-- _class: aqua -->
## ✅ 이미지 태그: img

<pre class="codeblock">
&lt;img src="img/google_logo.svg" alt="구글 로고"&gt;
</pre>

- **&lt;img&gt;** 는 이미지를 보여주는 태그  
- **src**: 이미지 경로  
- **alt**: 이미지 설명 (접근성 향상)

---

<!-- _class: aqua -->
## ✅ 링크 태그: a

<pre class="codeblock">
&lt;a href="https://www.google.com/"&gt;구글로 이동&lt;/a&gt;
&lt;a href="https://www.google.com/" target="_blank"&gt;새 창에서 열기&lt;/a&gt;
&lt;a href="https://www.google.com/"&gt;
  &lt;img src="img/google_logo.svg" alt="구글 로고"&gt;
&lt;/a&gt;
</pre>

- **&lt;a&gt;**: 다른 페이지나 파일로 연결  
- **href**: 연결할 주소  
- **target="_blank"**: 새 창에서 열기  
- 이미지도 링크로 만들 수 있어요!

---

<!-- _class: aqua -->
## ✅ 리스트 태그: ul, ol, dl

<pre class="codeblock">
&lt;ul&gt;
  &lt;li&gt;사과&lt;/li&gt;
  &lt;li&gt;바나나&lt;/li&gt;
  &lt;li&gt;코코넛&lt;/li&gt;
&lt;/ul&gt;

&lt;ol&gt;
  &lt;li&gt;1차 서류심사&lt;/li&gt;
  &lt;li&gt;2차 면접&lt;/li&gt;
  &lt;li&gt;3차 신체검사&lt;/li&gt;
&lt;/ol&gt;

&lt;dl&gt;
  &lt;dt&gt;삶은계란?&lt;/dt&gt;
  &lt;dd&gt;&lt;img src="img/egg.jpg" alt="삶은계란"&gt;&lt;/dd&gt;
  &lt;dd&gt;아침대용 고단백 영양식&lt;/dd&gt;
&lt;/dl&gt;
</pre>

- **&lt;ul&gt;**: 순서 없는 리스트  
- **&lt;ol&gt;**: 순서 있는 리스트  
- **&lt;dl&gt;**: 설명 리스트  
- **&lt;li&gt;**: 항목, **&lt;dt&gt;**: 제목, **&lt;dd&gt;**: 설명

---

<!-- _class: green -->
# 🛠️ Step 2: 실습 과제


---

<!-- _class: aqua -->
## 🧪 실습: 태그 기본연습
**<mark>web002_basic.html</mark>**


---

<!-- _class: aqua -->
## 🧪 실습: 나만의 소개 박스 만들기

<pre class="codeblock">
&lt;div&gt;
  &lt;h1&gt;🌟 안녕하세요!&lt;/h1&gt;
  &lt;p&gt;저는 웹을 배우고 있어요&lt;/p&gt;
  &lt;img src="img/cat.png" alt="귀여운 고양이"&gt;
  &lt;a href="https://naver.com" target="_blank"&gt;놀러가기&lt;/a&gt;
&lt;/div&gt;
</pre>

> 위 태그들을 조합해서 나만의 소개 박스를 만들어보세요!

---
<!-- _class: purple -->
# 💡 Step 3: 태그를 잘 쓰면?
> 단순히 태그를 쓰는 것만으로도 <br/> 웹페이지는 훨씬 더 똑똑해져요

---
<!-- _class: aqua -->
## ✅ 왜 태그를 잘 써야 할까?

- <span class="fragment">콘텐츠가 <span class="mark">구조적으로 정리</span>돼요</span>  
- <span class="fragment">CSS로 <span class="mark">꾸미기 쉬워져요</span></span>  
- <span class="fragment">검색엔진이 내용을 <span class="mark">정확히 이해</span>해요</span>  
- <span class="fragment">코드가 <span class="mark">재사용과 유지보수</span>에 강해져요</span>


---
<!-- _class: aqua -->
## 🔍 예시로 보는 구조적 장점


<pre class="codeblock">
&lt;section&gt;
  &lt;h2&gt;소개&lt;/h2&gt;
  &lt;p&gt;이 페이지는 HTML 학습을 위한 예제입니다.&lt;/p&gt;
&lt;/section&gt;
</pre>

- <span class="fragment">단순한 <span class="mark">&lt;div&gt;</span>보다 <span class="mark">&lt;section&gt;</span>은 <strong>의미</strong>를 담아요</span>  
- <span class="fragment">검색엔진과 스크린리더가 <span class="mark">콘텐츠의 목적</span>을 더 잘 파악해요</span>


---
<!-- _class: aqua -->
## 🧠 기억할 포인트

- <span class="fragment">태그는 <span class="mark">디자인 도구</span>가 아니라 <span class="mark">정보 구조</span>를 위한 도구예요</span>  
- <span class="fragment">잘 짜인 HTML은 <span class="mark">접근성과 SEO</span>를 동시에 잡을 수 있어요</span>


---

<!-- _class: red -->
# 🧪 Step 4: 기억 테스트

---

<!-- _class: aqua -->
## ❓ 퀴즈: 이미지 보여주는 태그는?

- A. **&lt;p&gt;**  
- B. **&lt;img&gt;** ✅  
- C. **&lt;a&gt;**

---

<!-- _class: aqua -->
## ❓ 퀴즈: 순서 있는 리스트는?

- A. **&lt;ul&gt;**  
- B. **&lt;ol&gt;** ✅  
- C. **&lt;dl&gt;**





---
<!-- _class: orange -->
# 🧩 PART001 (2/2) - CSS
- HTML
- CSS

---

<!-- _class: orange -->
# 🧩 Step 1: CSS 핵심 개념

---

<!-- _class: aqua -->
## 🧪 개념 1: CSS란?

- <span class="fragment"><span class="mark">CSS</span>는 웹 페이지의 디자인을 담당합니다</span>  
- <span class="fragment">HTML이 구조라면, CSS는 꾸미기입니다</span>  
- <span class="fragment">색상, 여백, 글꼴, 애니메이션까지 모두 CSS로 설정</span>

---

<!-- _class: blue -->
# 🧪 Step 2: CSS 속성 배우기

---

<!-- _class: aqua -->
## ✅ 1단계: 박스와 여백

<pre class="codeblock">
margin: 20px;        /* 바깥 여백 */
padding: 20px;       /* 안쪽 여백 */
margin: 0 auto;      /* 가운데 정렬 */
</pre>

> <span class="fragment">박스 간 간격을 띄우고, 안쪽 공간을 확보합니다</span>

---

<!-- _class: aqua -->
## ✅ 2단계: 글자 스타일

<pre class="codeblock">
font-family: 'Segoe UI', sans-serif;
font-size: 16px;
color: #333;
text-align: center;
text-decoration: none;
</pre>

> <span class="fragment">글꼴, 크기, 색상, 정렬, 밑줄 여부를 설정합니다</span>

---

<!-- _class: aqua -->
## ✅ 3단계: 배경 꾸미기

<pre class="codeblock">
background: #fff;
background: linear-gradient(to right, pink, orange);
</pre>

> <span class="fragment">단색 또는 그라데이션으로 배경을 꾸며요</span>

---

<!-- _class: aqua -->
## ✅ 4단계: 박스 디자인

<pre class="codeblock">
width: 250px;
border: 3px solid #e1306c;
border-radius: 20px;
box-shadow: 0 4px 12px rgba(0,0,0,0.1);
</pre>

> <span class="fragment">박스 크기, 테두리, 둥근 모서리, 그림자 효과</span>

---

<!-- _class: aqua -->
## ✅ 5단계: 이미지 다루기

<pre class="codeblock">
object-fit: cover;
</pre>

> <span class="fragment">이미지를 박스에 꽉 채우되 잘림 허용</span>

---

<!-- _class: aqua -->
## ✅ 6단계: 마우스 효과와 애니메이션

<pre class="codeblock">
.card:hover {
  transform: translateY(-5px);
  box-shadow: 0 8px 20px rgba(0,0,0,0.2);
}

.card {
  transition: all 0.3s ease;
}
</pre>

> <span class="fragment">마우스를 올리면 부드럽게 떠오르는 카드 효과</span>

---

<!-- _class: green -->
# 🛠️ Step 3: 실습 과제

---

<!-- _class: aqua -->
## 🧪 실습 1: 카드 스타일링 실습

- <span class="fragment">HTML 구조를 만들고</span>  
- <span class="fragment">CSS로 여백, 색상, 그림자, hover 효과를 적용</span>  
- <span class="fragment">VS Code에서 직접 실습해보기</span>

---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기: CSS는 왜 중요한가요?

- <span class="fragment">사용자에게 <span class="mark">보는 즐거움</span>을 줍니다</span>  
- <span class="fragment">디자인은 기능만큼 중요합니다</span>  
- <span class="fragment">좋은 CSS는 브랜드의 인상을 좌우합니다</span>

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: **margin**은 어떤 역할을 하나요?

- <span class="fragment">A. 글자 색을 바꾼다</span>  
- <span class="fragment">B. 안쪽 여백을 만든다</span>  
- <span class="fragment">C. 바깥 여백을 만든다 ✅</span>

---

<!-- _class: aqua -->
## ❓ 퀴즈 2: **:hover**는 언제 쓰나요?

- <span class="fragment">A. 페이지 로딩 시</span>  
- <span class="fragment">B. 마우스를 올렸을 때 ✅</span>  
- <span class="fragment">C. 클릭했을 때</span>

 
---
<!-- _class: thanks -->
## 👋  열심히 들어주셔서 감사합니다!
> 이제 HTML 태그의 기본은 완벽하게 이해했어요  
> 다음은 **id/class 선택자**와 **레이아웃 구성**으로 넘어가요!
<br/>
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>
