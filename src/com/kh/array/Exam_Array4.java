package com.kh.array;

public class Exam_Array4 {
	public static void main(String []args) {
		//�迭�� for-each ��
		int [] nums = {1,2,3,4,5};
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println();
		System.out.println("for-each�� ���");
		for (int k : nums) {
			System.out.println(k);
		}
			System.out.println();
			String [] fruits = {"����","������", "Ű��", "���", "�ٳ���"};
			for(String fruitsName : fruits) {
				System.out.println(fruitsName);
		}
	}
}
