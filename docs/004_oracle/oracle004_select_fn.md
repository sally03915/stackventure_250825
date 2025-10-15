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
  section.cover-oracle        { background: linear-gradient(135deg, #89f7fe, #66a6ff, #4fc3f7, #29b6f6, #0288d1, #01579b); color: #fff; }
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
<!-- _class: cover-oracle -->
<h4 style="color:#6C757D;">
  <span style="color:#ff6e7f; text-shadow: 0 0 6px rgba(255,110,127,0.6); font-weight:bold;">🧠</span>
  CodeCraft Series · Track 02
</h4>
<h1 style="color:#007BFF;">Oracle Fundamentals</h1>
<h3 style="color:#17A2B8;">SQL부터 PL/SQL까지, 오라클의 핵심을 잡다</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 1 · <em>오라클 환경 설정 · 기본 SELECT</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">실무에 바로 적용 가능한 오라클 입문서</span><br>
  <span class="fragment" style="color:#495057;">데이터를 다루는 힘, SQL로 시작해요</span>
</blockquote>


---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
  <strong style="color:#FF6E7F;">PART 1 · SQL 기본</strong>
<div class="track-outline">
  <span>▶ Chapter 01: oracle_setting</span>
  <span>▶ Chapter 02: select_basic</span>
  <span>▶ Chapter 03: select_where</span>
  <span class="current-chapter">✅▶ Chapter 04: select_fn</span>
  <span>▶ Chapter 05: select_group</span>
  <span>▶ Chapter 06: select_join</span>
  <span>▶ Chapter 07: select_subquery</span>
</div>


---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
 <strong style="color:#FF6E7F;">PART 2 · 데이터 조작 및 객체</strong> 
<div class="track-outline"> 
  <span>▶ Chapter 08: update_delete</span>
  <span>▶ Chapter 09: transaction</span>
  <span>▶ Chapter 10: ddl</span>
  <span>▶ Chapter 11: object</span>
  <span>▶ Chapter 12: constraint</span>
  <span>▶ Chapter 13: user</span>
</div>


---
<!-- _class: cover-oracle -->
<h2 style="font-size:1.6em; color:#555;">📚 Oracle 트랙 목차</h2>
<strong style="color:#FF6E7F;">PART 3 · PL/SQL 심화</strong>
<div class="track-outline">  
  <span>▶ Chapter 14: plsql</span>
  <span>▶ Chapter 15: record</span>
  <span>▶ Chapter 16: cursor</span>
  <span>▶ Chapter 17: save</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#888;">
  이 트랙은 오라클의 기본 SQL부터 객체 관리, PL/SQL까지<br/> 실무 중심으로 배우며, 데이터베이스 전문가로 성장합니다.
</p>
 


 
---

<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념  
***SQL 함수 실습***  
→ ***문자열 처리***, ***숫자 계산***, ***날짜 연산***, ***형식 변환***, ***조건 분기***

---

<!-- _class: aqua -->
### 🔍 문자열 함수  
- UPPER, LOWER, INITCAP : 대소문자 변환  
- LENGTH, LENGTHB : 문자열 길이 및 바이트 수  
- SUBSTR, INSTR : 부분 문자열 추출 및 위치 찾기  
- REPLACE, LPAD, RPAD : 문자열 치환 및 채우기  
- TRIM, LTRIM, RTRIM : 공백 또는 특정 문자 제거  
- CONCAT : 문자열 연결  

---

<!-- _class: aqua -->
### 🧩 숫자 함수  
- ROUND, TRUNC : 반올림 및 버림  
- CEIL, FLOOR : 정수 올림/내림  
- MOD : 나머지 계산  

---

<!-- _class: aqua -->
### 📅 날짜 함수  
- SYSDATE, ADD_MONTHS, MONTHS_BETWEEN  
- NEXT_DAY, LAST_DAY  
- ROUND, TRUNC (날짜 형식)  
- TO_CHAR, TO_DATE : 날짜 ↔ 문자열 변환  

---

<!-- _class: aqua -->
### 🔁 변환 함수  
- TO_CHAR, TO_NUMBER, TO_DATE  
- 숫자/날짜/문자 간 형식 변환  

---

<!-- _class: aqua -->
### 🧠 조건 함수  
- NVL, NVL2 : NULL 처리  
- DECODE, CASE : 조건 분기 처리  

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

---

<!-- _class: aqua -->

<pre class="codeblock">
-- 대소문자 변환
SELECT ENAME, UPPER(ENAME), LOWER(ENAME), INITCAP(ENAME) FROM EMP;

-- 문자열 길이
SELECT ENAME, LENGTH(ENAME) FROM EMP;

-- 부분 문자열 추출
SELECT JOB, SUBSTR(JOB, 1, 2), SUBSTR(JOB, 3, 2), SUBSTR(JOB, 5) FROM EMP;

-- 문자 위치 찾기
SELECT INSTR('HELLO, ORACLE!', 'L') FROM DUAL;

-- 문자열 치환
SELECT REPLACE('010-1234-5678', '-', ' ') FROM DUAL;

-- 문자열 채우기
SELECT LPAD('Oracle', 10, '#'), RPAD('Oracle', 10, '*') FROM DUAL;

-- 공백 제거
SELECT TRIM(' _Oracle_ ') FROM DUAL;

-- 숫자 반올림/버림
SELECT ROUND(1234.5678, 2), TRUNC(1234.5678, 2) FROM DUAL;

-- 날짜 연산
SELECT SYSDATE, ADD_MONTHS(SYSDATE, 3), NEXT_DAY(SYSDATE, '월요일') FROM DUAL;

-- 날짜 형식 변환
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS') FROM DUAL;

-- 숫자 형식 변환
SELECT TO_CHAR(SAL, '$999,999') FROM EMP;

-- NULL 처리
SELECT NVL(COMM, 0), SAL + NVL(COMM, 0) FROM EMP;

-- 조건 분기
SELECT DECODE(JOB, 'MANAGER', SAL*1.1, SAL*1.03) FROM EMP;
SELECT CASE WHEN COMM IS NULL THEN '해당사항 없음' ELSE '수당 있음' END FROM EMP;
</pre>

---

<!-- _class: aqua -->

## ✅ 함수 요약표

| 함수 | 설명 |
|------|------|
| UPPER, LOWER, INITCAP | 대소문자 변환 |
| LENGTH, SUBSTR, INSTR | 문자열 길이 및 추출 |
| REPLACE, LPAD, RPAD | 문자열 치환 및 채우기 |
| ROUND, TRUNC | 숫자 반올림/버림 |
| SYSDATE, ADD_MONTHS | 날짜 연산 |
| TO_CHAR, TO_DATE | 형식 변환 |
| NVL, CASE | 조건 처리 |

---

<!-- _class: green -->
# 🧪 Step 3: 연습문제


 

---
<!-- _class: aqua -->
##### Q001
-EMP 테이블에서 ENAME을 대문자, 소문자, 첫글자만 대문자로 조회하시오.
<img src="img/chap06_001.png" alt="" width="80%" />




---
<!-- _class: aqua -->
##### Q002
-EMP 테이블에서  UPPER를 이용하여 ENAME이 KING인 데이터를  조회하시오.
<img src="img/chap06_002.png" alt="" width="80%" />


 


---
<!-- _class: aqua -->
##### Q003
-EMP 테이블에서  UPPER를 이용하여 ENAME에  KING인 포함된 데이터를  조회하시오.
- 대소문자 상관없이 KING인 사람을 조회하는 것이 가능해짐.

---
<!-- _class: aqua -->
<img src="img/chap06_003.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q004
-EMP 테이블에서 LENGTH를  이용하여 ENAME의 문자열 길이를  조회하시오.
<img src="img/chap06_004.png" alt="" width="80%" />


 


---
<!-- _class: aqua -->
##### Q005
-EMP 테이블에서 ENAME의 문자열 길이가 5이상인 데이터를   조회하시오.
<img src="img/chap06_005.png" alt="" width="80%" />


 


---
<!-- _class: aqua -->
##### Q006  
- LENGTH('한글'), LENGTHB('한글')
- 문자열길이반환, 문자열 바이트 수 반환환
<img src="img/chap06_006.png" alt="" width="80%" />


 


---
<!-- _class: aqua -->
##### Q007
- 문자열 일부분을 추출
- SUBSTR( 문자열 , 시작위치, 추출길이)
<img src="img/chap06_007.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q008  
- -의 의미는?
- C(-5)L(-4)E(-3)R(-2)K(-1)
<img src="img/chap06_008.png" alt="" width="90%" />


 



---
<!-- _class: aqua -->
##### Q009  
- 특정문자위치 찾기
- INSTR(문자열,  찾을거, 시작위치, 몇번째째)
<img src="img/chap06_009.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q010  
- EMP테이블에서 INSTR 함수로 사원이름에 S가 있는 데이터를 조회하시오
<img src="img/chap06_010.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q011
- EMP테이블에서 LIKE를 이용하여  사원이름에 S가 있는 데이터를 조회하시오
<img src="img/chap06_011.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q012  
- REPLACE를 이용하여 연락처의 -을 공백으로, -을 뺀데이터로 조회하시오오
<img src="img/chap06_012.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q013 
- LPAD, RPAD를 이용하여 다음과 같이 데이터를 출력하시오오
<img src="img/chap06_013.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q014
- RPAD를 이용하여 개인정보뒷자리 *로 출력하시오.
<img src="img/chap06_014.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q015
- EMP 테이블에서 EMPNO와 ENAME 사이에 :을 넣고 문자열을 연결하시오.
<img src="img/chap06_015.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q016  
- TRIM을 이용하여  다음과 같이 공백을 제거하고 출력하시오.
<img src="img/chap06_016.png" alt="" width="90%" />

 
---
<!-- _class: aqua -->
##### Q017 
- TRIM을 이용하여 삭제할 문자 삭제후 출력가능능
<img src="img/chap06_017.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q018  
- TRIM, LTRIM, RTRIM 사용하여 문자열 출력하기기
<img src="img/chap06_018.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q019
- ROUND를 이용하여 반올림 된 숫자 출력하기
<img src="img/chap06_019.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q020
- 특정위치에서 버리는 TRUNC 함수수
<img src="img/chap06_020.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q021
- CEIL  : 가장 가까운 큰 정수,
- FLOOR : 가장 가까운 작은 정수 반환
<img src="img/chap06_021.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q022
- MOD : 특정 숫자를 나누고 그  나머지  출력 
<img src="img/chap06_022.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q023
- SYSDATE 함수를 사용하여 날짜 출력
- 하루이전, 이후후
<img src="img/chap06_023.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q024
- ADD_MONTHS 3개월 후 날짜 
<img src="img/chap06_024.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q025
- EMP 테이블에서 입사 10주년이 되는 사원들의 데이터를 출력하시오.
<img src="img/chap06_025.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q026
- EMP 테이블에서 입사 42년 미만인 사원데이터를 출력하시오.
- 12*42 = 504
- 42년이 지나 안나올 수 도 있음. 안나오면 개월수 늘려서 테스트해볼것

---
<!-- _class: aqua -->
<img src="img/chap06_026.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q027
- EMP 테이블에서  HIREDATE와 SYSDATE사이의 개월수를 출력하시오.
<img src="img/chap06_027.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q028
- 돌아오는 요일에 해당하는 날짜와 달의 마지막 날짜를 자도으로 계산산
<img src="img/chap06_028.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q029
- ROUND를 사용하여 날짜 데이터를 출력하시오.
<img src="img/chap06_029.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q030
- TRUNC 함수를 사용하여 날짜 데이터를 출력하시오.
<img src="img/chap06_030.png" alt="" width="90%" />


 



---
<!-- _class: aqua -->
##### Q031
- 숫자와 문자열을 더하여 출력하시오
<img src="img/chap06_031.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q032
- 문자열과 숫자를 더하여 출력하시오.  
오류가 난다면 그이유를 적으시오.
<pre class="codeblock">
SELECT 'ABCD' + EMPNO, EMPNO
  FROM EMP
 WHERE ENAME = 'SCOTT';
</pre>

<img src="img/chap06_032.png" alt="" width="60%" />



---
<!-- _class: aqua -->
##### Q033
- SYSDATE 날짜 형식지정하여  출력하시오.
<img src="img/chap06_033.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q034
- 월과 요일을 다양한 형식으로 출력하시오.
<img src="img/chap06_034.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q035
- 여러 언어로 날짜(월) 출력하시오
<img src="img/chap06_035.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q036
- 여러 언어로 날짜(요일일) 출력하시오
<img src="img/chap06_036.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q037
- SYSDATE 시간형식 지정하여 출력하시오.
<img src="img/chap06_037.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q038
- 여러가지 숫자형식을 사용하여 급여를 출력하시오.
<img src="img/chap06_038.png" alt="" width="90%" />


 

---
<!-- _class: aqua -->
##### Q039
- 문자데이터와 숫자데이터를 연산하여 출력하시오.
<img src="img/chap06_039.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q040
- 문자데이터끼지 연산하여 출력하시오 
- 오류가 난다면 그이유를 적으시오.
<pre class="codeblock">
SELECT '1,300' - '1,500'
  FROM DUAL;
</pre>

<img src="img/chap06_040.png" alt="" width="50%" />


 

---
<!-- _class: aqua -->
##### Q041
- TO_NUMBER 함수로 연산하여 출력하시오.
<img src="img/chap06_041.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q042
-  TO_DATE를 이용하여 문자 데이터를 날짜 데이터로 변환하시오.
<img src="img/chap06_042.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q043
- EMP 테이블에서   1981년 6월 1일 이후에 입사한 사원정보를 출력하시오.
<img src="img/chap06_043.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q044
- 여러가지 형식으로 날짜 데이터를 출력하시오.
<img src="img/chap06_044.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q045
- EMP테이블에서 NVL 함수를 사용하여 다음과 같이 출력하시오.
<img src="img/chap06_045.png" alt="" width="90%" />

 

---
<!-- _class: aqua -->
##### Q046
- EMP테이블에서 NVL2 함수를 사용하여 다음과 같이 출력하시오.
<img src="img/chap06_046.png" alt="" width="90%" />


 
---
<!-- _class: aqua -->
##### Q047
- EMP테이블에서 DECODE 함수를 사용하여 다음과 같이 출력하시오.
- JOB이 MANAGER 는 급여의 10% 인상한 급여
        SALESMAN 는 급여의 5% 인상한 급여
        ANALYST 는 그대로
        나머지는 3% 인상된 급여
        
---
<!-- _class: aqua -->
<img src="img/chap06_047.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### Q048
- EMP테이블에서 CASE 함수를 사용하여 다음과 같이 출력하시오.
- JOB이 MANAGER 는 급여의 10% 인상한 급여
        SALESMAN 는 급여의 5% 인상한 급여
        ANALYST 는 그대로
        나머지는 3% 인상된 급여
 
---
<!-- _class: aqua -->       
<img src="img/chap06_048.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### Q049
- 기준데이터 없이 조건식으로만 CASE 사용가능
- COMM 값이 NULL 이면 해당사항 없음
           0 이면 수당없음
           0 초과시 초과한 수당을 출력력
<img src="img/chap06_049.png" alt="" width="90%" />

 





---
<!-- _class: purple -->
# 사고확장
<br/>

---
<!-- _class: aqua -->
##### EX001
-  EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. EMP 테이블에서 ENAME이  다섯글자 이상이며 여섯글자 미만인 사원을 조회하시오.
2. MASKING_EMPNO 는 EMPNO 앞두자리외 뒷자리를 *로 출력
3. MASKING_ENAME 는 사원이름의 첫글자만 보여주고 나머지는 *로 출력

※ 앞자리 추출 - SUBSTR(문자열, 어디에서, 몇개)
※ RPAD -   RPAD( 문자열, 몇자리, 채울값)

---
<!-- _class: aqua -->
<img src="img/chap06_EX_001.png" alt="" width="90%" />

 



---
<!-- _class: aqua -->
##### EX002
-  EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. EMP 테이블에서 사원들의 월 평균 근무일 수는 21.5일
2 하루 근무시간을 8시간으로 보았을때 사원들의 하루급여(DAY_PAY) 와 시급(TIME_PAY)을 계산하여 결과를 조회하시오.
※ 하루급여는 소수점 세번째 자리에서 버리고(TRUNC), 시급은 두번째 소수점에서 반올림(ROUND)하시오


---
<!-- _class: aqua -->
<img src="img/chap06_EX_002.png" alt="" width="90%" />


 


---
<!-- _class: aqua -->
##### EX003
-  EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. EMP테이블에서 사원들은 입사일(HIREDATE)을 기준으로 3개월이 지난 후 첫 월요일에 정직원이 됨
2. 사원들이 정직원이 되는 날짜(R_JOB)를 YYYY-MM-DD 형식으로 오른쪽과 같이 출력하시오.
3. 추가 수당(COMM)이 없는 사원들의 추가수당은 N/A로 출력하시오.

---
<!-- _class: aqua -->
<img src="img/chap06_EX_003.png" alt="" width="90%" />

 


---
<!-- _class: aqua -->
##### EX004
-  EMP 테이블에서 다음과 같은 결과가 나오도록 SQL문을 작성하시오.

1. 직속상관의 사원번호(MGR)를 다음과 같은 조건을 기준으로 변환해서 CHG_MGR열에 출력하시오
 
1) 직속상관의 사원번호가 존재하지 않을경우 : 00000
2) 직속상관의 사원번호 앞 두자리가 75일 경우 : 5555
3) 직속상관의 사원번호 앞 두자리가 76일 경우 : 6666
4) 직속상관의 사원번호 앞 두자리가 77일 경우 : 7777
5) 직속상관의 사원번호 앞 두자리가 78일 경우 : 8888
6) 그 외 직속상관 사원번호의 경우 : 본래 직속상관의 사원번호 그대로 출력
 

