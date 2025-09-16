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
  📍 <strong>현재 위치:</strong> Chapter 12 · <em>멀티스레딩과 병렬 처리(Thread)</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">하나의 프로그램에서 여러 작업을 동시에 처리할 수 있을까?</span><br>
  <span class="fragment" style="color:#495057;">자바의 스레드(Thread)를 활용하면 병렬 처리와 동시성 프로그래밍이 가능해져요</span>
</blockquote>

---
<!-- _class: cover-java -->
<h2 style="font-size:1.6em; color:#555;">📚 Java 기초 트랙 목차</h2>

<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 12: Thread </span>
  <span>▶ Chapter 13: Collection framework</span>
  <span>▶ Chapter 14: Lambda + Stream</span>
  <span>▶ Chapter 15: JAVA IO</span>
  <span>▶ Chapter 16: NETWORK</span> 
</div>

<p style="margin-top:30px; font-size:11px; color:#888;">
  자바에서 스레드는 프로그램의 흐름을 동시에 여러 개 실행할 수 있게 해주는 강력한 기능입니다. 
</p>

---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (1)
# Thread? 






---
<!-- _class: aqua -->
<img src="./chapter12-1/001.png" alt="thread 001" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/002.png" alt="thread 002" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/003.png" alt="thread 003" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/004.png" alt="thread 004" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/005.png" alt="thread 005" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/006.png" alt="thread 006" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/007.png" alt="thread 007" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/008.png" alt="thread 008" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/009.png" alt="thread 009" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/010.png" alt="thread 010" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/011.png" alt="thread 011" width="100%" />


---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제



---
<!-- _class: aqua -->
<img src="./chapter12-1/012.png" alt="thread 012" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/013.png" alt="thread 013" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/014.png" alt="thread 014" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/015.png" alt="thread 015" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/016.png" alt="thread 016" width="100%" />

 

---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter12-1/017.png" alt="thread 017" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/018.png" alt="thread 018" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/019.png" alt="thread 019" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/020.png" alt="thread 020" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/021.png" alt="thread 021" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/022.png" alt="thread 022" width="100%" />


---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (2)
# Thread 속성? 




---
<!-- _class: aqua -->
<img src="./chapter12-1/023.png" alt="thread 023" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/024.png" alt="thread 024" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/025.png" alt="thread 025" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/026.png" alt="thread 026" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/027.png" alt="thread 027" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/028.png" alt="thread 028" width="100%" />

---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제


---
<!-- _class: aqua -->
<img src="./chapter12-1/029.png" alt="thread 029" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/030.png" alt="thread 030" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/031.png" alt="thread 031" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/032.png" alt="thread 032" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/033.png" alt="thread 033" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/034.png" alt="thread 034" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/035.png" alt="thread 035" width="100%" />


 

---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 



---
<!-- _class: aqua -->
<img src="./chapter12-1/036.png" alt="thread 036" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/037.png" alt="thread 037" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/038.png" alt="thread 038" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/039.png" alt="thread 039" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/040.png" alt="thread 040" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/041.png" alt="thread 041" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/042.png" alt="thread 042" width="100%" />

---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (3)
# 공유객체 





---
<!-- _class: aqua -->
<img src="./chapter12-1/043.png" alt="thread 043" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/044.png" alt="thread 044" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/045.png" alt="thread 045" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/046.png" alt="thread 046" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/047.png" alt="thread 047" width="100%" />

---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 
 

---
<!-- _class: aqua -->
<img src="./chapter12-1/048.png" alt="thread 048" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/049.png" alt="thread 049" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/050.png" alt="thread 050" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/051.png" alt="thread 051" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/052.png" alt="thread 052" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/053.png" alt="thread 053" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/054.png" alt="thread 054" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/055.png" alt="thread 055" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/056.png" alt="thread 056" width="100%" />

 
 
---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter12-1/057.png" alt="thread 057" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/058.png" alt="thread 058" width="100%" />

---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 

