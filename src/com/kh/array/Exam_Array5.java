package com.kh.array;
 // ���� ���� example
public class Exam_Array5 {
	public static void main(String []args) {
		// �� ���� ������ �ϳ��� �迭�� ����Ű�� ����
		int [] arr1 = new int [4];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		
		int [] arr2 = arr1;
		
		arr2[0] = 5;
		
		System.out.println("���ص� �Ǵ� : " + arr2[0] + " ���ϸ� �� �Ǵ� : "+ arr1[0]);
	}
}