---
<!-- _class: aqua -->
<img src="img/chap06_EX_004.png" alt="" width="90%" />

 


---

<!-- _class: aqua -->

1. SUBSTR(JOB, 1, 2) 는 어떤 결과를 반환하나요?  
2. INSTR(ENAME, 'S') > 0 은 어떤 조건을 의미하나요?  
3. ROUND(SAL / 21.5 / 8, 1) 은 어떤 계산을 수행하나요?  
4. TO_CHAR(SYSDATE, 'DAY') 는 어떤 정보를 보여주나요?  
5. NVL(COMM, 0) 은 어떤 상황에서 유용한가요?

---

<!-- _class: red -->
# 🧪 Step 5: 기억 테스트

---

<!-- _class: aqua -->

- UPPER 와 INITCAP 의 차이는 무엇인가요?  
- REPLACE 와 TRIM 은 각각 어떤 작업을 하나요?  
- ROUND 와 TRUNC 은 어떤 차이가 있나요?  
- TO_DATE('2018-07-14', 'YYYY-MM-DD') 는 어떤 형식으로 변환하나요?  
- DECODE 와 CASE 는 어떤 상황에서 사용되나요?
 
---
<!-- _class: thanks -->
## 👋 열심히 들어주셔서 감사합니다!
 
> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>
  