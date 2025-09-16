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
<!-- _class: cover-java -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 01
</h4>
<h1 style="color:#007BFF;">Java Essentials for Beginners</h1>
<h3 style="color:#17A2B8;">기초부터 객체지향까지, 자바의 모든 것</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 2 · <em>변수 · 자료형 · 입력</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">자바의 데이터를 다루는 첫걸음</span><br>
  <span class="fragment" style="color:#495057;">변수 선언부터 사용자 입력까지, 실습으로 익혀요</span>
</blockquote>

---
<!-- _class: cover-java --><h2 style="font-size:1.6em; color:#555;">📚 Java 기초 트랙 목차</h2>

<div class="track-outline">
  <span>▶ Chapter 1: 자바란? · 개발 환경 · 출력</span>
  <span class="current-chapter">✅▶ Chapter 2: 변수 · 자료형 · 입력</span>
  <span>▶ Chapter 3: 연산자</span>
  <span>▶ Chapter 4: 제어문</span>
  <span>▶ Chapter 5: 배열</span>
  <span>▶ Chapter 6: 메서드</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 자바의 기초 개념을<br/> 실습 중심으로 배우며, 이후 객체지향과 심화 개념으로 확장됩니다.
</p>



---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 - 변수
---
<!-- _class: aqua --> 
<img src="./chapter2-1/004.png" alt="변수 개념 7번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/007.png" alt="변수 개념 7번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/008.png" alt="변수 개념 8번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/009.png" alt="변수 개념 9번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/010.png" alt="변수 개념 10번" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter2-1/011.png" alt="변수 개념 11번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/012.png" alt="변수 개념 12번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/013.png" alt="변수 개념 13번" width="100%" />

---
<!-- _class: aqua -->
## 🧩 Step 1: 핵심 개념 요약 (1/2)

| 항목     | 설명                                                   |
|----------|--------------------------------------------------------|
| 변수     | 데이터를 저장하는 공간, 이름을 붙여 관리함             |
| 자료형   | 변수에 저장할 수 있는 데이터의 종류 <br/>(int, double 등)   |
| 선언     | 자료형 + 변수명으로 선언 (예: int age;)              |

---
<!-- _class: aqua -->
## 🧩 Step 1: 핵심 개념 요약 (2/2)

| 항목     | 설명                                                   |
|----------|--------------------------------------------------------|
| 초기화   | 변수에 값을 처음 넣는 것 <br/> (예: int age = 25;)         |
| 입력     | Scanner 클래스를 사용하여  <br/> 사용자로부터 값 받기       |
| 예시     | Scanner sc = new Scanner(System.in);                 |

> <span class="fragment">이제 변수와 자료형, 입력 방식까지 이해했어요.  <br/> 다음은 각 개념을 하나씩 실습해볼게요!</span>

---
<!-- _class: aqua -->
## 개념 1: 변수란?

- 📦 변수는 데이터를 저장하는 **이름 있는 공간**이에요  
- 🧠 변수명을 통해 값을 쉽게 기억하고 재사용할 수 있어요  
- 📝 선언 예시: int score; → 정수형 변수 선언  
- 🔄 값을 넣을 땐 score = 100;처럼 대입해요  
- 💡 변수는 **자료형에 따라 저장 방식이 달라져요**



---
<!-- _class: blue -->
# 🧪 Step 1-2: 코드 예제

---
<!-- _class: aqua --> 
<img src="./chapter2-1/014.png" alt="변수 개념 13번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/015.png" alt="변수 개념 12번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/016.png" alt="변수 개념 13번" width="100%" />



---
<!-- _class: green -->
# 🧪 Step 1-3: 코드 예제

---
<!-- _class: aqua --> 
<img src="./chapter2-1/018.png" alt="변수 개념 13번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/019.png" alt="변수 19번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/020.png" alt="변수 20번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/021.png" alt="변수 21번" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/022.png" alt="변수 22번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/023.png" alt="변수 23번" width="100%" />



---
<!-- _class: orange -->
# 🧩 Step 2: 핵심 개념 - 자료형

---
<!-- _class: aqua --> 
<img src="./chapter2-1/024.png" alt="변수 개념 13번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/025.png" alt="변수 20번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/026.png" alt="변수 21번" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/027.png" alt="변수 22번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/028.png" alt="변수 23번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/029.png" alt="변수 23번" width="100%" />

---
<!-- _class: aqua -->
## 개념 2: 자료형

