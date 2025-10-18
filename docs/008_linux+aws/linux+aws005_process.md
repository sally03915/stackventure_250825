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
  section.cover-aws {
    background: linear-gradient(135deg, #fceabb, #f8b500, #ffd6e8, #c1f0f6, #d0f4de, #fef9d7);
    color: #333;
  }
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
<!-- _class: cover-aws -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🧠</span>
  CodeCraft Series · Track 04
</h4>
<h1 style="color:#007BFF;">Linux & AWS Fundamentals</h1>
<h3 style="color:#17A2B8;">리눅스 기초부터 클라우드 배포까지, 인프라의 핵심을 배우다</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 1· <em>리눅스란? · Linux 설치 </em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">실무에 바로 적용 가능한 리눅스 & AWS 입문서</span><br>
  <span class="fragment" style="color:#495057;">터미널과 클라우드 콘솔을 넘나들며, 인프라의 기초를 다져요</span>
</blockquote>


---
<!-- _class: cover-aws -->
<h2 style="font-size:1.6em; color:#555;">📚 Linux + AWS 트랙 목차</h2>
<h3> Part001:  리눅스 기초와 운영</h3>
<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 1: 리눅스란? · Setting</span>
  <span>▶ Chapter 2:  기본 명령어 </span>
  <span>▶ Chapter 3:  파일 시스템 </span>
  <span>▶ Chapter 4:  사용자 · 권한</span>
  <span>▶ Chapter 5:  프로세스· 패키지 관리 · 서비스 · 로그</span>
  <span>▶ Chapter 6:  쉘 스크립트 · 자동화</span>
</div>

 
---
<!-- _class: cover-aws -->
<h2 style="font-size:1.6em; color:#555;">📚 Linux + AWS 트랙 목차</h2>
<h3> Part002: 클라우드 인프라와 배포</h3>

<div class="track-outline">
<span>▶ Chapter 7: AWS 개요</span>
<span>▶ Chapter 8: EC2 인스턴스</span>
<span>▶ Chapter 9: S3 스토리지</span>
<span>▶ Chapter 10: CI/CD · Github Actions</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 리눅스 운영체제의 핵심 개념을 익히고,<br/> AWS를 활용한 클라우드 인프라 구축까지 이어집니다.
</p>




--- <!-- _class: orange -->
# 🧩 Step 1: 핵심 개념
***리눅스 프로세스 관리***  
  → ***프로세스 확인***, ***프로세스 종료***, ***백그라운드 실행***, ***우선순위 조정***, ***실시간 모니터링***

--- <!-- _class: aqua -->
### 🔍 프로세스 확인
- ***ps*** : 현재 실행 중인 프로세스 목록
- ***ps -ef*** : 전체 프로세스 상세 정보
- ***ps aux*** : 사용자 기준 전체 프로세스
- ***top*** : 실시간 프로세스 모니터링
- ***htop*** : top의 향상된 버전 (설치 필요)

--- <!-- _class: aqua -->
### 🧩 프로세스 종료 및 제어
- ***kill PID*** : 특정 프로세스 종료
- ***kill -9 PID*** : 강제 종료
- ***pkill 프로세스명*** : 이름으로 프로세스 종료
- ***xkill*** : GUI 창 클릭으로 종료 (GUI 환경에서 사용)

--- <!-- _class: aqua -->
### 🔗 백그라운드 실행 및 우선순위
- ***&*** : 명령어를 백그라운드로 실행
- ***jobs*** : 백그라운드 작업 목록 확인
- ***fg %번호*** : 백그라운드 작업을 포그라운드로 전환
- ***nice*** : 프로세스 우선순위 설정
- ***renice PID 우선순위*** : 실행 중인 프로세스 우선순위 변경

--- <!-- _class: blue -->
# 🧪 Step 2: 코드 예제
--- <!-- _class: aqua -->
```bash
# 프로세스 확인
ps
ps -ef
ps aux
top

# 프로세스 종료
kill 1234
kill -9 1234
pkill firefox
xkill

# 백그라운드 실행 및 제어
gedit &
jobs
fg %1

# 우선순위 설정
nice -n 10 ./my_script.sh
renice -n 5 1234
```

--- <!-- _class: aqua -->
## ✅ 명령어 요약표

| 명령어 | 설명 |
|--------|------|
| ***ps / ps -ef / ps aux*** | 프로세스 목록 확인 |
| ***top / htop*** | 실시간 모니터링 |
| ***kill / pkill / xkill*** | 프로세스 종료 |
| ***& / jobs / fg*** | 백그라운드 실행 및 제어 |
| ***nice / renice*** | 우선순위 설정 및 변경 |

--- <!-- _class: aqua -->
- ***ps*** 는 현재 프로세스를 확인
- ***top / htop*** 은 실시간으로 모니터링
- ***kill / pkill*** 은 프로세스를 종료
- ***&*** 는 백그라운드 실행
- ***nice / renice*** 는 우선순위 조정

--- <!-- _class: green -->
# 🧪 Step 3: 연습문제
--- <!-- _class: aqua -->
1. ***ps -ef*** 명령어는 어떤 정보를 보여주나요?
2. ***kill -9 PID*** 는 어떤 상황에서 사용하나요?
3. ***jobs*** 명령어는 어떤 작업을 확인하나요?
4. ***renice -n 5 1234*** 는 어떤 변경을 하나요?

--- <!-- _class: red -->
# 🧪 Step 5: 기억 테스트
--- <!-- _class: aqua -->
- ***ps / top*** 명령어는 각각 어떤 방식으로 프로세스를 보여주나요?
- ***pkill*** 은 어떤 기준으로 프로세스를 종료하나요?
- ***&*** 를 붙이면 어떤 실행 방식이 되나요?
- ***fg*** 명령어는 어떤 작업을 전환하나요?
- ***nice / renice*** 는 어떤 역할을 하나요?





---  
<!-- _class: thanks -->  
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">이제 자바의 구조와 출력까지 완벽하게 이해했어요</span>  
> <span class="fragment">다음은 변수와 자료형, 그리고 입력으로 넘어가볼까요?</span>
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
