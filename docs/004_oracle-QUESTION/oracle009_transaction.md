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
  <span>▶ Chapter 01: oracle_setting</span>
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
  <span class="current-chapter">✅▶ Chapter 09: transaction</span>
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
***SQL 트랜잭션 실습***  
→ ***트랜잭션의 정의***, ***COMMIT/ROLLBACK/SAVEPOINT***, ***자동/수동 제어***, ***ACID 특성***

---

<!-- _class: aqua -->
### 🔐 트랜잭션이란?  
- 하나의 논리적 작업 단위  
- 여러 SQL 문을 하나의 묶음으로 처리  
- 성공 시 COMMIT, 실패 시 ROLLBACK  
- 데이터의 일관성과 무결성 유지

---

<!-- _class: aqua -->
### ✅ COMMIT  
- 변경 사항을 영구 저장  
- 이후 ROLLBACK 불가  
- 트랜잭션 종료

---

<!-- _class: aqua -->
### ❌ ROLLBACK  
- 변경 사항을 취소  
- 트랜잭션 시작 시점 또는 SAVEPOINT까지 복구  
- 오류 발생 시 유용

---

<!-- _class: aqua -->
### 🧷 SAVEPOINT  
- 트랜잭션 내 중간 지점 설정  
- 특정 시점까지 ROLLBACK 가능  
- 복잡한 트랜잭션 제어에 활용

---

<!-- _class: aqua -->
### ⚙️ 자동 vs 수동 트랜잭션  
- 자동: DDL 문 실행 시 자동 COMMIT  
- 수동: 명시적으로 COMMIT 또는 ROLLBACK 실행  
- 예: INSERT, UPDATE, DELETE는 수동 제어 가능

---

<!-- _class: aqua -->
### 🧠 ACID 특성  
- **Atomicity**: 모두 실행되거나 모두 취소됨  
- **Consistency**: 일관된 상태 유지  
- **Isolation**: 다른 트랜잭션과 독립적  
- **Durability**: COMMIT 후 영구 저장

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 트랜잭션 시작
UPDATE EMP SET SAL = SAL + 100 WHERE DEPTNO = 10;

-- 저장 지점 설정
SAVEPOINT before_bonus;

-- 추가 변경
UPDATE EMP SET COMM = 500 WHERE JOB = 'SALESMAN';

-- 복구
ROLLBACK TO before_bonus;

-- 변경 확정
COMMIT;

-- 전체 취소
ROLLBACK;

-- 자동 COMMIT 예시 (DDL 문)
CREATE TABLE TEST (ID NUMBER);
</pre>

---

<!-- _class: aqua -->

## ✅ 트랜잭션 요약표

| 명령어 | 설명 |
|--------|------|
| COMMIT | 변경 사항 저장 |
| ROLLBACK | 변경 사항 취소 |
| SAVEPOINT | 중간 지점 설정 |
| ACID | 트랜잭션의 4가지 특성 |
| 자동 트랜잭션 | DDL 실행 시 자동 저장 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

 

---
<!-- _class: aqua -->
##### Q001
- DEPT 테이블을 이용해 다음과 같이 작성하시오.
1. DEPT 테이블을 복사해 DEPT_TCL테이블을 작성하시오.
<img src="img/chap11_001.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q002
- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.
1. DEPT_TCL 테이블에 다음과 같이 데이터를 입력, 수정, 삭제 하시오.
<img src="img/chap11_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
1.  DEPT_TCL 테이블에  50, 'DATABASE', 'SEOUL'  데이터 삽입
2.  DEPTNO 가 40인 데이터의 LOC을 'BUSAN' 으로 수정
3.  DNAME 이 'RESEARCH'인 데이터 삭제
4.  전체 데이터 조회

 

---
<!-- _class: aqua -->
##### Q003
- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.
1. ROLLBACK 명령어를 이용하여 실행을 취소하시오.
<img src="img/chap11_003.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q004
- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.
1. INSERT를 이용하여   50, 'NETWORK', 'SEOUL'  값을 추가하시오.
2. DEPTNO가 20인데이터의 LOC를 BUSAN으로 수정하시오.
3. DEPTNO가 40인데이터를 삭제하시오.

<img src="img/chap11_004.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q005
- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.
1. 위의 명령어를 반영하시오.

<img src="img/chap11_005.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q006
- 세션? : 어떤활동을 위한 시간이나 기간
- 명령프롬프트 2개 실행가능
<img src="img/chap11_006.png" alt="" width="80%" />


 


---
<!-- _class: aqua -->
##### Q007
- 한쪽 세션에서만 삭제
<img src="img/chap11_007.png" alt="" width="80%" />

 

---
<!-- _class: aqua -->
##### Q008
- 세션반영후 확인
<img src="img/chap11_008.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q009
- LOCK? : 잠금현상, 조작중인 데이터를 다른세션은 조작할 수 없도록 접근을 보류시키는 것.
- 명령프롬프트 2개 실행가능
<img src="img/chap11_009.png" alt="" width="70%" />

 


