####  ■STEP1. BASIC



<br/>
<br/>
<br/>

##### Q001
- EMP 테이블에서 SUM 함수를 이용하여 급여 합계(SAL)를 출력하시오.
![select_group](img/chap07_001.png)
```sql
SELECT SUM(SAL)
  FROM EMP;
```


<br/>
<br/>
<br/>

##### Q002
- EMP 테이블에서 SUM 함수를 이용하여 사원이름과 급여 합계를 출력하시오.  (에러)
![select_group](img/chap07_002.png)
```sql
SELECT ENAME, SUM(SAL)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q003
- EMP 테이블에서 SUM 함수를 이용하여 추가수당(COMM) 합계를 출력하시오.
![select_group](img/chap07_003.png)
```sql
SELECT SUM(COMM)
  FROM EMP;
```
<br/>
<br/>
<br/>

##### Q004
- EMP 테이블에서 SUM  (DISTINCT, ALL)함수를 이용하여 급여 합계를 출력하시오.
![select_group](img/chap07_004.png)
```sql
SELECT SUM(DISTINCT SAL),
       SUM(ALL SAL),
       SUM(SAL)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q005
- EMP 테이블에서 COUNT를 이용하여 데이터의 갯수를 출력하시오.
![select_group](img/chap07_005.png)
```sql
SELECT COUNT(*)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q006
- EMP 테이블에서 COUNT를 이용하여 부서번호가(EMPNO) 30인  데이터의 갯수를 출력하시오.
![select_group](img/chap07_006.png)
```sql
SELECT COUNT(*)
  FROM EMP
 WHERE DEPTNO = 30;
```

<br/>
<br/>
<br/>

##### Q007
- EMP 테이블에서 COUNT ( DISTINCT, ALL) 를 이용하여 데이터의 갯수를 출력하시오.
![select_group](img/chap07_007.png)
```sql
SELECT COUNT(DISTINCT SAL),
       COUNT(ALL SAL),
       COUNT(SAL)
  FROM EMP;
```
<br/>
<br/>
<br/>

##### Q008
- EMP 테이블에서 COUNT를 이용하여 추가수당(COMM) 열의 갯수를  출력하시오.
![select_group](img/chap07_008.png)
```sql
SELECT COUNT(COMM)
  FROM EMP;
```
<br/>
<br/>
<br/>

##### Q009
- EMP 테이블에서 COUNT를 이용하여 추가수당(COMM) 열의 갯수를  출력하시오.
- 위와 실행결과가 같음
- COUNT는 NULL 처리가 들어가 있음.
![select_group](img/chap07_009.png)
```sql
SELECT COUNT(COMM)
  FROM EMP
 WHERE COMM IS NOT NULL;
```
<br/>
<br/>
<br/>

##### Q010
- EMP 테이블에서  MAX를 이용하여 부서번호(DEPTNO)가 10번인 사원들의 최대 급여를 출력하시오.
![select_group](img/chap07_010.png)
```sql
SELECT MAX(SAL)
  FROM EMP
 WHERE DEPTNO = 10;
```
<br/>
<br/>
<br/>

##### Q011
- EMP 테이블에서   부서번호(DEPTNO)가  10번인 사원들의 최소 급여를 출력하시오.
![select_group](img/chap07_011.png)
```sql
SELECT MIN(SAL)
  FROM EMP
 WHERE DEPTNO = 10;
```
<br/>
<br/>
<br/>

##### Q012
- EMP 테이블에서  부서번호가 20인 사원의 입사일(HIREDATE) 중 제일 최근 입사일을   출력하시오.
![select_group](img/chap07_012.png)
```sql
SELECT MAX(HIREDATE)
  FROM EMP
 WHERE DEPTNO = 20;
```
<br/>
<br/>
<br/>

##### Q013
- EMP 테이블에서  부서번호가 20인 사원의 입사일(HIREDATE) 중 제일 오래된 입사일을   출력하시오.
![select_group](img/chap07_013.png)
```sql
SELECT MIN(HIREDATE)
  FROM EMP
 WHERE DEPTNO = 20;
```
<br/>
<br/>
<br/>

##### Q014
- EMP 테이블에서  부서번호가 30인 사원의 평균급여를  출력하시오.
![select_group](img/chap07_014.png)
```sql
SELECT AVG(SAL)
  FROM EMP
 WHERE DEPTNO = 30;
```
<br/>
<br/>
<br/>

##### Q015
- EMP 테이블에서  부서번호가 30인 사원의 DISTINCT로 중복을 제거한 급여 열의 평균급여를   출력하시오.
![select_group](img/chap07_015.png)
```sql
SELECT AVG(DISTINCT SAL)
  FROM EMP
 WHERE DEPTNO = 30;
