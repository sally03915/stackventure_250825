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
  <span class="current-chapter">✅▶ Chapter 11: object</span>
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
***SQL 객체 실습***  
→ ***뷰(View)***, ***시퀀스(Sequence)***, ***동의어(Synonym)***, ***인덱스(Index)***, ***클러스터(Cluster)***

---

<!-- _class: aqua -->
### 👁️ 뷰 (View)  
- 가상의 테이블  
- SELECT 문 결과를 저장한 객체  
- 복잡한 쿼리 단순화, 보안 목적  
- CREATE VIEW, DROP VIEW, REPLACE VIEW 사용

---

<!-- _class: aqua -->
### 🔢 시퀀스 (Sequence)  
- 자동 번호 생성기  
- 주로 기본키 값 자동 생성에 사용  
- NEXTVAL, CURRVAL로 값 참조  
- CREATE SEQUENCE, ALTER SEQUENCE, DROP SEQUENCE

---

<!-- _class: aqua -->
### 🔗 동의어 (Synonym)  
- 객체에 대한 별칭  
- 접근 편의성 및 보안 목적  
- CREATE SYNONYM, DROP SYNONYM 사용  
- 퍼블릭/프라이빗 동의어 존재

---

<!-- _class: aqua -->
### ⚙️ 인덱스 (Index)  
- 검색 성능 향상  
- 자동 생성 또는 수동 생성 가능  
- CREATE INDEX, DROP INDEX 사용  
- 과도한 인덱스는 오히려 성능 저하

---

<!-- _class: aqua -->
### 🧱 클러스터 (Cluster)  
- 여러 테이블을 물리적으로 같은 공간에 저장  
- 관련 데이터 빠른 접근 가능  
- CREATE CLUSTER, CREATE TABLE ... CLUSTER 사용

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 뷰 생성
CREATE VIEW EMP_VIEW AS
SELECT ENAME, SAL, DEPTNO FROM EMP;

-- 뷰 삭제
DROP VIEW EMP_VIEW;

-- 시퀀스 생성
CREATE SEQUENCE EMP_SEQ
START WITH 1000
INCREMENT BY 1
MAXVALUE 9999
NOCACHE;

-- 시퀀스 값 사용
INSERT INTO EMP (EMPNO, ENAME) VALUES (EMP_SEQ.NEXTVAL, 'SALLY');

-- 동의어 생성
CREATE SYNONYM EMP_SY FOR EMP;

-- 동의어 삭제
DROP SYNONYM EMP_SY;

-- 인덱스 생성
CREATE INDEX EMP_IDX ON EMP(ENAME);

-- 인덱스 삭제
DROP INDEX EMP_IDX;

-- 클러스터 생성
CREATE CLUSTER EMP_CLUSTER (DEPTNO NUMBER(2));

-- 클러스터 기반 테이블 생성
CREATE TABLE EMP (
  EMPNO NUMBER(4),
  ENAME VARCHAR2(10),
  DEPTNO NUMBER(2)
) CLUSTER EMP_CLUSTER(DEPTNO);
</pre>

---

<!-- _class: aqua -->

## ✅ 객체 요약표

