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

<!-- _class: cover-githubai -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 01
</h4>  
<h1 style="color:#FF69B4;">GitHub + AI 활용</h1>  
<h3 style="color:#FFD700;">Repo · API · Prompt · Collaboration</h3>

<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 5 · <em>AI에게 질문하며 개발하기</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">AI에게 질문하고, 코드 작성과 디버깅을 함께하는 개발 방식</span><br>
  <span class="fragment" style="color:#495057;">Copilot, ChatGPT 등 다양한 AI 도우미와 실시간 협업</span>
</blockquote>

---  
<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub + AI 활용편 </h2>

<div class="track-outline">
  <span>▶ Chapter 1: GitHub 기본 명령어 배우기</span>
  <span>▶ Chapter 2: 파일 올리고 내리기 (Push & Pull)</span>
  <span>▶ Chapter 3: Markdown 파일 만들기</span>
  <span>▶ Chapter 4: GitHub에서 협업하기</span>
  <span class="current-chapter">✅▶ Chapter 5: AI에게 질문하며 개발하기</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 개발자와 AI가 함께 협업하는 <br/> 미래형 개발 환경을 실습 중심으로 안내합니다.
</p>

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념
---

<!-- _class: aqua -->
## 🧠 개념 1: ChatGPT, Copilot이란?

- **AI 기반 코드 도우미**  
- 개발자가 작성 중인 코드 맥락을 이해하고 자동 완성 제안  
- 함수, 주석, 테스트 코드까지 예측하여 작성 가능  
- 다양한 AI 도구가 존재하며, 상황에 따라 선택 가능

---

<!-- _class: aqua -->
## 🧠 개념 2: AI 도우미는 어떻게 작동하나요?

| 항목 | 설명 |
|------|------|
| 입력 | 개발자가 작성 중인 코드 또는 주석 |
| 처리 | AI가 문맥을 분석하고 예측 |
| 출력 | 코드 자동 완성, 함수 제안, 오류 수정 등 |

---

<!-- _class: aqua -->
## 🧠 개념 3: AI에게 질문하는 방법

| | 방식 | 예시 |
|:--:|:--|:--|
| 💬 | <span class="mark">주석으로 질문</span> | **// 이 함수는 어떤 역할을 하나요?** |
| ✍️ | <span class="mark">함수 이름으로 힌트</span> | **generateUserProfile()** |
| 🧠 | <span class="mark">자연어로 설명</span> | **사용자 정보를 기반으로 프로필 생성** |

---

<!-- _class: aqua -->
## 🧠 개념 4: AI 도우미의 장점

| | 항목 | 설명 |
|:--:|:--|:--|
| ⚡ | <span class="mark">속도</span> | 반복 작업을 빠르게 처리 |
| 🧠 | <span class="mark">지능</span> | 문맥 기반으로 똑똑한 제안 |
| 🤝 | <span class="mark">협업</span> | 팀원처럼 함께 코딩하는 느낌 |

---

<!-- _class: aqua -->
## 🧠 개념 5: 기억하기 쉽게!

- <span class="mark">Copilot, ChatGPT</span>는 나만의 AI 개발 파트너  
- 코드 작성 중 <span class="mark">질문하면 답해주는 도우미</span>  
- 개발 속도와 품질을 <span class="mark">동시에 향상</span>시키는 도구

---

<!-- _class: blue -->
# 🧪 Step 2: AI 도우미 기본 사용법 따라하기

---

<!-- _class: aqua -->
## 기본 1: Copilot 켜기 (VS Code 기준)

<pre class="codeblock">
Ctrl + Shift + P → "Copilot: Enable"
</pre>

> "AI 도우미를 불러왔어요!"

---

<!-- _class: aqua -->
## 기본 2: 질문하기

<pre class="codeblock">
// 사용자의 정보를 기반으로 프로필을 생성하는 함수
</pre>

> "AI에게 설명을 주면, 코드를 제안해줘요!"

---

<!-- _class: aqua -->
## 기본 3: 자동완성 받기

<pre class="codeblock">
def generate_profile(user):
    # AI가 자동으로 코드를 채워줍니다
</pre>

> "함수 이름만 적어도, AI가 알아서 채워줘요!"

---

<!-- _class: purple -->
# 💬 Step 3: AI에게 잘 묻는 프롬프트 작성법

---

<!-- _class: aqua -->
## 💡 프롬프트란?

