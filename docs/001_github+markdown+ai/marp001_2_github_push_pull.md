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
  📍 <strong>현재 위치:</strong> Chapter 2 · <em>Push & Pull 실습</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">GitHub Push & Pull</span><br>
  <span class="fragment" style="color:#495057;">파일 올리고 내리기 · 원격 저장소 연결 · 충돌 해결</span>
</blockquote>

 

---  
<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub + AI 활용편 </h2>
 
<div class="track-outline">
  <span>▶ Chapter 1: GitHub 기본 명령어 배우기</span>
  <span class="current-chapter">✅▶ Chapter 2: 파일 올리고 내리기 (Push & Pull)</span>
  <span>▶ Chapter 3: Markdown 파일 만들기</span>
  <span>▶ Chapter 4: GitHub에서 협업하기</span>
  <span>▶ Chapter 5: Copilot에게 질문하며 개발하기</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 개발자와 AI가 함께 협업하는 <br/> 미래형 개발 환경을 실습 중심으로 안내합니다.
</p>


---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념

---

<!-- _class: aqua -->
## 🧠  개념 1: Push란?
<br>

- 로컬 저장소의 변경 내용을  
  👉 GitHub 원격 저장소로 **업로드**하는 명령어

<pre class="codeblock">
git push origin 브랜치명
</pre>

---

<!-- _class: aqua -->
## 🧠  개념 2: Pull이란?
<br/>
- GitHub 원격 저장소의 최신 내용을  
  👉 내 로컬 저장소로 **가져오는** 명령어

<pre class="codeblock">
git pull origin 브랜치명
</pre>

---

<!-- _class: aqua -->
## 🧠  개념 3: Push & Pull 흐름도
<br/>

- [내 컴퓨터] → git push → [GitHub 저장소] 
- [GitHub 저장소] → git pull → [내 컴퓨터]

> 협업 시 서로의 변경사항을 주고받는 핵심 명령어
 


---
<!-- _class: blue -->
# 🧪 Step 2: 실습 따라하기


---
<!-- _class: aqua -->
## 💡 실습 개요

이번 실습에서는 
> GitHub ***원격 저장소와 로컬 저장소를 연결***하고,  
Push & Pull을 통해 ***파일을 올리고 내리는***  실습

---
<!-- _class: aqua -->
## 🧭 실습 흐름 요약

1. 원격 저장소 연결  
2. 로컬 파일을 Push로 업로드  
3. GitHub에서 업로드 확인  
4. Pull로 최신 파일 내려받기  
5. <span class="mark">충돌 상황 해결 및 오류 대응 </mark>

---
<!-- _class: aqua -->
## 🛠️ 실습 전 준비사항

- 로컬 저장소 초기화:  
<pre class="codeblock">git init</pre>

- 파일 생성 및 커밋:  
<pre class="codeblock">
echo "Hello GitHub" > hello.txt
git add .
git commit -m "첫 커밋"
</pre>

---

<!-- _class: aqua -->
## 🔧 주요 명령어 안내
<pre class="codeblock">
# 원격 저장소 연결
git remote add origin https://github.com/sally03915/git0.git

# 연결 확인
git remote -v

# 파일 업로드 (Push)
git push origin main

# 파일 내려받기 (Pull)
git pull origin main
</pre>

> 각 명령어는 실습 단계에서 직접 실행하며 확인합니다.

---

<!-- _class: aqua -->
## 🧪 실습 1: 원격 저장소 연결

<pre class="codeblock">
git remote add origin https://github.com/sally03915/git0.git
git remote -v
</pre>

> 로컬 저장소와 GitHub 저장소 연결 확인

---

<!-- _class: aqua -->
## 🧪 실습 2: Push로 업로드

<pre class="codeblock">
git push origin main
</pre>

> 로컬에서 만든 파일을 GitHub에 올리기

---

<!-- _class: aqua -->
## 🧪 실습 3: GitHub에서 확인

- GitHub 웹사이트 접속  
- ***git0*** 저장소에 파일이 올라갔는지 확인

---

<!-- _class: aqua -->
## 🧪 실습 4: Pull로 내려받기

<pre class="codeblock">
git pull origin main
</pre>

> GitHub에 있는 최신 파일을 내 컴퓨터로 가져오기

---

<!-- _class: red -->
## 🧪 실습 5: 충돌 상황 해결

- 동일 파일을 여러 사람이 수정했을 경우  
- Pull 시 충돌 메시지 발생

<pre class="codeblock">
CONFLICT (content): Merge conflict in basic001.html
Automatic merge failed; fix conflicts and then commit the result.
</pre>

> 해결 방법:
> 직접 파일을 수정하고 다시 커밋하면 해결됨


 
---

<!-- _class: red -->
## 🧪 실습 6: 충돌된 파일 예시

```html
<<<<<<< HEAD
<h1>내가 수정한 제목</h1>
=======
<h1>친구가 수정한 제목</h1>
>>>>>>> origin/main
```

> 🔧 이 구간을 직접 수정해서 하나의 제목으로 정리

---

