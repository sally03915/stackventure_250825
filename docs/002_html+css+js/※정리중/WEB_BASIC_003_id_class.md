## Index
■ 1. WEB START!
■ 2. WEB HTML   - 영역(div)잡고 제목(h), 내용(p,img, ul, ol, form, table,,,)
■ 3. WEB CSS(1) - 선택자  id  vs  class
■ 4. WEB CSS(2) - 배치관련  (position, float, display ,  margin/padding)
■ 5. WEB CSS(3) - font관련
■ 6. WEB CSS(4) - css외부적용

<br/>
<br/>
<br/>

---

**`교재 p70`**
### 03. WEB CSS(1) - 선택자  id  vs  class

##### #1. 진행사항
1. css 적용방법
	- 인라인 : 직접   style=""
	- 내부   : head  <style></style>
	- 외부   : link  <link rel="" href=""/>
2. 배경과 높이
	- 높이 : height:100px
	- 배경 : background-color:red;
3. id  vs  class

<br/>
<br/>
<br/>

|NO|완성본확인인|
|-|-|
|1|**Step1)** 클론코딩 완성!![WEB PATTERN](img/web_com.png)|
|2|> `But`.....우리가 이번을 통해 할수 있는 범위는....|
|3|**Step2)**![WEB PATTERN](img/web003.png)|









<br/>
<br/>
<br/>


---

***[이론정리]***

##### #1. CSS적용방법
1. ***CSS[ CASCADING STYLE SHEETS ]***  : 꾸미기
	가. 인라인방법 :  html 태그에 직접 값을 지정하는 방법
    - 용도 : 테스트
        웹표준에서는 구조(html) , 표현(css), 움직임(js, jquery)를 분리하는 것을 권장.
        인라인은 html태그에 직접 지정하므로 분리가 안됨.
    - 방법 :
		```html
			<h2  style="color:red"> 꾸미는 방법</h2>
		```
	<br/>

	나. 내부적용 : 선택자에 따라 일괄적으로 선언하는방법
	-   용도 : html문서안에서 <head></head> 안에 스타일을 정의
	-   방법 :

		```html
			<head>
				<style  type="text/css">  p  { color:red; } </style>
			</head>
		```
	<br/>

    다. 외부적용 : 파일분리
	-   방법 :

		```html
		<link rel="stylesheet" href="./css/base.css"/>
		```

##### #2  기본 CSS (높이, 배경)
	- 높이 : height:100px
	- 배경 : background-color:red;


##### #3. 선택자 id  vs  class
**`교재 p87`**

가.       id
    정의 : 한문서 안에서 스타일을 지정할때
        고유한 아이디 한가지만 지정해서 사용하는 이름
    방법 :
        <h3 id="red" >아이디 선택자</h3>
        <p  id="apple">아이디가 apple</p>
        <p  id="banana">아이디가 banana</p>
        <p  id="coconut">아이디가 coconut</p>
        <style  type="text/css">
                    #red    {  color:red;  }
                    #apple {  color:green; }
        </style>
나.       class
    정의 : 스타일을 지정할때 그룹으로 지정해서 사용하는 이름 /
    <p   class="even" >  클래스 </p>
    <style  type="text/css">
    .even{    background-color:red; }
    </style>



<br/>
<br/>
<br/>


***[실습순서]***
1. **기본 `web003_basic.html`**
       인라인, 배경, 높이 연습
2. **연습 `web003_1.html`**
		 각 영역의 인라인 방법을 이용하여  높이와 배경을 적용하시오.
    ※ 만약 2000줄이 넘는 html이라면.... css를 수정하려면... 찾기가 너무 힘들다! 인라인의 단점!
3. **기본 `web003_basic.html`** - id, class, 내부적용
4. **연습 `web003_2.html`**
         각 영역의 내부적용용 방법을 이용하여  높이와 배경을 적용하시오.


<br/>
<br/>
<br/>

