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

### 02. WEB PATTERN
**`교재 p32`**

- ***영역잡고 제목내용***
    영역(**div**)잡고 제목(**h**), 내용(**p, form, table, ul, ol,,,**)

<br/>
<br/>
<br/>




**Step1)** 클론코딩 완성!
![WEB PATTERN](img/web_com.png)

<br/>
<br/>
<br/>

<br/>
<br/>
<br/>

<br/>
<br/>
<br/>

이렇게 하고 싶었는데....
> `But`.....우리가 이번을 통해 할수 있는 범위는....

**Step2)**
![WEB PATTERN](img/web002.png)


<br/>
<br/>
<br/>




---

***[이론정리]***
##### #1. 영역관련태그 ( div )
div(division)  그룹핑태그
   그룹핑하기 위한용도 / 다른콘텐츠와 분리  cf) span 인라인에서 그룹핑

    관련1) body 태그 <body></body>
    : 몸통부를 나타냄. 화면에서 출력해서 보여줄 모든 정보 / 내용들을 작성하는 구분
    관련2) br태그  => 줄바꿈 태그
    공백이 몇개가 있든 하나의 공백으로 인식하기 때문에 줄바꿈을 하고 싶다면 br태그를 이용해야함!


![WEB PATTERN](img/web002_1.png)


<br/>
<br/>
<br/>




##### #2. 제목태그 (h1~h6)
h(heading)    제목태그
  의미 : html 구조상에서 문서 내부의 콘텐츠 제목 정의
  사용 : 각 부분별 논리적 규칙에 맞춰 heading 계층을 구성
    h1 :  로고/상호명/주요내용
    h2 :  메인메뉴, 이용약관
    h3 :  핵심콘텐츠
    h4 :  서브콘텐츠1
    h5 :  서브콘텐츠2
    h6 :  서브콘텐츠3


##### #3. 문단태그 p , pre
p(paragraph)  문단태그
  의미상 문단을 구분하기 위한 용도로 사용
  텍스트 및 인라인 요소를 담을 수 있다.

    관련) pre태그는 여러 공백이 인식 가능하고 줄 바꿈등을 포함하여 입력한 내용 그대로를 표현

##### #4. img
- 이미지도 내용이다
- 텍스트 대신에 이미지로 내용을 전달하는목적
  ```html
        <p><img src="images/googl.png"  alt="구글로고"></p>
  ```

##### #5. link a
- a(link)
- a , 앵커 : 파일뿐만아니라 웹페이지의 특정부분을 가리킬수 있음
- 형식 :
```html
    <a href="경로"  title="뮤직바로가기 링크">MUSIC</a>
    <a href="경로"  title="어떤 경로 링크"  target="_blank">경로</a>
```

##### #6. 태그정리 - list
- 리스트 ul, ol, dl

가. list
```html
 1. <li>     :   list  항목
 2. <dt> describes  term 제목
    <dd> describes  설명
```

나. 항목을 묶는방법
```html
    <ul>  :  unordered list   순서가 필요없는 리스트
    <ol>  :  ordered list      순서가 필요한 리스트
    <dl> :  definition list    내가 정의내린리스트
                ★ 주의사항 :ul , ol은 li태그만 감쌀수 있음.
                ★ 주의사항 :dl은 dt, dd태그만 감쌀수 있음.
```
```html
    <ul>
        <li>사과</li><li>바나나</li><li>코코넛</li>
    </ul>
```
```html
    <ol>
        <li>1차서류심사</li><li>2차면접</li><li>3신체검사</li>
    </ol>
```
```html
    <dl>
            <dt>삶은계란?</dt>
            <dd><img src="1.jpg" alt="맛있는 삶은계란사진"/></dd>
            <dd>아침대용으로 간편하게 먹을수있는 고단백 영양식이</dd>
    </dl>
```

##### #7. 시멘틱마크업
* 정의 : 컴퓨터가 웹정보자원의 의미를 이해할 수 있도록 문서의 [논리적인 구조]를 묘사하는 것
        ★ 태그만 봤을 때 태그의 목적을 알 수 없어 id나 class를 반드시 추가
* 장점 :
  - 웹접근성이 좋아짐
          - SEO(search engine optimization) : 검색엔진 최적화
  - 코드의 가독성이 좋아짐
  - 코드의 재사용성이 좋아짐

