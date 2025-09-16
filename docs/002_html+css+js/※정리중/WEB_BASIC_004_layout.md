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

### 04. WEB CSS(2) - 배치관련  (position, float, display ,  margin/padding)

##### #1. 진행사항
1. 배치방법 : position, float, display
2. position
3. dispaly
4. display:flex
5. margin , padding


<br/>
<br/>
<br/>

**Step1)** 클론코딩 완성!
![WEB PATTERN](img/web_com.png)

> `But`.....우리가 이번을 통해 할수 있는 범위는....



<br/>
<br/>
<br/>



---

***[이론정리]***
##### #1.  ***block  vs   inline***
**`교재 p123`**

**가.  box model**
        box란?   <u>콘텐츠가 자리하는 영역</u>     예)  div  h1  p  span

**나.  블록요소**
        - 블록요소안에는 텍스트(문자)와 인라인 요소를 포함. 경우에 따라서 블록 포함
        -  특징1 : <u>width/ height값을 줄수 있다.</u>  / 특징2 : 앞뒤로 줄바꿈이 일어남.
            예)  div, h2, p
        - 참고) width : 크로스브라우징시 ie하위버젼에서도 호환가능하게 함.

**다. 인라인 요소**
        - <u>텍스트(문자)를 꾸미거나 기능을 하는 요소</u>
        - 특징1 : width/ height 값을 줄수 없다. / 특징2 : 앞뒤로 줄바꿈이 안일어남
            예)  span
<br/>
<br/>

![LAYOUT](img/web004_001.png)

<br/>
<br/>
<br/>
<br/>

##### #2.    float
**`교재 p141`**
- 정의: 박스를 배치하는 기술, **오른쪽 왼쪽에 배치**하여 <u>아래 콘텐츠들이 주변을 흐르게 만듦</u>
-  주의사항 :  width / float 끊기
    float끊는 5가지 방법:
	가.   아래 콘텐츠에 clear:both
	나.   감싸는 박스에 height
	다.   감싸는 박스에 overflow:hidden;
	라.   감싸는 박스에 float
	바.   감싸는 박스에 clearfix
<br/>
<br/>

![LAYOUT](img/web004_002.png)



<br/>
<br/>
<br/>
<br/>


##### #3.   position
**`교재 p145`**
- 정의: 박스를 **원하는 위치에 배치**하는 방법
- 종류 : [static,  relative, **absolute**, **fixed**]


    **#1. position:static**
        정의 : 원래그대로의 상태 - 요소를 이동하거나 겹칠 수 없다
            ( top, right, bottom, left  사용못함)

    **#2. position:relative**
        정의 : 박스를 원하는 위치에 배치가 가능한데 <u>[ 박스자리가 유지됨. ]</u>
        기준점 : 움직일때 기준점이 <u>[현재위치]</u>

    **#3. position:absolute**
        정의 : 박스를 원하는 위치에 배치가 가능한데 <u>[ 박스자리가 유지 안됨. ]</u>
        기준점1 : 움직일때 기준점이 <u>[브라우저]</u>
        기준점2 : 만약 감싸는 박스에 position:relative가 있다면 움직일때 기준점이[감싸는 박스]

    **#4. position:fixed**
        정의 : 박스배치시 기준점이 <u>[브라우저]</u>

        z-index :   해당요소에 대한 순차적인 위치를 지정함.
            가. 가장  숫자가 [크게] 지정된 요소가 항상 제일 [앞쪽]에 위치
            나.  주의사항 : ★ position 이 적용된 요소에서만 지정가능
            다.  number : 숫자로지정 ,  auto (기본값) : 해당요소의 부모와 요소순서를 같게 , inherit : 상속
![LAYOUT](img/web004_003.png)



<br/>
<br/>
<br/>
<br/>


##### #4.    display
**`교재 p208`**
-  속성을 바꾸는 기술 #2  display
-  정의 :  요소의 성격을 바꾸는 성질
-  종류 :  block , inline, inline-block , none , flex
    **가.  display:block**
                특징 :  [인라인]성격을  [블록]성격으로
                사용 :  줄바꿈 /  링크영역확대
    **나.  display:inline**
                특징 : [블록]성격을 [인라인] 성격으로 / 반각이생김 / 정렬은 부모요소에
                사용 : width가 필요없는 가로방향 배치시
    **다.  display:none**
                특징 : 화면상에 안보이게 숨기기 / 주의사항 : h태그에 사용하지 말기
    **라.   display:inline-block**
                특징 : [인라인]속성을 유지하되 [블록]의 특징사용가능
                사용 : 줄바꿈은 안되고 width, height, padding, margin 등의사용이 가능함.