- 🔢 기본 자료형: int, double, char, boolean 등  
- 📐 int는 정수, double은 실수, char는 문자 하나  
- ✅ boolean은 참/거짓을 저장 (true, false)  
- 🧮 자료형에 따라 메모리 크기와 연산 방식이 달라져요  
- 🧵 문자열은 String이라는 클래스 자료형으로 다뤄요



---
<!-- _class: blue -->
# 🧪 Step 2-2: 코드 예제


---
<!-- _class: aqua --> 
<img src="./chapter2-1/030.png" alt="자료형 30 번" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/017.png" alt="자료형 개념 12번" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/031.png" alt="변수 개념 12번" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/032.png" alt="변수 개념 12번" width="100%" />

---
<!-- _class: green -->
# 🧪 Step 2-3: 과제 도전
---
<!-- _class: aqua --> 
<img src="./chapter2-1/033.png" alt="변수 33번" width="100%" />


---
<!-- _class: orange -->
# 🧩 Step 3: 핵심 개념 - 입력
---
<!-- _class: aqua --> 
<img src="./chapter2-1/034.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/035.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua -->
## 개념 3: 입력

- 🎯 사용자 입력을 받기 위해 Scanner 클래스를 사용해요  
- 📥 예시: Scanner sc = new Scanner(System.in);  
- 🧾 입력 받기: int age = sc.nextInt();  
- 🗣️ 문자열 입력: String name = sc.nextLine();  
- 🛡️ 입력 전에 import java.util.Scanner; 선언 필요

---
<!-- _class: blue -->
# 🧪 Step 3-2: 코드 예제

---
<!-- _class: aqua --> 
<img src="./chapter2-1/036.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/037.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/038.png" alt="변수 scanner" width="100%" />


---
<!-- _class: green -->
# 🛠️ Step 3-3: 실습 과제 (3)
---
<!-- _class: aqua --> 
<img src="./chapter2-1/039.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/040.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/041.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/042.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/043.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/044.png" alt="변수 scanner" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/045.png" alt="변수 scanner" width="100%" />


---
<!-- _class: orange -->
# 🧩 Step 4: 핵심 개념 - <br/>형변환(1)
---
<!-- _class: aqua --> 
<img src="./chapter2-1/046.png" alt="형변환(1)" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-1/047.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/048.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/049.png" alt="형변환(1)" width="100%" />

---

<!-- _class: aqua -->
## 개념 3: 자동 타입 형변환 (1/4)

- 🔄 자바는 서로 호환되는 타입끼리는 자동으로 변환해줘요  
- 🧠 예: 작은 타입 → 큰 타입으로 자동 변환됨  
- 📥 예시: **int num = 10;** → **double d = num;**  
- ✅ 결과: **num**은 **double**로 자동 변환되어 **d**에 저장돼요  
- 🚫 반대는 안 돼요! 큰 타입 → 작은 타입은 자동 변환 ❌  
  → 예: **double d = 3.14;** → **int num = d;** ← 오류 발생  
- 🛠️ 이런 경우엔 강제 형변환(casting)을 써야 해요  
  → 예: **int num = (int) d;**

---
<!-- _class: aqua -->
## 개념 4: 강제 타입 형변환 (2/4)

- 🧪 자동 변환이 안 되는 경우,직접 타입을 바꿔줘야 해요  
- 🛠️ 방법: (변환할 타입) 변수  
  → 예시: **double d = 3.14;** → **int num = (int) d;**  
- 🔍 결과: 소수점 아래는 잘리고 정수만 남아요 <br/> (**num = 3**)  
- ⚠️ 주의: 데이터 손실이 생길 수 있어요!  
  → 예: **int x = (int) 1234567890123L;**  
- 📦 주로 큰 타입 → 작은 타입으로 변환할 때 사용해요  
  → **double → int**, **long → int** 등

---
<!-- _class: aqua --> 
## 🧠 개념 3: 자동 타입 형변환과 입력 (3/4)
- 🛠️ 자바에서 **Scanner** 클래스를 사용하면 <br/> 사용자의 입력을 받을 수 있어요.
- 📥  **Scanner sc = new Scanner(System.in);** <br/> 이렇게 작성하면 키보드 입력을 받을 준비가 돼요.
- 🔢 사용자가 숫자를 입력하면 **sc.nextInt()** 로 받아오고, 이 값은 자동으로 **int** 타입으로 변환돼요.  
  → 예시: **int age = sc.nextInt();**  

