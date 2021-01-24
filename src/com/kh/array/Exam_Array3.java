package com.kh.array;

public class Exam_Array3 {
	public static void main(String [] args) {
		//배열 - 실습문제 2
		// 길이가 5인 String 배열을 선언하고,
		// "딸기", "복숭아", "키위", "사과", "바나나"
		// 로 초기화 한 후 배열 인덱스를 이용해서
		//바나나를 출력하시오.
		
//		int []arrs = new int [5];
//		for(int i =0; i<5; i++) {
//			arrs[i] = i+1;
//		}
//		
		String [] fruits = {"딸기","복숭아", "키위", "사과", "바나나"};
//			System.out.println(fruits[4]);
		 for (int i = 0; i<fruits.length; i++) {
			if (fruits[i].equals("바나나")) { //문자열은 == 대신 equals
				System.out.println(fruits[i]);
			}
		 }
		 
//		 if(fruits[0].equals("바나나")); 
//		   {
//		  System.out.println(fruits[0]);
//			} else if (fruits[1].equals("바나나")); {
//				  System.out.println(fruits[1]);
//					} else if (fruits[2].equals("바나나")); {
//						  System.out.println(fruits[2]);
//					} else if (fruits[3].equals("바나나")); {
//						  System.out.println(fruits[3]);
//					} else if (fruits[4].equals("바나나")); {
//						  System.out.println(fruits[4]);
//					}
	           }
 
		}
	