---
<!-- _class: aqua -->
##### Q010
- 한쪽에서 업데이트  (1번)
<img src="img/chap11_010.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q011
- 한쪽에서 업데이트  (2번)  LOCK 걸림
<img src="img/chap11_011.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q012
- 1번에서 마무리를 해야 LOCK이 풀림
<img src="img/chap11_012.png" alt="" width="90%" />
 


---
<!-- _class: aqua -->
##### Q013
- select 구문으로 확인
- 데이터가 다른것을 알수 있다.
<img src="img/chap11_013.png" alt="" width="80%" />

 

---
<!-- _class: aqua -->
##### Q014
- commit으로 데이터 반영
<img src="img/chap11_014.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q015
- select 구문으로 데이터 확인
<img src="img/chap11_015.png" alt="" width="90%" />


 



---
<!-- _class: purple -->
# 사고확장EX
---
<!-- _class: aqua -->
##### EX001
 두 세션에서 실행되는 순서별 SQL명령어를 확인하여 번호에 맞는 데이터 상태를 적으시오.

|세션A|세션B|
|-|-|
|UPDATE DEPT  SET DATABASE='DATABASE' , LOC='SEOUL' WHERE DEPTNO=30  |  |
|SELECT * FROM DEPT  | SELECT * FROM DEPT  |

---
<!-- _class: aqua -->
>QUESTION

현재 세션 A,B에는 조회한 DEPT테이블 30번부서의 DNAME, LOC열의 데이터 상태를 적으시오.

 

---
<!-- _class: aqua -->
##### EX002
 위에 연결해 다음과 같이 작업을 했다.

|세션A|세션B|
|-|-|
|  | UPDATE DEPT  SET DATABASE='DATABASE' , LOC='SEOUL' WHERE DEPTNO=30 |
---
<!-- _class: aqua -->
>QUESTION

현재 세션 B에서 실행한 UPDATE 문 실행결과를 적으시오.

<pre class="codeblock">
② 세션 B의 UPDATE 명령이 실행된 후 대기상태(HANG)가 된다.
세션 A의 트랜잭션이 아직 종료되지 않았기 때문이다.
</pre>




---
<!-- _class: aqua -->
##### EX003
 위에 연결해 다음과 같이 작업을 했다.

|세션A|세션B|
|-|-|
|ROLLBACK |   |

---
<!-- _class: aqua -->
>QUESTION

세션A에서 ROLLBACK명령어를 사용한 후 세션B에서 일어나는 변화를 적으시오.

---
<!-- _class: aqua -->
<pre class="codeblock">
③ 세션 A의 ROLLBACK 명령이 실행되자마자 세션 B의 UPDATE문이 수행된다. 세션 A의 트랜잭션에 의한 행 레벨 록이 끝났기 때문이다.
</pre>




---
<!-- _class: aqua -->
##### EX004
 위에 연결해 다음과 같이 작업을 했다.

|세션A|세션B|
|-|-|
| SELECT * FROM DEPT; |  SELECT * FROM DEPT;  |

---
<!-- _class: aqua -->
>QUESTION

세션A, B에서 조회한 DEPT테이블 30번 부서의 DNAME, LOC의 데이터 상태를 적으시오.

<pre class="codeblock">
④ 세션 A : DNAME은 SALES, LOC은 CHICAGO
  세션 B : DNAME은 DATABASE, LOC은 SEOUL
</pre>





---
<!-- _class: aqua -->
##### EX005
 위에 연결해 다음과 같이 작업을 했다.

|세션A|세션B|
|-|-|
|   |  COMMIT;  |
| SELECT * FROM DEPT; |  SELECT * FROM DEPT;  |

---
<!-- _class: aqua -->
>QUESTION

세션A, B에서 조회한 DEPT테이블 30번 부서의 DNAME, LOC의 데이터 상태를 적으시오.

<pre class="codeblock">
⑤ 세션 A : DNAME은 DATABASE, LOC은 SEOUL
  세션 B : DNAME은 DATABASE, LOC은 SEOUL
</pre>


---

<!-- _class: aqua -->

1. COMMIT 과 ROLLBACK 은 각각 어떤 역할을 하나요?  
2. SAVEPOINT 는 어떤 상황에서 유용한가요?  
3. ROLLBACK TO SAVEPOINT 는 어떤 동작을 하나요?  
4. DDL 문 실행 시 트랜잭션은 어떻게 처리되나요?  
5. ACID 특성 중 Isolation 은 어떤 의미인가요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- COMMIT 이후 ROLLBACK 이 가능한가요?  
- SAVEPOINT 없이 ROLLBACK 하면 어떤 일이 발생하나요?  
- 자동 트랜잭션과 수동 트랜잭션의 차이는 무엇인가요?  
- Atomicity 와 Durability 의 차이는 무엇인가요?  
- 트랜잭션이 중요한 이유는 무엇인가요?
  

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  