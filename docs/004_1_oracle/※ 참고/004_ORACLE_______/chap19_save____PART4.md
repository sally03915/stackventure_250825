####  ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001
- 다음과 같이 프로시저를 생성하시오.

![select_save](img/chap19_001.png)
```sql
CREATE OR REPLACE PROCEDURE pro_noparam
IS
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
   DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
END;
/

```
<br/>
<br/>
<br/>

##### Q002
- 위에서 생성한 프로시저를 실행하시오.
![select_save](img/chap19_002.png)
```sql
SET SERVEROUTPUT ON;

EXECUTE pro_noparam;

```
<br/>
<br/>
<br/>

##### Q003
- 익명블록에서 프로시저를 실행하시오.
![select_save](img/chap19_003.png)
```sql
BEGIN
   pro_noparam;
END;
/

```
<br/>
<br/>
<br/>

##### Q004
- USER-SOURCE를 통해 프로시저를 확인하시오.
![select_save](img/chap19_004.png)
```sql
SELECT *
  FROM USER_SOURCE
 WHERE NAME = 'PRO_NOPARAM';

```
<br/>
<br/>
<br/>

##### Q005
- USER-SOURCE를 통해 프로시저를 확인하시오.

![select_save](img/chap19_005.png)
```sql
SELECT TEXT
  FROM USER_SOURCE
 WHERE NAME = 'PRO_NOPARAM';

```
<br/>
<br/>
<br/>

##### Q006
- 프로시저를 삭제하시오.
![select_save](img/chap19_006.png)
```sql
DROP PROCEDURE PRO_NOPARAM;

```
<br/>
<br/>
<br/>

##### Q007
- 프로시저에 파라미터를 지정하시오.
![select_save](img/chap19_007.png)
```sql
CREATE OR REPLACE PROCEDURE pro_param_in
(
   param1 IN NUMBER,
   param2 NUMBER,
   param3 NUMBER := 3,
   param4 NUMBER DEFAULT 4
)
IS

BEGIN
   DBMS_OUTPUT.PUT_LINE('param1 : ' || param1);
   DBMS_OUTPUT.PUT_LINE('param2 : ' || param2);
   DBMS_OUTPUT.PUT_LINE('param3 : ' || param3);
   DBMS_OUTPUT.PUT_LINE('param4 : ' || param4);
END;
/

```
<br/>
<br/>
<br/>

##### Q008
- 파라미터를 입력하여 프로시저를 사용하시오.
![select_save](img/chap19_008.png)
```sql
EXECUTE pro_param_in(1,2,9,8);

```
<br/>
<br/>
<br/>

##### Q009
- 기본값이 지정된 파라미터 입력을 제외하고 프로시저를 사용하시오.
![select_save](img/chap19_009.png)
```sql
EXECUTE pro_param_in(1, 2);

```
<br/>
<br/>
<br/>

##### Q010
- 실행에 필요한 개수보다 적은 파라미터를 입력하여 프로시저를 실행하시오. (에러발생 )
![select_save](img/chap19_010.png)
```sql
EXECUTE pro_param_in(1);

```
<br/>
<br/>
<br/>

##### Q011
- 파라미ㅌ이름을 활용하여 프로시저값을 입력하시ㅗㅇ.
![select_save](img/chap19_011.png)
```sql
EXECUTE pro_param_in(param1 => 10, param2 => 20);

```
<br/>
<br/>
<br/>