```



<br/>
<br/>
<br/>

##### Q016
- EMP 테이블에서
  집합연산자(UNION ALL)  를 사용하여 각 부서별 평균급여를   출력하시오.
![select_group](img/chap07_016.png)
```sql
SELECT AVG(SAL), '10' AS DEPTNO FROM EMP WHERE DEPTNO = 10
UNION ALL
SELECT AVG(SAL), '20' AS DEPTNO FROM EMP WHERE DEPTNO = 20
UNION ALL
SELECT AVG(SAL), '30' AS DEPTNO FROM EMP WHERE DEPTNO = 30;
```
<br/>
<br/>
<br/>

##### Q017
- EMP 테이블에서  GROUP BY를 사용하여 부서별 평균급여를  출력하시오.
![select_group](img/chap07_017.png)
```sql
SELECT AVG(SAL), DEPTNO
  FROM EMP
GROUP BY DEPTNO;
```
<br/>
<br/>
<br/>

##### Q018
- EMP 테이블에서  부서번호(DEPTNO) 및 직책별(JOB) 평균급여(SAL)로 정렬한 후    출력하시오.
![select_group](img/chap07_018.png)
```sql
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q019
- EMP 테이블에서  GROUP BY절에 없는 열을  SELECT절에 포함하면 에러가 난다.
![select_group](img/chap07_019.png)
```sql
SELECT ENAME, DEPTNO, AVG(SAL)
  FROM EMP
GROUP BY DEPTNO;

```
<br/>
<br/>
<br/>

##### Q020
- EMP 테이블에서  GROUP BY 와 HAVING 절을이용하여
  각부서의 직책별 평균급여를 구하되 그 평균급여가 2000이상인 그룹만  출력하시오.
![select_group](img/chap07_020.png)
```sql
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
GROUP BY DEPTNO, JOB
HAVING AVG(SAL) >= 2000
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q021
- 다음 코드가 오류나는 이유를 적으시오
- HAVING 절대신 WHERE절ㅇ르 잘못하면 하면 안됨!
![select_group](img/chap07_021.png)
```sql
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
 WHERE AVG(SAL) >= 2000
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q022
- WHERE 절을 사용하지 않고 HAVING절만 사용한 경우우
![select_group](img/chap07_022.png)
```sql
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
GROUP BY DEPTNO, JOB
HAVING AVG(SAL) >= 2000
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q023
- WHERE절과 HAVING절을 모두 사용한경우
![select_group](img/chap07_023.png)
```sql
SELECT DEPTNO, JOB, AVG(SAL)
  FROM EMP
 WHERE SAL <= 3000
GROUP BY DEPTNO, JOB
HAVING AVG(SAL) >= 2000
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q024
- EMP 테이블에서
1. 부서별(큰그룹) 직책(소그룹)의
2. 사원수, 가장 높은 급여, 급여의 합, 평균급여를  출력하시오.
![select_group](img/chap07_024.png)
```sql
SELECT DEPTNO, JOB, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL)
  FROM EMP
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q025
- EMP 테이블에서  ROLLUP 함수를 이용하여
1. 부서별(큰그룹) 직책(소그룹)의
2. 사원수, 가장 높은 급여, 급여의 합, 평균급여를  출력하시오.
![select_group](img/chap07_025.png)
```sql
SELECT DEPTNO, JOB, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL)
  FROM EMP
GROUP BY ROLLUP(DEPTNO, JOB);

```
<br/>
<br/>
<br/>

##### Q026
- EMP 테이블에서  CUBE(DEPTNO, JOB) 함수를 이용하여
1. 부서별(큰그룹) 직책(소그룹)의
2. 사원수, 가장 높은 급여, 급여의 합, 평균급여를  출력하시오.

![select_group](img/chap07_026.png)
```sql
SELECT DEPTNO, JOB, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL)
  FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q027
- EMP 테이블에서
1. DEPTNO를 먼저 그룹화한후   ROLLUP 함수에 JOB을 지정하여
2. 사원수를  출력하시오.
![select_group](img/chap07_027.png)
```sql
SELECT DEPTNO, JOB, COUNT(*)
  FROM EMP
GROUP BY DEPTNO, ROLLUP(JOB);

```
<br/>
<br/>
<br/>

##### Q028
- EMP 테이블에서
1. JOB을 먼저 그룹화한후   ROLLUP 함수에 DEPTNO을 지정하여
2. 사원수를  출력하시오.

