#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

-EMP 테이블에서 ENAME을 대문자, 소문자, 첫글자만 대문자로 조회하시오.
![select_fn](img/chap06_001.png)

```sql
SELECT ENAME, UPPER(ENAME), LOWER(ENAME), INITCAP(ENAME)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q002

-EMP 테이블에서 UPPER를 이용하여 ENAME이 KING인 데이터를 조회하시오.
![select_fn](img/chap06_002.png)

```sql
SELECT *
  FROM EMP
 WHERE UPPER(ENAME) = UPPER('king');
```

<br/>
<br/>
<br/>

##### Q003

-EMP 테이블에서 UPPER를 이용하여 ENAME에 KING인 포함된 데이터를 조회하시오.

- 대소문자 상관없이 KING인 사람을 조회하는 것이 가능해짐.
  ![select_fn](img/chap06_003.png)

```sql
SELECT *
  FROM EMP
 WHERE UPPER(ENAME) LIKE UPPER('%king%');
```

<br/>
<br/>
<br/>

##### Q004

-EMP 테이블에서 LENGTH를 이용하여 ENAME의 문자열 길이를 조회하시오.
![select_fn](img/chap06_004.png)

```sql
SELECT ENAME, LENGTH(ENAME)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q005

-EMP 테이블에서 ENAME의 문자열 길이가 5이상인 데이터를 조회하시오.
![select_fn](img/chap06_005.png)

```sql
SELECT ENAME, LENGTH(ENAME)
  FROM EMP
 WHERE LENGTH(ENAME) >= 5;
```

<br/>
<br/>
<br/>

##### Q006 `코드확인`

- LENGTH('한글'), LENGTHB('한글')
- 문자열길이반환, 문자열 바이트 수 반환환
  ![select_fn](img/chap06_006.png)

```sql
SELECT LENGTH('한글'), LENGTHB('한글')
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q007

- 문자열 일부분을 추출
- SUBSTR( 문자열 , 시작위치, 추출길이)
  ![select_fn](img/chap06_007.png)

```sql
SELECT JOB, SUBSTR(JOB, 1, 2), SUBSTR(JOB, 3, 2), SUBSTR(JOB, 5)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q008 `코드확인`

- -의 의미는?
- C(-5)L(-4)E(-3)R(-2)K(-1)
  ![select_fn](img/chap06_008.png)

```sql
SELECT JOB,
       SUBSTR(JOB, -LENGTH(JOB)),
       SUBSTR(JOB, -LENGTH(JOB), 2),
       SUBSTR(JOB, -3)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q009 `코드확인`

- 특정문자위치 찾기
- INSTR(문자열, 찾을거, 시작위치, 몇번째째)
  ![select_fn](img/chap06_009.png)

```sql
SELECT INSTR('HELLO, ORACLE!', 'L') AS INSTR_1,
       INSTR('HELLO, ORACLE!', 'L', 5) AS INSTR_2,
       INSTR('HELLO, ORACLE!', 'L', 2, 2) AS INSTR_3
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q010 `코드확인`

- EMP테이블에서 INSTR 함수로 사원이름에 S가 있는 데이터를 조회하시오
  ![select_fn](img/chap06_010.png)

```sql
SELECT *
  FROM EMP
 WHERE INSTR(ENAME, 'S') > 0;
```

<br/>
<br/>
<br/>

##### Q011

- EMP테이블에서 LIKE를 이용하여 사원이름에 S가 있는 데이터를 조회하시오
  ![select_fn](img/chap06_011.png)

```sql
SELECT *
  FROM EMP
 WHERE ENAME LIKE '%S%'
```

<br/>
<br/>
<br/>

##### Q012 `코드확인`

- REPLACE를 이용하여 연락처의 -을 공백으로, -을 뺀데이터로 조회하시오오
  ![select_fn](img/chap06_012.png)

```sql
SELECT '010-1234-5678' AS REPLACE_BEFORE,
       REPLACE('010-1234-5678', '-', ' ') AS REPLACE_1,
       REPLACE('010-1234-5678', '-') AS REPLACE_2
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q013 `코드확인`

- LPAD, RPAD를 이용하여 다음과 같이 데이터를 출력하시오오
  ![select_fn](img/chap06_013.png)

```sql
SELECT 'Oracle',
       LPAD('Oracle', 10, '#') AS LPAD_1,
       RPAD('Oracle', 10, '*') AS RPAD_1,
       LPAD('Oracle', 10) AS LPAD_2,
       RPAD('Oracle', 10) AS RPAD_2
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q014

