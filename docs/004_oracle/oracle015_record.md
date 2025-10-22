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
  <span class="current-chapter">✅▶ Chapter 15: record</span>
  <span>▶ Chapter 16: cursor</span>
  <span>▶ Chapter 17: save</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 오라클의 기본 SQL부터 객체 관리, PL/SQL까지<br/> 실무 중심으로 배우며, 데이터베이스 전문가로 성장합니다.
</p>
 


 

---

<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  
***PL/SQL 레코드 실습***  
→ ***레코드 타입 선언***, ***필드 접근***, ***%ROWTYPE 사용***, ***레코드와 커서 연동***

---

<!-- _class: aqua -->
### 🧾 레코드란?  
- 여러 필드를 하나의 변수로 묶은 복합 데이터 타입  
- 테이블 구조와 유사한 형태  
- 각 필드는 개별 접근 가능  
- 사용자 정의 타입 또는 %ROWTYPE 사용 가능

---

<!-- _class: aqua -->
### 🧱 사용자 정의 레코드 타입  
- TYPE으로 구조 정의 후 RECORD 변수 선언  
- 예:  
  <pre class="codeblock">
  TYPE emp_rec_type IS RECORD (
    ename EMP.ENAME%TYPE,
    sal EMP.SAL%TYPE
  );
  emp_rec emp_rec_type;
  </pre>

---

<!-- _class: aqua -->
### 📦 %ROWTYPE  
- 테이블 또는 커서의 전체 행 구조를 그대로 사용  
- 모든 컬럼을 포함한 레코드 자동 생성  
- 예: emp_rec EMP%ROWTYPE;

---

<!-- _class: aqua -->
### 🔍 필드 접근  
- 점(.) 연산자로 필드 접근  
- 예: emp_rec.ename := 'SALLY';

---

<!-- _class: aqua -->
### 🔁 커서와 레코드  
- 커서 결과를 레코드에 저장 가능  
- FETCH INTO record_var 형태로 사용  
- 커서 FOR LOOP에서도 자동 레코드 생성

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 사용자 정의 레코드 타입 선언 및 사용
DECLARE
  TYPE emp_rec_type IS RECORD (
    ename EMP.ENAME%TYPE,
    sal EMP.SAL%TYPE
  );
  emp_rec emp_rec_type;
BEGIN
  SELECT ENAME, SAL INTO emp_rec
    FROM EMP
   WHERE EMPNO = 7788;
  DBMS_OUTPUT.PUT_LINE(emp_rec.ename || ': ' || emp_rec.sal);
END;

-- %ROWTYPE 사용
DECLARE
  emp_row EMP%ROWTYPE;
BEGIN
  SELECT * INTO emp_row
    FROM EMP
   WHERE EMPNO = 7788;
  DBMS_OUTPUT.PUT_LINE(emp_row.ENAME || ': ' || emp_row.SAL);
END;

-- 커서와 레코드
DECLARE
  CURSOR emp_cur IS SELECT * FROM EMP;
  emp_rec EMP%ROWTYPE;
BEGIN
  OPEN emp_cur;
  LOOP
    FETCH emp_cur INTO emp_rec;
    EXIT WHEN emp_cur%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE(emp_rec.ENAME || ': ' || emp_rec.SAL);
  END LOOP;
  CLOSE emp_cur;
END;

-- 커서 FOR LOOP와 레코드
BEGIN
  FOR emp_rec IN (SELECT ENAME, SAL FROM EMP) LOOP
    DBMS_OUTPUT.PUT_LINE(emp_rec.ENAME || ': ' || emp_rec.SAL);
  END LOOP;
END;
</pre>

---

<!-- _class: aqua -->

## ✅ 레코드 요약표

| 항목 | 설명 |
|------|------|
| RECORD | 복합 데이터 타입 |
| TYPE ... IS RECORD | 사용자 정의 레코드 |
| %ROWTYPE | 테이블 구조 기반 레코드 |
| record.field | 필드 접근 방식 |
| FETCH INTO | 커서 결과 저장 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제


 

---
<!-- _class: aqua -->
##### Q001
- 다음과 같이 레코드를 정의하시오.
<img src="img/chap17_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE REC_DEPT IS RECORD(
      deptno NUMBER(2) NOT NULL := 99,
      dname DEPT.DNAME%TYPE,
      loc DEPT.LOC%TYPE
   );
   dept_rec REC_DEPT;
