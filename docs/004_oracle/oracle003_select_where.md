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
  <span>▶Chapter 01: oracle_setting</span>
  <span>▶ Chapter 02: select_basic</span>
  <span class="current-chapter">✅▶  Chapter 03: select_where</span>
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
***조건에 맞는 데이터 조회하기***  
→ ***WHERE절***, ***비교 연산자***, ***논리 연산자***, ***LIKE 패턴***, ***NULL 처리***, ***집합 연산자***

---

<!-- _class: aqua -->
### 🔍 WHERE 조건절 기본  
- WHERE : 조건에 맞는 행만 조회  
- = / != / <> / ^= : 등가 비교  
- AND / OR / NOT : 논리 연산  
- BETWEEN ... AND ... : 범위 지정  
- LIKE / NOT LIKE : 패턴 검색  
- IS NULL / IS NOT NULL : NULL 여부 확인  

---

<!-- _class: aqua -->
### 🧩 집합 연산자  
- UNION : 중복 제거 후 합집합  
- UNION ALL : 중복 포함 합집합  
- MINUS : 차집합  
- INTERSECT : 교집합  

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 기본 조회
SELECT * FROM EMP;

-- 조건 조회
SELECT * FROM EMP WHERE DEPTNO = 30;
SELECT * FROM EMP WHERE DEPTNO = 30 AND JOB = 'SALESMAN';
SELECT * FROM EMP WHERE DEPTNO = 30 OR JOB = 'CLERK';

-- 연산 조건
SELECT * FROM EMP WHERE SAL * 12 = 36000;
SELECT * FROM EMP WHERE SAL >= 3000;

-- 문자열 비교
SELECT * FROM EMP WHERE ENAME >= 'F';
SELECT * FROM EMP WHERE ENAME <= 'FORZ';

-- 부정 조건
SELECT * FROM EMP WHERE SAL != 3000;
SELECT * FROM EMP WHERE SAL <> 3000;
SELECT * FROM EMP WHERE SAL ^= 3000;
SELECT * FROM EMP WHERE NOT SAL = 3000;

-- IN / NOT IN
SELECT * FROM EMP WHERE JOB IN ('MANAGER', 'SALESMAN', 'CLERK');
SELECT * FROM EMP WHERE JOB NOT IN ('MANAGER', 'SALESMAN', 'CLERK');

-- 범위 조건
SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 3000;
SELECT * FROM EMP WHERE SAL NOT BETWEEN 2000 AND 3000;

-- LIKE 조건
SELECT * FROM EMP WHERE ENAME LIKE 'S%';
SELECT * FROM EMP WHERE ENAME LIKE '_L%';
SELECT * FROM EMP WHERE ENAME LIKE '%AM%';
SELECT * FROM EMP WHERE ENAME NOT LIKE '%AM%';

-- NULL 조건
SELECT * FROM EMP WHERE COMM IS NULL;
SELECT * FROM EMP WHERE MGR IS NOT NULL;

-- 집합 연산자
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20;

-- MINUS / INTERSECT
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP
MINUS
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP
INTERSECT
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10;
</pre>

---

<!-- _class: aqua -->

## ✅ 조건절 요약표

| 조건 | 설명 |
|------|------|
| WHERE DEPTNO = 30 | 부서번호가 30인 행 |
| SAL * 12 = 36000 | 연봉이 36000인 행 |
| ENAME LIKE 'S%' | 이름이 S로 시작 |
| SAL BETWEEN 2000 AND 3000 | 급여가 2000~3000 사이 |
| COMM IS NULL | 커미션이 없는 행 |
| JOB IN (...) | 특정 직책 포함 |
| UNION | 중복 제거 합집합 |
| MINUS | 차집합 |
| INTERSECT | 교집합 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

 

---
<!-- _class: aqua -->
##### Q001 - EMP테이블의 모든 열을  조회하시오.

<img src="img/chap05_001.png" alt="" width="90%" />
 



---
<!-- _class: aqua -->
##### Q002 EMP테이블에서 부서번호가 30인 데이터만 조회하시오.

<img src="img/chap05_002.png" alt="" width="90%" />
 


