package com.kh.array;

import java.util.Scanner;

public class Exercise_Array1 {
	// 양의 정수 5개를 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하는 프로그램을 작성하시오.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력 받아 가장 큰 수를 출력합니다.");
		
		
		int [] nums = new int [5];
		int max = 0;
		
		System.out.print("양의 정수 5개를 입력하세요 : ");
		// for문 작성
		for (int i=0; i<nums.length; i++) {
			// - 입력 받은 값 배열에 저장 
			 nums[i] = sc.nextInt();
				// 가장 큰 수 출력
			 if(nums[i] > max) {
				 max = nums[i];
			 }
				// - 가장 큰 수 인지 판별
		} System.out.println("가장 큰 수는 "+ max +"입니다.");

	}
}
