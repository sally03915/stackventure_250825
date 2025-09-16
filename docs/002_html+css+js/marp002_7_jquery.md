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
  📍 <strong>현재 위치:</strong> Chapter 5 · <em>jQuery와 프레임워크 활용</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">jQuery를 활용한 DOM 조작과 이벤트 처리</span><br>
  <span class="fragment" style="color:#495057;">프레임워크 기반 개발로 생산성과 유지보수 향상</span>
</blockquote>

---
<!-- _class: cover-html -->
<h2 style="font-size:1.6em; color:#555;">목차 : Web Essentials 트랙</h2>

<div class="track-outline">
  <span>▶ Chapter 1: 웹 개발 시작과 HTML 구조</span>
  <span>▶ Chapter 2: HTML 태그 · id/class · 레이아웃</span>
  <span>▶ Chapter 3: Bootstrap</span>
  <span>▶ Chapter 4: JavaScript 문법 · 이벤트 · 배열</span>
  <span class="current-chapter">✅▶ Chapter 5: jQuery와 프레임워크 활용</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 챕터에서는 jQuery를 활용한 DOM 조작과 이벤트 처리 방법을 배우고, 
  프레임워크를 통해 웹 개발의 효율성과 유지보수성을 높이는 방법을 익힙니다.
</p>

 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  
***jQuery 선택자 기초***     
→ ***태그***, ***아이디***, ***클래스***, ***형제 요소 (prev / next)*** 등

---
<!-- _class: aqua -->

### 🔍 기본 선택자  
- ***$("태그")*** : 태그로 요소 선택  
- ***$("#아이디")*** : 아이디로 요소 선택  
- ***$(".클래스")*** : 클래스명으로 요소 선택  

---
<!-- _class: aqua -->

### 🧩 구조 선택자  
- ***$("부모 자식")*** : 부모 안의 자식 선택  
- ***$("div:first")*** : 첫 번째 요소 선택  

---
<!-- _class: aqua -->

### 🔗 형제 요소 선택자  
- ***$(".item").prev()*** : 바로 앞 형제 요소 선택  
- ***$(".item").next()*** : 바로 뒤 형제 요소 선택  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
$(document).ready(function(){
  $("p").css("color", "blue"); // 모든 p 태그 파란색
  $("#hello").css("font-size", "30px"); //아이디 hello 글자 크기
  $(".greeting").css("background-color", "yellow"); // 클래스 greeting 배경색
  $("ul li").css("color", "red"); // 리스트 항목 빨간색
  $("div:first").css("border", "2px solid green"); // 첫 번째 div 테두리
  $(".item").prev().css("color", "orange"); // 앞 형제 요소 주황색
  $(".item").next().css("color", "purple"); // 뒤 형제 요소 보라색
});
</pre>

---
<!-- _class: aqua -->

## ✅ 선택자 요약표 (1/2)

| 선택자 | 설명 |
|--------|------|
| ***$("p")*** | 모든 p태그 선택 |
| ***$("#hello")*** | 아이디가 hello 인 요소 선택 |
| ***$(".greeting")*** | 클래스가 greeting 인 요소 선택 |
| ***$("ul li")*** | 리스트 항목 선택 | 

---
<!-- _class: aqua -->

## ✅ 선택자 요약표 (2/2)

| 선택자 | 설명 |
|--------|------| 
| ***$("div:first")*** | 첫 번째 div 선택 |
| ***$(".item").prev()*** | 앞 형제 요소 선택 |
| ***$(".item").next()*** | 뒤 형제 요소 선택 |


---
<!-- _class: aqua -->

- ***$("태그")*** 는 같은 태그를 모두 선택  
- ***$("#아이디")*** 는 하나의 특정 요소 선택  
- ***$(".클래스")*** 는 같은 그룹의 요소 선택  
- ***prev()*** 는 바로 앞 형제를 선택  
- ***next()*** 는 바로 뒤 형제를 선택  

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. ***$("#hello")*** 는 어떤 요소를 선택하나요?  
2. ***$(".greeting")*** 는 몇 개의 요소를 선택할 수 있나요?  
3. ***$("ul li")*** 는 어떤 구조를 선택하나요?  
4. ***$(".item").next()*** 는 어떤 요소를 선택하나요?

