#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- EMP 테이블에서 다음과 같이 출력하시오.

1. 사원이름이 JONES 인 사원의 급여를 출력하시오.

![select_subquery](img/chap09_001.png)

```sql
SELECT SAL
  FROM EMP
 WHERE ENAME = 'JONES';

```

<br/>
<br/>
<br/>

##### Q002

- EMP 테이블에서 다음과 같이 출력하시오.

1. 급여가 2975보다 높은 사원정보를 출력하시오.
   ![select_subquery](img/chap09_002.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL > 2975;

```

<br/>
<br/>
<br/>

##### Q003

- EMP 테이블에서 다음과 같이 출력하시오.

1. JONES의 급여보다
2. 높은급여를 받는 사원정보를 출력하시오.

![select_subquery](img/chap09_003.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL > (
SELECT SAL
                FROM EMP
               WHERE ENAME = 'JONES');

```

<br/>
<br/>
<br/>

##### Q004

- EMP 테이블에서 다음과 같이 출력하시오.

1. SCOTT보다 빨리 입사한 사원목록을 출력하시오.
   ![select_subquery](img/chap09_004.png)

```sql
SELECT *
  FROM EMP
 WHERE HIREDATE < (
SELECT HIREDATE
                     FROM EMP
                    WHERE ENAME = 'SCOTT');

```

<br/>
<br/>
<br/>

##### Q005

- EMP 테이블에서 다음과 같이 출력하시오.

1. 20번부서에 속한 사원 중
2. 전체사원의 평균급여보다 높은 급여를받는 사원정보와 소속부서정보를 출력하시오.
   ![select_subquery](img/chap09_005.png)

```sql
SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO, D.DNAME, D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND E.DEPTNO = 20
   AND E.SAL > (
SELECT AVG(SAL)
                  FROM EMP);

```

<br/>
<br/>
<br/>

##### Q006

- EMP 테이블에서 다음과 같이 출력하시오.

1. 부서번호가 20이거나 30인 사원의 정보를 출력하시오.
   ![select_subquery](img/chap09_006.png)

```sql
SELECT *
  FROM EMP
 WHERE DEPTNO IN (20, 30);

```

<br/>
<br/>
<br/>

##### Q007

- EMP 테이블에서 다음과 같이 출력하시오.

1. 각 부서별 최고급여와 동일한 급열르 받는 사원정보를 출력하시오.
   ![select_subquery](img/chap09_007.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL IN (
SELECT MAX(SAL)
                 FROM EMP
               GROUP BY DEPTNO);

```

<br/>
<br/>
<br/>

##### Q008

- EMP 테이블에서 다음과 같이 출력하시오.

1. 부서번호 별로 최대 급여를 출력하시오.
2. 7번문제가 잘풀렸는지 확인하시오.
   ![select_subquery](img/chap09_008.png)

```sql
SELECT MAX(SAL)
  FROM EMP
GROUP BY DEPTNO;

```

<br/>
<br/>
<br/>

##### Q009

- EMP 테이블에서 다음과 같이 출력하시오.

1. ANY 연산자를 이용하여 다음과같이 출력해보시오
   ![select_subquery](img/chap09_009.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL = ANY (
SELECT MAX(SAL)
                    FROM EMP
                  GROUP BY DEPTNO);

```

<br/>
<br/>
<br/>

##### Q010

- EMP 테이블에서 다음과 같이 출력하시오.

1. ANY 연산자를 이용하여 다음과같이 출력해보시오

![select_subquery](img/chap09_010.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL = SOME (
SELECT MAX(SAL)
                     FROM EMP
                   GROUP BY DEPTNO);

```

<br/>
<br/>
<br/>

##### Q0011

- EMP 테이블에서 다음과 같이 출력하시오.

1. ANY를 이용하여 30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사원정보를 출력하시오.
   ![select_subquery](img/chap09_011.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL < ANY (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30)
                  ORDER BY SAL, EMPNO;

```

<br/>
<br/>
<br/>

##### Q012

- EMP 테이블에서 다음과 같이 출력하시오.

1. 부서번호가 30인 사원들의 급여를 출력하시오.
   ![select_subquery](img/chap09_012.png)

```sql
SELECT SAL
  FROM EMP
 WHERE DEPTNO = 30;

```

<br/>
<br/>
<br/>

##### Q013

- EMP 테이블에서 다음과 같이 출력하시오.

1. ANY를 이용하여 30번 부서 사원들의 최소 급여보다 많은은 급여를 받는 사원정보를 출력하시오.
   ![select_subquery](img/chap09_013.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL > ANY (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30);

```

<br/>
<br/>
<br/>

##### Q014

- EMP 테이블에서 다음과 같이 출력하시오.

1. ALL를 이용하여 30번 부서 사원들의 최소 급여보다 더 적은 급여를 받는 사원정보를 출력하시오.
   ![select_subquery](img/chap09_014.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL < ALL (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30);

```

<br/>
<br/>
<br/>

##### Q015

- EMP 테이블에서 다음과 같이 출력하시오.

1. ALL를 이용하여 30번 부서 사원들의 최대 급여보다 더 많은 급여를 받는 사원정보를 출력하시오.
   ![select_subquery](img/chap09_015.png)

```sql
SELECT *
  FROM EMP
 WHERE SAL > ALL (
SELECT SAL
                    FROM EMP
                   WHERE DEPTNO = 30);

```

<br/>
<br/>
<br/>

##### Q016

- EMP 테이블에서 다음과 같이 출력하시오.

1. EXISTS - 서브쿼리에 결과 값이 하나이상 존재하면 조건식이 모두 TRUE, 아니면 FALSE 됨

- 결과값이 모두 존재히기때문에 EMP 모든행이 출력됨.
  ![select_subquery](img/chap09_016.png)

```sql
SELECT *
  FROM EMP
 WHERE EXISTS (
SELECT DNAME
                 FROM DEPT
                WHERE DEPTNO = 10);

```

<br/>
<br/>
<br/>

##### Q017

- EMP 테이블에서 다음과 같이 출력하시오.

1. EXISTS - 서브쿼리에 결과 값이 하나이상 존재하면 조건식이 모두 TRUE, 아니면 FALSE 됨

- 결과값이 모두 존재하지 않기때문에 아무행도 출력안됨.
  ![select_subquery](img/chap09_017.png)

```sql
SELECT *
  FROM EMP
 WHERE EXISTS (
SELECT DNAME
                 FROM DEPT
                WHERE DEPTNO = 50);

```

<br/>
<br/>
<br/>

##### Q018

- EMP 테이블에서 다음과 같이 출력하시오.

1. 다중열 서브쿼리를 이용하여 WHERE (DEPTNO, SAL) IN ( ... )
   부서별 최대급여를 받는 사원정보를 출력하시오.
   ![select_subquery](img/chap09_018.png)

```sql
SELECT *
  FROM EMP
 WHERE (DEPTNO, SAL) IN (
SELECT DEPTNO, MAX(SAL)
                           FROM EMP
                         GROUP BY DEPTNO);

```

<br/>
<br/>
<br/>

##### Q019

- EMP 테이블에서 다음과 같이 출력하시오.

1. FROM 절에서 사용하는 인라인 뷰를 이용하여
   부서번호가 10인 사용자 정보와 부서정보를 가져와
   FROM (SELECT _ FROM EMP WHERE DEPTNO = 10) E10,
   (SELECT _ FROM DEPT) D
2. EMPNO, ENAME, DEPTNO, DNAME, LOC 를 출력하시오.

![select_subquery](img/chap09_019.png)

```sql
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
  FROM (
SELECT * FROM EMP WHERE DEPTNO = 10) E10,
       (
SELECT * FROM DEPT) D
 WHERE E10.DEPTNO = D.DEPTNO;

```

<br/>
<br/>
<br/>

##### Q020

- WITH
- FROM 절에 명시하는 방식보다 몇십, 몇백줄의 규보가 되었을때 유용하게 사용됨.
  ![select_subquery](img/chap09_020.png)

```sql
WITH
E10 AS (
SELECT * FROM EMP WHERE DEPTNO = 10),
D AS (
SELECT * FROM DEPT)
SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
  FROM E10, D
 WHERE E10.DEPTNO = D.DEPTNO;

```

<br/>
<br/>
<br/>

##### Q0021

- 열에 명시하는 스칼라서브쿼리

1. EMP 테이블의 EMPNO, ENAME, JOB, SAL
2. EMP 테이블의 SAL을 이용하여 SALGRADE에서 등급(GRADE)을 구하고
3. EMP 테이블의 DEPTNO를 이용하여 DEPTNO가 같은 부서명(DNAME)을 구하시오.

![select_subquery](img/chap09_021.png)

```sql
SELECT EMPNO, ENAME, JOB, SAL,
       (
SELECT GRADE
          FROM SALGRADE
         WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE,
       DEPTNO,
      (
SELECT DNAME
         FROM DEPT
        WHERE E.DEPTNO = DEPT.DEPTNO) AS DNAME
FROM EMP E;
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001

- EMP 테이블에서 다음과 같이 출력하시오.

1. 전체 사원 중 ALLEN과 같은 직책(JOB)인 사원들의 사원정보, 부서정보를 다음과 같이 출력하시오.
   ![select_subquery](img/chap09__EX_001.png)

<br/>
<br/>
<br/>

##### EX002

- EMP 테이블에서 다음과 같이 출력하시오.

1. 전체 사원의 평균급여(SAL) 보다 높은 급여를 받는 사원들의 사원정보, 부서정보, 급여등급정보를 출력하시오.
2. 급여가 많은 순으로 정렬하되 급여가 같은경우에는 사원번호를 기준으로 오름차순으로 정렬
   ![select_subquery](img/chap09__EX_002.png)

<br/>
<br/>
<br/>

##### EX003

- EMP 테이블에서 다음과 같이 출력하시오.

1. 10번부서에서 근무하는 사원 중 30번부서에는 존재하지 않는 직책을 가진 사원들의 사원정보, 부서정보를 다음과 같이 출력하는 SQL문을 작성하시오.
   ![select_subquery](img/chap09__EX_003.png)

<br/>
<br/>
<br/>

##### EX004

- EMP 테이블에서 다음과 같이 출력하시오.

1. 직책이 SALESMAN인 사람들의 최고급여보다 높은 급여를 급여를 받는 사원들의 사원정보, 급여등급정보를 다음과 같이 출력하시오.
2. 다중행 함수 사용하지 않는 방법, 다중행 함수 사용하는 방법 2가지로 작성하시오.
3. 사원번호를 기준으로 오름차순으로 정렬하시오.

##### 다중행 함수 사용하지 않는 방법

![select_subquery](img/chap09__EX_004.png)

##### 다중행 함수 사용하는 방법

![select_subquery](img/chap09__EX_004.png)
