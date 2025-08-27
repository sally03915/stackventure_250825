package com.company.java020_jdbc;

import java.util.ArrayList;
import java.util.List; 

public class ThreadCF003_Vector_forEach {
	 //static List<String> list=new ArrayList<>();	//thread-unsafe
	 static List<String> list=new Vector<>();	    //thread-safe
	 
	 public static void main(String[] args) { 
		System.out.println("[1. MAIN START]");
		Thread thread=new Thread(new Thread() {
		  @Override public void run(){
			list.add("111");
			list.add("222");
			list.add("333");
			list.add("444"); 
			// ver1 -  for
			// for문을 돌릴려면 집합의 전체 갯수를 알아야 사용 
			// ver2 - Iterator  
			// ver3 - forEach
			list.forEach((data)->{ 
				try { Thread.sleep(1000); }
				catch (InterruptedException e) { e.printStackTrace(); }
				System.out.println("DATA : " + data);
			});
		  }
		});
		thread.start();
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		list.add("555" );
		System.out.println(list);
		System.out.println("[2. MAIN END]");
	 }
	} 
	 