#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- EMP, DEPT 테이블을 이용하여
  FROM 절에 여러 테이블을 선언해해 다음과 같이 출력하시오
  ![select_join](img/chap08_001.png)

```sql
SELECT *
  FROM EMP, DEPT
ORDER BY EMPNO;

```

<br/>
<br/>
<br/>

##### Q002

- EMP, DEPT 테이블을 이용하여
  EMP의 DEPTNO와 DEPT테이블의 DEPTNO가 같은 데이터를 다음과 같이 출력하시오
  ![select_join](img/chap08_002.png)

```sql
SELECT *
  FROM EMP, DEPT
 WHERE EMP.DEPTNO = DEPT.DEPTNO
ORDER BY EMPNO;

```

<br/>
<br/>
<br/>

##### Q003

- EMP, DEPT 테이블을 이용하여
  FROM 절에 EMP 테이블의 별칭은 E, DEPT 테이블의 별칭은 D로 다음과 같이 출력하시오
  ![select_join](img/chap08_003.png)

```sql
SELECT *
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
ORDER BY EMPNO;

```

<br/>
<br/>
<br/>

##### Q004

- EMP, DEPT 테이블을 이용하여
  두테이블에 부서번호가 같은 열의이름이 포함되었을때 다음과 같이 출력하시오 (에러발생)
  ![select_join](img/chap08_004.png)

```sql
SELECT EMPNO, ENAME, DEPTNO, DNAME, LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO;

```

<br/>
<br/>
<br/>

##### Q005

- EMP, DEPT 테이블을 이용하여
  열 이름에 각각의 테이블 이름도 함께 명시시 다음과 같이 출력하시오 ( 위의 문제 해결 )
  ![select_join](img/chap08_005.png)

```sql
SELECT E.EMPNO, E.ENAME, D.DEPTNO, D.DNAME, D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
ORDER BY D.DEPTNO, E.EMPNO;

```

<br/>
<br/>
<br/>

##### Q006

- EMP, DEPT 테이블을 이용하여
  급여가 3000이상인 사원의 사원번호, 이름, 급여, 근무부서를 다음과 같이 출력하시오

![select_join](img/chap08_006.png)

```sql
SELECT E.EMPNO, E.ENAME, E.SAL, D.DEPTNO, D.DNAME, D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND SAL >= 3000;

```

<br/>
<br/>
<br/>

##### Q007

- EMP, SALGRADE 테이블을 이용하여
  유저 정보, 급여등급 , 그 등급의 최소급여와 최대급여를 다음과 같이 출력하시오
  ![select_join](img/chap08_007.png)

```sql
select * from emp
```

```sql
select * from salgrade
```

```sql
SELECT *
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;

```

<br/>
<br/>
<br/>

##### Q008

- EMP테이블을 2번 이용하여
  사원정보(EMPNO, ENAME, MGR) 와 직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
  ![select_join](img/chap08_008.png)

```sql
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR = E2.EMPNO;

```

<br/>
<br/>
<br/>

##### Q009

- EMP테이블을 2번 이용하여

1.  사원정보(EMPNO, ENAME, MGR) 와 직속상관(EMPNO, ENAME)의 사원번호를 다음과 같이 출력하시오
2.  직속상관이 없는 사원의 정보도 출력하시오오
    ![select_join](img/chap08_009.png)

```sql
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR = E2.EMPNO(+)
ORDER BY E1.EMPNO;

```

<br/>
<br/>
<br/>

##### Q010

- (+)의 위치를 바꿔서 출력해보고 다음이 의미하는 바를 적으시오오
  ![select_join](img/chap08_010.png)

```sql
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1, EMP E2
 WHERE E1.MGR(+) = E2.EMPNO
ORDER BY E1.EMPNO;

```

<br/>
<br/>
<br/>

##### Q011 표준문법 (NATURAL JOIN)

- EMP , DEPT 테이블 이용하여
  EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오

1.  NATURAL JOIN

- 알아서 두 테이블의 이름과 자료형이 같은 열을 찾은 후
- 그 열을 기준으로 등가조인을 해주는 방식

![select_join](img/chap08_011.png)

