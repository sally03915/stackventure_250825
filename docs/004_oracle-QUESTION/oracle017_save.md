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
  <span>▶ Chapter 14: plsql</span>
  <span>▶ Chapter 15: record</span>
  <span>▶ Chapter 16: cursor</span>
  <span class="current-chapter">✅▶ Chapter 17: save</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 오라클의 기본 SQL부터 객체 관리, PL/SQL까지<br/> 실무 중심으로 배우며, 데이터베이스 전문가로 성장합니다.
</p>
 




---

<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  
***PL/SQL 저장 프로그램 실습***  
→ ***프로시저(Procedure)***, ***함수(Function)***, ***매개변수 처리***, ***IN/OUT 모드***, ***호출 방법***

---

<!-- _class: aqua -->
### 🧪 저장 프로그램이란?  
- 데이터베이스에 저장된 PL/SQL 코드 블록  
- 반복되는 작업을 모듈화하여 재사용 가능  
- CREATE PROCEDURE, CREATE FUNCTION으로 생성  
- EXEC, CALL, SELECT 등으로 호출

---

<!-- _class: aqua -->
### 🔁 프로시저 (Procedure)  
- 특정 작업을 수행하는 저장 코드  
- 반환값 없음  
- IN, OUT, IN OUT 매개변수 사용 가능  
- 예: 급여 인상, 데이터 삽입 등

---

<!-- _class: aqua -->
### 🧮 함수 (Function)  
- 결과값을 반환하는 저장 코드  
- RETURN 문으로 값 반환  
- SELECT 문에서 호출 가능  
- 예: 급여 계산, 포맷 변환 등

---

<!-- _class: aqua -->
### 📦 매개변수 모드  
- IN : 입력용  
- OUT : 출력용  
- IN OUT : 입력 및 출력 겸용  
- 매개변수 타입 지정 필수

---

<!-- _class: aqua -->
### 🧠 호출 방법  
- 프로시저: EXEC, CALL 또는 익명 블록에서 호출  
- 함수: SELECT 함수명(...) FROM DUAL 또는 PL/SQL 블록 내 사용

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---
<!-- _class: aqua -->

<pre class="codeblock">
-- 프로시저 생성
CREATE OR REPLACE PROCEDURE raise_salary (
  p_empno IN EMP.EMPNO%TYPE,
  p_rate IN NUMBER
) IS
BEGIN
  UPDATE EMP SET SAL = SAL * p_rate WHERE EMPNO = p_empno;
END;

-- 프로시저 호출
EXEC raise_salary(7788, 1.1);

-- 함수 생성
CREATE OR REPLACE FUNCTION get_annual_salary (
  p_empno IN EMP.EMPNO%TYPE
) RETURN NUMBER IS
  v_sal EMP.SAL%TYPE;
BEGIN
  SELECT SAL INTO v_sal FROM EMP WHERE EMPNO = p_empno;
  RETURN v_sal * 12;
END;

-- 함수 호출
SELECT get_annual_salary(7788) FROM DUAL;

-- OUT 매개변수 사용
CREATE OR REPLACE PROCEDURE get_job (
  p_empno IN EMP.EMPNO%TYPE,
  p_job OUT EMP.JOB%TYPE
) IS
BEGIN
  SELECT JOB INTO p_job FROM EMP WHERE EMPNO = p_empno;
END;

-- OUT 매개변수 호출 예시
DECLARE
  v_job EMP.JOB%TYPE;
BEGIN
  get_job(7788, v_job);
  DBMS_OUTPUT.PUT_LINE('직책: ' || v_job);
END;
</pre>

---

<!-- _class: aqua -->

## ✅ 저장 프로그램 요약표

| 항목 | 설명 |
|------|------|
| PROCEDURE | 작업 수행, 반환값 없음 |
| FUNCTION | 결과 반환 |
| IN, OUT, IN OUT | 매개변수 모드 |
| EXEC, SELECT | 호출 방법 |
| RETURN | 함수 결과 반환 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제


 

