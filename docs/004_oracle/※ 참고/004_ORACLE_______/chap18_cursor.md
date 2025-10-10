####  ■STEP1. BASIC


<br/>
<br/>
<br/>

##### Q001
- SELECT INTO를 사용하여 DEPT테이블의 40번 부서 데이터를 조회하고 각 열의 결과값을 변수에 저장하고 출력하시오.

![select_cursor](img/chap18_001.png)
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

##### Q002
- 하나의 행만 조회되는 경우 번거롭지만, 여러행이 조회되는 행이 여러개일때 커서의 사용이 극대화 됨.
![select_cursor](img/chap18_002.png)
```sql
DECLARE
   -- 커서 데이터를 입력할 변수 선언
   V_DEPT_ROW DEPT%ROWTYPE;

   -- 명시적 커서 선언(Declaration)
   CURSOR c1 IS
      SELECT DEPTNO, DNAME, LOC
        FROM DEPT
       WHERE DEPTNO = 40;

BEGIN
   -- 커서 열기(Open)
   OPEN c1;

   -- 커서로부터 읽어온 데이터 사용(Fetch)
   FETCH c1 INTO V_DEPT_ROW;

   DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || V_DEPT_ROW.DEPTNO);
   DBMS_OUTPUT.PUT_LINE('DNAME : ' || V_DEPT_ROW.DNAME);
   DBMS_OUTPUT.PUT_LINE('LOC : ' || V_DEPT_ROW.LOC);

   -- 커서 닫기(Close)
   CLOSE c1;

END;
/

```
<br/>
<br/>
<br/>

##### Q003
- LOOP와 커서를 이용하여 여러행의 데이터를 커서에 저장해서 사용하기
![select_cursor](img/chap18_003.png)
```sql
DECLARE
   -- 커서 데이터를 입력할 변수 선언
   V_DEPT_ROW DEPT%ROWTYPE;

   -- 명시적 커서 선언(Declaration)
   CURSOR c1 IS
      SELECT DEPTNO, DNAME, LOC
        FROM DEPT;

BEGIN
   -- 커서 열기(Open)
   OPEN c1;

   LOOP
      -- 커서로부터 읽어온 데이터 사용(Fetch)
      FETCH c1 INTO V_DEPT_ROW;

      -- 커서의 모든 행을 읽어오기 위해 %NOTFOUND 속성 지정
      EXIT WHEN c1%NOTFOUND;

      DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || V_DEPT_ROW.DEPTNO
                        || ', DNAME : ' || V_DEPT_ROW.DNAME
                        || ', LOC : ' || V_DEPT_ROW.LOC);
   END LOOP;

   -- 커서 닫기(Close)
   CLOSE c1;

END;
/

```
<br/>
<br/>
<br/>

##### Q004
- 커서와 FOOR LOOP를 사용하여 다음과 같이 출력하시오.
![select_cursor](img/chap18_004.png)
```sql
DECLARE
   -- 명시적 커서 선언(Declaration)
   CURSOR c1 IS
   SELECT DEPTNO, DNAME, LOC
     FROM DEPT;

BEGIN
   -- 커서 FOR LOOP 시작 (자동 Open, Fetch, Close)
   FOR c1_rec IN c1 LOOP
      DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || c1_rec.DEPTNO
                      || ', DNAME : ' || c1_rec.DNAME
                      || ', LOC : ' || c1_rec.LOC);
   END LOOP;

END;
/

SELECT * FROM DEPT_RECORD;

```
<br/>
<br/>
<br/>

##### Q005
- DEPT 테이블의 부서번호가 10 또는 20번일때 파라미터를 사용하는 커서를 다음과 같이 작성하시오.
![select_cursor](img/chap18_005.png)
```sql
DECLARE
   -- 커서 데이터를 입력할 변수 선언
   V_DEPT_ROW DEPT%ROWTYPE;
   -- 명시적 커서 선언(Declaration)
   CURSOR c1 (p_deptno DEPT.DEPTNO%TYPE) IS
      SELECT DEPTNO, DNAME, LOC
        FROM DEPT
       WHERE DEPTNO = p_deptno;
BEGIN
   -- 10번 부서 처리를 위해 커서 사용
   OPEN c1 (10);
      LOOP
         FETCH c1 INTO V_DEPT_ROW;
         EXIT WHEN c1%NOTFOUND;
         DBMS_OUTPUT.PUT_LINE('10번 부서 - DEPTNO : ' || V_DEPT_ROW.DEPTNO
                                     || ', DNAME : ' || V_DEPT_ROW.DNAME
                                     || ', LOC : ' || V_DEPT_ROW.LOC);
      END LOOP;
   CLOSE c1;
   -- 20번 부서 처리를 위해 커서 사용
   OPEN c1 (20);
      LOOP
         FETCH c1 INTO V_DEPT_ROW;
         EXIT WHEN c1%NOTFOUND;
         DBMS_OUTPUT.PUT_LINE('20번 부서 - DEPTNO : ' || V_DEPT_ROW.DEPTNO
                                     || ', DNAME : ' || V_DEPT_ROW.DNAME
                                     || ', LOC : ' || V_DEPT_ROW.LOC);
      END LOOP;
   CLOSE c1;
END;
/

```
<br/>
<br/>
<br/>

