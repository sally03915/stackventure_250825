package com.company.java006_ex;

public class ForEx008 {
	public static void main(String[] args) {
		//for , while , do while 3가지 버젼으로   1~10까지 3의 배수의 합 : 18
		// ver-1  1이  3의 배수라면  합을더해주변수에누적
		//		  2가  3의 배수라면  합을더해주변수에누적 
		//		  3이  3의 배수라면  합을더해주변수에누적 
		// ver-2  if(1이  3의 배수라면){  합을더해주변수에누적 }   if(1%3==0){  sum+=1;}
		//		  if(2가  3의 배수라면){  합을더해주변수에누적 }   if(2%3==0){  sum+=2;}
		//		  if(3이  3의 배수라면){  합을더해주변수에누적 }   if(3%3==0){  sum+=3;}
		
		//변수  / 입력+처리  / 출력
		int sum=0; 
		for(int i=1; i<=10; i++){  if(i%3==0){  sum+=i;} }
		System.out.println("1~10까지 3의 배수의 합 :  " + sum  + "\n");   
		
		sum=0; 
		int i=1;  while(i<=10){  if(i%3==0){  sum+=i;}      i++;}
		System.out.println("1~10까지 3의 배수의 합 :  " + sum  + "\n");
		
		sum=0;  
		i=1; do{  if(i%3==0){  sum+=i;}      i++;} while(i<=10);
		System.out.println("1~10까지 3의 배수의 합 :  " + sum  + "\n");
	}
}
/*
연습문제8)  for/while/do while
패키지명 : com.company.java006_ex
클래스명 :  RepeatEx008
for , while , do while 3가지 버젼으로 
1~10까지 3의 배수의 합 : 18

힌트)
ver-1)
1이  3의 배수라면  합을더해주변수에누적
2가  3의 배수라면  합을더해주변수에누적
3이  3의 배수라면  합을더해주변수에누적

ver-2)
if( 1이  3의 배수라면 ){ 합을더해주변수에누적 }
if( 2가  3의 배수라면 ){ 합을더해주변수에누적 }
if( 3이  3의 배수라면 ){ 합을더해주변수에누적 }
*/