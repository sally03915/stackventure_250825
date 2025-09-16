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
  📍 <strong>현재 위치:</strong> Chapter 5 · <em>squash and merge — 커밋 압축 병합</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">여러 커밋을 하나로 압축해 깔끔한 히스토리를 유지하는 병합 전략</span><br>
  <span class="fragment" style="color:#495057;">GitHub의 Pull Request에서 squash 옵션을 활용한 협업 방식</span>
</blockquote>

---
<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub Collaboration</h2>

<div class="track-outline">
  <span class="current-chapter">▶ Chapter 1: merge vs rebase — 기능 브랜치 병합 전략</span>
  <span>▶ Chapter 2: fetch vs pull — 원격 변경사항 반영 전략</span>
  <span>▶ Chapter 3: restore — 실수한 파일 되돌리기</span>
  <span>▶ Chapter 4: HEAD와 브랜치 포인터 — 커밋 탐색과 이동</span>
  <span>▶ Chapter 5: squash and merge — 커밋 압축 병합</span>
</div>


---
 <!-- _class: orange -->
# 🧩 Step 1: 핵심 개념   (1)
***Git 병합 전략 기초***  
→ ***merge***: 커밋 히스토리 유지  
→ ***rebase***: 커밋 히스토리 재정렬  

---

<!-- _class: aqua -->

### 📘 상황 설명  
1 팀원 **Alice** 는 ***feature/login*** 브랜치에서 로그인 기능을 개발했고, 이를 ***main*** 브랜치에 병합하려 한다.  
2. **Bob** 은 같은 시기에 ***feature/signup*** 브랜치에서 회원가입 기능을 개발 중이다.  
→ 두 사람은 각기 다른 병합 전략을 사용해 협업 중이다.

---

<!-- _class: aqua -->

### 🔍 병합 방식 비교  
- ***merge*** : 브랜치를 병합할 때 커밋 히스토리를 그대로 유지  
- ***rebase*** : 브랜치를 다른 브랜치 위로 재배치하여 히스토리를 깔끔하게 정리  
- 협업 시:  
  - ***merge*** 는 충돌을 줄이고 안정적  
  - ***rebase*** 는 히스토리를 정리할 때 유용  

---
<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

### 👩‍💻 Alice — ***merge*** 사용

```gitbash
git checkout main
git pull origin main
git merge feature/login
git push origin main
```

- ***feature/login*** 브랜치를 ***main*** 에 병합  
- 병합 커밋이 생성되어 히스토리에 남음  

---

<!-- _class: aqua -->

### 👨‍💻 Bob — ***rebase*** 사용

```gitbash
git checkout feature/signup
git fetch origin
git rebase origin/main
git push --force-with-lease
```

- ***main*** 브랜치의 최신 커밋을 ***feature/signup*** 위로 재배치  
- 커밋 히스토리가 선형으로 정리됨  

---

<!-- _class: aqua -->

## ✅ 병합 전략 요약표

| 전략 | 히스토리 | 협업 안정성 | 사용 시점 |
|------|-----------|----------------|-------------|
| ***merge*** | 병합 커밋 포함 | 안전 | 기능 완료 후 병합 |
| ***rebase*** | 선형 히스토리 | 위험 (강제 푸시 필요) | 기능 개발 중 최신 반영 |

---

<!-- _class: aqua -->

### ❓ 왜 ***rebase*** 를 써야 하나요?

- 협업 중 여러 브랜치가 동시에 작업되면 커밋 히스토리가 복잡해질 수 있습니다.  
- ***rebase*** 는 **내 작업을 최신 브랜치 위로 재배치** 하여 **히스토리를 선형으로 정리** 합니다.  
- 병합 커밋 없이 깔끔한 흐름을 만들 수 있어, **리뷰와 디버깅이 쉬워집니다.**

---

<!-- _class: aqua -->

### 🔄 ***merge*** vs ***rebase*** 히스토리 비교

#### ***merge*** 사용 시

```git
main: A---B---C
              \
feature:       D---E
               \
merged:        F (merge commit)
```

#### ***rebase*** 사용 시

```
main: A---B---C
                  \
feature:           D'---E' (재배치된 커밋)
```

- ***merge***는 병합 커밋(F)이 생기고 히스토리가 분기됨  
- ***rebase***는 커밋을 재배치하여 하나의 흐름으로 이어짐