| 객체 | 설명 |
|------|------|
| VIEW | 가상 테이블 |
| SEQUENCE | 자동 번호 생성기 |
| SYNONYM | 객체 별칭 |
| INDEX | 검색 성능 향상 |
| CLUSTER | 관련 테이블 공간 통합 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제


 
---
<!-- _class: aqua -->
##### Q001
- DICT을 이용하여 SCOTT계정에서 사용가능한 데이터 사전을 살펴보시오
<img src="img/chap13_001.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q002
- DICTIONARY을 이용하여 SCOTT계정에서 사용가능한 데이터 사전을 살펴보시오
<img src="img/chap13_002.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q003
- USER접두어를 가진 데이터 사전 : 현재 오라클에 접속해 있는 사용자가 소유한 객체 정보가 보관되어 있음.
- SCOTT계정이 가지고 있는 객체 정보 살펴보기
- SCOTT계정이 가지고 있는 테이블 이름 알고 싶을때 유용함.
<img src="img/chap13_003.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q004
- ALL 접두어를 가진 데이터 사전 : 오라클데이터베이스에 접속해 있는 사용자가 소유한 객체 및 다른 소유자가 소유한 객체중 사용이 허락되어 있는 객체 정보
- 사용가능한 모든 테이블이 출력됨.
<img src="img/chap13_004.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q005
- 데이터베이스 관리 권한을 가진 사용자만 조회할 수 있는 테이블
- SCOTT계정으로는 조회가 불가능함.
<img src="img/chap13_005.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q006
- (SYSTEM) SYSTEM 계정으로 DBA_ 접두어 사용하기
<img src="img/chap13_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<img src="img/chap13_006_2.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q007
- (SYSTEM)  DBA_USERS를 사용하여 사용자 정보 알아보기
<img src="img/chap13_007.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q008
- 더 빠른 검색을 위한 인덱스
- (SCOTT계정) SCOTT계정이 소유한 인덱스 정보 알아보기
<img src="img/chap13_008.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q009
- (SCOTT계정) SCOTT계정이 소유한 인덱스 컬럼 정보 알아보기
<img src="img/chap13_009.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q010
- EMP 테이블의 SAL열에 인덱스 생성하기
<img src="img/chap13_010.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q011
- 생성된 인덱스 살펴보기
<img src="img/chap13_011.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q012
- 인덱스 삭제하기기
<img src="img/chap13_012.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q013
- 생성된 인덱스 살펴보기
<img src="img/chap13_013.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q014
- 테이블처럼 사용하는 뷰
- 뷰를 SELECT문의FROM 절에 사용하면 특정데이터를 조회하는 것과 같은 효과를 얻을 수 있음.
- 편리성 : SELECT 문의 복잡도를 완화하기 위해
- 보완성 : 테이블의 특정열을 노출하고 싶지 않을때


---
<!-- _class: aqua -->
1. 뷰를 생성하기위해 SYSTEM으로 계정변경
2. SCOTT에 VIEW 생성권한 주기
<img src="img/chap13_014.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q015
-  SCOTT 계정으로 VIEW 생성하기
-  EMP 테이블에서 DEPTNO가 20인   EMPNO, ENAME, JOB, DEPTNO  열의 데이터로  VW_EMP20  라는 VIEW를 생성하시오오


---
<!-- _class: aqua -->
<img src="img/chap13_015.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q016
- VIEW가 잘 만들어 졌는지 USER_VIEWS에서서 조회하시오.
<img src="img/chap13_016.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q017
- (SCOTT계정 ) 생성한 뷰의 내용을 확인하시오.
<img src="img/chap13_017.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q018
- VW_EMP20 의 생성한 뷰를 조회하시오.
<img src="img/chap13_018.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q019
- VW_EMP20 뷰를 삭제 하시오.
<img src="img/chap13_019.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q020
- 인라인뷰 : 일회성으로 만들어서 사용하는 뷰
- SELECT에서 사용되는 서브쿼리, WITH절에서 미리 이름을 정의해사용하는 SELECT문이 해당됨.
- ROWNUM을 이용하면 열의 데이터가 숫자로 출력되는 것을 확인 할수 있음.

---
<!-- _class: aqua -->
<img src="img/chap13_020.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q021
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여 조회하시오.
<img src="img/chap13_021.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q022
- 인라인뷰 (서브쿼리) 를 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여 조회하시오.
<img src="img/chap13_022.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q023
- 인라인뷰( WITH 절)을 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여 조회하시오.
<img src="img/chap13_023.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q024
- 인라인뷰 (서브쿼리) 를 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여
- 마지막으로 급여가 높은 상위 세면의 데이터만 출력하시오.

---
<!-- _class: aqua -->
<img src="img/chap13_024.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q025
- 인라인뷰 (WITH 절절) 를 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여
- 마지막으로 급여가 높은 상위 세면의 데이터만 출력하시오.

