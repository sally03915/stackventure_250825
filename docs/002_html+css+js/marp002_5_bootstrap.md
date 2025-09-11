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
  📍 <strong>현재 위치:</strong> Chapter 3 · <em>Bootstrap · 반응형 디자인 · 컴포넌트 활용</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">Bootstrap을 활용한 빠른 UI 구성 능력</span><br>
  <span class="fragment" style="color:#495057;">반응형 웹 디자인으로 다양한 디바이스 대응</span>
</blockquote>

---
<!-- _class: cover-html -->
<h2 style="font-size:1.6em; color:#555;">목차 : Web Essentials 트랙</h2>

<div class="track-outline">
  <span>▶ Chapter 1: 웹 개발 시작과 HTML 구조</span>
  <span>▶ Chapter 2: HTML 태그 · id/class · 레이아웃</span>
  <span class="current-chapter">✅▶ Chapter 3: Bootstrap</span>
  <span>▶ Chapter 4: JavaScript 문법 · 이벤트 · 배열</span>
  <span>▶ Chapter 5: jQuery와 프레임워크 활용</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 챕터에서는 Bootstrap 프레임워크를 활용하여<br/>
  반응형 웹 페이지를 설계하고 다양한 UI 컴포넌트를 적용하는 방법을 배웁니다.
</p>

 

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (1)  BOOTSTRAP WHAT?


---
<!-- _class: aqua -->
#### ■1. BOOTSTRAP?
- 미리 만들어진 스타일시트와 자바스크립트플러그인라이브러리
html 코드에 미리 정의된 [클래스 선택자를 삽입]만하면 레이아웃과 각종요소를 만들 수 있음. 
- https://getbootstrap.com/
- https://www.w3schools.com/bootstrap5/index.php
  

---
<!-- _class: aqua -->  
 <img src="./images/web007_001.png" alt="bootstrap Step1" width="100%"/>
 
 

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제


---

<!-- _class: aqua -->
## 예제 1: 부트스트랩 템플릿만들기
<pre class="codeblock">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</pre>

 
---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제 (3)

 ---
<!-- _class: aqua --> 
 #### ■2.  템플릿만들기 
- [링크바로가기](https://www.w3schools.com/bootstrap5/bootstrap_get_started.php)  
 
---
<!-- _class: aqua -->  
 <img src="./images/web007_002.png" alt="bootstrap Step1" width="100%"/>


 
 ---
<!-- _class: aqua -->  
<pre class="codeblock">
 <!DOCTYPE html>
 <html lang="ko">
 <head>
   <title> dbdbig </title>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
 <!-- Latest compiled and minified CSS -->
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
 
 <!-- Latest compiled JavaScript -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
 </head>
 <body>
 
 <div class="container">
   <h1>My First Bootstrap Page</h1>
   <p>This is some text.</p>
 </div>
 
 </body>
 </html>
</pre> 
 
 ---
<!-- _class: aqua -->   
<img src="./images/web007_003.png" alt="bootstrap Step1" width="100%"/>

 

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (2)  
#     GRID-LAYOUT
  1. 레이아웃시스템
  2. 레이아웃 만들어보기
 
---
<!-- _class: aqua -->
 #### #2. GRID-LAYOUT
 ■1. 레이아웃시스템 
 [레이아웃시스템 바로가기]( https://www.w3schools.com/bootstrap5/bootstrap_grid_basic.php) 
 
 
---
<!-- _class: aqua -->
<img src="./images/web007_005.png" alt="bootstrap Step1" width="100%"/>
 
--- 
 <!-- _class: aqua -->
 - Grid system  눈여겨봐야할 순서  
 - [1]-[2]-[3]   표-줄-칸
   
     [1]  .container 또는 .container-fluid
     [2] .row
     [3] .col-*-*

--- 
<!-- _class: aqua --> 
-  [1]  .container 또는 .container-fluid   
: 전체 가로폭을 지정
       .container :  고정폭 레이아웃을 만들 때 사용
       .container-fluid  : 좌우로 꽉 찬 레이아웃 사용
-  [2] .row  : 한줄한줄(행)
-  [3] .col-디바이스정하기-칸수 : 한칸한칸(열)
      xs (for phones)
      sm (for tablets)   : 768px이상
      md (for desktops) : 992px이상
      lg (for larger desktops):가로해상도 1200px이상
 
--- 
<!-- _class: aqua --> 
#####  1~12 :  행을 12등분하여 그 중에 몇개를 사용할지 지정
<pre class="codeblock">
예1) .container > .row > .col-sm-10 .col-sm-2
예2) .container > .row > .col-sm-5  .col-sm-5  .col-sm-2
예3) .container > .row > .col-sm-4  .col-sm-4  .col-sm-4
예4) .container > .row > .col-sm-3  .col-sm-3  .col-sm-3   
                                              .col-sm-3
</pre> 

---
<!-- _class: aqua -->  
##### ■2. 레이아웃 만들어보기
  
 <img src="./images/web007_004.png" alt="bootstrap Step1" width="100%"/>



---
<!-- _class: aqua -->  

<pre class="codeblock">

 <!DOCTYPE html>
 <html lang="ko">
 <head>
   <title>DBDBIG</title>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
 <!-- Latest compiled and minified CSS -->
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
 
 <!-- Latest compiled JavaScript -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
 </head>
 <body>
  <div>
    <h3>[1-1] container </h3>
    <div class="alert alert-light container">  고정폭레이아웃</div>
    <h3>[1-2] container-fluid </h3>
    <div class="alert alert-light container-fluid">좌우로 꽉찬 레이아웃 </div>
  </div>
  <!-- end container -->
  <!-- end container -->
 
  <div  class="container">
    <h3>[2]  row : 줄(행) </h3>
    <h3>[3] col-디바이스사이즈-칸수   : sm 가로 해상도 768px 이상</h3>
    <h3>[Q1] 4-4-?</h3>
    <div class="row   text-center">
      <div class="col-sm-4 alert alert-light"> 박스1</div> <!-- col END -->
      <div class="col-sm-4 alert alert-light"> 박스2</div> <!-- col END -->
      <div class="col-sm-4 alert alert-light"> 박스3</div> <!-- col END -->
    </div> 
 
 
    <h3>[Q2] 3-3-3-?</h3>
    <div class="row   text-center">
      <div class="col-sm-3  alert alert-light"> 박스1</div> <!-- col END -->
      <div class="col-sm-3  alert alert-light"> 박스2</div> <!-- col END -->
      <div class="col-sm-3  alert alert-light"> 박스3</div> <!-- col END -->
      <div class="col-sm-3  alert alert-light"> 박스4</div> <!-- col END -->
    </div>
    <!-- end row -->
    <!-- end row -->
 
 
    <!--   3)  두칸 : 10  ,   ?		-->
    <h3>[Q3] 10-?</h3>
    <div class="row  text-center">
      <div class="col-sm-10 alert alert-light"> 박스1</div>
      <div class="col-sm-2 alert alert-light"> 박스2</div>
    </div>
    <!-- end row -->
    <!-- end row -->
 
    <!--   4)  네칸 : 5 , 4 , 2 , ?   -->
    <h3>[Q4] 5 , 4 , 2 , ? </h3>
    <div class="row  text-center">
        <div class="col-sm-5 alert alert-light"> 박스1</div>
        <div class="col-sm-4 alert alert-light"> 박스2</div>
        <div class="col-sm-2 alert alert-light"> 박스3</div>
        <div class="col-sm-1 alert alert-light"> 박스4</div>
    </div>
    <!-- end row -->
    <!-- end row -->
 
 
    <!--   5)  네칸 : 3 , 3 , 4 ,  ?  -->
    <h3>[Q5] 3 , 3 , 4 ,  ? </h3>
    <div class="row  text-center">
      <div class="col-sm-3 alert alert-light"> 박스1</div>
      <div class="col-sm-3 alert alert-light"> 박스2</div>
      <div class="col-sm-4 alert alert-light"> 박스3</div>
      <div class="col-sm-2 alert alert-light"> 박스4</div>
    </div>
    <!-- end row -->
    <!-- end row -->
 
 
    <!--   6)  다섯칸 : 2, 2, 2, 2, ?  -->
    <h3>[Q6]  2, 2, 2, 2, ? </h3>
    <div class="row">
      <div class="col-sm-2 alert alert-light"> 박스1</div>
      <div class="col-sm-2 alert alert-light"> 박스2</div>
      <div class="col-sm-2 alert alert-light"> 박스3</div>
      <div class="col-sm-2 alert alert-light"> 박스4</div>
      <div class="col-sm-4 alert alert-light"> 박스5</div>
    </div> 
  </div><!-- main END -->
 
   </body>
 </html>