BEGIN
   dept_rec.deptno := 99;
   dept_rec.dname := 'DATABASE';
   dept_rec.loc := 'SEOUL';
   DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || dept_rec.deptno);
   DBMS_OUTPUT.PUT_LINE('DNAME : ' || dept_rec.dname);
   DBMS_OUTPUT.PUT_LINE('LOC : ' || dept_rec.loc);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q002
- 다음과 같이 DEPT테이블을 열과 행을 복사해 DEPT_RECORD테이블을 생성하시오.
<img src="img/chap17_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
CREATE TABLE DEPT_RECORD
    AS SELECT * FROM DEPT;

SELECT * FROM DEPT_RECORD;

</pre>


---
<!-- _class: aqua -->
##### Q003  다음과 같이 REC_DEPT 레코드를 작성하시오.
1. dept_rec 레코드에
   deptno=99, dname=DATABASE , loc=SEOUL 값을 대입하시오.
2. DEPT_RECORD 테이블에  dept_rec 데이터를 삽입하시오.
   INSERT INTO DEPT_RECORD
   VALUES dept_rec;


<img src="img/chap17_003.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE REC_DEPT IS RECORD(
      deptno NUMBER(2) NOT NULL := 99,
      dname DEPT.DNAME%TYPE,
      loc DEPT.LOC%TYPE
   );
   dept_rec REC_DEPT;
BEGIN
   dept_rec.deptno := 99;
   dept_rec.dname := 'DATABASE';
   dept_rec.loc := 'SEOUL';

   INSERT INTO DEPT_RECORD
   VALUES dept_rec;
END;
/

SELECT * FROM DEPT_RECORD;

</pre>


---
<!-- _class: aqua -->
##### Q004  다음과 같이 REC_DEPT 레코드를 작성하시오.

1. dept_rec 레코드에
   deptno=50, dname=DB , loc=SEOUL 값을 대입하시오.
2. DEPT_RECORD 테이블에  DEPTNO=99인 데이터의  dept_rec 데이터를 수정하시오.
   UPDATE DEPT_RECORD
   SET ROW = dept_rec
   WHERE DEPTNO = 99;


---
<!-- _class: aqua -->
<img src="img/chap17_004.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE REC_DEPT IS RECORD(
      deptno NUMBER(2) NOT NULL := 99,
      dname DEPT.DNAME%TYPE,
      loc DEPT.LOC%TYPE
   );
   dept_rec REC_DEPT;
BEGIN
   dept_rec.deptno := 50;
   dept_rec.dname := 'DB';
   dept_rec.loc := 'SEOUL';

   UPDATE DEPT_RECORD
      SET ROW = dept_rec
    WHERE DEPTNO = 99;
END;
/

SELECT * FROM DEPT_RECORD;

</pre>


---
<!-- _class: aqua -->
##### Q005  레코드에 다른 레코드를 포함하시오.
1. REC_DEPT , REC_EMP  레코드를 작성하시오.
2. EMP, DEPT 테이블을 JOIN 하여
   EMPNO가 7788이고
   EMP, DEPT테이블의 DEPTNO 가 같은 데이터를 검색하시오.
3. 다음과 같이 출력하시오.

---
<!-- _class: aqua -->
<img src="img/chap17_005.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE REC_DEPT IS RECORD(
      deptno DEPT.DEPTNO%TYPE,
      dname DEPT.DNAME%TYPE,
      loc DEPT.LOC%TYPE
   );
   TYPE REC_EMP IS RECORD(
      empno EMP.EMPNO%TYPE,
      ename EMP.ENAME%TYPE,
      dinfo REC_DEPT
   );
   emp_rec REC_EMP;
BEGIN
   SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC
     INTO emp_rec.empno, emp_rec.ename,
          emp_rec.dinfo.deptno,
          emp_rec.dinfo.dname,
          emp_rec.dinfo.loc
     FROM EMP E, DEPT D
    WHERE E.DEPTNO = D.DEPTNO
      AND E.EMPNO = 7788;

   DBMS_OUTPUT.PUT_LINE('EMPNO : ' || emp_rec.empno);
   DBMS_OUTPUT.PUT_LINE('ENAME : ' || emp_rec.ename);
   DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || emp_rec.dinfo.deptno);
   DBMS_OUTPUT.PUT_LINE('DNAME : ' || emp_rec.dinfo.dname);
   DBMS_OUTPUT.PUT_LINE('LOC : ' || emp_rec.dinfo.loc);
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q006  연관배열을 이용하여 다음과 같이 출력하시오.
-  TYPE ITAB_EX , 자료형 VARCHAR2(20) , 인덱스형  PLS_INTEGER

