package Example_Q_Array;

import java.util.Scanner;

//����07
// ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� �� ��ŭ ������ �迭�� 
// ���� �� �Ҵ� �ϰ�, �迭�� ũ�� ��ŭ ����ڰ� ���� ���� �Է��Ͽ� 
// ������ �ε����� ���� �ʱ�ȭ �ϼ���. 
// �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� �������� �� ��� �ϼ���.
// ex)
// ����: 5
// �迭 0��° �ε����� ���� ��: 4
// �迭 1��° �ε����� ���� ��: -4
// �迭 2��° �ε����� ���� ��: 3
// �迭 3��° �ε����� ���� ��: -3
// �迭 4��° �ε����� ���� ��: 2
// 4 -4 3 -3 2
// ����: 2

public class Exer_07 {
	public static void main(String[] args) {
		// 1. ���� ���� �Է¹ް� (���� ���� �Է�), ������ �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		// 2. �迭�� ũ�� ��ŭ ����ڰ� ���� �Է� + ���� �ε��� �� �ʱ�ȭ
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + " ��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
		}

		// 3. �迭 ��ü �� ���� �� �� ���
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
}