---
<!-- _class: aqua -->
##### Q003  EMP테이블에서  AND를 이용하여 부서번호가 30이고 JOB이 'SALESMAN' 인 데이터만 조회하시오.
<img src="img/chap05_003.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q004  EMP테이블에서  OR를 이용하여 부서번호가 30이거나 JOB이 'CLERK' 인 데이터만 조회하시오.
<img src="img/chap05_004.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q005 EMP테이블에서 SAL 열에 12를 곱한값이 36000인 행을 조회하시오.
<img src="img/chap05_005.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q006 EMP테이블에서 SAL 열이 3000이상인 행을 조회하시오.
<img src="img/chap05_006.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q007 EMP테이블에서  ENAME 열의 첫문자가 F와 같거나 뒤에 있는 행을 조회하시오.
<img src="img/chap05_007.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q008 EMP테이블에서  ENAME 열의 문자열이 첫문자 F, 두번째 문자 O, 세번째 문자 R, 네번째문자열이 Z 인 문자열보다 앞에 있는 행을 조회하시오.
<img src="img/chap05_008.png" alt="" width="80%" />

 


---
<!-- _class: aqua -->
##### Q009 EMP테이블에서   != 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
<img src="img/chap05_009.png" alt="" width="90%" />
 



---
<!-- _class: aqua -->
##### Q010 EMP테이블에서   <> 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
<img src="img/chap05_010.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q011 EMP테이블에서   ^= 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
<img src="img/chap05_011.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q012 EMP테이블에서   NOT를를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
<img src="img/chap05_012.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q013 EMP테이블에서   OR 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회하시오.
<img src="img/chap05_013.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q014 EMP테이블에서   IN 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회하시오.
<img src="img/chap05_014.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q015 EMP테이블에서   등가연산자(!= , <>, ^=)와 AND 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 <u>포함되지않는</u> 행을 조회하시오.
<img src="img/chap05_015.png" alt="" width="80%" />


 

---
<!-- _class: aqua -->
##### Q016 EMP테이블에서  NOT  IN 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 <u>포함되지않는</u> 행을 조회하시오.
<img src="img/chap05_016.png" alt="" width="80%" />

 


---
<!-- _class: aqua -->
##### Q017  EMP테이블에서  대소비교연산자(<=  , >= )  and 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회하시오.
<img src="img/chap05_017.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q018  EMP테이블에서  BETWEEN AND 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회하시오.
<img src="img/chap05_018.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q019  EMP테이블에서 NOT BETWEEN AND 를 이용하여 sal 열이 2000이상 3000이하인 사이 이외의 행을 조회하시오.
<img src="img/chap05_019.png" alt="" width="90%" />
 


---
<!-- _class: aqua -->
##### Q020  EMP테이블에서 ENAME이 S로 시작하는 행을 조회하시오.
<img src="img/chap05_020.png" alt="" width="90%" />
 
---
<!-- _class: aqua -->
##### Q021  EMP테이블에서 ENAME의 두번째 글자가 L인  행을 조회하시오.
<img src="img/chap05_021.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q022  EMP테이블에서 ENAME에  AN이 포함되어 있는 행을 조회하시오.
<img src="img/chap05_022.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q023  EMP테이블에서 ENAME에  AN이 포함되어 있지 않는 행을 조회하시오.
<img src="img/chap05_023.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q024  EMP테이블에서 별칭을 사용하여 다음과 같이 '연간총수입' 행을 조회하시오.
<img src="img/chap05_024.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q025   코드확인 
- NULL의 의미
- 비어 있는 상태 , 현재 무슨 값인지 확정 되지 않은 상태, 값 자체가 존재하지 않은 상태
- NULL과 비교연산자(=) 와 같이 사용하면 안됨.
- 어떤값인지 모르므로 작은지, 큰지 모르기 때문에 값이 안나옴.


---
<!-- _class: aqua -->
<img src="img/chap05_025.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q026   IS NULL
- 상태확인
- NULL 인지 아닌지를 비교하는 용도
<img src="img/chap05_026.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q027 EMP테이블에서 직송상관이 있는데이터만 조회하시오
- MGR열이 NULL 이 아닌 행조회 
<img src="img/chap05_027.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q028  - 되는 코드는?
- 있는지 없는지만 판단.
- 다음코드를 해석 하시오.
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL > NULL
   AND COMM IS NULL;
</pre>



---
<!-- _class: aqua -->
<img src="img/chap05_028.png" alt="" width="90%" />



---
<!-- _class: aqua -->
##### Q029  - 되는 코드는?
- 있는지 없는지만 판단.
- 다음코드를 해석석하시오.
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL > NULL
    OR COMM IS NULL;
</pre>




---
<!-- _class: aqua -->
<img src="img/chap05_029.png" alt="" width="90%" />


---
<!-- _class: aqua -->
##### Q030   UNION을 이용하여 DEPTNO가 10이거나, 20인 데이터의  EMPNO, ENAME, SAL, DEPTNO 열을 조회하시오.
<img src="img/chap05_030.png" alt="" width="90%" />
 


