#### ■STEP1. BASIC

- 필요한 데이터만 출력

<br/>
<br/>
<br/>

##### Q001

- EMP테이블의 모든 열을 조회하시오.
  ![select_where](img/chap05_001.png)

```sql
SELECT *
  FROM EMP
```

<br/>
<br/>
<br/>

##### Q002

- EMP테이블에서 부서번호가 30인 데이터만 조회하시오.
  ![select_where](img/chap05_002.png)

```sql
SELECT *
  FROM EMP
 WHERE DEPTNO = 30;
```

<br/>
<br/>
<br/>

##### Q003

- EMP테이블에서 AND를 이용하여 부서번호가 30이고 JOB이 'SALESMAN' 인 데이터만 조회하시오.
  ![select_where](img/chap05_003.png)

```sql
SELECT *
  FROM EMP
 WHERE DEPTNO = 30
   AND JOB = 'SALESMAN';
```

<br/>
<br/>
<br/>

##### Q004

- EMP테이블에서 OR를 이용하여 부서번호가 30이거나 JOB이 'CLERK' 인 데이터만 조회하시오.
  ![select_where](img/chap05_004.png)

```sql
SELECT *
  FROM EMP
 WHERE DEPTNO = 30
    OR JOB = 'CLERK';
```

<br/>
<br/>
<br/>

##### Q005

