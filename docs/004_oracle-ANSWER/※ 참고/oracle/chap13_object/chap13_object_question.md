#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- DICT을 이용하여 SCOTT계정에서 사용가능한 데이터 사전을 살펴보시오
  ![select_obj](img/chap13_001.png)

```sql
SELECT * FROM DICT;
```

<br/>
<br/>
<br/>

##### Q002

- DICTIONARY을 이용하여 SCOTT계정에서 사용가능한 데이터 사전을 살펴보시오
  ![select_obj](img/chap13_002.png)

```sql
SELECT * FROM DICTIONARY;
```

<br/>
<br/>
<br/>

##### Q003

- USER접두어를 가진 데이터 사전 : 현재 오라클에 접속해 있는 사용자가 소유한 객체 정보가 보관되어 있음.
- SCOTT계정이 가지고 있는 객체 정보 살펴보기
- SCOTT계정이 가지고 있는 테이블 이름 알고 싶을때 유용함.
  ![select_obj](img/chap13_003.png)

```sql
SELECT TABLE_NAME
  FROM USER_TABLES;
```

<br/>
<br/>
<br/>

##### Q004

- ALL 접두어를 가진 데이터 사전 : 오라클데이터베이스에 접속해 있는 사용자가 소유한 객체 및 다른 소유자가 소유한 객체중 사용이 허락되어 있는 객체 정보
- 사용가능한 모든 테이블이 출력됨.
  ![select_obj](img/chap13_004.png)

```sql
SELECT OWNER, TABLE_NAME
  FROM ALL_TABLES;
```

<br/>
<br/>
<br/>

##### Q005

- 데이터베이스 관리 권한을 가진 사용자만 조회할 수 있는 테이블
- SCOTT계정으로는 조회가 불가능함.
  ![select_obj](img/chap13_005.png)

```sql
SELECT * FROM DBA_TABLES;
```

<br/>
<br/>
<br/>

##### Q006

- (SYSTEM) SYSTEM 계정으로 DBA\_ 접두어 사용하기
  ![select_obj](img/chap13_006.png)
  ![select_obj](img/chap13_006_2.png)

```sql
SELECT * FROM DBA_TABLES;
```

<br/>
<br/>
<br/>

##### Q007

- (SYSTEM) DBA_USERS를 사용하여 사용자 정보 알아보기
  ![select_obj](img/chap13_007.png)

```sql
SELECT *
  FROM DBA_USERS
 WHERE USERNAME = 'SCOTT';
```

<br/>
<br/>
<br/>

##### Q008

- 더 빠른 검색을 위한 인덱스
- (SCOTT계정) SCOTT계정이 소유한 인덱스 정보 알아보기
  ![select_obj](img/chap13_008.png)

```sql
SELECT *
  FROM USER_INDEXES;
```

<br/>
<br/>
<br/>

##### Q009

- (SCOTT계정) SCOTT계정이 소유한 인덱스 컬럼 정보 알아보기
  ![select_obj](img/chap13_009.png)

```sql
SELECT *
  FROM USER_IND_COLUMNS;
```

<br/>
<br/>
<br/>

##### Q010

- EMP 테이블의 SAL열에 인덱스 생성하기
  ![select_obj](img/chap13_010.png)

```sql
CREATE INDEX IDX_EMP_SAL
    ON EMP(SAL);
```

<br/>
<br/>
<br/>

##### Q011

- 생성된 인덱스 살펴보기
  ![select_obj](img/chap13_011.png)

```sql
SELECT * FROM USER_IND_COLUMNS;
```

<br/>
<br/>
<br/>

##### Q012

- 인덱스 삭제하기기
  ![select_obj](img/chap13_012.png)

```sql
DROP INDEX IDX_EMP_SAL;
```

<br/>
<br/>
<br/>

##### Q013

- 생성된 인덱스 살펴보기
  ![select_obj](img/chap13_013.png)

