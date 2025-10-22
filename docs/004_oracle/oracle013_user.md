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
  <span>▶ Chapter 12: constraint</span>
  <span class="current-chapter">✅▶ Chapter 13: user</span>
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
***SQL 사용자 및 권한 실습***  
→ ***사용자 생성/삭제***, ***권한 부여/회수***, ***객체 권한과 시스템 권한***, ***역할(Role) 관리***

---

<!-- _class: aqua -->
### 👤 사용자(User) 관리  
- 데이터베이스에 접속 가능한 계정  
- CREATE USER, DROP USER 사용  
- 기본 테이블스페이스 및 임시 테이블스페이스 지정 가능  
- 예: CREATE USER SALLY IDENTIFIED BY tiger

---

<!-- _class: aqua -->
### 🛡 시스템 권한(System Privileges)  
- 데이터베이스 수준의 작업 권한  
- 예: CREATE TABLE, CREATE USER, DROP ANY TABLE  
- GRANT, REVOKE 명령으로 부여/회수

---

<!-- _class: aqua -->
### 📦 객체 권한(Object Privileges)  
- 특정 테이블, 뷰, 시퀀스 등에 대한 접근 권한  
- 예: SELECT, INSERT, UPDATE, DELETE  
- GRANT SELECT ON EMP TO SALLY

---

<!-- _class: aqua -->
### 🔁 권한 부여/회수  
- GRANT : 권한 부여  
- REVOKE : 권한 회수  
- WITH GRANT OPTION : 다른 사용자에게 권한 재부여 가능

---

<!-- _class: aqua -->
### 🧠 역할(Role) 관리  
- 여러 권한을 묶어 관리  
- CREATE ROLE, GRANT, REVOKE 사용  
- 예: GRANT manager_role TO SALLY

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 사용자 생성
CREATE USER SALLY IDENTIFIED BY tiger
DEFAULT TABLESPACE USERS
TEMPORARY TABLESPACE TEMP;

-- 사용자 삭제
DROP USER SALLY CASCADE;

-- 시스템 권한 부여
GRANT CREATE SESSION, CREATE TABLE TO SALLY;

-- 객체 권한 부여
GRANT SELECT, INSERT ON EMP TO SALLY;

-- 권한 회수
REVOKE INSERT ON EMP FROM SALLY;

-- 권한 재부여 옵션 포함
GRANT SELECT ON EMP TO SALLY WITH GRANT OPTION;

-- 역할 생성
CREATE ROLE manager_role;

-- 역할에 권한 부여
GRANT CREATE TABLE, CREATE VIEW TO manager_role;

-- 사용자에게 역할 부여
GRANT manager_role TO SALLY;
</pre>

---

<!-- _class: aqua -->

## ✅ 사용자/권한 요약표

| 항목 | 설명 |
|------|------|
| CREATE USER | 사용자 생성 |
| GRANT, REVOKE | 권한 부여/회수 |
| 시스템 권한 | DB 작업 권한 |
| 객체 권한 | 테이블 등 객체 접근 권한 |
| 역할(Role) | 권한 묶음 관리 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

 


---
<!-- _class: aqua -->
##### Q001
-  SCOTT계정으로 사용자 생성하시오.
-  권한이 없으므로  에러남.
<img src="img/chap15_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

</pre>


---
<!-- _class: aqua -->
##### Q002
-  SYSTEM계정으로  사용자 생성하시오.
-  성공!
<img src="img/chap15_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

</pre>


---
<!-- _class: aqua -->
##### Q003
-  SYSTEM계정으로  사용자 생성하시오.
-  ORCLSTUDY 사용자에게  접속권한 권한을 부여하시오.

---
<!-- _class: aqua -->
<img src="img/chap15_003.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
GRANT CREATE SESSION TO ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q004  
(SYSTEM계정)  ORCLSTUDY 사용자 정보(비번)을 변경하시오.

---
<!-- _class: aqua -->
<img src="img/chap15_004.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
ALTER USER ORCLSTUDY
IDENTIFIED BY ORCL;

</pre>


---
<!-- _class: aqua -->
##### Q005  (SYSTEM계정)
- ORCLSTUDY 사용자를 삭제하시오.
<img src="img/chap15_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DROP USER ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q006  (SYSTEM계정)
- ORCLSTUDY 사용자와 객체 모두를 삭제하시오.
<img src="img/chap15_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DROP USER ORCLSTUDY CASCADE;

</pre>


---
<!-- _class: aqua -->
##### Q007
- SYSTEM 계정으로 접속하여
- ORCLSTUDY 사용자, ORACLE 비밀번호로 생성하시오.
<img src="img/chap15_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

</pre>


---
<!-- _class: aqua -->
##### Q008
- 사용자에게  RESOURCE(여러권한을 하나의 이름을 묶어 권한부여-공간사용가능능) ,  데이터베이스 접속권한과, 테이블 생성권한을 부여하시오.
<img src="img/chap15_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
GRANT RESOURCE, CREATE SESSION, CREATE TABLE TO ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q009
- SCOTT 계정으로 접속하기
- TEMP 테이블을 다음과 같이 만든다.
- ORCLSTUDY 사용자에게 TEMP테이블 권한을 부여하시오.


