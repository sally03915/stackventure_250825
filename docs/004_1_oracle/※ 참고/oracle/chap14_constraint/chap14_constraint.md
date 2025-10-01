####  ■STEP1. BASIC


<br/>
<br/>
<br/>

##### Q001
- 다음과 같이 테이블 생성시 NOT NULL을 설정하시오.
![select_constraint](img/chap14_001.png)
```sql
CREATE TABLE TABLE_NOTNULL(
   LOGIN_ID VARCHAR2(20) NOT NULL,
   LOGIN_PWD VARCHAR2(20) NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_NOTNULL;

```
<br/>
<br/>
<br/>

##### Q002
- 제약조건이 NOT NULL 인 열에 NULL 값을 넣어보시오. (에러)
![select_constraint](img/chap14_002.png)
```sql
INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD, TEL)
VALUES ('TEST_ID_01', NULL, '010-1234-5678');

```
<br/>
<br/>
<br/>

##### Q003
- 제약 조건이 없는 TEL열에 NULL 값을 입력하시오.
![select_constraint](img/chap14_003.png)
```sql
INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD)
VALUES ('TEST_ID_01', '1234');

SELECT * FROM TABLE_NOTNULL;

```
<br/>
<br/>
<br/>

##### Q004
- NOT NULL 제약 조건이 지정된 열 데이터를 NULL 값으로 업데이트 하시오. (에러)
![select_constraint](img/chap14_004.png)
```sql
UPDATE TABLE_NOTNULL
   SET LOGIN_PWD = NULL
 WHERE LOGIN_ID = 'TEST_ID_01';

```
<br/>
<br/>
<br/>

##### Q005
- (SCOTT) 제약조건을 살펴보시오.
![select_constraint](img/chap14_005.png)
```sql
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

```
<br/>
<br/>
<br/>

##### Q006
- 테이블 생성시 제약조건에 이름을 다음과 같이 지정하시오.
![select_constraint](img/chap14_006.png)
```sql
CREATE TABLE TABLE_NOTNULL2(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL,
   TEL VARCHAR2(20)
);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

```
<br/>
<br/>
<br/>

##### Q007
- 이미 생성한 테이블에 제약 조건을 다음과 같이 지정하시오.
- TEL 열에 NOT NULL 제약조건을 추가하시오.
![select_constraint](img/chap14_007.png)
```sql
ALTER TABLE TABLE_NOTNULL
MODIFY(TEL NOT NULL);

```
<br/>
<br/>
<br/>

##### Q008
- LOGIN_ID 가 `TEST_ID_01` 인  TEL의 데이터를  '010-1234-5678' 로 수정하시오.
![select_constraint](img/chap14_008.png)
```sql
UPDATE TABLE_NOTNULL
   SET TEL = '010-1234-5678'
 WHERE LOGIN_ID = 'TEST_ID_01';

SELECT * FROM TABLE_NOTNULL;

```
<br/>
<br/>
<br/>

##### Q009
- TEL 열에 NOT NULL을 추가하시오.
![select_constraint](img/chap14_009.png)
```sql
ALTER TABLE TABLE_NOTNULL
MODIFY(TEL NOT NULL);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

```
<br/>
<br/>
<br/>

##### Q010
- TEL 열에 제약조건이름을 지정해서 추가하시오.
![select_constraint](img/chap14_010.png)
```sql
ALTER TABLE TABLE_NOTNULL2
MODIFY(TEL CONSTRAINT TBLNN_TEL_NN NOT NULL);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

```
<br/>
<br/>
<br/>

##### Q011
- TABLE_NOTNULL2 테이블 열 구조를 확인하시오.
![select_constraint](img/chap14_011.png)
```sql
DESC TABLE_NOTNULL2;

```
<br/>
<br/>
<br/>

##### Q012
- 이미 생성된 제약조건이름을 변경하시오.
![select_constraint](img/chap14_012.png)
```sql
ALTER TABLE TABLE_NOTNULL2
RENAME CONSTRAINT TBLNN_TEL_NN TO TBLNN2_TEL_NN;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS;

```
<br/>
<br/>
<br/>

##### Q013
- TABLE_NOTNULL2 제약 조건을 삭제하시오.
![select_constraint](img/chap14_013.png)
```sql
ALTER TABLE TABLE_NOTNULL2
 DROP CONSTRAINT TBLNN2_TEL_NN;

DESC TABLE_NOTNULL2;

```
<br/>
<br/>
<br/>

