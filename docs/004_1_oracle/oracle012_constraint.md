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
  <span>▶ Chapter 09: transaction</span>
  <span>▶ Chapter 10: ddl</span>
  <span>▶ Chapter 11: object</span>
  <span class="current-chapter">✅▶ Chapter 12: constraint</span>
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
***SQL 제약조건 실습***  
→ ***데이터 무결성 유지***, ***기본키/외래키 설정***, ***고유값/NULL 제어***, ***조건 검사***

---

<!-- _class: aqua -->
### 🔐 제약조건이란?  
- 테이블에 저장되는 데이터의 정확성과 일관성을 보장  
- 테이블 생성 시 또는 ALTER로 추가 가능  
- 오류 발생 시 데이터 입력/수정 거부

---

<!-- _class: aqua -->
### 🧱 NOT NULL  
- 해당 컬럼은 반드시 값이 있어야 함  
- 기본값 없이 NULL 입력 불가  
- 예: ENAME VARCHAR2(10) NOT NULL

---

<!-- _class: aqua -->
### 🆔 PRIMARY KEY  
- 테이블의 고유 식별자  
- 중복 불가 + NULL 불가  
- 단일 컬럼 또는 복합 컬럼 지정 가능  
- 자동 인덱스 생성됨

---

<!-- _class: aqua -->
### 🔗 FOREIGN KEY  
- 다른 테이블의 PRIMARY KEY 참조  
- 참조 무결성 유지  
- 부모 테이블의 값만 입력 가능  
- ON DELETE CASCADE 옵션으로 연쇄 삭제 가능

---

<!-- _class: aqua -->
### 🧬 UNIQUE  
- 중복 값 허용하지 않음  
- NULL은 허용  
- 여러 컬럼에 각각 적용 가능

---

<!-- _class: aqua -->
### 🧠 CHECK  
- 특정 조건 만족 여부 검사  
- 예: SAL > 0, GENDER IN ('M', 'F')  
- 복잡한 비즈니스 규칙 적용 가능

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- NOT NULL 제약
CREATE TABLE EMP (
  ENAME VARCHAR2(10) NOT NULL
);

-- PRIMARY KEY 제약
CREATE TABLE DEPT (
  DEPTNO NUMBER(2) PRIMARY KEY,
  DNAME VARCHAR2(14)
);

-- FOREIGN KEY 제약
CREATE TABLE EMP (
  EMPNO NUMBER(4) PRIMARY KEY,
  ENAME VARCHAR2(10),
  DEPTNO NUMBER(2),
  CONSTRAINT FK_DEPT FOREIGN KEY (DEPTNO)
    REFERENCES DEPT(DEPTNO)
    ON DELETE CASCADE
);

-- UNIQUE 제약
CREATE TABLE USER_INFO (
  USER_ID NUMBER,
  EMAIL VARCHAR2(50) UNIQUE
);

-- CHECK 제약
CREATE TABLE PRODUCT (
  PID NUMBER,
  PRICE NUMBER CHECK (PRICE > 0),
  CATEGORY VARCHAR2(10) CHECK (CATEGORY IN ('A', 'B', 'C'))
);

-- 제약조건 삭제
ALTER TABLE EMP DROP CONSTRAINT FK_DEPT;
</pre>

---

<!-- _class: aqua -->

## ✅ 제약조건 요약표

| 제약조건 | 설명 |
|----------|------|
| NOT NULL | NULL 입력 금지 |
| PRIMARY KEY | 고유 식별자, 중복/NULL 금지 |
| FOREIGN KEY | 다른 테이블 참조 |
| UNIQUE | 중복 금지, NULL 허용 |
| CHECK | 조건 검사 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제



 


---
<!-- _class: aqua -->
##### Q001
- 다음과 같이 테이블 생성시 NOT NULL을 설정하시오.
<img src="img/chap14_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_NOTNULL(
   LOGIN_ID VARCHAR2(20) NOT NULL,
   LOGIN_PWD VARCHAR2(20) NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_NOTNULL;

</pre>


---
<!-- _class: aqua -->
##### Q002
- 제약조건이 NOT NULL 인 열에 NULL 값을 넣어보시오. (에러)
<img src="img/chap14_002.png" alt="" width="80%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD, TEL)
VALUES ('TEST_ID_01', NULL, '010-1234-5678');

