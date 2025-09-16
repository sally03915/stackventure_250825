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
<!-- _class: purple -->
# 💡 Step 4: 사고 확장 (2)

---

<!-- _class: aqua -->
<img src="./chapter2-2/031.png" alt="형변환(31)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/032.png" alt="형변환(32)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/033.png" alt="형변환(33)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/034.png" alt="형변환(34)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/035.png" alt="형변환(35)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/036.png" alt="형변환(36)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/037.png" alt="형변환(37)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/038.png" alt="형변환(38)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/039.png" alt="형변환(39)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/040.png" alt="형변환(40)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/041.png" alt="형변환(41)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/042.png" alt="형변환(42)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/043.png" alt="형변환(43)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/044.png" alt="형변환(44)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/045.png" alt="형변환(45)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/046.png" alt="형변환(46)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/047.png" alt="형변환(47)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/048.png" alt="형변환(48)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/049.png" alt="형변환(49)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/050.png" alt="형변환(50)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/051.png" alt="형변환(51)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/052.png" alt="형변환(52)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/053.png" alt="형변환(53)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/054.png" alt="형변환(54)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/055.png" alt="형변환(55)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/056.png" alt="형변환(56)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/057.png" alt="형변환(57)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/058.png" alt="형변환(58)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/059.png" alt="형변환(59)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/060.png" alt="형변환(60)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/061.png" alt="형변환(61)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/062.png" alt="형변환(62)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/063.png" alt="형변환(63)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/064.png" alt="형변환(64)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/065.png" alt="형변환(65)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/066.png" alt="형변환(66)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/067.png" alt="형변환(67)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/068.png" alt="형변환(68)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/069.png" alt="형변환(69)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/070.png" alt="형변환(70)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/071.png" alt="형변환(71)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/072.png" alt="형변환(72)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/073.png" alt="형변환(73)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/074.png" alt="형변환(74)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/075.png" alt="형변환(75)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/076.png" alt="형변환(76)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/077.png" alt="형변환(77)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/078.png" alt="형변환(78)" width="100%" />

---

<!-- _class: aqua -->
<img src="./chapter2-2/079.png" alt="형변환(79)" width="100%" />


---
<!-- _class: thanks -->
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">이제 변수, 자료형, 입력까지 실전 감각으로 익혔어요</span>  
> <span class="fragment">다음은 연산자와 제어문으로 더 깊이 들어가볼까요?</span>  
> <span class="fragment">실력은 반복과 실습에서 만들어집니다. 계속 함께 가요!</span>