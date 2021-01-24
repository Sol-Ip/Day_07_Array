package com.kh.array;

import java.util.Scanner;

public class Exercise_Array2 {
	// 양의 정수 5개를 입력받아 배열에 저장하고
	// 입력 받은 값들의 평균을 구하는 프로그램을
	// 작성하시오.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력 받아 모두 합한 수의 평균을 출력합니다.");
		
		int [] nums = new int [5];
		int sum = 0;
		double avg = 0;
		
		System.out.print("양의 정수 5개를 입력하세요 : ");
		// for문 작성
		for(int i=0; i<nums.length; i++) {
			// 입력 받은 값 배열에 저장 
			nums[i] = sc.nextInt();			
		}
		
		for (int i=0; i<nums.length; i++) {
			// sum = sum + i, sum=+i;
			// sum = sum + ~~~[];
			
			sum = sum + nums[i];
		}
		 avg = sum / nums.length;
		// 평균 값 출력
			System.out.println("합계= "+ sum + ", 평균= "+ avg);

	} 
	
}
