package Example_Q_Array;

import java.util.Scanner;

public class Exer_08 {

//   ����08
//	3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� 
//	������������ ���� �ְ�, �߰� ���ĺ��� �������� 1�� �����Ͽ� 
//	������������ ���� �־� ����ϼ���. 
//	��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� 
//	���ٽ� �Է��ϼ��䡱�� ����ϰ� �ٽ� ������ �޵��� �ϼ���.
//
//	ex)
//	����: 4
//	�ٽ��Է��ϼ���.
//	����: -6
//	�ٽ��Է��ϼ���.
//	����: 5
//	1, 2, 3, 2, 1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if (num >= 3 && num % 2 == 1) { // 3�̻��� Ȧ�� �ڿ��� �Է� ���� ���
			
				int[] arr = new int[num]; // �Է��� ���� ũ�⸸ŭ�� �迭 ���� �� �Ҵ�
			
				int count = 0; // ���� �ֱ� ���� ����
								// �������� -> 1�� ������Ŵ , �������� -> 1�� ���ҽ�Ŵ

				for (int i = 0; i < arr.length; i++) {
					if (i <= arr.length / 2) { // �迭�� �߰����� ��������(+1)
						count++;
					} else { // �迭�� �߰����� ��������(-1)
						count--;
					}
					arr[i] = count;
					System.out.print(arr[i] + " ");
				}
				break; // ����� ���� �� ���� �ݺ��� ����������

			} else { // �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ���
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}
}