</pre>
 
 
- [1]  .container 또는 .container-fluid
- [2] .row
- [3] .col-*-*

 
 
  
 
---
<!-- _class: aqua -->  
 
 ### 3. 기본사용법
 1. CSS 읽는방법
 2. CSS 적용예제
 
 
---
<!-- _class: aqua -->  
 #### ■1. CSS 읽는방법
- [1] 버튼(Button)
   \<a>, \<dl>, \<input> 등의 태그에 클래스를 추가하여 
   버튼 모양을 만들 수 있습니다 
-  \<a href="#" class="btn btn-default">button</a>
  1. btn은 공통적으로 적용되는 모양을 정의하고, 
  2. btn-default는 테두리나 배경색 등을 정의합니다.
 
 
---
<!-- _class: aqua -->   
- [2]색(Color)
 <pre class="codeblock">
 .btn                     =기본[필수]에 
 .btn-default             원하는 색상 덮기
 .btn-primary
 .btn-success
 .btn-info
 .btn-warning
 .btn-danger
 .btn-link
 </pre> 

 
---
<!-- _class: aqua -->  

<pre class="codeblock">
 <button type="button" class="btn">Basic</button>
 <button type="button" 
        class="btn btn-default">Default</button>
 <button type="button" 
        class="btn btn-primary">Primary</button>
 <button type="button" 
        class="btn btn-success">Success</button>
 <button type="button" 
        class="btn btn-info">Info</button>
 <button type="button" 
        class="btn btn-warning">Warning</button>
 <button type="button" 
        class="btn btn-danger">Danger</button>
 <button type="button" 
        class="btn btn-link">Link</button>
</pre>
 
  
---
<!-- _class: aqua -->  
- [3]크기(Size) 버튼 크기를 정의하는 클래스는 btn-xs, btn-sm, btn-lg입니다. 
 
- [4]btn-block은 버튼을 블록 요소로 만듭니다. 
 
- [5]상태(State) active를 추가하면 활성화된 상태, disabled를 추가하면 비활성화된 상태의 모양을 만듭니다. 
 비활성화된 상태인 경우 클릭이 되지 않습니다.
  
 
 
 

---
<!-- _class: aqua -->  
#### ■2. CSS 적용예제
##### # STEP1 기본사용법

<pre class="codeblock">
&lt;div class="panel  panel-default"&gt;
  &lt;h3 class="panel-heading"&gt;[1] button + color&lt;/h3&gt;
  &lt;p class="well"&gt;사용방법 : btn(콘텐츠) btn-primary(색상)&lt;/p&gt;
  &lt;div class="panel-body"&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-default"&gt;BUTTON1 - DEFAULT&lt;/a&gt;&lt;/p&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-primary"&gt;BUTTON2 - PRIMARY&lt;/a&gt;&lt;/p&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-success"&gt;BUTTON3 - SUCCESS&lt;/a&gt;&lt;/p&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-info"&gt;BUTTON4 - INFO&lt;/a&gt;&lt;/p&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-warning"&gt;BUTTON5 - WARNING&lt;/a&gt;&lt;/p&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-danger"&gt;BUTTON6 - DANGER&lt;/a&gt;&lt;/p&gt;
    &lt;p&gt;&lt;a href="#" class="btn btn-link"&gt;BUTTON7 - LINK&lt;/a&gt;&lt;/p&gt;
  &lt;/div&gt;
&lt;/div&gt;
</pre>
  

---
<!-- _class: aqua -->   
##### # STEP2 SIZE

<pre class="codeblock">
&lt;div class="panel panel-danger"&gt;
  &lt;h3 class="panel-heading"&gt; [2] button + color + size&lt;/h3&gt;
  &lt;p class="well"&gt; 사용방법 : btn(콘텐츠) btn-primary(색상) btn-lg(사이즈)&lt;/p&gt;
  &lt;div class="panel-body"&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-warning btn-lg"&gt; lg : large&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-warning btn-md"&gt; md : middle&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-warning btn-sm"&gt; sm : small&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-warning btn-xs"&gt; xm : 엑스트라 small&lt;/a&gt; &lt;/p&gt;
  &lt;/div&gt;
&lt;/div&gt;

</pre>
  


---
<!-- _class: aqua -->  
##### # STEP3 ACTIVE / DISABLED  

<pre class="codeblock">
&lt;div class="container panel panel-warning"&gt;
  &lt;h3 class="panel-heading"&gt; [3] state : active , disabled&lt;/h3&gt;
  &lt;p class="well"&gt; 사용방법 : btn(콘텐츠) btn-primary(색상) btn-lg(사이즈) active/disabled&lt;/p&gt;
  &lt;div class="panel-body"&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-primary btn-lg"&gt; primary - basic&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-primary btn-lg active"&gt; primary - active&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-primary btn-lg disabled"&gt; primary - active&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-danger btn-lg"&gt; danger-basic&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-danger btn-lg active"&gt; danger - active&lt;/a&gt; &lt;/p&gt;
    &lt;p&gt; &lt;a href="#" class="btn btn-danger btn-lg disabled"&gt; danger - active&lt;/a&gt; &lt;/p&gt;
  &lt;/div&gt;
&lt;/div&gt;

</pre>
  
   


---
<!-- _class: aqua -->  
##### # STEP4 BLOCK

