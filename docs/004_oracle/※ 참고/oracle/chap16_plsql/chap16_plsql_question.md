#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- 다음과 같이 heLLO PL/SQL을 출력하시오.

![select_plsql](img/chap16_001.png)

```sql
SET SERVEROUTPUT ON; -- 실행 결과를 화면에 출력

BEGIN
   DBMS_OUTPUT.PUT_LINE('Hello, PL/SQL!');
END;
/

```

<br/>
<br/>
<br/>

##### Q002

1. 다음과 같이 두변수를 선언하시오.
   V_EMPNO NUMBER(4)
   V_ENAME VARCHAR2(10)
2. V_EMPNO 에 기본값 7788 대입
   V_ENAME 에 SCOTT 대입
3. 두 변수를 출력하시오.
4. V_EMPNO 출력을 한줄주석다시오.

![select_plsql](img/chap16_002.png)

```sql
DECLARE
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
   -- DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
END;
/

```

<br/>
<br/>
<br/>

##### Q003

여러줄 주석 /\* \*/ 을 이용하여 출력을 주석처리하시오.

![select_plsql](img/chap16_003.png)

```sql
DECLARE
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
/*
   DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
*/
END;
/

```

<br/>
<br/>
<br/>

##### Q004

- 변수 선언 및 변수 값을 출력하시오.

1. 다음과 같이 두변수를 선언하시오.
   V_EMPNO NUMBER(4)
   V_ENAME VARCHAR2(10)
2. V_EMPNO 에 기본값 7788 대입
   V_ENAME 에 SCOTT 대입
3. 두 변수를 출력하시오.

![select_plsql](img/chap16_004.png)

```sql
DECLARE
   V_EMPNO NUMBER(4) := 7788;
   V_ENAME VARCHAR2(10);
BEGIN
   V_ENAME := 'SCOTT';
   DBMS_OUTPUT.PUT_LINE('V_EMPNO : ' || V_EMPNO);
   DBMS_OUTPUT.PUT_LINE('V_ENAME : ' || V_ENAME);
END;
/

```

<br/>
<br/>
<br/>

##### Q005

1. CONSTANT 를 이용하여 상수 V_TAX 를 만들고 3을 대입하시오.
2. 상수를 출력하시오.

![select_plsql](img/chap16_005.png)

```sql
DECLARE
   V_TAX CONSTANT NUMBER(1) := 3;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_TEX : ' || V_TAX);
END;
/

```

<br/>
<br/>
<br/>

##### Q006

1. 변수 V_DEPTNO 를 생성시 DEFAULT값 10을 설정하시오.
2. 변수를 출력하시오.

![select_plsql](img/chap16_006.png)

```sql
DECLARE
   V_DEPTNO NUMBER(2) DEFAULT 10;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

```

<br/>
<br/>
<br/>

##### Q007

1. 변수 V_DEPTNO 를 생성시 NOT NULL을 설정, 10 대입 하시오.
2. 변수를 출력하시오.

![select_plsql](img/chap16_007.png)

```sql
DECLARE
   V_DEPTNO NUMBER(2) NOT NULL := 10;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

```

<br/>
<br/>
<br/>

##### Q008

1. 변수 V_DEPTNO 를 생성시
   NOT NULL을 설정, 기본값 10 대입 하시오.
2. 변수를 출력하시오.

![select_plsql](img/chap16_008.png)

```sql
DECLARE
   V_DEPTNO NUMBER(2) NOT NULL DEFAULT 10;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

```

<br/>
<br/>
<br/>

##### Q009

- 참조열형 변수 (DEPT 테이블의 DEPTNO) 에 값 50을 대입후 출력하시오.
  ![select_plsql](img/chap16_009.png)

```sql
DECLARE
   V_DEPTNO DEPT.DEPTNO%TYPE := 50;
BEGIN
   DBMS_OUTPUT.PUT_LINE('V_DEPTNO : ' || V_DEPTNO);
END;
/

```

<br/>
<br/>
<br/>

##### Q010

1. 참조형(행)의 변수 V_DEPT_ROW 를 선언하시오.
2. SELECT DEPTNO, DNAME, LOC
   FROM DEPT
   WHERE DEPTNO = 40;
   구문을 실행한 후 1번 변수에 값을 대입하시오.
