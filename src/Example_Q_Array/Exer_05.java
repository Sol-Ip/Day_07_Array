package Example_Q_Array;

import java.util.Scanner;
//���ڿ��� �Է¹޾� ���� �ϳ��ϳ��� �迭�� �ְ� 
//�˻��� ���ڰ� ���ڿ��� �� �� ���ִ��� ������ 
//�� ��° �ε����� ��ġ�ϴ� �� �ε����� ����ϼ���
//ex )
//���ڿ� : application
//���� : i
//application�� i�� �����ϴ� ��ġ(�ε���) : 4 8
//i ���� : 2

public class Exer_05 {
	public static void main(String[] args) {

		// 1. ����ڿ��� ���ڿ��� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		// 2. ����ڰ� �Է��� ���ڿ�(str)��
		// ���� �ϳ��ϳ��� char�迭�� �ֱ�

		// ���� ����ڰ� �Է��� ���ڿ� ���̸�ŭ��
		// char�迭�� �Ҵ�
		char[] arr = new char[str.length()];
		// �ݺ����� ���� str.charAt(i) ���� arr[i] �� ��� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i); // arr : arr[0] -> a, arr[1] -> p
		}

		// 3. �˻��� ���ڰ� ���ڿ��� ��� ����ִ�����
		// ��� �ε����� �ִ��� �ľ�

		int count = 0;
		// �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ������ ����
		// ���ڿ����� ������ ���ڰ� �߻��� ������ 1�� ���� ������ ��

		// �ݺ����� �����ϱ� ���� ��¹� �ۼ�
		System.out.print(str + "��" + ch + "�� �����ϴ� ��ġ(�ε���) : ");

		// �ε������� �����ϱ� ���� �ݺ��� ���
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println(); // ����
		System.out.println(ch + "���� : " + count);
	}
}

		  
		
	