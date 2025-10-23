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
  <span>▶ Chapter 13: user</span>
</div>



---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
<strong style="color:#FF6E7F;">PART 3 · PL/SQL 심화</strong>
<div class="track-outline">  
  <span class="current-chapter">✅▶ Chapter 14: plsql</span>
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
***PL/SQL 실습***  
→ ***블록 구조***, ***변수 선언***, ***조건문/반복문***, ***예외 처리***, ***커서 사용***

---

<!-- _class: aqua -->
### 📦 PL/SQL 블록 구조  
- DECLARE : 변수 선언  
- BEGIN : 실행문  
- EXCEPTION : 예외 처리  
- END : 블록 종료  
- 익명 블록 또는 저장 프로시저 형태로 사용 가능

---

<!-- _class: aqua -->
### 🧮 변수 선언  
- VARCHAR2, NUMBER, DATE 등 데이터 타입 사용  
- := 으로 초기값 지정 가능  
- 예: v_sal NUMBER := 3000;

---

<!-- _class: aqua -->
### 🔁 조건문과 반복문  
- 조건문: IF, ELSIF, ELSE, CASE  
- 반복문: LOOP, WHILE, FOR  
- 예: FOR i IN 1..10 LOOP ... END LOOP;

---

<!-- _class: aqua -->
### ⚠️ 예외 처리  
- EXCEPTION 절에서 오류 처리  
- WHEN OTHERS THEN 으로 일반 예외 처리 가능  
- 사용자 정의 예외도 선언 가능

---

<!-- _class: aqua -->
### 🔍 커서(Cursor)  
- SELECT 결과를 한 행씩 처리  
- OPEN, FETCH, CLOSE 사용  
- 명시적 커서와 커서 FOR LOOP 지원

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 기본 PL/SQL 블록
DECLARE
  v_sal NUMBER := 3000;
BEGIN
  v_sal := v_sal * 1.1;
  DBMS_OUTPUT.PUT_LINE('급여: ' || v_sal);
END;

-- 조건문
DECLARE
  v_job VARCHAR2(10) := 'MANAGER';
BEGIN
  IF v_job = 'MANAGER' THEN
    DBMS_OUTPUT.PUT_LINE('관리자입니다');
  ELSE
    DBMS_OUTPUT.PUT_LINE('일반 사원입니다');
  END IF;
END;

-- 반복문
BEGIN
  FOR i IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE('반복: ' || i);
  END LOOP;
END;

-- 예외 처리
BEGIN
  UPDATE EMP SET SAL = SAL + 100 WHERE DEPTNO = 99;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('오류 발생: ' || SQLERRM);
END;

-- 커서 사용
DECLARE
  CURSOR emp_cur IS SELECT ENAME, SAL FROM EMP;
  v_ename EMP.ENAME%TYPE;
  v_sal EMP.SAL%TYPE;
BEGIN
  OPEN emp_cur;
  LOOP
    FETCH emp_cur INTO v_ename, v_sal;
    EXIT WHEN emp_cur%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE(v_ename || ': ' || v_sal);
  END LOOP;
  CLOSE emp_cur;
END;
</pre>

---

<!-- _class: aqua -->

## ✅ PL/SQL 요약표

| 항목 | 설명 |
|------|------|
| DECLARE | 변수 선언 |
| BEGIN ... END | 실행 블록 |
| IF, LOOP, FOR | 제어문 |
| EXCEPTION | 예외 처리 |
| CURSOR | 행 단위 처리 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제

 

---
<!-- _class: aqua -->
##### Q001
- 다음과 같이 heLLO PL/SQL을 출력하시오.

<img src="img/chap16_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SET SERVEROUTPUT ON; -- 실행 결과를 화면에 출력

BEGIN
   DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!');
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q002
1. 다음과 같이 두변수를 선언하시오.
    V_EMPNO NUMBER(4)
    V_ENAME VARCHAR2(10)
2. V_EMPNO 에  기본값 7788 대입
   V_ENAME 에  SCOTT 대입
3. 두 변수를 출력하시오.
4. V_EMPNO 출력을 한줄주석다시오.

<img src="img/chap16_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
   -- DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q003
여러줄 주석  /* */ 을 이용하여 출력을 주석처리하시오.

<img src="img/chap16_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
/*
   DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
*/
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q004
- 변수 선언 및 변수 값을 출력하시오.
1. 다음과 같이 두변수를 선언하시오.
    V_EMPNO NUMBER(4)
    V_ENAME VARCHAR2(10)
2. V_EMPNO 에  기본값 7788 대입
   V_ENAME 에  SCOTT 대입
3. 두 변수를 출력하시오.

<img src="img/chap16_004.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
   DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q005
