
①  ②  ③  ④ 


①  ②  ③  ④ 


①  ②  ③  ④ 



* 001. 다음 중 데이터 제어어(DCL)에 해당하는 명령어는?
1 INSERT
2 RENAME
3 COMMIT
4 REVOKE
 



* 002. 다음 중 아래 내용의 범주에 해당하는 SQL 명령어로 옳지 않은 것은?

> 테이블의 구조를 생성, 변경, 삭제하는 등 데이터 구조를 정의하는데 사용되는 명령어이다.

1 CREATE
2 GRANT 
3 ALTER
4 DROP



* 003. 아래 내용에 해당하는 SQL 명령어의 종류를 작성하시오.
   
> 논리적인 작업의 단위를 묶어 DML에 의해 조작된 결과를 작업 단위(Transaction)별로 제어하는 명령어인 Commit, Rollback, Savepoint 등이 여기에 해당하며, 일부에서는 DCL(Data Control Language)로 분류하기도 한다.
 





* 004. 데이터베이스를 정의하고 접근하기 위해서는 데이터베이스 관리 시스 템과의 통신수단이 필요한데 이를 데이터 언어(Data Language) 라고 하며, 그 기능과 사용 목적에 따라 데이터 정의어(DDL), 데이터 조작어 (DML), 데이터 제어어(DCL)로 구분된다. 다음 중 데이터 언어와 SQL 명령어에 대한 설명으로 가장 부적절한 것은?

1 비절차적 데이터 조작어(DML)는 사용자가 무슨 데이터를 원하며, 어떻게 그것을 접근해야 되는지를 명세하는 언어이다.
2 DML은 데이터베이스 사용자가 응용 프로그램이나 질의어를 통하여 저장된 데이터베이스를 실질적으로 접근하는데 사용되며 SELECT. INSERT, DELETE, UPDATE 등이 있다.
3 DDL은 스키마, 도메인, 테이블, 뷰, 인덱스를 정의하거나 변경 또는 제거할 때 사용되며 CREATE, ALTER, DROP, RENAME 등이 있다. 
4 호스트 프로그램 속에 삽입되어 사용되는 DML 명령어들을 데이터 부속어(Data Sub Language)라고 한다.





* 005 다음 중 데이터베이스 시스템 언어의 종류와 해당되는 명령어를 바르게 연결한 것을 2개 고르시오.
1. DML - SELECT
2. TCL - COMMIT
3. DCL - DROP
4. DML - ALTER
 





* 006  다음 중 아래의 데이터 모델과 같은 테이블 및 PK 제약조건을 생성하는 DDL 문장으로 올바른 것은? (단, DBMS는 Oracle을 기준으로 한다.)
[  PRODUCT  ]
PROD_ID: VARCHAR2(10) NOT NULL
-----------------------------------------------------
PROD_NM VARCHAR2(100) NOT NULL 
REG DT: DATE NOT NULL
REGR NO NUMBER(10) NULL
[IE 표기법]


PRODUCT()
# PROD_ID VARCHAR2(10) 
+PROD_NM VARCHAR2(100) 
+ REG_DT DATE
o REGR NO NUMBER(10)
[Barker 표기법]



1   CREATE TABLE PRODUCT
    (PROD_ID VARCHAR2(10) NOT NULL
    ,PROD_NM VARCHAR2(100) NOT NULL 
    ,REG DT DATE NOT NULL
    ,REGR NO NUMBER(10) NULL);
    ALTER TABLE PRODUCT ADD PRIMARY KEY PRODUCT_PK ON (PROD_ID);

2   CREATE TABLE PRODUCT
   (PROD_ID VARCHAR2(10)  
   ,PROD_NM VARCHAR2(100)  
   ,REG_DT DATE  
   ,REGR_NO NUMBER(10));
   ALTER TABLE PRODUCT ADD CONSTRAINT PRODUCT_PK
   PRIMARY KEY (PROD_ID);

3  CREATE TABLE PRODUCT
   (PROD_ID VARCHAR2(10) NOT NULL
   ,PROD_NM VARCHAR2(100) NOT NULL
   ,REG_DT DATE NOT NULL
   ,REGR NO NUMBER(10) NULL
   ,ADD CONSTRAINT PRIMARY KEY (PROD_ID) );