- EMP테이블에서 SAL 열에 12를 곱한값이 36000인 행을 조회하시오.
  ![select_where](img/chap05_005.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL * 12 = 36000;
```

<br/>
<br/>
<br/>

##### Q006

- EMP테이블에서 SAL 열이 3000이상인 행을 조회하시오.
  ![select_where](img/chap05_006.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL >= 3000;
```

<br/>
<br/>
<br/>

##### Q007

- EMP테이블에서 ENAME 열의 첫문자가 F와 같거나 뒤에 있는 행을 조회하시오.
  ![select_where](img/chap05_007.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME >= 'F';
```

<br/>
<br/>
<br/>

##### Q008

- EMP테이블에서 ENAME 열의 문자열이 첫문자 F, 두번째 문자 O, 세번째 문자 R, 네번째문자열이 Z 인 문자열보다 앞에 있는 행을 조회하시오.
  ![select_where](img/chap05_008.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME <= 'FORZ';
```

<br/>
<br/>
<br/>

##### Q009

- EMP테이블에서 != 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
  ![select_where](img/chap05_009.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL != 3000;
```

<br/>
<br/>
<br/>

##### Q010

- EMP테이블에서 <> 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
  ![select_where](img/chap05_010.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL <> 3000;
```

<br/>
<br/>
<br/>

##### Q011

- EMP테이블에서 ^= 를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
  ![select_where](img/chap05_011.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL ^= 3000;
```

<br/>
<br/>
<br/>

##### Q012

- EMP테이블에서 NOT를를 이용하여 SAL열이 3000이 아닌 행을 조회하시오.
  ![select_where](img/chap05_012.png)

```sql
SELECT *
  FROM EMP
 WHERE NOT SAL = 3000;
```

<br/>
<br/>
<br/>

##### Q013

- EMP테이블에서 OR 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회하시오.
  ![select_where](img/chap05_013.png)

```sql
SELECT *
  FROM EMP
 WHERE JOB = 'MANAGER'
    OR JOB = 'SALESMAN'
    OR JOB = 'CLERK';
```

<br/>
<br/>
<br/>

##### Q014

- EMP테이블에서 IN 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 포함되는 행을 조회하시오.
  ![select_where](img/chap05_014.png)

```sql
SELECT *
  FROM EMP
 WHERE JOB IN ('MANAGER', 'SALESMAN', 'CLERK');
```

<br/>
<br/>
<br/>

##### Q015

- EMP테이블에서 등가연산자(!= , <>, ^=)와 AND 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 <u>포함되지않는</u> 행을 조회하시오.
  ![select_where](img/chap05_015.png)

```sql
SELECT *
  FROM EMP
 WHERE JOB != 'MANAGER'
   AND JOB <> 'SALESMAN'
   AND JOB ^= 'CLERK';
```

<br/>
<br/>
<br/>

##### Q016

- EMP테이블에서 NOT IN 를 이용하여 JOB 열이 'MANAGER' ,'SALESMAN' , 'CLERK' 중 하나라도 <u>포함되지않는</u> 행을 조회하시오.
  ![select_where](img/chap05_016.png)

```sql
SELECT *
  FROM EMP
 WHERE JOB NOT IN ('MANAGER', 'SALESMAN', 'CLERK');
```

<br/>
<br/>
<br/>

##### Q017

- EMP테이블에서 대소비교연산자(<= , >= ) and 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회하시오.
  ![select_where](img/chap05_017.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL >= 2000
   AND SAL <= 3000;
```

<br/>
<br/>
<br/>

##### Q018

- EMP테이블에서 BETWEEN AND 를 이용하여 sal 열이 2000이상 3000이하인인 행을 조회하시오.
  ![select_where](img/chap05_018.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL BETWEEN 2000 AND 3000;
```

<br/>
<br/>
<br/>

##### Q019

- EMP테이블에서 NOT BETWEEN AND 를 이용하여 sal 열이 2000이상 3000이하인 사이 이외의 행을 조회하시오.
  ![select_where](img/chap05_019.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL NOT BETWEEN 2000 AND 3000;
```

<br/>
<br/>
<br/>

##### Q020

- EMP테이블에서 ENAME이 S로 시작하는 행을 조회하시오.
  ![select_where](img/chap05_020.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME LIKE 'S%';
```

<br/>
<br/>
<br/>

##### Q021

- EMP테이블에서 ENAME의 두번째 글자가 L인 행을 조회하시오.
  ![select_where](img/chap05_021.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME LIKE '_L%';
```

<br/>
<br/>
<br/>

##### Q022

- EMP테이블에서 ENAME에 AN이 포함되어 있는 행을 조회하시오.
  ![select_where](img/chap05_022.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME LIKE '%AM%';
```

<br/>
<br/>
<br/>

##### Q023

- EMP테이블에서 ENAME에 AN이 포함되어 있지 않는 행을 조회하시오.
  ![select_where](img/chap05_023.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME NOT LIKE '%AM%';
```

<br/>
<br/>
<br/>

##### Q024

- EMP테이블에서 별칭을 사용하여 다음과 같이 '연간총수입' 행을 조회하시오.
  ![select_where](img/chap05_024.png)

```sql
SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q025 \# `코드확인`

- NULL의 의미
- 비어 있는 상태 , 현재 무슨 값인지 확정 되지 않은 상태, 값 자체가 존재하지 않은 상태
- NULL과 비교연산자(=) 와 같이 사용하면 안됨.
- 어떤값인지 모르므로 작은지, 큰지 모르기 때문에 값이 안나옴.
  ![select_where](img/chap05_025.png)

```sql
SELECT *
  FROM EMP
 WHERE COMM = NULL;
```

<br/>
<br/>
<br/>

##### Q026 \# `코드확인`

- IS NULL
- 상태확인
- NULL 인지 아닌지를 비교하는 용도
  ![select_where](img/chap05_026.png)

```sql
SELECT *
  FROM EMP
 WHERE COMM IS NULL;
```

<br/>
<br/>
<br/>

##### Q027

- EMP테이블에서 직송상관이 있는데이터만 조회하시오
- MGR열이 NULL 이 아닌 행조회회
  ![select_where](img/chap05_027.png)

```sql
SELECT *
  FROM EMP
 WHERE MGR IS NOT NULL;
```

<br/>
<br/>
<br/>

##### Q028 \# `코드확인` - 되는 코드는?

- 있는지 없는지만 판단.
- 다음코드를 해석석하시오.
  ![select_where](img/chap05_028.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL > NULL
   AND COMM IS NULL;
```

<br/>
<br/>
<br/>

##### Q029 \# `코드확인` - 되는 코드는?

- 있는지 없는지만 판단.
- 다음코드를 해석석하시오.
  ![select_where](img/chap05_029.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL > NULL
    OR COMM IS NULL;
```

<br/>
<br/>
<br/>

##### Q030 \# `코드확인`

- UNION을 이용하여 DEPTNO가 10이거나, 20인 데이터의 EMPNO, ENAME, SAL, DEPTNO 열을 조회하시오.
  ![select_where](img/chap05_030.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
UNION

SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 20;

```

<br/>
<br/>
<br/>

##### Q031 \# `코드확인` - 에러가 나는 이유는?

- 열의 갯수가 다를때
  ![select_where](img/chap05_031.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
UNION
SELECT EMPNO, ENAME, SAL
  FROM EMP
 WHERE DEPTNO = 20;
```

<br/>
<br/>
<br/>

##### Q032 \# `코드확인` - 에러가 나는 이유는?

- 자료형이 다를때때
  ![select_where](img/chap05_032.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
UNION
SELECT ENAME, EMPNO, DEPTNO, SAL
  FROM EMP
 WHERE DEPTNO = 20;
```

<br/>
<br/>
<br/>

##### Q033 \# `코드확인` - 동작하는 이유는?

- 출력 열개수와 자료형이 같으므로 동작가능!
  ![select_where](img/chap05_033.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
UNION
SELECT SAL, JOB, DEPTNO, SAL
  FROM EMP
 WHERE DEPTNO = 20;
```

<br/>
<br/>
<br/>

##### Q034 `코드확인`

- UNION과 UNION ALL의 차이는?
  ![select_where](img/chap05_034.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
UNION
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10;
```

<br/>
<br/>
<br/>

##### Q035 `코드확인`

- UNION과 UNION ALL의 차이는?
  ![select_where](img/chap05_035.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10
UNION ALL
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10;
```

<br/>
<br/>
<br/>

##### Q036 `코드확인`

- MINUS의 의미는?
- EMP테이블 전체행을 조회한 첫번째 SELECT문의 결과에서 10번부서에 있는 사원데이터를 제외한 결과값
  ![select_where](img/chap05_036.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
MINUS
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10;
```

<br/>
<br/>
<br/>

##### Q037 `코드확인`

- INTERSECT 의미는? 교집합합
- 두 SELECT 문의 결과값이 같은데이터만 출력
  ![select_where](img/chap05_037.png)

```sql
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
INTERSECT
SELECT EMPNO, ENAME, SAL, DEPTNO
  FROM EMP
 WHERE DEPTNO = 10;
```

<br/>
<br/>
<br/>

#### ■STEP2. <br/>

<br/>
<br/>

##### EX001

- EMP테이블에서 ENAME이 S로 끝나는 사원데이터를 모두 조회하시오
  ![select_where](img/chap05_EX_001.png)

<br/>
<br/>
<br/>

##### EX002

- EMP테이블에서 DEPTNO가 30인 사원 중 직책이(JOB)이 SALESMAN 인 사원의 EMPNO, ENAME, JOB, SAL, DEPTNO를 조회하시오
  ![select_where](img/chap05_EX_002.png)

<br/>
<br/>
<br/>

##### EX003

-- 집합연산자( UNION을 )를 사용하지 않은 방식

- EMP테이블에서 IN 연산자를 이용하여 DEPTNO 가 20 또는 30인 사원의 SAL이 2000 초과인 사원을 조회하시오
  ![select_where](img/chap05_EX_003.png)

-- 집합연산자( UNION을 )를 사용한 방식

- EMP테이블에서 IN 연산자를 이용하여 DEPTNO 가 20 또는 30인 사원의 SAL이 2000 초과인 사원을 조회하시오
  ![select_where](img/chap05_EX_003.png)

<br/>
<br/>
<br/>

##### EX004

- EMP테이블에서 NOT BETWEEN AND 연산자를 사용하지 않고 SAL이 2000이상 3000이하의 값을 가진 데이터만 조회하시오.
  ![select_where](img/chap05_EX_004.png)

<br/>
<br/>
<br/>

##### EX005

- EMP테이블에서 ENAME에 E가 포함되고 DEPTNO가 30인 사원의 급여가 1000~2000사이가 아닌 사원의 ENAME, EMPNO, SAL, DEPTNO 를 조회하시오.
  ![select_where](img/chap05_EX_005.png)

<br/>
<br/>
<br/>

##### EX006

- EMP테이블에서 COMM 이 없고 , MGR은 존재하면 JOB 이 'MANAGER', 'CLERK' 인 사원 중 사원의 이름2번째 글자기 L 이 아닌 사원의 정보를 조회하시오.
  ![select_where](img/chap05_EX_006.png)