<img src="img/chap17_006.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE ITAB_EX IS TABLE OF VARCHAR2(20)
      INDEX BY PLS_INTEGER;

   text_arr ITAB_EX;

BEGIN
   text_arr(1) := '1st data';
   text_arr(2) := '2nd data';
   text_arr(3) := '3rd data';
   text_arr(4) := '4th data';

   DBMS_OUTPUT.PUT_LINE('text_arr(1) : ' || text_arr(1));
   DBMS_OUTPUT.PUT_LINE('text_arr(2) : ' || text_arr(2));
   DBMS_OUTPUT.PUT_LINE('text_arr(3) : ' || text_arr(3));
   DBMS_OUTPUT.PUT_LINE('text_arr(4) : ' || text_arr(4));
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q007  DEPT 테이블에서 DEPTNO, DNAME 값을 조회해 연관배열을 이용하여 다음과 같이 출력하시오.
<img src="img/chap17_007.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE REC_DEPT IS RECORD(
      deptno DEPT.DEPTNO%TYPE,
      dname DEPT.DNAME%TYPE
   );

   TYPE ITAB_DEPT IS TABLE OF REC_DEPT
      INDEX BY PLS_INTEGER;

   dept_arr ITAB_DEPT;
   idx PLS_INTEGER := 0;

BEGIN
   FOR i IN (SELECT DEPTNO, DNAME FROM DEPT) LOOP
      idx := idx + 1;
      dept_arr(idx).deptno := i.DEPTNO;
      dept_arr(idx).dname := i.DNAME;

      DBMS_OUTPUT.PUT_LINE(
         dept_arr(idx).deptno || ' : ' || dept_arr(idx).dname);
   END LOOP;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q008 SELECT * FROM DEPT 를 %ROWTYPE 와  연관배열을 이용하여  다음과 같이 출력하시오.
<img src="img/chap17_008.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE ITAB_DEPT IS TABLE OF DEPT%ROWTYPE
      INDEX BY PLS_INTEGER;

   dept_arr ITAB_DEPT;
   idx PLS_INTEGER := 0;

BEGIN
   FOR i IN(SELECT * FROM DEPT) LOOP
      idx := idx + 1;
      dept_arr(idx).deptno := i.DEPTNO;
      dept_arr(idx).dname := i.DNAME;
      dept_arr(idx).loc := i.LOC;

      DBMS_OUTPUT.PUT_LINE(
      dept_arr(idx).deptno || ' : ' ||
      dept_arr(idx).dname || ' : ' ||
      dept_arr(idx).loc);
   END LOOP;
END;
/

</pre>


---
<!-- _class: aqua -->
##### Q009
- 다음과 같이 컬렉션메서드를 이용하여  출력하시오.
<img src="img/chap17_009.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE ITAB_EX IS TABLE OF VARCHAR2(20)
      INDEX BY PLS_INTEGER;

   text_arr ITAB_EX;

BEGIN
   text_arr(1) := '1st data';
   text_arr(2) := '2nd data';
   text_arr(3) := '3rd data';
   text_arr(50) := '50th data';

   DBMS_OUTPUT.PUT_LINE('text_arr.COUNT : ' || text_arr.COUNT);
   DBMS_OUTPUT.PUT_LINE('text_arr.FIRST : ' || text_arr.FIRST);
   DBMS_OUTPUT.PUT_LINE('text_arr.LAST : ' || text_arr.LAST);
   DBMS_OUTPUT.PUT_LINE('text_arr.PRIOR(50) : ' || text_arr.PRIOR(50));
   DBMS_OUTPUT.PUT_LINE('text_arr.NEXT(50) : ' || text_arr.NEXT(50));

END;
/
</pre>





---
<!-- _class: purple -->
# 사고확장EX




