package com.kh.array;

import java.util.Scanner;

public class Exercise_Array1 {
	// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է� �޾� ���� ū ���� ����մϴ�.");
		
		
		int [] nums = new int [5];
		int max = 0;
		
		System.out.print("���� ���� 5���� �Է��ϼ��� : ");
		// for�� �ۼ�
		for (int i=0; i<nums.length; i++) {
			// - �Է� ���� �� �迭�� ���� 
			 nums[i] = sc.nextInt();
				// ���� ū �� ���
			 if(nums[i] > max) {
				 max = nums[i];
			 }
				// - ���� ū �� ���� �Ǻ�
		} System.out.println("���� ū ���� "+ max +"�Դϴ�.");

	}
}
