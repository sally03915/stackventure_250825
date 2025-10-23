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
  <span class="current-chapter">✅▶ Chapter 06: select_join</span>
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
***SQL 조인 실습***  
→ ***등가 조인***, ***비등가 조인***, ***자체 조인***, ***외부 조인***, ***ANSI 조인***

---

<!-- _class: aqua -->
### 🔗 등가 조인 (Equi Join)  
- 두 테이블의 공통 컬럼을 기준으로 동일한 값을 가진 행을 연결  
- WHERE 절 또는 ON 절에서 = 사용  
- 예: EMP.DEPTNO = DEPT.DEPTNO

---

<!-- _class: aqua -->
### 🔀 비등가 조인 (Non-Equi Join)  
- 공통 컬럼이 아닌 범위 조건 등으로 조인  
- 예: SAL BETWEEN LOSAL AND HISAL

---

<!-- _class: aqua -->
### 🔁 자체 조인 (Self Join)  
- 같은 테이블을 두 번 참조하여 조인  
- 별칭(alias)을 사용해 구분  
- 예: EMP E1, EMP E2

---

<!-- _class: aqua -->
### 🧩 외부 조인 (Outer Join)  
- 매칭되지 않는 행도 포함  
- LEFT, RIGHT, FULL OUTER JOIN  
- Oracle 전통 방식: (+) 기호 사용

---

<!-- _class: aqua -->
### 🧠 ANSI 조인  
- SQL 표준 방식의 조인  
- INNER JOIN, LEFT OUTER JOIN, RIGHT OUTER JOIN, FULL OUTER JOIN  
- ON 절로 조건 명시

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 등가 조인
SELECT E.ENAME, D.DNAME
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO;

-- 비등가 조인
SELECT E.ENAME, S.GRADE
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

-- 자체 조인
SELECT E1.ENAME AS 사원, E2.ENAME AS 관리자
  FROM EMP E1, EMP E2
 WHERE E1.MGR = E2.EMPNO;

-- 외부 조인 (Oracle 방식)
SELECT E.ENAME, D.DNAME
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO(+);

-- ANSI 방식 조인
SELECT E.ENAME, D.DNAME
  FROM EMP E
  LEFT OUTER JOIN DEPT D
    ON E.DEPTNO = D.DEPTNO;

-- FULL OUTER JOIN
SELECT E.ENAME, D.DNAME
  FROM EMP E
  FULL OUTER JOIN DEPT D
    ON E.DEPTNO = D.DEPTNO;
</pre>

---

<!-- _class: aqua -->

## ✅ 조인 요약표

| 조인 유형 | 설명 |
|-----------|------|
| 등가 조인 | 공통 컬럼 값이 같은 행 연결 |
| 비등가 조인 | 범위 조건 등으로 연결 |
| 자체 조인 | 같은 테이블 내 관계 표현 |
| 외부 조인 | 매칭되지 않는 행도 포함 |
| ANSI 조인 | 표준 SQL 방식의 조인 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제



 

---
<!-- _class: aqua -->
##### Q001
- EMP, DEPT 테이블을 이용하여 FROM 절에 여러 테이블을 선언해해   다음과 같이 출력하시오
- 모든 행과 열이 곱해진 값
<img src="img/chap08_001.png" alt="" width="30%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP, DEPT
ORDER BY EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q002
- EMP, DEPT 테이블을 이용하여
  EMP의 DEPTNO와 DEPT테이블의 DEPTNO가 같은 데이터를  다음과 같이 출력하시오
<img src="img/chap08_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP, DEPT
 WHERE EMP.DEPTNO = DEPT.DEPTNO
ORDER BY EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q003
- EMP, DEPT 테이블을 이용하여
  FROM 절에  EMP 테이블의 별칭은 E, DEPT 테이블의 별칭은 D로   다음과 같이 출력하시오
<img src="img/chap08_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
ORDER BY EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q004
- EMP, DEPT 테이블을 이용하여
  두테이블에 부서번호가 같은 열의이름이 포함되었을때  다음과 같이 출력하시오   (에러발생)
<img src="img/chap08_004.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT EMPNO, ENAME, DEPTNO, DNAME, LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO;

</pre>


---
<!-- _class: aqua -->
##### Q005
- EMP, DEPT 테이블을 이용하여
  열 이름에 각각의 테이블 이름도 함께 명시시 다음과 같이 출력하시오   ( 위의 문제 해결 )
<img src="img/chap08_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
ORDER BY D.DEPTNO, E.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q006
- EMP, DEPT 테이블을 이용하여
  급여가 3000이상인 사원의  사원번호, 이름, 급여, 근무부서를   다음과 같이 출력하시오

<img src="img/chap08_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E.EMPNO, E.ENAME, E.SAL, D.DEPTNO, D.DNAME, D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND SAL >= 3000;

</pre>


---
<!-- _class: aqua -->
##### Q007
- EMP, SALGRADE 테이블을 이용하여
  유저 정보, 급여등급 , 그 등급의 최소급여와 최대급여를  다음과 같이 출력하시오
<img src="img/chap08_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
select * from emp
</pre>
---
<!-- _class: aqua -->
<pre class="codeblock">
select * from salgrade
</pre>
---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT *
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

</pre>


---
<!-- _class: aqua -->
##### Q008
- EMP테이블을 2번 이용하여
  사원정보(EMPNO, ENAME, MGR) 와  직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
<img src="img/chap08_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR = E2.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q009
- EMP테이블을 2번 이용하여
1.  사원정보(EMPNO, ENAME, MGR) 와  직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
2.  직속상관이 없는 사원의 정보도 출력하시오

