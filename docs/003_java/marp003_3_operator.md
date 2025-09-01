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
  📍 <strong>현재 위치:</strong> Chapter 3 · <em>연산자</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">자바의 연산자, 계산의 핵심</span><br>
  <span class="fragment" style="color:#495057;">산술부터 논리까지, 다양한 연산을 실습으로 익혀요</span>
</blockquote>

---
<!-- _class: cover-java --><h2 style="font-size:1.6em; color:#555;">📚 Java 기초 트랙 목차</h2>

<div class="track-outline">
  <span>▶ Chapter 1: 자바란? · 개발 환경 · 출력</span>
  <span>▶ Chapter 2: 변수 · 자료형 · 입력</span>
  <span class="current-chapter">✅▶ Chapter 3: 연산자</span>
  <span>▶ Chapter 4: 제어문</span>
  <span>▶ Chapter 5: 배열</span>
  <span>▶ Chapter 6: 메서드</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 자바의 기초 개념을<br/> 실습 중심으로 배우며, 이후 객체지향과 심화 개념으로 확장됩니다.
</p>

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념

---
<!-- _class: aqua -->
<img src="./chapter3/001.png" alt="연산자 요약 001" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/002.png" alt="연산자 요약 002" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/003.png" alt="연산자 요약 003" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/004.png" alt="연산자 요약 004" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/005.png" alt="연산자 요약 005" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/006.png" alt="연산자 요약 006" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/007.png" alt="연산자 요약 007" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/008.png" alt="연산자 요약 008" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/009.png" alt="연산자 요약 009" width="100%" />


---
<!-- _class: aqua -->
## 🧩 Step 1: 핵심 개념 요약 (1/2)

| 항목         | 설명                                                       |
|--------------|------------------------------------------------------------|
| 산술 연산자   | 덧셈, 뺄셈, 곱셈, 나눗셈 등 수학적 계산 (+, -, *, /, %) |
| 비교 연산자   | 두 값을 비교하여 참/거짓 반환 (==, !=, >, < 등)     |
| 논리 연산자   | 조건을 조합하거나 반전 (&&, ||, !)                   |

---
<!-- _class: aqua -->
## 🧩 Step 1: 핵심 개념 요약 (2/2)

| 항목         | 설명                                                       |
|--------------|------------------------------------------------------------|
| 우선순위     | 연산자마다 계산 순서가 달라요 (*가 +보다 먼저 계산됨)     |
| 괄호 사용     | 우선순위를 명확히 하기 위해 괄호로 묶어 계산 순서를 지정해요   |
| 예시         | (a + b) * c → 괄호 먼저 계산 후 곱셈 수행                   |

> <span class="fragment">이제 자바의 다양한 연산자 개념을 이해했어요. 다음은 실습으로 직접 사용해볼게요!</span>

---
<!-- _class: aqua -->
## 개념 1: 산술 연산자

- ➕ 덧셈: a + b  
- ➖ 뺄셈: a - b  
- ✖️ 곱셈: a * b  
- ➗ 나눗셈: a / b  
- 🧮 나머지: a % b → 나눗셈 후 나머지 값

---
<!-- _class: aqua -->
## 개념 2: 비교 연산자

- 🔍 두 값이 같은지 비교: ==  
- ❌ 같지 않음: !=  
- 🔼 크다/작다 비교: >, <, >=, <=  
- 🧠 결과는 항상 true 또는 false

---
<!-- _class: aqua -->
## 개념 3: 논리 연산자

- ✅ AND 조건: && → 둘 다 참일 때만 참  
- 🔀 OR 조건: || → 하나라도 참이면 참  
- 🔄 NOT 조건: ! → 참을 거짓으로, 거짓을 참으로 반전



---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->
<img src="./chapter3/010.png" alt="연산자 요약 010" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/011.png" alt="연산자 요약 011" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/012.png" alt="연산자 요약 012" width="100%" />



---
<!-- _class: green -->
# 🛠️ Step 3: 실습 과제 (3)

---
<!-- _class: aqua -->
<img src="./chapter3/013.png" alt="연산자 요약 013" width="100%" />


---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제


---
<!-- _class: aqua -->
<img src="./chapter3/014.png" alt="연산자 요약 014" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/015.png" alt="연산자 요약 015" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/016.png" alt="연산자 요약 016" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/017.png" alt="연산자 요약 017" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/018.png" alt="연산자 요약 018" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/019.png" alt="연산자 요약 019" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/020.png" alt="연산자 요약 020" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/021.png" alt="연산자 요약 021" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/022.png" alt="연산자 요약 022" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/023.png" alt="연산자 요약 023" width="100%" />



