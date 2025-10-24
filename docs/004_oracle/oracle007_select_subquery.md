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
  <span class="current-chapter">✅▶ Chapter 07: select_subquery</span>
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
***SQL 서브쿼리 실습***  
→ ***단일 행 서브쿼리***, ***다중 행 서브쿼리***, ***다중 열 서브쿼리***, ***상관 서브쿼리***, ***IN/EXISTS 서브쿼리***

---

<!-- _class: aqua -->
### 🔍 단일 행 서브쿼리  
- 하나의 결과만 반환  
- =, >, <, >=, <=, <> 등 비교 연산자 사용  
- 예: WHERE SAL > (SELECT AVG(SAL) FROM EMP)

---

<!-- _class: aqua -->
### 🔁 다중 행 서브쿼리  
- 여러 결과를 반환  
- IN, ANY, ALL, EXISTS 사용  
- 예: WHERE JOB IN (SELECT JOB FROM EMP WHERE DEPTNO = 10)

---

<!-- _class: aqua -->
### 🧩 다중 열 서브쿼리  
- 여러 컬럼을 동시에 비교  
- 예: WHERE (DEPTNO, JOB) IN (SELECT DEPTNO, JOB FROM EMP WHERE SAL > 3000)

---

<!-- _class: aqua -->
### 🔄 상관 서브쿼리  
- 외부 쿼리의 값을 내부 쿼리에서 참조  
- 내부 쿼리가 외부 쿼리의 각 행마다 실행됨  
- 예: WHERE SAL > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO = E.DEPTNO)

---

<!-- _class: aqua -->
### 🧠 EXISTS 서브쿼리  
- 조건 만족 여부만 판단  
- 결과 존재 여부에 따라 TRUE/FALSE 반환  
- 예: WHERE EXISTS (SELECT 1 FROM EMP WHERE MGR IS NULL)

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 단일 행 서브쿼리
SELECT ENAME, SAL
  FROM EMP
 WHERE SAL > (SELECT AVG(SAL) FROM EMP);

-- 다중 행 서브쿼리
SELECT ENAME, JOB
  FROM EMP
 WHERE JOB IN (SELECT JOB FROM EMP WHERE DEPTNO = 10);

-- 다중 열 서브쿼리
SELECT ENAME, DEPTNO, JOB
  FROM EMP
 WHERE (DEPTNO, JOB) IN (
       SELECT DEPTNO, JOB
         FROM EMP
        WHERE SAL > 3000);

-- 상관 서브쿼리
SELECT ENAME, SAL, DEPTNO
  FROM EMP E
 WHERE SAL > (SELECT AVG(SAL)
                FROM EMP
               WHERE DEPTNO = E.DEPTNO);

-- EXISTS 서브쿼리
SELECT DNAME
  FROM DEPT D
 WHERE EXISTS (
       SELECT 1
         FROM EMP E
        WHERE D.DEPTNO = E.DEPTNO);
</pre>

---

<!-- _class: aqua -->

## ✅ 서브쿼리 요약표

| 서브쿼리 유형 | 설명 |
|---------------|------|
| 단일 행 서브쿼리 | 하나의 결과 비교 |
| 다중 행 서브쿼리 | 여러 결과 비교 |
| 다중 열 서브쿼리 | 여러 컬럼 동시 비교 |
| 상관 서브쿼리 | 외부 쿼리 참조 |
| EXISTS 서브쿼리 | 존재 여부 판단 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

 

---
<!-- _class: aqua -->
##### Q001
- EMP 테이블에서 다음과 같이 출력하시오.
1. 사원이름이 JONES 인 사원의 급여를 출력하시오.

<img src="img/chap09_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT SAL
  FROM EMP
 WHERE ENAME = 'JONES';

</pre>


---
<!-- _class: aqua -->
##### Q002
- EMP 테이블에서 다음과 같이 출력하시오.
1. 급여가 2975보다 높은 사원정보를  출력하시오.
<img src="img/chap09_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL > 2975;

</pre>


---
<!-- _class: aqua -->
##### Q003
- EMP 테이블에서 다음과 같이 출력하시오.
1. JONES의 급여보다
2. 높은급여를 받는  사원정보를  출력하시오.

<img src="img/chap09_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL > (
SELECT SAL
                FROM EMP
               WHERE ENAME = 'JONES');

</pre>


---
<!-- _class: aqua -->
##### Q004
- EMP 테이블에서 다음과 같이 출력하시오.
1. SCOTT보다 빨리 입사한 사원목록을   출력하시오.
<img src="img/chap09_004.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE HIREDATE < (
SELECT HIREDATE
                     FROM EMP
                    WHERE ENAME = 'SCOTT');

</pre>