##### Q014
- LOGIN_ID 열에 중복되지 않는값 UNIQUE를 지정하시오.
![select_constraint](img/chap14_014.png)
```sql
CREATE TABLE TABLE_UNIQUE(
   LOGIN_ID VARCHAR2(20) UNIQUE,
   LOGIN_PWD VARCHAR2(20) NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_UNIQUE;

```
<br/>
<br/>
<br/>

##### Q015
- USER_CONSTRAINTS 데이터 사전에서 제약조건을 확인하시오.
![select_constraint](img/chap14_015.png)
```sql
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME = 'TABLE_UNIQUE';

```
<br/>
<br/>
<br/>

##### Q016
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 삽입하시오.
![select_constraint](img/chap14_016.png)
```sql
INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD01', '010-1234-5678');

SELECT * FROM TABLE_UNIQUE;

```
<br/>
<br/>
<br/>

##### Q017
- 다음과 같이 중복되는 데이터를 삽입해보시오. (에러 )
![select_constraint](img/chap14_017.png)
```sql
INSERT INTO TABLE_UNIQUE (LOGIN_ID, LOGIN_PWD, TEL)
VALUES ('TEST_ID_01', 'PWD01', '010-1234-5678');

```
<br/>
<br/>
<br/>

##### Q018
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 입력하시오.
- LOGIN_PWD 열은 NOT NULL 조건만 지정되어 있어 중복허용이 됨.
![select_constraint](img/chap14_018.png)
```sql
INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_02', 'PWD01', '010-1234-5678');

SELECT * FROM TABLE_UNIQUE;

```
<br/>
<br/>
<br/>

##### Q019
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 입력하시오.
- UNIQUE제약 조건이 지정된 열에 NULL 값 입력가능
![select_constraint](img/chap14_019.png)
```sql
INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES(NULL, 'PWD01', '010-2345-6789');

SELECT * FROM TABLE_UNIQUE;

```
<br/>
<br/>
<br/>

##### Q020
- TABLE_UNIQUE 테이블에 다음과 같이 데이터를 수정하시오. (에러)
- LOGIN_ID 에 이미 존재하는 값을 지정하면 중복데이터가 발생하므로 에러발생
![select_constraint](img/chap14_020.png)
```sql
UPDATE TABLE_UNIQUE
   SET LOGIN_ID='TEST_ID_01'
 WHERE LOGIN_ID IS NULL;

```
<br/>
<br/>
<br/>

##### Q021
- 다음과 같이 테이블을 생성하시오.
- 테이블을 생성할때  UNIQUE 제약 조건 설정하시오.
![select_constraint](img/chap14_021.png)
```sql
CREATE TABLE TABLE_UNIQUE2(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNID_UNQ UNIQUE,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNPW_NN NOT NULL,
   TEL VARCHAR2(20)
);

DESC  TABLE_UNIQUE2;
```
<br/>
<br/>
<br/>

##### Q022
- 생성한 UNIQUE 제약 조건을 확인하시오.
![select_constraint](img/chap14_022.png)
```sql
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

```
<br/>
<br/>
<br/>

##### Q023
- 이미 생성한 열에 UNIQUE제약 조건 추가하시오.
- ALTER MODIFY 이용
![select_constraint](img/chap14_023.png)
```sql
ALTER TABLE TABLE_UNIQUE
MODIFY(TEL UNIQUE);

```
<br/>
<br/>
<br/>

##### Q024
- TEL 열값을 모두 NULL 값으로 변경하시오.
![select_constraint](img/chap14_024.png)
```sql
UPDATE TABLE_UNIQUE
   SET TEL = NULL;

SELECT * FROM TABLE_UNIQUE;

```
<br/>
<br/>
<br/>

##### Q025
- TEL 값에 UNIQUE제약 조건 설정하시오.
![select_constraint](img/chap14_025.png)
```sql
ALTER TABLE TABLE_UNIQUE
MODIFY(TEL UNIQUE);

```
<br/>
<br/>
<br/>

##### Q026
- UNIQUE제약 조건의 이름을 직접 지정하시오.
![select_constraint](img/chap14_026.png)
```sql
ALTER TABLE TABLE_UNIQUE2
MODIFY(TEL CONSTRAINT TBLUNQ_TEL_UNQ UNIQUE);

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

```
<br/>
<br/>
<br/>

