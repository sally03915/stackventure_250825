package com.company.java006_ex;

public class ArrayEx001 {
	public static void main(String[] args) {
	 double[] arr=	{1.1  , 1.2  , 1.3  , 1.4  , 1.5};
	 
//	 System.out.print(arr[0] + "\t"); //1.1
//	 System.out.print(arr[1] + "\t"); //1.2
	 
//   arr.length - 5 - 0~4
	 for(int i=0; i<arr.length; i++){ System.out.print(arr[i] + "\t");}
	 
	}// end main
}// end class
/*
연습문제1)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx001
    1. 배열명 : arr
    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5
    3. for + length 로 출력
*/