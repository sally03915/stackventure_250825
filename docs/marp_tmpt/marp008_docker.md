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

  section.cover::after {
    content: "";
    background-image: url('회사로고_URL');
    background-size: 80px;
    background-repeat: no-repeat;
    opacity: 0.05;
    position: absolute;
    bottom: 20px;
    right: 20px;
    width: 80px;
    height: 80px;
    pointer-events: none;
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

  /* 일반 섹션 배경 */
  section.orange   { background: linear-gradient(135deg, #fca65e, #f76b1c); color: #fff; }
  section.blue     { background: linear-gradient(135deg, #6fa3ef, #4169E1); color: #ffffcc; }
  section.green    { background: linear-gradient(135deg, #3cb371, #2E8B57); color: #fff; }
  section.purple   { background: linear-gradient(135deg, #b19cd9, #6A5ACD); color: #ffebff; }
  section.red      { background: linear-gradient(135deg, #ff6f61, #DC143C); color: #ffecec; }
  section.aqua     { background-color: #E0FFFF; color: #222; }
  section.thanks   { background-color: #FDF5E6; color: #444; }
  
---

<!-- _class: cover-docker -->
<h4 style="color:#6C757D;">
  <span style="color:#00c6ff; text-shadow: 0 0 6px rgba(0,198,255,0.6); font-weight:bold;">🚀</span>
  CodeCraft Series · Track 09
</h4>  
<h1 style="color:#00BFFF;">Docker 실전 활용</h1>  
<h3 style="color:#B2EBF2;">Container · Image · Volume · Compose</h3>

<!-- 현재 챕터 강조 -->
<div class="chapter-highlight">
  📍 <strong>현재 위치:</strong> Chapter 2 · <em>도커 이미지와 컨테이너 생성</em>
</div>

<blockquote>
  <span class="fragment" style="color:#343A40;">개발 환경을 통째로 담는 컨테이너 기술의 모든 것</span><br>
  <span class="fragment" style="color:#495057;">Docker로 개발, 배포, 협업을 자동화하는 실전 노하우</span>
</blockquote>

---

<!-- _class: cover-docker -->
<h2 style="font-size:1.6em; color:#f0f0f0;">목차 : Docker 실전 활용 트랙</h2>

<div class="track-outline">
  <span>▶ Chapter 1: Docker 개요와 설치</span>
  <span class="current-chapter">✅▶ Chapter 2: 도커 이미지와 컨테이너 생성</span>
  <span>▶ Chapter 3: 볼륨과 네트워크 설정</span>
  <span>▶ Chapter 4: Docker Compose 실습</span>
  <span>▶ Chapter 5: 배포 자동화와 실전 프로젝트</span>
</div>

<p style="margin-top:30px; font-size:0.95em; color:#ccc;">
  이 트랙은 컨테이너 기반 개발 환경을 <br/> 실습 중심으로 학습하며, DevOps의 핵심 기술을 익힙니다.
</p>



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