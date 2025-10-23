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
  <span class="current-chapter">✅▶ Chapter 08: update_delete</span>
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
***SQL 데이터 수정/삭제 실습***  
→ ***UPDATE***, ***DELETE***, ***MERGE***, ***서브쿼리 활용***, ***트랜잭션 제어***

---

<!-- _class: aqua -->
### ✏️ UPDATE 문  
- 테이블의 기존 데이터를 수정  
- SET 절로 변경할 값 지정  
- WHERE 절로 대상 행 지정  
- 서브쿼리로 동적 값 지정 가능  

---

<!-- _class: aqua -->
### 🗑 DELETE 문  
- 테이블에서 행을 삭제  
- WHERE 절로 삭제 조건 지정  
- 조건 없으면 전체 삭제됨  

---

<!-- _class: aqua -->
### 🔁 MERGE 문  
- 조건에 따라 INSERT, UPDATE, DELETE 수행  
- USING, ON, WHEN MATCHED, WHEN NOT MATCHED 절 사용  
- 주로 데이터 동기화에 활용  

---

<!-- _class: aqua -->
### 🧠 서브쿼리 활용  
- UPDATE, DELETE, MERGE 문에서 서브쿼리로 조건 또는 값 지정  
- 예: SET SAL = (SELECT ...), WHERE EXISTS (...)

---

<!-- _class: aqua -->
### 🔐 트랜잭션 제어  
- COMMIT, ROLLBACK, SAVEPOINT  
- 데이터 변경 후 확정 또는 취소  
- 오류 발생 시 ROLLBACK으로 복구 가능

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 급여 인상
UPDATE EMP
   SET SAL = SAL * 1.1
 WHERE JOB = 'MANAGER';

-- 특정 부서 사원 삭제
DELETE FROM EMP
 WHERE DEPTNO = 30;

-- 서브쿼리로 급여 수정
UPDATE EMP
   SET SAL = (SELECT AVG(SAL) FROM EMP)
 WHERE JOB = 'CLERK';

-- EXISTS 조건으로 삭제
DELETE FROM EMP E
 WHERE EXISTS (
       SELECT 1
         FROM DEPT D
        WHERE D.DEPTNO = E.DEPTNO
          AND D.LOC = 'CHICAGO');

-- MERGE 문 예제
MERGE INTO BONUS B
USING EMP E
   ON (B.ENAME = E.ENAME)
 WHEN MATCHED THEN
   UPDATE SET B.JOB = E.JOB, B.SAL = E.SAL
 WHEN NOT MATCHED THEN
   INSERT (ENAME, JOB, SAL)
   VALUES (E.ENAME, E.JOB, E.SAL);

-- 트랜잭션 제어
UPDATE EMP SET SAL = SAL + 100 WHERE DEPTNO = 10;
SAVEPOINT before_bonus;
UPDATE EMP SET COMM = 500 WHERE JOB = 'SALESMAN';
ROLLBACK TO before_bonus;
COMMIT;
</pre>

---

<!-- _class: aqua -->

## ✅ 명령어 요약표

| 명령어 | 설명 |
|--------|------|
| UPDATE | 데이터 수정 |
| DELETE | 데이터 삭제 |
| MERGE | 조건 기반 수정/삽입 |
| EXISTS, IN | 조건 필터링 |
| COMMIT, ROLLBACK | 트랜잭션 제어 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제



 


---
<!-- _class: aqua -->
##### Q001
- DEPT 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT테이블을 복사해서 DEPT_TEMP 테이블을 만드시오.
<img src="img/chap10_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE DEPT_TEMP
    AS SELECT * FROM DEPT;
</pre>


---
<!-- _class: aqua -->
##### Q002
- DEPT_TMPT 테이블을 조회하시오.
<img src="img/chap10_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT * FROM DEPT_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q003
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
<img src="img/chap10_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (50, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q004
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. 열지정없이 데이터 추가가 가능하다.
<img src="img/chap10_004.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO DEPT_TEMP
VALUES (60 , 'NETWORK', 'BUSAN');

SELECT * FROM DEPT_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q005
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. NULL을 지정하여 입력하는 것이 가능하다.
<img src="img/chap10_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (70 , 'WEB', NULL);

SELECT * FROM DEPT_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q006
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. 열데이터를 넣지 않는 방식으로 데이터 입력이 가능하다.  ( 공백문자열'' )
<img src="img/chap10_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO DEPT_TEMP (DEPTNO, DNAME , LOC)
VALUES (80 , 'MOBILE', '');

SELECT * FROM DEPT_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q007
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. 열데이터를 넣지 않는 방식으로 데이터 입력이 가능하다.
<img src="img/chap10_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO DEPT_TEMP (DEPTNO, LOC)
VALUES (90 , 'INCHEON');

SELECT * FROM DEPT_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q008
- EMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP테이블을 복사해 EMP_TEMP 테이블을 만드시오.
2. 조건적 WHERE이 FALSE이므로 구조만 복사합니다.
<img src="img/chap10_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE EMP_TEMP
    AS SELECT *
         FROM EMP
        WHERE 1 <> 1;