---
<!-- _class: aqua --> 
## 🧠 개념 3: 자동 타입 형변환과 입력
-  → 예시: **int age = sc.nextInt();**  
- 💬 문자열을 입력하면 **sc.nextLine()** 을 사용해서 **String** 타입으로 자동 변환돼요.  
  → 예시: **String name = sc.nextLine();**
- 📦 이 모든 기능을 사용하려면 먼저 **import java.util.Scanner;** 를 선언해야 해요.


---
<!-- _class: blue -->
# 🧪 Step 3-2: 코드 예제


---
<!-- _class: aqua --> 
<img src="./chapter2-1/050.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/051.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/052.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/053.png" alt="형변환(1)" width="100%" />




---
<!-- _class: green -->
# 🛠️ Step 3-3: 실습 과제 (3)

---
<!-- _class: aqua --> 
<img src="./chapter2-1/054.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/055.png" alt="형변환(1)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-1/056.png" alt="형변환(1)" width="100%" />


---
<!-- _class: orange -->
# 🧩 Step 5: 핵심 개념 - <br/>형변환(2)
---
<!-- _class: aqua --> 
<img src="./chapter2-2/011.png" alt="형변환(2)" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-2/012.png" alt="형변환(2)" width="100%" />



---
<!-- _class: blue -->
# 🧪 Step 5-2: 코드 예제

---
<!-- _class: aqua --> 
<img src="./chapter2-2/013.png" alt="형변환(2)" width="100%" />

---
<!-- _class: aqua --> 
<img src="./chapter2-2/014.png" alt="형변환(2)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-2/015.png" alt="형변환(2)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-2/016.png" alt="형변환(2)" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter2-2/017.png" alt="형변환(2)" width="100%" />



---

<!-- _class: aqua -->
<img src="./chapter2-2/018.png" alt="형변환(18)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/019.png" alt="형변환(19)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/020.png" alt="형변환(20)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/021.png" alt="형변환(21)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/022.png" alt="형변환(22)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/023.png" alt="형변환(23)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/024.png" alt="형변환(24)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/025.png" alt="형변환(25)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/026.png" alt="형변환(26)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/027.png" alt="형변환(27)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/028.png" alt="형변환(28)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/029.png" alt="형변환(29)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/030.png" alt="형변환(30)" width="100%" />


---
<!-- _class: purple -->
# 💡 Step 4: 사고 확장

---
<!-- _class: aqua -->
## 💡 사고 질문: 변수와 입력은 왜 중요한가요?

---
<!-- _class: aqua -->
### 🤔 질문 1  
사용자 입력이 없다면 프로그램은 어떻게 작동할까요?

> <span class="fragment">입력이 없다면 프로그램은 고정된 값만 처리할 수 있어요. 입력은 사용자와의 소통 창구예요!</span>

---
<!-- _class: aqua -->
### 🧠 질문 2  
자료형을 잘못 쓰면 어떤 문제가 생길까요?

> <span class="fragment">잘못된 자료형은 오류를 발생시키거나, 의도한 결과를 얻지 못하게 만들어요. 자료형은 정확성이 핵심이에요!</span>

---
<!-- _class: red -->
# 🧠 Step 5: 기억 테스트

---
<!-- _class: aqua -->
## 퀴즈 1  사용자 입력을 받기 위한 클래스는?

- <span class="fragment">A. InputReader</span>  
- <span class="fragment">✅ B. Scanner</span>  
- <span class="fragment">C. Console</span>

---
<!-- _class: aqua -->
## 퀴즈 2  다음 중 정수형 자료형은?

- <span class="fragment">✅ A. int</span>  
- <span class="fragment">B. double</span>  
- <span class="fragment">C. String</span>

---
<!-- _class: aqua -->
## 퀴즈 3  문자열을 입력받는 메서드는?

- <span class="fragment">A. sc.nextInt()</span>  
- <span class="fragment">✅ B. sc.nextLine()</span>  
- <span class="fragment">C. sc.read()</span>

---
<!-- _class: thanks -->
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">이제 변수, 자료형, 입력까지 실전 감각으로 익혔어요</span>  
> <span class="fragment">다음은 연산자와 제어문으로 더 깊이 들어가볼까요?</span>  
> <span class="fragment">실력은 반복과 실습에서 만들어집니다. 계속 함께 가요!</span>