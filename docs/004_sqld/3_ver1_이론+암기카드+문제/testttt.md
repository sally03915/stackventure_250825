

###### ✅ 권한 부여 및 회수 흐름
###### 1️⃣ **Lee: GRANT SELECT, INSERT, DELETE ON R TO Kim WITH GRANT OPTION;**

- 사용자 Lee가 Kim에게 SELECT, INSERT, DELETE 권한을 부여함
- **WITH GRANT OPTION** → Kim은 다른 사용자에게 권한을 위임할 수 있음

---

###### 2️⃣ **Kim: GRANT SELECT, INSERT, DELETE ON R TO Park;**

- Kim이 Park에게 권한을 위임함
- Park은 SELECT, INSERT, DELETE 권한을 갖게 됨

---

###### 3️⃣ **Lee: REVOKE DELETE ON R FROM Kim;**

- Kim의 DELETE 권한이 회수됨
- 하지만 **CASCADE**가 없으므로 Park의 DELETE 권한은 **유지됨**

---

###### 4️⃣ **Lee: REVOKE INSERT ON R FROM Kim CASCADE;**

- Kim의 INSERT 권한이 회수됨
- **CASCADE** → Kim이 위임한 Park의 INSERT 권한도 **함께 회수됨**

---

###### ✅ 각 보기별 실행 가능 여부

###### ① **Park: SELECT * FROM R WHERE A = 400;** → ✅ 가능

- SELECT 권한은 회수되지 않았음
- Park은 SELECT 가능

---

###### ② **Park: INSERT INTO R VALUES (400, 600);** → ❌ 불가능

- INSERT 권한은 **CASCADE**로 회수됨
- Park은 INSERT 불가능

---

###### ③ **Park: DELETE FROM R WHERE B = 800;** → ✅ 가능

- DELETE 권한은 Kim에게서만 회수됨
- Park은 DELETE 권한 유지

---

###### ④ **Kim: INSERT INTO R VALUES (500, 600);** → ❌ 불가능

- Kim의 INSERT 권한은 회수됨
- INSERT 불가능

---

###### ✅ 최종 정답

| 보기 번호 | 실행 가능 여부 | 이유 |
|-----------|----------------|------|
| ①         | ✅ 가능         | SELECT 권한 유지 |
| ②         | ❌ 불가능       | INSERT 권한 CASCADE 회수 |
| ③         | ✅ 가능         | DELETE 권한 유지 |
| ④         | ❌ 불가능       | Kim의 INSERT 권한 회수됨 |
 