---
<!-- _class: green -->
# 🛠️ Step 3: 실습 과제 (3)


---
<!-- _class: aqua -->
<img src="./chapter3/024.png" alt="연산자 요약 024" width="100%" />



---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제


---
<!-- _class: aqua -->
<img src="./chapter3/025.png" alt="연산자 요약 025" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/026.png" alt="연산자 요약 026" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/027.png" alt="연산자 요약 027" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/028.png" alt="연산자 요약 028" width="100%" />


---
<!-- _class: green -->
# 🛠️ Step 3: 실습 과제 (3)


---
<!-- _class: aqua -->
<img src="./chapter3/029.png" alt="연산자 요약 029" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/030.png" alt="연산자 요약 030" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/031.png" alt="연산자 요약 031" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/032.png" alt="연산자 요약 032" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/033.png" alt="연산자 요약 033" width="100%" />




---
<!-- _class: green -->
# 🛠️ Step 3: 실습 과제 (3)


---
<!-- _class: aqua -->
<img src="./chapter3/034.png" alt="연산자 요약 034" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/035.png" alt="연산자 요약 035" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/036.png" alt="연산자 요약 036" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/037.png" alt="연산자 요약 037" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/038.png" alt="연산자 요약 038" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/039.png" alt="연산자 요약 039" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/040.png" alt="연산자 요약 040" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/041.png" alt="연산자 요약 041" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/042.png" alt="연산자 요약 042" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/043.png" alt="연산자 요약 043" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/044.png" alt="연산자 요약 044" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/045.png" alt="연산자 요약 045" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/046.png" alt="연산자 요약 046" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/047.png" alt="연산자 요약 047" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/048.png" alt="연산자 요약 048" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/049.png" alt="연산자 요약 049" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/050.png" alt="연산자 요약 050" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/051.png" alt="연산자 요약 051" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/052.png" alt="연산자 요약 052" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/053.png" alt="연산자 요약 053" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/054.png" alt="연산자 요약 054" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/055.png" alt="연산자 요약 055" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/056.png" alt="연산자 요약 056" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/057.png" alt="연산자 요약 057" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/058.png" alt="연산자 요약 058" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/059.png" alt="연산자 요약 059" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/060.png" alt="연산자 요약 060" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/061.png" alt="연산자 요약 061" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/062.png" alt="연산자 요약 062" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/063.png" alt="연산자 요약 063" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/064.png" alt="연산자 요약 064" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/065.png" alt="연산자 요약 065" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/066.png" alt="연산자 요약 066" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/067.png" alt="연산자 요약 067" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/068.png" alt="연산자 요약 068" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/069.png" alt="연산자 요약 069" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/070.png" alt="연산자 요약 070" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/071.png" alt="연산자 요약 071" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter3/072.png" alt="연산자 요약 072" width="100%" />




---
<!-- _class: purple -->
# 💡 Step 4: 사고 확장

---
<!-- _class: aqua -->
## 💡 사고 질문: 연산자가 없다면?

---
<!-- _class: aqua -->
### 🤔 질문 1  
조건 판단 없이 프로그램이 가능할까요?

> <span class="fragment">조건문과 반복문은 연산자 없이는 작동할 수 없어요!</span>

---
<!-- _class: aqua -->
### 🧠 질문 2  
논리 연산자는 어디에 쓰일까요?

> <span class="fragment">복잡한 조건을 조합할 때 꼭 필요해요. 예: 로그인 조건 검사</span>

---
<!-- _class: red -->
# 🧠 Step 5: 기억 테스트

---
<!-- _class: aqua -->
## 퀴즈 1  나머지를 구하는 연산자는?

- <span class="fragment">A. /</span>  
- <span class="fragment">✅ B. %</span>  
- <span class="fragment">C. *</span>

---
<!-- _class: aqua -->
## 퀴즈 2  논리 AND 연산자는?

- <span class="fragment">A. ||</span>  
- <span class="fragment">✅ B. &&</span>  
- <span class="fragment">C. !</span>

---
<!-- _class: thanks -->
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">이제 자바의 연산자 개념까지 완벽하게 이해했어요</span>  
> <span class="fragment">다음은 제어문으로 흐름을 제어하는 방법을 배워볼까요?</span>  
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>

 
 
---
<!-- _class: aqua -->
<img src="./chapter3/073.png" alt="연산자 요약 073" width="100%" />