##### Q027
- 이미 만들어져 있는 UNIQUE제약 조건이름을 다음과 같이 수정하시오.
![select_constraint](img/chap14_027.png)
```sql
ALTER TABLE TABLE_UNIQUE2
RENAME CONSTRAINT TBLUNQ_TEL_UNQ TO TBLUNQ2_TEL_UNQ;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

```
<br/>
<br/>
<br/>

##### Q028
-  다음과 같이 제약 조건을 삭제하시오.
![select_constraint](img/chap14_028.png)
```sql
ALTER TABLE TABLE_UNIQUE2
 DROP CONSTRAINT TBLUNQ2_TEL_UNQ;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%';

```
<br/>
<br/>
<br/>

##### Q029
- 다음과 같이 테이블을 생성할때 PRIMARY KEY를 설정하시오.
![select_constraint](img/chap14_029.png)
```sql
CREATE TABLE TABLE_PK(
   LOGIN_ID VARCHAR2(20) PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_PK;

```
<br/>
<br/>
<br/>

##### Q030
- 생성한 PRIMARY KEY를 확인하시오.
![select_constraint](img/chap14_030.png)
```sql
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_PK%';

```
<br/>
<br/>
<br/>

##### Q031
- 생성한 PRIMARY KEY를 통해 자동생성된 INDEX를 확인하시오.
![select_constraint](img/chap14_031.png)
```sql
SELECT INDEX_NAME, TABLE_OWNER, TABLE_NAME
  FROM USER_INDEXES
 WHERE TABLE_NAME LIKE 'TABLE_PK%';

```
<br/>
<br/>
<br/>

##### Q032
- 제약 조건의 이름을 직접 지정하여 테이블을 생성하시오.
![select_constraint](img/chap14_032.png)
```sql
CREATE TABLE TABLE_PK2(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLPK2_LGNID_PK PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLPK2_LGNPW_NN NOT NULL,
   TEL VARCHAR2(20)
);

DESC TABLE_PK2;

```
<br/>
<br/>
<br/>

##### Q033
- 다음과 같이 데이터를  입력하시오.
![select_constraint](img/chap14_033.png)
```sql
INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD01', '010-1234-5678');

SELECT * FROM TABLE_PK;

```
<br/>
<br/>
<br/>

##### Q034
- 다음과 같이 테이블에 중복되는 데이터를 입력하시오.
- PRIMARY KEY제약조건이 지정되어 있는 열은 중복을 허용하지 않음.
![select_constraint](img/chap14_034.png)
```sql
INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD02', '010-2345-6789');

```
<br/>
<br/>
<br/>

##### Q035
- 다음과 같이 데이터를 입력하시오.
- NULL값을 명시적으로 입력하시오.
![select_constraint](img/chap14_035.png)
```sql
INSERT INTO TABLE_PK(LOGIN_ID, LOGIN_PWD, TEL)
VALUES(NULL, 'PWD02', '010-2345-6789');

```
<br/>
<br/>
<br/>

##### Q036
- 다음과 같이 데이터를 입력하시오.
- NULL값을 암시적으로  입력하시오.
![select_constraint](img/chap14_036.png)
```sql
INSERT INTO TABLE_PK(LOGIN_PWD, TEL)
VALUES('PWD02', '010-2345-6789');

```
<br/>
<br/>
<br/>

##### Q037
- EMP 테이블과 DEPT 테이블의 제약 조건을 살펴보시오.
![select_constraint](img/chap14_037.png)
```sql
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, R_OWNER, R_CONSTRAINT_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME IN ('EMP', 'DEPT');

```
<br/>
<br/>
<br/>

##### Q038
- FOREIGN KEY가 참조하는 열에 존재하지 않는 데이터를 입력하시오.
- 다음과 같이 데이터를 입력하고 결과를 확인하시오.
- 에러 : 부모키가 없음.
![select_constraint](img/chap14_038.png)
```sql
INSERT INTO EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(9999, '홍길동', 'CLERK', '7788', TO_DATE('2017/04/30', 'YYYY/MM/DD'), 1200, NULL, 50);

```
<br/>
<br/>
<br/>

