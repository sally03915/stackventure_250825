####  ■STEP1. BASIC



<br/>
<br/>
<br/>

##### Q001
- DEPT 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT테이블을 복사해서 DEPT_TEMP 테이블을 만드시오.
![select_update_delete](img/chap10_001.png)
```sql
CREATE TABLE DEPT_TEMP
    AS SELECT * FROM DEPT;
```
<br/>
<br/>
<br/>

##### Q002
- DEPT_TMPT 테이블을 조회하시오.
![select_update_delete](img/chap10_002.png)
```sql
SELECT * FROM DEPT_TEMP;

```
<br/>
<br/>
<br/>

##### Q003
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
![select_update_delete](img/chap10_003.png)
```sql
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (50, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_TEMP;

```
<br/>
<br/>
<br/>

##### Q004
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. 열지정없이 데이터 추가가 가능하다.
![select_update_delete](img/chap10_004.png)
```sql
INSERT INTO DEPT_TEMP
VALUES (60 , 'NETWORK', 'BUSAN');

SELECT * FROM DEPT_TEMP;

```
<br/>
<br/>
<br/>

##### Q005
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. NULL을 지정하여 입력하는 것이 가능하다.
![select_update_delete](img/chap10_005.png)
```sql
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (70 , 'WEB', NULL);

SELECT * FROM DEPT_TEMP;

```
<br/>
<br/>
<br/>

##### Q006
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. 열데이터를 넣지 않는 방식으로 데이터 입력이 가능하다.  ( 공백문자열'' )
![select_update_delete](img/chap10_006.png)
```sql
INSERT INTO DEPT_TEMP (DEPTNO, DNAME , LOC)
VALUES (80 , 'MOBILE', '');

SELECT * FROM DEPT_TEMP;

```
<br/>
<br/>
<br/>

##### Q007
- DEPT_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. DEPT_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. 열데이터를 넣지 않는 방식으로 데이터 입력이 가능하다.
![select_update_delete](img/chap10_007.png)
```sql
INSERT INTO DEPT_TEMP (DEPTNO, LOC)
VALUES (90 , 'INCHEON');

SELECT * FROM DEPT_TEMP;

```
<br/>
<br/>
<br/>

##### Q008
- EMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP테이블을 복사해 EMP_TEMP 테이블을 만드시오.
2. 조건적 WHERE이 FALSE이므로 구조만 복사합니다.
![select_update_delete](img/chap10_008.png)
```sql
CREATE TABLE EMP_TEMP
    AS SELECT *
         FROM EMP
        WHERE 1 <> 1;

SELECT * FROM EMP_TEMP;

```
<br/>
<br/>
<br/>

##### Q009
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)  년/월/일
![select_update_delete](img/chap10_009.png)
```sql
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);

SELECT * FROM EMP_TEMP;

```
<br/>
<br/>
<br/>

##### Q010
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.  (날짜-) 년-월-일일
![select_update_delete](img/chap10_010.png)
```sql
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, NULL, 20);

SELECT * FROM EMP_TEMP;

```
<br/>
<br/>
<br/>

##### Q011
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)  일/월/년 으로 하면 오류남.
![select_update_delete](img/chap10_011.png)
```sql
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR , HIREDATE, SAL , COMM, DEPTNO)
VALUES (2111, '이순신', 'MANAGER', 9999, '07/01/2001', 4000, NULL, 20);

```
<br/>
<br/>
<br/>

##### Q012
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)   TO_DATE 함수 이용하기기
![select_update_delete](img/chap10_012.png)
```sql
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (2111, '이순신', 'MANAGER', 9999,
        TO_DATE('07/01/2001', 'DD/MM/YYYY'), 4000, NULL, 20);

SELECT * FROM EMP_TEMP;

```
<br/>
<br/>
<br/>

##### Q013
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.   (날짜/)  SYSDATE사용용
![select_update_delete](img/chap10_013.png)
```sql
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES (3111, '심청이', 'MANAGER', 9999, SYSDATE, 4000, NULL, 30);

SELECT * FROM EMP_TEMP;

```
<br/>
<br/>
<br/>

##### Q014
- EMP_TEMP 테이블을 이용해서 다음과 같이 작성하시오.
1. EMP_TEMP테이블에 다음과 같이 데이터를 추가하시오.
2. INSERT 문에 SELECT 문이용 → 서브쿼리이용
3. VALUES를 사용하지 않음! / 추가되는 열, 서브쿼리의 열의 개수,자료형 일치
![select_update_delete](img/chap10_014.png)
```sql
INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL
   AND S.GRADE = 1;

SELECT * FROM EMP_TEMP;

```
<br/>
<br/>
<br/>

