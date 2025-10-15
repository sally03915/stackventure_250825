#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- 다음과 같이 레코드를 정의하시오.
  ![select_record](img/chap17_001.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q002

- 다음과 같이 DEPT테이블을 열과 행을 복사해 DEPT_RECORD테이블을 생성하시오.
  ![select_record](img/chap17_002.png)

```sql
CREATE TABLE DEPT_RECORD
    AS SELECT * FROM DEPT;

SELECT * FROM DEPT_RECORD;

```

<br/>
<br/>
<br/>

##### Q003

1. 다음과 같이 REC_DEPT 레코드를 작성하시오.
2. dept_rec 레코드에
   deptno=99, dname=DATABASE , loc=SEOUL 값을 대입하시오.
3. DEPT_RECORD 테이블에 dept_rec 데이터를 삽입하시오.
   INSERT INTO DEPT_RECORD
   VALUES dept_rec;

![select_record](img/chap17_003.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q004

1. 다음과 같이 REC_DEPT 레코드를 작성하시오.
2. dept_rec 레코드에
   deptno=50, dname=DB , loc=SEOUL 값을 대입하시오.
3. DEPT_RECORD 테이블에 DEPTNO=99인 데이터의 dept_rec 데이터를 수정하시오.
   UPDATE DEPT_RECORD
   SET ROW = dept_rec
   WHERE DEPTNO = 99;

![select_record](img/chap17_004.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q005

- 레코드에 다른 레코드를 포함하시오.

1. REC_DEPT , REC_EMP 레코드를 작성하시오.
2. EMP, DEPT 테이블을 JOIN 하여
   EMPNO가 7788이고
   EMP, DEPT테이블의 DEPTNO 가 같은 데이터를 검색하시오.
3. 다음과 같이 출력하시오.

![select_record](img/chap17_005.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q006

- 연관배열을 이용하여 다음과 같이 출력하시오.
- TYPE ITAB_EX , 자료형 VARCHAR2(20) , 인덱스형 PLS_INTEGER

![select_record](img/chap17_006.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q007

- DEPT 테이블에서 DEPTNO, DNAME 값을 조회해 연관배열을 이용하여
- 다음과 같이 출력하시오.
  ![select_record](img/chap17_007.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q008

- SELECT \* FROM DEPT 를 %ROWTYPE 와 연관배열을 이용하여
- 다음과 같이 출력하시오.
  ![select_record](img/chap17_008.png)

```sql
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

```

<br/>
<br/>
<br/>

##### Q009

- 다음과 같이 컬렉션메서드를 이용하여 출력하시오.
  ![select_record](img/chap17_009.png)

```sql
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
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001

- 다음과 같이 PL/SQL 문을 작성하시오.

1. EMP 테이블과 같은 열구조를 가지는 빈테이블 EMP_RECORD를 생성하는 SQL문을 작성하시오.
2. EMP_RECORD 테이블에 레코드를 사용하여 새로운 사원정보를 다음과 같이 삽입하는 PL/SQL 프로그램을 작성하시오.

![select_record](img/chap17__EX_001.png)

<br/>
<br/>
<br/>

##### EX002

- EMP 테이블을 구성하는 모든열을 저장할 수 있는 레코드를 활용하여 연관배열을 작성하시오. 그리고 저장된 연관배열의 내용을 다음과 같이 출력하시오.
  ![select_record](img/chap17__EX_002.png)