</pre>


---
<!-- _class: aqua -->
##### Q003
- 제약 조건이 없는 TEL열에 NULL 값을 입력하시오.
<img src="img/chap14_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD)
VALUES ('TEST_ID_01', '1234');

SELECT * FROM TABLE_NOTNULL;

</pre>


---
<!-- _class: aqua -->
##### Q004
- NOT NULL 제약 조건이 지정된 열 데이터를 NULL 값으로 업데이트 하시오. (에러)
<img src="img/chap14_004.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE TABLE_NOTNULL
   SET LOGIN_PWD = NULL
 WHERE LOGIN_ID = 'TEST_ID_01';

</pre>


---
<!-- _class: aqua -->
##### Q005
- (SCOTT) 제약조건을 살펴보시오.
<img src="img/chap14_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

</pre>


---
<!-- _class: aqua -->
##### Q006
- 테이블 생성시 제약조건에 이름을 다음과 같이 지정하시오.
<img src="img/chap14_006.png" alt="" width="80%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_NOTNULL2(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL,
   TEL VARCHAR2(20)
);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

</pre>


---
<!-- _class: aqua -->
##### Q007
- 이미 생성한 테이블에 제약 조건을 다음과 같이 지정하시오.
- TEL 열에 NOT NULL 제약조건을 추가하시오.
<img src="img/chap14_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_NOTNULL
MODIFY(TEL NOT NULL);

</pre>


---
<!-- _class: aqua -->
##### Q008
- LOGIN_ID 가 **TEST_ID_01** 인  TEL의 데이터를  '010-1234-5678' 로 수정하시오.
<img src="img/chap14_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE TABLE_NOTNULL
   SET TEL = '010-1234-5678'
 WHERE LOGIN_ID = 'TEST_ID_01';

SELECT * FROM TABLE_NOTNULL;

</pre>


---
<!-- _class: aqua -->
##### Q009
- TEL 열에 NOT NULL을 추가하시오.
<img src="img/chap14_009.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_NOTNULL
MODIFY(TEL NOT NULL);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

</pre>


---
<!-- _class: aqua -->
##### Q010
- TEL 열에 제약조건이름을 지정해서 추가하시오.
<img src="img/chap14_010.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_NOTNULL2
MODIFY(TEL CONSTRAINT TBLNN_TEL_NN NOT NULL);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

</pre>


---
<!-- _class: aqua -->
##### Q011
- TABLE_NOTNULL2 테이블 열 구조를 확인하시오.
<img src="img/chap14_011.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DESC TABLE_NOTNULL2;

</pre>


---
<!-- _class: aqua -->
##### Q012
- 이미 생성된 제약조건이름을 변경하시오.
<img src="img/chap14_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_NOTNULL2
RENAME CONSTRAINT TBLNN_TEL_NN TO TBLNN2_TEL_NN;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

</pre>


---
<!-- _class: aqua -->
##### Q013
- TABLE_NOTNULL2 제약 조건을 삭제하시오.
<img src="img/chap14_013.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_NOTNULL2
 DROP CONSTRAINT TBLNN2_TEL_NN;

DESC TABLE_NOTNULL2;

</pre>


---
<!-- _class: aqua -->
##### Q014
- LOGIN_ID 열에 중복되지 않는값 UNIQUE를 지정하시오.
<img src="img/chap14_014.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_UNIQUE(
   LOGIN_ID VARCHAR2(20) UNIQUE,
   LOGIN_PWD VARCHAR2(20) NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_UNIQUE;

</pre>


---
<!-- _class: aqua -->
##### Q015
- USER_CONSTRAINTS 데이터 사전에서 제약조건을 확인하시오.
<img src="img/chap14_015.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME = 'TABLE_UNIQUE';

</pre>


---
<!-- _class: aqua -->
##### Q016
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 삽입하시오.
<img src="img/chap14_016.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD01', '010-1234-5678');

SELECT * FROM TABLE_UNIQUE;

</pre>