---
<!-- _class: aqua -->
##### Q031   에러가 나는 이유는?
- 열의 갯수가 다를때
<img src="img/chap05_031.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q032   에러가 나는 이유는?
- 자료형이 다를때 
<img src="img/chap05_032.png" alt="" width="90%" />
 
 
---
<!-- _class: aqua -->
##### Q033  동작하는 이유는?
- 출력 열개수와 자료형이 같으므로 동작가능!
<img src="img/chap05_033.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q034  UNION과 UNION ALL의 차이는?
<img src="img/chap05_034.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q035   UNION과 UNION ALL의 차이는?
<img src="img/chap05_035.png" alt="" width="90%" />
 


---
<!-- _class: aqua -->
##### Q036  MINUS의 의미는?
- EMP테이블 전체행을 조회한 첫번째 SELECT문의 결과에서 10번부서에 있는 사원데이터를 제외한 결과값
<img src="img/chap05_036.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q037  INTERSECT 의미는?  교집합 
- 두 SELECT 문의 결과값이 같은데이터만 출력
<img src="img/chap05_037.png" alt="" width="90%" />

 



---
<!-- _class: purple -->
# 사고확장


 


---
<!-- _class: aqua -->
##### EX001  EMP테이블에서 ENAME이 S로 끝나는 사원데이터를 모두 조회하시오
<img src="img/chap05_EX_001.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### EX002  EMP테이블에서 DEPTNO가 30인 사원 중 직책이(JOB)이 SALESMAN 인 사원의 EMPNO, ENAME, JOB, SAL, DEPTNO를 조회하시오
<img src="img/chap05_EX_002.png" alt="" width="80%" />


 

---
<!-- _class: aqua -->
##### EX003  집합연산자( UNION을 )를 사용하지 않은 방식
- EMP테이블에서 IN 연산자를 이용하여   DEPTNO 가 20 또는 30인 사원의 SAL이  2000 초과인 사원을 조회하시오

---
<!-- _class: aqua -->
<img src="img/chap05_EX_003.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### EX003   집합연산자( UNION을 )를 사용한 방식
- EMP테이블에서 IN 연산자를 이용하여   DEPTNO 가 20 또는 30인 사원의 SAL이  2000 초과인 사원을 조회하시오
---
<!-- _class: aqua -->
<img src="img/chap05_EX_003.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
#####  EX004  EMP테이블에서 NOT BETWEEN AND 연산자를 사용하지 않고 SAL이 2000이상 3000이하의 값이 아닌 데이터만 조회하시오.
-- EMP테이블에서 
-- NOT BETWEEN AND 연산자를 사용하지 않고 [ SAL이 2000이상 3000이하의 값을 가진 데이터] 아닌값 
-- 조회하시오.
-- Q1. 2000~3000 사이인값 표현 (2개)
-- Q2. 2000~3000 사이가 아닌값 표현 NOT BETWEEN AND 사용 (1개) 
-- Q3. 2000~3000 사이가 아닌값 표현 or 사용 (1개) 

---
<!-- _class: aqua -->
<img src="img/chap05_EX_004.png" alt="" width="90%" />





---
<!-- _class: aqua -->
##### EX005  EMP테이블에서 ENAME에 E가 포함되고 DEPTNO가 30인 사원의 급여가 1000~2000사이가 아닌 사원의  ENAME, EMPNO, SAL, DEPTNO 를 조회하시오.


---
<!-- _class: aqua -->
<img src="img/chap05_EX_005.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### EX006
- EMP테이블에서  COMM 이 없고  ,  MGR은 존재하면 JOB 이 'MANAGER', 'CLERK' 인 사원 중 사원의 이름2번째 글자기 L 이 아닌 사원의 정보를 조회하시오.
<img src="img/chap05_EX_006.png" alt="" width="90%" />



---

<!-- _class: aqua -->
1. SAL BETWEEN 2000 AND 3000 은 어떤 범위를 의미하나요?  
2. ENAME LIKE '_L%' 는 어떤 패턴을 찾나요?  
3. COMM IS NULL 은 어떤 상태를 의미하나요?  
4. UNION 과 UNION ALL 의 차이는 무엇인가요?  
5. SAL ^= 3000 은 어떤 조건을 의미하나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- WHERE 절은 어떤 역할을 하나요?  
- LIKE '%S' 는 어떤 문자열을 찾나요?  
- NOT IN (...) 은 어떤 조건을 의미하나요?  
- BETWEEN ... AND ... 은 어떤 범위를 지정하나요?  
- IS NULL 과 = NULL 의 차이는 무엇인가요?
 
---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>
  