* html4.0 + xhtml1.0 문제점 : div태그 남발
<div id="wrapper">
<div id="header"></div>
<div id="main"></div>
<div id="footer"></div>
</div>

* html5.0 : header(문서의 정보) , footer(꼬릿말), section(의미를 부여한 영역) , nav(네비게이션)
        , article(위젯, 신문기사, 블로그 : 수정이 안되고 재활용하는것) ,   aside(광고)

```html
<div id="wrapper">
<header id="header">
<h1>로고</h1>
<nav><h2>주메뉴</h2></nav>
</header>
<section id="main">
<h3>주요내용1</h3>
<article>
<h4>신문기사</h4>
<header>제목</header><p>내용</p><footer>작성자</footer>
</article>
</section>
<aside>광고</aside>
<footer id="footer">COPYRIGHT</footer>
</div>
```

* OUTLINE 검사 : https://gsnedders.html5.org/outliner/



<br/>
<br/>
<br/>



***[실습] BASIC***
![WEB PATTERN](img/web002_basic.png)
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
        <h3>1. 제목태그</h3>
        <pre>
        h1~h6
        </pre>

        <h3>2. 내용태그(p)-텍스트</h3>
        <p>
            내용-text
        </p>

        <h3>3. 내용태그(p)-이미지</h3>
        <p><img src="img/google_logo.svg"  alt="구글로고"></p>

        <h3>4. a 링크</h3>
        <p><a href="https://www.google.com/"  title="구글 바로가기기 링크">MUSIC</a></p>
        <p><a href="https://www.google.com/"  title="구글 새로창 열기 링크"  target="_blank">경로</a>
        <!--  이미지를 클릭하면 구글로 넘어가는 링크  -->
        <p><a href="https://www.google.com/"><img src="img/google_logo.svg"  alt="구글로고"></a></p>


        <h3>list</h3>
        <ul>
            <li>사과</li><li>바나나</li><li>코코넛</li>
        </ul>
        <ol>
            <li>1차서류심사</li><li>2차면접</li><li>3신체검사</li>
        </ol>
        <dl>
            <dt>삶은계란?</dt>
            <dd><img src="img/egg.jpg" alt="맛있는 삶은계란사진"/></dd>
            <dd>아침대용으로 간편하게 먹을수있는 고단백 영양식이</dd>
        </dl>
    </div>

</body>
</html>
```


<br/>
<br/>
<br/>

***[실습] EX***
![WEB PATTERN](img/web002.png)

>web002_layout.html
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
	<div>
		<header>
		  <div>
			<div>
				<h1>
					<a href="http://www.microsoft.com" title="마이크로소프트">
						<img src="img/mslogo.png" alt="로고"/>
					</a>
				</h1>
				<form action="https://www.microsoft.com/ko-kr/search/result.aspx" method="GET">
					<div class="searchArea">
						<input id="searchText" type="text" name="q" placeholder="Microsoft.com 검색" title="Microsoft 검색" maxlength="20"/>
						<input id="searchButton" type="image" name="searchButton" src="img/search.ltr.png" alt="돋보기 이미지" title="돋보기 이미지"/>
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

		<div>
		  <div>
			<h3>비쥬얼 영역</h3>
			<div>
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

		<section>
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

		<footer>
			<div>
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




<br/>
<br/>
<br/>




##### #8.validator
1. validator 검사
	[ https://validator.w3.org/ ]  - [ Validate by File Upload ] - [파일선택]
	[파일] - [새파일] - [설정템플릿]

2. html5-outliner설치
[html5-outliner설치]
(https://chromewebstore.google.com/detail/html5-outliner/afoibpobokebhgfnknfndkgemglggomo?pli=1)

https://gsnedders.html5.org/outliner/


![WEB PATTERN](img/web002_81.png)
![WEB PATTERN](img/web002_82.png)


<br/>
<br/>
<br/>
<br/>
<br/>



---

## Index
■ 1. WEB START!
■ 2. WEB HTML   - 영역(div)잡고 제목(h), 내용(p,img, ul, ol, form, table,,,)
■ 3. WEB CSS(1) - 선택자  id  vs  class
■ 4. WEB CSS(2) - 배치관련  (position, float, display ,  margin/padding)
■ 5. WEB CSS(3) - font관련
■ 6. WEB CSS(4) - css외부적용