---

<!-- _class: aqua -->

### ✅ ***rebase***가 유용한 상황

- 기능 브랜치에서 작업 중인데 ***main*** 브랜치가 업데이트된 경우  
- Pull Request 전에 커밋 히스토리를 정리하고 싶을 때  
- 리뷰어가 보기 쉽게 커밋을 정리하고 싶을 때

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제

---

<!-- _class: aqua -->
1. ***merge*** 를 사용할 때 커밋 히스토리는 어떻게 되나요?  
2. ***rebase*** 후 충돌이 발생하면 어떻게 해결하나요?  
3. 협업 중인 브랜치에서 ***rebase*** 를 사용할 때 주의할 점은 무엇인가요?  
4. ***git push --force-with-lease*** 는 왜 필요한가요?

---

<!-- _class: aqua -->

## 📝 Step 4: 연습문제 답안

1. ***merge*** 는 병합 커밋을 생성하며, 기존 커밋 히스토리를 그대로 유지합니다.  
2. 충돌이 발생하면 충돌 파일을 수정한 후 ***git add .*** → *** git rebase --continue*** 로 해결합니다.  
3. 공유 브랜치에서는 ***rebase*** 사용 시 강제 푸시가 필요하므로, 다른 팀원의 작업을 덮어쓸 위험이 있습니다.  
4. ***--force-with-lease*** 는 강제 푸시 시 다른 사람의 변경사항을 덮어쓰지 않도록 안전하게 푸시합니다.

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->
- ***merge*** 는 어떤 방식으로 병합하나요?  
- ***rebase*** 는 어떤 방식으로 히스토리를 정리하나요?  
- ***merge*** 와 ***rebase*** 중 협업 시 더 안전한 방법은 무엇인가요?  
- ***rebase*** 후 강제 푸시가 필요한 이유는 무엇인가요?
 
 ---
 <!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub Collaboration</h2>

<div class="track-outline">
  <span>▶ Chapter 1: merge vs rebase — 기능 브랜치 병합 전략</span>
  <span class="current-chapter">▶ Chapter 2: fetch vs pull — 원격 변경사항 반영 전략</span>
  <span>▶ Chapter 3: restore — 실수한 파일 되돌리기</span>
  <span>▶ Chapter 4: HEAD와 브랜치 포인터 — 커밋 탐색과 이동</span>
  <span>▶ Chapter 5: squash and merge — 커밋 압축 병합</span>
</div>


---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  (2) 
***Git 원격 변경사항 반영 전략***  
→ ***fetch***: 변경사항을 가져오되 병합은 하지 않음  
→ ***pull***: 변경사항을 가져오고 자동 병합까지 수행  

---

<!-- _class: aqua -->

### 📘 상황 설명  
1. Charlie는 ***main*** 브랜치에서 작업 중인데, 다른 팀원이 새로운 기능을 푸시했다.  
→ 충돌 없이 안전하게 변경사항을 반영하고 싶다.  
→ ***fetch*** 와 ***pull*** 중 어떤 전략이 더 적절할까?

---
<!-- _class: aqua -->

### 🔍 개념 비교  
- ***fetch*** : 원격 저장소의 변경사항을 로컬로 가져오지만 병합은 하지 않음  
- ***pull*** : ***fetch*** + ***merge*** 를 동시에 수행  
- 협업 시:  
  - ***fetch*** 는 변경사항을 미리 확인할 수 있어 안전  
  - ***pull*** 은 간편하지만 충돌 발생 시 자동 병합되므로 주의 필요

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

### 👨‍💻 변경사항 확인 후 병합 (***fetch*** 사용)

```gitbash
git fetch origin
git log HEAD..origin/main
git merge origin/main
```

- 원격 저장소의 변경사항을 확인한 후 직접 병합  
- 충돌 여부를 사전에 파악 가능

---

<!-- _class: aqua -->

### 👨‍💻 간편하게 병합 (***pull*** 사용)

*********gitbash
git pull origin main
*********git

- ***fetch*** 와 ***merge*** 를 동시에 수행  
- 자동 병합되며, 충돌 발생 시 직접 해결 필요

---

<!-- _class: aqua -->

## ✅ 전략 요약표

