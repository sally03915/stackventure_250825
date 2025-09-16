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
  section.yellow {
    background: linear-gradient(135deg, #fff89e, #fdd835);
    color: #333;
  }

---
<!-- _class: cover-githubai -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 01
</h4>  
<h1 style="color:#FF69B4;">GitHub + AI 활용</h1>  
<h3 style="color:#FFD700;">Repo · API · Prompt · Collaboration</h3>

<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 4 · <em>GitHub에서 협업하기</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">함께 코드를 만들고, 리뷰하고, 공유하는 협업 기술</span><br>
  <span class="fragment" style="color:#495057;">GitHub의 Fork, Branch, Pull Request로 팀워크를 완성해요</span>
</blockquote>

---

<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub + AI 활용편 </h2>

<div class="track-outline">
  <span>▶ Chapter 1: GitHub 기본 명령어 배우기</span>
  <span>▶ Chapter 2: 파일 올리고 내리기 (Push & Pull)</span>
  <span>▶ Chapter 3: Markdown 파일 만들기</span>
  <span class="current-chapter">✅▶ Chapter 4: GitHub에서 협업하기</span>
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
## 🧠 개념 1: 협업이란?

- **함께 작업하는 것**  
- 서로의 아이디어를 나누고 발전시키기  
- 역할을 나누고 함께 완성하기

---

<!-- _class: aqua -->
## 🧠 개념 2: GitHub에서 협업하는 방법

|  |  |
|------|------|
| Fork | 다른 사람의 저장소를 복사해서 내 공간에 담기 |
| Branch | 원본을 건드리지 않고 새 작업 공간 만들기 |
| Pull Request | 수정한 내용을 원래 저장소에 제안하기 |
| Review | 서로의 코드를 확인하고 의견 나누기 |
| Merge | 수정된 내용을 저장소에 합치기

---

<!-- _class: aqua -->
## 🧠 개념 3: Fork와 Branch의 차이

| 항목 | Fork | Branch |
|------|------|--------|
| 위치 | 내 GitHub 계정 | 원래 저장소 안 |
| 목적 | 독립적인 복사본 만들기 | 기능별 작업 공간 만들기 |
| 협업 방식 | 외부 기여자용 | 팀 내부 협업용 |

---

<!-- _class: aqua -->
## 🧠 개념 4: Pull Request란?

| |  |  |
|:--:|:--|:--|
| 📬 | <span class="mark">요청</span> | 내가 수정한 내용을 반영해달라고 제안 |
| 🧐 | <span class="mark">검토</span> | 팀원이 코드를 확인하고 의견 남김 |
| ✅ | <span class="mark">병합</span> | 수정된 내용을 저장소에 합치기

---

<!-- _class: aqua -->
## 🧠 개념 5: 기억하기 쉽게!

- <span class="mark">Fork</span>는 친구의 상자를 복사하는 것  
- <span class="mark">Branch</span>는 내 상자 안에 새 공간을 만드는 것  
- <span class="mark">Pull Request</span>는 “이거 어때요?” 하고 제안하는 것  
- <span class="mark">Review</span>는 서로 도와주는 대화  
- <span class="mark">Merge</span>는 함께 만든 걸 하나로 합치는 마법!



---

<!-- _class: blue -->
# 🧪 Step 2: 기본 명령어 따라하기 <br/>
`fullstack_250825`


---
<!-- _class: aqua -->
## 기본 1: 우리 상자 만들기
```bash
git init
```
> "짜잔! 내 상자 생겼다!"


---
<!-- _class: aqua -->
## 기본 2: 그림 넣기

```bash
git add .
```
> "그림을 상자에 넣었어요!"

---

<!-- _class: aqua -->
## 기본 3: 저장하기


<pre class="codeblock">
git commit -m "완성!"
</pre>
> "이제 그림을 저장했어요!"

---

<!-- _class: aqua -->
## 기본 4: 친구 상자 복사하기 (<mark>Fork 후 클론</mark>)

<pre class="codeblock">
git clone https://github.com/친구아이디/저장소이름.git
</pre>

> "친구 상자를 내 방으로 가져왔어요!"

---

<!-- _class: aqua -->
## 기본 5: 새 작업 공간 만들기

<pre class="codeblock">
git checkout -b 새로운브랜치이름
</pre>
> "내 상자 안에 새 공간을 만들었어요!"

---

<!-- _class: aqua -->
## 기본 6: 친구에게 제안하기 (PR 전 푸시)

<pre class="codeblock">
git push origin 새로운브랜치이름
</pre>
> "내 그림을 친구에게 보여줄 준비 완료!"


---
<!-- _class: green -->
# 🛠️ Step 3: 협업 기능 실습 (1) <br/>
> `Fork → Clone`  
> `Branch → Commit → Push → PR → Merge`

---
<!-- _class: green -->
## ✅ 협업 실습 요약

| 단계 | 설명 |
|------|------|
| ① Fork | 친구 저장소 복사 |
| ② Clone | 내 컴퓨터로 가져오기 |
| ③ Branch | 새 작업 공간 만들기 |
| ④ Commit | 수정 내용 저장 |
| ⑤ Push | GitHub에 올리기 |
| ⑥ Pull Request | 친구에게 제안 |
| ⑦ Merge | 함께 만든 결과 합치기 |


---

<!-- _class: aqua -->
## 🧪 실습 1: 친구 저장소 복사하기 (Fork)

1. GitHub에서 친구의 저장소로 이동  
2. 오른쪽 상단의 **Fork** 버튼 클릭  
3. 내 GitHub 계정으로 복사 완료!

> 친구의 상자를 내 방으로 가져온 거예요 🎁

---

<!-- _class: aqua -->
## 🧪 실습 2: 내 컴퓨터로 가져오기 (Clone)

<pre class="codeblock">
git clone https://github.com/내아이디/복사된저장소.git
cd 복사된저장소
</pre>

> 내 컴퓨터에 친구의 상자를 복사했어요 🧳

---

<!-- _class: aqua -->
## 🧪 실습 3: 새 작업 공간 만들기 (Branch)

<pre class="codeblock">
git checkout -b feature-hello
</pre>

> 원본은 그대로 두고, 새 그림을 그릴 공간을 만든 거예요 🎨

---

<!-- _class: aqua -->
## 🧪 실습 4: 파일 수정하고 저장하기

1. ***basic001.html*** 파일에 내용 추가  
2. 아래 명령어로 저장

<pre class="codeblock">
git add .
git commit -m "인삿말 추가"
</pre>

> 내가 만든 그림을 저장했어요 🖼️

---

<!-- _class: aqua -->
## 🧪 실습 5: GitHub에 올리기

<pre class="codeblock">
git push origin feature-hello
</pre>

> 내 그림을 GitHub에 올려서 친구에게 보여줄 준비 완료! 🚀

---
<!-- _class: yellow -->
## 🧩 중간 점검: 여기까지 잘 따라왔나요?

- ✅ Fork 완료
- ✅ Clone 완료
- ✅ Branch 생성
- ✅ 파일 수정 및 Commit

> 다음은 Push와 Pull Request입니다. <br/> 조금만 더 힘내요! 💪




---

<!-- _class: aqua -->
## 🧪 실습 6: Pull Request 보내기

1. GitHub 저장소 접속  
2. "Compare & pull request" 버튼 클릭  
3. 설명 작성 후 "Create pull request" 클릭

> 친구에게 “이거 어때요?” 하고 제안하는 거예요 💌

---

<!-- _class: aqua -->
## 🧪 실습 7: 코드 리뷰 & 병합하기

1. 친구가 코드를 확인하고 승인  
2. "Merge pull request" 클릭  
3. "Confirm merge"로 병합 완료

> 함께 만든 그림을 하나로 합쳤어요! 🤝

> 이제 진짜 협업이 시작됐어요! <br/>여러분은 개발자 팀의 일원이 된 거예요 🎉

---
<!-- _class: aqua -->
## ✅ 협업 실습 요약

| 단계 | 설명 |
|------|------|
| ① Fork | 친구 저장소 복사 |
| ② Clone | 내 컴퓨터로 가져오기 |
| ③ Branch | 새 작업 공간 만들기 |
| ④ Commit | 수정 내용 저장 |
| ⑤ Push | GitHub에 올리기 |
| ⑥ Pull Request | 친구에게 제안 |
| ⑦ Merge | 함께 만든 결과 합치기


---
<!-- _class: green -->
# 🛠️ Step 3 (2): 역할 기반 협업
> `조장 → 팀원 → PR → 리뷰 → 병합 → 동기화`

---

<!-- _class: aqua -->
## 🔧 실습 1: 조장 역할

1. GitHub 저장소 생성  
2. ***basic.html*** 파일 업로드  
3. 팀원 초대 (Settings → Collaborators)

<pre class="codeblock">
git init
git remote add origin https://github.com/조장이름/저장소명.git
git push origin master
</pre>

> 팀의 작업 공간을 만드는 첫 단계예요 🏗️

---

<!-- _class: aqua -->
## 🔧 실습 2: 팀원 역할 - 저장소 복제

1. 저장소 클론  
2. 폴더 이름 지정 가능

<pre class="codeblock">
git clone https://github.com/조장이름/저장소명.git user1
cd user1
code 
</pre>

> 조장이 만든 상자를 내 컴퓨터로 가져왔어요 📦

---

<!-- _class: aqua -->
## 🔧 실습 3: 팀원 역할-브랜치 생성 및 파일 작성

1. 브랜치 생성  
2. 파일 작성 및 커밋  
3. 브랜치에 푸시


<pre class="codeblock">
git checkout -b user1
git add .
git commit -m "first commit user1"
git push origin user1
</pre>


> 주의! <mark>***master***</mark>에 직접 푸시하면 안 돼요 🚫

---

<!-- _class: aqua -->
## 🔧 실습 4: 팀원 역할 - Pull Request 요청

1. GitHub 저장소 접속  
2. [Compare & pull request] 클릭  
3. 제목과 메시지 작성 후 [Create pull request]

> 조장에게 “이거 어때요?” 하고 제안하는 단계예요 💌

---


<!-- _class: aqua -->
## 🔧 실습 5: 조장 역할 - 코드 리뷰 및 병합

1. PR 확인  
2. 코드 검토 및 리뷰 남기기 (Review changes)  
3. [Merge pull request] → [Confirm merge]

> 팀원이 만든 코드를 프로젝트에 반영하는 과정이에요 🤝

---

<!-- _class: aqua -->
## 🔧 실습 6: 조장 역할 - 마스터 코드 동기화

1. 로컬 코드 저장  
2. 원격 저장소에서 최신 코드 가져오기  
3. 수정 후 다시 푸시

<pre class="codeblock">
git add .
git commit -m "second commit pull-before"
git pull origin master
git push origin master
</pre>

> 팀 전체의 최신 코드를 반영하는 마무리 단계입니다 🔄

---

<!-- _class: green -->
## ✅ 협업 실습 전체 요약

|  |  |
|------|--------|
| 조장 | 저장소 생성, 팀원 초대, <br/>PR 리뷰 및 병합, 동기화 |
| 팀원 | 저장소 클론, 브랜치 생성, <br/>파일 작성, PR 요청 |


> 협업은 역할을 나누고 함께 완성하는 퍼즐 맞추기예요 🧩




---
## ① 조장
- 저장소 생성 

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (1/17)  
<img src="./images_collaboration/STEP001_1_팀장프로젝트만들기.png" alt="조장 - 저장소 생성" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (2/17)  
<img src="./images_collaboration/STEP001_2.png" alt="STEP001_2" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (3/17)  
<img src="./images_collaboration/STEP001_3.png" alt="STEP001_3" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (4/17)  
<img src="./images_collaboration/STEP001_4.png" alt="STEP001_4" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (5/17)  
<img src="./images_collaboration/STEP001_5.png" alt="STEP001_5" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (6/17)  
<img src="./images_collaboration/STEP001_6.png" alt="STEP001_6" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (7/17)  
<img src="./images_collaboration/STEP001_7.png" alt="STEP001_7" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (8/17)  
<img src="./images_collaboration/STEP001_8.png" alt="STEP001_8" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (9/17)  
<img src="./images_collaboration/STEP001_9.png" alt="STEP001_9" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (10/17)  
<img src="./images_collaboration/STEP001_10.png" alt="STEP001_10" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (11/17)  
<img src="./images_collaboration/STEP001_11.png" alt="STEP001_11" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (12/17)  
<img src="./images_collaboration/STEP001_12.png" alt="STEP001_12" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (13/17)  
<img src="./images_collaboration/STEP001_13.png" alt="STEP001_13" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (14/17)  
<img src="./images_collaboration/STEP001_14.png" alt="STEP001_14" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (15/17)  
<img src="./images_collaboration/STEP001_15.png" alt="STEP001_15" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (16/17)  
<img src="./images_collaboration/STEP001_16.png" alt="STEP001_16" width="100%"/>

---
<!-- _class: ex -->
## ① 조장 - 저장소 생성 (17/17)  
<img src="./images_collaboration/STEP001_17.png" alt="STEP001_17" width="100%"/>


---
## ② 팀원
- 팀장이 팀원초대
- 저장소 클론

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (1/17)  
<img src="./images_collaboration/STEP002_2.png" alt="STEP002_2" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (2/17)  
<img src="./images_collaboration/STEP002_3.png" alt="STEP002_3" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (3/17)  
<img src="./images_collaboration/STEP002_4.png" alt="STEP002_4" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (4/17)  
<img src="./images_collaboration/STEP002_5.png" alt="STEP002_5" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (5/17)  
<img src="./images_collaboration/STEP002_6_팀원콘솔_저장소다운로드.png" alt="STEP002_6" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (6/17)  
<img src="./images_collaboration/STEP002_7.png" alt="STEP002_7" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (7/17)  
<img src="./images_collaboration/STEP002_8.png" alt="STEP002_8" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (8/17)  
<img src="./images_collaboration/STEP002_9.png" alt="STEP002_9" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (9/17)  
<img src="./images_collaboration/STEP002_10_코드수정하고올리기.png" alt="STEP002_10" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (10/17)  
<img src="./images_collaboration/STEP002_11_터미널열기.png" alt="STEP002_11" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (11/17)  
<img src="./images_collaboration/STEP002_15.png" alt="STEP002_15" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (12/17)  
<img src="./images_collaboration/STEP002_16.png" alt="STEP002_16" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (13/17)  
<img src="./images_collaboration/STEP002_17.png" alt="STEP002_17" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (14/17)  
<img src="./images_collaboration/STEP002_18.png" alt="STEP002_18" width="100%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (15/17)  
<img src="./images_collaboration/STEP002_19.png" alt="STEP002_19" width="90%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (16/17)  
<img src="./images_collaboration/STEP002_20.png" alt="STEP002_20" width="90%"/>

---
<!-- _class: ex -->
## ① 팀원 저장소 클론 (17/17)  
<img src="./images_collaboration/STEP002_21.png" alt="STEP002_21" width="90%"/>




---
## ③ 코드 확인 및 병합
---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (1/10)
<img src="./images_collaboration/STEP003_1_브런치확인.png" alt="STEP003_1" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (2/10)
<img src="./images_collaboration/STEP003_2.png" alt="STEP003_2" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (3/10)
<img src="./images_collaboration/STEP003_3.png" alt="STEP003_3" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (4/10)
<img src="./images_collaboration/STEP003_4.png" alt="STEP003_4" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (5/10)
<img src="./images_collaboration/STEP003_5.png" alt="STEP003_5" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (6/10)
<img src="./images_collaboration/STEP003_6.png" alt="STEP003_6" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (7/10)
<img src="./images_collaboration/STEP003_7.png" alt="STEP003_7" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (8/10)
<img src="./images_collaboration/STEP003_8.png" alt="STEP003_8" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (9/10)
<img src="./images_collaboration/STEP003_9.png" alt="STEP003_9" width="100%"/>

---
<!-- _class: ex -->
## ③ 코드 확인 및 병합 (10/10)
<img src="./images_collaboration/STEP003_10.png" alt="STEP003_10" width="100%"/>


---
## ④ 충돌수정

---
<!-- _class: ex -->
##  ④ 충돌수정 (1/7)
<img src="./images_collaboration/STEP004_1__코드수정중_원격저장소업그레이드된것 확인안됨.png" alt="STEP004_1" width="100%"/>
 
---
<!-- _class: ex -->
## ④ 충돌수정 (2/7)
<img src="./images_collaboration/STEP004_2.png" alt="STEP004_2" width="100%"/>

---
<!-- _class: ex -->
## ④ 충돌수정 (3/7)
<img src="./images_collaboration/STEP004_3_유저가추가한것 확인.png" alt="STEP004_3" width="100%"/>

---
<!-- _class: ex -->
## ④ 충돌수정 (4/7)
<img src="./images_collaboration/STEP004_4_팀장_나_가수정한것 확인.png" alt="STEP004_4" width="100%"/>

---
<!-- _class: ex -->
## ④ 충돌수정 (5/7)
<img src="./images_collaboration/STEP004_5.png" alt="STEP004_5" width="100%"/>

---
<!-- _class: ex -->
## ④ 충돌수정 (6/7)
<img src="./images_collaboration/STEP004_6.png" alt="STEP004_6" width="100%"/>

---
<!-- _class: ex -->
## ④ 충돌수정 (7/7)
<img src="./images_collaboration/STEP004_7.png" alt="STEP004_7" width="100%"/>




---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장
> 협업은 퍼즐을 맞추는 과정이에요!


---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장

- 각자의 조각이 모여 하나의 그림을 완성해요  
- 혼자서는 볼 수 없는 관점을 서로 나눠요  
- 실수도 함께 고치고, 더 나은 결과를 만들어가요



---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ①: 왜 친구 상자를 복사할까요?

- <span class="fragment">친구가 만든 걸 보고 배우려고요</span>
- <span class="fragment">내 방식대로 바꿔보려고요</span>
- <span class="fragment">같이 더 멋진 걸 만들려고요</span>

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ②: 왜 Pull Request 할까요?

- <span class="fragment">내가 만든 걸 친구에게 보여주려고요</span>
- <span class="fragment">친구가 확인하고 도와줄 수 있어요</span>
- <span class="fragment">함께 만든 걸 하나로 합치려고요</span>

> ✅ 협업은 서로의 그림을 이어붙이는 퍼즐이에요!



---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ③: 이메일 초대받았는데 <br/> Fork 꼭 해야 하나요?

- <span class="fragment">초대받으면 저장소에 직접 접근할 수 있어요</span>  
- <span class="fragment">권한이 있으면 Fork 없이 바로 작업 가능해요</span>  
- <span class="fragment">권한이 없거나 실험하고 싶다면 Fork이 유용해요</span>

> ✅ 초대는 문을 여는 열쇠, <br/>Fork는 나만의 작업 공간이에요! 🗝️🏗️



---

<!-- _class: red -->
# 🔍 협업에서 자주 생기는 오해

| 오해 | 실제 |
|------|------|
| "내가 다 해야 해" | 역할을 나누고 함께 해결 |
| "내 코드가 최고야" | 리뷰를 통해 더 나은 코드로 발전 |
| "PR은 귀찮아" | PR은 소통의 시작이에요 |

> 협업은 기술이 아니라 **태도**입니다.

---

<!-- _class: aqua -->
# 🧠 협업의 기술 vs 협업의 마음

- 기술: Fork, Branch, PR, Merge  
- 마음: 존중, 경청, 피드백, 책임

> 기술은 배우면 되지만, 마음은 연습해야 해요




---

<!-- _class: red -->
# 🧠 Step 5: 기억 테스트

> 지금까지 배운 협업 기능을 퀴즈로 확인해볼까요?

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: ***Fork***는 뭐예요?

- A. 친구 저장소를 내 GitHub로 복사 ✅  
- B. 그림을 삭제  
- C. 저장소를 잠그기

---

<!-- _class: aqua -->
## ❓ 퀴즈 2: ***Branch***는 뭐예요?

- A. 저장소를 나누는 기능 ✅  
- B. 그림을 숨기는 기능  
- C. 저장소를 닫는 기능

---

<!-- _class: aqua -->
## ❓ 퀴즈 3: ***Pull Request***는 뭐예요?

- A. 친구에게 수정한 내용을 제안 ✅  
- B. 저장소를 초기화  
- C. 그림을 지우는 명령

---

<!-- _class: green -->
## 🎯 오늘 배운 것 요약

| 핵심 개념 | 기억하기 |
|-----------|----------|
| Fork | 친구 상자 복사 |
| Branch | 내 상자 안 새 공간 |
| Pull Request | “이거 어때요?” 제안 |
| Review | 서로 도와주는 대화 |
| Merge | 함께 만든 결과 합치기 |

> 협업은 혼자보다 더 멀리, 더 멋지게 가는 방법이에요! 🚀

---

<!-- _class: blue -->
## 🎈 다음 시간 예고
 
>  **Chatgpt, Copilot**과 함께  
> 코드를 자동 완성하고 리뷰도 받아보는  
> AI 협업 실습을 진행해요! 🤖✨

---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

<h3 style="color:#FFD700;">GitHub 협업의 첫걸음을 함께 했어요</h3>

> <span class="fragment">오늘의 협업 연습이 **내일의 팀워크**로 이어지길 바라며,</span>  
> <span class="fragment">그럼, 다음 시간에 또 만나요!</span>
