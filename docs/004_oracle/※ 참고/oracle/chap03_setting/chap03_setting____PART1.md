##### Q000  SETTING

**■1. 다운로드 및 설치**
![setting](img/setting000_005.png)

1.  홈페이지 회원 가입하기 오라클 공식 홈페이지(http://www.oracle.com/kr)에서 [로그인/회원가입]을 클릭
2. 계정 확인 후 로그인하기
3. 오라클 11g 다운로드
https://www.oracle.com/database/technologies/xe-prior-release-downloads.html

 [11g다운로드](https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)

4. 다운로드한 파일- 64비트 설치

<br/>
<br/>
<br/>

---

**■2. Scott 사용하기**


##### Q000  ORACLE
- oracle 접근하기
```sql
C:\Users\sallyAn> sqlplus
Enter user-name: system
Enter password: 1234
```

##### Q001  계정잠금 풀기
- 연습용 계정으로 접근
```sql
ALTER USER SCOTT
IDENTIFIED BY tiger
ACCOUNT UNLOCK;
```
<br/>
<br/>
<br/>

##### Q002 SCOTT 계정으로 재접속하기
- 연습용 계정으로 접속속
```sql
CONN scott/tiger;
```
##### Q003 emp 테이블 구성확인
- 테이블사용해보기기
```sql
DESC EMP;
```
<br/>
<br/>
<br/>


##### Q004  SQLPLUS 종료하기
```sql
EXIT
```

<br/>
<br/>
<br/>

##### Q005  SQLPLUS 계정으로 접속하기
```sql
SQLPLUS scott/tiger
```



<br/>
<br/>
<br/>

---


■3. 실습



**STEP1)**
![setting](img/setting000_001.png)
오라클 공식 홈페이지(http://www.oracle.com/kr)

**STEP2)**
![setting](img/setting000_002.png)
**STEP3)**
![setting](img/setting000_003.png)
**STEP4)**
![setting](img/setting000_004.png)
**STEP5)**
![setting](img/setting000_005.png)
 [11g다운로드](https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)
(https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)

**STEP6)**
![setting](img/setting000_006.png)
**STEP7)**
![setting](img/setting000_007.png)
**STEP8)**
![setting](img/setting000_008.png)



|||
|-|-|
|**STEP9)** ![setting](img/setting000_009.png)|**STEP10)** ![setting](img/setting000_010.png)|
|**STEP11)** ![setting](img/setting000_011.png)|**STEP12)** ![setting](img/setting000_012.png)|
|**STEP13)** ![setting](img/setting000_013.png)|**STEP14)** ![setting](img/setting000_014.png)|
|**STEP15)** ![setting](img/setting000_015.png)||



**STEP16)**
![setting](img/setting000_016.png)

```sql
C:\Users\sallyAn> sqlplus
Enter user-name: system
Enter password: 1234
```

```sql
Microsoft Windows [Version 10.0.22631.4541]
(c) Microsoft Corporation. All rights reserved.

C:\Users\sallyAn> sqlplus

SQL*Plus: Release 11.2.0.2.0 Production on 금 12월 20 23:49:03 2024

Copyright (c) 1982, 2014, Oracle.  All rights reserved.

Enter user-name: system
Enter password:

Connected to:
Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production

SQL>
```


**STEP17)**
![setting](img/setting000_017.png)
```sql
conn  scott/tiger
```

**STEP18)**
![setting](img/setting000_018.png)

-  scott user가 안나올때
```sql
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER ACCOUNT UNLOCK;
```
> ORA-01918: user 'SCOTT' does not exist


```sql
SQL>
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER ACCOUNT UNLOCK;
ALTER USER SCOTT IDENTIFIED BY TIGER ACCOUNT UNLOCK
           *
ERROR at line 1:
ORA-01918: user 'SCOTT' does not exist
```

**STEP19)**
![setting](img/setting000_019.png)
-  다음경로의 scott.sql 확인
```sql
C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
```



**STEP20)**
![setting](img/setting000_020.png)

- scott 사용설정
```sql
SQL> @C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
SQL> show user;
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER;
```

```sql
SQL> @C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
SQL>
SQL>
SQL> show user;
USER is "SCOTT"
SQL>
SQL>
SQL> ALTER USER SCOTT IDENTIFIED BY TIGER;

User altered.

SQL>
```



<br/>
<br/>
<br/>

---

**■4. SQL Developer 설치 및 실행**
1. SQL Developer 다운로드드
- https://www.oracle.com/kr/downloads/
- 검색 : SQL Developer

2. 설치 및 실행
3. System
  system
  1234


**STEP1)**
![setting](img/setting003_developer_001.png)
**STEP2)**
![setting](img/setting003_developer_002.png)
**STEP3)**
![setting](img/setting003_developer_003.png)
**STEP4)**
![setting](img/setting003_developer_004.png)
**STEP5)**
![setting](img/setting003_developer_005.png)
**STEP6)**
![setting](img/setting003_developer_006.png)
**STEP7)**
![setting](img/setting003_developer_007.png)
**STEP8)**
![setting](img/setting003_developer_008.png)
**STEP9)**
![setting](img/setting003_developer_009.png)




<br/>
<br/>
<br/>

---

**■5. 다음과 같이 SQL문을 접근하시오.
1. 클론코딩을 하면서 SQL문을 익히세요.
2. `UPGRADE` 는  클론코딩 SQL문이 너무 쉽다면 도전!
3. EX를 직접 풀어보면서 SQL문 작성이 가능한지 확인하세요.