package com.company.java002_ex;

public class VarEx001 {
	public static void main(String[] args) {
		// 자료형 변수명 ($_abc7)
		int		apple=0;   //1-1
		apple=1000;        //1-2
		
		System.out.println("사과가격은 "  + apple + "원입니다");   
		System.out.printf( "사과가격은 %d원입니다\n", apple);    //1-3
		
		apple=2000;  //1-4    A=B (B작업 A에 대입)
		
		System.out.println("사과가격은 "  + apple + "원입니다");   
		System.out.printf( "사과가격은 %d원입니다", apple);    //1-5  %d %f %s
	}
}

/*
연습문제1)  
패키지명 : com.company.java002_ex
클래스명 : VarEx001
출력내용 : 
   1-1.  apple라는 변수만들기
   1-2.  1-1.에서 만든 변수에 1000이라는 데이터 대입하시오.  ( 자료형 int )
   1-3.  1-1.에서 만든 변수이용해서 
           사과가격은 1000원입니다 출력
   1-4.  1-1.에서 만든 변수에 2000이라는 데이터 대입하시오.  
   1-5.  1-1.에서 만든 변수이용해서 
           사과가격은 2000원입니다 출력
*/