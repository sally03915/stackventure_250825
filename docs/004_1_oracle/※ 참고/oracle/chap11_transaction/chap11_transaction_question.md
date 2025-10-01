#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- DEPT 테이블을 이용해 다음과 같이 작성하시오.

1. DEPT 테이블을 복사해 DEPT_TCL테이블을 작성하시오.
   ![select_transaction](img/chap11_001.png)

```sql
CREATE TABLE DEPT_TCL
    AS SELECT *
         FROM DEPT;

SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q002

- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.

1. DEPT_TCL 테이블에 다음과 같이 데이터를 입력, 수정, 삭제 하시오.
   ![select_transaction](img/chap11_002.png)

```sql
INSERT INTO DEPT_TCL VALUES(50, 'DATABASE', 'SEOUL');

UPDATE DEPT_TCL SET LOC = 'BUSAN' WHERE DEPTNO = 40;

DELETE FROM DEPT_TCL WHERE DNAME = 'RESEARCH';

SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q003

- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.

1. ROLLBACK 명령어를 이용하여 실행을 취소하시오.
   ![select_transaction](img/chap11_003.png)

```sql
ROLLBACK;

SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q004

- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.

1. INSERT를 이용하여 50, 'NETWORK', 'SEOUL' 값을 추가하시오.
2. DEPTNO가 20인데이터의 LOC를 BUSAN으로 수정하시오.
3. DEPTNO가 40인데이터를 삭제하시오.

![select_transaction](img/chap11_004.png)

```sql
INSERT INTO DEPT_TCL VALUES(50, 'NETWORK', 'SEOUL');

UPDATE DEPT_TCL SET LOC = 'BUSAN' WHERE DEPTNO = 20;

DELETE FROM DEPT_TCL WHERE DEPTNO = 40;

SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q005

- DEPT_TCL 테이블을 이용해 다음과 같이 작성하시오.

1. 위의 명령어를 반영하시오.

![select_transaction](img/chap11_005.png)

```sql
COMMIT;

```

<br/>
<br/>
<br/>

##### Q006

- 세션? : 어떤활동을 위한 시간이나 기간
- 명령프롬프트 2개 실행가능
  ![select_transaction](img/chap11_006.png)

```sql
1번
SELECT * FROM DEPT_TCL;

2번
SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q007

- 한쪽 세션에서만 삭제
  ![select_transaction](img/chap11_007.png)

```sql
1번
DELETE FROM DEPT_TCL
 WHERE DEPTNO = 50;

SELECT * FROM DEPT_TCL;

2번
SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q008

- 세션반영후 확인
  ![select_transaction](img/chap11_008.png)

```sql
1번
COMMIT;

SELECT * FROM DEPT_TCL;

2번
SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q009

- LOCK? : 잠금현상, 조작중인 데이터를 다른세션은 조작할 수 없도록 접근을 보류시키는 것.
- 명령프롬프트 2개 실행가능
  ![select_transaction](img/chap11_009.png)

```sql
1번
SELECT * FROM DEPT_TCL;

2번
SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q010

- 한쪽에서 업데이트 (1번)
  ![select_transaction](img/chap11_010.png)

```sql
1번
UPDATE DEPT_TCL SET LOC='SEOUL'
 WHERE DEPTNO = 30;

SELECT * FROM DEPT_TCL;

2번
SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q011

- 한쪽에서 업데이트 (2번) LOCK 걸림
  ![select_transaction](img/chap11_011.png)

```sql

2번
UPDATE DEPT_TCL SET DNAME='DATABASE'
 WHERE DEPTNO = 30;

```

<br/>
<br/>
<br/>

##### Q012

- 1번에서 마무리를 해야 LOCK이 풀림
  ![select_transaction](img/chap11_012.png)

```sql
COMMIT;

SELECT * FROM EMP_TEMP;

```

<br/>
<br/>
<br/>

##### Q013

- select 구문으로 확인
- 데이터가 다른것을 알수 있다.
  ![select_transaction](img/chap11_013.png)

```sql
SELECT * FROM DEPT_TCL;

SELECT * FROM DEPT_TCL;

```

<br/>
<br/>
<br/>

##### Q014

- commit으로 데이터 반영
  ![select_transaction](img/chap11_014.png)

```sql
COMMIT;

```

<br/>
<br/>
<br/>

##### Q015

- select 구문으로 데이터 확인
  ![select_transaction](img/chap11_015.png)

```sql
SELECT * FROM DEPT_TCL;
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

##### EX001

두 세션에서 실행되는 순서별 SQL명령어를 확인하여 번호에 맞는 데이터 상태를 적으시오.

| 세션A                                                             | 세션B               |
| ----------------------------------------------------------------- | ------------------- |
| UPDATE DEPT SET DATABASE='DATABASE' , LOC='SEOUL' WHERE DEPTNO=30 |                     |
| SELECT \* FROM DEPT                                               | SELECT \* FROM DEPT |

> QUESTION

현재 세션 A,B에는 조회한 DEPT테이블 30번부서의 DNAME, LOC열의 데이터 상태를 적으시오.

> ANSWER

<br/>
<br/>
<br/>

##### EX002

위에 연결해 다음과 같이 작업을 했다.

| 세션A | 세션B                                                             |
| ----- | ----------------------------------------------------------------- |
|       | UPDATE DEPT SET DATABASE='DATABASE' , LOC='SEOUL' WHERE DEPTNO=30 |

> QUESTION

현재 세션 B에서 실행한 UPDATE 문 실행결과를 적으시오.

<br/>
<br/>
<br/>

##### EX003

위에 연결해 다음과 같이 작업을 했다.

| 세션A    | 세션B |
| -------- | ----- |
| ROLLBACK |       |

> QUESTION

세션A에서 ROLLBACK명령어를 사용한 후 세션B에서 일어나는 변화를 적으시오.

<br/>
<br/>
<br/>

##### EX004

위에 연결해 다음과 같이 작업을 했다.

| 세션A                | 세션B                |
| -------------------- | -------------------- |
| SELECT \* FROM DEPT; | SELECT \* FROM DEPT; |

> QUESTION

세션A, B에서 조회한 DEPT테이블 30번 부서의 DNAME, LOC의 데이터 상태를 적으시오.

<br/>
<br/>
<br/>

##### EX005

위에 연결해 다음과 같이 작업을 했다.

| 세션A                | 세션B                |
| -------------------- | -------------------- |
|                      | COMMIT;              |
| SELECT \* FROM DEPT; | SELECT \* FROM DEPT; |

> QUESTION

세션A, B에서 조회한 DEPT테이블 30번 부서의 DNAME, LOC의 데이터 상태를 적으시오.