---
<!-- _class: aqua -->
##### Q005
- EMP 테이블에서 다음과 같이 출력하시오.
1. 20번부서에 속한 사원 중
2. 전체사원의 평균급여보다 높은 급여를받는 사원정보와 소속부서정보를  출력하시오.
<img src="img/chap09_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO, D.DNAME, D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND E.DEPTNO = 20
   AND E.SAL > (
SELECT AVG(SAL)
                  FROM EMP);

</pre>


---
<!-- _class: aqua -->
##### Q006
- EMP 테이블에서 다음과 같이 출력하시오.
1. 부서번호가 20이거나 30인 사원의 정보를 출력하시오.
<img src="img/chap09_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE DEPTNO IN (20, 30);

</pre>


---
<!-- _class: aqua -->
##### Q007
- EMP 테이블에서 다음과 같이 출력하시오.
1. 각 부서별 최고급여와 동일한 급여를 받는 사원정보를 출력하시오.
<img src="img/chap09_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL IN (
SELECT MAX(SAL)
                 FROM EMP
               GROUP BY DEPTNO);

</pre>


---
<!-- _class: aqua -->
##### Q008
- EMP 테이블에서 다음과 같이 출력하시오.
1. 부서번호 별로 최대 급여를 출력하시오.
2. 7번문제가 잘풀렸는지 확인하시오.
<img src="img/chap09_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT MAX(SAL)
  FROM EMP
GROUP BY DEPTNO;

</pre>


---
<!-- _class: aqua -->
##### Q009
-EMP 테이블에서 다음과 같이 출력하시오.
1. ANY 연산자를 이용하여 다음과같이 출력해보시오  (각부서별 최대급여)
2. IN 과 같은결과
<img src="img/chap09_009.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL = ANY (
SELECT MAX(SAL)
                    FROM EMP
                  GROUP BY DEPTNO);

</pre>


---
<!-- _class: aqua -->
##### Q010
-EMP 테이블에서 다음과 같이 출력하시오.
1. SOME 연산자를 이용하여 다음과같이 출력해보시오  (각부서별 최대급여)
2. IN 과 같은결과

<img src="img/chap09_010.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL = SOME (
SELECT MAX(SAL)
                     FROM EMP
                   GROUP BY DEPTNO);

</pre>


---
<!-- _class: aqua -->
##### Q0011
- EMP 테이블에서 다음과 같이 출력하시오.
1. ANY를 이용하여 30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사원정보를 출력하시오.
<img src="img/chap09_011.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL < ANY (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30)
                  ORDER BY SAL, EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q012
- EMP 테이블에서 다음과 같이 출력하시오.
1. 부서번호가 30인 사원들의 급여를 출력하시오.
<img src="img/chap09_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT SAL
  FROM EMP
 WHERE DEPTNO = 30;

</pre>


---
<!-- _class: aqua -->
##### Q013
- EMP 테이블에서 다음과 같이 출력하시오.
1. ANY를 이용하여 30번 부서 사원들의 최소 급여보다 많은은 급여를 받는 사원정보를 출력하시오.
<img src="img/chap09_013.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL > ANY (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30);

</pre>


---
<!-- _class: aqua -->
##### Q014
- EMP 테이블에서 다음과 같이 출력하시오.
1. ALL를 이용하여 30번 부서 사원들의 최소 급여보다 더 적은 급여를 받는 사원정보를 출력하시오.
<img src="img/chap09_014.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL < ALL (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30);

</pre>


---
<!-- _class: aqua -->
##### Q015
- EMP 테이블에서 다음과 같이 출력하시오.
1. ALL를 이용하여 30번 부서 사원들의 최대 급여보다 더 많은 급여를 받는 사원정보를 출력하시오.
<img src="img/chap09_015.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE SAL > ALL (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30);

</pre>


---
<!-- _class: aqua -->
##### Q016
- EMP 테이블에서 다음과 같이 출력하시오.
1. EXISTS - 서브쿼리에 결과 값이 하나이상 존재하면 조건식이 모두 TRUE, 아니면 FALSE 됨
- 결과값이 모두 존재히기때문에 EMP 모든행이 출력됨.
<img src="img/chap09_016.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE EXISTS (
SELECT DNAME
                 FROM DEPT
                WHERE DEPTNO = 10);

</pre>


---
<!-- _class: aqua -->
##### Q017
- EMP 테이블에서 다음과 같이 출력하시오.
1. EXISTS - 서브쿼리에 결과 값이 하나이상 존재하면 조건식이 모두 TRUE, 아니면 FALSE 됨
- 결과값이 모두 존재하지 않기때문에 아무행도 출력안됨.
<img src="img/chap09_017.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE EXISTS (
SELECT DNAME
                 FROM DEPT
                WHERE DEPTNO = 50);

</pre>


---
<!-- _class: aqua -->
##### Q018
- EMP 테이블에서 다음과 같이 출력하시오.
1. 다중열 서브쿼리를 이용하여 WHERE (DEPTNO, SAL) IN ( ... )
 부서별 최대급여를 받는 사원정보를 출력하시오.
