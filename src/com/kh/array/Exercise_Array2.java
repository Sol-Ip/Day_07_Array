package com.kh.array;

import java.util.Scanner;

public class Exercise_Array2 {
	// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
	// �Է� ���� ������ ����� ���ϴ� ���α׷���
	// �ۼ��Ͻÿ�.
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է� �޾� ��� ���� ���� ����� ����մϴ�.");
		
		int [] nums = new int [5];
		int sum = 0;
		double avg = 0;
		
		System.out.print("���� ���� 5���� �Է��ϼ��� : ");
		// for�� �ۼ�
		for(int i=0; i<nums.length; i++) {
			// �Է� ���� �� �迭�� ���� 
			nums[i] = sc.nextInt();			
		}
		
		for (int i=0; i<nums.length; i++) {
			// sum = sum + i, sum=+i;
			// sum = sum + ~~~[];
			
			sum = sum + nums[i];
		}
		 avg = sum / nums.length;
		// ��� �� ���
			System.out.println("�հ�= "+ sum + ", ���= "+ avg);

	} 
	
}
