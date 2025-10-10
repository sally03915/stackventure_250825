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
  section.cover-oracle        { background: linear-gradient(135deg, #89f7fe, #66a6ff, #4fc3f7, #29b6f6, #0288d1, #01579b); color: #fff; }
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
<!-- _class: cover-oracle -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🧠</span>
  CodeCraft Series · Track 02
</h4>
<h1 style="color:#007BFF;">Oracle Fundamentals</h1>
<h3 style="color:#17A2B8;">SQL부터 PL/SQL까지, 오라클의 핵심을 잡다</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 1 · <em>오라클 환경 설정 · 기본 SELECT</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">실무에 바로 적용 가능한 오라클 입문서</span><br>
  <span class="fragment" style="color:#495057;">데이터를 다루는 힘, SQL로 시작해요</span>
</blockquote>


---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
  <strong style="color:#FF6E7F;">PART 1 · SQL 기본</strong>
<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 01: oracle_setting</span>
  <span>▶ Chapter 02: select_basic</span>
  <span>▶ Chapter 03: select_where</span>
  <span>▶ Chapter 04: select_fn</span>
  <span>▶ Chapter 05: select_group</span>
  <span>▶ Chapter 06: select_join</span>
  <span>▶ Chapter 07: select_subquery</span>
</div>


---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
 <strong style="color:#FF6E7F;">PART 2 · 데이터 조작 및 객체</strong> 
<div class="track-outline"> 
  <span>▶ Chapter 08: update_delete</span>
  <span>▶ Chapter 09: transaction</span>
  <span>▶ Chapter 10: ddl</span>
  <span>▶ Chapter 11: object</span>
  <span>▶ Chapter 12: constraint</span>
  <span>▶ Chapter 13: user</span>
</div>


---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
<strong style="color:#FF6E7F;">PART 3 · PL/SQL 심화</strong>
<div class="track-outline">  
  <span>▶ Chapter 14: plsql</span>
  <span>▶ Chapter 15: record</span>
  <span>▶ Chapter 16: cursor</span>
  <span>▶ Chapter 17: save</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 오라클의 기본 SQL부터 객체 관리, PL/SQL까지<br/> 실무 중심으로 배우며, 데이터베이스 전문가로 성장합니다.
</p>
 


 
 
 
---
<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  

***Oracle 11g 설치 및 SCOTT 계정 설정***  
1.  ***설치***, 
2.  ***계정 생성/잠금 해제***, 
3.  ***SQL*Plus 접속***, 
4.  ***SQL Developer 사용***


---
<!-- _class: aqua -->
###  🔍 (1) 기본 설치 단계  
1. 오라클 공식 홈페이지에서 회원가입 및 로그인  
2. Oracle 11g Express Edition 다운로드  
3. 64비트 설치 파일 실행  
4. SQL*Plus 실행 후 system 계정으로 로그인  

---
<!-- _class: aqua -->
### 🧩 (2) SCOTT 계정 설정  
1. SCOTT 계정 잠금 해제 및 비밀번호 설정  
2. SCOTT 계정으로 접속  
3. EMP 테이블 구조 확인  
4. SQL*Plus 종료 및 재접속  

---

<!-- _class: aqua -->
### 🔗 (3) 오류 해결 및 계정 생성  
1 SCOTT 계정이 없을 경우 scott.sql 실행  
2 계정 생성 후 비밀번호 설정  
3 show user로 현재 사용자 확인  

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- SQL*Plus 실행
C:\Users\sallyAn> sqlplus
Enter user-name: system
Enter password: 1234

-- SCOTT 계정 잠금 해제
ALTER USER SCOTT IDENTIFIED BY tiger ACCOUNT UNLOCK;

-- SCOTT 계정으로 접속
CONN scott/tiger;

-- EMP 테이블 구조 확인
DESC EMP;

-- SQL*Plus 종료
EXIT;

-- SCOTT 계정으로 바로 접속
SQLPLUS scott/tiger;
</pre>

---

<!-- _class: aqua -->

## ✅ 명령어 요약표 (1/2)

| 명령어 | 설명 |
|--------|------|
| sqlplus | SQL*Plus 실행 |
| ALTER USER SCOTT IDENTIFIED BY tiger ACCOUNT UNLOCK; | SCOTT 계정 잠금 해제 |
| CONN scott/tiger; | SCOTT 계정으로 접속 | 
---

<!-- _class: aqua -->

## ✅ 명령어 요약표 (2/2)

| 명령어 | 설명 |
|--------|------| 
| DESC EMP; | EMP 테이블 구조 확인 |
| EXIT | SQL*Plus 종료 |
| SQLPLUS scott/tiger | SCOTT 계정으로 바로 접속 |


---

<!-- _class: aqua -->

- ***sqlplus*** 는 SQL*Plus를 실행하는 명령어  
- ***ALTER USER*** 는 계정의 상태를 변경  
- ***CONN*** 은 다른 계정으로 접속  
- ***DESC*** 는 테이블 구조를 확인  
- ***EXIT*** 는 SQL*Plus를 종료  

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제



---
<!-- _class: aqua -->
# 🧪 Step 3:  (1) oracle 접근하기
<pre class="codeblock">
C:\Users\sallyAn> sqlplus
Enter user-name: system
Enter password: 1234
</pre>


---
<!-- _class: aqua -->
# 🧪 Step 3:  (2) 계정잠금 풀기  
## 연습용 계정으로 접근
<pre class="codeblock">
ALTER USER SCOTT
IDENTIFIED BY tiger
ACCOUNT UNLOCK;
</pre>


---
<!-- _class: aqua -->
# 🧪 Step 3:  (3)  SCOTT 계정으로 재접속하기
<pre class="codeblock">
CONN scott/tiger;
</pre>

---
<!-- _class: aqua -->
# 🧪 Step 3:  (4)  emp 테이블 구성확인
<pre class="codeblock">
DESC EMP;
</pre>

---
<!-- _class: aqua -->
# 🧪 Step 3:  (4)  SQLPLUS 계정으로 접속하기
<pre class="codeblock">
SQLPLUS scott/tiger
</pre>


<!-- <img src="./chapter7-1/033.png" alt="" width="90%" /> -->


---
<!-- _class: aqua -->
**STEP1)**
<img src="./img/setting000_001.png" alt="" width="90%" />

---
<!-- _class: aqua -->
오라클 공식 홈페이지(http://www.oracle.com/kr)

---
<!-- _class: aqua -->
**STEP2)**
<img src="./img/setting000_002.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP3)**
<img src="./img/setting000_003.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP4)**
<img src="./img/setting000_004.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP5)**
<img src="./img/setting000_005.png" alt="" width="90%" />

---
<!-- _class: aqua -->
 [11g다운로드](https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)
(https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)



---
<!-- _class: aqua -->
**STEP6)**
<img src="./img/setting000_006.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP7)**
<img src="./img/setting000_007.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP8)**
<img src="./img/setting000_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
**STEP9)** <img src="./img/setting000_009.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP10)** <img src="./img/setting000_010.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP11)** <img src="./img/setting000_011.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP12)** <img src="./img/setting000_012.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP13)** <img src="./img/setting000_013.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP14)** <img src="./img/setting000_014.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP15)** <img src="./img/setting000_015.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP16)**
<img src="./img/setting000_016.png" alt="" width="90%" />

