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
 ![js-basic](img/js_com_1_2_3.png)



<br/>
<br/>
<br/>

#### ■ 1. 출력
1. document.write
2. console.log

**`[관련교재]-p237`**

```
1. document.write - 브라우저 출력
2. console.log    - 브라우저 - 개발자모드(f12) - console탭
```


**실습)**   ![js-basic](img/js_001.png)

```js
<script>
	document.write("<p>Hello js!</p>");
	console.log("안녕 javascript!");
</script>
```

<br/>
<br/>
<br/>



---


#### ■ 2. 변수 ( var, let, const)
1. var, let, const
2. 자료형- typeof
3. 연산자

- console.log , document.write 든, 한번만 처리?
- 어디에 담아서 보관하는 방법은?


**◎STEP1. var**
```
1. var data=123;
2. 메모리
	1000번지 [123] ← data

	변수명(식별자) : data
	메모리(주소  ) : 1000번지
	값    (저장값) : 123

3. 변수선언 -
	선언(자바스크립트 엔진 변수명알려주기) →
	초기화(공간확보, undefined 초기화)

4. 런타임보다 먼저 실행 - 호이스팅
5. var, function, class,,,, 키워드 선언 호이스팅 됨.
6. var의 scope(사용할 수 있는 유효범위)는 전역변수
```

**실습)**   ![js-basic](img/js_002_001.png)
```js
<script>
var data;  //1. 선언- 자바스크립트 엔진 변수명알려주기
console.log(data);  // undefined
data=123;  //2. 할당- 값저장
document.write(data); //3. 참조해서 사용
</script>
```

<br/>
<br/>

**◎STEP2. let, const**
```
1. let, const 선언한 변수는 지역스코프
2. let  변수명
- 변수중복 선언 불가
- 재할당 가능
3. const 변수명
- 선언과 초기화 동시에
```

**실습)**   ![js-basic](img/js_002_002.png)
```js
<script>
//1. var - 다시 선언시 덮어씀.
var global  = 10;  console.log(global);
var global  = 20;  console.log(global);

//2. let
let  local1;       console.log(local1); // undefined
//let  local1 = 1;
// 변수중복 선언 불가
local1 = 10;       console.log(local1);
local1 = 20;       console.log(local1);

//3. const
//const local2;
//3-1. 'const' declarations must be initialized
const local2 =10;
//local2 =20;        console.log(local2);
//Uncaught TypeError: Assignment to constant variable.
</script>
```

**실습)**   ![js-basic](img/js_002_002_1.png)
**실습)**   ![js-basic](img/js_002_002_2.png)

<br/>
<br/>
<br/>



**◎STEP3. 자료형**
```
1. 전역 :  var 변수명;
2. 지역 :  let 변수명;  const 상수명;
3. 자료형확인 - typeof
```

**실습)**   ![js-basic](img/js_002_003.png)
```js
<script>
let data1;                         console.log(data1);
	data1 =10;                       console.log(data1);
	data1 =3.14;                     console.log(data1);
	data1 ="abc";                    console.log(data1);
	data1 =true;                     console.log(data1);
	data1 =["sally" , 3  , "7.8kg"]; console.log(data1);
	data1 ={};                       console.log(data1);
	data1 = function(){};            console.log(data1);
							console.log(typeof(data1));
	data1 =10;
	console.log( data1 + "10"); //10+"10"  원하는 결과물20

	console.log( typeof(data1) +"/" + typeof("10"));
	//                   number  /    string
	console.log(  data1 + Number("10"));   //20
</script>
```



<br/>
<br/>
<br/>



**◎STEP4. 연산자**
```
먼저 값 비교조건 대입
1. 이항연산자 :  + , - , * , /, %
2. 논리연산자 :  && , ||
3. 비교연산자 :  == , !=  작다, 크다
```


> web013_js_basic.html
```html
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>DBDBIG</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<!--                                    -->
<!--                                    -->
<!--                                    -->
<!--                                    -->
<!--                                    -->
<div class="p-3 bg-primary text-white ">
  <h1>001. 출력 </h1>
  <ol>
    <li>document.wirte("문자열")</li>
    <li>console.log</li>
  </ol>
</div>
<div class="container card  my-3">
  <h3  class="card-header">001. document.wirte("문자열") / console.log</h3>
  <div class="card-body">
      <script>
        document.write("<p>Hello js!</p>");
        console.log("안녕 javascript!");
        //console.log - 브라우저 - 개발자모드(f12) - console탭
      </script>
  </div>
</div>

<!--                                    -->
<!--                                    -->
<!--                                    -->
<!--                                    -->
<!--                                    -->
<div class="mt-5  p-3 bg-primary text-white ">
  <h1>002. var ,  let , const </h1>
  <ol>
    <li>var</li>
    <li>let, const</li>
  </ol>
</div>
<div class="container card  my-3">
  <h3  class="card-header">002. var ,  let , const</h3>
  <div class="card-body">
    <h4>STEP1- var</h4>
    <script>
        var data;  //1. 선언- 자바스크립트 엔진 변수명알려주기
        console.log(data);  // undefined
        data=123;  //2. 할당- 값저장
        document.write(data); //3. 참조해서 사용
    </script>
  </div>
  <!--       -->
  <!--       -->
  <!--       -->
  <div class="card-body">
    <h4>STEP2- let, const</h4>
    <script>
    //1. var - 다시 선언시 덮어씀.
    var global  = 10;  console.log(global);
    var global  = 20;  console.log(global);

    //2. let
    let  local1;       console.log(local1); // undefined
    //let  local1 = 1;
    // 변수중복 선언 불가
    local1 = 10;       console.log(local1);
    local1 = 20;       console.log(local1);

    //3. const
    //const local2;
    //3-1. 'const' declarations must be initialized
    const local2 =10;
    local2 =20;        console.log(local2);
    //Uncaught TypeError: Assignment to constant variable.
    </script>
  </div>
</div>
<!--                                    -->
<!--                                    -->
<!--                                    -->
<!--                                    -->
<!--                                    -->
<div class="mt-5  p-3 bg-primary text-white ">
  <h1>003. 자료형 , 자료형 확인(typeof) </h1>
  <ol>
    <li>자료형 , 자료형 확인(typeof)</li>
  </ol>
</div>
<div class="container card  my-3">
  <h3  class="card-header">003. 자료형 , 자료형 확인(typeof) </h3>
  <div class="card-body">
    <h4>003. 자료형 , 자료형 확인(typeof)</h4>
    <script>
    let data1;                           console.log(data1);
        data1 =10;                       console.log(data1);
        data1 =3.14;                     console.log(data1);
        data1 ="abc";                    console.log(data1);
        data1 =true;                     console.log(data1);
        data1 =["sally" , 3  , "7.8kg"]; console.log(data1);
        data1 ={};                       console.log(data1);
        data1 = function(){};            console.log(data1);
                                console.log(typeof(data1));
        data1 =10;
        console.log( data1 + "10"); //10+"10"  원하는 결과물20

        console.log( typeof(data1) +"/" + typeof("10"));
        //                   number  /    string
        console.log(  data1 + Number("10"));   //20
    </script>
  </div>
</div>

</body>
</html>

```






---
