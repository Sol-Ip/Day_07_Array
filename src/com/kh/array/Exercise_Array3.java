package com.kh.array;

import java.util.Scanner;

public class Exercise_Array3 {
	//	�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
	//	��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
	//	�ֹε�Ϲ�ȣ(-����) : 180811-3142447
	//	180811-3******
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		// �ֹε�Ϲ�ȣ �Է�
		System.out.print("�ֹε�Ϲ�ȣ �Է�(-����) : ");
		String str = sc.next();
		// �ֹε�Ϲ�ȣ�� �߶� ���ڹ迭�� ����
		// �ѱ��ڸ� �Է¹ޱ� ���ؼ� ����ϴ� ��ɾ� : charAt(�ڸ���)
		// char �迭�� ���� (�迭 ���� �ϱ� ����)
		char [] origin = new char[str.length()]; //str.length()�� ���ڿ� ��ɾ�
		for(int i=0; i<origin.length; i++) {
			origin[i]=str.charAt(i);
		}
		// ���纻 �迭�� �����ڸ� ���ĺ��� *�� ó���Ͽ� ���� 
		char [] copy = new char[origin.length]; // .length �� �迭 ��ɾ�
		for (int i=0; i<copy.length; i++) {
			// i�� 7�� �� ���� ����
			if(i <= 7) {
				copy[i] = origin[i];
			} else {
				copy[i]= '*';
			}
		}
		// ���
		for(char ch : copy) {
			System.out.print(ch);
		}
	}
}