- RPAD를 이용하여 개인정보뒷자리 \*로 출력하시오.
  ![select_fn](img/chap06_014.png)

```sql
SELECT RPAD('971225-', 14, '*') AS RPAD_JMNO,
       RPAD('010-1234-', 13, '*') AS RPAD_PHONE
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q015

- EMP 테이블에서 EMPNO와 ENAME 사이에 :을 넣고 문자열을 연결하시오.
  ![select_fn](img/chap06_015.png)

```sql
SELECT CONCAT(EMPNO, ENAME),
       CONCAT(EMPNO, CONCAT(' : ', ENAME))
  FROM EMP
 WHERE ENAME = 'SCOTT';
```

<br/>
<br/>
<br/>

##### Q016 `코드확인`

- TRIM을 이용하여 다음과 같이 공백을 제거하고 출력하시오.
  ![select_fn](img/chap06_016.png)

```sql
SELECT '[' || TRIM(' _ _Oracle_ _ ') || ']' AS TRIM,
       '[' || TRIM(LEADING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_LEADING,
       '[' || TRIM(TRAILING FROM ' _ _Oracle_ _ ') || ']' AS TRIM_TRAILING,
       '[' || TRIM(BOTH FROM ' _ _Oracle_ _ ') || ']' AS TRIM_BOTH
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q017 `코드확인`

- TRIM을 이용하여 삭제할 문자 삭제후 출력가능능
  ![select_fn](img/chap06_017.png)

```sql
SELECT '[' || TRIM('_' FROM '_ _Oracle_ _') || ']' AS TRIM,
       '[' || TRIM(LEADING '_' FROM '_ _Oracle_ _') || ']' AS TRIM_LEADING,
       '[' || TRIM(TRAILING '_' FROM '_ _Oracle_ _') || ']' AS TRIM_TRAILING,
       '[' || TRIM(BOTH '_' FROM '_ _Oracle_ _') || ']' AS TRIM_BOTH
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q018 `코드확인`

- TRIM, LTRIM, RTRIM 사용하여 문자열 출력하기기
  ![select_fn](img/chap06_018.png)

```sql
SELECT '[' || TRIM(' _Oracle_ ') || ']' AS TRIM,
       '[' || LTRIM(' _Oracle_ ') || ']' AS LTRIM,
       '[' || LTRIM('<_Oracle_>', '_<') || ']' AS LTRIM_2,
       '[' || RTRIM(' _Oracle_ ') || ']' AS RTRIM,
       '[' || RTRIM('<_Oracle_>', '>_') || ']' AS RTRIM_2
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q019

- ROUND를 이용하여 반올림 된 숫자 출력하기
  ![select_fn](img/chap06_019.png)

```sql
SELECT ROUND(1234.5678) AS ROUND,
       ROUND(1234.5678, 0) AS ROUND_0,
       ROUND(1234.5678, 1) AS ROUND_1,
       ROUND(1234.5678, 2) AS ROUND_2,
       ROUND(1234.5678, -1) AS ROUND_MINUS1,
       ROUND(1234.5678, -2) AS ROUND_MINUS2
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q020

- 특정위치에서 버리는 TRUNC 함수수
  ![select_fn](img/chap06_020.png)

```sql
SELECT TRUNC(1234.5678) AS TRUNC,
       TRUNC(1234.5678, 0) AS TRUNC_0,
       TRUNC(1234.5678, 1) AS TRUNC_1,
       TRUNC(1234.5678, 2) AS TRUNC_2,
       TRUNC(1234.5678, -1) AS TRUNC_MINUS1,
       TRUNC(1234.5678, -2) AS TRUNC_MINUS2
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q021

- CEIL : 가장 가까운 큰 정수,
- FLOOR : 가장 가까운 작은 정수 반환
  ![select_fn](img/chap06_021.png)

```sql
SELECT CEIL(3.14),
       FLOOR(3.14),
       CEIL(-3.14),
       FLOOR(-3.14)
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q022

- MOD : 특정 숫자를 나누고 그 `나머지` 출력력
  ![select_fn](img/chap06_022.png)

```sql
SELECT MOD(15, 6),
       MOD(10, 2),
       MOD(11, 2)
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q023

- SYSDATE 함수를 사용하여 날짜 출력
- 하루이전, 이후후
  ![select_fn](img/chap06_023.png)

```sql
SELECT SYSDATE AS NOW,
       SYSDATE-1 AS YESTERDAY,
       SYSDATE+1 AS TOMORROW
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q024

- ADD_MONTHS 3개월 후 날짜짜
  ![select_fn](img/chap06_024.png)

```sql
SELECT SYSDATE,
       ADD_MONTHS(SYSDATE, 3)
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q025

- EMP 테이블에서 입사 10주년이 되는 사원들의 데이터를 출력하시오.
  ![select_fn](img/chap06_025.png)

```sql
SELECT EMPNO, ENAME, HIREDATE,
       ADD_MONTHS(HIREDATE, 120) AS WORK10YEAR
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q026

- EMP 테이블에서 입사 42년 미만인 사원데이터를 출력하시오.
- 12\*42 = 504
- 42년이 지나 안나올 수 도 있음. 안나오면 개월수 늘려서 테스트해볼것
  ![select_fn](img/chap06_026.png)

```sql
SELECT EMPNO, ENAME, HIREDATE, SYSDATE
  FROM EMP
 WHERE ADD_MONTHS(HIREDATE, 504) > SYSDATE;

```

<br/>
<br/>
<br/>

##### Q027

- EMP 테이블에서 HIREDATE와 SYSDATE사이의 개월수를 출력하시오.
  ![select_fn](img/chap06_027.png)

```sql
SELECT EMPNO, ENAME, HIREDATE, SYSDATE,
       MONTHS_BETWEEN(HIREDATE, SYSDATE) AS MONTHS1,
       MONTHS_BETWEEN(SYSDATE, HIREDATE) AS MONTHS2,
       TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE)) AS MONTHS3
