### ✅001. 
다음 중 데이터 제어어(DCL)에 해당하는 명령어는?
① INSERT  
② RENAME  
③ COMMIT  
④ REVOKE  
 



---

### ✅002. 
다음 중 아래 내용의 범주에 해당하는 SQL 명령어로 옳지 않은 것은?

> 테이블의 구조를 생성, 변경, 삭제하는 등 데이터 구조를 정의하는데 사용되는 명령어이다.

① CREATE  
② GRANT  
③ ALTER  
④ DROP  



---

### ✅003. 
아래 내용에 해당하는 SQL 명령어의 종류를 작성하시오.
   
> 논리적인 작업의 단위를 묶어 DML에 의해 조작된 결과를 작업 단위(Transaction)별로 제어하는 명령어인 Commit, Rollback, Savepoint 등이 여기에 해당하며, 일부에서는 DCL(Data Control Language)로 분류하기도 한다.
 





---

### ✅004. 
데이터베이스를 정의하고 접근하기 위해서는 데이터베이스 관리 시스 템과의 통신수단이 필요한데 이를 데이터 언어(Data Language) 라고 하며, 그 기능과 사용 목적에 따라 데이터 정의어(DDL), 데이터 조작어 (DML), 데이터 제어어(DCL)로 구분된다. 다음 중 데이터 언어와 SQL 명령어에 대한 설명으로 가장 부적절한 것은?

① 비절차적 데이터 조작어(DML)는 사용자가 무슨 데이터를 원하며, 어떻게 그것을 접근해야 되는지를 명세하는 언어이다.  
② DML은 데이터베이스 사용자가 응용 프로그램이나 질의어를 통하여 저장된 데이터베이스를 실질적으로 접근하는데 사용되며 SELECT, INSERT, DELETE, UPDATE 등이 있다.  
③ DDL은 스키마, 도메인, 테이블, 뷰, 인덱스를 정의하거나 변경 또는 제거할 때 사용되며 CREATE, ALTER, DROP, RENAME 등이 있다.  
④ 호스트 프로그램 속에 삽입되어 사용되는 DML 명령어들을 데이터 부속어(Data Sub Language)라고 한다.  

---

### ✅005.  
다음 중 데이터베이스 시스템 언어의 종류와 해당되는 명령어를 바르게 연결한 것을 2개 고르시오.

① DML - SELECT  
② TCL - COMMIT  
③ DCL - DROP  
④ DML - ALTER  





---

### ✅006  
다음 중 아래의 데이터 모델과 같은 테이블 및 PK 제약조건을 생성하는 DDL 문장으로 올바른 것은? (단, DBMS는 Oracle을 기준으로 한다.)
 
| PRODUCT |
|------|
| PROD_ID: VARCHAR2(10) NOT NULL |
| PROD_NM VARCHAR2(100) NOT NULL <br/> REG DT: DATE NOT NULL <br/> REGR NO NUMBER(10) NULL |

[IE 표기법]
 

 
| PRODUCT |
|------|
| **PRODUCT()** <br/> # PROD_ID VARCHAR2(10) <br/> +PROD_NM VARCHAR2(100) <br/> + REG_DT DATE <br/>o REGR NO NUMBER(10)|

[Barker 표기법]

①  
```sql
CREATE TABLE PRODUCT
(PROD_ID VARCHAR2(10) NOT NULL,
 PROD_NM VARCHAR2(100) NOT NULL,
 REG DT DATE NOT NULL,
 REGR NO NUMBER(10) NULL);
ALTER TABLE PRODUCT ADD PRIMARY KEY PRODUCT_PK ON (PROD_ID);
```

②  
```sql
CREATE TABLE PRODUCT
(PROD_ID VARCHAR2(10),
 PROD_NM VARCHAR2(100),
 REG_DT DATE,
 REGR_NO NUMBER(10));
ALTER TABLE PRODUCT ADD CONSTRAINT PRODUCT_PK
PRIMARY KEY (PROD_ID);
```

