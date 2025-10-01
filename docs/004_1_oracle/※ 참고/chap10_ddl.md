####  ■STEP1. BASIC


<br/>
<br/>
<br/>

##### Q001
- 다음과 같이 테이블을 작성하시오.
![select_ddl](img/chap12_001.png)
```sql
CREATE TABLE EMP_DDL(
   EMPNO      NUMBER(4),
   ENAME      VARCHAR2(10),
   JOB        VARCHAR2(9),
   MGR        NUMBER(4),
   HIREDATE   DATE,
   SAL        NUMBER(7,2),
   COMM       NUMBER(7,2),
   DEPTNO     NUMBER(2)
);

DESC EMP_DDL;
```

<br/>
<br/>
<br/>

##### Q002
- DEPT 테이블을 복사해 DEPT_DDL 새테이블을 생성하시오.
![select_ddl](img/chap12_002.png)
```sql
CREATE TABLE DEPT_DDL
    AS SELECT * FROM DEPT;

DESC DEPT_DDL;

```
<br/>
<br/>
<br/>

##### Q003
- DEPT_DDL 테이블 전체를 조회하시오.
![select_ddl](img/chap12_003.png)
```sql
SELECT * FROM DEPT_DDL;

```
<br/>
<br/>
<br/>

##### Q004
- EMP 테이블에서 30번 부서의 일부데이터만 복사해 EMP_DDL 새테이블을 생성하시오.
![select_ddl](img/chap12_004.png)
```sql
CREATE TABLE EMP_DDL_30
    AS SELECT *
         FROM EMP
        WHERE DEPTNO = 30;

SELECT * FROM EMP_DDL_30;

```
<br/>
<br/>
<br/>

##### Q005
- EMP, DEPT 테이블을 JOIN한  테이블의 열 구조만 복사해 EMPDEPT_DDL 테이블을 작성하시오.
![select_ddl](img/chap12_005.png)
```sql
CREATE TABLE EMPDEPT_DDL
    AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE,
              E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC
         FROM EMP E, DEPT D
        WHERE 1 <> 1;

SELECT * FROM EMPDEPT_DDL;

```
<br/>
<br/>
<br/>

##### Q006
- EMP 테이블을 복사해 EMP_ALTER테이블을 생성하시오.
![select_ddl](img/chap12_006.png)
```sql
CREATE TABLE EMP_ALTER
    AS SELECT * FROM EMP;

SELECT * FROM EMP_ALTER;

```
<br/>
<br/>
<br/>

##### Q007
- ALTER를 이용하여 EMP_ALTER 테이블에 HP VARCHAR2(20) 열을 추가하시오.
![select_ddl](img/chap12_007.png)
```sql
ALTER TABLE EMP_ALTER
  ADD HP VARCHAR2(20);

SELECT * FROM EMP_ALTER;

```
<br/>
<br/>
<br/>

##### Q008
- ALTER를 이용하여 HP열 이름을 TEL로 변경하시오.
![select_ddl](img/chap12_008.png)
```sql
ALTER TABLE EMP_ALTER
RENAME COLUMN HP TO TEL;

SELECT * FROM EMP_ALTER;

```
<br/>
<br/>
<br/>

##### Q009
- ALTER명령어로 EMPNO열 길이를 5로 변경하시오.
![select_ddl](img/chap12_009.png)
```sql
ALTER TABLE EMP_ALTER
MODIFY EMPNO NUMBER(5);

DESC EMP_ALTER;

```
<br/>
<br/>
<br/>

##### Q010
- ALTER명령어로 TEL열을 삭제하시오.
![select_ddl](img/chap12_010.png)
```sql
ALTER TABLE EMP_ALTER
 DROP COLUMN TEL;

SELECT * FROM EMP_ALTER;

```
<br/>
<br/>
<br/>

##### Q011
- RENAME을 이용하여 테이블이름을 EMP_RENAME으로 변경하시오.
![select_ddl](img/chap12_011.png)
```sql
RENAME EMP_ALTER TO EMP_RENAME;

```
<br/>
<br/>
<br/>

##### Q012
- DESC를 이용하여 테이블이름을 변경하시오.
![select_ddl](img/chap12_012.png)
```sql
DESC EMP_ALTER;

```
<br/>
<br/>
<br/>

##### Q013
- 변경된 테이블 EMP_RENAME으로 조회하시오.
![select_ddl](img/chap12_013.png)
```sql
SELECT *
  FROM EMP_RENAME;

```
<br/>
<br/>
<br/>

##### Q014
- TRUNCATE를 이용하여 EMP_RENAME의 모든데이터를 삭제하시오.
- ROLLBACK이 되지 않음!!!
![select_ddl](img/chap12_014.png)
```sql
TRUNCATE TABLE EMP_RENAME;

```
<br/>
<br/>
<br/>

##### Q015
- DROP을 이용하여 TABLE을 삭제하시오.
![select_ddl](img/chap12_015.png)
```sql
DROP TABLE EMP_RENAME;

```
<br/>
<br/>
<br/>

##### Q016
- EMP_RENAME 테이블 구성을 살펴보시오.
![select_ddl](img/chap12_016.png)
```sql
DESC EMP_RENAME;
```


<br/>
<br/>
<br/>


####  ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001
- 다음 열구조를 가지는 EMP_DDL_TEST 테이블을 작성하시오.
![select_ddl](img/chap12__EX_001.png)
```sql
CREATE TABLE EMP_DDL_TEST (
     EMPNO    NUMBER(4),
     ENAME    VARCHAR2(10),
     JOB      VARCHAR2(9),
     MGR      NUMBER(4),
     HIREDATE DATE,
     SAL      NUMBER(7, 2),
     COMM     NUMBER(7, 2),
     DEPTNO   NUMBER(2)
);

DESC EMP_DDL_TEST;
```
<br/>
<br/>
<br/>

##### EX002
- EMP_DDL_TEST 테이블에 AAA 열을 추가하시오, 가변형문자열, 길이는 20
![select_ddl](img/chap12__EX_002.png)
```sql
ALTER TABLE EMP_DDL_TEST
  ADD AAA VARCHAR2(20);

DESC EMP_DDL_TEST;
```
<br/>
<br/>
<br/>

##### EX003
- AAA 열크기를 30으로 변경하시오.
![select_ddl](img/chap12__EX_003.png)
```sql
ALTER TABLE EMP_DDL_TEST
MODIFY AAA VARCHAR2(30);

DESC EMP_DDL_TEST;
```
<br/>
<br/>
<br/>

##### EX004
- AAA 열이름을 REMARK로 변경하시오.
![select_ddl](img/chap12__EX_004.png)
```sql
ALTER TABLE EMP_DDL_TEST
RENAME COLUMN AAA TO REMARK;


DESC EMP_DDL_TEST;
```
<br/>
<br/>
<br/>

##### EX005
- EMP_DDL_TEST 테이블에 EMP테이블의 데이터를 모두 저장하시오.REMARK는 NULL로 삽입하시오.
![select_ddl](img/chap12__EX_005.png)
```sql
INSERT INTO EMP_DDL_TEST
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, NULL
  FROM EMP;

SELECT * FROM  EMP_DDL_TEST;

```

<br/>
<br/>
<br/>

##### EX006
- EMP_DDL_TEST 테이블을 삭제하시오.
![select_ddl](img/chap12__EX_006.png)
```sql
DROP TABLE EMP_DDL_TEST;
```