---
<!-- _class: aqua -->
<img src="./chapter12-1/059.png" alt="thread 059" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/060.png" alt="thread 060" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/061.png" alt="thread 061" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/062.png" alt="thread 062" width="100%" />


 
---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 
---
<!-- _class: aqua -->
<img src="./chapter12-1/063.png" alt="thread 063" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/064.png" alt="thread 064" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/065.png" alt="thread 065" width="100%" />

 


---
<!-- _class: aqua -->
<img src="./chapter12-1/066.png" alt="thread 066" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-1/067.png" alt="thread 067" width="100%" />


 

---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (4)
# State

 


---
<!-- _class: aqua -->
<img src="./chapter12-2/001.png" alt="thread 001" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/002.png" alt="thread 002" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/003.png" alt="thread 003" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/004.png" alt="thread 004" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/005.png" alt="thread 005" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/006.png" alt="thread 006" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/007.png" alt="thread 007" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/008.png" alt="thread 008" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/009.png" alt="thread 009" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/010.png" alt="thread 010" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/011.png" alt="thread 011" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/012.png" alt="thread 012" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/013.png" alt="thread 013" width="100%" />




---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 
---
<!-- _class: aqua -->
<img src="./chapter12-2/014.png" alt="thread 014" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/015.png" alt="thread 015" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/016.png" alt="thread 016" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/017.png" alt="thread 017" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/018.png" alt="thread 018" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/019.png" alt="thread 019" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/020.png" alt="thread 020" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/021.png" alt="thread 021" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/022.png" alt="thread 022" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/023.png" alt="thread 023" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/024.png" alt="thread 024" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/025.png" alt="thread 025" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/026.png" alt="thread 026" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/027.png" alt="thread 027" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/028.png" alt="thread 028" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/029.png" alt="thread 029" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/030.png" alt="thread 030" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/031.png" alt="thread 031" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/032.png" alt="thread 032" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 


---
<!-- _class: aqua -->
<img src="./chapter12-2/033.png" alt="thread 033" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/034.png" alt="thread 034" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/035.png" alt="thread 035" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/036.png" alt="thread 036" width="100%" />


---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 

---
<!-- _class: aqua -->
<img src="./chapter12-2/037.png" alt="thread 037" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/038.png" alt="thread 038" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/039.png" alt="thread 039" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter12-2/040.png" alt="thread 040" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/041.png" alt="thread 041" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/042.png" alt="thread 042" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/043.png" alt="thread 043" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/044.png" alt="thread 044" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/045.png" alt="thread 045" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/046.png" alt="thread 046" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/047.png" alt="thread 047" width="100%" />


---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (5)
# Thread Group


---
<!-- _class: aqua -->
<img src="./chapter12-2/048.png" alt="thread 048" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/049.png" alt="thread 049" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/050.png" alt="thread 050" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/051.png" alt="thread 051" width="100%" />



---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 

---
<!-- _class: aqua -->
<img src="./chapter12-2/052.png" alt="thread 052" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/053.png" alt="thread 053" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/054.png" alt="thread 054" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/055.png" alt="thread 055" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/056.png" alt="thread 056" width="100%" />


---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 



---
<!-- _class: aqua -->
<img src="./chapter12-2/057.png" alt="thread 057" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/058.png" alt="thread 058" width="100%" />



---
<!-- _class: orange -->  
# 🧩 Step 1: 핵심 개념 (6)
# Thread Pool




---
<!-- _class: aqua -->
<img src="./chapter12-2/059.png" alt="thread 059" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/060.png" alt="thread 060" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/061.png" alt="thread 061" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/062.png" alt="thread 062" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/063.png" alt="thread 063" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/064.png" alt="thread 064" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/065.png" alt="thread 065" width="100%" />


 
---  
<!-- _class: blue -->  
# 🧪 Step 2: 코드 예제

 