![LAYOUT](img/web004_004.png)



<br/>
<br/>
<br/>
<br/>



##### #5.    여백   margin/padding

**`교재 p115/p118`**
1. **margin**: 콘텐츠 **바깥쪽**
	margin: 10px;           /* 위 오른쪽 아래  왼쪽 */
	margin-bottom:10px;   /* 아래쪽 */
	margin:10px 50px;
	margin:10px 30px 50px;
	margin:10px 30px 50px 70px;

2. **padding**: 콘텐츠 **안쪽**
	padding: 10px;         /* 위 오른쪽 아래  왼쪽 */
	padding-bottom:10px;   /* 아래쪽 */
	padding:10px 50px;
	padding:10px 30px 50px;
	padding:10px 30px 50px 70px;
![LAYOUT](img/web004_005.png)



<br/>
<br/>
<br/>
<br/>

---

***[실습순서]***
1. **기본 `web004_basic1.html`    block , inline**
2. **기본 `web004_basic1.html`    배치방법 (float)**
3. **기본 `web004_basic1.html`    배치방법 (position)**
4. **기본 `web004_basic1.html`    배치방법 (dispaly)**
5. **기본 `web004_basic1.html`    배치방법 (padding/margin)**



<br/>
<br/>
<br/>



***[실습] 1.  block , inline***
>web004_basic1.html
```html
    <h3>001. BLOCK VS INLINE</h3>
    <div class="container">
        <dl>
            <dt>box model</dt>
            <dd>콘텐츠가 자리하는 영역</dd>
            <dd><span style="color:green">블록  </span>요소 - width/height O, 앞뒤줄바꿈 O , div,h3,p</dd>
            <dd><span>인라인</span>요소  - width/height X, 앞뒤줄바꿈 X , span</dd>
        </dl>
    </div>

    <div class="container">
        <p>Q. img태그는?</p>
        <p><img src="img/egg.jpg"  alt="블록인지 인라인인지" style="width:50px"/> 너 모야?
            인라인 - 텍스트(문자)를 꾸미거나 [기능]을 하는 요소 </p>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_006.png)|

<br/>
<br/>
<br/>

***[실습] 2. float***
>web004_basic1.html
```css
    /*     배치관련1. float         */
    /*     배치관련1. float         */
    .f1{ height:100px;  }
    .item{  background-color:darkturquoise; color:white; padding:2%; width:20%;   }
    .i1{ background-color:darkturquoise;   float:left; }
    .i2{ background-color:deepskyblue;   float:right; }
```

```html
    <h3>002. 배치관련(1) float</h3>
    <div   class="container  f1">
        <div class="item  i1">LEFT</div>
        <div class="item  i2">RIGHT</div>
        <div>ABCDEFCHIG</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_007.png)|

<br/>
<br/>
<br/>

***[실습] 3.  position***
>web004_basic1.html
```css
    /*     배치관련2. position         */
    /*     배치관련2. position         */
    .me{  background-color:darksalmon;  width:100px; color:white; padding:10px;  }
    .p1{   position:relative;   top:-50px; left:100px  }
    .p1 .me{  position:absolute;  top:0; right:0;   }

    .p2  .me{  position:fixed; bottom:0; right:0;  }
```

```html
    <h3>003. 배치관련(2) position</h3>
    <div   class="container position  p1">
        <p class="me">WHERE I AM?</p>
    </div>
    <div   class="container position  p2">
        <p class="me">WHERE I AM?  position:fixed 브라우저에 콕!</p>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_008.png)|

<br/>
<br/>
<br/>

***[실습] 4.  display***
>web004_basic1.html
```css
    /*     배치관련3. dispaly         */
    /*     배치관련3. display         */
    .d1{  text-align: center;}
    .d1  li{  display: inline;   /* width:300px; */ }


    .d2{  text-align: center;}
    .d2  li{  display: inline-block;   width:300px;   }