③  
```sql
CREATE TABLE PRODUCT
(PROD_ID VARCHAR2(10) NOT NULL,
 PROD_NM VARCHAR2(100) NOT NULL,
 REG_DT DATE NOT NULL,
 REGR NO NUMBER(10) NULL,
 ADD CONSTRAINT PRIMARY KEY (PROD_ID));
```

④  
```sql
CREATE TABLE PRODUCT
(PROD_ID VARCHAR2(10) NOT NULL,
 PROD_NM VARCHAR2(100) NOT NULL,
 REG_DT DATE NOT NULL,
 REGR_NO NUMBER(10),
 CONSTRAINT PRODUCT_PK PRIMARY KEY (PROD_ID));
```







---

### ✅007   
아래와 같이 데이터가 들어있지 않은 왼쪽의 기관분류 테이블 (가)를 오른쪽 기관분류 테이블 (나)처럼 변경하고자 할 때 다음 중 올바른 SQL 문장은? (단, DBMS는 SQLServer로 가정한다.) 

```
(가)
[  기관분류  ]
분류 ID:VARCHAR(10) NOT NULL 
-------------------------------
분류명 : VARCHAR(10) NOT NULL 
등록일자: VARCHAR(10) NULL

(나)
[  기관분류  ]
분류 ID:VARCHAR(10) NOT NULL
-------------------------------
분류명 : VARCHAR(30) NOT NULL 
등록일자: DATE NOT NULL 
```

① ALTER TABLE 기관분류 ALTER COLUMN (분류명 VARCHAR(30), 등록일자 DATE NOT NULL);  
② ALTER TABLE 기관분류 ALTER COLUMN (분류명 VARCHAR(30) NOT NULL, 등록일자 DATE NOT NULL);  
③ ALTER TABLE 기관분류 ALTER COLUMN 분류명 VARCHAR(30);  
  ALTER TABLE 기관분류 ALTER COLUMN 등록일자 DATE NOT NULL;  
④ ALTER TABLE 기관분류 ALTER COLUMN 분류명 VARCHAR(30) NOT NULL;  
  ALTER TABLE 기관분류 ALTER COLUMN 등록일자 DATE NOT NULL;  

---

### ✅008.  
다음 중 NULL의 설명으로 가장 부적절한 것은?

① 모르는 값을 의미한다.  
② 값의 부재를 의미한다.  
③ 공백문자(Empty String) 혹은 숫자 0을 의미한다.  
④ NULL과의 모든 비교(IS NULL 제외)는 알 수 없음(Unknown)을 반환한다.  

 

---

### ✅009. 
아래 테이블 T, S, R이 각각 다음과 같이 선언되었다. 다음 중 DELETE FROM T; 를 수행한 후에 테이블 R에 남아있는 데이터로 가장 적절한 것은? 

```
CREATE TABLE T
(C INTEGER PRIMARY KEY,
D INTEGER):


CREATE TABLE S
(B INTEGER PRIMARY KEY,
 C INTEGER REFERENCES T(C) ON DELETE CASCADE);


CREATE TABLE R
(A INTEGER PRIMARY KEY,
 B INTEGER REFERENCES S(B) ON DELETE SET NULL);
```

######  T 테이블

| C | D |
|---|---|
| 1 | 1 |
| 2 | 1 |
 

###### S 테이블

| B | C |
|---|---|
| 1 | 1 |
| 2 | 1 |
 

###### R 테이블

| A | B |
|---|---|
| 1 | 1 |
| 2 | 2 |
 

① (1, NULL)과 (2, 2)  
② (1, NULL)과 (2, NULL)  
③ (2, 2)  
④ (1, 1)  

---

### ✅010.  
다음 중 테이블 생성 시 칼럼별 생성할 수 있는 제약조건(Constraints)에 대한 설명으로 가장 부적절한 것은?

① UNIQUE: 테이블 내에서 중복되는 값이 없으며 NULL 입력이 불가능하다.  
② PK: 주키로 테이블당 1개만 생성이 가능하다.  
③ FK: 외래키로 테이블당 여러 개 생성이 가능하다.  
④ NOT NULL: 명시적으로 NULL 입력을 방지한다.  



---