---
<!-- _class: aqua -->
<img src="./chapter12-2/066.png" alt="thread 066" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/067.png" alt="thread 067" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/068.png" alt="thread 068" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/069.png" alt="thread 069" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/070.png" alt="thread 070" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/071.png" alt="thread 071" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/072.png" alt="thread 072" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/073.png" alt="thread 073" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/074.png" alt="thread 074" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/075.png" alt="thread 075" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/076.png" alt="thread 076" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/077.png" alt="thread 077" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/078.png" alt="thread 078" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/079.png" alt="thread 079" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/080.png" alt="thread 080" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/081.png" alt="thread 081" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/082.png" alt="thread 082" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/083.png" alt="thread 083" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter12-2/084.png" alt="thread 084" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/085.png" alt="thread 085" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/086.png" alt="thread 086" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/087.png" alt="thread 087" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/088.png" alt="thread 088" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/089.png" alt="thread 089" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/090.png" alt="thread 090" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/091.png" alt="thread 091" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/092.png" alt="thread 092" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/093.png" alt="thread 093" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/094.png" alt="thread 094" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/095.png" alt="thread 095" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-2/096.png" alt="thread 096" width="100%" />



 
---
<!-- _class: purple -->  
# 🧩 Step 1: 핵심 개념 (7)
# 스레드정리


 
 



---
<!-- _class: aqua -->
<img src="./chapter12-3/001.png" alt="thread 001" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/002.png" alt="thread 002" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/003.png" alt="thread 003" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/004.png" alt="thread 004" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/005.png" alt="thread 005" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/006.png" alt="thread 006" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/007.png" alt="thread 007" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/008.png" alt="thread 008" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/009.png" alt="thread 009" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/010.png" alt="thread 010" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/011.png" alt="thread 011" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/012.png" alt="thread 012" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/013.png" alt="thread 013" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/014.png" alt="thread 014" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/015.png" alt="thread 015" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/016.png" alt="thread 016" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/017.png" alt="thread 017" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/018.png" alt="thread 018" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/019.png" alt="thread 019" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/020.png" alt="thread 020" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/021.png" alt="thread 021" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/022.png" alt="thread 022" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/023.png" alt="thread 023" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/024.png" alt="thread 024" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/025.png" alt="thread 025" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/026.png" alt="thread 026" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/027.png" alt="thread 027" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/028.png" alt="thread 028" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/029.png" alt="thread 029" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/030.png" alt="thread 030" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/031.png" alt="thread 031" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/032.png" alt="thread 032" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/033.png" alt="thread 033" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/034.png" alt="thread 034" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/035.png" alt="thread 035" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/036.png" alt="thread 036" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/037.png" alt="thread 037" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/038.png" alt="thread 038" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제
 

---
<!-- _class: aqua -->
<img src="./chapter12-3/039.png" alt="thread 039" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/040.png" alt="thread 040" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/041.png" alt="thread 041" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/042.png" alt="thread 042" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/043.png" alt="thread 043" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/044.png" alt="thread 044" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/045.png" alt="thread 045" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/046.png" alt="thread 046" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/047.png" alt="thread 047" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/048.png" alt="thread 048" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/049.png" alt="thread 049" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/050.png" alt="thread 050" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/051.png" alt="thread 051" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/052.png" alt="thread 052" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/053.png" alt="thread 053" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/054.png" alt="thread 054" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/055.png" alt="thread 055" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/056.png" alt="thread 056" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/057.png" alt="thread 057" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/058.png" alt="thread 058" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/059.png" alt="thread 059" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/060.png" alt="thread 060" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/061.png" alt="thread 061" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/062.png" alt="thread 062" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/063.png" alt="thread 063" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/064.png" alt="thread 064" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/065.png" alt="thread 065" width="100%" />


 



---
<!-- _class: aqua -->
<img src="./chapter12-3/066.png" alt="thread 066" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/067.png" alt="thread 067" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/068.png" alt="thread 068" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/069.png" alt="thread 069" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/070.png" alt="thread 070" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/071.png" alt="thread 071" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/072.png" alt="thread 072" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/073.png" alt="thread 073" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/074.png" alt="thread 074" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/075.png" alt="thread 075" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/076.png" alt="thread 076" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/077.png" alt="thread 077" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/078.png" alt="thread 078" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/079.png" alt="thread 079" width="100%" />



---
<!-- _class: aqua -->
<img src="./chapter12-3/080.png" alt="thread 080" width="100%" />



---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">이제 배열의 개념과 활용까지 완벽하게 이해했어요</span>  
> <span class="fragment">다음은 메서드로 넘어가볼까요?</span>  
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>
 