---
<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---
<!-- _class: aqua -->

- ***$("p")*** 는 어떤 태그를 선택하나요?  
- ***$("#아이디")*** 는 어떤 방식으로 선택하나요?  
- ***$(".클래스")*** 는 어떤 그룹을 선택하나요?  
- ***prev()*** 와 ***next()*** 는 어떤 관계의 요소를 선택하나요?  
- ***$("div:first")*** 는 어떤 요소를 선택하나요?
 
 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  
***jQuery 기본 효과***     
→ ***숨기기***, ***보이기***, ***천천히 나타나기***, ***슬라이드***, ***애니메이션***

---
<!-- _class: aqua -->

### 🎈 기본 효과  
- ***hide()*** : 요소를 숨겨요  
- ***show()*** : 숨긴 요소를 다시 보여줘요  
- ***fadeOut() / fadeIn()*** : 천천히 사라지고 나타나요  

---
<!-- _class: aqua -->

### 🎬 슬라이드와 애니메이션  
- ***slideUp() / slideDown()*** : 위로 접히거나 아래로 펼쳐져요  
- ***animate()*** : 크기나 위치를 바꿔요  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
$(document).ready(function(){
  $("#btn1").click(function(){ $("#box1").hide(); });
  $("#btn2").click(function(){ $("#box1").show(); });
  $("#btn3").click(function(){ $("#box2").fadeOut(); });
  $("#btn4").click(function(){ $("#box2").fadeIn(); });
  $("#btn5").click(function(){ $("#box3").slideUp(); });
  $("#btn6").click(function(){ $("#box3").slideDown(); });
  $("#btn7").click(function(){ $("#box4").animate({left: "200px", width: "300px"}, 1000); });
});
</pre>

---
<!-- _class: aqua -->

## ✅ 효과 요약표

| 함수 이름 | 설명 |
|-----------|------|
| ***hide()*** | 요소를 숨겨요 |
| ***show()*** | 숨긴 요소를 다시 보여줘요 |
| ***fadeOut() / fadeIn()*** | 천천히 사라지고 나타나요 |
| ***slideUp() / slideDown()*** | 접히거나 펼쳐져요 |
| ***animate()*** | 크기나 위치를 바꿔요 |

---
<!-- _class: aqua -->

- ***hide()*** 는 화면에서 요소를 감춰요  
- ***show()*** 는 숨겨진 요소를 다시 보여줘요  
- ***fadeOut()*** 은 천천히 사라지고  
- ***fadeIn()*** 은 천천히 나타나요  
- ***slideUp()*** 은 위로 접히고  
- ***slideDown()*** 은 아래로 펼쳐져요  
- ***animate()*** 는 움직이거나 크기를 바꿔요  

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. ***hide()*** 와 ***show()*** 는 어떤 차이가 있나요?  
2. ***fadeOut()*** 은 어떤 방식으로 요소를 숨기나요?  
3. ***slideDown()*** 은 어떤 효과를 주나요?  
4. ***animate()*** 를 사용하면 어떤 변화가 생기나요?

---
<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---
<!-- _class: aqua -->

- ***hide()*** 는 어떤 상황에서 사용하나요?  
- ***fadeIn()*** 은 어떤 느낌으로 나타나나요?  
- ***slideUp()*** 은 어떤 방향으로 접히나요?  
- ***animate()*** 는 어떤 속성을 바꿀 수 있나요?  
- ***show()*** 는 어떤 요소를 다시 보여주나요?
 
 




---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">배치 방식은 웹 디자인의 <span class="mark">핵심</span>입니다</span>  
> <span class="fragment">다양한 방식으로 실습하며 감각을 익혀보세요!</span>
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>

 