---
<!-- _class: aqua -->
##### Q017
- 다음과 같이 중복되는 데이터를 삽입해보시오. (에러 )
<img src="img/chap14_017.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_UNIQUE (LOGIN_ID, LOGIN_PWD, TEL)
VALUES ('TEST_ID_01', 'PWD01', '010-1234-5678');

</pre>


---
<!-- _class: aqua -->
##### Q018
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 입력하시오.
- LOGIN_PWD 열은 NOT NULL 조건만 지정되어 있어 중복허용이 됨.
<img src="img/chap14_018.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_02', 'PWD01', '010-1234-5678');

SELECT * FROM TABLE_UNIQUE;

</pre>


---
<!-- _class: aqua -->
##### Q019
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 입력하시오.
- UNIQUE제약 조건이 지정된 열에 NULL 값 입력가능
<img src="img/chap14_019.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES(NULL, 'PWD01', '010-2345-6789');

SELECT * FROM TABLE_UNIQUE;

</pre>


---
<!-- _class: aqua -->
##### Q020
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 수정하시오. (에러)
- LOGIN_ID 에 이미 존재하는 값을 지정하면 중복데이터가 발생하므로 에러발생
<img src="img/chap14_020.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE TABLE_UNIQUE
   SET LOGIN_ID='TEST_ID_01'
 WHERE LOGIN_ID IS NULL;

</pre>


---
<!-- _class: aqua -->
##### Q021
- 다음과 같이 테이블을 생성하시오.
- 테이블을 생성할때  UNIQUE 제약 조건 설정하시오.
<img src="img/chap14_021.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_UNIQUE2(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNID_UNQ UNIQUE,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNPW_NN NOT NULL,
   TEL VARCHAR2(20)
);

DESC  TABLE_UNIQUE2;
</pre>


---
<!-- _class: aqua -->
##### Q022
- 생성한 UNIQUE 제약 조건을 확인하시오.
<img src="img/chap14_022.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

</pre>


---
<!-- _class: aqua -->
##### Q023
- 이미 생성한 열에 UNIQUE제약 조건 추가하시오.
- ALTER MODIFY 이용
<img src="img/chap14_023.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_UNIQUE
MODIFY(TEL UNIQUE);

</pre>


---
<!-- _class: aqua -->
##### Q024
- TEL 열값을 모두 NULL 값으로 변경하시오.
<img src="img/chap14_024.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
UPDATE TABLE_UNIQUE
   SET TEL = NULL;

SELECT * FROM TABLE_UNIQUE;

</pre>


---
<!-- _class: aqua -->
##### Q025
- TEL 값에 UNIQUE제약 조건 설정하시오.
<img src="img/chap14_025.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_UNIQUE
MODIFY(TEL UNIQUE);

</pre>


---
<!-- _class: aqua -->
##### Q026
- UNIQUE제약 조건의 이름을 직접 지정하시오.
<img src="img/chap14_026.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_UNIQUE2
MODIFY(TEL CONSTRAINT TBLUNQ_TEL_UNQ UNIQUE);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

</pre>


---
<!-- _class: aqua -->
##### Q027
- 이미 만들어져 있는 UNIQUE제약 조건이름을 다음과 같이 수정하시오.
<img src="img/chap14_027.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_UNIQUE2
RENAME CONSTRAINT TBLUNQ_TEL_UNQ TO TBLUNQ2_TEL_UNQ;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

</pre>


---
<!-- _class: aqua -->
##### Q028
-  다음과 같이 제약 조건을 삭제하시오.
<img src="img/chap14_028.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER TABLE TABLE_UNIQUE2
 DROP CONSTRAINT TBLUNQ2_TEL_UNQ;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

</pre>


---
<!-- _class: aqua -->
##### Q029
- 다음과 같이 테이블을 생성할때 PRIMARY KEY를 설정하시오.
<img src="img/chap14_029.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_PK(
   LOGIN_ID VARCHAR2(20) PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_PK;

</pre>


---
<!-- _class: aqua -->
##### Q030
- 생성한 PRIMARY KEY를 확인하시오.
<img src="img/chap14_030.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_PK%';

</pre>


