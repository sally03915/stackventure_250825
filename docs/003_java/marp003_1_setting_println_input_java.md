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
  📍 <strong>현재 위치:</strong> Chapter 1· <em>자바란? · 개발 환경 · 출력</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">쉽고 탄탄하게 배우는 자바 입문서</span><br>
  <span class="fragment" style="color:#495057;">실습 중심으로 개념을 꿰뚫고, 직접 코딩하며 성장해요</span>
</blockquote>
```


---
<!-- _class: cover-java -->
<h2 style="font-size:1.6em; color:#555;">📚 Java 기초 트랙 목차</h2>

<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 1: 자바란? · 개발 환경 · 출력</span>
  <span>▶ Chapter 2: 변수 · 자료형 · 입력</span>
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
# 🧩 Step 1: 핵심 개념 

---
<!-- _class: aqua -->
<img src="./chapter1-1/005.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-1/006.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-1/007.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-1/008.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-1/009.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-1/010.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-1/011.png" alt="핵심 개념 요약" width="100%" />

---
<!-- _class: aqua -->
## 🧩 Step 1: 핵심 개념 요약 (1/2)

| 항목       | 설명                                           |
|------------|------------------------------------------------|
| 자바란?    | 널리 쓰이는 객체지향 언어                      |
| 개발 환경  | JDK 설치 → 작성 → 컴파일 → 실행                |
| 구조       | 클래스 기반, **main()** 에서 시작                 |

---
<!-- _class: aqua -->
## 🧩 Step 1: 핵심 개념 요약 (2/2)

| 항목     | 설명                                           |
|----------|------------------------------------------------|
| 출력     | **System.out.println()** 으로 콘솔 출력            |
| 특징     | 다양한 분야에 활용, 안정성 높아 기업 선호       |

> <span class="fragment">이제 자바의 기본 흐름을 한눈에 파악했어요. 다음은 각 개념을 하나씩 살펴볼게요!</span>
---  
<!-- _class: aqua -->  
## 개념 1: 자바란?

- ☕ 자바는 1995년에 만들어진 프로그래밍 언어예요  
- 🌍 웹, 앱, 서버, 금융 시스템 등 **다양한 분야**에서 사용돼요  
- 🔒 **안정성과 보안성**이 뛰어나서 기업에서 많이 써요  
- 📦 객체지향 언어로 **클래스와 객체 중심**으로 동작해요  
- 💬 철학: **<mark>“한 번 작성하면 어디서든 실행된다”</mark>**

---  
<!-- _class: aqua -->  
## 개념 2: 자바 개발 환경

- 🛠️ JDK(Java Development Kit) 설치 필요  
- 💻 IDE(통합 개발 환경) 사용: IntelliJ, Eclipse, VS Code  
- 📂 **.java** 확장자 사용  



---  
<!-- _class: green -->  
# 🛠️ Step : 실습 과제 (1)

---
<!-- _class: aqua -->
<img src="./chapter1-1/013.png" alt="자바 셋팅 13번" width="100%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (1/10)
<img src="./chapter1-1/014.png" alt="자바 셋팅 14번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (2/10)
<img src="./chapter1-1/015.png" alt="자바 셋팅 15번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (3/10)
<img src="./chapter1-1/016.png" alt="자바 셋팅 16번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (4/10)
<img src="./chapter1-1/017.png" alt="자바 셋팅 17번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (5/10)
<img src="./chapter1-1/018.png" alt="자바 셋팅 18번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (6/10)
<img src="./chapter1-1/019.png" alt="자바 셋팅 19번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (7/10)
<img src="./chapter1-1/020.png" alt="자바 셋팅 20번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (8/10)
<img src="./chapter1-1/021.png" alt="자바 셋팅 21번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (9/10)
<img src="./chapter1-1/022.png" alt="자바 셋팅 22번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 자바 셋팅 (10/10)
<img src="./chapter1-1/023.png" alt="자바 셋팅 23번" width="90%" />


---
<!-- _class: aqua -->
<img src="./chapter1-1/024.png" alt="자바 셋팅 24번" width="100%" />



---  
<!-- _class: green -->  
# 🛠️ Step : 실습 과제 (2)

---
<!-- _class: aqua -->
<img src="./chapter1-1/026.png" alt="자바 셋팅 26번" width="100%" />


---
<!-- _class: aqua -->
<img src="./chapter1-1/027.png" alt="자바 셋팅 27번" width="100%" />


---
<!-- _class: aqua -->
<img src="./chapter1-1/028.png" alt="자바 셋팅 28번" width="100%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (1/13)
<img src="./chapter1-1/029.png" alt="이클립스 설치 29번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (2/13)
<img src="./chapter1-1/030.png" alt="이클립스 설치 30번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (3/13)
<img src="./chapter1-1/031.png" alt="이클립스 설치 31번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (4/13)
<img src="./chapter1-1/032.png" alt="이클립스 설치 32번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (5/13)
<img src="./chapter1-1/033.png" alt="이클립스 설치 33번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (6/13)
<img src="./chapter1-1/034.png" alt="이클립스 설치 34번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (7/13)
<img src="./chapter1-1/035.png" alt="이클립스 설치 35번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (8/13)
<img src="./chapter1-1/036.png" alt="이클립스 설치 36번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (9/13)
<img src="./chapter1-1/037.png" alt="이클립스 설치 37번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (10/13)
<img src="./chapter1-1/038.png" alt="이클립스 설치 38번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (11/13)
<img src="./chapter1-1/039.png" alt="이클립스 설치 39번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (12/13)
<img src="./chapter1-1/040.png" alt="이클립스 설치 40번" width="90%" />

---
<!-- _class: aqua -->
## 🔧 이클립스 설치 (13/13)
<img src="./chapter1-1/041.png" alt="이클립스 설치 41번" width="90%" />



---
<!-- _class: aqua -->
<img src="./chapter1-1/042.png" alt="자바 셋팅 42번" width="100%" />





---  
<!-- _class: aqua -->  
- 🔁 실행 흐름: 작성 → 컴파일(**javac**) → 실행(**java**)

<pre class="codeblock">
javac Hello.java   // 컴파일
java Hello         // 실행
</pre>

---
<!-- _class: aqua -->
<img src="./chapter1-2/005.png" alt="자바 005" width="100%" />


---
<!-- _class: aqua -->
<img src="./chapter1-2/006.png" alt="자바 006" width="100%" />


---
<!-- _class: aqua -->
<img src="./chapter1-2/007.png" alt="자바 007" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-2/008.png" alt="자바 007" width="100%" />


---  
<!-- _class: aqua -->  
## 개념 3: 자바 프로그램 구조

<pre class="codeblock">
public class Hello {
    public static void main(String[] args) {
        System.out.println("안녕, 자바!");
    }
}
</pre>

- 📦 **class Hello** → 클래스 선언  
- 🚪 **main()** → 프로그램 시작점  
- 🖨️ **System.out.println()** → 출력 명령어  
- 🔚 세미콜론 **;**으로 문장 종료



---  
<!-- _class: green -->  
# 🛠️ Step : 실습 과제 (3)


---
<!-- _class: aqua -->
<img src="./chapter1-1/044.png" alt="자바 셋팅 44번" width="100%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (1/9)
<img src="./chapter1-1/045.png" alt="자바 셋팅 45번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (2/9)
<img src="./chapter1-1/046.png" alt="자바 셋팅 46번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (3/9)
<img src="./chapter1-1/047.png" alt="자바 셋팅 47번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (4/9)
<img src="./chapter1-1/048.png" alt="자바 셋팅 48번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (5/9)
<img src="./chapter1-1/049.png" alt="자바 셋팅 49번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (6/9)
<img src="./chapter1-1/050.png" alt="자바 셋팅 50번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (7/9)
<img src="./chapter1-1/051.png" alt="자바 셋팅 51번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (8/9)
<img src="./chapter1-1/052.png" alt="자바 셋팅 52번" width="90%" />

---
<!-- _class: aqua -->
## 🧪 처음으로 작성해본 자바 (9/9)
<img src="./chapter1-1/053.png" alt="자바 셋팅 53번" width="90%" />


---  
<!-- _class: aqua -->  
## 개념 4: 출력이란?

- 🖨️ 컴퓨터가 우리에게 결과를 보여주는 기능  
- 📺 **System.out.println()**으로 콘솔에 출력  
- 🧪 디버깅에도 활용  
- 📣 여러 줄 출력 가능


<pre class="codeblock">
System.out.println("첫 줄");
System.out.println("둘째 줄");
</pre>

---
<!-- _class: aqua --> 
<img src="./chapter1-2/026.png" alt="출력" width="100%" />


---
<!-- _class: aqua --> 
<img src="./chapter1-2/027.png" alt="출력" width="100%" />





---


<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->
## 예제 1: 기본 출력  
자바 프로그램의 기본 구조와 출력 방법을 익혀요

<pre class="codeblock">
public class A001 {
    public static void main(String[] args) {
        System.out.println("자바 시작!");
    }
}
</pre>

---

<!-- _class: aqua -->
## 예제 2: 여러 줄 출력  
System.out.println()을 여러 번 사용해 여러 줄을 출력해요

<pre class="codeblock">
public class A002 {
    public static void main(String[] args) {
        System.out.println("안녕하세요!");
        System.out.println("자바를 배워봅시다!");
    }
}
</pre>

---

<!-- _class: aqua -->
## 예제 3: 출력 순서 실험  
코드 작성 순서에 따라 출력 결과가 어떻게 달라지는지 확인해요

<pre class="codeblock">
public class A003 {
    public static void main(String[] args) {
        System.out.println("첫 번째 줄");
        System.out.println("두 번째 줄");
        System.out.println("세 번째 줄");
    }
}
</pre>

> <span class="fragment">출력 순서를 바꾸면 결과도 달라져요!</span>

---

<!-- _class: aqua -->
## 예제 4: 오류 실험  
세미콜론을 생략하면 컴파일 오류가 발생하는 걸 실험해요

<pre class="codeblock">
public class A004 {
    public static void main(String[] args) {
        System.out.println("이 줄은 출력돼요") // ← 세미콜론 누락
        System.out.println("이 줄은 오류나요");
    }
}
</pre>

> <span class="fragment">**(;)세미콜론**이 빠지면 컴파일 오류가 발생해요!</span>

---

<!-- _class: aqua -->
## 예제 5: 줄 바꾸기 연습  
**\n**을 사용해 한 줄 안에서 여러 줄을 출력하는 방법을 배워요

<pre class="codeblock">
public class A005 {
    public static void main(String[] args) {
        System.out.println("첫 줄\n둘째 줄\n셋째 줄");
    }
}
</pre>

> <span class="fragment">**\n**은 줄을 바꾸는 특수 문자예요</span>

---

<!-- _class: aqua -->
## 예제 6: 탭으로 정렬하기  
**\t**를 사용해 출력 내용을 정렬해요

<pre class="codeblock">
public class A006 {
    public static void main(String[] args) {
        System.out.println("이름\t나이\t지역");
        System.out.println("철수\t12\t서울");
        System.out.println("영희\t13\t부산");
    }
}
</pre>

> <span class="fragment">**\t**는 일정 간격으로 띄우는 특수 문자예요</span>

---

<!-- _class: aqua -->
## 예제 7: 줄 바꾸기 연습 (중복 제거)  
**\n**을 사용해 한 줄 안에서 여러 줄을 출력하는 방법을 배워요

<pre class="codeblock">
public class A007 {
    public static void main(String[] args) {
        System.out.println("첫 줄\n둘째 줄\n셋째 줄");
    }
}
</pre>

> <span class="fragment">**\n**은 줄을 바꾸는 특수 문자예요</span>

---

<!-- _class: aqua -->
## 예제 8: 문자열과 숫자 결합  
문자열과 숫자를 더하면 어떻게 출력될까요?

<pre class="codeblock">
public class A008 {
    public static void main(String[] args) {
        System.out.println("10 + 20 = " + (10 + 20));     // 숫자 덧셈
        System.out.println("10 + 20 = " + "10" + "20");   // 문자열 연결
    }
}
</pre>

> <span class="fragment">괄호를 사용하면 숫자 덧셈이 먼저 계산돼요</span>

---

<!-- _class: aqua -->
## 예제 9: 형식 지정 출력  
**printf**를 사용해 정렬된 출력 결과를 만들어요

<pre class="codeblock">
public class A009 {
    public static void main(String[] args) {
        System.out.printf("%-10s %5d\n", "Apple", 100);
        System.out.printf("%-10s %5d\n", "Banana", 250);
    }
}
</pre>

> <span class="fragment">**%-10s**는 문자열을 왼쪽 정렬하고 너비를 10으로 지정해요</span>



---  
<!-- _class: green -->  
# 🛠️ Step 3: 실습 과제 (3)

---

<!-- _class: aqua -->
## 과제 1: Hello World 출력하기

- 자바 파일을 만들고  
- "Hello, World!"를 출력해보세요

### 🖨️ 출력예시
<pre class="codeblock">
Hello, World!
</pre>

---

<!-- _class: aqua -->
## 과제 2: 자기소개 출력하기

- 자신의 이름과 나이를 출력해보세요  
- System.out.println()을 두 번 사용하세요

### 🖨️ 출력예시
<pre class="codeblock">
이름: 홍길동
나이: 20
</pre>

---

<!-- _class: aqua -->
## 과제 3: 줄 바꾸기 출력하기

- 한 줄의 코드로 여러 줄을 출력해보세요  
- **\n**을 사용하세요

### 🖨️ 출력예시
<pre class="codeblock">
첫째 줄
둘째 줄
셋째 줄
</pre>

---

<!-- _class: aqua -->
## 과제 4: 탭으로 정렬하기

- **\t**를 사용해 정보를 정렬해보세요  
- 이름, 나이, 지역을 출력하세요

### 🖨️ 출력예시
<pre class="codeblock">
이름	나이	지역
철수	12	서울
영희	13	부산
</pre>

---

<!-- _class: aqua -->
## 과제 5: 덧셈 결과 출력하기

- 숫자 10과 20을 더한 결과를 출력하세요  
- 문자열과 숫자를 함께 출력해보세요

### 🖨️ 출력예시
<pre class="codeblock">
10 + 20 = 30
</pre>

---

<!-- _class: aqua -->
## 과제 6: 문자열 덧셈 실험

- "10" + "20"을 출력해보세요  
- 문자열 결합 결과를 확인하세요

### 🖨️ 출력예시
<pre class="codeblock">
10 + 20 = 1020
</pre>

---

<!-- _class: aqua -->
## 과제 7: 형식 지정 출력하기

- printf를 사용해 과일 이름과 가격을 정렬해 출력하세요  
- %-10s와 %5d를 사용하세요

### 🖨️ 출력예시
<pre class="codeblock">
Apple      100
Banana     250
</pre>

---

<!-- _class: aqua -->
## 과제 8: 출력 순서 실험하기

- 세 문장을 출력하는 코드를 작성하세요  
- 출력 순서를 바꿔보며 결과를 비교해보세요

### 🖨️ 출력예시
<pre class="codeblock">
첫 번째 줄
두 번째 줄
세 번째 줄
</pre>

---

<!-- _class: aqua -->
## 과제 9: 컴파일 오류 실험하기

- 세미콜론을 일부러 생략한 코드를 작성해보세요  
- 어떤 오류 메시지가 나오는지 확인하세요

### 🖨️ 출력예시
<pre class="codeblock">
오류: ';' expected
</pre>

---

<!-- _class: aqua -->
## 과제 10: 여러 줄 출력 연습

- System.out.println()을 여러 번 사용해  
- 인사말을 세 줄로 출력해보세요

### 🖨️ 출력예시
<pre class="codeblock">
안녕하세요!
자바를 시작합니다.
열심히 해봐요!
</pre>

---

---  
<!-- _class: purple -->  
# 💡 Step 4: 사고 확장

---
<!-- _class: aqua -->
## 💡 사고 질문: 왜 자바부터 배울까요?



---
<!-- _class: aqua -->
### 🤔 질문 1  
자바가 없다면 스마트폰 앱은 어떻게 작동할까요?

> <span class="fragment">자바는 안드로이드 앱의 핵심 언어예요. 많은 앱이 자바로 만들어져요!</span>



---
<!-- _class: aqua -->
### 🧠 질문 2  
자바는 왜 초보자에게 적합할까요?

> <span class="fragment">구조가 명확하고 문법이 직관적이라 처음 배우기에 좋아요</span>



---
<!-- _class: aqua -->
### 🏢 질문 3  
실무에서 자바는 얼마나 쓰이나요?

> <span class="fragment">대기업, 금융, 백엔드 서버 등에서 널리 사용돼요. 취업에도 유리해요!</span>



---
<!-- _class: aqua -->
### 🔍 질문 4  
출력을 먼저 배우는 이유는?

> <span class="fragment">눈에 보이는 결과가 있어야 동기부여가 생기고, 디버깅도 쉬워져요</span>



---
<!-- _class: aqua -->
### 🚀 질문 5  
자바로 어떤 걸 만들 수 있나요?

> <span class="fragment">계산기, 대화형 프로그램, 간단한 게임, 앱까지 만들 수 있어요!</span>


---

<!-- _class: aqua -->
### 🧪 질문 6   자바는 어떻게 실행?
왜 **javac Hello.java → java Hello** 두 단계로 실행?

> <span class="fragment">자바는 컴파일 언어예요. 
먼저 javac로 .java 파일을 .class 바이트코드로 변환하고, 그걸 JVM이 java 명령으로 실행해요.</span>  
> <span class="fragment">이 구조 덕분에 자바는 운영체제에 상관없이 실행돼요. "한 번 작성, 어디서나 실행"이 가능한 이유죠!</span>
---

<!-- _class: aqua -->
## 🔧 실행 흐름 예시

<pre class="codeblock">
// Hello.java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
</pre>

<pre class="codeblock">
javac Hello.java   # 컴파일: Hello.class 생성
java Hello         # 실행: "Hello, world!" 출력
</pre>

> <span class="fragment">컴파일 단계에서 문법 오류를 잡고, 실행 단계에서는 결과를 확인할 수 있어요.</span>

---

<!-- _class: aqua -->
## 🔧 질문7. JVM이란?

> <span class="fragment">JVM(Java Virtual Machine)은 자바 바이트코드를 읽고 실행하는 가상 머신이에요.</span>  
> <span class="fragment">운영체제마다 다른 환경에서도 자바 프로그램을 동일하게 실행할 수 있게 해줘요.</span>

 ---

<!-- _class: aqua -->
## 🔧 질문8. 클래스안에 클래스?
### 중첩 클래스란?

> <span class="fragment">클래스 내부에 또 다른 클래스를 정의하는 구조예요.</span>  
> <span class="fragment">외부 클래스와 밀접한 관계가 있을 때 사용 코드가 더 깔끔</span>
> <span class="fragment">외부 클래스와 논리적으로 연결된 기능을 그룹화</span>  
> <span class="fragment">캡슐화가 강화되고, 코드 가독성이 좋아져요.</span>


---
<!-- _class: aqua -->
<img src="./chapter1-2/017.png" alt="중첩클래스" width="100%" />


---
<!-- _class: aqua -->
<img src="./chapter1-2/018.png" alt="중첩클래스" width="100%" />


---
<!-- _class: aqua -->
<img src="./chapter1-2/019.png" alt="중첩클래스" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-2/020.png" alt="중첩클래스" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-2/021.png" alt="중첩클래스" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-2/022.png" alt="중첩클래스" width="100%" />

---
<!-- _class: aqua -->
<img src="./chapter1-2/023.png" alt="중첩클래스" width="100%" />




## 🧪 부품객체안에 부품객체 

---  
<!-- _class: red -->  
# 🧠 Step 5: 기억 테스트

---  
<!-- _class: aqua -->  
## 퀴즈 1  자바에서 출력하는 명령어는?

- <span class="fragment">A. print.out()</span>  
- <span class="fragment">✅ B. System.out.println()</span>  
- <span class="fragment">C. echo()</span>

---  
<!-- _class: aqua -->  
## 퀴즈 2  자바 프로그램의 시작점은?

- <span class="fragment">A. start()</span>  
- <span class="fragment">✅ B. main()</span>  
- <span class="fragment">C. init()</span>

---  
<!-- _class: aqua -->  
## 퀴즈 3  자바 파일의 확장자는?

- <span class="fragment">A. .txt</span>  
- <span class="fragment">✅ B. .java</span>  
- <span class="fragment">C. .class</span>

---  
<!-- _class: thanks -->  
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">이제 자바의 구조와 출력까지 완벽하게 이해했어요</span>  
> <span class="fragment">다음은 변수와 자료형, 그리고 입력으로 넘어가볼까요?</span>
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
