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
  📍 <strong>현재 위치:</strong> Chapter 4 · <em>JavaScript 문법 · 이벤트 · 배열</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">동적 웹 페이지를 위한 JavaScript 핵심 문법</span><br>
  <span class="fragment" style="color:#495057;">이벤트 처리와 배열·객체 활용으로 인터랙션 구현</span>
</blockquote>

---
<!-- _class: cover-html -->
<h2 style="font-size:1.2em; color:#555;">목차 : Web Essentials 트랙</h2>
<div class="track-outline">
  <span>▶ Chapter 1: 웹 개발 시작과 HTML 구조</span>
  <span>▶ Chapter 2: HTML 태그 · id/class · 레이아웃</span>
  <span>▶ Chapter 3: Bootstrap</span>
  <span class="current-chapter">✅▶ Chapter 4: JavaScript 문법 · 이벤트 · 배열</span>
  <span>▶ Chapter 5: jQuery와 프레임워크 활용</span>
</div>

---
<!-- _class: cover-html -->
## 📑 JavaScript 학습 목차 (1/2)

1. **기초 문법 1, 2, 3**  
  → 출력 방식, 변수 선언, 자료형, typeof 등

2. **이벤트 처리 기초**  
  → onclick, prompt, alert, mouse 이벤트 등

3. **DOM 선택자 활용**  
  → querySelector, parentElement, closest 등

4. **함수 선언과 이벤트 연결**  
  → 함수 정의, 호출, 이벤트 핸들러

5. **조건문과 반복문 제어**  
  → if/else, switch, for, while, do...while
---
<!-- _class: cover-html -->
## 📑 JavaScript 학습 목차 (2/2)

6. **함수 제어 심화 및 기타 문법**  
  → return, 매개변수, 흐름 제어 등

7. **유용한 내장 함수**  
  → parseInt, parseFloat, isNaN, Date, Math 등

8. **배열과 객체의 활용**  
  → 배열 메서드, 객체 속성, 메서드 정의

9. **배열과 객체 심화**  
  → 배열 반복, 객체 순회, 고급 활용

10. **ES6 문법과 최신 기능**  
  → let/const, 화살 함수, 템플릿 문자열, 구조 분해 등

 
 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (1)
**기초 문법 1, 2, 3**     
→ **출력 방식**, **변수 선언**, **자료형**, **typeof** 등

---
<!-- _class: aqua -->

### 🖨️ 출력 방법  
- **document.write("문자열")**: 
   HTML 문서에 직접 출력  
- **console.log("문자열")**: 
   브라우저 개발자 도구 콘솔에 출력  

---
<!-- _class: aqua -->

### 📦 변수 선언 방식  
- **var**: 재선언 및 재할당 가능  
- **let**: 재선언 불가, 재할당 가능  
- **const**: 재선언 및 재할당 불가, 선언 시 초기화 필수  

---
<!-- _class: aqua -->

### 🔍 자료형과 typeof  
- **typeof**로 변수의 타입 확인  
- **"10" + 10** → **"1010"**  
- **Number("10") + 10** → **20**

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->


<pre class="codeblock"  style="width:120%; font-size:50%">
document.write("<p>Hello js!</p>");
console.log("안녕 javascript!");

var x = 10;
var x = 20;

let y = 5;
// let y = 6; // 오류

const z = 7;
// z = 8; // 오류

let a = 10;
console.log(typeof a); // number
a = "10";
console.log(typeof a); // string
console.log(a + 10); // "1010"
console.log(Number(a) + 10); // 20
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. **document.write()** 와 **console.log()** 의 차이점은?  
2. **var**, **let**, **const** 중 재선언이 가능한 것은?  
3. **typeof true**의 결과는?  
4. **"10" + 10**과 **Number("10") + 10**의 차이는?

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (2)
**이벤트 처리 기초**     
→ **onclick**, **prompt**, **alert**, **mouse 이벤트** 등

---
<!-- _class: aqua -->

