package com.kh.array;

public class Exam_Array1 {
	public static void main(String []args) {
		int[]nums = new int [5];
		
		System.out.printf(" �Ҵ��� �ʱⰪ : %d %d %d %d %d",nums[0], nums[1], nums[1],nums[3],nums[4]);
		nums [0]=1;
		nums [1]=2;
		nums [2]=3;
		nums [3]=4;
		nums [4]=5;
		System.out.println();
		System.out.printf(" �� �ʱ�ȭ : %d %d %d %d %d",nums[0], nums[1], nums[2],nums[3],nums[4]);
		System.out.println();
		System.out.println();
		System.out.println("for�� �̿��غ��ô�.");
		System.out.println("===============================");
		
		int [] arrs = new int [5];
		System.out.print(" �Ҵ� �� �ʱⰪ : ");
		// for���� �̿��Ͽ� ���� ��� 
		for (int i =0; i<arrs.length; i++) {
			 System.out.print(arrs[i] + " ");
		 }
		// for���� �̿��Ͽ� ���� �Է�
		for (int i =0; i<arrs.length; i++) {		
			arrs[i]=i+1; // i+1 => i�� 0���� �����ϱ� ������ +1�� ����
		}
		System.out.println();
		System.out.print(" �� �ʱ�ȭ : ");
		for (int i=0; i<arrs.length; i++) {
			System.out.print(arrs [i]+ " ");
		}
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
	}

}