---
<!-- _class: aqua -->
##### Q001  다음과 같이 프로시저를 생성하시오.

<img src="img/chap19_001.png" alt="" width="90%" />



---
<!-- _class: aqua -->
##### Q002  위에서 생성한 프로시저를 실행하시오.
<img src="img/chap19_002.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q003
- 익명블록에서 프로시저를 실행하시오.
<img src="img/chap19_003.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q004  USER-SOURCE를 통해 프로시저를 확인하시오.
<img src="img/chap19_004.png" alt="" width="90%" />



---
<!-- _class: aqua -->
##### Q005  USER-SOURCE를 통해 프로시저를 확인하시오.

<img src="img/chap19_005.png" alt="" width="90%" />





---
<!-- _class: aqua -->
##### Q006  프로시저를 삭제하시오.
<img src="img/chap19_006.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q007  프로시저에 파라미터를 지정하시오.
<img src="img/chap19_007.png" alt="" width="90%" />





---
<!-- _class: aqua -->
##### Q008 파라미터를 입력하여 프로시저를 사용하시오.
<img src="img/chap19_008.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q009 기본값이 지정된 파라미터 입력을 제외하고 프로시저를 사용하시오.
<img src="img/chap19_009.png" alt="" width="90%" />



---
<!-- _class: aqua -->
##### Q010  실행에 필요한 개수보다 적은 파라미터를 입력하여 프로시저를 실행하시오. (에러발생 )
<img src="img/chap19_010.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
EXECUTE pro_param_in(1);

</pre>


---
<!-- _class: aqua -->
##### Q011 파라미터 이름을 활용하여 프로시저값을 입력하시오.
<img src="img/chap19_011.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q012  OUT 모드파라미터를 정의하시오.
<img src="img/chap19_012.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE PROCEDURE pro_param_out
(
   in_empno IN EMP.EMPNO%TYPE,
   out_ename OUT EMP.ENAME%TYPE,
   out_sal OUT EMP.SAL%TYPE
)
IS

BEGIN
   SELECT ENAME, SAL INTO out_ename, out_sal
     FROM EMP
    WHERE EMPNO = in_empno;
END pro_param_out;
/

</pre>


---
<!-- _class: aqua -->
##### Q013  OUT 모드 파라미터를 사용하시오.
<img src="img/chap19_013.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   v_ename EMP.ENAME%TYPE;
   v_sal EMP.SAL%TYPE;
BEGIN
   pro_param_out(7788, v_ename, v_sal);
   DBMS_OUTPUT.PUT_LINE('ENAME : ' || v_ename);
   DBMS_OUTPUT.PUT_LINE('SAL : ' || v_sal);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q014  IN OUT 모드 파라미터를 정의 하시오.
<img src="img/chap19_014.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE PROCEDURE pro_param_inout
(
   inout_no IN OUT NUMBER
)
IS

BEGIN
   inout_no := inout_no * 2;
END pro_param_inout;
/

</pre>


---
<!-- _class: aqua -->
##### Q015  IN OUT 모드 파라미터를 사용하시오.
<img src="img/chap19_015.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   no NUMBER;
BEGIN
   no := 5;
   pro_param_inout(no);
   DBMS_OUTPUT.PUT_LINE('no : ' || no);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q016  생성할때 오류가 발생하는 프로시저를 작성하시오.
<img src="img/chap19_016.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE PROCEDURE pro_err
IS
   err_no NUMBER;
BEGIN
   err_no = 100;
   DBMS_OUTPUT.PUT_LINE('err_no : ' || err_no);
END pro_err;
/

</pre>


---
<!-- _class: aqua -->
##### Q017  SHOW ERRORS 명령어로 오류를 확인하시오.
<img src="img/chap19_017.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
SHOW ERRORS;

</pre>


---
<!-- _class: aqua -->
##### Q018  USER_ERRORS 로 오류를 확인하시오.
<img src="img/chap19_018.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q019  다음과 같이 함수를 생성하시오.
<img src="img/chap19_019.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE FUNCTION func_aftertax(
   sal IN NUMBER
)
RETURN NUMBER
IS
   tax NUMBER := 0.05;