<pre class="codeblock">
&lt;div class="container panel panel-success"&gt;
  &lt;h3 class="panel-heading"&gt; [4] display :block 속성&lt;/h3&gt;
  &lt;p class="well"&gt; 사용방법 : btn(콘텐츠) btn-primary(색상) btn-lg(사이즈) active/disabled btn-block&lt;/p&gt;
  &lt;p class="well"&gt; btn-block : 줄바꿈이 되고 parent 가로사이즈 만큼 영역이 넓어짐&lt;/p&gt;
  &lt;div class="panel-body"&gt;
    &lt;p&gt;
      &lt;a href="#" class="btn btn-default btn-lg"&gt; primary - basic&lt;/a&gt;
      &lt;a href="#" class="btn btn-default btn-lg active"&gt; primary - active&lt;/a&gt;
      &lt;a href="#" class="btn btn-default btn-lg disabled"&gt; primary - active&lt;/a&gt;
    &lt;/p&gt;
    &lt;p&gt;
      &lt;a href="#" class="btn btn-default btn-lg"&gt; primary - basic&lt;/a&gt;
      &lt;a href="#" class="btn btn-default btn-lg btn-block active"&gt;
        primary - active&lt;/a&gt;
      &lt;a href="#" class="btn btn-default btn-lg disabled"&gt; primary - active&lt;/a&gt;
    &lt;/p&gt;
  &lt;/div&gt;
&lt;/div&gt;

</pre> 

 
---
<!-- _class: aqua -->  
  
##### # STEP5 CUSTOM
<pre class="codeblock">
&lt;div class="container panel panel-success"&gt;
  &lt;h3 class="panel-heading"&gt; [5] cmustom css&lt;/h3&gt;
  &lt;p class="well"&gt; 원본 css는 수정하지 말고 child-css 만들어서 사용하기( 누더기...)&lt;/p&gt;
  &lt;div class="panel-body dropdown"&gt;
    &lt;button class="btn btn-danger btn-block dropdown-toggle"
    type="button" data-toggle="dropdown"&gt;Dropdown Example
    &lt;span class="caret"&gt;&lt;/span&gt;&lt;/button&gt;
    &lt;ul class="dropdown-menu"&gt;
      &lt;li&gt;&lt;a href="#"&gt;HTML&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href="#"&gt;CSS&lt;/a&gt;&lt;/li&gt;
      &lt;li&gt;&lt;a href="#"&gt;JavaScript&lt;/a&gt;&lt;/li&gt;
    &lt;/ul&gt;
  &lt;/div&gt;
&lt;/div&gt;

</pre>
 
 
---
#### 예시) 전체홈페이지
<!-- _class: aqua -->  
<pre class="codeblock">

&lt;!DOCTYPE html&gt;
&lt;html lang="ko"&gt;
&lt;head&gt;
  &lt;title&gt;DBDBIG&lt;/title&gt;
  &lt;meta charset="utf-8"&gt;
  &lt;meta name="viewport" content="width=device-width, initial-scale=1"&gt;
  &lt;!-- Latest compiled and minified CSS --&gt;
  &lt;link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"&gt;
  &lt;!-- Latest compiled JavaScript --&gt;
  &lt;script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"&gt;&lt;/script&gt;
&lt;/head&gt;
&lt;body&gt;

  &lt;div class="container card card-default my-5"&gt;
    &lt;h3 class="cards-heading"&gt;[1] button + color&lt;/h3&gt;
    &lt;p class="alert alert-warning"&gt;사용방법 : btn(콘텐츠) btn-primary(색상)&lt;/p&gt;
    &lt;div class="panel-body"&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-default"&gt;BUTTON1 - DEFAULT&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-primary"&gt;BUTTON2 - PRIMARY&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-success"&gt;BUTTON3 - SUCCESS&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-info"&gt;BUTTON4 - INFO&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-warning"&gt;BUTTON5 - WARNING&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-danger"&gt;BUTTON6 - DANGER&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-link"&gt;BUTTON7 - LINK&lt;/a&gt;&lt;/p&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;div class="container card card-default my-5"&gt;
    &lt;h3 class="cards-heading"&gt;[2] button + color + size&lt;/h3&gt;
    &lt;p class="alert alert-warning"&gt;사용방법 : btn(콘텐츠) btn-primary(색상) btn-lg(사이즈)&lt;/p&gt;
    &lt;div class="panel-body"&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-warning btn-lg"&gt;lg : large&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-warning btn-md"&gt;md : middle&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-warning btn-sm"&gt;sm : small&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-warning btn-xs"&gt;xm : 엑스트라 small&lt;/a&gt;&lt;/p&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;div class="container card card-default my-5"&gt;
    &lt;h3 class="cards-heading"&gt;[3] state : active , disabled&lt;/h3&gt;
    &lt;p class="alert alert-warning"&gt;사용방법 : btn(콘텐츠) btn-primary(색상) btn-lg(사이즈) active/disabled&lt;/p&gt;
    &lt;div class="panel-body"&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-primary btn-lg"&gt;primary - basic&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-primary btn-lg active"&gt;primary - active&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-primary btn-lg disabled"&gt;primary - active&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-danger btn-lg"&gt;danger-basic&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-danger btn-lg active"&gt;danger - active&lt;/a&gt;&lt;/p&gt;
      &lt;p&gt;&lt;a href="#" class="btn btn-danger btn-lg disabled"&gt;danger - active&lt;/a&gt;&lt;/p&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;div class="container card card-default my-5"&gt;
    &lt;h3 class="cards-heading"&gt;[4] display :block 속성&lt;/h3&gt;
    &lt;p class="alert alert-warning"&gt;사용방법 : btn(콘텐츠) btn-primary(색상) btn-lg(사이즈) active/disabled btn-block&lt;/p&gt;
    &lt;p class="alert alert-warning"&gt;btn-block : 줄바꿈이 되고 parent 가로사이즈 만큼 영역이 넓어짐&lt;/p&gt;
    &lt;div class="panel-body"&gt;
      &lt;p&gt;
        &lt;a href="#" class="btn btn-default btn-lg"&gt;primary - basic&lt;/a&gt;
        &lt;a href="#" class="btn btn-default btn-lg active"&gt;primary - active&lt;/a&gt;
        &lt;a href="#" class="btn btn-default btn-lg disabled"&gt;primary - active&lt;/a&gt;
      &lt;/p&gt;
      &lt;p&gt;
        &lt;a href="#" class="btn btn-default btn-lg"&gt;primary - basic&lt;/a&gt;
        &lt;a href="#" class="btn btn-default btn-lg btn-block active"&gt;primary - active&lt;/a&gt;
        &lt;a href="#" class="btn btn-default btn-lg disabled"&gt;primary - active&lt;/a&gt;
      &lt;/p&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;div class="container card card-default my-5"&gt;
    &lt;h3 class="cards-heading"&gt;[5] cmustom css&lt;/h3&gt;
    &lt;p class="alert alert-warning"&gt;원본 css는 수정하지 말고 child-css 만들어서 사용하기( 누더기...)&lt;/p&gt;
    &lt;div class="panel-body dropdown"&gt;
      &lt;button class="btn btn-danger btn-block dropdown-toggle" type="button" data-toggle="dropdown"&gt;
        Dropdown Example &lt;span class="caret"&gt;&lt;/span&gt;
      &lt;/button&gt;
      &lt;ul class="dropdown-menu"&gt;
        &lt;li&gt;&lt;a href="#"&gt;HTML&lt;/a&gt;&lt;/li&gt;
        &lt;li&gt;&lt;a href="#"&gt;CSS&lt;/a&gt;&lt;/li&gt;
        &lt;li&gt;&lt;a href="#"&gt;JavaScript&lt;/a&gt;&lt;/li&gt;
      &lt;/ul&gt;
    &lt;/div&gt;
  &lt;/div&gt;