```sql
SELECT * FROM USER_IND_COLUMNS;
```

<br/>
<br/>
<br/>

##### Q014

- 테이블처럼 사용하는 뷰
- 뷰를 SELECT문의FROM 절에 사용하면 특정데이터를 조회하는 것과 같은 효과를 얻을 수 있음.
- 편리성 : SELECT 문의 복잡도를 완화하기 위해
- 보완성 : 테이블의 특정열을 노출하고 싶지 않을때

1. 뷰를 생성하기위해 SYSTEM으로 계정변경
2. SCOTT에 VIEW 생성권한 주기
   ![select_obj](img/chap13_014.png)

```sql
SQLPLUS SYSTEM/1234

GRANT CREATE VIEW TO SCOTT;
```

<br/>
<br/>
<br/>

##### Q015

- SCOTT 계정으로 VIEW 생성하기
- EMP 테이블에서 DEPTNO가 20인 EMPNO, ENAME, JOB, DEPTNO 열의 데이터로 VW_EMP20 라는 VIEW를 생성하시오오
  ![select_obj](img/chap13_015.png)

```sql
CREATE VIEW VW_EMP20
    AS (SELECT EMPNO, ENAME, JOB, DEPTNO
          FROM EMP
         WHERE DEPTNO = 20);
```

<br/>
<br/>
<br/>

##### Q016

- VIEW가 잘 만들어 졌는지 USER_VIEWS에서서 조회하시오.
  ![select_obj](img/chap13_016.png)

```sql
SELECT *
  FROM USER_VIEWS;
```

<br/>
<br/>
<br/>

##### Q017

- (SCOTT계정 ) 생성한 뷰의 내용을 확인하시오.
  ![select_obj](img/chap13_017.png)

```sql
SELECT VIEW_NAME, TEXT_LENGTH, TEXT
  FROM USER_VIEWS;
```

<br/>
<br/>
<br/>

##### Q018

- VW_EMP20 의 생성한 뷰를 조회하시오.
  ![select_obj](img/chap13_018.png)

```sql
SELECT *
  FROM VW_EMP20;
```

<br/>
<br/>
<br/>

##### Q019

- VW_EMP20 뷰를 삭제 하시오.
  ![select_obj](img/chap13_019.png)

```sql
DROP VIEW VW_EMP20;
```

<br/>
<br/>
<br/>

##### Q020

- 인라인뷰 : 일회성으로 만들어서 사용하는 뷰
- SELECT에서 사용되는 서브쿼리, WITH절에서 미리 이름을 정의해사용하는 SELECT문이 해당됨.
- ROWNUM을 이용하면 열의 데이터가 숫자로 출력되는 것을 확인 할수 있음.
  ![select_obj](img/chap13_020.png)

```sql
SELECT ROWNUM, E.*
  FROM EMP E;
```

<br/>
<br/>
<br/>

##### Q021

- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여 조회하시오.
  ![select_obj](img/chap13_021.png)

```sql
SELECT ROWNUM, E.*
  FROM EMP E
ORDER BY SAL DESC;
```

<br/>
<br/>
<br/>

##### Q022

- 인라인뷰 (서브쿼리) 를 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여 조회하시오.
  ![select_obj](img/chap13_022.png)

```sql
SELECT ROWNUM, E.*
  FROM (SELECT *
          FROM EMP E
        ORDER BY SAL DESC) E;
```

<br/>
<br/>
<br/>

##### Q023

- 인라인뷰( WITH 절)을 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여 조회하시오.
  ![select_obj](img/chap13_023.png)

```sql
WITH E AS (SELECT * FROM EMP ORDER BY SAL DESC)
SELECT ROWNUM, E.*
  FROM E;
```

<br/>
<br/>
<br/>

##### Q024

- 인라인뷰 (서브쿼리) 를 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여
- 마지막으로 급여가 높은 상위 세면의 데이터만 출력하시오.

![select_obj](img/chap13_024.png)