BEGIN
   RETURN (ROUND(sal - (sal * tax)));
END func_aftertax;
/

</pre>


---
<!-- _class: aqua -->
##### Q020 PL/SQL에서 함수를 사용하시오.
<img src="img/chap19_020.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q021  sql에서 함수를 사용하시오 .
<img src="img/chap19_021.png" alt="" width="90%" />



---
<!-- _class: aqua -->
##### Q022  함수에 테이블 데이터를 사용하시오.
<img src="img/chap19_022.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q023  함수를 삭제하시오.
<img src="img/chap19_023.png" alt="" width="90%" />




---
<!-- _class: aqua -->
##### Q024  다음과 같이 패키지를 생성하시오.
<img src="img/chap19_024.png" alt="" width="90%" />





---
<!-- _class: aqua -->
##### Q025  다음과 같이 패키지 명세를 확인하시오.
<img src="img/chap19_025.png" alt="" width="90%" />


---
<!-- _class: aqua -->
##### Q026  DESC를 이용하여 패키지 명세를 확인하시오.
<img src="img/chap19_026.png" alt="" width="90%" />



---
<!-- _class: aqua -->
##### Q027  다음과 같이 패키지 본몬을 생성하시오.
<img src="img/chap19_027.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE PACKAGE BODY pkg_example
IS
   body_no NUMBER := 10;

   FUNCTION func_aftertax(sal NUMBER) RETURN NUMBER
      IS
         tax NUMBER := 0.05;
      BEGIN
         RETURN (ROUND(sal - (sal * tax)));
   END func_aftertax;

   PROCEDURE pro_emp(in_empno IN EMP.EMPNO%TYPE)
      IS
         out_ename EMP.ENAME%TYPE;
         out_sal EMP.SAL%TYPE;
      BEGIN
         SELECT ENAME, SAL INTO out_ename, out_sal
           FROM EMP
          WHERE EMPNO = in_empno;

         DBMS_OUTPUT.PUT_LINE('ENAME : ' || out_ename);
         DBMS_OUTPUT.PUT_LINE('SAL : ' || out_sal);
   END pro_emp;

PROCEDURE pro_dept(in_deptno IN DEPT.DEPTNO%TYPE)
   IS
      out_dname DEPT.DNAME%TYPE;
      out_loc DEPT.LOC%TYPE;
   BEGIN
      SELECT DNAME, LOC INTO out_dname, out_loc
        FROM DEPT
       WHERE DEPTNO = in_deptno;

      DBMS_OUTPUT.PUT_LINE('DNAME : ' || out_dname);
      DBMS_OUTPUT.PUT_LINE('LOC : ' || out_loc);
   END pro_dept;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q028  다음과 같이 프로시저 오버로드 하시오.
<img src="img/chap19_028.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q029  패키지 본문에서 오버로드된 프로시저를 작성하시오.
<img src="img/chap19_029.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE PACKAGE BODY pkg_overload
IS
   PROCEDURE pro_emp(in_empno IN EMP.EMPNO%TYPE)
      IS
         out_ename EMP.ENAME%TYPE;
         out_sal EMP.SAL%TYPE;
      BEGIN
         SELECT ENAME, SAL INTO out_ename, out_sal
           FROM EMP
          WHERE EMPNO = in_empno;

         DBMS_OUTPUT.PUT_LINE('ENAME : ' || out_ename);
         DBMS_OUTPUT.PUT_LINE('SAL : ' || out_sal);
      END pro_emp;

   PROCEDURE pro_emp(in_ename IN EMP.ENAME%TYPE)
      IS
         out_ename EMP.ENAME%TYPE;
         out_sal EMP.SAL%TYPE;
      BEGIN
         SELECT ENAME, SAL INTO out_ename, out_sal
           FROM EMP
          WHERE ENAME = in_ename;

         DBMS_OUTPUT.PUT_LINE('ENAME : ' || out_ename);
         DBMS_OUTPUT.PUT_LINE('SAL : ' || out_sal);
      END pro_emp;

