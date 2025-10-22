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
  <span>Chapter 01: oracle_setting</span>
  <span class="current-chapter">✅▶ Chapter 02: select_basic</span>
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

***기초 SELECT 문 실습***  
→ ***테이블 구조 확인***, ***열 조회***, ***중복 제거***, ***정렬***, ***연산 및 별칭 사용***

---

<!-- _class: aqua -->
### 🔍 테이블 구조 확인  
- DESC EMP : EMP 테이블 구조 확인  
- DESC DEPT : DEPT 테이블 구조 확인  
- DESC SALGRADE : SALGRADE 테이블 구조 확인  

---

<!-- _class: aqua -->
### 🧩 기본 SELECT 문  
- SELECT * FROM EMP : EMP 테이블 전체 조회  
- SELECT EMPNO, ENAME, DEPTNO FROM EMP : 특정 열 조회  
- SELECT DISTINCT DEPTNO FROM EMP : 중복 제거  
- SELECT DISTINCT JOB, DEPTNO FROM EMP : 복합 중복 제거  
- SELECT ALL JOB, DEPTNO FROM EMP : 중복 제거 없이 조회  

---

<!-- _class: aqua -->
### 🔗 연산 및 별칭 사용  
- SAL*12+COMM : 연간 총수입 계산  
- SAL+SAL+...+COMM : 반복 연산  
- SAL*12+COMM AS ANNSAL : 별칭 사용  

---

<!-- _class: aqua -->
### 📊 정렬  
- ORDER BY SAL : 급여 오름차순  
- ORDER BY SAL DESC : 급여 내림차순  
- ORDER BY DEPTNO ASC, SAL DESC : 복합 정렬  

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 테이블 구조 확인
DESC EMP;
DESC DEPT;
DESC SALGRADE;

-- 기본 조회
SELECT * FROM EMP;
SELECT EMPNO, ENAME, DEPTNO FROM EMP;

-- 중복 제거
SELECT DISTINCT DEPTNO FROM EMP;
SELECT DISTINCT JOB, DEPTNO FROM EMP;
SELECT ALL JOB, DEPTNO FROM EMP;

-- 연산 및 별칭
SELECT ENAME, SAL, SAL*12+COMM, COMM FROM EMP;
SELECT ENAME, SAL, SAL+SAL+...+COMM, COMM FROM EMP;
SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM FROM EMP;

-- 정렬
SELECT * FROM EMP ORDER BY SAL;
SELECT * FROM EMP ORDER BY SAL DESC;
SELECT * FROM EMP ORDER BY DEPTNO ASC, SAL DESC;
</pre>

---

<!-- _class: aqua -->

## ✅ 명령어 요약표 (1/2)

| 명령어 | 설명 |
|--------|------|
| DESC EMP | EMP 테이블 구조 확인 |
| SELECT * FROM EMP | 전체 열 조회 |
| SELECT EMPNO, ENAME, DEPTNO | 특정 열 조회 | 

---

<!-- _class: aqua -->

## ✅ 명령어 요약표 (2/2)

| 명령어 | 설명 |
|--------|------|
| SELECT DISTINCT DEPTNO | 중복 제거 |
| SAL*12+COMM | 연간 총수입 계산 |
| AS ANNSAL | 별칭 지정 |
| ORDER BY SAL DESC | 급여 내림차순 정렬 |



---
<!-- _class: aqua -->

- ***DESC*** 는 테이블 구조를 보여줍니다  
- ***SELECT*** 는 데이터를 조회합니다  
- ***DISTINCT*** 는 중복을 제거합니다  
- ***AS*** 는 열에 별칭을 부여합니다  
- ***ORDER BY*** 는 정렬 기준을 지정합니다  

---
<!-- _class: green -->
# 🧪 Step 3: 연습문제



---
<!-- _class: aqua -->
##### Q001  EMP 테이블 구성을 살펴보시오

<img src="img/chap04_001.png"  alt="select_basic"  style="width:40%" />



 