![select_group](img/chap07_028.png)
```sql
SELECT DEPTNO, JOB, COUNT(*)
  FROM EMP
GROUP BY JOB, ROLLUP(DEPTNO);

```
<br/>
<br/>
<br/>

##### Q029
- EMP 테이블에서
1. GROUPING SETS (DEPTNO, JOB) 함수를 사용하여
2. 열별 그룹으로 묶어어 결과로 출력하시오.

 출력하시오.
![select_group](img/chap07_029.png)
```sql
SELECT DEPTNO, JOB, COUNT(*)
  FROM EMP
GROUP BY GROUPING SETS(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q030
- EMP 테이블에서 DEPTNO JOB열의 그룹화결과를 GROUPING 함수로  출력하시오.
![select_group](img/chap07_030.png)
```sql
SELECT DEPTNO, JOB, COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL),
       GROUPING(DEPTNO),
       GROUPING(JOB)
  FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q031
- DECODE문으로 GROUPING 함수를 적용하여 결과를 표기하시오오
![select_group](img/chap07_031.png)
```sql
SELECT DECODE(GROUPING(DEPTNO), 1, 'ALL_DEPT', DEPTNO) AS DEPTNO,
       DECODE(GROUPING(JOB), 1, 'ALL_JOB', JOB) AS JOB,
       COUNT(*), MAX(SAL), SUM(SAL), AVG(SAL)
  FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q032
- DEPTNO, JOB을 함께 명시한 GROUPING_ID 함수를 사용하시오.
![select_group](img/chap07_032.png)
```sql
SELECT DEPTNO, JOB, COUNT(*), SUM(SAL),
       GROUPING(DEPTNO),
       GROUPING(JOB),
       GROUPING_ID(DEPTNO, JOB)
  FROM EMP