| 명령어 | 병합 여부 | 안전성 | 사용 시점 |
|--------|------------|---------|-------------|
| ***fetch*** | 병합 안 함 | 안전 | 변경사항 확인 후 수동 병합 |
| ***pull*** | 자동 병합 | 간편하지만 위험 | 빠르게 최신화할 때 사용 |

---

<!-- _class: aqua -->

### ❓ 왜 ***fetch*** 를 써야 하나요?

- 협업 중에는 다른 사람이 푸시한 변경사항을 **미리 확인** 하는 것이 중요합니다.  
- ***fetch*** 는 병합하지 않고 변경사항만 가져오기 때문에,  
  → **충돌 가능성을 사전에 파악** 할 수 있습니다.  
- 특히 중요한 브랜치(***main*** , ***release***)에서는 **신중한 병합** 이 필요합니다.

---

<!-- _class: aqua -->

### 🔄 ***fetch*** vs ***pull*** 히스토리 흐름

#### ***fetch*** 사용 시

```git
origin/main: A---B---C
local/main:  A---B
             ↑
         fetch로 C를 가져옴 (병합은 안 함)
```

#### ***pull*** 사용 시

```git
origin/main: A---B---C
local/main:  A---B---C (자동 병합됨)
```

- ***fetch*** 는 병합 전 확인 가능  
- ***pull*** 은 바로 병합되므로 충돌 시 복잡해질 수 있음

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

---

<!-- _class: aqua -->

1. ***fetch*** 와 ***pull*** 의 가장 큰 차이점은 무엇인가요?  
2. ***fetch*** 후 변경사항을 확인하려면 어떤 명령어를 사용하나요?  
3. ***pull*** 을 사용할 때 주의해야 할 점은 무엇인가요?  
4. 협업 중 중요한 브랜치에서는 어떤 전략이 더 적절한가요?

---

<!-- _class: aqua -->

## 📝 Step 4: 연습문제 답안

1. ***fetch*** 는 병합하지 않고 변경사항만 가져오며, ***pull*** 은 자동 병합까지 수행합니다.  
2. ***git log HEAD..origin/main*** 또는 ***git diff HEAD origin/main*** 으로 확인할 수 있습니다.  
3. 자동 병합되므로 충돌 발생 시 복잡해질 수 있으며, 사전 확인이 어렵습니다.  
4. 중요한 브랜치에서는 ***fetch*** 로 변경사항을 확인한 후 수동 병합하는 것이 더 안전합니다.

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- ***fetch*** 는 어떤 방식으로 변경사항을 가져오나요?  
- ***pull*** 은 어떤 작업을 동시에 수행하나요?  
- 협업 중 충돌을 피하려면 어떤 전략이 더 적절한가요?  
- ***fetch*** 후 병합하려면 어떤 명령어를 사용하나요?

---
<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub Collaboration</h2>

<div class="track-outline">
  <span>▶ Chapter 1: merge vs rebase — 기능 브랜치 병합 전략</span>
  <span>▶ Chapter 2: fetch vs pull — 원격 변경사항 반영 전략</span>
  <span class="current-chapter">▶ Chapter 3: restore — 실수한 파일 되돌리기</span>
  <span>▶ Chapter 4: HEAD와 브랜치 포인터 — 커밋 탐색과 이동</span>
  <span>▶ Chapter 5: squash and merge — 커밋 압축 병합</span>
</div>

 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  (3)
***Git 파일 복구 전략***  
→ ***restore***: 수정된 파일을 이전 상태로 되돌림  
→ 실수한 변경을 빠르게 복구할 수 있는 안전한 명령어

---

<!-- _class: aqua -->

### 📘 상황 설명  
Alice가 ***style.css*** 를 잘못 수정했다.  
→ 이전 상태로 되돌리고 싶지만, 커밋은 하지 않은 상태이다.  
→ Git의 ***restore*** 명령어를 사용해 안전하게 복구할 수 있다.

---

<!-- _class: aqua -->

### 🔍 ***restore*** 개념 이해  
- ***restore*** 는 Git 2.23부터 도입된 명령어  
- **수정된 파일을 이전 상태로 되돌릴 때 사용**  
- ***checkout*** 과 유사하지만, 역할이 더 명확하게 분리됨  
  - ***restore***: 파일 복구  
  - ***switch***: 브랜치 이동  
- 실수한 변경을 되돌릴 때 가장 안전한 방법

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

### 👩‍💻 수정 전 상태로 복구

