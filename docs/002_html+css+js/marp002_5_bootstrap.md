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
# 🧩 Step 1: 핵심 개념 (2)    GRID-LAYOUT
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
 
 <!-- _class: aqua -->
 Grid system  눈여겨봐야할 순서  [1]-[2]-[3]   표-줄-칸
     [1]  .container 또는 .container-fluid
     [2] .row
     [3] .col-*-*

--- 
<!-- _class: aqua --> 
 설명 :
  [1]  .container 또는 .container-fluid   : 전체 가로폭을 지정
       .container :  고정폭 레이아웃을 만들 때 사용합니다.
       .container-fluid  : 좌우로 꽉 찬 레이아웃을 만들 때 사용합니다.
  [2] .row  : 한줄한줄(행)
  [3] .col-디바이스정하기-칸수 : 한칸한칸(열)
      xs (for phones)
      sm (for tablets)   : 768px이상
      md (for desktops) : 992px이상
       lg (for larger desktops) : 가로해상도 1200px이상
 
--- 
<!-- _class: aqua --> 
     1~12 :  행을 12등분하여 그 중에 몇개를 사용할지 지정
     예1)   .container > .row >   .col-sm-10      .col-sm-2
     예2)   .container > .row >   .col-sm-5  .col-sm-5     .col-sm-2
     예3)   .container > .row >   .col-sm-4  .col-sm-4     .col-sm-4
     예4)   .container > .row >   .col-sm-3  .col-sm-3     .col-sm-3   .col-sm-3
 