##### Q015
-  DEPT테이블을 이용하여 다음과 같이 작성하시오.
1. DEPT테이블을 복사해 DEPT_TEMP2테이블을 작성하시오.
![select_update_delete](img/chap10_015.png)
```sql
CREATE TABLE DEPT_TEMP2
    AS SELECT * FROM DEPT;

SELECT * FROM DEPT_TEMP2;

```
<br/>
<br/>
<br/>

##### Q016
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. LOC을 전보 'SEOUL' 로 업데이트 하시오.
![select_update_delete](img/chap10_016.png)
```sql
UPDATE DEPT_TEMP2
   SET LOC = 'SEOUL';

SELECT * FROM DEPT_TEMP2;

```
<br/>
<br/>
<br/>

##### Q017
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. ROLLBACK을 이용하여 테이블 내용을 이전상태로 되돌리시오.
![select_update_delete](img/chap10_017.png)
```sql
ROLLBACK;
```
<br/>
<br/>
<br/>

##### Q018
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. 40번부서의이름을 DATABASE ,  지역을 SEOUL로 수정하시오.
![select_update_delete](img/chap10_018.png)
```sql
UPDATE DEPT_TEMP2
   SET DNAME = 'DATABASE',
         LOC = 'SEOUL'
 WHERE DEPTNO = 40;

SELECT * FROM DEPT_TEMP2;

```
<br/>
<br/>
<br/>

##### Q019
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. 서브쿼리를 이용하여 DEPT 테이블의 40번 부서의  부서이름과 지역의 데이터를를
2.                  DEPT_TEMP2테이블의 40번 부서이름과 지역을 수정하시오.
![select_update_delete](img/chap10_019.png)
```sql
UPDATE DEPT_TEMP2
   SET (DNAME, LOC) = (SELECT DNAME, LOC
                         FROM DEPT
                        WHERE DEPTNO = 40)
 WHERE DEPTNO = 40;

SELECT * FROM DEPT_TEMP2;

```
<br/>
<br/>
<br/>

##### Q020
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. 서브쿼리를 이용하여 DEPT 테이블의 40번 부서의  부서이름과 지역의 데이터를를
2.                  DEPT_TEMP2테이블의 40번 부서이름과 지역을 수정하시오.
3. 열 하나하나를 수정하는 경우우
![select_update_delete](img/chap10_020.png)
```sql
UPDATE DEPT_TEMP2
   SET DNAME = (SELECT DNAME
                  FROM DEPT
                 WHERE DEPTNO = 40),
       LOC = (SELECT LOC
                FROM DEPT
               WHERE DEPTNO = 40)
 WHERE DEPTNO = 40;

```
<br/>
<br/>
<br/>

##### Q021
-  DEPT_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. WHEREW절에 서브쿼리를 사용하여 데이터를 수정하는 것이 가능

![select_update_delete](img/chap10_021.png)
```sql
UPDATE DEPT_TEMP2
   SET LOC = 'SEOUL'
 WHERE DEPTNO = (SELECT DEPTNO
                   FROM DEPT_TEMP2
                  WHERE DNAME='OPERATIONS');

SELECT * FROM DEPT_TEMP2;

```
<br/>
<br/>
<br/>

##### Q022
- EMP 테이블을 복사해서 EMP_TEMP2 테이블을 작성하시오.
![select_update_delete](img/chap10_022.png)
```sql
CREATE TABLE EMP_TEMP2
    AS SELECT * FROM EMP;

SELECT * FROM EMP_TEMP2;

```
<br/>
<br/>
<br/>

##### Q023
-  EMP_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. WHERE절을  사용하여 JOB이 MANAGER인 데이터를 삭제하시오.
![select_update_delete](img/chap10_023.png)
```sql
DELETE FROM EMP_TEMP2
 WHERE JOB = 'MANAGER';

SELECT * FROM EMP_TEMP2;

```
<br/>
<br/>
<br/>

##### Q024
-  EMP_TEMP2테이블을 이용하여 다음과 같이 작성하시오.
1. WHERE,SUBQUERY을  사용하여
  급여등급이 3등급 (1401~2000) 사이에 있는
2. 30번부서의 사원들만 삭제하시오.

![select_update_delete](img/chap10_024.png)
```sql
DELETE FROM EMP_TEMP2
 WHERE EMPNO IN (SELECT E.EMPNO
                   FROM EMP_TEMP2 E, SALGRADE S
                  WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL
                    AND S.GRADE = 3
                    AND DEPTNO = 30);

SELECT * FROM EMP_TEMP2;

```
<br/>
<br/>
<br/>

##### Q025
- EMP_TEMP2 전체 데이터를 삭제하시오.
![select_update_delete](img/chap10_025.png)
```sql
DELETE FROM EMP_TEMP2;

SELECT * FROM EMP_TEMP2;
```

<br/>
<br/>
<br/>