```gitbash
git restore style.css
```

- ***style.css*** 파일을 마지막 커밋 상태로 되돌림  
- 아직 커밋하지 않은 변경사항을 제거

---

<!-- _class: aqua -->

### 👩‍💻 특정 커밋 기준으로 복구

```gitbash
git restore --source=HEAD~1 style.css
```

- ***HEAD~1*** 커밋 기준으로 ***style.css*** 를 복구  
- 과거 특정 시점의 파일 상태로 되돌릴 수 있음

---

<!-- _class: aqua -->

## ✅ 복구 전략 요약표

| 명령어 | 복구 대상 | 사용 시점 |
|--------|------------|-------------|
| ***git restore style.css*** | 마지막 커밋 상태 | 실수로 수정한 파일 복구 |
| ***git restore --source=HEAD~1 style.css*** | 특정 커밋 기준 | 과거 상태로 되돌릴 때 |

---

<!-- _class: aqua -->

### ❓ 왜 ***restore***를 써야 하나요?

- 실수로 파일을 수정했을 때, **커밋하지 않았다면 복구가 어려움**  
- ***restore*** 는 **커밋 전 변경사항을 되돌릴 수 있는 안전한 방법**  
- ***checkout*** 보다 명확한 역할 분리로 실수 방지  
- 협업 중에도 **파일 단위로 복구 가능** 하여 유용함

---

<!-- _class: aqua -->

### 🔄 ***restore*** vs ***checkout*** 비교

| 명령어 | 목적 | 위험성 | 추천 상황 |
|--------|------|--------|-------------|
| ***restore*** | 파일 복구 | 낮음 | 실수한 파일 되돌릴 때 |
| ***checkout*** | 브랜치 이동/파일 복구 | 혼동 가능 | 브랜치 전환 시 사용 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

---

<!-- _class: aqua -->

1. ***git restore style.css*** 는 어떤 상태로 되돌리나요?  
2. ***--source=HEAD~1*** 옵션은 어떤 역할을 하나요?  
3. ***restore*** 와 ***checkout*** 의 차이점은 무엇인가요?  
4. 커밋하지 않은 변경사항을 되돌릴 때 어떤 명령어를 사용하나요?

---

<!-- _class: aqua -->

## 📝 Step 4: 연습문제 답안

1. 마지막 커밋 상태로 ***style.css*** 를 되돌립니다.  
2. 과거 커밋( ***HEAD~1*** ) 기준으로 파일을 복구합니다.  
3. ***restore*** 는 파일 복구 전용, ***checkout*** 은 브랜치 이동과 복구를 혼합적으로 사용합니다.  
4. ***git restore <파일명>*** 명령어를 사용합니다.

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- ***restore*** 는 어떤 상황에서 사용하나요?  
- ***checkout*** 과의 차이점은 무엇인가요?  
- ***--source*** 옵션은 어떤 기능을 하나요?  
- 커밋하지 않은 변경을 되돌릴 때 가장 안전한 명령어는 무엇인가요?


---
<!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub Collaboration</h2>

<div class="track-outline">
  <span>▶ Chapter 1: merge vs rebase — 기능 브랜치 병합 전략</span>
  <span>▶ Chapter 2: fetch vs pull — 원격 변경사항 반영 전략</span>
  <span>▶ Chapter 3: restore — 실수한 파일 되돌리기</span>
  <span class="current-chapter">▶ Chapter 4: HEAD와 브랜치 포인터 — 커밋 탐색과 이동</span>
  <span>▶ Chapter 5: squash and merge — 커밋 압축 병합</span>
</div>

 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념 (4)  
***Git 커밋 압축 병합 전략***  
→ ***Squash and merge*** : 여러 커밋을 하나로 압축하여 병합  
→ 깔끔한 커밋 히스토리를 유지하고 협업 시 가독성을 높임

---

<!-- _class: aqua -->

### 📘 상황 설명  
Charlie가 ***feature/sidebar*** 브랜치에서 여러 커밋으로 작업했다.  
→ 기능은 완성되었지만 커밋이 너무 많아 히스토리가 지저분하다.  
→ 병합 시 하나의 커밋으로 정리하고 싶다.  
→ GitHub의 ***Squash and merge*** 기능을 사용한다.

---

<!-- _class: aqua -->

