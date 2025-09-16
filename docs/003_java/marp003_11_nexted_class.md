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
  📍 <strong>현재 위치:</strong> Chapter 11 · <em>다양한 클래스 · 내부 클래스(inner class)</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">클래스 안에 또 다른 클래스가 있다?</span><br>
  <span class="fragment" style="color:#495057;">내부 클래스를 활용하면 더 구조적이고 응집력 있는 코드를 만들 수 있어요</span>
</blockquote>

---
<!-- _class: cover-java -->
<h2 style="font-size:1.6em; color:#555;">📚 Java 기초 트랙 목차</h2>

<div class="track-outline">
  <span>▶ Chapter 7: 객체지향 프로그래밍(OOP)</span>
  <span>▶ Chapter 8: static, final, modifier</span>
  <span>▶ Chapter 9: class arr , extends</span>
  <span>▶ Chapter 10: polymorphism (abstract, interface)</span>
  <span class="current-chapter">✅▶ Chapter 11: 다양한 클래스(inner class)</span> 
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  자바에서는 클래스 안에 또 다른 클래스를 정의할 수 있습니다. 내부 클래스(inner class)는 외부 클래스와 밀접한 관계를 가지며, 캡슐화와 논리적 구조를 강화하는 데 유용합니다. 익명 클래스, 지역 클래스 등 다양한 형태의 클래스를 배우며 자바의 유연한 설계 방식을 익혀보세요.
</p>


---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (1)
# 내부클래스? 





---
<!-- _class: aqua -->
<img src="./chapter11/001.png" alt="method 001" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/002.png" alt="method 002" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/003.png" alt="method 003" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/004.png" alt="method 004" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/005.png" alt="method 005" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/006.png" alt="method 006" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/007.png" alt="method 007" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/008.png" alt="method 008" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/009.png" alt="method 009" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/010.png" alt="method 010" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/011.png" alt="method 011" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/012.png" alt="method 012" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/013.png" alt="method 013" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/014.png" alt="method 014" width="100%" />


---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

  
 



---
<!-- _class: aqua -->
<img src="./chapter11/015.png" alt="method 015" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/016.png" alt="method 016" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/017.png" alt="method 017" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/018.png" alt="method 018" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/019.png" alt="method 019" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/020.png" alt="method 020" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 



---
<!-- _class: aqua -->
<img src="./chapter11/021.png" alt="method 021" width="100%" />



---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 

---
<!-- _class: aqua -->
<img src="./chapter11/022.png" alt="method 022" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/023.png" alt="method 023" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/024.png" alt="method 024" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/025.png" alt="method 025" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/026.png" alt="method 026" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/027.png" alt="method 027" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/028.png" alt="method 028" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/029.png" alt="method 029" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/030.png" alt="method 030" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/031.png" alt="method 031" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/032.png" alt="method 032" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 
---
<!-- _class: aqua -->
<img src="./chapter11/033.png" alt="method 033" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/034.png" alt="method 034" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/035.png" alt="method 035" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/036.png" alt="method 036" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/037.png" alt="method 037" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/038.png" alt="method 038" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/039.png" alt="method 039" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/040.png" alt="method 040" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/041.png" alt="method 041" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/042.png" alt="method 042" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/043.png" alt="method 043" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/044.png" alt="method 044" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/045.png" alt="method 045" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/046.png" alt="method 046" width="100%" />




---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (2)
# 익명클래스? 



---
<!-- _class: aqua -->
<img src="./chapter11/047.png" alt="method 047" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/048.png" alt="method 048" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/049.png" alt="method 049" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/050.png" alt="method 050" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/051.png" alt="method 051" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/052.png" alt="method 052" width="100%" />



---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 
---
<!-- _class: aqua -->
<img src="./chapter11/053.png" alt="method 053" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/054.png" alt="method 054" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/055.png" alt="method 055" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/056.png" alt="method 056" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/057.png" alt="method 057" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/058.png" alt="method 058" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/059.png" alt="method 059" width="100%" />




---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter11/060.png" alt="method 060" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/061.png" alt="method 061" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/062.png" alt="method 062" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/063.png" alt="method 063" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/064.png" alt="method 064" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/065.png" alt="method 065" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/066.png" alt="method 066" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/067.png" alt="method 067" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/068.png" alt="method 068" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/069.png" alt="method 069" width="100%" />


---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (3)
# 예외처리? 




---
<!-- _class: aqua -->
<img src="./chapter11/070.png" alt="method 070" width="100%" />

 


---
<!-- _class: aqua -->
<img src="./chapter11/071.png" alt="method 071" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/072.png" alt="method 072" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/073.png" alt="method 073" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/074.png" alt="method 074" width="100%" />



---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 
 

---
<!-- _class: aqua -->
<img src="./chapter11/075.png" alt="method 075" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/076.png" alt="method 076" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/077.png" alt="method 077" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/078.png" alt="method 078" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/079.png" alt="method 079" width="100%" />


 

---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter11/080.png" alt="method 080" width="100%" />


---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 


---
<!-- _class: aqua -->
<img src="./chapter11/081.png" alt="method 081" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/082.png" alt="method 082" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 
---
<!-- _class: aqua -->
<img src="./chapter11/083.png" alt="method 083" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/084.png" alt="method 084" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/085.png" alt="method 085" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/086.png" alt="method 086" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/087.png" alt="method 087" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/088.png" alt="method 088" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter11/089.png" alt="method 089" width="100%" />

 

---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다! 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>
 