---
<!-- _class: aqua -->
##### Q031
- 생성한 PRIMARY KEY를 통해 자동생성된 INDEX를 확인하시오.
<img src="img/chap14_031.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT INDEX_NAME, TABLE_OWNER, TABLE_NAME
  FROM USER_INDEXES
 WHERE TABLE_NAME LIKE 'TABLE_PK%';

</pre>


---
<!-- _class: aqua -->
##### Q032
- 제약 조건의 이름을 직접 지정하여 테이블을 생성하시오.
<img src="img/chap14_032.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_PK2(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLPK2_LGNID_PK PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLPK2_LGNPW_NN NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_PK2;

</pre>


---
<!-- _class: aqua -->
##### Q033
- 다음과 같이 데이터를  입력하시오.
<img src="img/chap14_033.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD01', '010-1234-5678');

SELECT * FROM TABLE_PK;

</pre>


---
<!-- _class: aqua -->
##### Q034
- 다음과 같이 테이블에 중복되는 데이터를 입력하시오.
- PRIMARY KEY제약조건이 지정되어 있는 열은 중복을 허용하지 않음.
<img src="img/chap14_034.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD02', '010-2345-6789');

</pre>


---
<!-- _class: aqua -->
##### Q035
- 다음과 같이 데이터를 입력하시오.
- NULL값을 명시적으로 입력하시오.
<img src="img/chap14_035.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL)
VALUES(NULL, 'PWD02', '010-2345-6789');

</pre>


---
<!-- _class: aqua -->
##### Q036
- 다음과 같이 데이터를 입력하시오.
- NULL값을 암시적으로  입력하시오.
<img src="img/chap14_036.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_PK(LOGIN_PWD, TEL)
VALUES('PWD02', '010-2345-6789');

</pre>


---
<!-- _class: aqua -->
##### Q037
- EMP 테이블과 DEPT 테이블의 제약 조건을 살펴보시오.
<img src="img/chap14_037.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, R_OWNER, R_CONSTRAINT_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME IN ('EMP', 'DEPT');

</pre>


---
<!-- _class: aqua -->
##### Q038
- FOREIGN KEY가 참조하는 열에 존재하지 않는 데이터를 입력하시오.
- 다음과 같이 데이터를 입력하고 결과를 확인하시오.
- 에러 : 부모키가 없음.
<img src="img/chap14_038.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(9999, '홍길동', 'CLERK', '7788', TO_DATE('2017/04/30', 'YYYY/MM/DD'), 1200, NULL, 50);

</pre>


---
<!-- _class: aqua -->
##### Q039
- 다음과 같이 DEPT_FK테이블을 생성하시오.
<img src="img/chap14_039.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE DEPT_FK(
   DEPTNO NUMBER(2) CONSTRAINT DEPTFK_DEPTNO_PK PRIMARY KEY,
   DNAME VARCHAR2(14),
   LOC VARCHAR2(13)
);

DESC DEPT_FK;

</pre>


---
<!-- _class: aqua -->
##### Q040
- 다음과 같이 EMP_FK테이블을 생성하시오.
- 외래키 설정
<img src="img/chap14_040.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE EMP_FK(
   EMPNO NUMBER(4) CONSTRAINT EMPFK_EMPNO_PK PRIMARY KEY,
   ENAME VARCHAR2(10),
   JOB VARCHAR2(9),
   MGR NUMBER(4),
   HIREDATE DATE,
   SAL NUMBER(7,2),
   COMM NUMBER(7,2),
   DEPTNO NUMBER(2) CONSTRAINT EMPFK_DEPTNO_FK REFERENCES DEPT_FK (DEPTNO)
);

DESC EMP_FK;

</pre>


---
<!-- _class: aqua -->
##### Q041
- EMP_FK 테이블에 다음과 같이 데이터를 삽입하시오.
- 에러발생
- DEPTNO데이터가 아직 DEPT_FK테이블에 데이터가 없음
- 부모데이터가 없음.
<img src="img/chap14_041.png" alt="" width="80%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_FK
VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'),
       3000, NULL, 10);

</pre>


---
<!-- _class: aqua -->
##### Q042
- DEPT_FK테이블에 데이터를 삽입하시오.
<img src="img/chap14_042.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO DEPT_FK
VALUES(10, 'TEST_DNAME', 'TEST_LOC');