3. 다음과 같이 출력하시오.

![select_plsql](img/chap16_010.png)

```sql
DECLARE
   V_DEPT_ROW DEPT%ROWTYPE;
BEGIN
   SELECT DEPTNO, DNAME, LOC INTO V_DEPT_ROW
     FROM DEPT
    WHERE DEPTNO = 40;
   DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || V_DEPT_ROW.DEPTNO);
   DBMS_OUTPUT.PUT_LINE('DNAME : ' || V_DEPT_ROW.DNAME);
   DBMS_OUTPUT.PUT_LINE('LOC : ' || V_DEPT_ROW.LOC);
END;
/

```

<br/>
<br/>
<br/>

##### Q011

1. V_NUMBER 변수 생성 및 13값을 대입하시오.
2. 변수에 입력한 값이 홀수 인지 알아보는 조건 제어문을 추가하시오.
   ![select_plsql](img/chap16_011.png)

```sql
DECLARE
   V_NUMBER NUMBER := 13;
BEGIN
   IF MOD(V_NUMBER, 2) = 1 THEN
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 홀수입니다!');
   END IF;
END;
/

```

<br/>
<br/>
<br/>

##### Q012

1. V_NUMBER 변수 생성 및 14값을 대입하시오.
2. 변수에 입력한 값이 짝수인지 알아보는 조건 제어문을 추가하시오.
   ![select_plsql](img/chap16_012.png)

```sql
DECLARE
   V_NUMBER NUMBER := 14;
BEGIN
   IF MOD(V_NUMBER, 2) = 1 THEN
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 홀수입니다!');
   END IF;
END;
/

```

<br/>
<br/>
<br/>

##### Q013

1. V_NUMBER 변수 생성 및 14값을 대입하시오.
2. 변수에 입력한 값이 짝수인지 홀수인지 알아보는 조건 제어문을 추가하시오.
   ![select_plsql](img/chap16_013.png)

```sql
DECLARE
   V_NUMBER NUMBER := 14;
BEGIN
   IF MOD(V_NUMBER, 2) = 1 THEN
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 홀수입니다!');
   ELSE
      DBMS_OUTPUT.PUT_LINE('V_NUMBER는 짝수입니다!');
   END IF;
END;
/

```

<br/>
<br/>
<br/>

##### Q014

1. V_SCORE 변수 생성 및 87값을 대입하시오.
2. IF THEN ELSEIF 를 이용하여
   입력한 점수가 어느학점인지 출력하시오.
   90점이상 - A학점
   80점이상 - B학점
   70점이상 - C학점
   60점이상 - D학점 - F학점

![select_plsql](img/chap16_014.png)

```sql
DECLARE
   V_SCORE NUMBER := 87;
BEGIN
   IF V_SCORE >= 90 THEN
      DBMS_OUTPUT.PUT_LINE('A학점');
   ELSIF V_SCORE >= 80 THEN
      DBMS_OUTPUT.PUT_LINE('B학점');
   ELSIF V_SCORE >= 70 THEN
      DBMS_OUTPUT.PUT_LINE('C학점');
   ELSIF V_SCORE >= 60 THEN
      DBMS_OUTPUT.PUT_LINE('D학점');
   ELSE
      DBMS_OUTPUT.PUT_LINE('F학점');
   END IF;
END;
/

```

<br/>
<br/>
<br/>

##### Q015

1. V_SCORE 변수 생성 및 87값을 대입하시오.
2. CASE 를 이용하여
   입력한 점수가 어느학점인지 출력하시오.
   90점이상 - A학점
   80점이상 - B학점
   70점이상 - C학점
   60점이상 - D학점 - F학점
   ![select_plsql](img/chap16_015.png)

```sql
DECLARE
   V_SCORE NUMBER := 87;
BEGIN
   CASE TRUNC(V_SCORE/10)
      WHEN 10 THEN DBMS_OUTPUT.PUT_LINE('A학점');
      WHEN 9 THEN DBMS_OUTPUT.PUT_LINE('A학점');
      WHEN 8 THEN DBMS_OUTPUT.PUT_LINE('B학점');
      WHEN 7 THEN DBMS_OUTPUT.PUT_LINE('C학점');
      WHEN 6 THEN DBMS_OUTPUT.PUT_LINE('D학점');
      ELSE DBMS_OUTPUT.PUT_LINE('F학점');
   END CASE;
END;
/

```