---
<!-- _class: aqua -->
<img src="img/chap08_009.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR = E2.EMPNO(+)
ORDER BY E1.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q010
-  (+)의 위치를 바꿔서 출력해보고 다음이 의미하는 바를 적으시오
<img src="img/chap08_010.png" alt="" width="80%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR(+) = E2.EMPNO
ORDER BY E1.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q011 표준문법 (NATURAL JOIN)
- EMP , DEPT 테이블 이용하여
  EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오
1.   NATURAL JOIN
  - 알아서 두 테이블의 이름과 자료형이 같은 열을 찾은 후
  - 그 열을 기준으로 등가조인을 해주는 방식

---
<!-- _class: aqua -->
<img src="img/chap08_011.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM,
       DEPTNO, D.DNAME, D.LOC
  FROM EMP E NATURAL JOIN DEPT D
ORDER BY DEPTNO, E.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q012 표준문법 (JOIN USING)
- EMP , DEPT 테이블 이용하여
  EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오
1.  JOIN USING
  - USING에 조인기준열 명시
  - 그 열을 기준으로 등가조인을 해주는 방식

---
<!-- _class: aqua -->
<img src="img/chap08_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM,
       DEPTNO, D.DNAME, D.LOC
  FROM EMP E JOIN DEPT D USING (DEPTNO)
 WHERE SAL >= 3000
ORDER BY DEPTNO, E.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q013  표준문법 (JOIN ON)
- EMP , DEPT 테이블 이용하여 EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오

<br>
<br>

1. JOIN ON
- ON에  조인기준열 명시
- 그 열을 기준으로 등가조인을 해주는 방식

---
<!-- _class: aqua -->
<img src="img/chap08_013.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM,
       E.DEPTNO,
       D.DNAME, D.LOC
  FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
 WHERE SAL <= 3000
ORDER BY E.DEPTNO, EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q014   표준문법 (LEFT OUTER JOIN )
- EMP , DEPT 테이블 이용하여  다음과 같이 출력하시오

1.  LEFT OUTER JOIN
  - 왼쪽 외부조인을 기준으로 NULL보장

<img src="img/chap08_014.png" alt="" width="80%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1 LEFT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q015 표준문법 (RIGHT OUTER JOIN )
- EMP , DEPT 테이블 이용하여  다음과 같이 출력하시오
1.  RIGHT OUTER JOIN- 오른른쪽 외부조인을 기준으로 NULL보장

<img src="img/chap08_015.png" alt="" width="70%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1 RIGHT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO, MGR_EMPNO;

</pre>


---
<!-- _class: aqua -->
##### Q016 표준문법 (FULL OUTER JOIN )
- EMP , DEPT 테이블 이용하여  다음과 같이 출력하시오
1.  FULL OUTER JOIN - 양쪽모두두 외부조인을 기준으로 NULL보장

---
<!-- _class: aqua -->
<img src="img/chap08_016.png" alt="" width="80%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1 FULL OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO;
</pre>





---
<!-- _class: purple -->
# 사고확장EX



---
<!-- _class: aqua -->
##### EX001
- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식  두가지 방식으로 다음과 같이 출력하시오.
1. 급여(SAL)이 2000초과인 사원들의 부서정보, 사원정보를 출력하시오.


---
<!-- _class: aqua -->
##### SQL-99 이전 방식

<img src="img/chap08__EX_001.png" alt="" width="90%" />
 


---
<!-- _class: aqua -->
##### SQL-99방식
<img src="img/chap08__EX_001.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### EX002
- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식  두가지 방식으로 다음과 같이 출력하시오.
1. 각 부서별 평균급여, 최대급여, 사원수를 출력하시오.


---
<!-- _class: aqua -->
##### SQL-99 이전 방식

<img src="img/chap08__EX_002.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### SQL-99 방식

<img src="img/chap08__EX_002.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### EX003
- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식  두가지 방식으로 다음과 같이 출력하시오.
1. 모든 부서정보와 사원정보를  부서번호, 사원이름 순으로 정렬해  출력하시오.

---
<!-- _class: aqua -->
##### SQL-99 이전 방식

<img src="img/chap08__EX_003.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### SQL-99 방식

<img src="img/chap08__EX_003.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### EX004
- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식  두가지 방식으로 다음과 같이 출력하시오.
1. 모든 부서정보와 사원정보, 급여등급정보, 각사원의 직속상관의 정보를
2. 부서번호, 사원번호 순서로 정렬해  출력하시오.

---
<!-- _class: aqua -->
##### SQL-99 이전 방식

<img src="img/chap08__EX_004.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### SQL-99방식

<img src="img/chap08__EX_004.png" alt="" width="90%" />


 

---

<!-- _class: aqua -->

1. EMP E, DEPT D WHERE E.DEPTNO = D.DEPTNO 는 어떤 조인인가요?  
2. E.SAL BETWEEN S.LOSAL AND S.HISAL 은 어떤 조인 방식인가요?  
3. E1.MGR = E2.EMPNO 는 어떤 관계를 나타내나요?  
4. LEFT OUTER JOIN 과 RIGHT OUTER JOIN 의 차이는 무엇인가요?  
5. (+) 기호는 어떤 상황에서 사용되나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- 등가 조인과 비등가 조인의 차이는 무엇인가요?  
- 자체 조인은 어떤 경우에 사용되나요?  
- Oracle 외부 조인 방식과 ANSI 방식의 차이는 무엇인가요?  
- FULL OUTER JOIN 은 어떤 결과를 반환하나요?  
- INNER JOIN 과 OUTER JOIN 은 어떤 상황에서 선택하나요?
 

---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span> 