FROM EMP;
```

<br/>
<br/>
<br/>

##### Q028

- 돌아오는 요일에 해당하는 날짜와 달의 마지막 날짜를 자도으로 계산산
  ![select_fn](img/chap06_028.png)

```sql
SELECT SYSDATE,
       NEXT_DAY(SYSDATE, '월요일'),
       LAST_DAY(SYSDATE)
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q029

- ROUND를 사용하여 날짜 데이터를 출력하시오.
  ![select_fn](img/chap06_029.png)

```sql
SELECT SYSDATE,
       ROUND(SYSDATE, 'CC') AS FORMAT_CC,
       ROUND(SYSDATE, 'YYYY') AS FORMAT_YYYY,
       ROUND(SYSDATE, 'Q') AS FORMAT_Q,
       ROUND(SYSDATE, 'DDD') AS FORMAT_DDD,
       ROUND(SYSDATE, 'HH') AS FORMAT_HH
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q030

- TRUNC 함수를 사용하여 날짜 데이터를 출력하시오.
  ![select_fn](img/chap06_030.png)

```sql
SELECT SYSDATE,
       TRUNC(SYSDATE, 'CC') AS FORMAT_CC,
       TRUNC(SYSDATE, 'YYYY') AS FORMAT_YYYY,
       TRUNC(SYSDATE, 'Q') AS FORMAT_Q,
       TRUNC(SYSDATE, 'DDD') AS FORMAT_DDD,
       TRUNC(SYSDATE, 'HH') AS FORMAT_HH
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q031

- 숫자와 문자열을 더하여 출력하시오
  ![select_fn](img/chap06_031.png)

```sql
SELECT EMPNO, ENAME, EMPNO + '500'
  FROM EMP
 WHERE ENAME = 'SCOTT';
```

<br/>
<br/>
<br/>

##### Q032

- 문자열과 숫자를 더하여 출력하시오. (에러발생!)
  ![select_fn](img/chap06_032.png)

```sql
SELECT 'ABCD' + EMPNO, EMPNO
  FROM EMP
 WHERE ENAME = 'SCOTT';
```

<br/>
<br/>
<br/>

##### Q033

- SYSDATE 날짜 형식지정하여 출력하시오.
  ![select_fn](img/chap06_033.png)

```sql
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS') AS 현재날짜시간
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q034

- 월과 요일을 다양한 형식으로 출력하시오.
  ![select_fn](img/chap06_034.png)

```sql
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON') AS MON,
       TO_CHAR(SYSDATE, 'MONTH') AS MONTH,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY') AS DY,
       TO_CHAR(SYSDATE, 'DAY') AS DAY
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q035

- 여러 언어로 날짜(월) 출력하시오
  ![select_fn](img/chap06_035.png)

