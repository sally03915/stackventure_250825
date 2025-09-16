package com.company.java010_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class Calc{
	//멤버변수
	static String name="**계산기**";
	int num1, num2;  char op;  double result;
	//멤버함수
	void input()  {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1>"); num1 = scanner.nextInt();
		System.out.print("숫자2>"); num2 = scanner.nextInt();
		System.out.print("연산자>");   op = scanner.next().charAt(0);
	}
	void opcalc() {
		     if(op=='+') { result = num1+num2;        }
		else if(op=='-') { result = num1-num2;        }
		else if(op=='*') { result = num1*num2;        }		
		else if(op=='/') { result = num1/(double)num2;}
	} 
	void show()   {		//      정수    문자  정수
		opcalc();
		System.out.println(""+ num1 + op + num2 + "=" 
					+  ( op!='/' ? (""+ (int)result) : String.format("%.2f", result)  ) );
	} 
	//생성자-초기화   →     Calc() 기본생성자 자동생성깨짐
	Calc(int n1, int n2, char operator){ num1=n1; num2=n2; op=operator;}
	Calc(){}
}
public class ClassEx007_calc {
	public static void main(String[] args) {
		System.out.println(Calc.name);   //클래스명.static변수 - new를 이용해서 사용X
		
		Calc  c1= new Calc(10,3,'+');  	
		c1.show();    
		
		System.out.println( c1.name);  // 클래스명.static변수 
		// The static field Calc.name should be accessed in a static way
		Calc  c2= new Calc();  
		c2.input();   
		c2.show();
		
		
	}
}
/* 소스파일 												-- 컴파일(번역) -- 바이트코드 
 * ClassEx007.java [class Calc{} /class ClassEx007{}]                Calc.class /  ClassEx007.class
## Class Loader
-------------------------------[## runtime ] 
[method : 정보,static,final /공유]  
  #1.   Calc.class  /ClassEx007.class / Calc.name[**계산기**] / main
---------------------------------------------
[heap: 동적]                     | [stack:임시] 
39번 2번지{num1:0 ,num2:0 ,op:0,result:0.0 } ←  c2 :2번지
38번                                          c1.show();  
37번 1번지{num1:10,num2:3,op:+,result } ←      c1 :1번지
35번 					              println(  Calc.name ); // **계산기**     
						        | #2. main
---------------------------------------------
*/

/*
연습문제4)  class
패키지명 : com.company.java010_ex
클래스명 :  ClassEx007
-- 생성자 작성하시오.
class Calc{
	//상태-멤버변수  :  int num1, num2;  char op;  double result;
	//행위-멤버함수  :  void input()   입력받기
	//	            void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
	//                      void show()    연산출력   
}
public class ClassEx007{
   public static void main(String[] args) {
	Calc  c1= new Calc(10,3,'+');  
	c1.show();
	
	Calc  c2= new Calc();  
	c2.input();   
	c2.show(); 
	 
   }
}

출력내용)
10+3=3

숫자1> 10
숫자2> 3
연산자> /
10/3=3.33
*/