END;
/

</pre>


---
<!-- _class: aqua -->
##### Q030  패키지에 포함된 서브프로그램 실행하시오.
<img src="img/chap19_030.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
BEGIN
   DBMS_OUTPUT.PUT_LINE('--pkg_example.func_aftertax(3000)--');
   DBMS_OUTPUT.PUT_LINE('after-tax:' || pkg_example.func_aftertax(3000));

   DBMS_OUTPUT.PUT_LINE('--pkg_example.pro_emp(7788)--');
   pkg_example.pro_emp(7788);

   DBMS_OUTPUT.PUT_LINE('--pkg_example.pro_dept(10)--' );
   pkg_example.pro_dept(10);

   DBMS_OUTPUT.PUT_LINE('--pkg_overload.pro_emp(7788)--' );
   pkg_overload.pro_emp(7788);

   DBMS_OUTPUT.PUT_LINE('--pkg_overload.pro_emp(''SCOTT'')--' );
   pkg_overload.pro_emp('SCOTT');
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q031  EMP_TRG테이블을 다음과 같이 생성하시오.
<img src="img/chap19_031.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE EMP_TRG
    AS SELECT * FROM EMP;

</pre>


---
<!-- _class: aqua -->
##### Q032  DML 실행 전에 수행할 트리거를 생성하시오.
<img src="img/chap19_032.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE TRIGGER trg_emp_nodml_weekend
BEFORE
INSERT OR UPDATE OR DELETE ON EMP_TRG
BEGIN
   IF TO_CHAR(sysdate, 'DY') IN ('토', '일') THEN
      IF INSERTING THEN
         raise_application_error(-20000, '주말 사원정보 추가 불가');
      ELSIF UPDATING THEN
         raise_application_error(-20001, '주말 사원정보 수정 불가');
      ELSIF DELETING THEN
         raise_application_error(-20002, '주말 사원정보 삭제 불가');
      ELSE
         raise_application_error(-20003, '주말 사원정보 변경 불가');
      END IF;
   END IF;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q033  평일날짜로 EMP_TRG 테이블을 UPDTE 하시오.
<img src="img/chap19_033.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q034 주말날짜에 EMP_TRG테이블을 UPDATE 하시오.
<img src="img/chap19_034.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q035  EMP-TRG_LOG 테이블을 생성하시오.
<img src="img/chap19_035.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE EMP_TRG_LOG(
   TABLENAME VARCHAR2(10), -- DML이 수행된 테이블 이름
   DML_TYPE VARCHAR2(10),  -- DML 명령어의 종류
   EMPNO NUMBER(4),        -- DML 대상이 된 사원 번호
   USER_NAME VARCHAR2(30), -- DML을 수행한 USER 이름
   CHANGE_DATE DATE        -- DML이 수행된 날짜
);

</pre>


---
<!-- _class: aqua -->
##### Q036  DML 실행 후 수행할 트리거를 생성하시오.
<img src="img/chap19_036.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE OR REPLACE TRIGGER trg_emp_log
AFTER
INSERT OR UPDATE OR DELETE ON EMP_TRG
FOR EACH ROW

BEGIN

   IF INSERTING THEN
      INSERT INTO emp_trg_log
      VALUES ('EMP_TRG', 'INSERT', :new.empno,
               SYS_CONTEXT('USERENV', 'SESSION_USER'), sysdate);

   ELSIF UPDATING THEN
      INSERT INTO emp_trg_log
      VALUES ('EMP_TRG', 'UPDATE', :old.empno,
               SYS_CONTEXT('USERENV', 'SESSION_USER'), sysdate);

   ELSIF DELETING THEN
      INSERT INTO emp_trg_log
      VALUES ('EMP_TRG', 'DELETE', :old.empno,
               SYS_CONTEXT('USERENV', 'SESSION_USER'), sysdate);
   END IF;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q037  EMP_TRG 테이블에 INSERT 실행하시오.
