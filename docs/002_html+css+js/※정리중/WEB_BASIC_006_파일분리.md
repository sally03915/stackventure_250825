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

### 06. WEB CSS(4) - css외부적용

**`교재 p70`**


##### #1. 진행사항
1. 파일분리

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




> web006.html
```html
<!DOCTYPE html>
<html lang="ko">
 <head>
  <title>microsoft</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1"/>
  <link href="./css/reset.css" rel="stylesheet">
  <link href="./css/base.css" rel="stylesheet">
  <link href="./css/layout.css" rel="stylesheet">
  <link href="./css/style.css" rel="stylesheet">
 </head>
    <body>
		... 중간생략
	</body>
</html>

```

