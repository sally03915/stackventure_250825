#### ■STEP1. BASIC

<br/>
<br/>
<br/>

##### Q001

- SCOTT계정으로 사용자 생성하시오.
- 권한이 없으므로 에러남.
  ![select_user](img/chap15_001.png)

```sql
CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

```

<br/>
<br/>
<br/>

##### Q002

- SYSTEM계정으로 사용자 생성하시오.
- 성공!
  ![select_user](img/chap15_002.png)

```sql
CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

```

<br/>
<br/>
<br/>

##### Q003

- SYSTEM계정으로 사용자 생성하시오.
- ORCLSTUDY 사용자에게 접속권한 권한을 부여하시오.
  ![select_user](img/chap15_003.png)

```sql
GRANT CREATE SESSION TO ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q004 (SYSTEM계정)

- ORCLSTUDY 사용자 정보(비번)을 변경하시오.
  ![select_user](img/chap15_004.png)

```sql
ALTER USER ORCLSTUDY
IDENTIFIED BY ORCL;

```

<br/>
<br/>
<br/>

##### Q005 (SYSTEM계정)

- ORCLSTUDY 사용자를 삭제하시오.
  ![select_user](img/chap15_005.png)

```sql
DROP USER ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q006 (SYSTEM계정)

- ORCLSTUDY 사용자와 객체 모두를 삭제하시오.
  ![select_user](img/chap15_006.png)

```sql
DROP USER ORCLSTUDY CASCADE;

```

<br/>
<br/>
<br/>

##### Q007

- SYSTEM 계정으로 접속하여
- ORCLSTUDY 사용자, ORACLE 비밀번호로 생성하시오.
  ![select_user](img/chap15_007.png)

```sql
CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

```

<br/>
<br/>
<br/>

##### Q008

- 사용자에게 RESOURCE(여러권한을 하나의 이름을 묶어 권한부여-공간사용가능능) , 데이터베이스 접속권한과, 테이블 생성권한을 부여하시오.
  ![select_user](img/chap15_008.png)

```sql
GRANT RESOURCE, CREATE SESSION, CREATE TABLE TO ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q009

- SCOTT 계정으로 접속하기
- TEMP 테이블을 다음과 같이 만든다.
- ORCLSTUDY 사용자에게 TEMP테이블 권한을 부여하시오.
  ![select_user](img/chap15_009.png)
  ![select_user](img/chap15_009_2.png)

```sql
CONN SCOTT/tiger

CREATE TABLE TEMP(
   COL1 VARCHAR(20),
   COL2 VARCHAR(20)
);

GRANT SELECT ON TEMP TO ORCLSTUDY;

GRANT INSERT ON TEMP TO ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q010

- ORCLSTUDY 유저에게 TEMP테이블의 여러권한(SELECT, INSERT) 을 한번에 부여하시오.
  ![select_user](img/chap15_010.png)

```sql
GRANT SELECT, INSERT ON TEMP
   TO ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q011

- ORCLSTUDY 로 부여받은 권한 사용하기
- INSERT, SELECT
  ![select_user](img/chap15_011_1.png)
  ![select_user](img/chap15_011.png)

```sql
CONN ORCLSTUDY/ORACLE

SELECT * FROM SCOTT.TEMP;

INSERT INTO SCOTT.TEMP VALUES('TEXT', 'FROM ORCLSTUDY');

SELECT * FROM SCOTT.TEMP;

```

<br/>
<br/>
<br/>

##### Q012

- ORCLSTUDY 에 부여된 TEMP 테이블 사용권한을 취소하시오.
  ![select_user](img/chap15_012.png)

```sql
CONN SCOTT/tiger

REVOKE SELECT, INSERT ON TEMP FROM ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q013

- ORCLSTUDY 로 권한 철회된 TEMP 테이블을 조회하시오 (실패! )
  ![select_user](img/chap15_013.png)

```sql
CONN ORCLSTUDY/ORACLE

SELECT * FROM SCOTT.TEMP;

```

<br/>
<br/>
<br/>

##### Q014

- SYSTEM계정으로 ROLESTUDY 롤 생성 및 권한을 부여하시오.
  ![select_user](img/chap15_014.png)

```sql
CONN SYSTEM/oracle

CREATE ROLE ROLESTUDY;

GRANT CONNECT, RESOURCE, CREATE VIEW, CREATE SYNONYM
   TO ROLESTUDY;

```

<br/>
<br/>
<br/>

##### Q015

- ORCLSTUDY 사용자에게 RORSTUDY를 부여하시오.
  ![select_user](img/chap15_015.png)

```sql
GRANT ROLESTUDY TO ORCLSTUDY;

```

<br/>
<br/>
<br/>

##### Q016

- ORCLSTUDY 에 부여된 롤과 권한을 확인하시오.
  ![select_user](img/chap15_016.png)

```sql
CONN ORCLSTUDY/ORACLE

SELECT * FROM USER_SYS_PRIVS;

SELECT * FROM USER_ROLE_PRIVS;
```

<br/>
<br/>
<br/>

#### ■STEP2. EX

<br/>
<br/>
<br/>

##### EX001

- 다음 조건을 만족하는 SQL을 작성하시오.

1. SYSTEM 계정으로 접속하여 PREV_HW 계정을 생성하시오.
2. 비번 : ORCL로 지정
3. 접속권한을 부여하고 PREV_HW 계정으로 접속이 잘되는지 확인 하시오.

![select_user](img/chap15__EX_001.png)

<br/>
<br/>
<br/>

##### EX002

- SCOTT 계정으로 접속하여 위에서 생성한 PREV_HW 계정에 SCOTT 소유의 EMP, DEPT, SALGRADE 테이블에 SELECT 권한을 부여하는 SQL을 작성하시오.
- 권한을 부여했으면 PREV_HW 계정으로 SCOTT의 EMP, DEPT, SALGRADE 테이블이 잘 조회되는지 확인하시오.

![select_user](img/chap15__EX_002.png)

<br/>
<br/>
<br/>

##### EX003

- SCOTT 계정으로 접속하여 PREV_HW 계정에 SALGRADE 테이블의 SELECT 권한을 취소하는 SQL문을 작성하시오.
- 권한의 변경이 완료되면 다음과 같이 PREV_HW 계정으로 SALGRADE 테이블의 조회여부를 확인하시오.

![select_user](img/chap15__EX_003.png)
