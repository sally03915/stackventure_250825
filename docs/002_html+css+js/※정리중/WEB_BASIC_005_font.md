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

### 05. WEB CSS(3) - font관련

**`교재 p97`**


##### #1. 진행사항
1. font + 문단속성
2. font + 문단속성 연습문제
3. WEB 미니프로젝트 완성!

<br/>
<br/>
<br/>

**Step1)** 클론코딩 완성!
![WEB PATTERN](img/web_com.png)



<br/>
<br/>
<br/>



---

***[이론정리]***

##### #1  font+ 문단속성 css
① 글자색상 :  color
```html
    예)  <h3 style="color:red;">글자색상red로 </h3>
```

② 글자사이즈 : font-size
```html
	예)  <h3 style="font-size:12px;">글자사이즈12px </h3>
```

③ 글자 기울이기 : font-style
```html
	예)  <h3 style="font-style:italic">기울이기 </h3>
```

④ 글자 굵게 : font-weight
```html
	예)  <h3 style="font-weight:bold;">굵게 </h3>
```

⑤ 글꼴 : font-family
```html
	예)<h3 style="font-family:Malgun Gotic;">글꼴맑은고딕 </h3>
```

⑥ 행간 :  line-height
```html
	예)  <h3 style="line-height:2em;">행간2em </h3>
```

⑦ 정렬 :  text-align
```html
	예)  <h3 style="text-align:center">중간정렬 </h3>
```

⑧ 들여쓰기 :  text-indent
```html
	예)  <h3 style="text-indent:1em">들여쓰기 </h3>
```

⑨ 자간 : letter-spacing
```html
	예)  <h3 style="letter-spacing:3px;">abc 글자간격 </h3>
```

⑩ 밑줄 :  text-decoration
```html
	예)  <h3 style="text-decoration:decoration;">abc밑줄 </h3>
```



<br/>
<br/>
<br/>
<br/>

---

***[실습순서]***
1. **기본 `web005_basic.html`    font 속성**
2. **기본 `web005_basic.html`    문단 속성**
3. **기본 `web005_basic.html`    연습문제**
4. **기본 `web005.html`    미니프로젝트**




<br/>
<br/>
<br/>



***[실습] 1.  font 속성***
>web005_basic.html
```html
    <h3> 1.  FONT속성 </h3>
    <div class="container">
        <p  style="color:red;background-color:pink">1. 글자색상 red / 배경색- pink  인라인방법으로 작성
             1. 글자색 : color
        </p>
        <p style="font-size:25px">
            2. 글자사이즈 : font-size
            font-size:25px
        </p>
        <p style="font-style:italic;">
            3. 기울이기 : font-style:italic / normal
            font-style:italic;
        </p>
        <p style="font-weight:bold;">
            4. 굵게 : font-weight : bold / normal
        </p>
        <p style="font-family:'Courier New', Courier, monospace">
            5. 글꼴 : font-family
            font-family:'Courier New', Courier, monospace
        </p>

    </div>
```
![font](img/web005_001.png)


<br/>
<br/>
<br/>



***[실습] 2.  문단 속성***
>web005_basic.html
```html
    <h3> 2. 문단 속성</h3>
    <div class="container">
        <p style="line-height: 3em;">
            1. 행간     : line-height
            line-height: 3em
        </p>
        <p style="text-align: center;">
            2. 정렬     : text-align
            text-align: center
        </p>
        <p style="text-indent:2em;">
            3. 들여쓰기 : text-indent
            text-indent:2em;
        </p>
        <p style="letter-spacing:5px;">
            4. 자간     : letter-spacing   letter-spacing:5px;
        </p>
        <p style="text-decoration: underline;">
            5. 밑줄     : text-decoration   text-decoration: underline;
        </p>
    </div>
    <!--        -->
    <!--        -->
```
![font](img/web005_002.png)

<br/>
<br/>
<br/>



***[실습] 3.  연습문제***
>web005_basic.html
```html
   <h3>연습문제</h3>
    <div class="container">
        <p  style="color:gray;font-size: 25;">
            연습문제1) 인라인방법을 이용해서 글자색상 gray / 글자사이즈 25px
        </p>
        <p  style="color:orange;line-height: 30px;">
            연습문제2) 인라인방법을 이용해서 글자색상 orange / 행간 30px
        </p>
        <p style="font-family: 'Malgun Gothic', sans-serif;">
            연습문제3) 인라인방법을 이용해서
            글꼴 1순위 Malgun Gothic 2순위 sans-serif
        </p>
        <p  style="text-align: right; letter-spacing: 5px;">
            연습문제4) 인라인방법을 이용해서 오른쪽으로 정렬 / 글자간격5px
        </p>
        <p style="color:red;letter-spacing: 3px;font-weight: bold;font-style:italic; text-indent:1em; text-decoration: line-through;text-align:justify">
            연습문제5) 인라인방법을 이용해서
            글자색상 red / 자간 3px / 굵게 / 기울이기 / 들여쓰기 1em / 취소선
            / 글자의 정렬이 왼쪽-오른쪽 선에 딱 맞춰서 정렬되게 만들기
        </p>
    </div>

```
![font](img/web005_003.png)


