## Index
■ 1. 출력
■ 2. 변수 ( var, let, const)
■ 3. 자료형, 자료형확인
■ 4. event
■ 5. 선택자
■ 6. control (if, repeat)
■ 7. 유용한 기능
■ 8. array
■ 9. object
■ 10. es6



<br/>
<br/>
<br/>

---

#### **완성본**
 ![js-basic](img/js_004.png)



<br/>
<br/>
<br/>

---



#### ■ 3. event

**◎STEP1. 알림창**
```
1. alert("알립니다!");
2. prompt("입력받기설명 " , "예");
3. confirm("yes, no");
```


**실습)**
 **1. prompt+alert** ![js-basic](img/js_003_1_001.png)
```js
<script>
	let username = prompt("당신의 이름은?" , "예)홍길동");
	alert("당신의 이름은 " + username + "입니다.");
</script>
```

<br/>
<br/>
<br/>

 **2. confirm**      ![js-basic](img/js_003_1_002.png)

```js
<script>
	let answer = confirm("정말 취소하시겠어요?");
	console.log(typeof( answer ) );
</script>
```

<br/>
<br/>
<br/>



**EX**
***QUESTION)***
```
1. 나이를 입력받으세요  (prompt)
2. 나이를 알림창으로 출력해주세요 (alert)
```
 ![js-basic](img/js_003_1_003.png)

```js
<script>
let age=  prompt("당신의 나이는?");
alert("당신의 나이는 " + age + "살 입니다.");
</script>
```
<br/>
<br/>
<br/>
<br/>




**◎STEP2. 이벤트**
```
이벤트대상 / 이벤트 / 이벤트핸들러(해결사-처리)
버튼을     클릭하면  haha알림창이 뜬다.
```
**실습)**
 ![js-basic](img/js_003_2_001.png)
```js
<script>
<input type="button" value="EVENT1"  onclick="alert('haha');"
		title="버튼을 클릭하세요.(test)" class="mybtn"      />
```

<br/>
<br/>
<br/>

**EX - QUESTION**
![js-basic](img/js_003_2_002.png)
```
연습문제1) 버튼1를 누르면  => 멍멍! 경고창띄우기
연습문제2) 버튼2를 누르면  => 야옹! 경고창띄우기
연습문제3) 버튼3를 누르면  => 1 2 3 4 5 경고창  5번 띄우기
```
```html
주어진옵션)
<input type="button"  value="버튼1"  title="버튼1"    />
<input type="button"  value="버튼2"  title="버튼2"    />
<input type="button"  value="버튼3"  title="버튼3"    />
```


> ANWSER
```html
<input type="button"  value="버튼1"  title="버튼1"  onclick="alert('멍멍')" />
<input type="button"  value="버튼2"  title="버튼2"  onclick="alert('야옹')"/>
<input type="button"  value="버튼3"  title="버튼3"
		onclick="alert('1');alert('2');alert('3');alert('4');alert('5'); "/>
```


<br/>
<br/>
<br/>



---

#### ■ 4. 선택자


**◎STEP1. document.getElementById**
**실습)**
 ![js-basic](img/js_004_001.png)
```html
<input type="button" value="EVENT2"  id="click2"
		title="버튼을 클릭하세요.(js)" class="mybtn"      />
```
```js
<script>
// js-ver
// 이벤트대상                      이벤트    이벤트핸들러
document.getElementById("click2").onclick = function(){
	alert("hoho");
};
</script>
```


**EX - QUESTION**
```
document.getElementById 을 이용해서 문제를 풀으세요.

연습문제4) 버튼4를 누르면  =>
	당신이 좋아하는 색상은? 입력받고
	색상 경고창띄우기   id="test4"
```
```html
주어진옵션)
<input type="button"  value="버튼4"  title="버튼4"  id="test4" />
```

 ![js-basic](img/js_004_002.png)
 ![js-basic](img/js_004_002_2.png)


> ANWSER
```js
<script>
	document.getElementById("test4").onclick=function(){
		let color = prompt("당신이 좋아하는 색상은?");
		alert("당신이 좋아하는 색상은 " + color + "입니다.");
	};
</script>
```


<br/>
<br/>
<br/>


