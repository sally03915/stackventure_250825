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
  📍 <strong>현재 위치:</strong> Chapter 1 · <em>GitHub 기본 명령어 배우기</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">AI를 코드에 연결하고 GitHub로 협업하는 실전 기술</span><br>
  <span class="fragment" style="color:#495057;">개발자와 AI가 함께 만드는 스마트한 프로젝트 환경</span>
</blockquote>


---  
<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub + AI 활용편 </h2>

<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 1: GitHub 기본 명령어 배우기</span>
  <span>▶ Chapter 2: 파일 올리고 내리기 (Push & Pull)</span>
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
## 🧠 개념 1: Git이란?

- **버전 관리 시스템**  
- 파일의 변경 이력을 기록하고 관리  
- 협업 시 충돌 방지 및 이력 추적 가능

---

<!-- _class: aqua -->
## 🧠 개념 2: Git과 GitHub의 차이

| 항목 | Git | GitHub |
|------|-----|--------|
| 저장 위치 | 로컬 (내 컴퓨터) | 클라우드 (웹 서버) |
| 사용 방식 | 명령어 기반 | 웹 UI + 명령어 |
| 연결성 | 오프라인 가능 | 온라인 중심 |
| 역할 | 버전 관리 도구 | 저장소 + 협업 플랫폼 |

---

<!-- _class: aqua -->
## 🧠 개념 3: GitHub이 뭐예요?

| | 항목 | 설명 |
|:--:|:--|:--|
| 🧠 | <span class="mark">GitHub</span> | 개발자들의 작업 공간 |
| 📦 | <span class="mark">저장 상자</span> | 컴퓨터 안의 나만의 저장 공간 |
| 🎨 | <span class="mark">코드나 자료</span> | 내가 만든 것을 담는 공간 |
| 🤝 | <span class="mark">협업</span> | 친구와 함께 사용하는 공유 공간 |

---

<!-- _class: aqua -->
## 🧠 개념 4: GitHub을 왜 써요?

| | 항목 | 설명 |
|:--:|:--|:--|
| 🛠️ | <span class="mark">기록</span> | 만든 것을 안전하게 저장 |
| 🌐 | <span class="mark">공유</span> | 다른 사람과 함께 발전 |
| 👥 | <span class="mark">협업</span> | 여러 사람이 함께 작업 가능 |

---

<!-- _class: aqua -->
## 🧠 개념 5: 기억하기 쉽게!

- <span class="mark">GitHub</span>은 코드를 저장하고 공유하는 공간  
- 협업을 위한 <span class="mark">버전 관리 도구</span>  
- 개발자들의 <span class="mark">작업 이력서 + 포트폴리오</span>




---

<!-- _class: blue -->
# 🧪 Step 2: 기본 명령어 따라하기


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
## 기본 3:  저장하기


```bash
git commit -m "완성!"
```

> "이제 그림을 저장했어요!"




---

<!-- _class: green -->
# 🛠️ Step 3: 실습 과제

---
<!-- _class: aqua -->

## 🧪 실습 0-1: Git 설치 및 환경 설정  <br/> GitHub 회원가입 & 저장소 만들기