---
<!-- _class: aqua -->
##### Q002 DEPT 테이블 구성을 살펴보시오
<img src="img/chap04_002.png"  alt="select_basic"  style="width:40%" />


 

---
<!-- _class: aqua -->
##### Q003  SALGRADE 테이블 구성을 살펴보시오
<img src="img/chap04_003.png"  alt="select_basic"  style="width:40%" />

 

 
---
<!-- _class: aqua -->
##### Q004  EMP 테이블 전체열을 조회하시오
<img src="./img/chap04_004.png" alt="" width="90%" />


 
 

---
<!-- _class: aqua -->
##### Q005  EMP 테이블의  EMPNO, ENAME, DEPTNO 열을 조회하시오
<img src="./img/chap04_005.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q006  EMP 테이블의  DEPTNO 열의 중복을 제거하고 조회하시오
<img src="./img/chap04_006.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q007  EMP 테이블의  JOB, DEPTNO열의 중복을 제거 조회하시오
<img src="./img/chap04_007.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q008  EMP 테이블의  JOB, DEPTNO열의 중복을 제거하지 않고 그대로 모두 조회하시오
<img src="./img/chap04_008.png" alt="" width="90%" />


 
 

---
<!-- _class: aqua -->
##### Q009 EMP 테이블의열에에 연산식을 이용하여 '연간총수입'을 조회하시오.
<img src="./img/chap04_009.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q010  EMP 테이블의 열열 더하기 연산식을이용하여 '연간총수입'을 조회하시오.
<img src="./img/chap04_010.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q011  EMP 테이블의 열 별칭을 사용하여 '연간총수입'을 조회하시오.
<img src="./img/chap04_011.png" alt="" width="90%" />
 
---
<!-- _class: aqua -->
##### Q012 EMP 테이블의 모든 열을 급여기준으로 오름차순 정렬하시오.
<img src="./img/chap04_012.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q013  EMP 테이블의 모든 열을 급여기준으로 내림차순순 정렬하시오.
<img src="./img/chap04_013.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->

##### Q014  EMP 테이블의 모든 열을 전체열을 부서번호(오름차순)와 급여(내림차순)으로 정렬하시오.
<img src="./img/chap04_014.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->

1. DESC EMP 명령어는 어떤 정보를 보여주나요?  
2. SELECT DISTINCT DEPTNO FROM EMP 는 어떤 결과를 반환하나요?  
3. SAL*12+COMM 는 어떤 계산을 수행하나요?  
4. ORDER BY DEPTNO ASC, SAL DESC 는 어떤 방식으로 정렬하나요?


---
<!-- _class: purple -->
# 🧪 Step 5: 사고확장



---
<!-- _class: aqua --> 
##### EX001.  EMP테이블의 JOB열 데이터를 중복없이 조회하시오.
<img src="./img/chap04_EX_001.png" alt="" width="90%" />

 


---
<!-- _class: aqua --> 
##### EX002. 
- 조회할 테이블은 EMP 테이블이며 모든 열을 출력하시오.
- 별칭
  EMPNO → EMPLOYEE_NO,
  ENAME → EMPLOYEE_NAME,
  MGR   → MANAGER,
  SAL   → SALARY,
  COMM  → COMMISSION,
  DEPTNO → DEPARTMENT_NO
- 부서번호를 기준으로 내림차순으로 정렬하되,
  부서번호가 같다면 사원이름을 기준으로 오름차순 정렬하시오.


---
<!-- _class: aqua --> 
<img src="./img/chap04_EX_002.png" alt="" width="90%" />


 



---

<!-- _class: red -->
# 🧪 Step 6: 기억 테스트

---

<!-- _class: aqua -->

- DESC 명령어는 어떤 용도로 사용되나요?  
- SELECT * 와 SELECT EMPNO, ENAME 의 차이는 무엇인가요?  
- DISTINCT 와 ALL 의 차이는 무엇인가요?  
- AS 키워드는 어떤 역할을 하나요?  
- ORDER BY SAL DESC 는 어떤 순서로 데이터를 보여주나요?

---

<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>
  