GROUP BY CUBE(DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q033
- EMP 테이블에서  GROUP BY로 그룹화하여 부서번호와 사원이름을   출력하시오.
![select_group](img/chap07_033.png)
```sql
SELECT DEPTNO, ENAME
FROM EMP
GROUP BY DEPTNO, ENAME;

```
<br/>
<br/>
<br/>

##### Q034
- EMP 테이블에서  부서별 사원이름을 나란히 나열하여   출력하시오.
1. LISTAGG( 나열할 열, 구분자)
2. WITHIN GROUP(ORDER BY 나열할 열의 정렬기준)
![select_group](img/chap07_034.png)
```sql
SELECT DEPTNO,
       LISTAGG(ENAME, ', ')
       WITHIN GROUP(ORDER BY SAL DESC) AS ENAMES
  FROM EMP
GROUP BY DEPTNO;

```
<br/>
<br/>
<br/>

##### Q035 `UPGRADE`
- EMP 테이블에서 부서, 직책별 그룹화하여 최고급여데이터를 출력하시오
![select_group](img/chap07_035.png)
```sql
SELECT DEPTNO, JOB, MAX(SAL)
  FROM EMP
GROUP BY DEPTNO, JOB
ORDER BY DEPTNO, JOB;

```
<br/>
<br/>
<br/>

##### Q036  `UPGRADE`
- EMP 테이블에서  PIVOT함수를 사용하여  직책별* 부서별 최고급여를 2차원 표 형태로  출력하시오
![select_group](img/chap07_036.png)
```sql
SELECT *
  FROM(sql
SELECT DEPTNO, JOB, SAL
         FROM EMP)
PIVOT(MAX(SAL)
      FOR DEPTNO IN (10, 20, 30)
      )
ORDER BY JOB;

```
<br/>
<br/>
<br/>

##### Q037 `UPGRADE`
- EMP 테이블에서  PIVOT함수를 사용하여  부서별*직책책별 최고급여를 2차원 표 형태로  출력하시오
![select_group](img/chap07_037.png)
```sql
SELECT *
  FROM(sql
SELECT JOB, DEPTNO, SAL
         FROM EMP)
PIVOT(MAX(SAL)
     FOR JOB IN ('CLERK' AS CLERK,
                 'SALESMAN' AS SALESMAN,
                 'PRESIDENT' AS PRESIDENT,
                 'MANAGER' AS MANAGER,
                 'ANALYST' AS ANALYST)
     )
ORDER BY DEPTNO;

```
<br/>
<br/>
<br/>

##### Q038 `UPGRADE`
- EMP 테이블에서  DECODE문을 활용하여 PIVOT 함수와 같은 결과를  출력하시오
![select_group](img/chap07_038.png)
```sql
SELECT DEPTNO,
       MAX(DECODE(JOB, 'CLERK', SAL)) AS "CLERK",
       MAX(DECODE(JOB, 'SALESMAN', SAL)) AS "SALESMAN",
       MAX(DECODE(JOB, 'PRESIDENT', SAL)) AS "PRESIDENT",
       MAX(DECODE(JOB, 'MANAGER', SAL)) AS "MANAGER",
       MAX(DECODE(JOB, 'ANALYST', SAL)) AS "ANALYST"
  FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO;

```
<br/>
<br/>
<br/>

##### Q039   `UPGRADE`
- EMP 테이블에서  UNPIVOT 활용하여 열로 구분된 그룹을 행으로  출력하시오
![select_group](img/chap07_039.png)
```sql
SELECT *
  FROM(
SELECT DEPTNO,
              MAX(DECODE(JOB, 'CLERK' , SAL)) AS "CLERK",
              MAX(DECODE(JOB, 'SALESMAN' , SAL)) AS "SALESMAN",
              MAX(DECODE(JOB, 'PRESIDENT', SAL)) AS "PRESIDENT",
              MAX(DECODE(JOB, 'MANAGER' , SAL)) AS "MANAGER",
              MAX(DECODE(JOB, 'ANALYST' , SAL)) AS "ANALYST"
         FROM EMP
       GROUP BY DEPTNO
       ORDER BY DEPTNO)
UNPIVOT(
   SAL FOR JOB IN (CLERK, SALESMAN, PRESIDENT, MANAGER,ANALYST))
ORDER BY DEPTNO, JOB;
```


<br/>
<br/>
<br/>


####  ■STEP2. EX

<br/>
<br/>
<br/>

##### Ex001
- EMP 테이블을 이용하여 다음과 같이 출력하시오.
1. 부서번호(DEPTNO) , 평균급여(AVG_SAL) , 최고급여(MAX_SAL) , 최저급여(MIN_SAL) , 사원수(CNT) 를 조회하시오
2. 평균급여를 출력시 소수점을 제외하고 각 부서번호별로 출력하시오.

![select_group](img/chap07_EX_001.png)
```sql
SELECT DEPTNO,
       TRUNC(AVG(SAL)) AS AVG_SAL,
       MAX(SAL) AS MAX_SAL,
       MIN(SAL) AS MIN_SAL,
       COUNT(*) AS CNT
  FROM EMP
GROUP BY DEPTNO;
```

<br/>
<br/>
<br/>

##### Ex002
- EMP 테이블을 이용하여 다음과 같이 출력하시오.
- 같은직책(JOB)에 종사하는 사원이 3명 이상인 직책과 인원수를 출력하시오.
![select_group](img/chap07_EX_002.png)
```sql
SELECT JOB,
       COUNT(*)
  FROM EMP
GROUP BY JOB
HAVING COUNT(*) >= 3;
```

<br/>
<br/>
<br/>

##### Ex003
- EMP 테이블을 이용하여 다음과 같이 출력하시오.
- 사원들의 입사년도(HIRE_YEAR)를 기준으로 부서별 몇명이 입사했는지 조회하시오.
![select_group](img/chap07_EX_003.png)
```sql
SELECT TO_CHAR(HIREDATE, 'YYYY') AS HIRE_YEAR,
       DEPTNO,
       COUNT(*) AS CNT
  FROM EMP
GROUP BY TO_CHAR(HIREDATE, 'YYYY'), DEPTNO;
```
<br/>
<br/>
<br/>

##### Ex004
- EMP 테이블을 이용하여 다음과 같이 출력하시오.
- 추가수당(COMM)을 받는 사원수와 받지않는 사원수를 조회하시오.
![select_group](img/chap07_EX_004.png)
```sql
SELECT NVL2(COMM, 'O', 'X') AS EXIST_COMM,
       COUNT(*) AS CNT
  FROM EMP
GROUP BY NVL2(COMM, 'O', 'X');
```
<br/>
<br/>
<br/>

##### Ex005
- EMP 테이블을 이용하여 다음과 같이 출력하시오.
1. 각 부서의 입사연도별 사원수, 최고급여, 급여합, 평균급여를 출력하고
2. 각 부서별 소계와 총계를 출력하시오. (ROLLUP)
![select_group](img/chap07_EX_005.png)
```sql
SELECT DEPTNO,
       TO_CHAR(HIREDATE, 'YYYY') AS HIRE_YEAR,
       COUNT(*) AS CNT,
       MAX(SAL) AS MAX_SAL,
       SUM(SAL) AS SUM_SAL,
       AVG(SAL) AS AVG_SAL
  FROM EMP
GROUP BY ROLLUP(DEPTNO, TO_CHAR(HIREDATE, 'YYYY'));
```