SELECT * FROM EMP_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q009
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)  년/월/일
<img src="img/chap10_009.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);

SELECT * FROM EMP_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q010
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.  (날짜-) 년-월-일일
<img src="img/chap10_010.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20);

SELECT * FROM EMP_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q011
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)  일/월/년 으로 하면 오류남.
<img src="img/chap10_011.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR , HIREDATE, SAL , COMM, DEPTNO)
VALUES (2111, '이순신', 'MANAGER', 9999, '07/01/2001', 4000, NULL, 20);

</pre>


---
<!-- _class: aqua -->
##### Q012
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)   TO_DATE 함수 이용하기기
<img src="img/chap10_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (2111, '이순신', 'MANAGER', 9999,
        TO_DATE('07/01/2001', 'DD/MM/YYYY'), 4000, NULL, 20);

SELECT * FROM EMP_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q013
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)  SYSDATE사용용
<img src="img/chap10_013.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (3111, '심청이', 'MANAGER', 9999, SYSDATE, 4000, NULL, 30);

SELECT * FROM EMP_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q014
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. INSERT 문에 SELECT 문이용 → 서브쿼리이용
3. VALUES를 사용하지 않음! / 추가되는 열, 서브쿼리의 열의 개수,자료형 일치
<img src="img/chap10_014.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL
   AND S.GRADE = 1;

SELECT * FROM EMP_TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q015
-  DEPT테이블을 이용하여 다음과 같이 작성하시오.
1. DEPT테이블을 복사해 DEPT_TEMP2테이블을 작성하시오.
<img src="img/chap10_015.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE DEPT_TEMP2
    AS SELECT * FROM DEPT;

SELECT * FROM DEPT_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q016
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. LOC을 전보 'SEOUL' 로 업데이트 하시오.
<img src="img/chap10_016.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE DEPT_TEMP2
   SET LOC = 'SEOUL';

SELECT * FROM DEPT_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q017
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. ROLLBACK을 이용하여 테이블 내용을 이전상태로 되돌리시오.
<img src="img/chap10_017.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ROLLBACK;
</pre>


---
<!-- _class: aqua -->
##### Q018
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. 40번부서의이름을 DATABASE ,  지역을 SEOUL로 수정하시오.
<img src="img/chap10_018.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE DEPT_TEMP2
   SET DNAME = 'DATABASE',
         LOC = 'SEOUL'
 WHERE DEPTNO = 40;

SELECT * FROM DEPT_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q019
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. 서브쿼리를 이용하여 DEPT 테이블의 40번 부서의  부서이름과 지역의 데이터를를
2.  DEPT_TEMP2테이블의 40번 부서이름과 지역을 수정하시오.
<img src="img/chap10_019.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE DEPT_TEMP2
   SET (DNAME, LOC) = (SELECT DNAME, LOC
                         FROM DEPT
                        WHERE DEPTNO = 40)
 WHERE DEPTNO = 40;

SELECT * FROM DEPT_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q020
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. 서브쿼리를 이용하여 DEPT 테이블의 40번 부서의  부서이름과 지역의 데이터를를
2.  DEPT_TEMP2테이블의 40번 부서이름과 지역을 수정하시오.
3. 열 하나하나를 수정하는 경우우
<img src="img/chap10_020.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE DEPT_TEMP2
   SET DNAME = (SELECT DNAME
                  FROM DEPT
                 WHERE DEPTNO = 40),
       LOC = (SELECT LOC
                FROM DEPT
               WHERE DEPTNO = 40)
 WHERE DEPTNO = 40;

</pre>


---
<!-- _class: aqua -->
##### Q021
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. WHEREW절에 서브쿼리를 사용하여 데이터를 수정하는 것이 가능

<img src="img/chap10_021.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE DEPT_TEMP2
   SET LOC = 'SEOUL'
 WHERE DEPTNO = (SELECT DEPTNO
                   FROM DEPT_TEMP2
                  WHERE DNAME='OPERATIONS');

SELECT * FROM DEPT_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q022
- EMP 테이블을 복사해서 EMP_TEMP2 테이블을 작성하시오.
<img src="img/chap10_022.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE EMP_TEMP2
    AS SELECT * FROM EMP;

SELECT * FROM EMP_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q023
-  EMP_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. WHERE절을  사용하여 JOB이 MANAGER인 데이터를 삭제하시오.
<img src="img/chap10_023.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DELETE FROM EMP_TEMP2
 WHERE JOB = 'MANAGER';

SELECT * FROM EMP_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q024
-  EMP_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. WHERE,SUBQUERY을  사용하여
  급여등급이 3등급 (1401~2000) 사이에 있는
2. 30번부서의 사원들만 삭제하시오.