```sql
SELECT ROWNUM, E.*
  FROM (SELECT *
          FROM EMP E
        ORDER BY SAL DESC) E
 WHERE ROWNUM <= 3;
```

<br/>
<br/>
<br/>

##### Q025

- 인라인뷰 (WITH 절절) 를 이용하여
- EMP 테이블을 SAL열 기준 내림차순으로 정렬 및 ROWNUM의 열 데이터 번호를 이용하여
- 마지막으로 급여가 높은 상위 세면의 데이터만 출력하시오.
  ![select_obj](img/chap13_025.png)

```sql
WITH E AS (SELECT * FROM EMP ORDER BY SAL DESC)
SELECT ROWNUM, E.*
  FROM E
 WHERE ROWNUM <= 3;
```

<br/>
<br/>
<br/>

##### Q026

- DEPT 테이블을 이용하여 테이블 열구성은 갖고 데이터가 없는 DEPT_SEQUENCE 테이블을 생성하시오.
  ![select_obj](img/chap13_026.png)

```sql
CREATE TABLE DEPT_SEQUENCE
    AS SELECT *
         FROM DEPT
        WHERE 1 <> 1;
```

<br/>
<br/>
<br/>

##### Q027

- 기존의 부서번호는 10으로 시작해서 10씩증가하고 최대는 90, 최소는 0, 반복안하는 SEQ_DEPT_SEQUENCE 시퀀스를 작성하시오.
  ![select_obj](img/chap13_027.png)

```sql
CREATE SEQUENCE SEQ_DEPT_SEQUENCE
   INCREMENT BY 10
   START WITH 10
   MAXVALUE 90
   MINVALUE 0
   NOCYCLE
   CACHE 2;
```

<br/>
<br/>
<br/>

##### Q028

- 생성한 시퀀스 SEQ_DEPT_SEQUENCE 를 조회하시오.
  ![select_obj](img/chap13_028.png)

```sql
SELECT *
  FROM USER_SEQUENCES;
```

<br/>
<br/>
<br/>

##### Q029

- DEPT_SEQUENCE 테이블에 SEQ_DEPT_SEQUENCE 시퀀스를 이용하여 다음과 같이 데이터를 삽입하시오.
  ![select_obj](img/chap13_029.png)

```sql
INSERT INTO DEPT_SEQUENCE (DEPTNO, DNAME, LOC)
VALUES (SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO;
```

<br/>
<br/>
<br/>

##### Q030

- 가장 마지막으로 생성한 시퀀스를 확인하시오.
  ![select_obj](img/chap13_030.png)