##### Q006
- 커서에 사용할 파라미터를 입력받으시오.
![select_cursor](img/chap18_006.png)
```sql
DECLARE
   -- 사용자가 입력한 부서 번호를 저장하는 변수선언
   v_deptno DEPT.DEPTNO%TYPE;
   -- 명시적 커서 선언(Declaration)
   CURSOR c1 (p_deptno DEPT.DEPTNO%TYPE) IS
      SELECT DEPTNO, DNAME, LOC
        FROM DEPT
       WHERE DEPTNO = p_deptno;
BEGIN
   -- INPUT_DEPTNO에 부서 번호 입력받고 v_deptno에 대입
   v_deptno := &INPUT_DEPTNO;
   -- 커서 FOR LOOP 시작. c1 커서에 v_deptno를 대입
   FOR c1_rec IN c1(v_deptno) LOOP
      DBMS_OUTPUT.PUT_LINE('DEPTNO : ' || c1_rec.DEPTNO
                      || ', DNAME : ' || c1_rec.DNAME
                      || ', LOC : ' || c1_rec.LOC);
   END LOOP;
END;
/

```
<br/>
<br/>
<br/>

##### Q007
- 묵시적 커서의 속성을 다음과 같이 사용해 보시오 .
![select_cursor](img/chap18_007.png)
```sql
BEGIN
   UPDATE DEPT SET DNAME='DATABASE'
    WHERE DEPTNO = 50;

   DBMS_OUTPUT.PUT_LINE('갱신된 행의 수 : ' || SQL%ROWCOUNT);

   IF (SQL%FOUND) THEN
      DBMS_OUTPUT.PUT_LINE('갱신 대상 행 존재 여부 : true');
   ELSE
      DBMS_OUTPUT.PUT_LINE('갱신 대상 행 존재 여부 : false');
   END IF;

   IF (SQL%ISOPEN) THEN
      DBMS_OUTPUT.PUT_LINE('커서의 OPEN 여부 : true');
   ELSE
      DBMS_OUTPUT.PUT_LINE('커서의 OPEN 여부 : false');
   END IF;

END;
/

```
<br/>
<br/>
<br/>

##### Q008
-  예외가 발생하는 PL/SQL을 작성하시오.
![select_cursor](img/chap18_008.png)
```sql
DECLARE
   v_wrong NUMBER;
BEGIN
   SELECT DNAME INTO v_wrong
     FROM DEPT
    WHERE DEPTNO = 10;
END;
/

```
<br/>
<br/>
<br/>

##### Q009
- 위의 예제에 예외처리를 하시오.
![select_cursor](img/chap18_009.png)
```sql
DECLARE
   v_wrong NUMBER;
BEGIN
   SELECT DNAME INTO v_wrong
     FROM DEPT
    WHERE DEPTNO = 10;
EXCEPTION
   WHEN VALUE_ERROR THEN
      DBMS_OUTPUT.PUT_LINE('예외 처리 : 수치 또는 값 오류 발생');
END;
/

```
<br/>
<br/>
<br/>

##### Q0010
- 예외발생 후 코드 실행여부를 확인하시오.
![select_cursor](img/chap18_010.png)
```sql
DECLARE
   v_wrong NUMBER;
BEGIN
   SELECT DNAME INTO v_wrong
     FROM DEPT
    WHERE DEPTNO = 10;

   DBMS_OUTPUT.PUT_LINE('예외가 발생하면 다음 문장은 실행되지 않습니다');

EXCEPTION
   WHEN VALUE_ERROR THEN
      DBMS_OUTPUT.PUT_LINE('예외 처리 : 수치 또는 값 오류 발생');
END;
/

```
<br/>
<br/>
<br/>

##### Q0011
- 사전정의된 예외를 사용하시오 .
![select_cursor](img/chap18_011.png)
```sql
DECLARE
   v_wrong NUMBER;
BEGIN
   SELECT DNAME INTO v_wrong
     FROM DEPT
    WHERE DEPTNO = 10;

   DBMS_OUTPUT.PUT_LINE('예외가 발생하면 다음 문장은 실행되지 않습니다');

EXCEPTION
   WHEN TOO_MANY_ROWS THEN
      DBMS_OUTPUT.PUT_LINE('예외 처리 : 요구보다 많은 행 추출 오류 발생');
   WHEN VALUE_ERROR THEN
      DBMS_OUTPUT.PUT_LINE('예외 처리 : 수치 또는 값 오류 발생');
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('예외 처리 : 사전 정의 외 오류 발생');
END;
/

```
<br/>
<br/>
<br/>