```

```html
    <h3>004. 배치관련(3) display</h3>
    <div   class="container">
        <!--  block -->
        <ul>
            <li>APPLE</li>
            <li>banana</li>
            <li>coconut</li>
        </ul>

        <hr/>
        <!--  block -->
        <ul    class="d1">
            <li>APPLE</li>
            <li>banana</li>
            <li>coconut</li>
        </ul>


        <!--  inline-block -->
        <ul    class="d2">
            <li>APPLE</li>
            <li>banana</li>
            <li>coconut</li>
        </ul>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_009.png)|

<br/>
<br/>
<br/>

***[실습] 5.  margin/padding***
>web004_basic1.html
```css
    /*     배치관련4. margin/padding         */
    /*     배치관련4. margin/padding         */
    .mp  .me{  padding:50px;   margin-left:100px   }
```

```html
    <h3>005. 배치관련(4) margin/padding</h3>
    <div   class="container mp">
        <p class="me">WHERE I AM?</p>
    </div>

```
|VIEW|
|-|
|![LAYOUT](img/web004_010.png)|



<br/>
<br/>
<br/>

<br/>
<br/>
<br/>


##### #6.    display:flex

***[실습] 1.  flex***
>web004_basic2.html
```css
   *{ margin:0; padding:0;}
    /*
    1. 컨테이너에 적용하는 속성
    2. 아이템에 적용하는 속성
    [   [.item][.item][.item]  ].container
    */
     h3{ padding:2%; border-left:10px solid burlywood;  background-color: beige;}
    .container{   background-color:#ccc;    width:80%;  margin: 2% auto;  padding:2%; }
    .item{  background-color:darkturquoise; color:white; padding:2%  }

    .i1{ background-color:darkturquoise;  }
    .i2{ background-color:deepskyblue;  }
    .i3{ background-color:blueviolet;  }

    /* ver-1. flex(width만), block(100%) */
    .c1{  display: flex;   }
    .c2{  display: block;  }
```

```html
    <h3>001. display:flex(내용물만큼만), block (가로100%)</h3>
    <div class="container c1">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>

    <div class="container c2">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_011.png)|





<br/>
<br/>
<br/>




***[실습] 2.  flex***
>web004_basic2.html
```css
    /* ver-2. 방향 */
    .c3{  display: flex;  flex-direction:row;  }
    .c4{  display: flex;  flex-direction:column;  }
    .c5{  display: flex;  flex-direction:row-reverse;  }
    .c6{   display:flex; flex-direction:column-reverse;  }
```

```html
   <!--                    -->
    <!--                    -->
    <h3>002. flex-direction(배치 방향 설정)</h3>
    <div class="container c3">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>

    <div class="container c4">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>

    <div class="container c5">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>

    <div class="container c6">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_012.png)|





<br/>
<br/>
<br/>

***[실습] 3.  flex***
>web004_basic2.html
```css
    /* ver-3  스크롤 없는 100% 레이아웃 */
    html,body{   height: 100%; }
    .c7     {   display: flex;  flex:1;  }  /* 확장1 */
    .c7  .i1{   display: flex;  width:200px; flex:none; } /* flex:none; 확장(0), 축소(0), 기본크기(auto)  */
    .c7  .i2{   display: flex;               flex:1;   }  /* flex:1;   확장(1), 축소(1), 기본크기(0)  */
```

```html
    <!--                    -->
    <!--                    -->
    <h3>003. 스크롤 없는 100% 레이아웃 </h3>
    <div class="container c7">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_013.png)|





<br/>
<br/>
<br/>




***[실습] 4.  flex***
>web004_basic2.html
```css
   /* ver-4  네비게이션 */
    .c8{   display: flex;  }
    .c8  .i1 , .c8  .i2, .c8 .i3 {   flex:none;   } /* flex:none; 확장(0), 축소(0), 기본크기(auto)  */
    .c8 .i3 { margin-left:auto;}
```

```html
    <!--                    -->
    <!--                    -->
    <h3>004. 네비게이션 </h3>
    <div class="container c8">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_014.png)|





<br/>
<br/>
<br/>

***[실습] 5.  flex***
>web004_basic2.html
```css
    /* ver-5  footer */
    .c9{   display: flex; 	flex-direction: column;  height: 300px;	 }
    .c9  .i1{ height:50px; margin-top:auto; }
```