<img src="img/chap19_037.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
INSERT INTO EMP_TRG
VALUES(9999, 'TestEmp', 'CLERK', 7788,
       TO_DATE('2018-03-03', 'YYYY-MM-DD'), 1200, null, 20);

</pre>


---
<!-- _class: aqua -->
##### Q038  COMMIT 하시오.
<img src="img/chap19_038.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q039 EMP_TRG 테이블의 INSERT를 확인하시오.
<img src="img/chap19_039.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q040  EMP_TRG_LOG 테이블의 INSERT를 기록을 확인하시오.
<img src="img/chap19_040.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q041  EMP-TRG 테이블에 UPDATE 를 실행하시오.
<img src="img/chap19_041.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q042  USER_TRIGGERS 로 트리거 정보를 조회하시오.
<img src="img/chap19_042.png" alt="" width="90%" />

 



---
<!-- _class: purple -->
# 사고확장EX


---
<!-- _class: aqua -->
##### EX001  다음의 결과가 나오도록 내용을 작성하시오.
1. DEPT테이블의 부서번호(DEPT_NO)를 입력값으로 받으 후 부서번호(DEPTNO) , 부서이름(DNAME) , 지역(LOC)을 출력하는 pro_dept_in을 작성하시오.
2. pro_dept_in 프로시저를 통해 출력된 부서번호(DEPTNO) , 부서이름(DNAME) , 지역(LOC)을 다음과 같이 출력하는 pl/sql프로그램을 작성하시오.


---
<!-- _class: aqua -->
<img src="img/chap19__EX_001.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### EX002  다음과 같은 결과가 나오도록 내욜을 작성하시오.
1. select문에서 사용할 수 있는 func_date_kor을 작성하시오.
2. func_date_kor 함수는 date 자료형데이터를 입력받아 다음과 같이 YYYY"년"MM"월"DD"일" 형태의 데이터를 출력하시오.
<img src="img/chap19__EX_002.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### EX003
1. DEPT테이블과 같은 열구조 및 데이터를 가진 DEPT_TRG 테이블을 작성하시오.
2. DEPT_TRG 테이블에 DML 명령어를 사용한 기록을 저장하는 DEPT_TRG_LOG 테이블을 다음과 같이 작성하시오.


---
<!-- _class: aqua -->
|열이름|자료형|길이|설명|
|-|-|-|-|
|TABLENAME|가변형문자열|10|DML을 수행한 테이블 이름|
|DML_TYPE|가변형문자열|10|DML명령어 종류|
|DEPTNO|정수형 숫자|2|DML 대상 부서번호|
|USER_NAME|가변형문자열|30|DML을 수행한 USER이름|
|CHANGE_DATE|날짜|-|DML을 수행한 날짜|

---
<!-- _class: aqua -->
3. DEPT_TRG 테이블에 DML 명령수행기록을 DEPT_TRG_LOG에 저장하는 트리거 TRG_DEPT_LOG를 작성하시오.

<img src="img/chap19__EX_003.png" alt="" width="90%" />


 
---

<!-- _class: aqua -->

1. CREATE PROCEDURE raise_salary(...) 는 어떤 작업을 수행하나요?  
2. RETURN v_sal * 12 는 어떤 결과를 반환하나요?  
3. IN OUT 매개변수는 어떤 상황에서 사용되나요?  
4. 프로시저와 함수의 가장 큰 차이는 무엇인가요?  
5. SELECT 함수명(...) FROM DUAL 은 어떤 방식의 호출인가요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- 프로시저와 함수의 구조적 차이는 무엇인가요?  
- OUT 매개변수는 어떻게 값을 전달하나요?  
- 저장 프로그램을 사용하는 이유는 무엇인가요?  
- EXEC 와 CALL 의 차이는 무엇인가요?  
- 함수는 어떤 문장에서 호출할 수 있나요?


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>