4  CREATE TABLE PRODUCT
  (PROD_ID VARCHAR2(10) NOT NULL
  ,PROD_NM VARCHAR2(100) NOT NULL
  ,REG_DT DATE NOT NULL
  ,REGR_NO NUMBER(10)
  ,CONSTRAINT PRODUCT_PK PRIMARY KEY (PROD_ID));





*007.  아래와 같이 데이터가 들어있지 않은 왼쪽의 기관분류 테이블 (가)를 오른쪽 기관분류 테이블 (나)처럼 변경하고자 할 때 다음 중 올바른 SQL 문장은? (단, DBMS는 SQLServer로 가정한다.)
_________________________  아래   _________________________  
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
__________________________________________________________  

1 ALTER TABLE 기관분류 ALTER COLUMN (분류명 VARCHAR(30), 등록일자 DATE NOT NULL);
2 ALTER TABLE 기관분류 ALTER COLUMN (분류명 VARCHAR(30) NOT NULL, 등록일자 DATE NOT NULL);
3 ALTER TABLE 기관분류 ALTER COLUMN  분류명 VARCHAR(30);
  ALTER TABLE 기관분류 ALTER COLUMN 등록일자 DATE NOT NULL;
4 ALTER TABLE 기관분류 ALTER COLUMN 분류명 VARCHAR(30) NOT NULL;
  ALTER TABLE 기관분류 ALTER COLUMN 등록일자 DATE NOT NULL;


* 008. 다음 중 NULL의 설명으로 가장 부적절한 것은?
1 모르는 값을 의미한다.
2 값의 부재를 의미한다.
3 공백문자(Empty String) 혹은 숫자 0을 의미한다. 
4 NULL과의 모든 비교(IS NULL 제외)는 알 수 없음(Unknown)을 반환 한다.



• [Oracle]
ALTER TABLE  테이블명  MODIFY
(칼럼명1 데이터 유형
[DEFAULT 식]
[NOT NULL].
칼럼명2 데이터 유형
...);
• [SQL Server]
ALTER TABLE
테이블명
ALTER
(칼럼명1 데이터 유형
[DEFAULT 식] [NOT
NULL].
칼럼명2 데이터 유형
...);

 


*009 아래 테이블 T, S, R이 각각 다음과 같이 선언되었다. 다음 중 DELETE FROM T; 를 수행한 후에 테이블 R에 남아있는 데이터로 가장 적절한 것은?
_________________________  아래   _________________________  
CREATE TABLE T
(C INTEGER PRIMARY KEY,
D INTEGER):


CREATE TABLE S
(B INTEGER PRIMARY KEY,
 C INTEGER REFERENCES T(C) ON DELETE CASCADE);


CREATE TABLE R
(A INTEGER PRIMARY KEY,
 B INTEGER REFERENCES S(B) ON DELETE SET NULL);

현재 테이블 T, S, R의 상태는 다음과 같다.
T:
C	D
1	1
2	1

S:
B	C
1	1
2	1

R:
A	B
1	1
2	2
__________________________________________________________  
1 (1, NULL)과 (2, 2)
2 (1. NULL)과 (2, NULL)
3 (2, 2)
4 (1, 1)


*010  다음 중 테이블 생성시 칼럼별 생성할 수 있는 제약조건(Constraints)에 대한 설명으로 가장 부적절한 것은?
1 UNIQUE: 테이블 내에서 중복되는 값이 없으며 NULL 입력이 불가능 하다.
2 PK: 주키로 테이블당 1개만 생성이 가능하다.
3 FK: 외래키로 테이블당 여러 개 생성이 가능하다.
4 NOT NULL: 명시적으로 NULL 입력을 방지한다.
 


*011




*012





*013





*014





*015





*016





*017





*018





*019





*020




 


*021




*022





*023





*024





*025





*026





*027





*028





*029





*030




 


*031




*032





*033





*034





*035





*036





*037





*038





*039





*040




 


*041




*042





*043





*044





*045





*046





*047





*048





*049





*050




 


*051




*052





*053





*054





*055





*056





*057





*058





*059





*060




 


*061




*062





*063





*064





*065





*066





*067





*068





*069





*070




 


*071




*072





*073





*074





*075





*076





*077





*078





*079





*080




 


*081




*082





*083





*084





*085





*086





*087





*088





*089





*090




 


*091




*092





*093





*094





*095





*096





*097





*098





*099





*100





*101




*102





*103





*104





*105





*106





*107





*108





*109





*110   




*111




*112





*113





*114





*115





*116





*117





*118





*119





*120




 


*121




*122





*123





*124





*125





*126





*127