<br/>
<br/>
<br/>



4. **기본 `web005.html`    미니프로젝트**

#####  ◎ Question1 - 초기화 reset.css


|NO|QUESTION|
|-|-|
|Q1. |전체 모든 태그의 여백을 빼시오.|
|Q2. |리스트의 불릿기호를 없애시오|
|Q3. |익스플로러 구형브라우저에서 img태그에 테두리가 생김. 테두리 빼시오.|
|Q4. |아직 테이블을 진행하지는 않았지만 테이블의 선을 없애고 선을  0으로 초기화 하시오.|

```css
table{border-collapse: collapse; }
th, td{  padding:10px;  border:0 none; }
```

<br/>
<br/>
<br/>


#####  ◎ Question2 - 기본글꼴 base.css

|NO|QUESTION|
|-|-|
|Q5. |전체 글꼴 1순위 "Malgun Gothic" , 2순위  dotum , 3순위 sans-serif; 로 글자 색상은 검정색으로 지정하시오.|
|Q6. |링크기본, 링크다녀왔을때, 마우스를 올렸을때, 포커스가 갔을때 다음과 같이 지정하시오.|

```css
a:link, a:visited{   color:#000;   text-decoration:none; }
a:hover, a:focus{  color:#f00;   text-decoration:underline; }
```

|NO|QUESTION|
|-|-|
|Q7. |display:none으로 지정시 스크린리더기에서 읽지 못하는 현상이 있을 수 있음. 그래서 숨김설정을 해야함. 다음과 같이 숨김 설정을 하시오.|

```css
.hidden{position:absolute; left:-9999px; width:1px; height:1px; line-height:0; overflow:hidden;}
```


<br/>
<br/>
<br/>


#####  ◎ Question3 - 레이아웃 layout.css


|NO|QUESTION|
|-|-|
|Q8. |다음과 같이 id를 설정하고  높이값과 배경색을 다음과 같이 지정하시오.|

```html
1. 전체 감싸는 영역(div)에   -  id값  wrap        배경색 #ccc
2. header 태그에           -  id값  header       높이: 140px, 배경색: deepskyblue
3. 그 아래 div 태그에       -  id값  visual       높이: 642px, 배경색: lightblue
4. section 태그에          -  id값  content      높이: 258px, 배경색: thistle
5. footer  태그에          -  id값  footer       높이: 74px , 배경색: #333
6. 공통 가운데 속성         - 클래스값  container  가로: 85%, 좌우 중앙으로
```


<br/>
<br/>
<br/>


#####  ◎ Question4 - footer   display:flex 연습

|NO|QUESTION|
|-|-|
|Q9. |#wrap 안에   #footer가  제일 하단에 오도록 **flex** 를 설정하시오.  ※ 참고  - <u>web004_basic2.html - 5번예제</u>|



<br/>
<br/>
<br/>


#####  ◎ Question5 header

|NO|QUESTION|
|-|-|
|Q10. | #head영역에 다음과 같이 네비게이션을 배치하시오.|
- #head영역은 flex
- 안쪽의 영역은 flex 사용 주지말기
- 오른쪽에 배치할 콘텐츠만 margin-left:auto 를 설정



|NO|QUESTION|
|-|-|
|Q11. | form 태그 안에  type="text"   480px*30px   , 들여쓰기 10px, 위아래 바깥쪽여백 20px |
|Q12. | form 태그 안에  type="image"  세로방향 중앙정렬  { vertical-align: middle; } |
|Q13. | nav li   -  display 속성을 이용하여 가로방향으로 배치하되 블록의 속성이 가능하게 만들기 |
|Q14. | nav li a -  display 속성을 이용하여 가로방향으로 배치하되 블록의 속성이 가능하게 만들기(링크영역확대), 좌우 여백 20px|



<br/>
<br/>
<br/>


#####  ◎ Question6  visual

|NO|QUESTION|
|-|-|
|Q15. |  #visual 의 배경 넣기   main.jpg |
|Q16. | .visual_desc 은 **#visual 영역 안에서만 움직이게** 설정 가로 : 15%,  위:15%, 오른쪽 : 75% / 배경색 : #1570a6  , 글자색 : white , 상하좌우 안쪽여백 : 17px|
|Q17. | .visual_desc  안의 h3 글자사이즈 150% |
|Q18. | .visual_desc  안의 p  위아래 바깥쪽여백 20px|
|Q19. | .visual_desc  안의 a  글자색상 white|