- AI에게 **무엇을 원하는지 설명하는 문장**  
- 주석, 함수 이름, 자연어 등 다양한 방식으로 전달 가능  
- 좋은 프롬프트는 AI의 **정확한 코드 제안**을 이끌어냄

---

<!-- _class: aqua -->
## ✍️ 프롬프트 작성 예시 ①: 주석으로 질문하기

<pre class="codeblock">
// 사용자의 이름과 나이를 받아 인사말을 출력하는 함수
</pre>

<pre class="codeblock">
function greetUser(name, age) {
  return `안녕하세요, ${name}님! 당신은 ${age}살입니다.`;
}
</pre>

---

<!-- _class: aqua -->
## ✍️ 프롬프트 작성 예시 ②: 함수 이름으로 힌트 주기

<pre class="codeblock">
def calculate_discount(price, rate):
</pre>

---

<!-- _class: aqua -->
## ✍️ 프롬프트 작성 예시 ③: 자연어로 설명하기

<pre class="codeblock">
// 사용자의 구매 내역을 분석해서 추천 상품을 보여주는 함수
</pre>

---

<!-- _class: aqua -->
## ✅ 좋은 프롬프트 작성 팁

| 팁 | 설명 |
|-----|------|
| 🎯 명확하게 | 원하는 기능을 구체적으로 설명 |
| 🧩 맥락 포함 | 입력값, 출력값, 목적을 함께 제시 |
| 💬 자연어 OK | 꼭 코드가 아니어도 설명만으로 충분 |
| 📌 주석 활용 | 코드 위에 설명을 달면 효과적 |

---

<!-- _class: red -->
## ⚠️ 프롬프트 작성 시 주의사항

| 주의점 | 설명 |
|--------|------|
| ❌ 너무 모호한 설명 | "이거 해줘" 같은 문장은 AI가 이해하기 어려움 |
| ❌ 목적 없는 함수명 | doSomething()처럼 의미 없는 이름은 추천 정확도 낮음 |
| ❌ 과도한 기대 | AI는 도우미이지, 완벽한 해결사는 아님 |
| ✅ 점진적 요청 | 복잡한 기능은 단계적으로 나눠서 질문

---

<!-- _class: aqua -->
## ✅ 프롬프트 요약

- AI는 **프롬프트를 통해 코드 맥락을 이해**함  
- 주석, 함수 이름, 자연어 모두 프롬프트로 활용 가능  
- 명확하고 구체적인 설명이 **더 똑똑한 코드 제안**을 이끈다  
- 모호하거나 목적 없는 프롬프트는 피할 것!


---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장
> 이제 우리가 배운 내용을 조금 더 생각해볼까요?

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ①: 왜 AI에게 묻나요?

- <span class="fragment">혼자보다 빠르게 해결하려고요</span>
- <span class="fragment">코드 실수를 줄이려고요</span>
- <span class="fragment">새로운 아이디어를 얻으려고요</span>

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ②: AI가 실수하면?

- <span class="fragment">엉뚱한 코드를 줄 수도 있어요 😅</span>
- <span class="fragment">내가 원하는 기능이 아닐 수도 있어요 🤔</span>
> 그래서 **프롬프트를 명확하게** 주는 게 중요해요!  
> ✅ AI는 질문을 잘해야 더 똑똑하게 도와줘요!

---

<!-- _class: red -->
# 🧠 Step 5: 기억 테스트

> 지금까지 배운 내용을 퀴즈로 확인해볼까요?

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: AI에게 질문하는 가장 좋은 방법은?

- A. **주석으로 기능을 설명한다** ✅  
- B. 아무 말 없이 기다린다  
- C. "이거 해줘"라고만 쓴다

---

<!-- _class: aqua -->
## ❓ 퀴즈 2: 좋은 프롬프트의 특징은?

- A. **구체적이고 명확하다** ✅  
- B. 복잡하고 길다  
- C. AI가 알아서 해주겠지

---

<!-- _class: aqua -->
## 🎯 오늘 배운 것 요약

<br>

- <span class="mark">AI 도우미 켜기</span> → Copilot, ChatGPT 등 활성화  
- <span class="mark">프롬프트 작성</span> → 주석·함수명·자연어로 질문  
- <span class="mark">자동완성 받기</span> → 코드 제안 확인  
- <span class="mark">주의사항</span> → 모호한 질문은 피하기

> AI는 **말을 잘 걸면 더 똑똑하게 도와줘요!** 🧠💬


---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>