```sql
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM,
       DEPTNO, D.DNAME, D.LOC
  FROM EMP E NATURAL JOIN DEPT D
ORDER BY DEPTNO, E.EMPNO;

```

<br/>
<br/>
<br/>

##### Q012 표준문법 (JOIN USING)

- EMP , DEPT 테이블 이용하여
  EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오

1.  JOIN USING

- USING에 조인기준열 명시
- 그 열을 기준으로 등가조인을 해주는 방식

![select_join](img/chap08_012.png)

```sql
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM,
       DEPTNO, D.DNAME, D.LOC
  FROM EMP E JOIN DEPT D USING (DEPTNO)
 WHERE SAL >= 3000
ORDER BY DEPTNO, E.EMPNO;

```

<br/>
<br/>
<br/>

##### Q013 표준문법 (JOIN ON)

- EMP , DEPT 테이블 이용하여
  EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM를 다음과 같이 출력하시오

1.  JOIN ON

- ON에 조인기준열 명시
- 그 열을 기준으로 등가조인을 해주는 방식
  ![select_join](img/chap08_013.png)

```sql
SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM,
       E.DEPTNO,
       D.DNAME, D.LOC
  FROM EMP E JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
 WHERE SAL <= 3000
ORDER BY E.DEPTNO, EMPNO;

```

<br/>
<br/>
<br/>

##### Q014 표준문법 (LEFT OUTER JOIN )

- EMP , DEPT 테이블 이용하여 다음과 같이 출력하시오

1.  LEFT OUTER JOIN

- 왼쪽 외부조인을 기준으로 NULL보장

![select_join](img/chap08_014.png)

```sql
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1 LEFT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO;

```

<br/>
<br/>
<br/>

##### Q015 표준문법 (RIGHT OUTER JOIN )

- EMP , DEPT 테이블 이용하여 다음과 같이 출력하시오

1.  RIGHT OUTER JOIN

- 오른른쪽 외부조인을 기준으로 NULL보장

![select_join](img/chap08_015.png)

```sql
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1 RIGHT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO, MGR_EMPNO;

```

<br/>
<br/>
<br/>

##### Q016 표준문법 (FULL OUTER JOIN )

- EMP , DEPT 테이블 이용하여 다음과 같이 출력하시오

1.  FULL OUTER JOIN

- 양쪽모두두 외부조인을 기준으로 NULL보장

![select_join](img/chap08_016.png)

```sql
SELECT E1.EMPNO, E1.ENAME, E1.MGR,
       E2.EMPNO AS MGR_EMPNO,
       E2.ENAME AS MGR_ENAME
  FROM EMP E1 FULL OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
ORDER BY E1.EMPNO;
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001

- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.

1. 급여(SAL)이 2000초과인 사원들의 부서정보, 사원정보를 출력하시오.

##### SQL-99 이전 방식

![select_join](img/chap08__EX_001.png)

##### SQL-99방식

![select_join](img/chap08__EX_001.png)

<br/>
<br/>
<br/>

##### EX002

- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.

1. 각 부서별 평균급여, 최대급여, 사원수를 출력하시오.

##### SQL-99 이전 방식

![select_join](img/chap08__EX_002.png)

##### SQL-99 방식

![select_join](img/chap08__EX_002.png)

<br/>
<br/>
<br/>

##### EX003

- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.

1. 모든 부서정보와 사원정보를 부서번호, 사원이름 순으로 정렬해 출력하시오.

##### SQL-99 이전 방식

![select_join](img/chap08__EX_003.png)

##### SQL-99 방식

![select_join](img/chap08__EX_003.png)

<br/>
<br/>
<br/>

##### EX004

- EMP, DEPT 테이블을 이용하여
  SQL-99 이전 방식다음 , SQL-99방식 두가지 방식으로 다음과 같이 출력하시오.

1. 모든 부서정보와 사원정보, 급여등급정보, 각사원의 직속상관의 정보를
2. 부서번호, 사원번호 순서로 정렬해 출력하시오.

##### SQL-99 이전 방식

![select_join](img/chap08__EX_004.png)

##### SQL-99방식

![select_join](img/chap08__EX_004.png)