1. CONSTANT 를 이용하여 상수  V_TAX 를 만들고 3을 대입하시오.
2. 상수를 출력하시오.

<img src="img/chap16_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_TAX CONSTANT NUMBER(1) := 3;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_TEX : ' || V_TAX);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q006
1. 변수 V_DEPTNO 를  생성시 DEFAULT값 10을 설정하시오.
2. 변수를 출력하시오.

<img src="img/chap16_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_DEPTNO NUMBER(2) DEFAULT 10;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q007
1. 변수 V_DEPTNO 를  생성시  NOT NULL을 설정, 10 대입 하시오.
2. 변수를 출력하시오.

<img src="img/chap16_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_DEPTNO NUMBER(2) NOT NULL := 10;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q008
1. 변수 V_DEPTNO 를  생성시
   NOT NULL을 설정, 기본값 10 대입 하시오.
2. 변수를 출력하시오.

<img src="img/chap16_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_DEPTNO NUMBER(2) NOT NULL DEFAULT 10;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q009
- 참조열형 변수  (DEPT 테이블의 DEPTNO) 에 값 50을 대입후 출력하시오.
<img src="img/chap16_009.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_DEPTNO DEPT.DEPTNO%TYPE := 50;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q010
1. 참조형(행)의 변수  V_DEPT_ROW 를 선언하시오.
2. SELECT DEPTNO, DNAME, LOC
     FROM DEPT
    WHERE DEPTNO = 40;
   구문을 실행한 후 1번 변수에 값을 대입하시오.
3. 다음과 같이 출력하시오.

<img src="img/chap16_010.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_DEPT_ROW DEPT%ROWTYPE;
BEGIN
   SELECT DEPTNO, DNAME, LOC INTO V_DEPT_ROW
     FROM DEPT
    WHERE DEPTNO = 40;
   DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || V_DEPT_ROW.DEPTNO);
   DBMS_OUTPUT.PUT_LINE('DNAME : ' || V_DEPT_ROW.DNAME);
   DBMS_OUTPUT.PUT_LINE('LOC : ' || V_DEPT_ROW.LOC);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q011
1. V_NUMBER 변수 생성 및 13값을 대입하시오.
2. 변수에 입력한 값이 홀수 인지 알아보는 조건 제어문을 추가하시오.
<img src="img/chap16_011.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_NUMBER NUMBER := 13;
BEGIN
   IF MOD(V_NUMBER, 2) = 1 THEN
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 홀수입니다!');
   END IF;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q012
1. V_NUMBER 변수 생성 및 14값을 대입하시오.
2. 변수에 입력한 값이 짝수인지 알아보는 조건 제어문을 추가하시오.
<img src="img/chap16_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_NUMBER NUMBER := 14;
BEGIN
   IF MOD(V_NUMBER, 2) = 1 THEN
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 홀수입니다!');
   END IF;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q013
1. V_NUMBER 변수 생성 및 14값을 대입하시오.
2. 변수에 입력한 값이 짝수인지 홀수인지 알아보는 조건 제어문을 추가하시오.
<img src="img/chap16_013.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_NUMBER NUMBER := 14;
BEGIN
   IF MOD(V_NUMBER, 2) = 1 THEN
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 홀수입니다!');
   ELSE
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 짝수입니다!');
   END IF;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q014
1. V_SCORE 변수 생성 및 87값을 대입하시오.
2. IF THEN ELSEIF 를 이용하여
입력한 점수가 어느학점인지 출력하시오.
90점이상 - A학점
80점이상 - B학점
70점이상 - C학점
60점이상 - D학점
        - F학점

<img src="img/chap16_014.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_SCORE NUMBER := 87;
BEGIN
   IF V_SCORE >= 90 THEN
      DBMS_OUTPUT.PUT_LINE('A학점');
   ELSIF V_SCORE >= 80 THEN
      DBMS_OUTPUT.PUT_LINE('B학점');
   ELSIF V_SCORE >= 70 THEN
      DBMS_OUTPUT.PUT_LINE('C학점');
   ELSIF V_SCORE >= 60 THEN
      DBMS_OUTPUT.PUT_LINE('D학점');
   ELSE
      DBMS_OUTPUT.PUT_LINE('F학점');
   END IF;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q015
1. V_SCORE 변수 생성 및 87값을 대입하시오.
2.  CASE 를 이용하여
입력한 점수가 어느학점인지 출력하시오.
90점이상 - A학점
80점이상 - B학점
70점이상 - C학점
60점이상 - D학점
        - F학점