---
<!-- _class: aqua -->
<img src="img/chap15_009.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<img src="img/chap15_009_2.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CONN SCOTT/tiger

CREATE TABLE TEMP(
   COL1 VARCHAR(20),
   COL2 VARCHAR(20)
);

GRANT SELECT ON TEMP TO ORCLSTUDY;

GRANT INSERT ON TEMP TO ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q010
- ORCLSTUDY 유저에게 TEMP테이블의 여러권한(SELECT, INSERT) 을 한번에 부여하시오.
<img src="img/chap15_010.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
GRANT SELECT, INSERT ON TEMP
   TO ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q011
- ORCLSTUDY 로 부여받은 권한 사용하기
- INSERT, SELECT
<img src="img/chap15_011_1.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<img src="img/chap15_011.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CONN ORCLSTUDY/ORACLE

SELECT * FROM SCOTT.TEMP;

INSERT INTO SCOTT.TEMP VALUES('TEXT', 'FROM ORCLSTUDY');

SELECT * FROM SCOTT.TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q012
- ORCLSTUDY 에 부여된 TEMP 테이블 사용권한을 취소하시오.
<img src="img/chap15_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CONN SCOTT/tiger

REVOKE SELECT, INSERT ON TEMP FROM ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q013
- ORCLSTUDY 로 권한 철회된 TEMP 테이블을 조회하시오 (실패! )

---
<!-- _class: aqua -->
<img src="img/chap15_013.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CONN ORCLSTUDY/ORACLE

SELECT * FROM SCOTT.TEMP;

</pre>


---
<!-- _class: aqua -->
##### Q014
- SYSTEM계정으로 ROLESTUDY 롤 생성 및 권한을 부여하시오.
<img src="img/chap15_014.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CONN SYSTEM/oracle

CREATE ROLE ROLESTUDY;

GRANT CONNECT, RESOURCE, CREATE VIEW, CREATE SYNONYM
   TO ROLESTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q015
- ORCLSTUDY 사용자에게 RORSTUDY를 부여하시오.
<img src="img/chap15_015.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
GRANT ROLESTUDY TO ORCLSTUDY;

</pre>


---
<!-- _class: aqua -->
##### Q016
- ORCLSTUDY 에 부여된 롤과 권한을 확인하시오.

---
<!-- _class: aqua -->
<img src="img/chap15_016.png" alt="" width="60%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CONN ORCLSTUDY/ORACLE

SELECT * FROM USER_SYS_PRIVS;

SELECT * FROM USER_ROLE_PRIVS;
</pre>





---
<!-- _class: purple -->
# 사고확장EX



---
<!-- _class: aqua -->
##### EX001
- 다음 조건을 만족하는 SQL을 작성하시오.
1. SYSTEM 계정으로 접속하여 PREV_HW 계정을 생성하시오.
2. 비번 : ORCL로 지정
3. 접속권한을 부여하고 PREV_HW 계정으로 접속이 잘되는지 확인 하시오.

<img src="img/chap15__EX_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->


<pre class="codeblock">
--①
CREATE USER PREV_HW
IDENTIFIED BY ORCL;

--②
GRANT CREATE SESSION TO PREV_HW;
</pre>


---
<!-- _class: aqua -->
##### EX002
- SCOTT 계정으로 접속하여 위에서 생성한 PREV_HW 계정에 SCOTT 소유의 EMP, DEPT, SALGRADE 테이블에 SELECT 권한을 부여하는 SQL을 작성하시오.
- 권한을 부여했으면 PREV_HW 계정으로 SCOTT의 EMP, DEPT, SALGRADE 테이블이 잘 조회되는지 확인하시오.

<img src="img/chap15__EX_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
GRANT SELECT ON  SCOTT.EMP TO PREV_HW;

GRANT SELECT ON  SCOTT.DEPT TO PREV_HW;

GRANT SELECT ON  SCOTT.SALGRADE TO PREV_HW;
</pre>


---
<!-- _class: aqua -->
##### EX003
- SCOTT 계정으로 접속하여 PREV_HW 계정에 SALGRADE 테이블의 SELECT 권한을 취소하는 SQL문을 작성하시오.
- 권한의 변경이 완료되면 다음과 같이 PREV_HW 계정으로 SALGRADE 테이블의 조회여부를 확인하시오.

<img src="img/chap15__EX_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
REVOKE SELECT ON SALGRADE FROM PREV_HW;
</pre>



---

<!-- _class: aqua -->

1. CREATE USER SALLY IDENTIFIED BY tiger 는 어떤 작업을 하나요?  
2. GRANT SELECT ON EMP TO SALLY 는 어떤 권한을 부여하나요?  
3. REVOKE INSERT ON EMP FROM SALLY 는 어떤 효과가 있나요?  
4. WITH GRANT OPTION 은 어떤 기능을 제공하나요?  
5. 역할(Role)을 사용하는 이유는 무엇인가요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- 시스템 권한과 객체 권한의 차이는 무엇인가요?  
- DROP USER ... CASCADE 는 어떤 의미인가요?  
- GRANT 와 REVOKE 는 각각 어떤 상황에서 사용되나요?  
- 역할(Role)을 활용하면 어떤 점이 편리한가요?  
- 사용자에게 직접 권한을 부여하는 것과 역할을 통해 부여하는 것의 차이는 무엇인가요?


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>