##### Q039
- 다음과 같이 DEPT_FK테이블을 생성하시오.
![select_constraint](img/chap14_039.png)
```sql
CREATE TABLE DEPT_FK(
   DEPTNO NUMBER(2) CONSTRAINT DEPTFK_DEPTNO_PK PRIMARY KEY,
   DNAME VARCHAR2(14),
   LOC VARCHAR2(13)
);

DESC DEPT_FK;

```
<br/>
<br/>
<br/>

##### Q040
- 다음과 같이 EMP_FK테이블을 생성하시오.
- 외래키 설정
![select_constraint](img/chap14_040.png)
```sql
CREATE TABLE EMP_FK(
   EMPNO NUMBER(4) CONSTRAINT EMPFK_EMPNO_PK PRIMARY KEY,
   ENAME VARCHAR2(10),
   JOB VARCHAR2(9),
   MGR NUMBER(4),
   HIREDATE DATE,
   SAL NUMBER(7,2),
   COMM NUMBER(7,2),
   DEPTNO NUMBER(2) CONSTRAINT EMPFK_DEPTNO_FK REFERENCES DEPT_FK (DEPTNO)
);

DESC EMP_FK;

```
<br/>
<br/>
<br/>

##### Q041
- EMP_FK 테이블에 다음과 같이 데이터를 삽입하시오.
- 에러발생
- DEPTNO데이터가 아직 DEPT_FK테이블에 데이터가 없음
- 부모데이터가 없음.
![select_constraint](img/chap14_041.png)
```sql
INSERT INTO EMP_FK
VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'),
       3000, NULL, 10);

```
<br/>
<br/>
<br/>

##### Q042
- DEPT_FK테이블에 데이터를 삽입하시오.
![select_constraint](img/chap14_042.png)
```sql
INSERT INTO DEPT_FK
VALUES(10, 'TEST_DNAME', 'TEST_LOC');

SELECT * FROM DEPT_FK;

```
<br/>
<br/>
<br/>

##### Q043
- EMP_FK 테이블에 다음과 같이 데이터를 삽입하시오.
- 삽입가능
- 부모테이블에 데이터 있음.
![select_constraint](img/chap14_043.png)
```sql
INSERT INTO EMP_FK
VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'),
       3000, NULL, 10);

SELECT * FROM EMP_FK;

```
<br/>
<br/>
<br/>

##### Q044
- DEPT_FK 테이블의 10번 부서 데이터를 삭제 하시오.
- 에러발생
- EMP_FK에서 10번부서의 데이터를 참조하고 있음.
- 삭제 불가능능
![select_constraint](img/chap14_044.png)
```sql
DELETE FROM DEPT_FK
 WHERE DEPTNO = 10;

```
<br/>
<br/>
<br/>

##### Q045
- 테이블을 생성할때 CHECK 제약 조건 설정하시오.
- LOGIN_PWD 는 3글자 초과만 저장가능
![select_constraint](img/chap14_045.png)
```sql
CREATE TABLE TABLE_CHECK(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK_LOGINID_PK PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLCK_LOGINPW_CK CHECK (LENGTH(LOGIN_PWD) > 3),
   TEL VARCHAR2(20)
);

DESC TABLE_CHECK;

```
<br/>
<br/>
<br/>

##### Q046
- CHECK 제약 조건에 맞지 않는 데이터를 삽입
-  LOGIN_PWD 는 3글자 초과만 저장가능   123
![select_constraint](img/chap14_046.png)
```sql
INSERT INTO TABLE_CHECK
VALUES ('TEST_ID', '123', '010-1234-5678');

```
<br/>
<br/>
<br/>

##### Q047
- CHECK 제약 조건에 맞는 데이터를 삽입
-  LOGIN_PWD 는 3글자 초과만 저장가능   1234
- 성공!
![select_constraint](img/chap14_047.png)
```sql
INSERT INTO TABLE_CHECK
VALUES ('TEST_ID', '1234', '010-1234-5678');

SELECT * FROM TABLE_CHECK;

```
<br/>
<br/>
<br/>

##### Q048
- CHECK 제약 조건 확인하기.
![select_constraint](img/chap14_048.png)
```sql
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME LIKE 'TABLE_CHECK';

```
<br/>
<br/>
<br/>