---
<!-- _class: aqua -->
<img src="img/chap13_025.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q026
- DEPT 테이블을 이용하여 테이블 열구성은 갖고 데이터가 없는  DEPT_SEQUENCE 테이블을 생성하시오.
<img src="img/chap13_026.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q027
- 기존의 부서번호는 10으로 시작해서 10씩증가하고 최대는 90, 최소는 0, 반복안하는 SEQ_DEPT_SEQUENCE 시퀀스를 작성하시오.
<img src="img/chap13_027.png" alt="" width="90%" />


 
<!-- _class: aqua -->
##### Q028
- 생성한 시퀀스 SEQ_DEPT_SEQUENCE 를 조회하시오.
<img src="img/chap13_028.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q029
- DEPT_SEQUENCE 테이블에  SEQ_DEPT_SEQUENCE 시퀀스를 이용하여 다음과 같이 데이터를 삽입하시오.
<img src="img/chap13_029.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q030
- 가장 마지막으로 생성한 시퀀스를 확인하시오.
<img src="img/chap13_030.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q031
- 시퀀스에서 생성한 순번을 사용하여 INSERT문을 실행하시오.
<img src="img/chap13_031.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q032
- SEQ_DEPT_SEQUENCE 시퀀스를 최대값 99, 증가값을 3, CYCLE옵션을 주어 다음과 같이 수정하시오.
<img src="img/chap13_032.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q033
- 옵션을 수정한 시퀀스를 조회하시오.
<img src="img/chap13_033.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q034
- 수정한 시퀀스로 다음과 같이 데이터를 삽입하시오.
<img src="img/chap13_034.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q035
- SEQ_DEPT_SEQUENCE 시퀀스의 최대값 도달 후 수행결과를 확인하시오.
<img src="img/chap13_035.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q036
- SEQ_DEPT_SEQUENCE 시퀀스 삭제후 확인하시오.
<img src="img/chap13_036.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q037
- SYNONYM? 동의어
- 테이블, 뷰, 시퀀스 등 객체 이름 대신에 사용할 수 있는 다른 이름을 뷰여하는 객체
- 테이블 이름이 너무길어 사용이 불편할때 좀더 간단하고 짧은 이름을 하나 더 만들어주기 위해 사용함.

- (SYSTEM 계정) SCOTT에 CREATE SYNONYM 생성권한,
  PUBLIC 데이터베이스 내 모든 사용자가 사용할수 있도록 설정하는 권한 부여
  
---
<!-- _class: aqua -->
<img src="img/chap13_037.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q038
- (SCOTT) EMP 테이블의 동의어를 E로 생성하시오.
<img src="img/chap13_038.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q039
- E 테이블 전체 내용을 조회하시오.
<img src="img/chap13_039.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q040
- E 동의어를 삭제하시오.
<img src="img/chap13_040.png" alt="" width="90%" />


 



---
<!-- _class: purple -->
# 사고확장EX



---
<!-- _class: aqua -->
##### EX001
1. EMP 테이블과 같은 구조의 데이터를 저장하는 EMPIDX 테이블을 생성하시오.
2. 생성한 EMPIDX 테이블의 EMPNO열에  IDX_EMPIDX_EMPNO 인덱스를 생성하시오.
3. 인덱스가 잘 생성되었는지 적절한 데이터 사전뷰를 통해 확인하시오.

---
<!-- _class: aqua -->
<img src="img/chap13__EX_001.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### EX002
1.  EMPIDX 테이블의 급여(SAL) 가 1500 초과인 사원들만 출력하는 EMPIDX_OVER15K 뷰를 생성하시오.
2. 만약 이뷰가 존재한다면 새로운 내용으로 대체가능하게 작성하시오.
3. EMPIDX_OVER15K 뷰는 EMPNO, ENAME, JOB, DEPTNO, SAL , COMM 이 있다면 O 존재하지 않으면 X 열을 가지고 있습니다.


---
<!-- _class: aqua -->
<img src="img/chap13__EX_002.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### EX003
1. DEPT 테이블과 같은 결과 행 구성ㅇ르 가지는 DEPTSEQ 테이블을 작성하시오.
2. DEPTSEQ ㅔ이블에 사용할 SEQ_DEPTSEQ 시퀀스를 작성하시오.
   시작값1 , 증가1, 최대값 99, 최소값 1, 부서번호 최대값에서 생성중단, 캐시 없음
3. DEPTSEQ 를 이용하여 다음과 같이 세개 부서를 차례대로 추가하시오.

---
<!-- _class: aqua -->
<img src="img/chap13__EX_003.png" alt="" width="90%" />

 
<!-- _class: aqua -->

1. CREATE VIEW EMP_VIEW AS ... 는 어떤 객체를 생성하나요?  
2. EMP_SEQ.NEXTVAL 은 어떤 값을 반환하나요?  
3. CREATE SYNONYM 은 어떤 목적을 가지고 있나요?  
4. 인덱스는 언제 유용하게 사용되나요?  
5. 클러스터는 어떤 방식으로 데이터를 저장하나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- 뷰(View)와 테이블의 차이는 무엇인가요?  
- 시퀀스는 어떤 상황에서 사용되나요?  
- 동의어(Synonym)는 어떤 장점이 있나요?  
- 인덱스는 항상 성능을 향상시키나요?  
- 클러스터는 어떤 구조적 특징을 가지나요?
 

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span> 