```sql
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MON_KOR,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = JAPANESE') AS MON_JPN,
       TO_CHAR(SYSDATE, 'MON', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MON_ENG,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = KOREAN' ) AS MONTH_KOR,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = JAPANESE') AS MONTH_JPN,
       TO_CHAR(SYSDATE, 'MONTH', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS MONTH_ENG
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q036

- 여러 언어로 날짜(요일일) 출력하시오
  ![select_fn](img/chap06_036.png)

```sql
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'MM') AS MM,
       TO_CHAR(SYSDATE, 'DD') AS DD,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DY_KOR,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DY_JPN,
       TO_CHAR(SYSDATE, 'DY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DY_ENG,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = KOREAN' ) AS DAY_KOR,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = JAPANESE') AS DAY_JPN,
       TO_CHAR(SYSDATE, 'DAY', 'NLS_DATE_LANGUAGE = ENGLISH' ) AS DAY_ENG
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q037

- SYSDATE 시간형식 지정하여 출력하시오.
  ![select_fn](img/chap06_037.png)

```sql
SELECT SYSDATE,
       TO_CHAR(SYSDATE, 'HH24:MI:SS') AS HH24MISS,
       TO_CHAR(SYSDATE, 'HH12:MI:SS AM') AS HHMISS_AM,
       TO_CHAR(SYSDATE, 'HH:MI:SS P.M.') AS HHMISS_PM
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q038

- 여러가지 숫자형식을 사용하여 급여를 출력하시오.
  ![select_fn](img/chap06_038.png)

```sql
SELECT SAL,
       TO_CHAR(SAL, '$999,999') AS SAL_$,
       TO_CHAR(SAL, 'L999,999') AS SAL_L,
       TO_CHAR(SAL, '999,999.00') AS SAL_1,
       TO_CHAR(SAL, '000,999,999.00') AS SAL_2,
       TO_CHAR(SAL, '000999999.99') AS SAL_3,
       TO_CHAR(SAL, '999,999,00') AS SAL_4
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q039

- 문자데이터와 숫자데이터를 연산하여 출력하시오.
  ![select_fn](img/chap06_039.png)

```sql
SELECT 1300 - '1500',
      '1300' + 1500
 FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q040

- 문자데이터끼지 연산하여 출력하시오 (에러러)
  ![select_fn](img/chap06_040.png)

```sql
SELECT '1,300' - '1,500'
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q041

- TO_NUMBER 함수로 연산하여 출력하시오.
  ![select_fn](img/chap06_041.png)

```sql
SELECT TO_NUMBER('1,300', '999,999') - TO_NUMBER('1,500', '999,999')
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q042

- TO_DATE를 이용하여 문자 데이터를 날짜 데이터로 변환하시오.
  ![select_fn](img/chap06_042.png)

```sql
SELECT TO_DATE('2018-07-14', 'YYYY-MM-DD') AS TODATE1,
       TO_DATE('20180714', 'YYYY-MM-DD') AS TODATE2
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q043

- EMP 테이블에서 1981년 6월 1일 이후에 입사한 사원정보를 출력하시오.
  ![select_fn](img/chap06_043.png)

```sql
SELECT *
  FROM EMP
 WHERE HIREDATE > TO_DATE('1981/06/01', 'YYYY/MM/DD');
```

<br/>
<br/>
<br/>

##### Q044

- 여러가지 형식으로 날짜 데이터를 출력하시오.
  ![select_fn](img/chap06_044.png)

```sql
SELECT TO_DATE('49/12/10', 'YY/MM/DD') AS YY_YEAR_49,
       TO_DATE('49/12/10', 'RR/MM/DD') AS RR_YEAR_49,
       TO_DATE('50/12/10', 'YY/MM/DD') AS YY_YEAR_50,
       TO_DATE('50/12/10', 'RR/MM/DD') AS RR_YEAR_50,
       TO_DATE('51/12/10', 'YY/MM/DD') AS YY_YEAR_51,
       TO_DATE('51/12/10', 'RR/MM/DD') AS RR_YEAR_51
  FROM DUAL;
```

<br/>
<br/>
<br/>

##### Q045

- EMP테이블에서 NVL 함수를 사용하여 다음과 같이 출력하시오.
  ![select_fn](img/chap06_045.png)

```sql
SELECT EMPNO, ENAME, SAL, COMM, SAL+COMM,
       NVL(COMM, 0),
       SAL+NVL(COMM, 0)
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q046

- EMP테이블에서 NVL2 함수를 사용하여 다음과 같이 출력하시오.
  ![select_fn](img/chap06_046.png)

```sql
SELECT EMPNO, ENAME, COMM,
       NVL2(COMM, 'O', 'X'),
       NVL2(COMM, SAL*12+COMM, SAL*12) AS ANNSAL
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q047