### 🔔 알림창 이벤트  
- **prompt()**: 사용자 입력 받기  
- **alert()**: 알림창 표시  
- **confirm()**: 확인/취소 선택  

---
<!-- _class: aqua -->

### 🖱️ 이벤트 처리  
- **onclick**: 클릭 이벤트  
- **addEventListener()**: 다양한 이벤트 처리 가능  
- **mouseenter** / **mouseleave**: 마우스 진입/이탈 감지  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->


<pre class="codeblock">
document.getElementById("addEvent").onclick = function() {
  let color = prompt("좋아하는 음료는?");
  alert("좋아하는 음료는 " + color + "입니다.");
};

const box = document.querySelector("#box");
box.addEventListener("mouseenter", () => {
  box.style.backgroundColor = "#fff3cd";
});
box.addEventListener("mouseleave", () => {
  box.style.backgroundColor = "#cff4fc";
});
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. **prompt()** 와 **alert()** 의 역할은?  
2. **addEventListener()** 의 장점은?  
3. **mouseenter** 와 **mouseleave** 의 차이점은?

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (3)
**DOM 선택자 활용**     
→ **querySelector**, **parentElement**, **closest** 등

---
<!-- _class: aqua -->

### 🔍 DOM 선택자  
- **getElementById()**: ID로 요소 선택  
- **getElementsByTagName()**: 태그명으로 선택  
- **querySelector()**: CSS 선택자 방식  
- **value**, **innerHTML**: 값과 내용 접근  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
let color = document.querySelector("#color");
let items = color.children;
for (let i = 0; i <pre items.length; i++) {
  items[i].style.color = "crimson";
}

let orange = document.querySelector("#orange");
orange.parentElement.style.border = "5px dotted crimson";

let gold = document.querySelector("#gold");
gold.closest("ul").style.backgroundColor = "gold";
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. **getElementById()** 와 **querySelector()**   차이점은?  
2. **innerHTML** 과 **value** 의 차이는?  
3. **parentElement** 와 **closest()** 의 차이점은?

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (4)
**함수 선언과 이벤트 연결**     
→ **함수 정의**, **호출**, **이벤트 핸들러**

---
<!-- _class: aqua -->

### 🧠 함수 선언과 호출  
- **function 함수명() {}**: 함수 선언  
- **함수명()**: 함수 호출  
- 이벤트 핸들러에서 함수 호출 가능  

---
<!-- _class: aqua -->

### 🔗 a 태그 이벤트  
- **preventDefault()**: 기본 동작 방지  
- **addEventListener("click", handler)**: 
클릭 이벤트 처리  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
function fn1() {
  alert("hello~ js!");
}
document.getElementById("fn1").onclick = fn1;

const link = document.querySelector(".target_a");
link.addEventListener("click", (e) => {
  e.preventDefault();
  fn1();
});
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. 함수 선언과 호출의 차이점은?  
2. **preventDefault()**는 언제 사용하나요?  
3. **addEventListener()**를 사용하는 이유는?

---
<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---
<!-- _class: aqua -->

- **document.write()**는 어디에 출력되나요?  
- **console.log()**는 어떤 상황에서 유용한가요?  
- **const**는 선언 시 반드시 어떤 작업이 필요하나요?  
- **typeof**는 어떤 값을 반환하나요?  
- **Number()** 함수는 어떤 상황에서 사용하나요?

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (5)
1. **조건문과 반복문 제어**     
→ **if/else**, **switch**, **for**, **while**, **do...while**  
2. **함수 제어 심화 및 기타 문법**     
→ **return**, **매개변수**, **흐름 제어** 등

---
<!-- _class: aqua -->

### 🔁 조건문  
- **if**, **else if**, **else**: 조건에 따라 코드 실행  
- **switch**: 여러 경우의 조건 처리  

---
<!-- _class: aqua -->