```sql
SELECT SEQ_DEPT_SEQUENCE.CURRVAL
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q031

- 시퀀스에서 생성한 순번을 사용하여 INSERT문을 실행하시오.
  ![select_obj](img/chap13_031.png)

```sql
INSERT INTO DEPT_SEQUENCE (DEPTNO, DNAME, LOC)
VALUES (SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO;
```

<br/>
<br/>
<br/>

##### Q032

- SEQ_DEPT_SEQUENCE 시퀀스를 최대값 99, 증가값을 3, CYCLE옵션을 주어 다음과 같이 수정하시오.
  ![select_obj](img/chap13_032.png)

```sql
ALTER SEQUENCE SEQ_DEPT_SEQUENCE
   INCREMENT BY 3
   MAXVALUE 99
   CYCLE;
```

<br/>
<br/>
<br/>

##### Q033

- 옵션을 수정한 시퀀스를 조회하시오.
  ![select_obj](img/chap13_033.png)

```sql
SELECT *
  FROM USER_SEQUENCES;
```

<br/>
<br/>
<br/>

##### Q034

- 수정한 시퀀스로 다음과 같이 데이터를 삽입하시오.
  ![select_obj](img/chap13_034.png)

```sql
INSERT INTO DEPT_SEQUENCE (DEPTNO, DNAME, LOC)
VALUES (SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO;
```

<br/>
<br/>
<br/>

##### Q035

- SEQ_DEPT_SEQUENCE 시퀀스의 최대값 도달 후 수행결과를 확인하시오.
  ![select_obj](img/chap13_035.png)

```sql
INSERT INTO DEPT_SEQUENCE (DEPTNO, DNAME, LOC)
VALUES (SEQ_DEPT_SEQUENCE.NEXTVAL, 'DATABASE', 'SEOUL');

SELECT * FROM DEPT_SEQUENCE ORDER BY DEPTNO;
```

<br/>
<br/>
<br/>

##### Q036

- SEQ_DEPT_SEQUENCE 시퀀스 삭제후 확인하시오.
  ![select_obj](img/chap13_036.png)

```sql
DROP SEQUENCE SEQ_DEPT_SEQUENCE;

SELECT * FROM USER_SEQUENCES;
```

<br/>
<br/>
<br/>

##### Q037

- SYNONYM? 동의어
- 테이블, 뷰, 시퀀스 등 객체 이름 대신에 사용할 수 있는 다른 이름을 뷰여하는 객체
- 테이블 이름이 너무길어 사용이 불편할때 좀더 간단하고 짧은 이름을 하나 더 만들어주기 위해 사용함.

- (SYSTEM 계정) SCOTT에 CREATE SYNONYM 생성권한,
  PUBLIC 데이터베이스 내 모든 사용자가 사용할수 있도록 설정하는 권한 부여
  ![select_obj](img/chap13_037.png)

```sql
SQLPLUS SYSTEM/oracle

GRANT CREATE SYNONYM TO SCOTT;

GRANT CREATE PUBLIC SYNONYM TO SCOTT;
```

<br/>
<br/>
<br/>

##### Q038

- (SCOTT) EMP 테이블의 동의어를 E로 생성하시오.
  ![select_obj](img/chap13_038.png)

```sql
CREATE SYNONYM E
   FOR EMP;
```

<br/>
<br/>
<br/>

##### Q039

- E 테이블 전체 내용을 조회하시오.
  ![select_obj](img/chap13_039.png)

```sql
SELECT * FROM E;
```

<br/>
<br/>
<br/>

##### Q040

- E 동의어를 삭제하시오.
  ![select_obj](img/chap13_040.png)

```sql
DROP SYNONYM E;
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001

1. EMP 테이블과 같은 구조의 데이터를 저장하는 EMPIDX 테이블을 생성하시오.
2. 생성한 EMPIDX 테이블의 EMPNO열에 IDX_EMPIDX_EMPNO 인덱스를 생성하시오.
3. 인덱스가 잘 생성되었는지 적절한 데이터 사전뷰를 통해 확인하시오.

![select_obj](img/chap13__EX_001.png)

<br/>
<br/>
<br/>

##### EX002

1.  EMPIDX 테이블의 급여(SAL) 가 1500 초과인 사원들만 출력하는 EMPIDX_OVER15K 뷰를 생성하시오.
2.  만약 이뷰가 존재한다면 새로운 내용으로 대체가능하게 작성하시오.
3.  EMPIDX_OVER15K 뷰는 EMPNO, ENAME, JOB, DEPTNO, SAL , COMM 이 있다면 O 존재하지 않으면 X 열을 가지고 있습니다.

![select_obj](img/chap13__EX_002.png)

<br/>
<br/>
<br/>

##### EX003

1. DEPT 테이블과 같은 결과 행 구성ㅇ르 가지는 DEPTSEQ 테이블을 작성하시오.
2. DEPTSEQ ㅔ이블에 사용할 SEQ_DEPTSEQ 시퀀스를 작성하시오.
   시작값1 , 증가1, 최대값 99, 최소값 1, 부서번호 최대값에서 생성중단, 캐시 없음
3. DEPTSEQ 를 이용하여 다음과 같이 세개 부서를 차례대로 추가하시오.

![select_obj](img/chap13__EX_003.png)