- EMP테이블에서 DECODE 함수를 사용하여 다음과 같이 출력하시오.
- JOB이 MANAGER 는 급여의 10% 인상한 급여
  SALESMAN 는 급여의 5% 인상한 급여
  ANALYST 는 그대로
  나머지는 3% 인상된 급여
  ![select_fn](img/chap06_047.png)

```sql
SELECT EMPNO, ENAME, JOB, SAL,
       DECODE(JOB,
              'MANAGER' , SAL*1.1,
              'SALESMAN', SAL*1.05,
              'ANALYST' , SAL,
              SAL*1.03) AS UPSAL
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q048

- EMP테이블에서 CASE 함수를 사용하여 다음과 같이 출력하시오.
- JOB이 MANAGER 는 급여의 10% 인상한 급여
  SALESMAN 는 급여의 5% 인상한 급여
  ANALYST 는 그대로
  나머지는 3% 인상된 급여
  ![select_fn](img/chap06_048.png)

```sql
SELECT EMPNO, ENAME, JOB, SAL,
       CASE JOB
          WHEN 'MANAGER' THEN SAL*1.1
          WHEN 'SALESMAN' THEN SAL*1.05
          WHEN 'ANALYST' THEN SAL
          ELSE SAL*1.03
       END AS UPSAL
  FROM EMP;
```

<br/>
<br/>
<br/>

##### Q049

- 기준데이터 없이 조건식으로만 CASE 사용가능
- COMM 값이 NULL 이면 해당사항 없음
  0 이면 수당없음
  0 초과시 초과한 수당을 출력력
  ![select_fn](img/chap06_049.png)

```sql
SELECT EMPNO, ENAME, COMM,
       CASE
          WHEN COMM IS NULL THEN '해당사항 없음'
          WHEN COMM = 0 THEN '수당없음'
          WHEN COMM > 0 THEN '수당 : ' || COMM
       END AS COMM_TEXT
  FROM EMP;
```

<br/>
<br/>
<br/>

#### ■STEP2. <br/>

<br/>
<br/>
<br/>

##### EX001

- EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. EMP 테이블에서 ENAME이 다섯글자 이상이며 여섯글자 미만인 사원을 조회하시오.
2. MASKING_EMPNO 는 EMPNO 앞두자리외 뒷자리를 \*로 출력
3. MASKING_ENAME 는 사원이름의 첫글자만 보여주고 나머지는 \*로 출력

※ 앞자리 추출 - SUBSTR(문자열, 어디에서, 몇개)
※ RPAD - RPAD( 문자열, 몇자리, 채울값)

![select_fn](img/chap06_EX_001.png)

<br/>
<br/>
<br/>

##### EX002

- EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. EMP 테이블에서 사원들의 월 평균 근무일 수는 21.5일
   2 하루 근무시간을 8시간으로 보았을때 사원들의 하루급여(DAY_PAY) 와 시급(TIME_PAY)을 계산하여 결과를 조회하시오.
   ※ 하루급여는 소수점 세번째 자리에서 버리고(TRUNC), 시급은 두번째 소수점에서 반올림(ROUND)하시오
   ![select_fn](img/chap06_EX_002.png)

<br/>
<br/>
<br/>

##### EX003

- EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. EMP테이블에서 사원들은 입사일(HIREDATE)을 기준으로 3개월이 지난 후 첫 월요일에 정직원이 됨
2. 사원들이 정직원이 되는 날짜(R_JOB)를 YYYY-MM-DD 형식으로 오른쪽과 같이 출력하시오.
3. 추가 수당(COMM)이 없는 사원들의 추가수당은 N/A로 출력하시오.

![select_fn](img/chap06_EX_003.png)

<br/>
<br/>
<br/>

##### EX004

- EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. 직속상관의 사원번호(MGR)를 다음과 같은 조건을 기준으로 변환해서 CHG_MGR열에 출력하시오

```sql
1) 직속상관의 사원번호가 존재하지 않을경우 : 00000
2) 직속상관의 사원번호 앞 두자리가 75일 경우 : 5555
3) 직속상관의 사원번호 앞 두자리가 76일 경우 : 6666
4) 직속상관의 사원번호 앞 두자리가 77일 경우 : 7777
5) 직속상관의 사원번호 앞 두자리가 78일 경우 : 8888
6) 그 외 직속상관 사원번호의 경우 : 본래 직속상관의 사원번호 그대로 출력
```

![select_fn](img/chap06_EX_004.png)
