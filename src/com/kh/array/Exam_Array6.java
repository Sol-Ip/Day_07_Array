package com.kh.array;
	//���� ���� example
public class Exam_Array6 {
	public static void main(String []args) {
		// �� ���� ������ ���� �ٸ� �迭�� ����Ű�� ���� 
		int [] arr1 = {1,2,3,4} ;
		int [] arr2 = new int[4]; // ���ο� ���� �Ҵ�
		for(int i =0; i<arr1.length; i++) {
			arr2[i]=arr1[i]; // arr1�� ���� arr2�� ����
		}
		
		arr2[0]=5;
		
		System.out.println("���ص� �Ǵ� : "+ arr2[0]+" ���ϸ� �� �Ǵ� : "+ arr1[0]);
		
	}
}
