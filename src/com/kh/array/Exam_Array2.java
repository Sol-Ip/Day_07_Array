package com.kh.array;

public class Exam_Array2 {
	public static void main(String[] args) {
		// �迭 - �ǽ����� 1 
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ���� 
		// ������� �迭 �ε����� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int [] arrs = new int[100];
		//���� �Է�
		for (int i = 0; i<100; i++) {
			arrs[i]=i+1;
		}
		// ���� ���
		for (int i = 0; i<100; i++) {
			System.out.println(arrs[i]);
		}
	}
}