---
<!-- _class: aqua -->
<pre class="codeblock">
C:\Users\sallyAn> sqlplus
Enter user-name: system
Enter password: 1234
</pre>

---
<!-- _class: aqua -->
**STEP17)**
<img src="./img/setting000_017.png" alt="" width="90%" />

---
<!-- _class: aqua -->
<pre class="codeblock">
conn  scott/tiger
</pre>
---
<!-- _class: aqua -->
**STEP18)**
<img src="./img/setting000_018.png" alt="" width="90%" />


---
<!-- _class: aqua -->
-  scott user가 안나올때
<pre class="codeblock">
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER ACCOUNT UNLOCK;
</pre>
> ORA-01918: user 'SCOTT' does not exist

---
<!-- _class: aqua -->
<pre class="codeblock">
SQL>
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER ACCOUNT UNLOCK;
ALTER USER SCOTT IDENTIFIED BY TIGER ACCOUNT UNLOCK
           *
ERROR at line 1:
ORA-01918: user 'SCOTT' does not exist
</pre>
---
<!-- _class: aqua -->
**STEP19)**
<img src="./img/setting000_019.png" alt="" width="90%" />

---
<!-- _class: aqua -->
-  다음경로의 scott.sql 확인
<pre class="codeblock">
C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
</pre>

---
<!-- _class: aqua -->
**STEP20)**
<img src="./img/setting000_020.png" alt="" width="90%" />

---
<!-- _class: aqua -->
- scott 사용설정
<pre class="codeblock">
SQL> @C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
SQL> show user;
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER;
</pre>
---
<!-- _class: aqua -->

<pre class="codeblock">
SQL> @C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
SQL>
SQL>
SQL> show user;
USER is "SCOTT"
SQL>
SQL>
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER;

User altered.

</pre>


---
<!-- _class: aqua -->

#### ■4. SQL Developer 설치 및 실행

1. SQL Developer 다운로드드
  - https://www.oracle.com/kr/downloads/
  - 검색 : SQL Developer

2. 설치 및 실행
3. System
   system
   1234

---
<!-- _class: aqua -->
**STEP1)**
<img src="img/setting003_developer_001.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP2)**
<img src="img/setting003_developer_002.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP3)**
<img src="img/setting003_developer_003.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP4)**
<img src="img/setting003_developer_004.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP5)**
<img src="img/setting003_developer_005.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP6)**
<img src="img/setting003_developer_006.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP7)**
<img src="img/setting003_developer_007.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP8)**
<img src="img/setting003_developer_008.png" alt="" width="90%" />

---
<!-- _class: aqua -->
**STEP9)**
<img src="img/setting003_developer_009.png" alt="" width="90%" />






---
<!-- _class: aqua -->

1. ALTER USER SCOTT IDENTIFIED BY tiger ACCOUNT UNLOCK; 명령어의 목적은?  
2. DESC EMP; 명령어는 어떤 정보를 보여주나요?  
3. SCOTT 계정이 없을 경우 어떤 파일을 실행해야 하나요?  
4. SQLPLUS scott/tiger 명령어는 어떤 상황에서 사용하나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- sqlplus 명령어는 어떤 프로그램을 실행하나요?  
- ALTER USER 명령어는 어떤 작업을 수행하나요?  
- CONN 명령어는 어떤 기능을 하나요?  
- DESC 명령어는 어떤 정보를 제공하나요?  
- EXIT 명령어는 어떤 동작을 하나요?
 

---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>
  