***[실습] 1. 기본- 인라인-배경, height***
![web-pattern](img/web003_1.png)
>web003_basic.html
```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>tag</title>
</head>
<body>
    <div>
        <h3>1. CSS-인라인방법법</h3>
        <p style="background-color:red; color:white"> APPLE은 RED</p>
        <p style="background-color:gold; color:white; height:100px"> BANANA는 YELLOW</p>
        <p>만약 2000줄이 넘는 html이라면.... css를 수정하려면... 찾기가 너무 힘들다! 인라인의 단점!</p>
    </div>
    <!-- 1. CSS-인라인방법법 -->
    <!-- 1. CSS-인라인방법법 -->
    <!-- 1. CSS-인라인방법법 -->


</body>
</html>
```

<br/>
<br/>
<br/>


***[실습] 2. 미니프로젝트에 height, background적용해보기***
<img src="img/web003.png"  alt="web-pattern"  style="width:400px" />
>web003_1.html
```html
1. 전체 감싸는 영역(div)에          배경색 #ccc
2. header 태그에      높이: 140px, 배경색: deepskyblue
3. 그 아래 div 태그에  높이: 642px, 배경색: lightblue
4. section 태그에     높이: 258px, 배경색: thistle
5. footer  태그에     높이: 74px , 배경색: #333
```


```html
<!DOCTYPE html>
<html lang="ko">
 <head>
  <title>microsoft</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1"/>
  <style>
  </style>
 </head>
 <body>
	<div style="background-color:#ccc; ">
		<header style="height:140px;   background-color:deepskyblue;">
		  <div>
			<div>
				<h1>
					<a href="http://www.microsoft.com" title="마이크로소프트">
						<img src="img/mslogo.png" alt="로고"/>
					</a>
				</h1>
				<form action="https://www.microsoft.com/ko-kr/search/result.aspx" method="GET"  >
					<div>
						<input type="text" name="q" placeholder="Microsoft.com 검색" title="Microsoft 검색" maxlength="20"/>
						<input type="image" name="searchButton" src="img/search.ltr.png" alt="돋보기 이미지" title="돋보기 이미지"/>
					</div>
				</form>
			</div>
			<nav>
				<h2>주메뉴</h2>
				<ul>
					<li><a href="#" title="구매">구매</a><span>V</span></li>
					<li><a href="#" title="제품">제품</a><span>V</span></li>
					<li><a href="#" title="다운로드">다운로드</a><span>V</span></li>
					<li><a href="#" title="지원">지원</a><span>V</span></li>
				</ul>
			</nav>
		  </div><!-- end container -->
		</header>
		<!-- end header  -->
		<!-- end header  -->
		<!-- end header  -->

		<div style="height:642px; background-color:lightblue; ">
		  <div>
			<h2>비쥬얼 영역</h2>
			<div>
				<h3>Surface</h3>
				<p>
					기존의 노트북을 바꿀만한 가치의 태블릿을 만나보세요
				</p>
				<p>Surface Pro3.</p>
				<p><a href="#" title="자세히 보기">자세히 보기</a></p>
			</div>
	      </div><!-- end container -->
		</div>
		<!-- end visual  -->
		<!-- end visual  -->
		<!-- end visual  -->

		<section style="height:258px; background-color:thistle;  ">
		  <div>
			<h3>컨텐츠 영역</h3>
			<ul>
				<li>
					<a href="#" title="이미지1">
						<img src="img/b01.png" alt="이미지1"/>
					</a>
					<p>
						Xbox One 올해 최고의 게임
					</p>
				</li>
				<li>
					<a href="#" title="이미지2">
						<img src="img/b02.jpg" alt="이미지2"/>
					</a>
					<p>
						이제 Office 문서를 ipad와 phone에서 무료로 만들고 편집하세요.
					</p>
				</li>
				<li>
					<a href="#" title="이미지3">
						<img src="img/b03.jpg" alt="이미지3"/>
					</a>
					<p>
						microsoft Store에서 멋진 선물을 쇼핑하세요.
					</p>
				</li>
			</ul>
		  </div> <!-- end container -->
		</section>
		<!-- end content  -->
		<!-- end content  -->
		<!-- end content  -->

		<footer style="height:74px;   background-color:#333; ">
			<div>
				<ul>
					<li><a href="#" title="문의처 (고객 지원 센터 : 1577-9700)">문의처 (고객 지원 센터 : 1577-9700)</a></li>
					<li><a href="#" title="개인정보취급방침 및 청소년보호정책">개인정보취급방침 및 청소년보호정책</a></li>
					<li><a href="#" title="사용약관">사용약관</a></li>
					<li><a href="#" title="상표">상표</a></li>
					<li><a href="#" title="광고정보">광고정보</a></li>
					<li><a href="#" title="2025 Microsoft">2025 Microsoft</a></li>
				</ul>
			</div>
		</footer>
		<!-- end footer  -->
		<!-- end footer  -->
		<!-- end footer  -->
	</div>
	</body>
</html>

```