##### Q0012
- 오류코드와 오류케시지를 사용하시오 .
![select_cursor](img/chap18_012.png)
```sql
DECLARE
   v_wrong NUMBER;
BEGIN
   SELECT DNAME INTO v_wrong
     FROM DEPT
    WHERE DEPTNO = 10;

   DBMS_OUTPUT.PUT_LINE('예외가 발생하면 다음 문장은 실행되지 않습니다');

EXCEPTION
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('예외 처리 : 사전 정의 외 오류 발생');
      DBMS_OUTPUT.PUT_LINE('SQLCODE : ' || TO_CHAR(SQLCODE));
      DBMS_OUTPUT.PUT_LINE('SQLERRM : ' || SQLERRM);
END;
/

```

<br/>
<br/>
<br/>


####  ■STEP2. EX


<br/>
<br/>
<br/>

##### EX001
- 명시적 커서를 사용하여 EMP 테이블의 전체 데이털르 조회한 후 커서안에 데이터가 다음과 같이 출력되도록 PL/SQL을 작성하시오.
1. LOOP를 사용하는 방식
2. FOR LOOP를 사용하는 방식

![select_cursor](img/chap18__EX_001.png)
```sql
--①
DECLARE
   -- 커서 데이터가 입력될 변수 선언
   V_EMP_ROW EMP%ROWTYPE;
   -- 명시적 커서 선언(Declaration)
   CURSOR c1 IS
      SELECT *
        FROM EMP;
BEGIN
   -- 커서 열기(Open)
   OPEN c1;
   LOOP
       -- 커서로부터 읽어온 데이터 사용(Fetch)
       FETCH c1 INTO V_EMP_ROW;
       -- 커서의 모든 행을 읽어오기 위해 %NOTFOUND 속성지정
       EXIT WHEN c1%NOTFOUND;
       DBMS_OUTPUT.PUT_LINE('EMPNO : '    || V_EMP_ROW.EMPNO
                       || ', ENAME : '    || V_EMP_ROW.ENAME
                       || ', JOB : '      || V_EMP_ROW.JOB
                       || ', SAL : '      || V_EMP_ROW.SAL
                       || ', DEPTNO : '   || V_EMP_ROW.DEPTNO
		       );
   END LOOP;
   -- 커서 닫기(Close)
   CLOSE c1;
END;
/

--②
DECLARE
   -- 명시적 커서 선언(Declaration)
   CURSOR c1 IS
      SELECT *
        FROM EMP;
BEGIN
   -- 커서 FOR LOOP 시작 (자동 Open, Fetch, Close)
   FOR c1_rec IN c1 LOOP
      DBMS_OUTPUT.PUT_LINE('EMPNO : '    || c1_rec.EMPNO
                      || ', ENAME : '    || c1_rec.ENAME
                      || ', JOB : '      || c1_rec.JOB
                      || ', SAL : '      || c1_rec.SAL
                      || ', DEPTNO : '   || c1_rec.DEPTNO);
   END LOOP;
END;
/
```

<br/>
<br/>
<br/>

##### EX002
- PL/SQL 문의 실행중 발생하는 예외를 다음결과와 같이 처리하는 예외처리부를 작성하시오.
![select_cursor](img/chap18__EX_002.png)
```sql
DECLARE
   v_wrong DATE;
BEGIN
   SELECT ENAME INTO v_wrong
     FROM EMP
    WHERE EMPNO = 7369;

    DBMS_OUTPUT.PUT_LINE('예외가 발생하면 다음 문장은 실행되지 않습니다');

EXCEPTION
  ////////////// 예외처리
END;
/
```




```sql
DECLARE
   v_wrong DATE;
BEGIN
   SELECT ENAME INTO v_wrong
     FROM EMP
    WHERE EMPNO = 7369;

    DBMS_OUTPUT.PUT_LINE('예외가 발생하면 다음 문장은 실행되지 않습니다');

EXCEPTION
   WHEN OTHERS THEN
      DBMS_OUTPUT.PUT_LINE('오류가 발생하였습니다.'
                        || TO_CHAR(SYSDATE, '[YYYY"년"MM"월"DD"일" HH24"시"mm"분"SS"초"]'));

      DBMS_OUTPUT.PUT_LINE('SQLCODE : ' || TO_CHAR(SQLCODE));
      DBMS_OUTPUT.PUT_LINE('SQLERRM : ' || SQLERRM);
END;
/

```