### 🔍 개념 이해  
- ***Squash*** 는 여러 커밋을 하나로 압축하는 작업  
- GitHub에서는 Pull Request 병합 시 ***Squash and merge*** 옵션을 제공  
- 병합 후 ***main*** 브랜치에는 하나의 커밋만 남게 됨  
- 커밋 메시지를 직접 정리할 수 있어 의미 있는 히스토리 작성 가능

---

<!-- _class: blue -->
# 🧪 Step 2: 실습 예제

---

<!-- _class: aqua -->

### 👨‍💻 GitHub에서 Squash 병합하기

1. ***feature/sidebar*** 브랜치에서 Pull Request 생성  
2. 병합 버튼 옆의 ▼ 클릭 → ***Squash and merge*** 선택  
3. 커밋 메시지를 정리  
4. ***Confirm squash and merge*** 클릭

---

<!-- _class: aqua -->

## ✅ 병합 전략 요약표

| 병합 방식 | 커밋 수 | 히스토리 | 사용 시점 |
|-----------|----------|------------|-------------|
| ***Merge*** | 여러 커밋 유지 | 복잡할 수 있음 | 기능 병합 시 일반적 |
| ***Squash and merge*** | 하나의 커밋 | 깔끔하고 간결 | 리뷰 후 병합 시 추천 |

---

<!-- _class: aqua -->

### ❓ 왜 ***Squash and merge*** 를 써야 하나요?

- 기능 브랜치에서 작업한 커밋이 많을 경우,  
  → ***main*** 브랜치에 병합하면 히스토리가 복잡해질 수 있음  
- ***Squash and merge***는 **작업 결과만 하나의 커밋으로 병합**  
- 리뷰어가 보기 쉬운 히스토리를 만들 수 있고,  
  → **협업 시 커밋 로그 관리가 쉬워짐**

---

<!-- _class: aqua -->

### 🔄 Squash 전후 히스토리 비교

#### 병합 전

```git
feature/sidebar: A---B---C---D
```

#### 병합 후 (***Squash and merge***)

```git
main: E (A~D 압축된 하나의 커밋)
```

- 여러 커밋이 하나로 합쳐져 ***main*** 에 병합됨  
- 커밋 메시지는 직접 작성 가능

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

---

<!-- _class: aqua -->

1. ***Squash and merge*** 는 어떤 상황에서 유용한가요?  
2. 병합 후 ***main*** 브랜치에는 몇 개의 커밋이 남나요?  
3. GitHub에서 squash 병합을 하려면 어떤 옵션을 선택해야 하나요?  
4. 커밋 메시지는 squash 병합 시 어떻게 처리되나요?

---

<!-- _class: aqua -->

## 📝 Step 4: 연습문제 답안

1. 기능 브랜치에서 커밋이 많을 때, 깔끔한 히스토리를 유지하고 싶을 때 유용합니다.  
2. 여러 커밋이 하나로 압축되므로 ***main*** 에는 하나의 커밋만 남습니다.  
3. Pull Request 병합 시 ***Squash and merge*** 옵션을 선택합니다.  
4. 병합 시 직접 커밋 메시지를 정리하여 의미 있는 메시지를 남길 수 있습니다.

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- ***Squash and merge*** 는 어떤 병합 방식인가요?  
- 병합 후 커밋 히스토리는 어떻게 달라지나요?  
- 협업 시 squash 병합의 장점은 무엇인가요?  
- GitHub에서 squash 병합을 하려면 어떤 절차를 따라야 하나요?


---
 <!-- _class: cover-githubai --> 
<h2 style="font-size:1.6em; color:#555;">목차 : GitHub Collaboration</h2>

<div class="track-outline">
  <span>▶ Chapter 1: merge vs rebase — 기능 브랜치 병합 전략</span>
  <span>▶ Chapter 2: fetch vs pull — 원격 변경사항 반영 전략</span>
  <span>▶ Chapter 3: restore — 실수한 파일 되돌리기</span>
  <span>▶ Chapter 4: HEAD와 브랜치 포인터 — 커밋 탐색과 이동</span>
  <span class="current-chapter">▶ Chapter 5: squash and merge — 커밋 압축 병합</span>
</div>

---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  (5)
***Git 커밋 되돌리기 전략***  
→ ***revert***: 기존 커밋을 취소하는 새 커밋 생성  
→ ***reset***: 커밋 자체를 삭제하여 이전 상태로 되돌림