<br/>
<br/>
<br/>




***[실습3]  id, class, 내부적용***
<img src="img/web003_2.png"  alt="web-pattern"  style="width:400px" />
>web003_basic.html
```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CSS</title>
    <style>
        p{  background-color:darkturquoise;  color:white; }
        #one{  width:100px; height:100px; background-color: black; color:white; }
        #two{  width:100px; height:100px; background-color:skyblue; color:white; }
        #three{  width:100px; height:100px; background-color: black; color:white; }
        #four{  width:100px; height:100px; background-color:skyblue; color:white; }

        .odd{  width:100px; height:100px; background-color: black; color:white; }
        .even{ width:100px; height:100px; background-color:skyblue; color:white; }
    </style>
</head>
<body>
    <div>
        <h3>1. CSS-인라인방법법</h3>
        <p style="background-color:red; color:white"> APPLE은 RED</p>
        <p style="background-color:gold; color:white; height:100px"> BANANA는 YELLOW</p>
        <p>만약 2000줄이 넘는 html이라면.... css를 수정하려면... 찾기가 너무 힘들다! 인라인의 단점!</p>
    </div>
    <!-- 1. CSS-인라인방법법 -->
    <!-- 1. CSS-인라인방법법 -->
    <!-- 1. CSS-인라인방법법 -->

    <div>
        <h3>1. CSS-내부적용방법 -  id</h3>
        <p id="one">ONE</p>
        <p id="two">TWO</p>
        <p id="three">THREE</p>
        <p id="four">FOUR</p>

        <h3>2. CSS-내부적용방법 -  css</h3>
        <p class="odd">ONE</p>
        <p class="even">TWO</p>
        <p class="odd">THREE</p>
        <p class="even">FOUR</p>
    </div>
    <!-- 2. id , class-내부적용방법 -->
    <!-- 2. id , class-내부적용방법 -->
    <!-- 2. id , class-내부적용방법 -->
</body>
</html>
```

<br/>
<br/>
<br/>
<br/>


***[실습4]  미니프로젝트에  id, class, 내부적용***
- 각 영역의 내부적용 방법을 이용하여  높이와 배경을 적용하시오.

```html
1. 전체 감싸는 영역(div)에   -  id값  wrap        배경색 #ccc
2. header 태그에           -  id값  header       높이: 140px, 배경색: deepskyblue
3. 그 아래 div 태그에       -  id값  visual       높이: 642px, 배경색: lightblue
4. section 태그에          -  id값  content      높이: 258px, 배경색: thistle
5. footer  태그에          -  id값  footer      높이: 74px , 배경색: #333
```