&lt;/body&gt;
&lt;/html&gt;
 
</pre>
 
 
 
 
---
<!-- _class: aqua -->   
### #4.   쓸만한 기능들 (1)  CSS (1/2)
 1.   Text/Typography
 2.   Images
 3.   Jumbtron
 4.   Wells
 5.   Alert
 6.   Glyphicons
 7.   Badges and Labels

 ---
<!-- _class: aqua -->   
### #4.   쓸만한 기능들 (1)  CSS (2/2)
 8.   Progress Bars
 9.   Pagination
 10.  Pager
 11.  Dropdowns
 13.  FORM
 14. MEDIA OBJECT
 

  
---
<!-- _class: aqua -->  
#### #4. 쓸만한 기능들 (1)  CSS  
■1.   Text/Typography
[Text/Typography](https://www.w3schools.com/bootstrap5/bootstrap_typography.php)
 
<img src="./images/web007_006.png" alt="bootstrap Step1" width="60%"/>
 

---
<!-- _class: aqua -->  

<pre class="codeblock">
#1  &lt;h1&gt; - &lt;h6&gt;
#2  &lt;small&gt;
ex) &lt;h1&gt;h1 heading &lt;small&gt;secondary text&lt;/small&gt;&lt;/h1&gt;
#3  &lt;abbr&gt;
#4  &lt;blockquote&gt;   class="blockquote-reverse"
#5  &lt;dl&gt;
#6  &lt;code&gt;
#7  &lt;kbd&gt;
#8  &lt;pre&gt;
</pre>
 
 
---
<!-- _class: aqua -->   
 ##### ■2.   Images