---
<!-- _class: aqua --> 
 
 ■2. 레이아웃 만들어보기
 
 ![WEB PATTERN](img/web007_004.png)
 
 >web008_bootstrap002_GRID.html
 ```html
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
    <!-- end row -->
    <!-- end row -->
 
 
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
    <!-- end row -->
    <!-- end row -->
  </div><!-- main END -->
 
   </body>
 </html>
 ```
 
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 ---
 
 ### #3. 기본사용법
 1. CSS 읽는방법
 2. CSS 적용예제
 
 #### ■1. CSS 읽는방법
 [1] `버튼(Button) <a>, <dl>, <input> `등의 태그에 클래스를 추가하여 버튼 모양을 만들 수 있습니다. 
  `<a href="#" class="btn btn-default">button</a>`
  1. btn은 공통적으로 적용되는 모양을 정의하고, 
  2. btn-default는 테두리나 배경색 등을 정의합니다.
 
 [2]색(Color)
 
 
 
 .btn                     =기본[필수]에 
 .btn-default             원하는 색상 덮기
 .btn-primary
 .btn-success
 .btn-info
 .btn-warning
 .btn-danger
 .btn-link
 
 ```html
 <button type="button" class="btn">Basic</button>
 <button type="button" class="btn btn-default">Default</button>
 <button type="button" class="btn btn-primary">Primary</button>
 <button type="button" class="btn btn-success">Success</button>
 <button type="button" class="btn btn-info">Info</button>
 <button type="button" class="btn btn-warning">Warning</button>
 <button type="button" class="btn btn-danger">Danger</button>
 <button type="button" class="btn btn-link">Link</button>
 ```
 
 [3]크기(Size) 버튼 크기를 정의하는 클래스는 btn-xs, btn-sm, btn-lg입니다. 
 
 [4]btn-block은 버튼을 블록 요소로 만듭니다. 
 
 [5]상태(State) active를 추가하면 활성화된 상태, disabled를 추가하면 비활성화된 상태의 모양을 만듭니다. 
 비활성화된 상태인 경우 클릭이 되지 않습니다.
  
 
 #### ■2. CSS 적용예제
 
 
 
 ##### # STEP1 기본사용법
 ```html
  <div class="container   panel  panel-default">
      <h3  class="panel-heading">[1]   button + color </h3>
      <p   class="well">  사용방법 :  btn(콘텐츠)  btn-primary(색상)  </p>
      <div  class="panel-body">
        <p>  <a href="#"  class="btn  btn-default">BUTTON1 - DEFAULT</a> </p>
        <p>  <a href="#"  class="btn  btn-primary">BUTTON2 - PRIMARY</a> </p>
        <p>  <a href="#"  class="btn  btn-success">BUTTON3 - SUCCESS</a> </p>
        <p>  <a href="#"  class="btn  btn-info">BUTTON4  - INFO</a> </p>
        <p>  <a href="#"  class="btn  btn-warning">BUTTON5 - WARNING</a> </p>
        <p>  <a href="#"  class="btn  btn-danger">BUTTON6 - DANGER</a> </p>
        <p>  <a href="#"  class="btn  btn-link">BUTTON7 - LINK</a> </p>
      </div>
  </div>
 ```
  
  
 ##### # STEP2 SIZE
 ```html
 <div class="container   panel  panel-danger">
  <h3  class="panel-heading"> [2] button  + color + size</h3>
  <p   class="well">  사용방법 :  btn(콘텐츠)  btn-primary(색상)  btn-lg(사이즈)  </p>
  <div  class="panel-body">
      <p>  <a href="#"  class="btn  btn-warning  btn-lg">    lg : large</a> </p>
    <p>  <a href="#"  class="btn  btn-warning  btn-md">  md : middle</a> </p>
    <p>  <a href="#"  class="btn  btn-warning  btn-sm">  sm : small</a> </p>
    <p>  <a href="#"  class="btn  btn-warning  btn-xs">  xm : 엑스트라 small</a> </p>
  </div>
 </div>
 ```
  
 
 
 ##### # STEP3 ACTIVE / DISABLED  
 ```html
 <div class="container   panel  panel-warning">
  <h3  class="panel-heading"> [3]  state :  active , disabled</h3>
  <p   class="well">  사용방법 :  btn(콘텐츠)
          btn-primary(색상)  btn-lg(사이즈)  active/disabled    </p>
  <div  class="panel-body">
    <p>  <a href="#"  class="btn  btn-primary  btn-lg">  primary - basic</a> </p>
    <p>  <a href="#"  class="btn  btn-primary  btn-lg  active">  primary - active</a> </p>
    <p>  <a href="#"  class="btn  btn-primary  btn-lg  disabled">  primary - active</a> </p>
    <p>  <a href="#"  class="btn  btn-danger   btn-lg">  danger-basic </a> </p>
    <p>  <a href="#"  class="btn  btn-danger   btn-lg active">  danger - active </a> </p>
    <p>  <a href="#"  class="btn  btn-danger   btn-lg disabled">  danger - active </a> </p>
  </div>
 </div>
 ```
  
  
 ##### # STEP4 BLOCK
 ```html
 <div class="container   panel  panel-success">
  <h3  class="panel-heading"> [4]  display :block  속성</h3>
  <p   class="well">  사용방법 :
           btn(콘텐츠)  btn-primary(색상)  btn-lg(사이즈)   active/disabled   btn-block </p>
  <p   class="well">    btn-block  : 줄바꿈이 되고  parent 가로사이즈 만큼 영역이 넓어짐</p>
  <div  class="panel-body">
    <p>
      <a href="#"  class="btn  btn-default  btn-lg">  primary - basic</a>
      <a href="#"  class="btn  btn-default  btn-lg   active">  primary - active</a>
        <a href="#"  class="btn  btn-default  btn-lg  disabled">  primary - active</a>
    </p>
    <p>
      <a href="#"  class="btn  btn-default  btn-lg">  primary - basic</a>
      <a href="#"  class="btn  btn-default  btn-lg  btn-block active">
                                                                       primary - active</a>
       <a href="#"  class="btn  btn-default  btn-lg  disabled">  primary - active</a>
    </p>
  </div>
 </div>
 ``` 
  
 ##### # STEP5 CUSTOM
 ```html
 <div class="container   panel  panel-success">
  <h3  class="panel-heading"> [5] cmustom css</h3>
  <p   class="well">  원본 css는 수정하지 말고 child-css 만들어서 사용하기( 누더기...)</p>
  <div  class="panel-body  dropdown">
    <button class="btn btn-danger btn-block dropdown-toggle"
    type="button" data-toggle="dropdown">Dropdown Example
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
    <li><a href="#">HTML</a></li>
    <li><a href="#">CSS</a></li>
    <li><a href="#">JavaScript</a></li>
    </ul>
  </div>
 </div>
 ```
 
 > web009_bootstrap003_CSS.html
 ```html
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
  <div class="container   card  card-default my-5">
      <h3  class="cards-heading">[1]   button + color </h3>
      <p   class="alert alert-warning">  사용방법 :  btn(콘텐츠)  btn-primary(색상)  </p>
      <div  class="panel-body">
        <p>  <a href="#"  class="btn  btn-default">BUTTON1 - DEFAULT</a> </p>
        <p>  <a href="#"  class="btn  btn-primary">BUTTON2 - PRIMARY</a> </p>
        <p>  <a href="#"  class="btn  btn-success">BUTTON3 - SUCCESS</a> </p>
        <p>  <a href="#"  class="btn  btn-info">BUTTON4  - INFO</a> </p>
        <p>  <a href="#"  class="btn  btn-warning">BUTTON5 - WARNING</a> </p>
        <p>  <a href="#"  class="btn  btn-danger">BUTTON6 - DANGER</a> </p>
        <p>  <a href="#"  class="btn  btn-link">BUTTON7 - LINK</a> </p>
      </div>
  </div>
  <!-- end container -->
  <!-- end container -->
 
  <div class="container     card  card-default my-5">
      <h3  class="cards-heading">[2] button  + color + size</h3>
      <p   class="alert alert-warning">  사용방법 :  btn(콘텐츠)  btn-primary(색상)  btn-lg(사이즈)  </p>
      <div  class="panel-body">
        <p>  <a href="#"  class="btn  btn-warning  btn-lg">    lg : large</a> </p>
        <p>  <a href="#"  class="btn  btn-warning  btn-md">  md : middle</a> </p>
        <p>  <a href="#"  class="btn  btn-warning  btn-sm">  sm : small</a> </p>
        <p>  <a href="#"  class="btn  btn-warning  btn-xs">  xm : 엑스트라 small</a> </p>
      </div>
  </div>
  <!-- end container -->
  <!-- end container -->
 
 
  <div class="container    card  card-default my-5">
      <h3  class="cards-heading">[3]  state :  active , disabled</h3>
      <p   class="alert alert-warning">  사용방법 :  btn(콘텐츠)  btn-primary(색상)  btn-lg(사이즈)  active/disabled    </p>
      <div  class="panel-body">
        <p>  <a href="#"  class="btn  btn-primary  btn-lg">  primary - basic</a> </p>
        <p>  <a href="#"  class="btn  btn-primary  btn-lg  active">  primary - active</a> </p>
        <p>  <a href="#"  class="btn  btn-primary  btn-lg  disabled">  primary - active</a> </p>
        <p>  <a href="#"  class="btn  btn-danger   btn-lg">  danger-basic </a> </p>
        <p>  <a href="#"  class="btn  btn-danger   btn-lg active">  danger - active </a> </p>
        <p>  <a href="#"  class="btn  btn-danger   btn-lg disabled">  danger - active </a> </p>
      </div>
  </div>
  <!-- end container -->
  <!-- end container -->
 
 
  <div class="container    card  card-default my-5">
      <h3  class="cards-heading">[4]  display :block  속성</h3>
      <p   class="alert alert-warning">  사용방법 :  btn(콘텐츠)  btn-primary(색상)  btn-lg(사이즈)   active/disabled   btn-block </p>
      <p   class="alert alert-warning">    btn-block  : 줄바꿈이 되고  parent 가로사이즈 만큼 영역이 넓어짐</p>
      <div  class="panel-body">
        <p>
            <a href="#"  class="btn  btn-default  btn-lg">  primary - basic</a>
              <a href="#"  class="btn  btn-default  btn-lg   active">  primary - active</a>
            <a href="#"  class="btn  btn-default  btn-lg  disabled">  primary - active</a>
        </p>
        <p>
            <a href="#"  class="btn  btn-default  btn-lg">  primary - basic</a>
              <a href="#"  class="btn  btn-default  btn-lg  btn-block active">  primary - active</a>
            <a href="#"  class="btn  btn-default  btn-lg  disabled">  primary - active</a>
        </p>
      </div>
  </div>
  <!-- end container -->
  <!-- end container -->
 
 
  <div class="container   card  card-default my-5">
      <h3  class="cards-heading">[5] cmustom css</h3>
      <p   class="alert alert-warning">  원본 css는 수정하지 말고 child-css 만들어서 사용하기( 누더기...)</p>
      <div  class="panel-body  dropdown">
        <button class="btn btn-danger btn-block dropdown-toggle"
        type="button" data-toggle="dropdown">Dropdown Example
        <span class="caret"></span></button>
        <ul class="dropdown-menu">
        <li><a href="#">HTML</a></li>
        <li><a href="#">CSS</a></li>
        <li><a href="#">JavaScript</a></li>
        </ul>
      </div>
  </div><!--  container4 -->
 
   </body>
 </html>
 ```
 
 
 
 <br/>
 <br/>
 <br/>
 
 ---
 
 ### #4.   쓸만한 기능들 (1)  CSS
 1.   Text/Typography
 2.   Images
 3.   Jumbtron
 4.   Wells
 5.   Alert
 6.   Glyphicons
 7.   Badges and Labels
 8.   Progress Bars
 9.   Pagination
 10.  Pager
 11.  Dropdowns
 13.  FORM
 14. MEDIA OBJECT
 
 #### #4. 쓸만한 기능들 (1)  CSS
 
 ■1.   Text/Typography
 https://www.w3schools.com/bootstrap5/bootstrap_typography.php
 
 
 ![WEB PATTERN](img/web007_006.png)
 
 ```html
 #1  <h1> - <h6>
 #2  <small>
 ex) <h1>h1 heading <small>secondary text</small></h1>
 
 #3  <abbr>
 #4  <blockquote>
 class="blockquote-reverse"
 ex)
   <blockquote class="blockquote-reverse">
     <p>For 50 years, WWF has been protecting the future of nature. The world's leading conservation organization, WWF works in 100 countries and is supported by 1.2 million members in the United States and close to 5 million globally.</p>
     <footer>From WWF's website</footer>
   </blockquote>
 
 #5 <dl>
 #6 <code>
 #7 <kbd>
 #8 <pre>
 
 #9   .text-muted, .text-primary, .text-success, .text-info, .text-warning,   .text-danger
 #10. .bg-primary, .bg-success, .bg-info, .bg-warning,   .bg-danger
 
 #11.  etc
 .lead	Makes a paragraph stand out
 .small	Indicates smaller text (set to 85% of the size of the parent)
 .text-left	Indicates left-aligned text
 .text-center	Indicates center-aligned text
 .text-right	Indicates right-aligned text
 .text-justify	Indicates justified text
 .text-nowrap	Indicates no wrap text
 .text-lowercase	Indicates lowercased text
 .text-uppercase	Indicates uppercased text
 .text-capitalize	Indicates capitalized text
 .initialism	Displays the text inside an <abbr> element in a slightly smaller font size
 .list-unstyled	Removes the default list-style and left margin on list items (works on both <ul> and <ol>). This class only applies to immediate children list items (to remove the default list-style from any nested lists, apply this class to any nested lists as well)
 .list-inline	Places all list items on a single line
 .dl-horizontal	Lines up the terms (<dt>) and descriptions (<dd>) in <dl> elements side-by-side. Starts off like default <dl>s, but when the browser window expands, it will line up side-by-side
 .pre-scrollable	Makes a <pre> element scrollable
 ```
 
 
 <br/>
 <br/>
 <br/>
 
 
 ##### ■2.   Images
 
 https://www.w3schools.com/bootstrap5/bootstrap_images.php
 
 ![WEB PATTERN](img/web007_006.png)
 
 ```html
 <img src="cinqueterre.jpg" class="img-rounded" alt="Cinque Terre">
 <img src="cinqueterre.jpg" class="img-circle" alt="Cinque Terre">
 <img src="cinqueterre.jpg" class="img-thumbnail" alt="Cinque Terre">
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 
 ##### ■3.   Jumbtron
 
 https://www.w3schools.com/bootstrap5/bootstrap_jumbotron.php
 
 
 ![WEB PATTERN](img/web007_007.png)
 
 ```html
 <div class="mt-4 p-5 bg-primary text-white rounded">
   <h1>Jumbotron Example</h1>
   <p>Lorem ipsum...</p>
 </div>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 ##### ■4.   Alert
 
 https://www.w3schools.com/bootstrap5/bootstrap_alerts.php
 
 
 ![WEB PATTERN](img/web007_008.png)
 
 ```html
 <div class="alert alert-success">
   <strong>Success!</strong> Indicates a successful or positive action.
 </div>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 ##### ■5.    padding/margin
  
 https://www.w3schools.com/bootstrap5/bootstrap_utilities.php
 
 
 ![WEB PATTERN](img/web007_009.png)
 
 ```html
 <div class="pt-4 bg-warning">I only have a top padding (1.5rem)</div>
 <div class="p-5 bg-success">I have a padding on all sides (3rem)</div>
 <div class="m-5 pb-5 bg-info">I have a margin on all sides (3rem) and a bottom padding (3rem)</div>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 
 ##### ■6.   Badges
 https://www.w3schools.com/bootstrap5/bootstrap_badges.php
 
 
 
 ![WEB PATTERN](img/web007_010.png)
 
 ```html
 <span class="badge bg-primary">Primary</span>
 
 ```
 
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 
 ##### ■7.   Progress Bars
 
 https://www.w3schools.com/bootstrap5/bootstrap_progressbars.php
 
 
 
 ![WEB PATTERN](img/web007_011.png)
 
 ```html
 <div class="progress-bar progress-bar-striped progress-bar-animated" style="width:40%"></div>
 ```
 
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 
 ##### ■8.   Pagination
 
 https://www.w3schools.com/bootstrap5/bootstrap_pagination.php
 
 
 
 ![WEB PATTERN](img/web007_012.png)
 
 
 
 ```html
 <ul class="pagination">
   <li class="page-item"><a class="page-link" href="#">Previous</a></li>
   <li class="page-item"><a class="page-link" href="#">1</a></li>
   <li class="page-item"><a class="page-link" href="#">2</a></li>
   <li class="page-item"><a class="page-link" href="#">3</a></li>
   <li class="page-item"><a class="page-link" href="#">Next</a></li>
 </ul>
 
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 
 
 ##### ■9. cards
 https://www.w3schools.com/bootstrap5/bootstrap_cards.php
 
 
 ![WEB PATTERN](img/web007_013.png)
 
 
 
 ```html
 <div class="card">
   <div class="card-header">Header</div>
   <div class="card-body">Content</div>
   <div class="card-footer">Footer</div>
 </div>
 ```
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 ##### ■11. Dropdown
 
 https://www.w3schools.com/bootstrap5/bootstrap_dropdowns.php
 
 ![WEB PATTERN](img/web007_014.png)
 
 
 ```html
 <div class="dropdown">
   <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
     Dropdown button
   </button>
   <ul class="dropdown-menu">
     <li><a class="dropdown-item" href="#">Link 1</a></li>
     <li><a class="dropdown-item" href="#">Link 2</a></li>
     <li><a class="dropdown-item" href="#">Link 3</a></li>
   </ul>
 </div>
 
 ```
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 ##### ■12.FORM
 
 https://www.w3schools.com/bootstrap5/bootstrap_forms.php
 
 
 ![WEB PATTERN](img/web007_015.png)
 
 
 ```html
 <form action="/action_page.php">
   <div class="mb-3 mt-3">
     <label for="email" class="form-label">Email:</label>
     <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
   </div>
   <div class="mb-3">
     <label for="pwd" class="form-label">Password:</label>
     <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
   </div>
   <div class="form-check mb-3">
     <label class="form-check-label">
       <input class="form-check-input" type="checkbox" name="remember"> Remember me
     </label>
   </div>
   <button type="submit" class="btn btn-primary">Submit</button>
 </form>
 
 ```
 
 
 
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 ---
 
 ### #5. 쓸만한 기능들 (2) CSS - TABLE
 1. TABLE 종류
 2. TABLE 색상
 3. 반응형테이블
 
 https://www.w3schools.com/bootstrap5/bootstrap_tables.php
 
 
 ![WEB PATTERN](img/web007_016.png)
 
 ##### ■1. TABLE 종류
 ```html
 <table class="table">  </table>
 <table class="table table-striped">  </table>
 <table class="table table-bordered">  </table>
 <table class="table table-hover">  </table>
 <table class="table table-condensed">  </table>
 ```
 
 
 
 ##### ■2. TABLE 색상
 ```html
 <tr class="active">  </tr>
 <tr class="success">  </tr>
 <tr class="info">  </tr>
 <tr class="warning">  </tr>
 <tr class="danger">  </tr>
 ```
 
 
 
 ##### ■3. 반응형테이블
 ```html
 <div class="table-responsive">
   <table class="table">
     ...
   </table>
 </div>
 ```
 
 
 
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 ---
 
 ### #6. 쓸만한 기능들 (3) JS
 1. Collapse
 2. tabs
 3. navbar
 4. carousel
 5. modal
 6. tooltip
 7. popover
 8. scrollspy
 9.affix
 
 
 
 ##### ■1. Collapse
 
 https://www.w3schools.com/bootstrap5/bootstrap_collapse.php
 
 ![WEB PATTERN](img/web007_017.png)
 
 ```html
 <div id="accordion">
 
   <div class="card">
     <div class="card-header">
       <a class="btn" data-bs-toggle="collapse" href="#collapseOne">
         Collapsible Group Item #1
       </a>
     </div>
     <div id="collapseOne" class="collapse show" data-bs-parent="#accordion">
       <div class="card-body">
         Lorem ipsum..
       </div>
     </div>
   </div>
 
   <div class="card">
     <div class="card-header">
       <a class="collapsed btn" data-bs-toggle="collapse" href="#collapseTwo">
         Collapsible Group Item #2
       </a>
     </div>
     <div id="collapseTwo" class="collapse" data-bs-parent="#accordion">
       <div class="card-body">
         Lorem ipsum..
       </div>
     </div>
   </div>
 
   <div class="card">
     <div class="card-header">
       <a class="collapsed btn" data-bs-toggle="collapse" href="#collapseThree">
         Collapsible Group Item #3
       </a>
     </div>
     <div id="collapseThree" class="collapse" data-bs-parent="#accordion">
       <div class="card-body">
         Lorem ipsum..
       </div>
     </div>
   </div>
 
 </div>
 ```
 
 
 <br/>
 <br/>
 <br/>
 
 
 ##### ■2. tabs
 
 https://www.w3schools.com/bootstrap5/bootstrap_navs.php
 
 ![WEB PATTERN](img/web007_018.png)
 
 ```html
 <!-- Nav tabs -->
 <ul class="nav nav-tabs">
   <li class="nav-item">
     <a class="nav-link active" data-bs-toggle="tab" href="#home">Home</a>
   </li>
   <li class="nav-item">
     <a class="nav-link" data-bs-toggle="tab" href="#menu1">Menu 1</a>
   </li>
   <li class="nav-item">
     <a class="nav-link" data-bs-toggle="tab" href="#menu2">Menu 2</a>
   </li>
 </ul>
 
 <!-- Tab panes -->
 <div class="tab-content">
   <div class="tab-pane container active" id="home">...</div>
   <div class="tab-pane container fade" id="menu1">...</div>
   <div class="tab-pane container fade" id="menu2">...</div>
 </div>
 ```
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 ##### ■3. navbar
 
 
 https://www.w3schools.com/bootstrap5/bootstrap_navbar.php
 
 ![WEB PATTERN](img/web007_019.png)
 
 ```html
 <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
   <div class="container-fluid">
     <a class="navbar-brand" href="javascript:void(0)">Logo</a>
     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="mynavbar">
       <ul class="navbar-nav me-auto">
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
       </ul>
       <form class="d-flex">
         <input class="form-control me-2" type="text" placeholder="Search">
         <button class="btn btn-primary" type="button">Search</button>
       </form>
     </div>
   </div>
 </nav>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 
 ##### ■4. carousel
 https://www.w3schools.com/bootstrap5/bootstrap_carousel.php
 
 
 ![WEB PATTERN](img/web007_020.png)
 
 ```html
 <!-- Carousel -->
 <div id="demo" class="carousel slide" data-bs-ride="carousel">
 
   <!-- Indicators/dots -->
   <div class="carousel-indicators">
     <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
     <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
     <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
   </div>
 
   <!-- The slideshow/carousel -->
   <div class="carousel-inner">
     <div class="carousel-item active">
       <img src="la.jpg" alt="Los Angeles" class="d-block w-100">
     </div>
     <div class="carousel-item">
       <img src="chicago.jpg" alt="Chicago" class="d-block w-100">
     </div>
     <div class="carousel-item">
       <img src="ny.jpg" alt="New York" class="d-block w-100">
     </div>
   </div>
 
   <!-- Left and right controls/icons -->
   <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
     <span class="carousel-control-prev-icon"></span>
   </button>
   <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
     <span class="carousel-control-next-icon"></span>
   </button>
 </div>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 ##### ■5. modal
 https://www.w3schools.com/bootstrap5/bootstrap_modal.php
 
 
 ![WEB PATTERN](img/web007_021.png)
 
 ```html
 <!-- Button to Open the Modal -->
 <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal">
   Open modal
 </button>
 
 <!-- The Modal -->
 <div class="modal" id="myModal">
   <div class="modal-dialog">
     <div class="modal-content">
 
       <!-- Modal Header -->
       <div class="modal-header">
         <h4 class="modal-title">Modal Heading</h4>
         <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
       </div>
 
       <!-- Modal body -->
       <div class="modal-body">
         Modal body..
       </div>
 
       <!-- Modal footer -->
       <div class="modal-footer">
         <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
       </div>
 
     </div>
   </div>
 </div>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 ■6. tooltip
 https://www.w3schools.com/bootstrap5/bootstrap_tooltip.php
 
 ![WEB PATTERN](img/web007_022.png)
 
 
 ```html
 <button type="button" class="btn btn-primary" data-bs-toggle="tooltip" title="Hooray!">Hover over me!</button>
 
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 ■7. popover
 https://www.w3schools.com/bootstrap5/bootstrap_popover.php
 
 
 ![WEB PATTERN](img/web007_023.png)
 
 
 ```html
 <div class="container mt-3">
   <h3>Popover Example</h3>
 
   <button type="button" class="btn btn-primary" data-bs-toggle="popover" title="Popover Header" data-bs-content="Some content inside the popover">
     Toggle popover
   </button>
 </div>
 
 <script>
 var popoverTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="popover"]'))
 var popoverList = popoverTriggerList.map(function (popoverTriggerEl) {
   return new bootstrap.Popover(popoverTriggerEl)
 })
 </script>
 ```
 
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 ##### ■8. scrollspy
 https://www.w3schools.com/bootstrap5/bootstrap_scrollspy.php
 
 
 ![WEB PATTERN](img/web007_024.png)
 
 ```css
   <style>
   body {
       position: relative;
   }
   </style>
 ```
 
 ```html
 <body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="50">
 
 <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
   <div class="container-fluid">
     <ul class="navbar-nav">
       <li class="nav-item">
         <a class="nav-link" href="#section1">Section 1</a>
       </li>
       <li class="nav-item">
         <a class="nav-link" href="#section2">Section 2</a>
       </li>
       <li class="nav-item">
         <a class="nav-link" href="#section3">Section 3</a>
       </li>
     </ul>
   </div>
 </nav>
 
 <div id="section1" class="container-fluid bg-success text-white" style="padding:100px 20px;">
   <h1>Section 1</h1>
   <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
   <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
 </div>
 
 <div id="section2" class="container-fluid bg-warning" style="padding:100px 20px;">
   <h1>Section 2</h1>
   <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
   <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
 </div>
 
 <div id="section3" class="container-fluid bg-secondary text-white" style="padding:100px 20px;">
   <h1>Section 3</h1>
   <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
   <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
 </div>
 
 </body>
 ```
 
 
 <br/>
 <br/>
 <br/>
 
 
 
 <br/>
 <br/>
 <br/>
 
 
 ---
 
 ##### ■ 실습
 
 ![WEB PATTERN](img/web007_025.png)
 >web010.html
 ```html
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
 <!--  header   -->
 <!--  header   -->
 <!--  header   -->
 <!-- A grey horizontal navbar that becomes vertical on small screens -->
 <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
   <div class="container-fluid">
     <a class="navbar-brand" href="javascript:void(0)">Logo</a>
     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="mynavbar">
       <ul class="navbar-nav me-auto">
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
       </ul>
       <form class="d-flex">
         <input class="form-control me-2" type="text" placeholder="Search">
         <button class="btn btn-primary" type="button">Search</button>
       </form>
     </div>
   </div>
 </nav>
 <!--  visual   -->
 <!--  visual   -->
 <!--  visual   -->
 
 <!-- Carousel -->
 <!-- Carousel -->
 <div id="demo" class="carousel slide" data-bs-ride="carousel"  style="height:400px; overflow:hidden;">
   <!-- Indicators/dots -->
   <div class="carousel-indicators">
     <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
     <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
     <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
   </div>
 
   <!-- The slideshow/carousel -->
   <div class="carousel-inner">
     <div class="carousel-item active">
       <img src="img/visual1.jpg" alt="Los Angeles" class="d-block" style="width:100%">
     </div>
     <div class="carousel-item">
       <img src="img/visual2.jpg" alt="Chicago" class="d-block" style="width:100%">
     </div>
     <div class="carousel-item">
       <img src="img/visual3.jpg" alt="New York" class="d-block" style="width:100%">
     </div>
   </div>
 
   <!-- Left and right controls/icons -->
   <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
     <span class="carousel-control-prev-icon"></span>
   </button>
   <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
     <span class="carousel-control-next-icon"></span>
   </button>
 </div>
 
 
 <!--  main   -->
 <!--  main   -->
 <!--  main   -->
 <div class="container">
   <h3 class="mt-5  text-center"> REACT SPRING BOARD </h3>
   <table class="table table-striped table-bordered table-hover">
     <thead>
         <tr>
             <th style="width:25%"   scope="col">NO</th>
             <th style="width:35%"   scope="col">TITLE</th>
             <th style="width:20%"   scope="col">NAME</th>
             <th style="width:25%"   scope="col">DATE</th>
             <th style="width:10%"   scope="col">HIT</th>
         </tr>
     </thead>
     <tbody> <!-- ctrl + k + f   -->
         <tr>
           <td>1</td>
           <td><a href="web012.html">첫번째 글쓰기입니다.</a></td>
           <td>first</td>
           <td>2025.12.12</td>
           <td><span class="badge bg-secondary">1</span></td>
         </tr>
 
         <tr>
           <td>2</td>
           <td><a href="web012.html">두번째 글쓰기입니다.</a></td>
           <td>first</td>
           <td>2025.12.12</td>
           <td><span class="badge bg-secondary">11</span></td>
         </tr>
     </tbody>
   </table>
   <div class="text-end">
     <a href="web011.html"  title="글쓰러 바로가기 버튼" class="btn btn-outline-primary">글쓰기</a>
   </div>
 </div>
 
 
 <!--  footer   -->
 <!--  footer   -->
 <!--  footer   -->
   <div class='mt-5 p-4 bg-dark text-white text-center'>
     <p>&copy; 2025. 개인회사명 Co. all rights reserved.</p>
   </div>
 </body>
 </html>
 ```
 
 
 <br/>
 <br/>
 <br/>
 
 ---
 
 
 ![WEB PATTERN](img/web007_026.png)
 >web011.html
 
 ```html
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
 <!--  header   -->
 <!--  header   -->
 <!--  header   -->
 <!-- A grey horizontal navbar that becomes vertical on small screens -->
 <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
   <div class="container-fluid">
     <a class="navbar-brand" href="javascript:void(0)">Logo</a>
     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="mynavbar">
       <ul class="navbar-nav me-auto">
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" href="javascript:void(0)">Link</a>
         </li>
       </ul>
       <form class="d-flex">
         <input class="form-control me-2" type="text" placeholder="Search">
         <button class="btn btn-primary" type="button">Search</button>
       </form>
     </div>
   </div>
 </nav>
 
 <!--  main   -->
 <!--  main   -->
 <!--  main   -->
 <div class="container">
 
   <h3 class="mt-5  text-center"> REACT WRITE </h3>
 
   <div class="alert alert-secondary">
     <div class="my-3">
         <label for="bname" class="form-label">NAME</label>
         <input type="text" class="form-control" id="name" name="bname" />
     </div>
     <div class="my-3">
         <label for="btitle" class="form-label">TITLE</label>
         <input type="text" class="form-control" id="btitle" name="btitle"  />
     </div>
     <div class="my-3">
         <label for="bcontent" class="form-label">CONTENT</label>
         <textarea class="form-control" id="bcontent" name="bcontent" ></textarea>
     </div>
     <div class="text-end">
         <button class="btn btn-primary  me-2" >글쓰기</button>
         <a href="web010.html"  title="글쓰러 바로가기 버튼" class="btn btn-outline-primary">목록</a>
     </div>
 
   </div>
 
 </div>
 
 
 <!--  footer   -->
 <!--  footer   -->
 <!--  footer   -->
   <div class='mt-5 p-4 bg-dark text-white text-center'>
     <p>&copy; 2025. 개인회사명 Co. all rights reserved.</p>
   </div>
 </body>
 </html>
 ```
 
 
 <br/>
 <br/>
 <br/>
 
 ---
 
 
 ![WEB PATTERN](img/web007_027.png)
 >web012.html
 ```html
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
 <!--  header   -->
 <!--  header   -->
 <!--  header   -->
 <!-- A grey horizontal navbar that becomes vertical on small screens -->
 <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
   <div class="container-fluid">
     <!-- Links -->
     <ul class="navbar-nav">
       <li class="nav-item">
         <a class="nav-link" href="#">Link 1</a>
       </li>
       <li class="nav-item">
         <a class="nav-link" href="#">Link 2</a>
       </li>
       <li class="nav-item">
         <a class="nav-link" href="#">Link 3</a>
       </li>
     </ul>
   </div>
 
 </nav>
 
 <!--  main   -->
 <!--  main   -->
 <!--  main   -->
 <div class="container">
     <h3 class="mt-5  text-center"> REACT SPRING BOARD DETAIL</h3>
     <table class="table table-striped table-bordered table-hover">
       <tbody>
           <tr> <th scope="row">TITLE</th> <td colSpan="3"> TITLE </td>
           </tr>
           <tr>
               <th scope="row">NAME</th> <td> NAME </td>
               <th scope="row">DATE</th> <td> 2025.12.12</td>
           </tr>
           <tr>
               <th scope="row">CONTENT</th>
               <td colSpan="3"  style="height:200px; white-space:pre-wrap" >  첫번째 글쓰기입니다.  </td>
           </tr>
       </tbody>
   </table>
   <div class="text-end">
      <a href="web010.html"  title="글쓰러 바로가기 버튼" class="btn btn-outline-primary">목록</a>
   </div>
 </div>
 
 
 <!--  footer   -->
 <!--  footer   -->
 <!--  footer   -->
   <div class='mt-5 p-4 bg-dark text-white text-center'>
     <p>&copy; 2025. 개인회사명 Co. all rights reserved.</p>
   </div>
 </body>
 </html>
 ```
 
 