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

### 01. WEB START
![WEB-START](img/000-1.png)
![WEB-START](img/000-2.png)
![WEB-START](img/000-3.png)
![WEB-START](img/000-4.png)

<br/>
<br/>
<br/>

■ 웹의 작업순서

|순서|작업내용|
|-|-|
|HTML [ Hyper Text Mark Language]  |구조    예) 회원가입폼|
|CSS|꾸미기  예) 회원가입폼 꾸미기|
|JS/JQUERY   , REACT.JS, VUE.Sjs |움직임 예) 유효성검사규칙(빈칸검사)|
|PHP,ASP,JSP + MYSQL,ORACLE  |서버(전송)  + 데이터베이스(저장)|


<br/>
<br/>
<br/>



##### #1. 진행사항
1. vs code 설치
2. 프로젝트 + 파일만들기
3. html?


##### #2. vs code 설치
**`교재 p22`**
1. https://code.visualstudio.com/  다운로드
2. 설치
3. 확장플러그인 설치
   - preview :   Live Preview
   - korean  :   Korean Language Pack
   - tag     :   Auto Renamte Tag

**Step1)**
![vs code 설치](img/001_setting_vs_code_001.png)
**Step2)**
![vs code 설치](img/001_setting_vs_code_002.png)

|||
|-|-|
|**Step3)**![vs code 설치](img/001_setting_vs_code_003.png)|**Step4)**![vs code 설치](img/001_setting_vs_code_004.png)|
|**Step5)**![vs code 설치](img/001_setting_vs_code_005.png)|**Step6)**![vs code 설치](img/001_setting_vs_code_006.png)|
|**Step7)**![vs code 설치](img/001_setting_vs_code_007.png)||

**Step8)**
![vs code 설치](img/001_setting_vs_code_008.png)
**Step9)**
![vs code 설치](img/001_setting_vs_code_009.png)
**Step10)**
![vs code 설치](img/001_setting_vs_code_010.png)
**Step11)**
![vs code 설치](img/001_setting_vs_code_011.png)


<br/>
<br/>
<br/>


##### #3. 프로젝트 + 파일만들기
**`교재 p29`**
	1.  프로젝트 위치설정 - open folder
	2.  원하는 위치에 새폴더만들기
	3.  html 파일만들기 - 파일+ 클릭
	4. 파일이름.html   ★ 확장자는 .html
	5. ! enter           or    html:5  ★
	6. html5 문서가 자동완성

**Step1)**
![project+file](img/002_프로젝트+파일만들기_001.png)
**Step2)**
![project+file](img/002_프로젝트+파일만들기_002.png)
**Step3)**
![project+file](img/002_프로젝트+파일만들기_003.png)
**Step4)**
![project+file](img/002_프로젝트+파일만들기_004.png)
**Step5)**
![project+file](img/002_프로젝트+파일만들기_005.png)
**Step6)**
![project+file](img/002_프로젝트+파일만들기_006.png)


> 실습1) web001.html

```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

</body>
</html>
```

<br/>
<br/>
<br/>

##### #4. html?
1. HTML
- 웹에서 **정보를 표현할 목적**으로 만든 마크업 언어.
- 웹 페이지를 작성하기 위해 사용되는 언어로 웹 브라우저에게 보일 문자열과
  이를 감싸는 일종의 **해석 기호인 태그**들로 이루어짐
- `마크업` : 문서의 논리적인 **구조를 정의**하고 출력장치에 **어떤 형태**로 보일 것인지 지시하는 역할
- `마크업 언어` : 마크업(태그)의 **형식과 규칙**을 정의한 언어

1) HTML 특징 및 주의사항
① html은 ''(따옴표)와 "" (쌍따옴표) 구분하지 않음
② <P>태그와 == <p>태그는 같지만 읽기 편의상 소문자로 작성하는게 좋음
③ 구조적 설계 지원(시멘틱)
④ 문자의 공백은 몇 개를 입력하든 한 개만 인식하므로 공백을 추가하기 위해서 특수기호  &nbsp; 를 이용해야함

2) html 태그 <html> </html>
: html 문서의 시작과 끝을 표시해주는 태그. lang 속성은 이 문서가 어느나라 언어로 되어있는지 표시

3) head태그 <head></head>
: 문서의 머리부를 나타냄. 현재 문서의 각종 정보 및 제목, 설명 및 스타일시트의 링크를 선언한다.
<title>, <meta>, <link>, <style>, <script>
<title></title>  => 문서의 제목을 나타냄. 왠만하면 title은 필수임! ★


① mark up :   <>  브라우저야~해석해
② 엘리먼트 :   <html> 명령어 내용
③ 규칙 : 시작태그~끝나는태그 / 다 소문자
④ html : head, body영역으로 분리
⑤ head : 문서의 정보 / body : 문서의 내용