<img src="img/chap10_024.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DELETE FROM EMP_TEMP2
 WHERE EMPNO IN (SELECT E.EMPNO
                   FROM EMP_TEMP2 E, SALGRADE S
                  WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL
                    AND S.GRADE = 3
                    AND DEPTNO = 30);

SELECT * FROM EMP_TEMP2;

</pre>


---
<!-- _class: aqua -->
##### Q025
- EMP_TEMP2 전체 데이터를 삭제하시오.
<img src="img/chap10_025.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DELETE FROM EMP_TEMP2;

SELECT * FROM EMP_TEMP2;
</pre>




---
<!-- _class: purple -->
# 사고확장EX



---
<!-- _class: aqua -->
##### EX001
- DEPT 테이블을 이용해 다음과 같이 작성하시오.
1.  DEPT 테이블을 복사해  DEPT_TEST 테이블을 만들 후
2.  DEPT_TEST 테이블에 다음과 같이 값이 추가하시오.
<img src="img/chap10__EX_001.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### EX002
- EMP 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP 테이블을 복사해  EMP_TEST 테이블을 만들 후
2.  EMP_TEST 테이블에 다음과 같이 값이 추가하시오.
<img src="img/chap10__EX_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">

CREATE TABLE EMP_TEST AS SELECT * FROM EMP;

INSERT INTO EMP_TEST
VALUES(7201, 'TEST_USER1', 'MANAGER', 7788, TO_DATE('2016-01-02', 'YYYY-MM-DD'), 4500, NULL, 50);

INSERT INTO EMP_TEST
VALUES(7202, 'TEST_USER2', 'CLERK', 7201, TO_DATE('2016-02-21', 'YYYY-MM-DD'), 1800, NULL, 50);

INSERT INTO EMP_TEST
VALUES(7203, 'TEST_USER3', 'ANALYST', 7201, TO_DATE('2016-04-11', 'YYYY-MM-DD'), 3400, NULL, 60);

INSERT INTO EMP_TEST
VALUES(7204, 'TEST_USER4', 'SALESMAN', 7201, TO_DATE('2016-05-31', 'YYYY-MM-DD'), 2700, 300, 60);

INSERT INTO EMP_TEST
VALUES(7205, 'TEST_USER5', 'CLERK', 7201, TO_DATE('2016-07-20', 'YYYY-MM-DD'), 2600, NULL, 70);

INSERT INTO EMP_TEST
VALUES(7206, 'TEST_USER6', 'CLERK', 7201, TO_DATE('2016-09-08', 'YYYY-MM-DD'), 2600, NULL, 70);

INSERT INTO EMP_TEST
VALUES(7207, 'TEST_USER7', 'LECTURER', 7201, TO_DATE('2016-10-28', 'YYYY-MM-DD'), 2300, NULL, 80);

INSERT INTO EMP_TEST
VALUES(7208, 'TEST_USER8', 'STUDENT', 7201, TO_DATE('2018-03-09', 'YYYY-MM-DD'), 1200, NULL, 80);

SELECT * FROM EMP_TEST;
</pre>


---
<!-- _class: aqua -->
##### EX003
- EMP_TEST 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP_TEST 테이블에서 50번 부서에서 근무하는 사원들의 평균급여보다 많은 급여를 받고 있는 사원들을 70번부터서 옮기는 구문을 작성하시오.

---
<!-- _class: aqua -->
<img src="img/chap10__EX_003.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### EX004
- EMP_TEST 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP_TEST 테이블에서 60번부서의 사원 중에 입사일이 가장빠른 사원보다 늦게 입사한 사원의 급여를 10% 인상하고 80번부서로 옮기는 SQL을 작성하시오.
---
<!-- _class: aqua -->
<img src="img/chap10__EX_004.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### EX005
- EMP_TEST 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP_TEST 테이블에서 급여등급이 5인 사원을 삭제하는 SQL문을 작성하시오.
---
<!-- _class: aqua -->
<img src="img/chap10__EX_005.png" alt="" width="90%" />


 


---

<!-- _class: aqua -->

1. UPDATE EMP SET SAL = SAL * 1.1 WHERE JOB = 'MANAGER' 는 어떤 작업을 하나요?  
2. DELETE FROM EMP WHERE DEPTNO = 30 은 어떤 데이터를 삭제하나요?  
3. MERGE INTO BONUS USING EMP 문은 어떤 목적을 가지고 있나요?  
4. ROLLBACK TO SAVEPOINT 은 어떤 상황에서 사용되나요?  
5. EXISTS 조건은 어떤 방식으로 동작하나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- UPDATE 와 MERGE 의 차이는 무엇인가요?  
- DELETE 문에서 WHERE 절을 생략하면 어떤 일이 발생하나요?  
- SAVEPOINT 은 어떤 역할을 하나요?  
- ROLLBACK 과 COMMIT 은 각각 어떤 기능을 하나요?  
- MERGE 문에서 WHEN MATCHED 와 WHEN NOT MATCHED 는 어떤 차이가 있나요?
 

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span> 