**◎STEP2. window.addEventListener**
**실습)**
```js
1. head 위치에 놓기
<head>
<script>
  document.getElementById("addEvent").onclick=function(){
    let color = prompt("당신이 좋아하는 음료는?");
    alert("당신이 좋아하는 음료는 " + color + "입니다.");
};
</script>
</head>
2. 동작하는지 클릭확인
3. 동작안함! 이유는?
4. 해결방안
<script>
window.addEventListener('load', function() {
  document.getElementById("addEvent").onclick=function(){
    let color = prompt("당신이 좋아하는 음료는?");
    alert("당신이 좋아하는 음료는 " + color + "입니다.");
  };
});
</script>
5. 동작~!
```
**Step1)** ![js-basic](img/js_004_003.png)
**Step2)** ![js-basic](img/js_004_003_1.png)
**Step3)** ![js-basic](img/js_004_003_2.png)
**Step4)** ![js-basic](img/js_004_003_3.png)
**Step5)** ![js-basic](img/js_004_003_4.png)
**Step6)** ![js-basic](img/js_004_003_5.png)


<br/>
<br/>
<br/>

**EX - QUESTION**
```
document.getElementById 을 이용해서 문제를 풀으세요.
script의 위치 상관없이 브라우저가 로딩이 되면 스크립트를 사용가능하게 만드시오.
연습문제5) 버튼5를 누르면  => 1 2 3 4 5 경고창  5번 띄우기
						id="test5"
```
```html
주어진옵션)
<input type="button"  value="버튼5"  title="버튼5"  id="test5" />
```

 ![js-basic](img/js_004_004.png)

> ANWSER
```js
window.addEventListener('load', function() {
	document.getElementById("test5").onclick = function(){
	alert('1');alert('2');alert('3');alert('4');alert('5');
	};
});
```




<br/>
<br/>
<br/>


**◎STEP3. 선택자**
```
1. document.getElementById
2. document.getElementsByTagName
3. document.querySelector
```

**실습1) document.getElementById / document.getElementsByTagName**
 ![js-basic](img/js_004_005.png)
```html
<ul id="animal">
	<li>DOG</li>
	<li id="cat">CAT</li>
	<li id="pig">PIG</li>
</ul>
```
```js
<script>
	//1. step1 #animal 선택하기
	let animal1 = document.getElementById("animal");
	console.log(animal1);
</script>
```


```js
<script>
	//1. step1 #animal 선택하기
	let animal1 = document.getElementById("animal");
	console.log(animal1);

	//2. 그 안에 동물들(li) 찾기
	let ani1 = animal1.getElementsByTagName('li');
	console.log(ani1);

	//3. 꾸미기
	animal1.style.color="blue";
	ani1[0].style.backgroundColor="lightblue";

	//4. 만능 querySelector
	let animal2 = document.querySelector("#animal");
	console.log(animal2);

	//5. 만능 모든요소가져오기 querySelectorAll
	let ani2 = document.querySelectorAll("#animal li");
	console.log(ani2);

	for(let i=0; i<ani2.length; i++){
	console.log(ani2[i]);
	}
</script>
```



**EX - QUESTION**
 ![js-basic](img/js_004_002.png)
```
브라우저가 로딩이 되면
Q1) document.getElementsByTagName 이용해서
	모든 input 에 배경색 black, 글자색 white , 여백 10px주기
Q2) document.getElementsById 이용해서 test2 선택
	배경색 #ccc
Q3) document.querySelector 이용해서 test3 선택
	test3를 클릭하면 width:200px; 로 수정
```
```html
주어진옵션)
<input type="button"  value="btn1" id="test1"/>
<input type="button"  value="btn2" id="test2"/>
<input type="button"  value="btn3" id="test3"/>
```

> ANWSER
```js
//window.addEventListener("load" , function(){});
window.addEventListener("load" , function(){
	//Q1.
	let inputs = document.getElementsByTagName('input'); // console.log(inputs);
	for(let i=0; i<inputs.length; i++){
		inputs[i].style.backgroundColor="black";
		inputs[i].style.color="white";
		inputs[i].style.padding="10px";
	}
	//Q2
	let test2 = document.getElementById('test2');
	test2.style.backgroundColor="#ccc";

	//Q3. test3를    클릭하면 width:200px; 로 수정
	//    이벤트대상  이벤트  이벤트핸들러
	let test3 = document.querySelector("#test3");
	test3.addEventListener("click" , function(){
		test3.style.width="200px";
	});
});
```



<br/>
<br/>
<br/>


**◎STEP4. value, innerHTML**
```
1. input - value
2. tag   - innerHTML
```
**실습)**
 ![js-basic](img/js_004_005.png)
```html
<input type="text"    id="value_target" />
<input type="button"  value="value"  title="value_target"  id="value1" />

<div class="inner_target"></div>
<input type="button"  value="value"  title="value_target"  id="inner1" />

```
```js

```

**EX - QUESTION**
 ![js-basic](img/js_004_002.png)
```
```
```html
주어진옵션)
```

> ANWSER
```js
```

