
###### 🧠 SQL 처리 순서 설명

```sql
SELECT ENAME AAA, JOB AAB
FROM EMP
WHERE EMPNO = 7369
UNION ALL
SELECT ENAME BBA, JOB BBB
FROM EMP
WHERE EMPNO = 7566
ORDER BY 1, 2;
```

###### 1️⃣ **SELECT ENAME AAA, JOB AAB FROM EMP WHERE EMPNO = 7369**
- EMP 테이블에서 사번이 7369인 행을 선택합니다.
- 결과: **ENAME = SMITH**, **JOB = CLERK**

###### 2️⃣ **SELECT ENAME BBA, JOB BBB FROM EMP WHERE EMPNO = 7566**
- EMP 테이블에서 사번이 7566인 행을 선택합니다.
- 결과: **ENAME = JONES**, **JOB = MANAGER**

###### 3️⃣ **UNION ALL**
- 두 SELECT 결과를 **합칩니다**.
- **UNION ALL**은 **중복 제거 없이** 모두 포함합니다.
- 결과: 2건 (SMITH + JONES)

###### 4️⃣ **ORDER BY 1, 2**
- 결과를 첫 번째 컬럼(ENAME), 두 번째 컬럼(JOB) 기준으로 오름차순 정렬합니다.
- 알파벳 순으로 **JONES**가 **SMITH**보다 먼저 나옵니다.

###### ✅ 최종 결과

| ENAME | JOB     |
|--------|----------|
| JONES  | MANAGER  |
| SMITH  | CLERK    |

###### 📊 핵심 요약

| 처리 단계 | 설명 |
|-----------|------|
| **SELECT ... WHERE EMPNO = 7369** | SMITH 추출 |
| **SELECT ... WHERE EMPNO = 7566** | JONES 추출 |
| **UNION ALL** | 두 결과 합치기 |
| **ORDER BY 1, 2** | 이름, 직무 기준 정렬 |
 