---
<!-- _class: aqua -->
##### EX001  다음과 같이 PL/SQL 문을 작성하시오.
1. EMP 테이블과 같은 열구조를 가지는 빈테이블 EMP_RECORD를 생성하는 SQL문을 작성하시오.
2. EMP_RECORD 테이블에 레코드를 사용하여 새로운 사원정보를 다음과 같이 삽입하는 PL/SQL 프로그램을 작성하시오.

<img src="img/chap17__EX_001.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
--①
CREATE TABLE EMP_RECORD
    AS SELECT *
         FROM EMP
        WHERE 1<>1;

--②
DECLARE
   TYPE REC_EMP IS RECORD (
      empno    EMP.EMPNO%TYPE NOT NULL := 9999,
      ename    EMP.ENAME%TYPE,
      job      EMP.JOB%TYPE,
      mgr      EMP.MGR%TYPE,
      hiredate EMP.HIREDATE%TYPE,
      sal      EMP.SAL%TYPE,
      comm     EMP.COMM%TYPE,
      deptno   EMP.DEPTNO%TYPE
   );
   emp_rec REC_EMP;
BEGIN
   emp_rec.empno    := 1111;
   emp_rec.ename    := 'TEST_USER';
   emp_rec.job      := 'TEST_JOB';
   emp_rec.mgr      := null;
   emp_rec.hiredate := TO_DATE('20180301','YYYYMMDD');
   emp_rec.sal      := 3000;
   emp_rec.comm     := null;
   emp_rec.deptno   := 40;

   INSERT INTO EMP_RECORD
   VALUES emp_rec;
END;
/



SELECT * FROM   EMP_RECORD;
</pre>


---
<!-- _class: aqua -->
##### EX002
- EMP 테이블을 구성하는 모든열을 저장할 수 있는 레코드를 활용하여 연관배열을 작성하시오. 그리고 저장된 연관배열의 내용을 다음과 같이 출력하시오.


---
<!-- _class: aqua -->
<img src="img/chap17__EX_002.png" alt="" width="90%" />


---
<!-- _class: aqua -->
<pre class="codeblock">
DECLARE
   TYPE ITAB_EMP IS TABLE OF EMP%ROWTYPE
      INDEX BY PLS_INTEGER;
   emp_arr ITAB_EMP;
   idx PLS_INTEGER := 0;
BEGIN
   FOR i IN (SELECT * FROM EMP) LOOP
      idx := idx + 1;
      emp_arr(idx).empno    := i.EMPNO;
      emp_arr(idx).ename    := i.ENAME;
      emp_arr(idx).job      := i.JOB;
      emp_arr(idx).mgr      := i.MGR;
      emp_arr(idx).hiredate := i.HIREDATE;
      emp_arr(idx).sal      := i.SAL;
      emp_arr(idx).comm     := i.COMM;
      emp_arr(idx).deptno   := i.DEPTNO;

      DBMS_OUTPUT.PUT_LINE(
         emp_arr(idx).empno     || ' : ' ||
         emp_arr(idx).ename     || ' : ' ||
         emp_arr(idx).job       || ' : ' ||
         emp_arr(idx).mgr       || ' : ' ||
         emp_arr(idx).hiredate  || ' : ' ||
         emp_arr(idx).sal       || ' : ' ||
         emp_arr(idx).comm      || ' : ' ||
         emp_arr(idx).deptno);

   END LOOP;
END;
/
</pre>


---
<!-- _class: aqua -->

1. TYPE emp_rec_type IS RECORD (...) 는 어떤 구조를 정의하나요?  
2. %ROWTYPE 은 어떤 상황에서 유용한가요?  
3. emp_rec.ename := 'SALLY' 는 어떤 작업을 하나요?  
4. 커서 결과를 레코드에 저장하려면 어떤 문장을 사용하나요?  
5. 커서 FOR LOOP에서 레코드는 어떻게 자동 생성되나요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- 사용자 정의 레코드와 %ROWTYPE 의 차이는 무엇인가요?  
- 레코드의 필드에 접근하는 방법은 무엇인가요?  
- 커서와 레코드를 함께 사용하는 이유는 무엇인가요?  
- FETCH INTO 와 커서 FOR LOOP의 차이는 무엇인가요?  
- 레코드는 어떤 상황에서 특히 유용한가요?


---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>