<br/>
<br/>
<br/>


#####  ◎ Question7 - content

|NO|QUESTION|
|-|-|
|Q20. | #content 의 ul - display를 이용하여 안쪽의 콘텐츠만큼 배치하기 (동적으로 균등하게 배치) ,  중앙정렬 |
|Q21. |  #content 의 ul li 는 |

- 유연하기 늘어나거나, 줄어들수 있고 , 기본크기는 0% - flex:1 로 설정하기
- 글자사이즈 : 85%, 굵게, 글자길이가 넘어가면 ...표시
overflow:hidden;   text-overflow: ellipsis;  white-space: nowrap;



<br/>
<br/>
<br/>


#####  ◎ Question8  - footer

Q22. #footer li - display 속성을  가로방향으로 배치, 블록의 속성사용가능하게 설정  , 오른쪽 바깥속성 5px
Q23. #footer 에 가로방향으로 정렬
Q24. #footer a 글자색상 white


<br/>
<br/>
<br/>
<br/>


> web005.html
```html
<!DOCTYPE html>
<html lang="ko">
 <head>
  <title>microsoft</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1"/>
  <style>
	/*################ 초기화 reset.css ###############*/
	/*
	Q1. 전체 모든 태그의 여백을 빼시오.
	Q2. 리스트의 불릿기호를 없애시오
	Q3. 익스플로러 구형브라우저에서 img태그에 테두리가 생김. 테두리 빼시오.
	Q4. 아직 테이블을 진행하지는 않았지만 테이블의 선을 없애고 선을  0으로 초기화 하시오.
	table{border-collapse: collapse; }
	th, td{  padding:10px;  border:0 none; }
	*/
	*{margin:0; padding:0;}
	li{list-style:none;}
	img{border:none;} /*익스플로러 구형브라우저에서 img태그에 테두리가 생김*/
	table{border-collapse: collapse; }
	th, td{  padding:10px;  border:0 none; }

	/*################ 기본글꼴 base.css ###############*/
	/*
	Q5. 전체 글꼴 1순위 "Malgun Gothic" , 2순위  dotum , 3순위 sans-serif;
	    글자 색상은 검정색 으로 지정하시오.
	Q6. 링크기본, 링크다녀왔을때, 마우스를 올렸을때, 포커스가 갔을때 다음과 같이 지정하시오.
		a:link, a:visited{   color:#000;   text-decoration:none; }
		a:hover, a:focus{  color:#f00;   text-decoration:underline; }
	Q7. display:none으로 지정시 스크린리더기에서 읽지 못하는 현상이 있을 수 있음. 그래서 숨김설정을 해야함.
	    다음과 같이 숨김 설정을 하시오.
	   .hidden{position:absolute; left:-9999px; width:1px; height:1px; line-height:0; overflow:hidden;}
	*/
	body{  font-family:"Malgun Gothic" , dotum , sans-serif;    color:#000;}
	a:link, a:visited{   /*color:#000; */   text-decoration:none; }
	a:hover, a:focus{  color:#f00;   text-decoration:underline; }

	.hidden{position:absolute; left:-9999px; width:1px; height:1px; line-height:0; overflow:hidden;}


	/*################ 레이아웃 layout.css ###############
	#wrap     {   background-color:#ccc;                      }
	#header   {   height:140px;   background-color:deepskyblue; }
	#visual   {   height:642px; background-color:lightblue;   }
	#content  {   height:258px; background-color:thistle;     }
	#footer   {  height:74px;   background-color:#333;          }
	.container{ width:85%;    margin:0 auto;    }
    */
	/*
	Q8. 다음과 같이 id를 설정하고  높이값과 배경색을 다음과 같이 지정하시오.
		1. 전체 감싸는 영역(div)에   -  id값  wrap        배경색 #ccc
		2. header 태그에           -  id값  header       높이: 140px, 배경색: deepskyblue
		3. 그 아래 div 태그에       -  id값  visual       높이: 642px, 배경색: lightblue
		4. section 태그에          -  id값  content      높이: 258px, 배경색: thistle
		5. footer  태그에          -  id값  footer       높이: 74px , 배경색: #333
		6. 공통 가운데 속성         - 클래스값  container  가로: 85%, 좌우 중앙으로   */

	/*################ footer  ###############*/
    /*Q9. #wrap 안에   #footer가  제일 하단에 오도록 flex 를 설정하시오.
	   ※ 참고  - web004_basic2.html - 5번예제
	*/
	#wrap     {   display: flex;      flex-direction: column;       }
	#header   {   height:140px;  /* background-color:deepskyblue;  */}
	#visual   {   height:540px;  /* background-color:lightblue;  */}
	#footer   {  height:40px;   background-color:#333;     margin-top:auto;       }

	.container{ width:85%;    margin:0 auto;    }


	/*################ header  ###############*/
	/* Q10.  #head영역에 다음과 같이 네비게이션을 배치하시오.
	        - #head영역은 flex
			- 안쪽의 영역은 flex 사용 주지말기
			- 오른쪽에 배치할 콘텐츠만 margin-left:auto 를 설정
	   Q11.  form 태그 안에  type="text"   480px*30px   , 들여쓰기 10px, 위아래 바깥쪽여백 20px
	   Q12.  form 태그 안에  type="image"  세로방향 중앙정렬  { vertical-align: middle; }

	   Q13.  nav li   -  display 속성을 이용하여 가로방향으로 배치하되 블록의 속성이 가능하게 만들기
	   Q14.  nav li a -  display 속성을 이용하여 가로방향으로 배치하되 블록의 속성이 가능하게 만들기(링크영역확대)
	                     좌우 여백 20px

	*/
	#head{ display: flex;   width:100%; }
	#head  #logo , #head  .search{  flex:none; }
	#header #logo{  width:160px;   margin:20px 0; }
	#head  .search{margin-left:auto;     }

	#searchText { width: 480px;	height: 30px;	text-indent: 10px;	margin:20px 0;  }
	.search input[type="image"] {	vertical-align: middle;	}

    #header nav  li{  display: inline-block;  }
    #header nav  li a{  display: inline-block;   padding:0 20px;}


	/*############### visual  ###############*/
	/* Q15. #visual 의 배경 넣기   main.jpg
	   Q16.  .visual_desc 은 #visual 영역 안에서만 움직이게 설정
	        가로 : 15%,  위:15%, 오른쪽 : 75%
			배경색 : #1570a6  , 글자색 : white , 상하좌우 안쪽여백 : 17px
	   Q17. .visual_desc  안의 h3 글자사이즈 150%
	   Q18. .visual_desc  안의 p  위아래 바깥쪽여백 20px
	   Q19. .visual_desc  안의 a  글자색상 white
	*/
	#visual{width:100%;  background:url("img/main.jpg")  no-repeat  center;   position: relative; }
	#visual  .visual_desc{  position:absolute; right:75%; top:15%;  width:15%;  background-color:#1570a6;  padding:17px; color:#fff;  }
	#visual  .visual_desc h3{ font-size:150%; }
	#visual  .visual_desc p{   margin:20px 0; }
	#visual  .visual_desc a{  color:white; }



	/*############### content  ###############*/
	/* Q20.  #content 의 ul - display를 이용하여 안쪽의 콘텐츠만큼 배치하기 (동적으로 균등하게 배치) ,  중앙정렬
	   Q21.  #content 의 ul li 는
	   	- 유연하기 늘어나거나, 줄어들수 있고 , 기본크기는 0% - flex:1 로 설정하기
	    - 글자사이즈 : 85%, 굵게, 글자길이가 넘어가면 ...표시
		   overflow:hidden;   text-overflow: ellipsis;  white-space: nowrap;
	*/
	#content  .container  ul{  display: flex;  margin:2% 0;  text-align: center; }
	#content  .container  ul li{     flex:1;    overflow:hidden;   text-overflow: ellipsis;  white-space: nowrap;   font-size: 85%;
		font-weight: bold;   }

	/*############### footer  ###############*/
	/* Q22. #footer li - display 속성을  가로방향으로 배치, 블록의 속성사용가능하게 설정  , 오른쪽 바깥속성 5px
	   Q23. #footer 에 가로방향으로 정렬
	   Q24. #footer a 글자색상 white

	*/
	#footer {text-align: center;  padding-top:20px}
	#footer  li  {  display: inline-block;   margin-right:5px;    }
	#footer  li a{  color:white; }
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
			<h3 class="hidden">비쥬얼 영역</h3>
			<div class="visual_desc">
				<h4>Surface</h4>
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

```




## Index
■ 1. WEB START!
■ 2. WEB HTML   - 영역(div)잡고 제목(h), 내용(p,img, ul, ol, form, table,,,)
■ 3. WEB CSS(1) - 선택자  id  vs  class
■ 4. WEB CSS(2) - 배치관련  (position, float, display ,  margin/padding)
■ 5. WEB CSS(3) - font관련
■ 6. WEB CSS(4) - css외부적용