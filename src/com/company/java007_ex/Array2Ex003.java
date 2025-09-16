package com.company.java007_ex;

public class Array2Ex003 {
	public static void main(String[] args) {
		int [][] arr = new int[2][3]; //  00 01 02
									  //  10 11 12
		//ver1
		//		arr[0][0] = 101; arr[0][1] = 102; arr[0][2] = 103;
		//		arr[1][0] = 104; arr[1][1] = 105; arr[1][2] = 106;
		
		//ver2
		//		int data=101;
		//		arr[0][0] = data++; arr[0][1] = data++; arr[0][2] = data++;
		//		arr[1][0] = data++; arr[1][1] = data++; arr[1][2] = data++;

		int data=101;
		for(int ch=0; ch<arr.length; ch++) {  //#1. 층의정보
			for(int kan=0; kan<arr[ch].length; kan++) {  //#2. 칸의정보
				arr[ch][kan] = data++;
			}
			//#3. 한층이 끝날때마다 해야할일 
		}
		
		for(int ch=0; ch<arr.length; ch++) {  //#1. 층의정보
			for(int kan=0; kan<arr[ch].length; kan++) {  //#2. 칸의정보
				System.out.print( arr[ch][kan] + "\t" );
			}
			//#3. 한층이 끝날때마다 해야할일 
			System.out.println();
		}
		
	} // end main
}// end class
/*
연습문제11)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex003
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
	101		102		103
	104 	105 	106

*/