---

<!-- _class: aqua -->

### 📘 상황 설명  
Bob이 실수로 ***main*** 브랜치에 잘못된 커밋을 푸시했다.  
→ 협업 중이므로 다른 사람의 작업에 영향을 주지 않도록 **안전하게 되돌려야 한다.**  
→ 공유 브랜치에서는 ***revert***, 개인 브랜치에서는 ***reset***을 사용한다.

---

<!-- _class: aqua -->

### 🔍 개념 이해  
- ***revert***: 기존 커밋을 취소하는 **새로운 커밋**을 생성  
  → 히스토리를 보존하면서 되돌림  
- ***reset***: 커밋 자체를 삭제하고 이전 상태로 되돌림  
  → 히스토리가 변경되며, **강제 푸시가 필요함**  
- 협업 중에는 ***revert***가 안전하고, 개인 작업에는 ***reset*** 이 유용

---

<!-- _class: blue -->
# 🧪 Step 2: 실습 예제

---

<!-- _class: aqua -->

### 👨‍💻 공유 브랜치에서 ***revert*** 사용

```gitbash
git log
git revert <commit_hash>
git push origin main
```

- 잘못된 커밋을 취소하는 새 커밋 생성  
- 다른 팀원의 작업에 영향을 주지 않음

---

<!-- _class: aqua -->

### 👨‍💻 개인 브랜치에서 ***reset*** 사용

```gitbash
git reset --hard HEAD~1
git push --force-with-lease
```

- 이전 커밋으로 되돌리고 히스토리를 덮어씀  
- 강제 푸시가 필요하며, 협업 중에는 위험할 수 있음

---

<!-- _class: aqua -->

## ✅ 되돌리기 전략 요약표

| 전략 | 히스토리 | 협업 안정성 | 사용 시점 |
|------|-----------|----------------|-------------|
| ***revert*** | 취소 커밋 생성 | 안전 | 공유 브랜치에서 사용 |
| ***reset*** | 커밋 삭제 | 위험 | 개인 브랜치에서 사용 |

---

<!-- _class: aqua -->

### ❓ 왜 ***revert***와 ***reset***을 구분해야 하나요?

- 협업 중에는 다른 사람의 작업을 **보존하는 것이 중요**  
- ***revert*** 는 기존 커밋을 취소하지만 히스토리는 남기므로 **팀원 간 충돌이 없음**  
- ***reset*** 은 커밋 자체를 삭제하므로 **공유 브랜치에서 사용하면 위험**  
- 상황에 따라 전략을 구분해야 안전한 협업이 가능함

---

<!-- _class: aqua -->

### 🔄 ***revert*** vs ***reset*** 히스토리 비교

#### ***revert*** 사용 시

```git
main: A---B---C---D
                  \
                   E (D를 취소하는 새 커밋)
```

#### ***reset*** 사용 시

```git
main: A---B---C (D 삭제됨)
```

- ***revert*** 는 취소 커밋을 추가  
- ***reset*** 은 커밋 자체를 제거

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

---

<!-- _class: aqua -->

1. ***revert*** 는 어떤 방식으로 커밋을 되돌리나요?  
2. ***reset*** 을 사용할 때 주의할 점은 무엇인가요?  
3. 공유 브랜치에서는 어떤 전략이 더 적절한가요?  
4. ***git push --force-with-lease*** 는 왜 필요한가요?

---

<!-- _class: aqua -->

## 📝 Step 4: 연습문제 답안

1. 기존 커밋을 취소하는 새로운 커밋을 생성합니다.  
2. 커밋 히스토리가 변경되며, 강제 푸시가 필요하고 협업 중에는 위험합니다.  
3. ***revert*** 가 더 적절하며, 히스토리를 보존하면서 안전하게 되돌릴 수 있습니다.  
4. 강제 푸시 시 다른 사람의 변경사항을 덮어쓰지 않도록 안전하게 푸시합니다.

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- ***revert*** 는 어떤 방식으로 커밋을 되돌리나요?  
- ***reset*** 은 어떤 상황에서 사용하는 것이 적절한가요?  
- 협업 중 커밋을 되돌릴 때 어떤 전략이 더 안전한가요?  
- ***reset*** 후 푸시할 때 어떤 옵션을 사용해야 하나요?


---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!

> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>