[Images](https://www.w3schools.com/bootstrap5/bootstrap_images.php)
 
<img src="./images/web007_006.png" alt="bootstrap Step1" width="60%"/>
 

---
<!-- _class: aqua -->   
<pre class="codeblock">
&lt;img src="cinqueterre.jpg"
     class="img-rounded" alt="Cinque Terre"&gt;
&lt;img src="cinqueterre.jpg" 
     class="img-circle" alt="Cinque Terre"&gt;
&lt;img src="cinqueterre.jpg" 
     class="img-thumbnail" alt="Cinque Terre"&gt;
</pre>
 
 
 
 
 
---
<!-- _class: aqua -->  
##### ■3.   Jumbtron
[Jumbtron](https://www.w3schools.com/bootstrap5/bootstrap_jumbotron.php)
 


---
<!-- _class: aqua -->  
 <img src="./images/web007_007.png" alt="bootstrap Step1" width="100%"/>
 

---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div class="mt-4 p-5 bg-primary text-white rounded"&gt;
  &lt;h1&gt;Jumbotron Example&lt;/h1&gt;
  &lt;p&gt;Lorem ipsum...&lt;/p&gt;
&lt;/div&gt;
</pre>
 
 
 
  
---
<!-- _class: aqua -->  
##### ■4.   Alert
[Alert](https://www.w3schools.com/bootstrap5/bootst )



---
<!-- _class: aqua -->  
 <img src="./images/web007_008.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div class="alert alert-success"&gt;
  &lt;strong&gt;Success!&lt;/strong&gt; Indicates a successful or positive action.
&lt;/div&gt;
</pre>
 
  
 
---
<!-- _class: aqua -->   
 ##### ■5.    padding/margin
[padding/margin]( https://www.w3schools.com/bootstrap5/bootstrap_utilities.php )
  

 
---
<!-- _class: aqua -->    
 <img src="./images/web007_009.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div class="pt-4 bg-warning"&gt;I only have a top padding (1.5rem)&lt;/div&gt;
&lt;div class="p-5 bg-success"&gt;I have a padding on all sides (3rem)&lt;/div&gt;
&lt;div class="m-5 pb-5 bg-info"&gt;I have a margin on all sides (3rem) and a bottom padding (3rem)&lt;/div&gt;

</pre>
 
 
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■6.   Badges
[Badges]( https://www.w3schools.com/bootstrap5/bootstrap_badges.php)

 
 
  ---
<!-- _class: aqua -->  
 <img src="./images/web007_010.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;span class="badge bg-primary"&gt;Primary&lt;/span&gt;

</pre>
 
 
 
 
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■7.   Progress Bars
[ Progress Bars]( https://www.w3schools.com/bootstrap5/bootstrap_progressbars.php)
 

 
 
---
<!-- _class: aqua -->    
 <img src="./images/web007_011.png" alt="bootstrap Step1" width="100%"/>

 ---
<!-- _class: aqua -->  

<pre class="codeblock">
&lt;div class="progress-bar progress-bar-striped progress-bar-animated" style="width:40%"&gt;&lt;/div&gt;

</pre>
 
 
 
  
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■8.   Pagination
 
[Pagination]( https://www.w3schools.com/bootstrap5/bootstrap_pagination.php )
 
 
 ---
<!-- _class: aqua -->  
 <img src="./images/web007_012.png" alt="bootstrap Step1" width="100%"/>
 
 
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;ul class="pagination"&gt;
  &lt;li class="page-item"&gt;&lt;a class="page-link" 
      href="#"&gt;Previous&lt;/a&gt;&lt;/li&gt;
  &lt;li class="page-item"&gt;&lt;a class="page-link" 
      href="#"&gt;1&lt;/a&gt;&lt;/li&gt;
  &lt;li class="page-item"&gt;&lt;a class="page-link" 
      href="#"&gt;2&lt;/a&gt;&lt;/li&gt;
  &lt;li class="page-item"&gt;&lt;a class="page-link"
      href="#"&gt;3&lt;/a&gt;&lt;/li&gt;
  &lt;li class="page-item"&gt;&lt;a class="page-link"
      href="#"&gt;Next&lt;/a&gt;&lt;/li&gt;
&lt;/ul&gt;
</pre>
 
 
  
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■9. cards
 
[cards]( https://www.w3schools.com/bootstrap5/bootstrap_cards.php )
  

---
<!-- _class: aqua -->  
 <img src="./images/web007_013.png" alt="bootstrap Step1" width="100%"/>
 
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div class="card"&gt;
  &lt;div class="card-header"&gt;Header&lt;/div&gt;
  &lt;div class="card-body"&gt;Content&lt;/div&gt;
  &lt;div class="card-footer"&gt;Footer&lt;/div&gt;
&lt;/div&gt;
</pre>
 
 
 
 
 
---
<!-- _class: aqua -->   
 ##### ■10. Dropdown
 
[Dropdown](  https://www.w3schools.com/bootstrap5/bootstrap_dropdowns.php)

  
---
<!-- _class: aqua -->    
 <img src="./images/web007_014.png" alt="bootstrap Step1" width="100%"/>
 
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div class="dropdown"&gt;
  &lt;button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown"&gt;
    Dropdown button
  &lt;/button&gt;
  &lt;ul class="dropdown-menu"&gt;
    &lt;li&gt;&lt;a class="dropdown-item" href="#"&gt;Link 1&lt;/a&gt;&lt;/li&gt;
    &lt;li&gt;&lt;a class="dropdown-item" href="#"&gt;Link 2&lt;/a&gt;&lt;/li&gt;
    &lt;li&gt;&lt;a class="dropdown-item" href="#"&gt;Link 3&lt;/a&gt;&lt;/li&gt;
  &lt;/ul&gt;
&lt;/div&gt;

 
</pre>
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■11.FORM 
 
[FORM](  https://www.w3schools.com/bootstrap5/bootstrap_forms.php )

 
  ---
<!-- _class: aqua -->  
 <img src="./images/web007_015.png" alt="bootstrap Step1" width="100%"/>
 
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;form action="/action_page.php"&gt;
  &lt;div class="mb-3 mt-3"&gt;
    &lt;label for="email" class="form-label"&gt;Email:&lt;/label&gt;
    &lt;input type="email" class="form-control" id="email" placeholder="Enter email" name="email"&gt;
  &lt;/div&gt;
  &lt;div class="mb-3"&gt;
    &lt;label for="pwd" class="form-label"&gt;Password:&lt;/label&gt;
    &lt;input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd"&gt;
  &lt;/div&gt;
  &lt;div class="form-check mb-3"&gt;
    &lt;label class="form-check-label"&gt;
      &lt;input class="form-check-input" type="checkbox" name="remember"&gt; Remember me
    &lt;/label&gt;
  &lt;/div&gt;
  &lt;button type="submit" class="btn btn-primary"&gt;Submit&lt;/button&gt;
&lt;/form&gt;

 
</pre>
 
 
 
  
 ---
<!-- _class: aqua -->  
 ##### ■12. TABLE
 1. TABLE 종류
 2. TABLE 색상
 3. 반응형테이블
 
[TABLE](  https://www.w3schools.com/bootstrap5/bootstrap_tables.php )

 
 
---
<!-- _class: aqua -->    
<img src="./images/web007_016.png" alt="bootstrap Step1" width="100%"/> 

---
<!-- _class: aqua -->  
 ##### ■1. TABLE 종류

<pre class="codeblock">
&lt;table class="table"&gt;  &lt;/table&gt;
&lt;table class="table table-striped"&gt;  &lt;/table&gt;
&lt;table class="table table-bordered"&gt;  &lt;/table&gt;
&lt;table class="table table-hover"&gt;  &lt;/table&gt;
&lt;table class="table table-condensed"&gt;  &lt;/table&gt;

</pre>
 
 
---
<!-- _class: aqua -->   
 ##### ■2. TABLE 색상

<pre class="codeblock">
&lt;tr class="active"&gt;  &lt;/tr&gt;
&lt;tr class="success"&gt;  &lt;/tr&gt;
&lt;tr class="info"&gt;  &lt;/tr&gt;
&lt;tr class="warning"&gt;  &lt;/tr&gt;
&lt;tr class="danger"&gt;  &lt;/tr&gt;
</pre>
 
 
---
<!-- _class: aqua -->   
 ##### ■3. 반응형테이블

<pre class="codeblock">
&lt;div class="table-responsive"&gt;
  &lt;table class="table"&gt;
    ...
  &lt;/table&gt;
&lt;/div&gt;
</pre>
 
 
 
 
 
 

---
<!-- _class: orange -->  
 
 ### #6. 쓸만한 기능들 (3) JS
 1. Collapse
 2. tabs
 3. navbar
 4. carousel
 5. modal
 6. tooltip
 7. popover
 8. scrollspy
 9. affix
 
 
---
<!-- _class: aqua -->   
 ##### ■1. Collapse
[Collapse](   https://www.w3schools.com/bootstrap5/bootstrap_collapse.php )

  
---
<!-- _class: aqua -->    
<img src="./images/web007_017.png" alt="bootstrap Step1" width="100%"/>

 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div id="accordion"&gt;

  &lt;div class="card"&gt;
    &lt;div class="card-header"&gt;
      &lt;a class="btn" data-bs-toggle="collapse" href="#collapseOne"&gt;
        Collapsible Group Item #1
      &lt;/a&gt;
    &lt;/div&gt;
    &lt;div id="collapseOne" class="collapse show" data-bs-parent="#accordion"&gt;
      &lt;div class="card-body"&gt;
        Lorem ipsum..
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;div class="card"&gt;
    &lt;div class="card-header"&gt;
      &lt;a class="collapsed btn" data-bs-toggle="collapse" href="#collapseTwo"&gt;
        Collapsible Group Item #2
      &lt;/a&gt;
    &lt;/div&gt;
    &lt;div id="collapseTwo" class="collapse" data-bs-parent="#accordion"&gt;
      &lt;div class="card-body"&gt;
        Lorem ipsum..
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;div class="card"&gt;
    &lt;div class="card-header"&gt;
      &lt;a class="collapsed btn" data-bs-toggle="collapse" href="#collapseThree"&gt;
        Collapsible Group Item #3
      &lt;/a&gt;
    &lt;/div&gt;
    &lt;div id="collapseThree" class="collapse" data-bs-parent="#accordion"&gt;
      &lt;div class="card-body"&gt;
        Lorem ipsum..
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/div&gt;

&lt;/div&gt;

</pre>
 
 
 
 
---
<!-- _class: aqua -->   
 ##### ■2. tabs
[tabs](  https://www.w3schools.com/bootstrap5/bootstrap_navs.php )
 
  
---
<!-- _class: aqua -->    
 <img src="./images/web007_018.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;!-- Nav tabs --&gt;
&lt;ul class="nav nav-tabs"&gt;
  &lt;li class="nav-item"&gt;
    &lt;a class="nav-link active" data-bs-toggle="tab" href="#home"&gt;Home&lt;/a&gt;
  &lt;/li&gt;
  &lt;li class="nav-item"&gt;
    &lt;a class="nav-link" data-bs-toggle="tab" href="#menu1"&gt;Menu 1&lt;/a&gt;
  &lt;/li&gt;
  &lt;li class="nav-item"&gt;
    &lt;a class="nav-link" data-bs-toggle="tab" href="#menu2"&gt;Menu 2&lt;/a&gt;
  &lt;/li&gt;
&lt;/ul&gt;

&lt;!-- Tab panes --&gt;
&lt;div class="tab-content"&gt;
  &lt;div class="tab-pane container active" id="home"&gt;...&lt;/div&gt;
  &lt;div class="tab-pane container fade" id="menu1"&gt;...&lt;/div&gt;
  &lt;div class="tab-pane container fade" id="menu2"&gt;...&lt;/div&gt;
&lt;/div&gt;
</pre>
 
 
---
<!-- _class: aqua -->   
 ##### ■3. navbar 
[navbar](  https://www.w3schools.com/bootstrap5/bootstrap_navbar.php )
 
  
---
<!-- _class: aqua -->    
 <img src="./images/web007_019.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;nav class="navbar navbar-expand-sm navbar-dark bg-dark"&gt;
  &lt;div class="container-fluid"&gt;
    &lt;a class="navbar-brand" 
       href="javascript:void(0)"&gt;Logo&lt;/a&gt;
    &lt;button class="navbar-toggler" type="button"
        data-bs-toggle="collapse" data-bs-target="#mynavbar"&gt;
      &lt;span class="navbar-toggler-icon"&gt;&lt;/span&gt;
    &lt;/button&gt;
    &lt;div class="collapse navbar-collapse" id="mynavbar"&gt;
      &lt;ul class="navbar-nav me-auto"&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
        &lt;/li&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
        &lt;/li&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
        &lt;/li&gt;
      &lt;/ul&gt;
      &lt;form class="d-flex"&gt;
        &lt;input class="form-control me-2" type="text" placeholder="Search"&gt;
        &lt;button class="btn btn-primary" type="button"&gt;Search&lt;/button&gt;
      &lt;/form&gt;
    &lt;/div&gt;
  &lt;/div&gt;
&lt;/nav&gt;

</pre>
 
 
 
  
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■4. carousel
[carousel](    https://www.w3schools.com/bootstrap5/bootstrap_carousel.php)

 
 ---
<!-- _class: aqua -->  
  <img src="./images/web007_020.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;!-- Carousel --&gt;
&lt;div id="demo" class="carousel slide" data-bs-ride="carousel"&gt;

  &lt;!-- Indicators/dots --&gt;
  &lt;div class="carousel-indicators"&gt;
    &lt;button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"&gt;&lt;/button&gt;
    &lt;button type="button" data-bs-target="#demo" data-bs-slide-to="1"&gt;&lt;/button&gt;
    &lt;button type="button" data-bs-target="#demo" data-bs-slide-to="2"&gt;&lt;/button&gt;
  &lt;/div&gt;

  &lt;!-- The slideshow/carousel --&gt;
  &lt;div class="carousel-inner"&gt;
    &lt;div class="carousel-item active"&gt;
      &lt;img src="la.jpg" alt="Los Angeles" class="d-block w-100"&gt;
    &lt;/div&gt;
    &lt;div class="carousel-item"&gt;
      &lt;img src="chicago.jpg" alt="Chicago" class="d-block w-100"&gt;
    &lt;/div&gt;
    &lt;div class="carousel-item"&gt;
      &lt;img src="ny.jpg" alt="New York" class="d-block w-100"&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;!-- Left and right controls/icons --&gt;
  &lt;button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev"&gt;
    &lt;span class="carousel-control-prev-icon"&gt;&lt;/span&gt;
  &lt;/button&gt;
  &lt;button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next"&gt;
    &lt;span class="carousel-control-next-icon"&gt;&lt;/span&gt;
  &lt;/button&gt;

&lt;/div&gt;

</pre>
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■5. modal
[modal]( https://www.w3schools.com/bootstrap5/bootstrap_modal.php )
 
 
  ---
<!-- _class: aqua -->  
 <img src="./images/web007_021.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
 <!-- Button to Open the Modal -->
 <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal">
   Open modal
 </button>
 
 <!-- The Modal -->
 <div class="modal" id="myModal">
  &lt;!-- Button to Open the Modal --&gt;
&lt;button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal"&gt;
  Open modal
&lt;/button&gt;

&lt;!-- The Modal --&gt;
&lt;div class="modal" id="myModal"&gt;
  &lt;div class="modal-dialog"&gt;
    &lt;div class="modal-content"&gt;

      &lt;!-- Modal Header --&gt;
      &lt;div class="modal-header"&gt;
        &lt;h4 class="modal-title"&gt;Modal Heading&lt;/h4&gt;
        &lt;button type="button" class="btn-close" data-bs-dismiss="modal"&gt;&lt;/button&gt;
      &lt;/div&gt;

      &lt;!-- Modal body --&gt;
      &lt;div class="modal-body"&gt;
        Modal body..
      &lt;/div&gt;

      &lt;!-- Modal footer --&gt;
      &lt;div class="modal-footer"&gt;
        &lt;button type="button" class="btn btn-danger" data-bs-dismiss="modal"&gt;Close&lt;/button&gt;
      &lt;/div&gt;

    &lt;/div&gt;
  &lt;/div&gt;
&lt;/div&gt;

</pre>
 
 
 
 
 
 ---
<!-- _class: aqua -->  
 #####  ■6. tooltip
[tooltip](  https://www.w3schools.com/bootstrap5/bootstrap_tooltip.php )


---
<!-- _class: aqua -->    
 <img src="./images/web007_022.png" alt="bootstrap Step1" width="100%"/>
 
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;button type="button" class="btn btn-primary" data-bs-toggle="tooltip" title="Hooray!"&gt;Hover over me!&lt;/button&gt;

 
</pre>
 
 
  
 
 ---
<!-- _class: aqua -->  
 #####   ■7. popover 
[popover](   https://www.w3schools.com/bootstrap5/bootstrap_popover.php)

 
  
 ---
<!-- _class: aqua -->  
 <img src="./images/web007_023.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;div class="container mt-3"&gt;
  &lt;h3&gt;Popover Example&lt;/h3&gt;

  &lt;button type="button" class="btn btn-primary" data-bs-toggle="popover" title="Popover Header" data-bs-content="Some content inside the popover"&gt;
    Toggle popover
  &lt;/button&gt;
&lt;/div&gt;

&lt;script&gt;
  var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'))
  var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
    return new bootstrap.Popover(popoverTriggerEl)
  })
&lt;/script&gt;

</pre>
 
 
 
 
 
 
 ---
<!-- _class: aqua -->  
 ##### ■8. scrollspy
[scrollspy](    https://www.w3schools.com/bootstrap5/bootstrap_scrollspy.php )

---
<!-- _class: aqua -->    
 <img src="./images/web007_024.png" alt="bootstrap Step1" width="100%"/>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;style&gt;
  body {
    position: relative;
  }
&lt;/style&gt;

</pre>
 
---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="50"&gt;

  &lt;nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top"&gt;
    &lt;div class="container-fluid"&gt;
      &lt;ul class="navbar-nav"&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="#section1"&gt;Section 1&lt;/a&gt;
        &lt;/li&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="#section2"&gt;Section 2&lt;/a&gt;
        &lt;/li&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="#section3"&gt;Section 3&lt;/a&gt;
        &lt;/li&gt;
      &lt;/ul&gt;
    &lt;/div&gt;
  &lt;/nav&gt;

  &lt;div id="section1" class="container-fluid bg-success text-white" style="padding:100px 20px;"&gt;
    &lt;h1&gt;Section 1&lt;/h1&gt;
    &lt;p&gt;Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!&lt;/p&gt;
    &lt;p&gt;Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!&lt;/p&gt;
  &lt;/div&gt;

  &lt;div id="section2" class="container-fluid bg-warning" style="padding:100px 20px;"&gt;
    &lt;h1&gt;Section 2&lt;/h1&gt;
    &lt;p&gt;Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!&lt;/p&gt;
    &lt;p&gt;Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!&lt;/p&gt;
  &lt;/div&gt;

  &lt;div id="section3" class="container-fluid bg-secondary text-white" style="padding:100px 20px;"&gt;
    &lt;h1&gt;Section 3&lt;/h1&gt;
    &lt;p&gt;Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!&lt;/p&gt;
    &lt;p&gt;Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!&lt;/p&gt;
  &lt;/div&gt;

&lt;/body&gt;

</pre>
 
 
 
 
---
<!-- _class: aqua -->  
<img src="./images/web007_025.png" alt="bootstrap Step1" width="100%"/>

---
<!-- _class: aqua -->  
<pre class="codeblock">
&lt;!DOCTYPE html&gt;
&lt;html lang="ko"&gt;
&lt;head&gt;
  &lt;title&gt;DBDBIG&lt;/title&gt;
  &lt;meta charset="utf-8"&gt;
  &lt;meta name="viewport" content="width=device-width, initial-scale=1"&gt;
  &lt;!-- Latest compiled and minified CSS --&gt;
  &lt;link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"&gt;

  &lt;!-- Latest compiled JavaScript --&gt;
  &lt;script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"&gt;&lt;/script&gt;
&lt;/head&gt;
&lt;body&gt;

  &lt;!-- header --&gt;
  &lt;nav class="navbar navbar-expand-sm navbar-dark bg-dark"&gt;
    &lt;div class="container-fluid"&gt;
      &lt;a class="navbar-brand" href="javascript:void(0)"&gt;Logo&lt;/a&gt;
      &lt;button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar"&gt;
        &lt;span class="navbar-toggler-icon"&gt;&lt;/span&gt;
      &lt;/button&gt;
      &lt;div class="collapse navbar-collapse" id="mynavbar"&gt;
        &lt;ul class="navbar-nav me-auto"&gt;
          &lt;li class="nav-item"&gt;
            &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
          &lt;/li&gt;
          &lt;li class="nav-item"&gt;
            &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
          &lt;/li&gt;
          &lt;li class="nav-item"&gt;
            &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
          &lt;/li&gt;
        &lt;/ul&gt;
        &lt;form class="d-flex"&gt;
          &lt;input class="form-control me-2" type="text" placeholder="Search"&gt;
          &lt;button class="btn btn-primary" type="button"&gt;Search&lt;/button&gt;
        &lt;/form&gt;
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/nav&gt;

  &lt;!-- visual --&gt;
  &lt;div id="demo" class="carousel slide" data-bs-ride="carousel" style="height:400px; overflow:hidden;"&gt;
    &lt;div class="carousel-indicators"&gt;
      &lt;button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"&gt;&lt;/button&gt;
      &lt;button type="button" data-bs-target="#demo" data-bs-slide-to="1"&gt;&lt;/button&gt;
      &lt;button type="button" data-bs-target="#demo" data-bs-slide-to="2"&gt;&lt;/button&gt;
    &lt;/div&gt;

    &lt;div class="carousel-inner"&gt;
      &lt;div class="carousel-item active"&gt;
        &lt;img src="./images/visual1.jpg" alt="Los Angeles" class="d-block" style="width:100%"&gt;
      &lt;/div&gt;
      &lt;div class="carousel-item"&gt;
        &lt;img src="./images/visual2.jpg" alt="Chicago" class="d-block" style="width:100%"&gt;
      &lt;/div&gt;
      &lt;div class="carousel-item"&gt;
        &lt;img src="./images/visual3.jpg" alt="New York" class="d-block" style="width:100%"&gt;
      &lt;/div&gt;
    &lt;/div&gt;

    &lt;button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev"&gt;
      &lt;span class="carousel-control-prev-icon"&gt;&lt;/span&gt;
    &lt;/button&gt;
    &lt;button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next"&gt;
      &lt;span class="carousel-control-next-icon"&gt;&lt;/span&gt;
    &lt;/button&gt;
  &lt;/div&gt;

  &lt;!-- main --&gt;
  &lt;div class="container"&gt;
    &lt;h3 class="mt-5 text-center"&gt; REACT SPRING BOARD &lt;/h3&gt;
    &lt;table class="table table-striped table-bordered table-hover"&gt;
      &lt;thead&gt;
        &lt;tr&gt;
          &lt;th style="width:25%" scope="col"&gt;NO&lt;/th&gt;
          &lt;th style="width:35%" scope="col"&gt;TITLE&lt;/th&gt;
          &lt;th style="width:20%" scope="col"&gt;NAME&lt;/th&gt;
          &lt;th style="width:25%" scope="col"&gt;DATE&lt;/th&gt;
          &lt;th style="width:10%" scope="col"&gt;HIT&lt;/th&gt;
        &lt;/tr&gt;
      &lt;/thead&gt;
      &lt;tbody&gt;
        &lt;tr&gt;
          &lt;td&gt;1&lt;/td&gt;
          &lt;td&gt;&lt;a href="web012.html"&gt;첫번째 글쓰기입니다.&lt;/a&gt;&lt;/td&gt;
          &lt;td&gt;first&lt;/td&gt;
          &lt;td&gt;2025.12.12&lt;/td&gt;
          &lt;td&gt;&lt;span class="badge bg-secondary"&gt;1&lt;/span&gt;&lt;/td&gt;
        &lt;/tr&gt;
        &lt;tr&gt;
          &lt;td&gt;2&lt;/td&gt;
          &lt;td&gt;&lt;a href="web012.html"&gt;두번째 글쓰기입니다.&lt;/a&gt;&lt;/td&gt;
          &lt;td&gt;first&lt;/td&gt;
          &lt;td&gt;2025.12.12&lt;/td&gt;
          &lt;td&gt;&lt;span class="badge bg-secondary"&gt;11&lt;/span&gt;&lt;/td&gt;
        &lt;/tr&gt;
      &lt;/tbody&gt;
    &lt;/table&gt;
    &lt;div class="text-end"&gt;
      &lt;a href="web011.html" title="글쓰러 바로가기 버튼" class="btn btn-outline-primary"&gt;글쓰기&lt;/a&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;!-- footer --&gt;
  &lt;div class="mt-5 p-4 bg-dark text-white text-center"&gt;
    &lt;p&gt;&copy; 2025. 개인회사명 Co. all rights reserved.&lt;/p&gt;
  &lt;/div&gt;

&lt;/body&gt;
&lt;/html&gt;

</pre>
 
 
 
---
<!-- _class: aqua -->  
<img src="./images/web007_026.png" alt="bootstrap Step1" width="100%"/>

---
<!-- _class: aqua -->  

<pre class="codeblock">
&lt;!DOCTYPE html&gt;
&lt;html lang="ko"&gt;
&lt;head&gt;
  &lt;title&gt;DBDBIG&lt;/title&gt;
  &lt;meta charset="utf-8"&gt;
  &lt;meta name="viewport" content="width=device-width, initial-scale=1"&gt;
  &lt;!-- Latest compiled and minified CSS --&gt;
  &lt;link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"&gt;

  &lt;!-- Latest compiled JavaScript --&gt;
  &lt;script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"&gt;&lt;/script&gt;
&lt;/head&gt;
&lt;body&gt;

  &lt;!-- header --&gt;
  &lt;nav class="navbar navbar-expand-sm navbar-dark bg-dark"&gt;
    &lt;div class="container-fluid"&gt;
      &lt;a class="navbar-brand" href="javascript:void(0)"&gt;Logo&lt;/a&gt;
      &lt;button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar"&gt;
        &lt;span class="navbar-toggler-icon"&gt;&lt;/span&gt;
      &lt;/button&gt;
      &lt;div class="collapse navbar-collapse" id="mynavbar"&gt;
        &lt;ul class="navbar-nav me-auto"&gt;
          &lt;li class="nav-item"&gt;
            &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
          &lt;/li&gt;
          &lt;li class="nav-item"&gt;
            &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
          &lt;/li&gt;
          &lt;li class="nav-item"&gt;
            &lt;a class="nav-link" href="javascript:void(0)"&gt;Link&lt;/a&gt;
          &lt;/li&gt;
        &lt;/ul&gt;
        &lt;form class="d-flex"&gt;
          &lt;input class="form-control me-2" type="text" placeholder="Search"&gt;
          &lt;button class="btn btn-primary" type="button"&gt;Search&lt;/button&gt;
        &lt;/form&gt;
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/nav&gt;

  &lt;!-- main --&gt;
  &lt;div class="container"&gt;
    &lt;h3 class="mt-5 text-center"&gt; REACT WRITE &lt;/h3&gt;

    &lt;div class="alert alert-secondary"&gt;
      &lt;div class="my-3"&gt;
        &lt;label for="bname" class="form-label"&gt;NAME&lt;/label&gt;
        &lt;input type="text" class="form-control" id="name" name="bname" /&gt;
      &lt;/div&gt;
      &lt;div class="my-3"&gt;
        &lt;label for="btitle" class="form-label"&gt;TITLE&lt;/label&gt;
        &lt;input type="text" class="form-control" id="btitle" name="btitle" /&gt;
      &lt;/div&gt;
      &lt;div class="my-3"&gt;
        &lt;label for="bcontent" class="form-label"&gt;CONTENT&lt;/label&gt;
        &lt;textarea class="form-control" id="bcontent" name="bcontent"&gt;&lt;/textarea&gt;
      &lt;/div&gt;
      &lt;div class="text-end"&gt;
        &lt;button class="btn btn-primary me-2"&gt;글쓰기&lt;/button&gt;
        &lt;a href="web010.html" title="글쓰러 바로가기 버튼" class="btn btn-outline-primary"&gt;목록&lt;/a&gt;
      &lt;/div&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;!-- footer --&gt;
  &lt;div class="mt-5 p-4 bg-dark text-white text-center"&gt;
    &lt;p&gt;&copy; 2025. 개인회사명 Co. all rights reserved.&lt;/p&gt;
  &lt;/div&gt;

&lt;/body&gt;
&lt;/html&gt;

</pre>
 
  
 
---
<!-- _class: aqua -->  
<img src="./images/web007_027.png" alt="bootstrap Step1" width="100%"/>


 
---
<!-- _class: aqua -->  

<pre class="codeblock">
&lt;!DOCTYPE html&gt;
&lt;html lang="ko"&gt;
&lt;head&gt;
  &lt;title&gt;DBDBIG&lt;/title&gt;
  &lt;meta charset="utf-8"&gt;
  &lt;meta name="viewport" content="width=device-width, initial-scale=1"&gt;
  &lt;!-- Latest compiled and minified CSS --&gt;
  &lt;link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"&gt;

  &lt;!-- Latest compiled JavaScript --&gt;
  &lt;script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"&gt;&lt;/script&gt;
&lt;/head&gt;
&lt;body&gt;

  &lt;!-- header --&gt;
  &lt;nav class="navbar navbar-expand-sm bg-dark navbar-dark"&gt;
    &lt;div class="container-fluid"&gt;
      &lt;!-- Links --&gt;
      &lt;ul class="navbar-nav"&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="#"&gt;Link 1&lt;/a&gt;
        &lt;/li&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="#"&gt;Link 2&lt;/a&gt;
        &lt;/li&gt;
        &lt;li class="nav-item"&gt;
          &lt;a class="nav-link" href="#"&gt;Link 3&lt;/a&gt;
        &lt;/li&gt;
      &lt;/ul&gt;
    &lt;/div&gt;
  &lt;/nav&gt;

  &lt;!-- main --&gt;
  &lt;div class="container"&gt;
    &lt;h3 class="mt-5 text-center"&gt; REACT SPRING BOARD DETAIL&lt;/h3&gt;
    &lt;table class="table table-striped table-bordered table-hover"&gt;
      &lt;tbody&gt;
        &lt;tr&gt;
          &lt;th scope="row"&gt;TITLE&lt;/th&gt;
          &lt;td colspan="3"&gt; TITLE &lt;/td&gt;
        &lt;/tr&gt;
        &lt;tr&gt;
          &lt;th scope="row"&gt;NAME&lt;/th&gt;
          &lt;td&gt; NAME &lt;/td&gt;
          &lt;th scope="row"&gt;DATE&lt;/th&gt;
          &lt;td&gt; 2025.12.12&lt;/td&gt;
        &lt;/tr&gt;
        &lt;tr&gt;
          &lt;th scope="row"&gt;CONTENT&lt;/th&gt;
          &lt;td colspan="3" style="height:200px; white-space:pre-wrap"&gt; 첫번째 글쓰기입니다. &lt;/td&gt;
        &lt;/tr&gt;
      &lt;/tbody&gt;
    &lt;/table&gt;
    &lt;div class="text-end"&gt;
      &lt;a href="web010.html" title="글쓰러 바로가기 버튼" class="btn btn-outline-primary"&gt;목록&lt;/a&gt;
    &lt;/div&gt;
  &lt;/div&gt;

  &lt;!-- footer --&gt;
  &lt;div class="mt-5 p-4 bg-dark text-white text-center"&gt;
    &lt;p&gt;&copy; 2025. 개인회사명 Co. all rights reserved.&lt;/p&gt;
  &lt;/div&gt;

&lt;/body&gt;
&lt;/html&gt;

</pre>
 
 

 ---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">Bootstrap은 웹 개발의 <span class="mark">기초이자 강력한 도구</span>입니다</span>  
> <span class="fragment">그리드 시스템과 컴포넌트를 자유롭게 다뤄보세요!</span>
> <span class="fragment">오늘 배운 클래스 하나가
 **내일의 UI 혁신**이 될 수 있습니다</span>  
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>


 