<img src="img/chap16_015.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_SCORE NUMBER := 87;
BEGIN
   CASE TRUNC(V_SCORE/10)
      WHEN 10 THEN DBMS_OUTPUT.PUT_LINE('A학점');
      WHEN 9 THEN DBMS_OUTPUT.PUT_LINE('A학점');
      WHEN 8 THEN DBMS_OUTPUT.PUT_LINE('B학점');
      WHEN 7 THEN DBMS_OUTPUT.PUT_LINE('C학점');
      WHEN 6 THEN DBMS_OUTPUT.PUT_LINE('D학점');
      ELSE DBMS_OUTPUT.PUT_LINE('F학점');
   END CASE;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q016
1. V_SCORE 변수 생성 및 87값을 대입하시오.
2.  검색CASE 를 이용하여
입력한 점수가 어느학점인지 출력하시오.
90점이상 - A학점
80점이상 - B학점
70점이상 - C학점
60점이상 - D학점
        - F학점
<img src="img/chap16_016.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_SCORE NUMBER := 87;
BEGIN
   CASE
      WHEN V_SCORE >= 90 THEN DBMS_OUTPUT.PUT_LINE('A학점');
      WHEN V_SCORE >= 80 THEN DBMS_OUTPUT.PUT_LINE('B학점');
      WHEN V_SCORE >= 70 THEN DBMS_OUTPUT.PUT_LINE('C학점');
      WHEN V_SCORE >= 60 THEN DBMS_OUTPUT.PUT_LINE('D학점');
      ELSE DBMS_OUTPUT.PUT_LINE('F학점');
   END CASE;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q017
- 0~4까지 다음과 같이 출력하는 기본 LOOP를 사용하시오.
<img src="img/chap16_017.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_NUM NUMBER := 0;
BEGIN
   LOOP
      DBMS_OUTPUT.PUT_LINE('현재 V_NUM : ' || V_NUM);
      V_NUM := V_NUM + 1;
      EXIT WHEN V_NUM > 4;
   END LOOP;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q018
- 0~4까지 다음과 같이 출력하는 WHILE LOOP를 사용하시오.

<img src="img/chap16_018.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   V_NUM NUMBER := 0;
BEGIN
   WHILE V_NUM < 5 LOOP
      DBMS_OUTPUT.PUT_LINE('현재 V_NUM : ' || V_NUM);
      V_NUM := V_NUM + 1;
   END LOOP;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q019
- FOR IN LOOG를 이용하여 0~4까지 출력하시오.
<img src="img/chap16_019.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
BEGIN
   FOR i IN 0..4 LOOP
      DBMS_OUTPUT.PUT_LINE('현재 i의 값 : ' || i);
   END LOOP;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q020
- FOR IN LOOG를 이용하여 4~0까지 출력하시오.
<img src="img/chap16_020.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
BEGIN
   FOR i IN REVERSE 0..4 LOOP
      DBMS_OUTPUT.PUT_LINE('현재 i의 값 : ' || i);
      END LOOP;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q021
- FOR IN LOOG안에 CONTINUE를 이용하여 0,2,4를 다음과 같이 출력하시오.
<img src="img/chap16_021.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
BEGIN
   FOR i IN 0..4 LOOP
      CONTINUE WHEN MOD(i, 2) = 1;
      DBMS_OUTPUT.PUT_LINE('현재 i의 값 : ' || i);
   END LOOP;
END;
/
</pre>







---
<!-- _class: purple -->
# 사고확장EX




---
<!-- _class: aqua -->
##### EX001
- 숫자 1~10까지 숫자 중 홀수만 출력하는 PL/SQL 프로그램을 작성하시오.

<img src="img/chap16__EX_001.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### EX002
1.  DEPT 테이블의 DEPTNO와 자료형이 같은변수 V_DEPTNO를 선언하시오.
2. V_DEPTNO 변수값에 10,20,30,40을 대입했을때 다음과 같이 부서이름을 출력하는 프로그램을 작성하시오.
3. 부서번호가 10,20,30,40 이 아니라면 N/A로 출력합니다.

<img src="img/chap16__EX_002.png" alt="" width="90%" />

 
















---

<!-- _class: aqua -->

1. DECLARE 절에서는 어떤 작업을 하나요?  
2. IF ... THEN ... ELSE 문은 어떤 상황에서 사용되나요?  
3. FOR i IN 1..5 LOOP 은 어떤 반복을 수행하나요?  
4. EXCEPTION WHEN OTHERS THEN 은 어떤 역할을 하나요?  
5. 커서를 사용하는 이유는 무엇인가요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- PL/SQL 블록의 기본 구조는 어떻게 되나요?  
- 변수 선언 시 초기값을 지정하는 방법은?  
- WHILE 반복문과 FOR 반복문의 차이는 무엇인가요?  
- 예외 처리에서 SQLERRM 은 어떤 정보를 제공하나요?  
- 커서의 OPEN, FETCH, CLOSE 는 각각 어떤 역할을 하나요?


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>