SELECT * FROM DEPT_FK;

</pre>


---
<!-- _class: aqua -->
##### Q043
- EMP_FK 테이블에 다음과 같이 데이터를 삽입하시오.
- 삽입가능
- 부모테이블에 데이터 있음.
<img src="img/chap14_043.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_FK
VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'),
       3000, NULL, 10);

SELECT * FROM EMP_FK;

</pre>


---
<!-- _class: aqua -->
##### Q044
- DEPT_FK 테이블의 10번 부서 데이터를 삭제 하시오.
- 에러발생
- EMP_FK에서 10번부서의 데이터를 참조하고 있음.
- 삭제 불가능능
<img src="img/chap14_044.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DELETE FROM DEPT_FK
 WHERE DEPTNO = 10;

</pre>


---
<!-- _class: aqua -->
##### Q045
- 테이블을 생성할때 CHECK 제약 조건 설정하시오.
- LOGIN_PWD 는 3글자 초과만 저장가능
<img src="img/chap14_045.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_CHECK(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK_LOGINID_PK PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLCK_LOGINPW_CK CHECK (LENGTH(LOGIN_PWD) > 3),
   TEL VARCHAR2(20)
);

DESC TABLE_CHECK;

</pre>


---
<!-- _class: aqua -->
##### Q046
- CHECK 제약 조건에 맞지 않는 데이터를 삽입
-  LOGIN_PWD 는 3글자 초과만 저장가능   123
<img src="img/chap14_046.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_CHECK
VALUES ('TEST_ID', '123', '010-1234-5678');

</pre>


---
<!-- _class: aqua -->
##### Q047
- CHECK 제약 조건에 맞는 데이터를 삽입
-  LOGIN_PWD 는 3글자 초과만 저장가능   1234
- 성공!
<img src="img/chap14_047.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_CHECK
VALUES ('TEST_ID', '1234', '010-1234-5678');

SELECT * FROM TABLE_CHECK;

</pre>


---
<!-- _class: aqua -->
##### Q048
- CHECK 제약 조건 확인하기.
<img src="img/chap14_048.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_CHECK';

</pre>


---
<!-- _class: aqua -->
##### Q049
- 테이블을 생성할때 DEFAULT 제약 조건을 설정하시오.
- 기본값 1234
<img src="img/chap14_049.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE TABLE_DEFAULT(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK2_LOGINID_PK PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) DEFAULT '1234',
   TEL VARCHAR2(20)
);

DESC TABLE_DEFAULT;

</pre>


---
<!-- _class: aqua -->
##### Q050
- DEFAULT로 지정한 기본값이 입력되는 INSERT문을 확인하시오.
- 다음과 같이 데이터를 입력하시오.
<img src="img/chap14_050.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO TABLE_DEFAULT VALUES ('TEST_ID', NULL, '010-1234-5678');

INSERT INTO TABLE_DEFAULT (LOGIN_ID, TEL) VALUES ('TEST_ID2', '010-1234-5678');

SELECT * FROM TABLE_DEFAULT;
</pre>





---
<!-- _class: purple -->
# 사고확장EX



---
<!-- _class: aqua -->
##### EX001
- DEPT_CONST 테이블과 EMP_CONST테이블을 다음과 같은 특성 및 제약 조건을 지정하여 만드시오.

1. DEPT_CONST 테이블

<img src="img/chap14__EX_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
**DEPT_CONST 테이블 정의 (1/2)**

- **DEPTNO**
  - 자료형: 정수형 숫자 (길이: 2)
  - 제약조건: PRIMARY KEY
  - 제약조건 이름: DEPTCONST_DEPTNO_PK

---
<!-- _class: aqua -->
**DEPT_CONST 테이블 정의 (2/2)**

- **DNAME**
  - 자료형: 가변형 문자열 (길이: 14)
  - 제약조건: UNIQUE
  - 제약조건 이름: DEPTCONST_DNAME_UNQ

- **LOC**
  - 자료형: 가변형 문자열 (길이: 13)
  - 제약조건: NOT NULL
  - 제약조건 이름: DEPTCONST_LOC_NN



---
<!-- _class: aqua -->
2. EMP_CONST 테이블

<img src="img/chap14__EX_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
 