### 🔄 반복문  
- **for**: 반복 횟수가 정해진 경우  
- **while**: 조건이 참일 동안 반복  
- **do...while**: 최소 1회 실행 후 조건 확인  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock"  style="width:120%; font-size:25%">
let score = 85;
if (score >= 90) {
  console.log("A");
} else if (score >= 80) {
  console.log("B");
} else {
  console.log("C");
}

for (let i = 1; i <= 5; i++) {
  console.log(i);
}

let j = 1;
while (j <= 5) {
  console.log(j);
  j++;
}
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. **if**문과 **switch**문의 차이점은?  
2. **while**과 **do...while**의 실행 순서 차이는?  
3. **for**문에서 초기값, 조건식, 증감식의 역할은?
 
 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (6)
**유용한 내장 함수**     
→ **parseInt**, **parseFloat**, **isNaN**, **Date**, **Math** 등

---
<!-- _class: aqua -->

### 🧰 유용한 내장 함수  
- **parseInt()**, **parseFloat()**: 문자열 → 숫자  
- **isNaN()**: 숫자인지 확인  
- **Math**: 수학 관련 함수 모음  

---
<!-- _class: aqua -->

### 📅 날짜 함수  
- **Date()**: 현재 날짜와 시간  
- **getFullYear()**, **getMonth()**, **getDate()**: 날짜 정보 추출  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
let num = "123.45";
console.log(parseInt(num)); // 123
console.log(parseFloat(num)); // 123.45
console.log(isNaN(num)); // false

let today = new Date();
console.log(today.getFullYear());
console.log(today.getMonth() + 1);
console.log(today.getDate());
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. **parseInt()** 와 **parseFloat()** 의 차이점은?  
2. **isNaN()** 의 반환값은 어떤 의미인가요?  
3. **Date()** 객체에서 월을 가져올 때 왜 +1을 하나요?

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (7)
1. **배열과 객체의 활용**     
→ **배열 메서드**, **객체 속성**, **메서드 정의**  
2. **배열과 객체 심화**     
→ **배열 반복**, **객체 순회**, **고급 활용**

---
<!-- _class: aqua -->

### 📚 배열  
- 여러 값을 하나의 변수에 저장  
- **push()**, **pop()**, **length** 등 메서드 사용  

---
<!-- _class: aqua -->

### 🧱 객체  
- **{ key: value }** 형태  
- 속성 접근: **obj.key** 또는 **obj["key"]**  
- 메서드 정의 가능  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
let fruits = ["apple", "banana", "cherry"];
fruits.push("orange");
console.log(fruits.length); // 4

let person = {
  name: "Sally",
  age: 25,
  greet: function() {
    console.log("Hello!");
  }
};
console.log(person.name);
person.greet();
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. 배열과 객체의 차이점은?  
2. **push()** 와 **pop()** 의 기능은?  
3. 객체에서 메서드를 정의하는 방법은?

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (10) 
**ES6 문법과 최신 기능**     
→ **let/const**, **화살 함수**, **템플릿 문자열**, **구조 분해** 등

---
<!-- _class: aqua -->

### ✨ ES6 주요 문법  
- **let**, **const**: 블록 범위 변수 선언  
- 화살 함수 **()=>{}**  
- 템플릿 문자열 **${}**

---
<!-- _class: aqua -->

### 📦 구조 분해 할당  
- 배열이나 객체의 값을 변수로 쉽게 추출  
- **...rest**: 나머지 요소 수집  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
const name = "Sally";
const age = 25;
console.log(`이름은 ${name}, 나이는 ${age}입니다.`);

const add = (a, b) => a + b;

const [x, y, ...rest] = [1, 2, 3, 4, 5];
console.log(x, y); // 1 2
console.log(rest); // [3, 4, 5]
</pre>

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---
<!-- _class: aqua -->

1. **let**과 **const**의 차이점은?  
2. 화살 함수의 특징은?  
3. 템플릿 문자열의 장점은?  
4. 구조 분해 할당의 활용 예시는?
 


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>

 