##### Q049
- 테이블을 생성할때 DEFAULT 제약 조건을 설정하시오.
- 기본값 1234
![select_constraint](img/chap14_049.png)
```sql
CREATE TABLE TABLE_DEFAULT(
   LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK2_LOGINID_PK PRIMARY KEY,
   LOGIN_PWD VARCHAR2(20) DEFAULT '1234',
   TEL VARCHAR2(20)
);

DESC TABLE_DEFAULT;

```
<br/>
<br/>
<br/>

##### Q050
- DEFAULT로 지정한 기본값이 입력되는 INSERT문을 확인하시오.
- 다음과 같이 데이터를 입력하시오.
![select_constraint](img/chap14_050.png)
```sql
INSERT INTO TABLE_DEFAULT VALUES ('TEST_ID', NULL, '010-1234-5678');

INSERT INTO TABLE_DEFAULT (LOGIN_ID, TEL) VALUES ('TEST_ID2', '010-1234-5678');

SELECT * FROM TABLE_DEFAULT;
```


<br/>
<br/>
<br/>


####  ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001
- DEPT_CONST 테이블과 EMP_CONST테이블을 다음과 같은 특성 및 제약 조건을 지정하여 만드시오.
1. DEPT_CONST 테이블

![select_constraint](img/chap14__EX_001.png)

|열이름|자료형|길이|제약조건|제약조건이름|
|-|-|-|-|-|
|DEPTNO|정수형숫자|2|PRIMARY KEY|DEPTCONST_DEPTNO_PK|
|DNAME|가변형 문자열|14|UNIQUE|DEPTCONST_DNAME_UNQ|
|LOC|가변형 문자열|13|NOT NULL|DEPTCONST_LOC_NN|

<br/>
<br/>
<br/>

2. EMP_CONST 테이블

![select_constraint](img/chap14__EX_002.png)

|열이름|자료형|길이|제약조건|제약조건이름|
|-|-|-|-|-|
|EMPNO|정수형숫자|4|PRIMARY KEY|EMPCONST_EMPNO_PK|
|ENAME|가변형 문자열|10|NOT NULL|EMPCONST_ENAME_NN|
|JOB|가변형 문자열|9|-|-|
|TEL|가변형 문자열|20|UNIQUE|EMPCONST_TEL_UNQ|
|HIREDATE|날짜|-|-|-|
|SAL|소수점 둘째자리 숫자|7|CHECK: 급여는1000~9999만 입력가능|EMPCONST_SAL_CHE|
|COMM|소수점 둘째자리 숫자|7|-|-|
|DEPTNO|정수형숫자|2|FOREIGN KEY|EMPCONST_DEPTNO_FK|

<br/>
<br/>
<br/>

3. 테이블 생성 후 데이터 사전 뷰를 사용하여 다음과 같이 두 테이블의 제약 조건을 확인하시오.


<br/>
<br/>
<br/>


![select_constraint](img/chap14__EX_003.png)





```sql
--①
CREATE TABLE DEPT_CONST (
   DEPTNO NUMBER(2)    CONSTRAINT DEPTCONST_DEPTNO_PK PRIMARY KEY,
   DNAME  VARCHAR2(14) CONSTRAINT DEPTCONST_DNAME_UNQ UNIQUE,
   LOC    VARCHAR2(13) CONSTRAINT DEPTCONST_LOC_NN NOT NULL
);

--②
CREATE TABLE EMP_CONST (
   EMPNO    NUMBER(4) CONSTRAINT EMPCONST_EMPNO_PK PRIMARY KEY,
   ENAME    VARCHAR2(10) CONSTRAINT EMPCONST_ENAME_NN NOT NULL,
   JOB      VARCHAR2(9),
   TEL      VARCHAR2(20) CONSTRAINT EMPCONST_TEL_UNQ UNIQUE,
   HIREDATE DATE,
   SAL      NUMBER(7, 2) CONSTRAINT EMPCONST_SAL_CHK CHECK (SAL BETWEEN 1000 AND 9999),
   COMM     NUMBER(7, 2),
   DEPTNO   NUMBER(2) CONSTRAINT EMPCONST_DEPTNO_FK REFERENCES DEPT_CONST (DEPTNO)
);

--③
SELECT TABLE_NAME, CONSTRAINT_NAME, CONSTRAINT_TYPE
  FROM USER_CONSTRAINTS
 WHERE TABLE_NAME IN ( 'EMP_CONST', 'DEPT_CONST' )
ORDER BY CONSTRAINT_NAME;

```