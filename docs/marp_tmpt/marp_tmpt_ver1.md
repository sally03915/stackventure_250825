---
marp: true
theme: uncover
paginate: true
style: |
  section.cover {
     /* background: linear-gradient(135deg, #0F2027, #203A43, #2C5364);
    color: #00FFFF;  */

    /* background-color: #000000;  
    color: #00BFFF;  */

    background: linear-gradient(135deg, #6A5ACD, #4169E1); 
    color: #ffffff;
    
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
    font-family: 'Orbitron', sans-serif;
  }
  
  section.orange {
    background-color: #C7510E; /* 핵심 개념: 집중과 시작 */
    color: white;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
  section.blue {
    background-color: #4169E1; /* 코드 예제: 명료함과 논리 */
    color: #ffffcc;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
  section.green {
    background-color: #2E8B57; /* 실습 과제: 행동과 실천 */
    color: #ffffff;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
  section.purple {
    background-color: #6A5ACD; /* 사고 확장: 창의성과 상상 */
    color: #ffebff;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
  section.red {
    background-color: #DC143C; /* 기억 테스트: 강렬한 마무리 */
    color: #ffecec;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
  section.aqua {
    background-color: #E0FFFF; /* 예제 및 과제: 밝고 시원한 느낌 */
    color: #222222;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
  section.thanks {
    background-color: #FDF5E6; /* 마지막 인사: 따뜻한 베이지 */
    color: #444444; /* 세련된 톤 다운된 글자색 */
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    text-align: center;
  }
---

<!-- _class: cover -->
# 🚀 Python 기초 완전 정복  
### 미래를 여는 첫 번째 코드

> <span class="fragment">기술의 언어를 배우는 가장 스마트한 방법</span>  
> <span class="fragment">당신의 가능성을 깨우는 여정이 지금 시작됩니다</span>

---

<!-- _class: orange -->
# 🧩 Step 1: 핵심 개념

- <span class="fragment">중요한 개념을 간결하게 정리</span>  
- <span class="fragment">시각적으로 눈에 띄는 주황색</span>  
- <span class="fragment">학습자의 집중을 유도</span>

---

<!-- _class: aqua -->
## 예제 1: 변수란?

```python
x = 10
print(x)
```

---

<!-- _class: aqua -->
## 예제 2: 함수란?

```python
def add(a, b):
    return a + b
```

---

<!-- _class: blue -->
# 🧪 Step 2: 코드 예제

```python
def greet(name):
    return f"Hello, {name}!"
```

> <span class="fragment">파란 배경은 코드 가독성에 효과적입니다</span>

---

<!-- _class: aqua -->
## 예제 1: 리스트 반복문

```python
fruits = ["사과", "바나나"]
for fruit in fruits:
    print(fruit)
```

---

<!-- _class: aqua -->
## 예제 2: 조건문 사용

```python
score = 85
if score >= 80:
    print("합격입니다!")
```

---

<!-- _class: green -->
# 🛠️ Step 3: 실습 과제

- <span class="fragment">직접 따라해보는 문제</span>  
- <span class="fragment">녹색은 안정감과 실천을 상징</span>  
- <span class="fragment">학습자에게 행동을 유도</span>

---

<!-- _class: aqua -->
## 과제 1: 사용자 입력 받아 인사하기

```python
name = input("이름을 입력하세요: ")
print(f"{name}님 반갑습니다!")
```

---

<!-- _class: aqua -->
## 과제 2: 짝수만 출력하기

```python
nums = [1, 2, 3, 4, 5]
for n in nums:
    if n % 2 == 0:
        print(n)
```

---

<!-- _class: purple -->
# 💡 Step 4: 사고 확장

- <span class="fragment">“왜 그럴까?”를 생각하게 하는 질문</span>  
- <span class="fragment">창의성과 상상력을 자극하는 보라색</span>

---

<!-- _class: aqua -->
## 질문 1: 함수는 왜 필요한가?

- <span class="fragment">중복을 줄이고 유지보수를 쉽게 하기 위해</span>

---

<!-- _class: aqua -->
## 질문 2: 조건문 없이 짝수를 걸러낼 수 있을까?

- <span class="fragment">창의적 접근을 유도하는 사고 실험</span>

---

<!-- _class: red -->
# 🧠 Step 5: 기억 테스트

- <span class="fragment">퀴즈 또는 복습 문제</span>  
- <span class="fragment">강렬한 마무리로 기억에 오래 남음</span>

---

<!-- _class: aqua -->
## 퀴즈 1

`print("Hello")`의 역할은?

- <span class="fragment">A. 화면에 출력한다</span>  
- <span class="fragment">B. 값을 저장한다</span>  
- <span class="fragment">C. 반복한다</span>

---

<!-- _class: aqua -->
## 퀴즈 2

`if` 문은 어떤 상황에서 사용되나요?

- <span class="fragment">A. 반복할 때</span>  
- <span class="fragment">B. 조건을 판단할 때</span>  
- <span class="fragment">C. 함수를 정의할 때</span>

---

<!-- _class: aqua -->
## 📊 테이블 예제

| 이름   | 나이 | 직업     |
|--------|------|----------|
| 홍길동 | 30   | 개발자   |
| 김영희 | 27   | 디자이너 |
| 박철수 | 35   | 기획자   |

> <span class="fragment">표 형식은 정보를 구조적으로 보여줄 때 유용합니다</span>

---

<!-- _class: aqua -->
## 🖼️ 이미지 예시

```
![예시 이미지](https://via.placeholder.com/300x200.png?text=Sample+Image)
```

> <span class="fragment">이미지는 시각적 이해를 돕고 집중도를 높입니다</span>

---

<!-- _class: thanks -->
## 👋  열심히 들어주셔서 감사합니다!

> <span class="fragment">오늘의 한 걸음이 **내일의 가능성**이 되길 바라며,</span>  
> <span class="fragment">그럼, 다음 이시간에 또 만나요!</span>