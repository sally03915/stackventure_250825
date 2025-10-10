---
marp: true
theme: uncover
paginate: true
style: |
  @import url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2107@1.0/D2CodingBig.css'); 

  /* 공통 스타일 */
  section {
    font-family: 'D2CodingBig', monospace;
    text-align: center;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 60px;  
    position: relative;
    
  } 
   /*
  section::before {
    content: ":D2BIG";
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) rotate(-30deg);
    font-size: 8em;
    color: #000;
    opacity: 0.03;
    white-space: nowrap;
    pointer-events: none;
    z-index: 0;
    letter-spacing:-25px;
  } */
  section::before {
    content: "";
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) rotate(-45deg); /* 대각선 배치 */
    
    width: 90%;
    height: 90%;
    background-image: url('./images/워터마크_dbdbig.png'); /* 로고 이미지 경로 */
    background-repeat: no-repeat;
    background-size: contain;
    opacity: 0.65; /* 은은하게 보이도록 조정 */
    pointer-events: none;
    z-index: 0;
  }

  section h1 {
    font-size: 1.8em;
    margin-bottom: 20px;
    letter-spacing: 0.5px;
  }

  section.cover h1 {
    font-size: 2.5em;
  }

  section h2 {
    font-size: 1.2em;
    margin-bottom: 10px;
    color: #222;
  }



  section h3 {
    font-size: 1em;
    margin-top: 20px;
    margin-bottom: 10px;
    color: #333;
  }

  pre code {
    font-size: 0.9em;
    max-width: 90%;
    text-align: left;
  }

  /* 공통 cover 스타일 */
  section[class^="cover"] {
    background: linear-gradient(135deg, #feda75, #fa7e1e, #d62976, #962fbf, #4f5bd5);
    position: relative;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    padding: 100px;
    font-size: 2.5em; /* 살짝 키움 */
    color: #fefefe;   /* 더 밝고 세련된 톤 */
    text-shadow: 0 2px 4px rgba(0, 0, 0, 0.3); /* 입체감 추가 */
    line-height: 1.4;
    letter-spacing: 0.8px;
  }

  section[class^="cover"] h1 {
    font-size: 3em;
    font-weight: 700;
    margin-bottom: 20px;
    color: #ffffff;
  }

  section[class^="cover"] h2 {
    font-size: 1.6em;
    font-weight: 400;
    color: #f0f0f0;
    margin-bottom: 10px;
  }
 

  /* 과목별 cover 배경 */
  section.cover-githubai {
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364, #3a6186, #89253e, #ff6e7f);
    color: #fefefe;
  }


  section.cover-html         { background: linear-gradient(135deg, #ffecd2, #fcb69f, #ff9a9e, #fad0c4, #ffe0b2, #ffccbc); color: #222; }
  section.cover-java         { background: linear-gradient(135deg, #f7ff00, #db36a4, #ff6f61, #ff8a65, #ffb74d, #ffd54f); color: #fff; }
  section.cover-mysql        { background: linear-gradient(135deg, #89f7fe, #66a6ff, #4fc3f7, #29b6f6, #0288d1, #01579b); color: #fff; }
  section.cover-python       { background: linear-gradient(135deg, #43cea2, #185a9d, #2b5876, #4e4376, #6a3093, #a044ff); color: #fff; }
  section.cover-jsp          { background: linear-gradient(135deg, #ff9a9e, #fad0c4, #fbc2eb, #a6c1ee, #d4fc79, #96e6a1); color: #222; }
  section.cover-ai           { background: linear-gradient(135deg, #8e2de2, #4a00e0, #6a11cb, #2575fc, #00c6ff, #0072ff); color: #fff; }
  section.cover-docker       { background: linear-gradient(135deg, #00c6ff, #0072ff, #2193b0, #6dd5ed, #b2fefa, #e0f7fa); color: #fff; }
  section.cover-aws          { background: linear-gradient(135deg, #fdfbfb, #ebedee, #d7d2cc, #f0f0f0, #cfd9df, #e2ebf0); color: #333; }
  section.cover-springjpa    { background: linear-gradient(135deg, #00b09b, #96c93d, #56ab2f, #a8e063, #dce35b, #f3f9a7); color: #fff; }
  section.cover-nodereact    { background: linear-gradient(135deg, #ff6a00, #ee0979, #ff4e50, #f9d423, #fbc2eb, #a6c1ee); color: #fff; }
  section.cover-fullstack    { background: linear-gradient(135deg, #f7971e, #ffd200, #ffcc00, #ffb347, #ff7043, #ff5722); color: #222; }
  section.cover-springflutter{ background: linear-gradient(135deg, #a1c4fd, #c2e9fb, #d4fc79, #96e6a1, #fbc2eb, #a6c1ee); color: #222; }

  /* 강조 박스: 현재 챕터 위치 표시용 */
  .chapter-highlight {
    background: linear-gradient(135deg, #1c1c1e, #2c2c2e, #3a3a3c);
    color: #fefefe;
    font-size: 0.95em;
    padding: 12px 50px;
    border-radius: 12px;
    margin: 20px;
    max-width: 120%;
    box-shadow: 0 4px 12px rgba(0,0,0,0.3);
    text-align: left;
  }


  /* 목차 박스 - 밝고 깔끔한 스타일 */
  .track-outline {
    background: linear-gradient(135deg, #ffffff, #f7f9fc);
    color: #333;
    font-size: 1.05em;
    line-height: 1.8;
    padding: 20px;
    border-radius: 12px;
    margin: 40px  10px;
    max-width: 150% ;
    text-align: left;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.08);
  }

  .track-outline strong {
    font-size: 1.1em;
    color: #007acc;
  }

  .track-outline span {
    display: block;
    margin-bottom: 6px;
    color: #007acc;
  }

  /* 현재 챕터 강조 */
  .track-outline .current-chapter {
    background: #e6f7ff;
    border-left: 4px solid #007acc;
    padding: 6px 12px;
    border-radius: 6px;
    font-weight: bold;
    color: #005999;
  }



  table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
  }

  td, th {
    padding: 12px 16px;
    border-bottom: 1px solid #ddd;
  }

  .mark {
    color: #007acc;
    font-weight: bold;
  }  

  code, pre {
    font-size: 1.2em;
    font-weight: bold;
    background-color: #eef;
    padding: 12px 16px;
    border-radius: 6px;
    display: block;
    width: 120%;              /* 전체 너비 사용 */
    white-space: pre-wrap;    /* 줄바꿈 허용 */
    overflow-x: auto;         /* 가로 스크롤 가능 */
    box-sizing: border-box;   /* padding 포함한 너비 계산 */
  }

  pre code {
    display: block;
    width: 100%;               /* 전체 너비 사용 */
    max-width: 800px;          /* 최대 너비 설정 */
    margin: 0 auto;            /* 가운데 정렬 */
    white-space: pre;          /* 줄바꿈 방지 */
    overflow-x: auto;          /* 가로 스크롤 허용 */
    font-size: 1.2em;
    padding: 12px 20px;
    background-color: #f5f5f5;
    border-radius: 8px;
    color: #007acc;
  }


 
  pre {
    max-width: 100%;
    width: fit-content;
  }

  .codeblock {
    background: #f4f4f4;
    color: #007acc;
    padding: 1em;
    border-radius: 8px;
    font-family: 'Courier New', monospace; 
    white-space: pre-wrap; 
    font-size:0.7em;
  }

  /* 일반 섹션 배경 */
  section.orange   { background: linear-gradient(135deg, #fca65e, #f76b1c); color: #fff; }
  section.blue     { background: linear-gradient(135deg, #6fa3ef, #4169E1); color: #ffffcc; }
  section.green    { background: linear-gradient(135deg, #3cb371, #2E8B57); color: #fff; }
  section.purple   { background: linear-gradient(135deg, #b19cd9, #6A5ACD); color: #ffebff; }
  section.red      { background: linear-gradient(135deg, #ff6f61, #DC143C); color: #ffecec; }
  section.aqua     { background-color: #E0FFFF; color: #222; }
  section.thanks   { background-color: #FDF5E6; color: #444; }
  section.ex       { background-color: #96e6a1; color:#333; }
  

---
<!-- _class: cover-mysql -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 03
</h4>
<h1 style="color:#007BFF;">Java Essentials for Beginners</h1>
<h3 style="color:#17A2B8;">기초부터 객체지향까지, 자바의 모든 것</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 1· <em>자바란? · 개발 환경 · 출력</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">쉽고 탄탄하게 배우는 자바 입문서</span><br>
  <span class="fragment" style="color:#495057;">실습 중심으로 개념을 꿰뚫고, 직접 코딩하며 성장해요</span>
</blockquote>
```


---
<!-- _class: cover-mysql -->
<h2 style="font-size:1.6em; color:#555;">📚 Java 기초 트랙 목차</h2>

<div class="track-outline">
  <span class="current-chapter">✅▶ Chapter 1: 자바란? · 개발 환경 · 출력</span>
  <span>▶ Chapter 2: 변수 · 자료형 · 입력</span>
  <span>▶ Chapter 3: 연산자</span>
  <span>▶ Chapter 4: 제어문</span>
  <span>▶ Chapter 5: 배열</span>
  <span>▶ Chapter 6: 메서드</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 자바의 기초 개념을<br/> 실습 중심으로 배우며, 이후 객체지향과 심화 개념으로 확장됩니다.
</p>



---
<!-- _class: orange -->

# Q000  SETTING



---
<!-- _class: aqua -->
**■1. 다운로드 및 설치**
![setting](img/setting000_005.png)



---
<!-- _class: aqua -->
1.  홈페이지 회원 가입하기 오라클 공식 홈페이지(http://www.oracle.com/kr)에서 [로그인/회원가입]을 클릭
2. 계정 확인 후 로그인하기 

3. 오라클 11g 다운로드
https://www.oracle.com/database/technologies/xe-prior-release-downloads.html
  [11g다운로드](https://www.oracle.com/database/technologies/xe-prior-release-downloads.html)

4. 다운로드한 파일- 64비트 설치

 

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