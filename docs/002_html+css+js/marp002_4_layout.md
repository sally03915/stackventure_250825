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
  <span>▶ Chapter 3: Bootstrap</span>
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
## 🧪 개념 2: 배치의 핵심 -
 float, position, display, flex

- <span class="fragment">웹 요소의 <span class="mark">배치 방식</span>은 다양하다</span>  
- <span class="fragment">float은 좌우 정렬, 
- position은 절대/고정 위치 지정</span>  
- <span class="fragment">display는 block/inline/inline-block/flex 구성</span>  
- <span class="fragment">margin과 padding은 요소 간 <span class="mark">간격 조절</span>에 사용</span>

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->
## ✅ 배치 예제 1: float

<pre class="codeblock">
&lt;div class=&quot;container f1&quot;&gt;
  &lt;div class=&quot;item i1&quot;&gt;LEFT&lt;/div&gt;
  &lt;div class=&quot;item i2&quot;&gt;RIGHT&lt;/div&gt;
  &lt;div class=&quot;both&quot;&gt;ABCDEFCHIG&lt;/div&gt;
&lt;/div&gt;
</pre>

> <span class="fragment">float은 요소를 <span class="mark">왼쪽 또는 오른쪽</span>으로 띄워 배치합니다</span>  
> <span class="fragment">clear:both로 다음 요소의 흐름을 정리합니다</span>

---

<!-- _class: aqua -->
## ✅ 배치 예제 2: position

<pre class="codeblock">
&lt;div class=&quot;container p1&quot;&gt;
  &lt;p class=&quot;me&quot;&gt;WHERE I AM?&lt;/p&gt;
  &lt;p&gt;position:relative - box 자리 유지 / absolute - 유지 안됨&lt;/p&gt;
&lt;/div&gt;
&lt;div class=&quot;container p2&quot;&gt;
  &lt;p class=&quot;me&quot;&gt;WHERE I AM? position:fixed 브라우저에 콕!&lt;/p&gt;
&lt;/div&gt;
</pre>

> <span class="fragment">relative는 기준 위치를 잡고, absolute는 부모 기준으로 이동</span>  
> <span class="fragment">fixed는 브라우저 기준으로 고정됩니다</span>

---

<!-- _class: aqua -->
## ✅ 배치 예제 3: display


<pre class="codeblock">
&lt;div class=&quot;container&quot;&gt;
  &lt;ul&gt;
    &lt;li&gt;APPLE&lt;/li&gt;
    &lt;li&gt;banana&lt;/li&gt;
    &lt;li&gt;coconut&lt;/li&gt;
  &lt;/ul&gt;

  &lt;hr/&gt;

  &lt;ul class=&quot;d1&quot;&gt;
    &lt;li&gt;APPLE&lt;/li&gt;
    &lt;li&gt;banana&lt;/li&gt;
    &lt;li&gt;coconut&lt;/li&gt;
  &lt;/ul&gt;

  &lt;ul class=&quot;d2&quot;&gt;
    &lt;li&gt;APPLE&lt;/li&gt;
    &lt;li&gt;banana&lt;/li&gt;
    &lt;li&gt;coconut&lt;/li&gt;
  &lt;/ul&gt;
&lt;/div&gt;
</pre>

> <span class="fragment">display:inline은 줄바꿈 없이 나열</span>  
> <span class="fragment">inline-block은 너비/높이 지정 가능</span>

---

<!-- _class: aqua -->
## ✅ 배치 예제 4: margin/padding

<pre class="codeblock">
&lt;div class=&quot;container mp&quot;&gt;
  &lt;p class=&quot;me&quot;&gt;WHERE I AM?&lt;/p&gt;
&lt;/div&gt;
</pre>

> <span class="fragment">margin은 <span class="mark">바깥 여백</span>, 
  padding은 <span class="mark">안쪽 여백</span></span>  
> <span class="fragment">방향별로 top/right/bottom/left 지정 가능</span>

---

<!-- _class: aqua -->
## ✅ 배치 예제 5: flex

<pre class="codeblock">
&lt;div class=&quot;container flex&quot;&gt;
  &lt;div class=&quot;flex-box&quot;&gt;
    &lt;div class=&quot;flex-item&quot;&gt;1&lt;/div&gt;
    &lt;div class=&quot;flex-item&quot;&gt;2&lt;/div&gt;
    &lt;div class=&quot;flex-item&quot;&gt;3&lt;/div&gt;
  &lt;/div&gt;
  &lt;p&gt;display:flex를 사용하면 자식 요소들이 한 줄에 정렬됩니다&lt;/p&gt;
&lt;/div&gt;
</pre>

> <span class="fragment">flex는 <span class="mark">유연한 레이아웃</span>을 구성할 수 있어요</span>  
> <span class="fragment">justify-content, align-items 등으로 정렬 방식 조절</span>

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->
## ❓ 퀴즈 3: float 사용 시 주의할 점은?

- <span class="fragment">A. padding을 꼭 줘야 한다</span>  
- <span class="fragment">B. clear:both로 흐름을 정리한다 ✅</span>  
- <span class="fragment">C. display:flex와 함께 써야 한다</span>

---
<!-- _class: aqua -->
## ❓ 퀴즈 4: position:fixed는 어떤 기준으로 위치를 잡나요?

- <span class="fragment">A. 부모 요소 기준</span>  
- <span class="fragment">B. 브라우저 기준 ✅</span>  
- <span class="fragment">C. 문서 전체 기준</span>

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">배치 방식은 웹 디자인의 <span class="mark">핵심</span>입니다</span>  
> <span class="fragment">다양한 방식으로 실습하며 감각을 익혀보세요!</span>
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>

 