1. [GitHub 회원가입](https://github.com) 후 로그인  
2. 원격 저장소 생성  
   👉 `https://github.com/sally03915/git0.git`

---

<!-- _class: aqua -->
## 🧪 실습 0-2: Git 설치하기

1. [Git 공식 사이트](https://git-scm.com) 접속  
2. 운영체제에 맞는 설치 파일 다운로드  
3. 설치 후 터미널에서 아래 명령어로 확인:

```bash
git --version
```

> ✅ 버전이 출력되면 설치 완료!

---

<!-- _class: aqua -->
## 🧪 실습 0-3: 사용자 정보 설정

<pre class="codeblock">
git config --global user.name "sally An"
git config --global user.email "sally03915@gmail.com"
git config --list
</pre>

> GitHub 계정과 연결되는 사용자 정보 설정

---

<!-- _class: aqua -->
## 🧪 실습 0-3: 설정 결과 예시

<pre class="codeblock">
Administrator@User MINGW64 ~
$ git config --global user.name  "sally An"
$ git config --global user.email "sally03915@gmail.com"
$ git config --list
 
user.name=sally An
user.email=sally03915@gmail.com
core.autocrlf=true
credential.helper=manager
init.defaultbranch=master
</pre>

---

<!-- _class: aqua -->
## 🧪 실습 0-4: 폴더 만들고 VS Code로 열기

<pre class="codeblock">
C:\> mkdir git0
C:\> cd git0
C:\git0> code .
</pre>

> Visual Studio Code에서 프로젝트 폴더 열기  
> [Terminal] → [New Terminal] 클릭

---

<!-- _class: aqua -->
## 🧪 실습 0-5: 파일 만들고 Git 초기화

1. ***basic001.html*** 파일 생성  
2. Git 저장소 초기화

<pre class="codeblock">
git init
git add .
git status
git commit -m "first commit"
</pre>

> 변경사항을 기록하고 커밋까지 완료!

---

<!-- _class: aqua -->
## 🧪 실습 0-6: 원격 저장소 연결 및 푸시

<pre class="codeblock">
git remote add origin https://github.com/sally03915/git0.git
git remote -v
git push origin master
</pre>

> 로컬 저장소를 GitHub와 연결하고 업로드 완료!

---

<!-- _class: aqua -->
## 🧪 실습 0-7: GitHub에서 확인하기

- GitHub 웹사이트 접속  
- ***git0*** 저장소에 ***basic001.html*** 파일이 올라갔는지 확인

---

<!-- _class: red -->
## ⚠️ 실습 중 오류 해결 팁

403 오류 발생 시:

<pre class="codeblock">
remote: Permission denied to oldaccount
fatal: unable to access 'https://github.com/...': error: 403
</pre>




---

<!-- _class: red -->
## ⚠️ 실습 중 오류 해결 팁

403 오류 발생 시 해결 방법:

1. Windows 제어판 → 자격 증명 관리  
2. 일반 자격 증명 탭에서 기존 GitHub 토큰 삭제  
3. 새 사용자 정보 추가:

<pre class="codeblock">
git:https://github.com
사용자이름: sally03915
암호: GitHub 로그인 비밀번호
</pre>

---

<!-- _class: green -->
## ✅ 실습  요약

| 단계 | 설명 |
|------|------|
| GitHub 가입 | 저장소 생성 |
| Git 설치 | 버전 확인 |
| 사용자 설정 | 이름 & 이메일 등록 |
| 폴더 생성 | VS Code로 열기 |
| Git 명령어 | init → add → commit → push |
| 오류 해결 | 자격 증명 관리

> 이제 Git 환경이 완벽하게 준비됐어요! 🎉



---

<!-- _class: aqua -->
## 🧪 실습 ①: 나만의 상자 만들기

```bash
git init
```

> 컴퓨터에게 "내 프로젝트 시작할게!"라고 말하는 거예요


<pre class="codeblock">
$ git init
Initialized empty Git repository in /Users/sajang/project/.git/
</pre>

---

<!-- _class: aqua -->
## 🧪 실습 ②: 그림 넣기

```bash
git add .
```

> 그림을 상자에 넣는다고 상상해보세요!


<pre class="codeblock">
$ git add .
(파일들이 스테이지에 올라갑니다)
</pre>

---

<!-- _class: aqua -->
## 🧪 실습 ③: 이름 붙이기

```bash
git commit -m "그림 저장!"
```

> 그림에 이름을 붙여서 저장해요!


<pre class="codeblock">
$ git commit -m "그림 저장!"
[main (root-commit) abc123] 그림 저장!
 3 files changed, 120 insertions(+)
</pre>

---

<!-- _class: aqua -->
## ✅ 실습 요약

| 단계 | 명령어 | 의미 |
|------|--------|------|
| ①   | <span class="mark">git init </span> | 상자 만들기 |
| ②   | <span class="mark">git add . </span> | 그림 넣기 |
| ③   | <span class="mark">git commit -m "..."</span> | 이름 붙이기 |

> 이제 여러분만의 상자가 완성됐어요! 🎉




---
## ① github 회원가입 & 로그인  

---
<!-- _class: ex -->
## ① github 회원가입 & 로그인 (1/7)
<img src="./images_github/001_회원가입.png" alt="github 회원가입 & 로그인" width="100%"/>

---
<!-- _class: ex -->
## ② github 회원가입 & 로그인 (2/7)
<img src="./images_github/002.png" alt="github 회원가입 & 로그인"  width="45%"/>

---
<!-- _class: ex -->
## ③ github 회원가입 & 로그인 (3/7)
<img src="./images_github/003.png" alt="github 회원가입 & 로그인" />

---
<!-- _class: ex -->
## ④ github 회원가입 & 로그인 (4/7)
<img src="./images_github/004.png" alt="github 회원가입 & 로그인" />

---
<!-- _class: ex -->
## ⑤ github 회원가입 & 로그인 (5/7)
<img src="./images_github/005.png" alt="github 회원가입 & 로그인" width="100%"/>

---
<!-- _class: ex -->
## ⑥ github 회원가입 & 로그인 (6/7)
<img src="./images_github/006.png" alt="github 회원가입 & 로그인" width="100%"/>

---
<!-- _class: ex -->
## ⑦ github 회원가입 & 로그인 (7/7)
<img src="./images_github/007.png" alt="github 회원가입 & 로그인" width="100%"/>


---
## ② github 저장소 
---
<!-- _class: ex -->
## ② github 저장소 (1/5)
<img src="./images_github/008_저장소.png" alt="github 저장소" width="100%"/>

---
<!-- _class: ex -->
## ② github 저장소 (2/5)
<img src="./images_github/009.png" alt="github 저장소" width="40%"/>

---
<!-- _class: ex -->
## ② github 저장소 (3/5)
<img src="./images_github/010.png" alt="github 저장소" width="100%"/>

---
<!-- _class: ex -->
## ② github 저장소 (4/5)
<img src="./images_github/011.png" alt="github 저장소" width="100%"/>

---
<!-- _class: ex -->
## ② github 저장소 (5/5)
<img src="./images_github/012.png" alt="github 저장소" width="100%"/>


---
## ③ git 다운로드 및 설치
 ---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (1/7)
<img src="./images_github/013_git.png" alt="git 다운로드 및 설치" width="100%"/>

---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (2/7)
<img src="./images_github/014.png" alt="git 다운로드 및 설치" width="100%"/>

---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (3/7)
<img src="./images_github/015.png" alt="git 다운로드 및 설치" width="100%"/>

---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (4/7)
<img src="./images_github/016.png" alt="git 다운로드 및 설치" width="60%"/>

---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (5/7)
<img src="./images_github/016__GIT추가1.png" alt="git 다운로드 및 설치" width="60%"/>

---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (6/7)
<img src="./images_github/017.png" alt="git 다운로드 및 설치" width="60%"/>

---
<!-- _class: ex -->
## ③ git 다운로드 및 설치 (7/7)
<img src="./images_github/018.png" alt="git 다운로드 및 설치" width="60%"/>

---
## ④ git 로컬저장소저장 후 외부저장소 업로드
---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (1/16)
<img src="./images_github/019_git로컬저장소기본저장.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="60%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (2/16)
<img src="./images_github/020.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (3/16)
<img src="./images_github/021.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (4/16)
<img src="./images_github/023.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (5/16)
<img src="./images_github/024_터미널.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (6/16)
<img src="./images_github/025.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (7/16)
<img src="./images_github/026.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (8/16)
<img src="./images_github/027.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (9/16)
<img src="./images_github/028.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (10/16)
<img src="./images_github/029.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (11/16)
<img src="./images_github/030.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (12/16)
<img src="./images_github/031.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="60%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (13/16)
<img src="./images_github/032.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (14/16)
<img src="./images_github/033.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (15/16)
<img src="./images_github/034.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
<!-- _class: ex -->
### ④ git 로컬저장소저장 후 외부저장소 업로드 (16/16)
<img src="./images_github/035.png" alt="git 로컬저장소저장 후 외부저장소 업로드" width="100%"/>

---
## ⑤ git 파일수정후 다시 올리기

---
<!-- _class: ex -->
## ⑤ git 파일수정후 다시 올리기
<img src="./images_github/036_수정.png" alt="git 파일수정후 다시 올리기" width="100%"/> 

---
<!-- _class: ex -->
## ⑤ git 파일수정후 다시 올리기
<img src="./images_github/037.png" alt="git 파일수정후 다시 올리기" width="100%"/> 

---
<!-- _class: ex -->
## ⑤ git 파일수정후 다시 올리기
<img src="./images_github/038.png" alt="git 파일수정후 다시 올리기" width="30%"/> 





---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장
> 이제 우리가 배운 내용을 조금 더 생각해볼까요?


---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ①:   왜 상자를 만들까요?


- <span class="fragment">친구랑 같이 놀려고요</span>
- <span class="fragment">그림을 잃어버리지 않으려고요 </span>
- <span class="fragment">나중에 다시 꺼내보려고요</span>

---

<!-- _class: aqua -->
## ❓ 궁금한 이야기 ②: 저장 안 하면?

- <span class="fragment">그림이 사라져요 😢  </span>
- <span class="fragment">다시 그려야 해요 😮  </span>
> 그래서 저장이 중요해요!
> ✅ 저장은 우리의 그림을 지켜주는 안전벨트예요!


---
<!-- _class: red -->
# 🧠 Step 5: 기억 테스트

> 지금까지 배운 내용을 퀴즈로 확인해볼까요?

---

<!-- _class: aqua -->
## ❓ 퀴즈 1: ***git init***은 뭐예요?

- A. **상자 만들기** ✅  
- B. 그림 지우기  
- C. 이름 바꾸기

---

<!-- _class: aqua -->
## ❓ 퀴즈 2: ***git commit***은 뭐예요?

- A. **저장하고 이름 붙이기** ✅  
- B. 상자 흔들기  
- C. 그림 숨기기

---
 
<!-- _class: aqua -->
## 🎯 오늘 배운 것 요약

<br>

- <span class="mark">git init</span>   → **상자 만들기** (내 프로젝트 시작)

- <span class="mark">git add . </span>   
→ **그림 넣기** (변경된 파일 담기)

- <span class="mark">git commit -m "..." </span>  
 → **이름 붙이기** (작업 기록 남기기)

> 저장은 그림을 지켜주는 **안전벨트**예요!


---

<!-- _class: aqua -->
## 🎈 다음 시간 예고

> 오늘은 **코딩 상자 놀이**를 배웠어요  
> 다음엔 **상자에 그림을 올리고 내리는 법**도 배워요!

---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>