##### Q012
- OUT 모드파라미터를 정의하시오.
![select_save](img/chap19_012.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q013
- OUT 모드 파라미터를 사용하시오.
![select_save](img/chap19_013.png)
```sql
DECLARE
   v_ename EMP.ENAME%TYPE;
   v_sal EMP.SAL%TYPE;
BEGIN
   pro_param_out(7788, v_ename, v_sal);
   DBMS_OUTPUT.PUT_LINE('ENAME : ' || v_ename);
   DBMS_OUTPUT.PUT_LINE('SAL : ' || v_sal);
END;
/

```
<br/>
<br/>
<br/>

##### Q014
- IN OUT 모드 파라미터를 정의 하시오.
![select_save](img/chap19_014.png)
```sql
CREATE OR REPLACE PROCEDURE pro_param_inout
(
   inout_no IN OUT NUMBER
)
IS

BEGIN
   inout_no := inout_no * 2;
END pro_param_inout;
/

```
<br/>
<br/>
<br/>

##### Q015
- IN OUT 모드 파라미터를 사용하시오.
![select_save](img/chap19_015.png)
```sql
DECLARE
   no NUMBER;
BEGIN
   no := 5;
   pro_param_inout(no);
   DBMS_OUTPUT.PUT_LINE('no : ' || no);
END;
/

```
<br/>
<br/>
<br/>

##### Q016
- 생성할때 오류가 발생하는 프로시저를 작성하시오.
![select_save](img/chap19_016.png)
```sql
CREATE OR REPLACE PROCEDURE pro_err
IS
   err_no NUMBER;
BEGIN
   err_no = 100;
   DBMS_OUTPUT.PUT_LINE('err_no : ' || err_no);
END pro_err;
/

```
<br/>
<br/>
<br/>

##### Q017
- SHOW ERRORS 명령어로 오류를 확인하시오.
![select_save](img/chap19_017.png)
```sql
SHOW ERRORS;

```
<br/>
<br/>
<br/>

##### Q018
- USER_ERRORS 로 오류를 확인하시오.
![select_save](img/chap19_018.png)
```sql
SELECT *
  FROM USER_ERRORS
 WHERE NAME = 'PRO_ERR';

```
<br/>
<br/>
<br/>

##### Q019
- 다음과 같이 함수를 생성하시오.
![select_save](img/chap19_019.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q020
- PL/SQL에서 함수를 사용하시오.
![select_save](img/chap19_020.png)
```sql
DECLARE
   aftertax NUMBER;
BEGIN
   aftertax := func_aftertax(3000);
   DBMS_OUTPUT.PUT_LINE('after-tax income : ' || aftertax);
END;
/

```
<br/>
<br/>
<br/>

##### Q021
- sql에서 함수를 사용하시오 .
![select_save](img/chap19_021.png)
```sql
SELECT func_aftertax(3000)
  FROM DUAL;

```
<br/>
<br/>
<br/>

##### Q022
- 함수에 테이블 데이터를 사용하시오.
![select_save](img/chap19_022.png)
```sql
SELECT EMPNO, ENAME, SAL, func_aftertax(SAL) AS AFTERTAX
  FROM EMP;

```
<br/>
<br/>
<br/>

##### Q023
- 함수를 삭제하시오.
![select_save](img/chap19_023.png)
```sql
DROP FUNCTION func_aftertax;

```
<br/>
<br/>
<br/>

##### Q024
- 다음과 같이 패키지를 생성하시오.
![select_save](img/chap19_024.png)
```sql
CREATE OR REPLACE PACKAGE pkg_example
IS
   spec_no NUMBER := 10;
   FUNCTION func_aftertax(sal NUMBER) RETURN NUMBER;
   PROCEDURE pro_emp(in_empno IN EMP.EMPNO%TYPE);
   PROCEDURE pro_dept(in_deptno IN DEPT.DEPTNO%TYPE);
END;
/

```
<br/>
<br/>
<br/>

##### Q025
- 다음과 같이 패키지 명세를 확인하시오.
![select_save](img/chap19_025.png)
```sql
SELECT TEXT
  FROM USER_SOURCE
 WHERE TYPE = 'PACKAGE'
   AND NAME = 'PKG_EXAMPLE';

```
<br/>
<br/>
<br/>

##### Q026
- DESC를 이용하여 패키지 명세를 확인하시오.
![select_save](img/chap19_026.png)
```sql
DESC pkg_example;

```
<br/>
<br/>
<br/>

##### Q027
-  다음과 같이 패키지 본몬을 생성하시오.
![select_save](img/chap19_027.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q028
- 다음과 같이 프로시저 오버로드 하시오.
![select_save](img/chap19_028.png)
```sql
CREATE OR REPLACE PACKAGE pkg_overload
IS
   PROCEDURE pro_emp(in_empno IN EMP.EMPNO%TYPE);
   PROCEDURE pro_emp(in_ename IN EMP.ENAME%TYPE);
END;
/

```
<br/>
<br/>
<br/>

##### Q029
- 패키지 본문에서 오버로드된 프로시저를 작성하시오.
![select_save](img/chap19_029.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q030
- 패키지에 포함된 서브프로그램 실행하시오.
![select_save](img/chap19_030.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q031
- EMP_TRG테이블을 다음과 같이 생성하시오.
![select_save](img/chap19_031.png)
```sql
CREATE TABLE EMP_TRG
    AS SELECT * FROM EMP;

```
<br/>
<br/>
<br/>

##### Q032
- DML 실행 전에 수행할 트리거를 생성하시오.
![select_save](img/chap19_032.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q033
- 평일날짜로 EMP_TRG 테이블을 UPDTE 하시오.
![select_save](img/chap19_033.png)
```sql
UPDATE emp_trg SET sal = 3500 WHERE empno = 7788;

```
<br/>
<br/>
<br/>

##### Q034
- 주말날짜에 EMP_TRG테이블을 UPDATE 하시오.
![select_save](img/chap19_034.png)
```sql
UPDATE emp_trg SET sal = 3500 WHERE empno = 7788;

```
<br/>
<br/>
<br/>

##### Q035
- EMP-TRG_LOG 테이블을 생성하시오.
![select_save](img/chap19_035.png)
```sql
CREATE TABLE EMP_TRG_LOG(
   TABLENAME VARCHAR2(10), -- DML이 수행된 테이블 이름
   DML_TYPE VARCHAR2(10),  -- DML 명령어의 종류
   EMPNO NUMBER(4),        -- DML 대상이 된 사원 번호
   USER_NAME VARCHAR2(30), -- DML을 수행한 USER 이름
   CHANGE_DATE DATE        -- DML이 수행된 날짜
);

```
<br/>
<br/>
<br/>

##### Q036
- DML 실행 후 수행할 트리거를 생성하시오.
![select_save](img/chap19_036.png)
```sql
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

```
<br/>
<br/>
<br/>

##### Q037
- EMP_TRG 테이블에 INSERT 실행하시오.
![select_save](img/chap19_037.png)
```sql
INSERT INTO EMP_TRG
VALUES(9999, 'TestEmp', 'CLERK', 7788,
       TO_DATE('2018-03-03', 'YYYY-MM-DD'), 1200, null, 20);

```
<br/>
<br/>
<br/>

##### Q038
- COMMIT 하시오.
![select_save](img/chap19_038.png)
```sql
COMMIT;

```
<br/>
<br/>
<br/>

##### Q039
- EMP_TRG 테이블의 INSERT를 확인하시오.
![select_save](img/chap19_039.png)
```sql
SELECT *
  FROM EMP_TRG;

```
<br/>
<br/>
<br/>

##### Q040
- EMP_TRG_LOG 테이블의 INSERT를 기록을 확인하시오.
![select_save](img/chap19_040.png)
```sql
SELECT *
  FROM EMP_TRG_LOG;

```
<br/>
<br/>
<br/>

##### Q041
- EMP-TRG 테이블에 UPDATE 를 실행하시오.
![select_save](img/chap19_041.png)
```sql
UPDATE EMP_TRG
   SET SAL = 1300
 WHERE MGR = 7788;

COMMIT;

```
<br/>
<br/>
<br/>

##### Q042
-  USER_TRIGGERS 로 트리거 정보를 조회하시오.
![select_save](img/chap19_042.png)
```sql
SELECT TRIGGER_NAME, TRIGGER_TYPE, TRIGGERING_EVENT, TABLE_NAME, STATUS
  FROM USER_TRIGGERS;
```


<br/>
<br/>
<br/>


####  ■STEP2. EX


##### EX001
- 다음의 결과가 나오도록 내용을 작성하시오.
1. DEPT테이블의 부서번호(DEPT_NO)를 입력값으로 받으 후 부서번호(DEPTNO) , 부서이름(DNAME) , 지역(LOC)을 출력하는 pro_dept_in을 작성하시오.
2. pro_dept_in 프로시저를 통해 출력된 부서번호(DEPTNO) , 부서이름(DNAME) , 지역(LOC)을 다음과 같이 출력하는 pl/sql프로그램을 작성하시오.


![select_save](img/chap19__EX_001.png)
```sql
--①
CREATE OR REPLACE PROCEDURE pro_dept_in
(
   inout_deptno IN OUT DEPT.DEPTNO%TYPE,
   out_dname OUT DEPT.DNAME%TYPE,
   out_loc OUT DEPT.LOC%TYPE
)
IS
BEGIN
   SELECT DEPTNO, DNAME, LOC INTO inout_deptno, out_dname, out_loc
     FROM DEPT
    WHERE DEPTNO = inout_deptno;
END pro_dept_in;
/

--②
DECLARE
   v_deptno DEPT.DEPTNO%TYPE;
   v_dname DEPT.DNAME%TYPE;
   v_loc DEPT.LOC%TYPE;
BEGIN
   v_deptno := 10;
   pro_dept_in(v_deptno, v_dname, v_loc);
   DBMS_OUTPUT.PUT_LINE('부서번호 : ' || v_deptno);
   DBMS_OUTPUT.PUT_LINE('부서명 : ' || v_dname);
   DBMS_OUTPUT.PUT_LINE('지역 : ' || v_loc);
END;
/
```
<br/>
<br/>
<br/>

##### EX002
- 다음과 같은 결과가 나오도록 내욜을 작성하시오.
1. select문에서 사용할 수 있는 func_date_kor을 작성하시오.
2. func_date_kor 함수는 date 자료형데이터를 입력받아 다음과 같이 YYYY"년"MM"월"DD"일" 형태의 데이터를 출력하시오.
![select_save](img/chap19__EX_002.png)
```sql
CREATE OR REPLACE FUNCTION func_date_kor(
   in_date IN DATE
)
RETURN VARCHAR2
IS
BEGIN
   RETURN (TO_CHAR(in_date, 'YYYY"년"MM"월"DD"일"'));
END func_date_kor;
/
```
<br/>
<br/>
<br/>

##### EX003
1. DEPT테이블과 같은 열구조 및 데이터를 가진 DEPT_TRG 테이블을 작성하시오.
2. DEPT_TRG 테이블에 DML 명령어를 사용한 기록을 저장하는 DEPT_TRG_LOG 테이블을 다음과 같이 작성하시오.

|열이름|자료형|길이|설명|
|-|-|-|-|
|TABLENAME|가변형문자열|10|DML을 수행한 테이블 이름|
|DML_TYPE|가변형문자열|10|DML명령어 종류|
|DEPTNO|정수형 숫자|2|DML 대상 부서번호|
|USER_NAME|가변형문자열|30|DML을 수행한 USER이름|
|CHANGE_DATE|날짜|-|DML을 수행한 날짜|

3. DEPT_TRG 테이블에 DML 명령수행기록을 DEPT_TRG_LOG에 저장하는 트리거 TRG_DEPT_LOG를 작성하시오.

![select_save](img/chap19__EX_003.png)
```sql
--①
CREATE TABLE DEPT_TRG
    AS SELECT * FROM DEPT;

--②
CREATE TABLE DEPT_TRG_LOG(
   TABLENAME   VARCHAR2(10), -- DML이 수행된 테이블 이름
   DML_TYPE    VARCHAR2(10), -- DML 명령어의 종류
   DEPTNO      NUMBER(2),    -- DML 대상이 된 부서번호
   USER_NAME   VARCHAR2(30), -- DML을 수행한 USER 이름
   CHANGE_DATE DATE          -- DML 이 수행된 날짜
);

--③
CREATE OR REPLACE TRIGGER trg_dept_log
AFTER
INSERT OR UPDATE OR DELETE ON DEPT_TRG
FOR EACH ROW
BEGIN
   IF INSERTING THEN
     INSERT INTO DEPT_TRG_LOG
     VALUES ('DEPT_TRG', 'INSERT', :new.deptno,
             SYS_CONTEXT('USERENV', 'SESSION_USER'), sysdate);

   ELSIF UPDATING THEN
     INSERT INTO DEPT_TRG_LOG
     VALUES ('DEPT_TRG', 'UPDATE', :old.deptno,
             SYS_CONTEXT('USERENV', 'SESSION_USER'), sysdate);

   ELSIF DELETING THEN
     INSERT INTO DEPT_TRG_LOG
     VALUES ('DEPT_TRG', 'DELETE', :old.deptno,
             SYS_CONTEXT('USERENV', 'SESSION_USER'), sysdate);
   END IF;
END;
/
```