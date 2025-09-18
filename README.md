좋아요! 아래는 기존 Java 중심 실습 트랙을 Oracle ERD(개체-관계 다이어그램) 중심 실습 트랙으로 재구성한 버전입니다. 데이터 모델링, 관계 설정, 실무 중심 ERD 설계 역량에 초점을 맞췄어요:

---

# 🧠 CodeCraft Oracle ERD 설계 실습 트랙

본 프로젝트는 **Oracle 기반 데이터베이스 설계**,  
**ERD(Entity Relationship Diagram) 모델링**, 그리고 **실무 중심의 DB 구조 설계 역량 강화**를 위한 실습형 예제입니다.

> 💡 **단순한 SQL 작성에서 벗어나,  
> 실무 중심의 테이블 구조 설계 · 관계 설정 · 정규화 · 제약조건까지  
> 체계적으로 익히는 데 목적이 있습니다.**

---

## 📌 Full-Stack Data Architect Profile

**CodeCraft 시리즈**는 기획부터 모델링, 문서화, 협업까지  
전 과정을 주도적으로 수행할 수 있는 데이터 설계자를 위한 실습형 트랙입니다.

Lucidchart, dbdiagram.io, Draw.io 등 ERD 도구를 활용하며,  
Oracle SQL Developer 또는 SQL*Plus 환경에서 실제 테이블 생성 및 관계 설정을 실습합니다.

---

## 📌 `Track 03.` Oracle ERD 설계 핵심 실습  
**Entity · Relationship · Normalization · Constraints · SQL DDL · ERD Tool 활용**

> Oracle 기반 데이터베이스 구조를 단계별로 설계하며,  
> 실무 중심의 데이터 모델링 및 관계 설정 능력을 체계적으로 실습합니다.

---

## 📌 목차

### Part 1. Oracle Basic

| 챕터 | 내용 | 링크 |
|------|------|------|
| Chapter 1 | oracle_setting | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle001_setting) |
| Chapter 2 | select_basic | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle002_select_basic) |
| Chapter 3 | select_where | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle003_select_where) |
| Chapter 4 | select_fn | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle004_select_fn) |
| Chapter 5 | select_group | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle005_select_group) |
| Chapter 6 | select_join | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle006_select_join) |
| Chapter 7 | select_subquery | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle007_select_subquery) |

---

### Part 2. 데이터조작및 객체

| 챕터 | 내용 | 링크 |
|------|------|------|
| Chapter 8 | update_delete | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle008_update_delete) |
| Chapter 9 | transaction | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle009_transaction) |
| Chapter 10 | ddl | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle010_ddl) |
| Chapter 11 | object | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle011_object) |
| Chapter 12 | constraint | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle012_constraint) |
| Chapter 13 | user | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle013_user) |


---

### Part 3. Plsql

| 챕터 | 내용 | 링크 |
|------|------|------|
| Chapter 14 | plsql?  | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle014_plsql) |
| Chapter 15 | record | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle015_record) |
| Chapter 16 | cursor | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle016_cursor) |
| Chapter 17 | save | [보기](https://sally03915.github.io/stackventure_250825/track04-oracle-erd/oracle017_save) |


---

### Part 4. Erd

| 챕터 | 내용 | 링크 |
|------|------|------|
| Chapter 1 | 사용자 · 주문 · 상품 테이블 설계 | [보기](https://sally03915.github.io/stackventure_250825/erd/erd005_user_order_product) |
| Chapter 2 | 다대다 관계 처리 · 중간 테이블 | [보기](https://sally03915.github.io/stackventure_250825/erd/erd006_many_to_many) |
| Chapter 3 | ERD 도구 실습 (Lucidchart/dbdiagram) | [보기](https://sally03915.github.io/stackventure_250825/erd/erd007_erd_tool_practice) | 



---

## 📌 목표  
- ERD를 활용한 **데이터 구조 설계 능력 강화**  
- 정규화를 통한 **중복 최소화 및 효율적 저장 구조 설계**  
- 제약조건 설정을 통한 **데이터 무결성 확보**  
- SQL DDL을 통한 **Oracle DB 기반 테이블 생성 및 관계 설정**

---

## 📌 기술 스택 기반 DB 설계 역량

| 기술 스택     | 데이터 설계 개념             | 실무 적용 역량 |
|---------------|------------------------------|----------------|
| ERD Tool      | 개체/관계/속성 모델링        | 실무 중심 데이터 구조 시각화 |
| Oracle SQL    | DDL / PK / FK / Constraints  | 테이블 생성 및 관계 설정 |
| Normalization | 1NF / 2NF / 3NF              | 중복 제거 및 효율적 설계 |
| PL/SQL        | 프로시저 / 트리거 / 함수     | 비즈니스 로직 처리 |
| Markdown      | 문서화 / 설계서 작성         | 협업용 ERD 문서 및 기술 명세 작성 |

---

## 📌 시작하기

```bash
# 저장소 복제
git clone https://github.com/your-username/oracle-erd-track.git

# 프로젝트 폴더로 이동
cd oracle-erd-track

# ERD 도구 또는 SQL Developer로 열기
```

---

원하시면 특정 도메인(예: 병원, 쇼핑몰, 교육 플랫폼)에 맞춘 ERD 설계 예제도 추가해드릴 수 있어요. 어떤 분야에 관심 있으신가요?