>web003_2.html
```html
<!DOCTYPE html>
<html lang="ko">
 <head>
  <title>microsoft</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1"/>
  <style>
	/*################ 레이아웃 layout.css ###############*/
	#wrap     {   background-color:#ccc;                      }
	#header   {   height:140px;   background-color:deepskyblue; }
	#visual   {   height:642px; background-color:lightblue;   }
	#content  {   height:258px; background-color:thistle;     }
	#footer   {  height:74px;   background-color:#333;          }
  </style>
 </head>
 <body>
	<div class="wrap">
		<header id="header">
		  <div class="container">
			<div id="head">
				<h1 id="logo">
					<a href="http://www.microsoft.com" title="마이크로소프트">
						<img src="img/mslogo.png" alt="로고"/>
					</a>
				</h1>
				<form action="https://www.microsoft.com/ko-kr/search/result.aspx" method="GET"   class="search">
					<div class="searchArea">
						<input id="searchText" type="text" name="q" placeholder="Microsoft.com 검색" title="Microsoft 검색" maxlength="20"/>
						<input id="searchButton" type="image" name="searchButton" src="img/search.ltr.png" alt="돋보기 이미지" title="돋보기 이미지"/>
					</div>
				</form>
			</div>
			<nav>
				<h2  class="hidden">주메뉴</h2>
				<ul>
					<li><a href="#" title="구매">구매</a><span>V</span></li>
					<li><a href="#" title="제품">제품</a><span>V</span></li>
					<li><a href="#" title="다운로드">다운로드</a><span>V</span></li>
					<li><a href="#" title="지원">지원</a><span>V</span></li>
				</ul>
			</nav>
		  </div><!-- end container -->
		</header>
		<!-- end header  -->
		<!-- end header  -->
		<!-- end header  -->

		<div id="visual">
		  <div class="container">
			<h2 class="hidden">비쥬얼 영역</h2>
			<div class="visual_desc">
				<h3>Surface</h3>
				<p>
					기존의 노트북을 바꿀만한 가치의 태블릿을 만나보세요
				</p>
				<p>Surface Pro3.</p>
				<p><a href="#" title="자세히 보기">자세히 보기</a></p>
			</div>
	      </div><!-- end container -->
		</div>
		<!-- end visual  -->
		<!-- end visual  -->
		<!-- end visual  -->

		<section id="content">
		  <div class="container">
			<h3  class="hidden">컨텐츠 영역</h3>
			<ul>
				<li>
					<a href="#" title="이미지1">
						<img src="img/b01.png" alt="이미지1"/>
					</a>
					<p>
						Xbox One 올해 최고의 게임
					</p>
				</li>
				<li>
					<a href="#" title="이미지2">
						<img src="img/b02.jpg" alt="이미지2"/>
					</a>
					<p>
						이제 Office 문서를 ipad와 phone에서 무료로 만들고 편집하세요.
					</p>
				</li>
				<li>
					<a href="#" title="이미지3">
						<img src="img/b03.jpg" alt="이미지3"/>
					</a>
					<p>
						microsoft Store에서 멋진 선물을 쇼핑하세요.
					</p>
				</li>
			</ul>
		  </div> <!-- end container -->
		</section>
		<!-- end content  -->
		<!-- end content  -->
		<!-- end content  -->

		<footer id="footer">
			<div class="container">
				<ul>
					<li><a href="#" title="문의처 (고객 지원 센터 : 1577-9700)">문의처 (고객 지원 센터 : 1577-9700)</a></li>
					<li><a href="#" title="개인정보취급방침 및 청소년보호정책">개인정보취급방침 및 청소년보호정책</a></li>
					<li><a href="#" title="사용약관">사용약관</a></li>
					<li><a href="#" title="상표">상표</a></li>
					<li><a href="#" title="광고정보">광고정보</a></li>
					<li><a href="#" title="2021 Microsoft">2021 Microsoft</a></li>
				</ul>
			</div>
		</footer>
		<!-- end footer  -->
		<!-- end footer  -->
		<!-- end footer  -->
	</div>
	</body>
</html>

---


## Index
■ 1. WEB START!
■ 2. WEB HTML   - 영역(div)잡고 제목(h), 내용(p,img, ul, ol, form, table,,,)
■ 3. WEB CSS(1) - 선택자  id  vs  class
■ 4. WEB CSS(2) - 배치관련  (position, float, display ,  margin/padding)
■ 5. WEB CSS(3) - font관련
■ 6. WEB CSS(4) - css외부적용