####  ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001
- DEPT 테이블을 이용해 다음과 같이 작성하시오.
1.  DEPT 테이블을 복사해  DEPT_TEST 테이블을 만들 후
2.  DEPT_TEST 테이블에 다음과 같이 값이 추가하시오.
![select_update_delete](img/chap10__EX_001.png)
```sql
CREATE TABLE DEPT_TEST AS SELECT * FROM DEPT;

INSERT INTO DEPT_TEST (DEPTNO, DNAME, LOC) VALUES (50, 'ORACLE', 'BUSAN');

INSERT INTO DEPT_TEST (DEPTNO, DNAME, LOC) VALUES (60, 'SQL', 'ILSAN');

INSERT INTO DEPT_TEST (DEPTNO, DNAME, LOC) VALUES (70, 'SELECT', 'INCHEON');

INSERT INTO DEPT_TEST (DEPTNO, DNAME, LOC) VALUES (80, 'DML', 'BUNDANG');


SELECT * FROM DEPT_TEST;
```
<br/>
<br/>
<br/>

##### EX002
- EMP 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP 테이블을 복사해  EMP_TEST 테이블을 만들 후
2.  EMP_TEST 테이블에 다음과 같이 값이 추가하시오.
![select_update_delete](img/chap10__EX_002.png)
```sql

CREATE TABLE EMP_TEST AS SELECT * FROM EMP;

INSERT INTO EMP_TEST
VALUES(7201, 'TEST_USER1', 'MANAGER', 7788, TO_DATE('2016-01-02', 'YYYY-MM-DD'), 4500, NULL, 50);

INSERT INTO EMP_TEST
VALUES(7202, 'TEST_USER2', 'CLERK', 7201, TO_DATE('2016-02-21', 'YYYY-MM-DD'), 1800, NULL, 50);

INSERT INTO EMP_TEST
VALUES(7203, 'TEST_USER3', 'ANALYST', 7201, TO_DATE('2016-04-11', 'YYYY-MM-DD'), 3400, NULL, 60);

INSERT INTO EMP_TEST
VALUES(7204, 'TEST_USER4', 'SALESMAN', 7201, TO_DATE('2016-05-31', 'YYYY-MM-DD'), 2700, 300, 60);

INSERT INTO EMP_TEST
VALUES(7205, 'TEST_USER5', 'CLERK', 7201, TO_DATE('2016-07-20', 'YYYY-MM-DD'), 2600, NULL, 70);

INSERT INTO EMP_TEST
VALUES(7206, 'TEST_USER6', 'CLERK', 7201, TO_DATE('2016-09-08', 'YYYY-MM-DD'), 2600, NULL, 70);

INSERT INTO EMP_TEST
VALUES(7207, 'TEST_USER7', 'LECTURER', 7201, TO_DATE('2016-10-28', 'YYYY-MM-DD'), 2300, NULL, 80);

INSERT INTO EMP_TEST
VALUES(7208, 'TEST_USER8', 'STUDENT', 7201, TO_DATE('2018-03-09', 'YYYY-MM-DD'), 1200, NULL, 80);

SELECT * FROM EMP_TEST;
```
<br/>
<br/>
<br/>

##### EX003
- EMP_TEST 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP_TEST 테이블에서 50번 부서에서 근무하는 사원들의 평균급여보다 많은 급여를 받고 있는 사원들을 70번부터서 옮기는 구문을 작성하시오.


![select_update_delete](img/chap10__EX_003.png)
```sql
UPDATE EMP_TEST
   SET DEPTNO = 70
 WHERE SAL > (SELECT AVG(SAL)
                FROM EMP_TEST
               WHERE DEPTNO = 50);

SELECT * FROM EMP_TEST;
```
<br/>
<br/>
<br/>

##### EX004
- EMP_TEST 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP_TEST 테이블에서 60번부서의 사원 중에 입사일이 가장빠른 사원보다 늦게 입사한 사원의 급여를 10% 인상하고 80번부서로 옮기는 SQL을 작성하시오.
![select_update_delete](img/chap10__EX_004.png)
```sql
UPDATE EMP_TEST
   SET SAL = SAL*1.1,
       DEPTNO = 80
 WHERE HIREDATE > (SELECT MIN(HIREDATE)
                     FROM EMP_TEST
                    WHERE DEPTNO = 60);

SELECT * FROM EMP_TEST;
```
<br/>
<br/>
<br/>

##### EX005
- EMP_TEST 테이블을 이용해 다음과 같이 작성하시오.
1.  EMP_TEST 테이블에서 급여등급이 5인 사원을 삭제하는 SQL문을 작성하시오.
![select_update_delete](img/chap10__EX_005.png)
```sql
DELETE FROM EMP_TEST
 WHERE EMPNO IN (SELECT E.EMPNO
                   FROM EMP_TEST E, SALGRADE S
                  WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL
                    AND S.GRADE = 5);

SELECT * FROM EMP_TEST;
```