**EMP_CONST 테이블 정의 (1/3)**

- **EMPNO**
  - 자료형: 정수형 숫자 (길이: 4)
  - 제약조건: PRIMARY KEY
  - 제약조건 이름: EMPCONST_EMPNO_PK

- **ENAME**
  - 자료형: 가변형 문자열 (길이: 10)
  - 제약조건: NOT NULL
  - 제약조건 이름: EMPCONST_ENAME_NN


---
<!-- _class: aqua -->
 
**EMP_CONST 테이블 정의 (2/3)**

- **JOB**
  - 자료형: 가변형 문자열 (길이: 9)
  - 제약조건: 없음


- **TEL**
  - 자료형: 가변형 문자열 (길이: 20)
  - 제약조건: UNIQUE
  - 제약조건 이름: EMPCONST_TEL_UNQ

- **HIREDATE**
  - 자료형: 날짜
  - 제약조건: 없음


---
<!-- _class: aqua -->
 
**EMP_CONST 테이블 정의 (3/3)**
- **SAL**
  - 자료형: 소수점 둘째자리 숫자 (길이: 7)
  - 제약조건: CHECK (급여는 1000~9999만 입력 가능)
  - 제약조건 이름: EMPCONST_SAL_CHE

- **COMM**
  - 자료형: 소수점 둘째자리 숫자 (길이: 7)
  - 제약조건: 없음

- **DEPTNO**
  - 자료형: 정수형 숫자 (길이: 2)
  - 제약조건: FOREIGN KEY
  - 제약조건 이름: EMPCONST_DEPTNO_FK
 


---
<!-- _class: aqua -->

3. 테이블 생성 후 데이터 사전 뷰를 사용하여 다음과 같이 두 테이블의 제약 조건을 확인하시오.


<img src="img/chap14__EX_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->

<pre class="codeblock">
--①
CREATE TABLE DEPT_CONST (
   DEPTNO NUMBER(2)    CONSTRAINT DEPTCONST_DEPTNO_PK PRIMARY KEY,
   DNAME  VARCHAR2(14) CONSTRAINT DEPTCONST_DNAME_UNQ UNIQUE,
   LOC    VARCHAR2(13) CONSTRAINT DEPTCONST_LOC_NN NOT NULL
);

--②
CREATE TABLE EMP_CONST (
   EMPNO    NUMBER(4) CONSTRAINT EMPCONST_EMPNO_PK PRIMARY KEY,
   ENAME    VARCHAR2(10) CONSTRAINT EMPCONST_ENAME_NN NOT NULL,
   JOB      VARCHAR2(9),
   TEL      VARCHAR2(20) CONSTRAINT EMPCONST_TEL_UNQ UNIQUE,
   HIREDATE DATE,
   SAL      NUMBER(7, 2) CONSTRAINT EMPCONST_SAL_CHK CHECK (SAL BETWEEN 1000 AND 9999),
   COMM     NUMBER(7, 2),
   DEPTNO   NUMBER(2) CONSTRAINT EMPCONST_DEPTNO_FK REFERENCES DEPT_CONST (DEPTNO)
);

--③
SELECT TABLE_NAME, CONSTRAINT_NAME, CONSTRAINT_TYPE
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME IN ( 'EMP_CONST', 'DEPT_CONST' )
ORDER BY CONSTRAINT_NAME;

</pre>


---

<!-- _class: aqua -->

1. NOT NULL 제약은 어떤 상황에서 유용한가요?  
2. PRIMARY KEY 와 UNIQUE 의 차이는 무엇인가요?  
3. FOREIGN KEY 는 어떤 역할을 하나요?  
4. CHECK (PRICE > 0) 은 어떤 조건을 의미하나요?  
5. ON DELETE CASCADE 옵션은 어떤 동작을 하나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- PRIMARY KEY 와 FOREIGN KEY 는 각각 어떤 목적을 가지나요?  
- UNIQUE 제약은 NULL 값을 허용하나요?  
- CHECK 제약은 어떤 방식으로 동작하나요?  
- 제약조건은 언제 설정하거나 삭제할 수 있나요?  
- ALTER TABLE 문으로 제약조건을 어떻게 관리하나요?


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>