### ✅011. 
다음 중 물리적 테이블 명으로 가장 적절한 것은?  
①EMP_10
②100-EMP
③EMP-100
④100_EMP




---

### ✅012.

아래와 같은 테이블 구조를 정의하려고 한다. 이때 아직 부서가 정의되지 않은 사원은 기본부서(코드 : '0000')로 배치하고, 입사일자(JOIN DATE) 기준으로 많은 조회가 발생하므로 입사일자에 Index를 생성하려고 한다.
다음 중 올바른 SQL 문장을 2개 고르시오

EMP
| EMP_NO: VARCHAR2(10) NOT NULL |
|---|
| EMP NM. VARCHAR2(30) NOT NULL <br/> DEPT_CODE: VARCHAR2(4) NOT NULL <br/> JOIN DATE: DATE NOT NULL<br/> REGIST_DATE: DATE NULL |



① CREATE TABLE EMP
(EMP_NO VARCHAR2(10) PRIMARY KEY,
EMP NM VARCHAR2(30) NOT NULL,
DEPT CODE VARCHAR2(4) DEFAULT '0000' NOT NULL,
JOIN DATE DATE NOT NULL,
REGIST DATE DATE NULL);
CREATE INDEX IDX EMP 01 ON EMP (JOIN DATE);

② CREATE TABLE EMP
(EMP NO VARCHAR2(10) PRIMARY KEY,
EMP_NM VARCHAR2(30) NOT NULL,
DEPT CODE VARCHAR2(4) DEFAULT '0000',
JOIN DATE DATE NOT NULL,
REGIST DATE DATE );
CREATE INDEX IDX_EMP_01 ON EMP (JOIN_DATE);

③ CREATE TABLE EMP
(EMP_NO VARCHAR2(10) NOT NULL,
EMP_NM VARCHAR2(30) NOT NULL,
DEPT_CODE VARCHAR2(4) DEFAULT '0000' NOT NULL,
JOIN_DATE DATE NOT NULL,
REGIST_DATE DATE):
ALTER TABLE EMP ADD CONSTRAINT EMP_PK PRIMARY KEY
(EMP_NO):
CREATE INDEX IDX_EMP_01 ON EMP (JOIN_DATE):

④ CREATE TABLE EMP
(EMP_NO VARCHAR2(10) NOT NULL PRIMARY KEY,
EMP_NM VARCHAR2(30) NOT NULL,
DEPT_CODE VARCHAR2(4) DEFAULT '0000' NOT NULL,
JOIN_DATE DATE NOT NULL,
REGIST_DATE DATE NULL );
ALTER TABLE EMP ADD CONSTRAINT EMP_PK PRIMARY KEY
(EMP_NO):
CREATE INDEX IDX_EMP_01 ON EMP (JOIN_DATE):





---

### ✅013
다음 중 아래와 같은 문장으로 '학생' 테이블을 생성한 후, 유효한 튜플(Tuple)들을 삽입하였다. SQL 1, SQL 2 문장의 실행 결과로 가장 적절한 것은?

아래

생성) create table 학생 (학번 char (8) primary key,
장학금 integer):

SQL1: select count(*) from 학생
SQL2: select count(학번) from 학생

① SQL1, SQL2 문장의 실행 결과는 다를 수 있으며, 그 이유는 장학금
속성(Attribute)에 널(Null)값이 존재할 수 있기 때문이다.
② SQL1, SQL2 문장의 실행 결과는 항상 다르다.
③ SQL1, SQL2 문장의 실행 결과는 항상 같다.
④ SQL1, SQL2 문장의 실행 결과는 다를 수 있으며, 그 이유는 학번
속성(Attribute)에 널(Null)값이 존재할 수 있기 때문이다.




---

### ✅014
다음 중 외래키에 대한 설명으로 가장 부적절한 것을 2개 고르시오.
① 테이블 생성시 설정할 수 있다.
② 외래키 값은 널 값을 가질 수 없다.
③ 한 테이블에 하나만 존재해야 한다.
④ 외래키 값은 참조 무결성 제약을 받을 수 있다.




---

### ✅015