<img src="img/chap09_018.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP
 WHERE (DEPTNO, SAL) IN (
SELECT DEPTNO, MAX(SAL)
                           FROM EMP
                         GROUP BY DEPTNO);

</pre>


---
<!-- _class: aqua -->
##### Q019
- EMP 테이블에서 다음과 같이 출력하시오.
1. FROM 절에서 사용하는 인라인 뷰를 이용하여
   부서번호가 10인 사용자 정보와  부서정보를 가져와 
2. EMPNO, ENAME, DEPTNO, DNAME, LOC 를 출력하시오.
---
<!-- _class: aqua -->
<img src="img/chap09_019.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
  FROM (
SELECT * FROM EMP WHERE DEPTNO = 10) E10,
       (
SELECT * FROM DEPT) D
 WHERE E10.DEPTNO = D.DEPTNO;

</pre>


---
<!-- _class: aqua -->
##### Q020
- WITH
- FROM 절에 명시하는 방식보다 몇십, 몇백줄의 규보가 되었을때 유용하게 사용됨.
<img src="img/chap09_020.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
WITH
E10 AS (
SELECT * FROM EMP WHERE DEPTNO = 10),
D AS (
SELECT * FROM DEPT)
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
  FROM E10, D
 WHERE E10.DEPTNO = D.DEPTNO;

</pre>


---
<!-- _class: aqua -->
##### Q0021
- 열에 명시하는 스칼라서브쿼리
1. EMP 테이블의  EMPNO, ENAME, JOB, SAL
2. EMP 테이블의 SAL을 이용하여 SALGRADE에서 등급(GRADE)을 구하고
3. EMP 테이블의 DEPTNO를 이용하여 DEPTNO가 같은  부서명(DNAME)을 구하시오.
---
<!-- _class: aqua -->
<img src="img/chap09_021.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT EMPNO, ENAME, JOB, SAL,
       (
SELECT GRADE
          FROM SALGRADE
         WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE,
       DEPTNO,
      (
SELECT DNAME
         FROM DEPT
        WHERE E.DEPTNO = DEPT.DEPTNO) AS DNAME
FROM EMP E;
</pre>






---
<!-- _class: purple -->
# 사고확장EX



---
<!-- _class: aqua -->
##### EX001
- EMP 테이블에서 다음과 같이 출력하시오.
1. 전체 사원 중 ALLEN과 같은 직책(JOB)인 사원들의 사원정보, 부서정보를 다음과 같이 출력하시오.
<img src="img/chap09__EX_001.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### EX002
- EMP 테이블에서 다음과 같이 출력하시오.
1. 전체 사원의 평균급여(SAL) 보다 높은 급여를 받는 사원들의 사원정보, 부서정보, 급여등급정보를 출력하시오.
2. 급여가 많은 순으로 정렬하되 급여가 같은경우에는 사원번호를 기준으로 오름차순으로 정렬

---
<!-- _class: aqua -->
<img src="img/chap09__EX_002.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### EX003
- EMP 테이블에서 다음과 같이 출력하시오.
1. 10번부서에서 근무하는 사원 중 30번부서에는 존재하지 않는 직책을 가진 사원들의 사원정보, 부서정보를 다음과 같이 출력하는 SQL문을 작성하시오.

<img src="img/chap09__EX_003.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### EX004
- EMP 테이블에서 다음과 같이 출력하시오.
1. 직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여를 받는 사원들의 사원정보, 급여등급정보를 다음과 같이 출력하시오.
2. 다중행 함수 사용하지 않는 방법, 다중행 함수 사용하는 방법 2가지로 작성하시오.
3. 사원번호를 기준으로 오름차순으로 정렬하시오.
 
 
 
---
<!-- _class: aqua -->
- 다중행 함수 사용하는 방법
 
<img src="img/chap09__EX_004_2.png" alt="" width="90%" />


 

---

<!-- _class: aqua -->

1. SAL > (SELECT AVG(SAL) FROM EMP) 은 어떤 의미인가요?  
2. JOB IN (SELECT JOB FROM EMP WHERE DEPTNO = 10) 은 어떤 조건인가요?  
3. (DEPTNO, JOB) IN (...) 은 어떤 방식의 비교인가요?  
4. 상관 서브쿼리는 어떤 방식으로 실행되나요?  
5. EXISTS 서브쿼리는 어떤 상황에서 유용한가요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- 단일 행 서브쿼리와 다중 행 서브쿼리의 차이는 무엇인가요?  
- IN 과 EXISTS 는 어떤 차이가 있나요?  
- 상관 서브쿼리는 어떤 경우에 사용되나요?  
- 다중 열 서브쿼리는 어떤 조건을 비교하나요?  
- ANY, ALL 은 어떤 연산자와 함께 사용되나요?
 


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>