<br/>
<br/>
<br/>

##### Q016

1. V_SCORE 변수 생성 및 87값을 대입하시오.
2. 검색CASE 를 이용하여
   입력한 점수가 어느학점인지 출력하시오.
   90점이상 - A학점
   80점이상 - B학점
   70점이상 - C학점
   60점이상 - D학점 - F학점
   ![select_plsql](img/chap16_016.png)

```sql
DECLARE
   V_SCORE NUMBER := 87;
BEGIN
   CASE
      WHEN V_SCORE >= 90 THEN DBMS_OUTPUT.PUT_LINE('A학점');
      WHEN V_SCORE >= 80 THEN DBMS_OUTPUT.PUT_LINE('B학점');
      WHEN V_SCORE >= 70 THEN DBMS_OUTPUT.PUT_LINE('C학점');
      WHEN V_SCORE >= 60 THEN DBMS_OUTPUT.PUT_LINE('D학점');
      ELSE DBMS_OUTPUT.PUT_LINE('F학점');
   END CASE;
END;
/

```

<br/>
<br/>
<br/>

##### Q017

- 0~4까지 다음과 같이 출력하는 기본 LOOP를 사용하시오.
  ![select_plsql](img/chap16_017.png)

```sql
DECLARE
   V_NUM NUMBER := 0;
BEGIN
   LOOP
      DBMS_OUTPUT.PUT_LINE('현재 V_NUM : ' || V_NUM);
      V_NUM := V_NUM + 1;
      EXIT WHEN V_NUM > 4;
   END LOOP;
END;
/

```

<br/>
<br/>
<br/>

##### Q018

- 0~4까지 다음과 같이 출력하는 WHILE LOOP를 사용하시오.

![select_plsql](img/chap16_018.png)

```sql
DECLARE
   V_NUM NUMBER := 0;
BEGIN
   WHILE V_NUM < 5 LOOP
      DBMS_OUTPUT.PUT_LINE('현재 V_NUM : ' || V_NUM);
      V_NUM := V_NUM + 1;
   END LOOP;
END;
/

```

<br/>
<br/>
<br/>

##### Q019

- FOR IN LOOG를 이용하여 0~4까지 출력하시오.
  ![select_plsql](img/chap16_019.png)

```sql
BEGIN
   FOR i IN 0..4 LOOP
      DBMS_OUTPUT.PUT_LINE('현재 i의 값 : ' || i);
   END LOOP;
END;
/

```

<br/>
<br/>
<br/>

##### Q020

- FOR IN LOOG를 이용하여 4~0까지 출력하시오.
  ![select_plsql](img/chap16_020.png)

```sql
BEGIN
   FOR i IN REVERSE 0..4 LOOP
      DBMS_OUTPUT.PUT_LINE('현재 i의 값 : ' || i);
      END LOOP;
END;
/

```

<br/>
<br/>
<br/>

##### Q021

- FOR IN LOOG안에 CONTINUE를 이용하여 0,2,4를 다음과 같이 출력하시오.
  ![select_plsql](img/chap16_021.png)

```sql
BEGIN
   FOR i IN 0..4 LOOP
      CONTINUE WHEN MOD(i, 2) = 1;
      DBMS_OUTPUT.PUT_LINE('현재 i의 값 : ' || i);
   END LOOP;
END;
/
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001

- 숫자 1~10까지 숫자 중 홀수만 출력하는 PL/SQL 프로그램을 작성하시오.

![select_plsql](img/chap16__EX_001.png)

<br/>
<br/>
<br/>

##### EX002

1.  DEPT 테이블의 DEPTNO와 자료형이 같은변수 V_DEPTNO를 선언하시오.
2.  V_DEPTNO 변수값에 10,20,30,40을 대입했을때 다음과 같이 부서이름을 출력하는 프로그램을 작성하시오.
3.  부서번호가 10,20,30,40 이 아니라면 N/A로 출력합니다.

![select_plsql](img/chap16__EX_002.png)