다음 중 데이터베이스 테이블의 제약조건(Constraint)에 대한 설명으로 가장 부적절한 것은?
①Check 제약조건(Constraint)은 데이터베이스에서 데이터의 무결성을 유지하기 위하여 테이블의 특정 컬럼(Column)에 설정하는 제약이다.
② 기본키(Primary Key)는 반드시 테이블 당 하나의 제약만을 정의할 수 있다.
③ 고유키(Unique Key)로 지정된 모든 컬럼들은 Null 값을 가질 수 없다.
④ 외래키(Foreign Key)는 테이블간의 관계를 정의하기 위해 기본키(Primary Key)를 다른 테이블의 외래키가 참조하도록 생성한다.


 

---

### ✅016
4개의 칼럼으로 이루어진 EMP 테이블에서 COMM 칼럼을 삭제하고자 할 때, 아래 SQL 문장의 안에 들어갈 내용을 기술하시오.
 
######  EMP 테이블 

| MGR  | ENAME  | SAL  | COMM |
|------|--------|------|------|
| 7566 | FORD   | 3000 |      |
| 7566 | SCOTT  | 3000 |      |
| 7698 | JAMES  | 950  |      |
| 7698 | ALLEN  | 1600 | 300  |
| 7698 | WARD   | 1250 | 500  |
| 7698 | TURNER | 1500 | 0    |
| 7698 | MARTIN | 1250 | 1400 |
| 7782 | MILLER | 1300 |      |
| 7839 | ADAMS  | 1100 |      |
| 7839 | BLAKE  | 2850 |      |
| 7839 | JONES  | 2975 |      |
| 7839 | CLARK  | 2450 |      |
| 7839 | SMITH  | 800  |      |


[ ① ]  TABLE EMP
[ ② ]  COMM:




---

### ✅017

아래 7개의 SQL 문장이 성공적으로 수행되었다고 할 때, A, B, C 세 개의 SQL 문장을 차례대로 실행하면 A와 C의 SELECT 문장 수행결과는 각각 무엇인가?
```
CREATE TABLE 부서(부서번호 CHAR(10), 부서명 CHAR(10),
PRIMARY KEY(부서번호));

CREATE TABLE 직원(직원번호 CHAR(10), 소속부서 CHAR(10),
PRIMARY KEY(직원번호),
FOREIGN KEY(소속부서) REFERENCES 부서(부서번호)
ON DELETE CASCADE);

INSERT INTO 부서 VALUES('10', '영업과');
INSERT INTO 부서 VALUES('20', '기획과');

INSERT INTO 직원 VALUES('1000', '10');
INSERT INTO 직원 VALUES('2000', '20');
INSERT INTO 직원 VALUES('3000', '20');
COMMIT:
```
```
A. SELECT COUNT(직원번호) FROM 직원
B. DELETE FROM 부서 WHERE 부서번호 = '20':
C. SELECT COUNT(직원번호) FROM 직원
COMMIT;
```

① 3, null
② 3, 1
③ 3,2
④ 3,3



---

### ✅018
STADIUM 테이블의 이름을 STADIUM_JSC로 변경하는 SQL을 작성하시오. (ANSI 표준 기준)




---

### ✅019





---

### ✅020




 


---

### ✅021




---

### ✅022





---

### ✅023





---

### ✅024





---

### ✅025





---

### ✅026





---

### ✅027





---

### ✅028





---

### ✅029





---

### ✅030




 


---

### ✅031




---

### ✅032





---

### ✅033





---

### ✅034





---

### ✅035





---

### ✅036





---

### ✅037





---

### ✅038





---

### ✅039





---

### ✅040




 


---

### ✅041




---

### ✅042





---

### ✅043





---

### ✅044





---

### ✅045





---

### ✅046





---

### ✅047





---

### ✅048





---

### ✅049





---

### ✅050




 


---

### ✅051




---

### ✅052





---

### ✅053





---

### ✅054





---

### ✅055





---

### ✅056





---

### ✅057





---

### ✅058





---

### ✅059





---

### ✅060




 


---

### ✅061




---

### ✅062





---

### ✅063





---

### ✅064