<!-- _class: aqua -->
## ✅ 수정 후 커밋하기

```bash
git add basic001.html
git commit -m "충돌 해결: 제목 통일"
```

> 이렇게 하면 Git이 “아! 이제 충돌이 없구나” 하고  <br/>병합을 완료해요!

---

<!-- _class: green -->
## 🛡️ 충돌을 줄이는 방법

- 자주 Pull 해서 최신 상태 유지하기  
- 중요한 수정은 미리 팀원에게 알리기  
- 같은 파일을 동시에 수정하지 않도록 역할 나누기  

> 협업은 소통이 생명! <br/>Git은 도구일 뿐, 사람이 해결해요 😊
 



---
<!-- _class: green -->
## 🧩 Step 3: 충돌 해결 실습 (Track 1 연계)

 **Track 1에서 다뤘던 Push & Pull 개념을 바탕으로**,  
실제 충돌 상황을 마주하고 해결하는 과정.

---

## ⚠️ 충돌이란?

- 여러 사람이 같은 파일을 수정했을 때 발생
- Git은 자동 병합을 시도하지만, 충돌이 생기면 직접 해결해야 함

---

## 🧪 실습 시나리오

1. GitHub에서 `basic001.html` 파일을 수정  
2. 로컬에서도 같은 파일을 수정 후 커밋  
3. `git pull origin main` 실행 시 충돌 발생

---

## 💥 충돌 메시지 예시

<pre class="codeblock">
CONFLICT (content): Merge conflict in basic001.html
Automatic merge failed; fix conflicts and then commit the result.
</pre>

---

## 🛠️ 해결 방법

1. 충돌된 파일 열기  
   - <<<<<<< HEAD 와 =======, >>>>>>> 로 구분된 영역 확인

2. 원하는 내용으로 직접 수정

3. 수정 후 커밋

<pre class="codeblock">
git add basic001.html
git commit -m "충돌 해결"
</pre>

---
<!-- _class: purple -->
# 💡 Step 6: 사고 확장 – 충돌이란?

> 이번엔 협업 중 생길 수 있는 <br/> **충돌(conflict)** 상황을 알아볼게요!

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ①: 왜 그림을 보내고 받을까요?

- <span class="fragment">친구에게 보여주고 싶어서요</span>  
- <span class="fragment">다 같이 꾸미고 싶어서요</span>  
- <span class="fragment">내가 만든 걸 안전하게 보관하려고요</span>  

> Git에서의 Push는 **내 그림을 친구에게 보내는 것**,  
> Pull은 **친구가 만든 그림을 내가 받아오는 것**이에요!

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ②: 안 보내면 어떻게 될까요?

- <span class="fragment">친구가 내 그림을 못 봐요 😢</span>  
- <span class="fragment">같이 꾸밀 수 없어요 😮</span>  

> 그래서 Push는 **함께 작업하기 위한 첫걸음**이에요!  
> ✅ Pull은 친구의 멋진 아이디어를 받아오는 **마법의 다리**

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ③: 그림이 겹치면 ?

- <span class="fragment">친구랑 같은 그림을 동시에 수정했어요</span>  
- <span class="fragment">내가 고친 부분과 친구가 고친 부분이 달라요</span>  

> 이럴 때 Git은 “어떤 걸 살릴까요?” 하고 물어봐요  
> 이게 바로 **충돌(conflict)**이에요!

✅ 우리가 직접 보고 결정해야 해요  
👉 “이 부분은 내 걸로, 저 부분은 친구 걸로!”

---

<!-- _class: red -->
# 🧠 Step 5: 기억 테스트  
> Push & Pull 개념을 퀴즈로 확인해볼까요?

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: ***git push***는 뭐예요?

- A. **내 그림을 친구에게 보내기** ✅  
- B. 그림 숨기기  
- C. 그림 지우기

---

<!-- _class: aqua -->
## ❓ 퀴즈 2: ***git pull***은 뭐예요?

- A. **친구 그림을 내 상자에 받기** ✅  
- B. 그림 흔들기  
- C. 그림 바꾸기

---

<!-- _class: aqua -->
## 🎯 오늘 배운 것 요약

- <span class="mark">git push</span> → **내 그림을 GitHub에 보내기**  
- <span class="mark">git pull</span> → **GitHub에서 친구 그림 받아오기**  

> Push & Pull은 함께 그림을 완성하는 **협업의 다리**예요!

---

<!-- _class: aqua -->
## 🎈 다음 시간 예고

> **그림을 보내고 받는 방법(Push & Pull)** 을 배웠어요  
> 다음엔 **그림이 겹칠 때 생기는 충돌 상황**을 함께 해결해볼 거예요!  
> 진짜 협업의 기술, 기대해주세요 💥


---
<!-- _class: thanks -->
## 👋 오늘도 멋진 협업 한 걸음!

> 충돌은 무서운 게 아니에요  
> 오히려 **함께 작업하고 있다는 증거**랍니다!

---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">오늘의 한 걸음이 **내일의 협업 능력**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 시간에 또 만나요!</span>