```html
    <!--                    -->
    <!--                    -->
    <h3>005. 바닥에 붙는 footer </h3>
    <div class="container c9">
        <div class="item  i1">aaa</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_015.png)|





<br/>
<br/>
<br/>

***[실습] 6.  flex***
>web004_basic2.html
```css
    /* ver-6  left   center  right */
    .c10{   display: flex; 	 justify-content: space-between;  }
```

```html
    <!--                    -->
    <!--                    -->
    <h3>006. left, center, right </h3>
    <div class="container c10">
        <div class="item  i1">aaa</div>
        <div class="item  i2">bbbbb</div>
        <div class="item  i3">cc</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_016.png)|





<br/>
<br/>
<br/>




***[실습] 7.  flex***
>web004_basic2.html
```css
    /* ver-7  center */
    .c11{   display: flex; 	    flex-direction: column;   height: 100px;  }
    .c11  .item{  margin:auto; font-size:20px;}
```

```html
    <!--                    -->
    <!--                    -->
    <h3>007. center </h3>
    <div class="container c11">
        <div class="item  i1">aaa</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_017.png)|





<br/>
<br/>
<br/>


***[실습] 8.  flex***
>web004_basic2.html
```css
    /* ver-8  유동 width */
    .c12{   display: flex; 	    height: 100px;  }
    .c12  .item{   flex:0  1  auto;  max-width:300px;
        overflow:hidden;      text-overflow: ellipsis;  white-space: nowrap;
        height: 38px;  padding: 8px;     margin: 16px 8px 0;
      }
    .c12  .i4{ margin-left:auto; }
```

```html
    <!--                    -->
    <!--                    -->
    <h3>008. 유동 width </h3>
    <div class="container c12">
        <div class="item  i1">가나다라마바사아자차카타파하가나다라마바사아자차카타파하</div>
        <div class="item  i2">가나다라마바사</div>
        <div class="item  i3">가나다라</div>
        <div class="item  i4">가나다라</div>
    </div>

```
|VIEW|
|-|
|![LAYOUT](img/web004_018.png)|





<br/>
<br/>
<br/>




***[실습] 9.  flex***
>web004_basic2.html
```css
    /* ver-9  왼상, 왼하, 오른쪽상, 오른쪽하 */
    .c13{
        display: flex;	    height: 400px;   width:400px;
		align-content: space-around;  /* 항목균등간격으로 정렬 */
		justify-content: space-around;/* 항목균등간격으로 정렬 */
        flex-flow: column wrap;  /* 박스를 벗어났을때 줄바꿈속성성 */
    }
    .c13  .item{
        width:150px; height:150px;  display: flex;
        flex-direction: column;  /*  위에서 아래로방향 */
        margin:2%;
    }
```

```html
    <!--                    -->
    <!--                    -->
    <h3>009. 위, 아래로 흐르는 목록 </h3>
    <div class="container c13">
        <div class="item  i1">AAA</div>
        <div class="item  i2">BBB</div>
        <div class="item  i3">CCC</div>
        <div class="item  i4">DDD</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_019.png)|





<br/>
<br/>
<br/>

***[실습] 10.  flex***
>web004_basic2.html
```css
    /* ver-10   */
    .c14{  width: 60%;     margin: 0 auto;    display: flex;   flex-wrap: wrap;   padding:0; }
    .c14   .item{padding:1%; margin:1%;
           display: flex;   flex-direction: column;   flex: none;    flex-basis: 29.33%;
    }
```

```html
    <!--                    -->
    <!--                    -->
    <h3>010. 가로세로 비율유지 박스 </h3>
    <div class="container c14">
        <div class="item  i1">AAA</div>
        <div class="item  i2">BBB</div>
        <div class="item  i3">CCC</div>
        <div class="item  i4">DDD</div>
    </div>
```
|VIEW|
|-|
|![LAYOUT](img/web004_010.png)|





<br/>
<br/>
<br/>

## Index
■ 1. WEB START!
■ 2. WEB HTML   - 영역(div)잡고 제목(h), 내용(p,img, ul, ol, form, table,,,)
■ 3. WEB CSS(1) - 선택자  id  vs  class
■ 4. WEB CSS(2) - 배치관련  (position, float, display ,  margin/padding)
■ 5. WEB CSS(3) - font관련
■ 6. WEB CSS(4) - css외부적용