package Example_Q_Array;

import java.util.Scanner;

/*����12
���ڿ��� �Է¹޾� ���ڿ��� 
� ���ڰ� ������ �迭�� �����ϰ�, 
������ ������ �Բ� ����ϼ���.

ex )
���ڿ�: application
���ڿ����ִ¹���: a, p, l, i, c, t, o, n
���ڰ���: 8
*/

public class Exer_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ���ڿ� �Է¹ޱ�
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();

		// 2. ���ڿ��� � ���ڰ� ������ char[]�� ����
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		// 3. char �迭���� �ߺ��� ������ �� ��� X
		int count = 0; // ���� ���� ī��Ʈ

		System.out.print("���ڿ��� �ִ� ���� : ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true; // �ߺ� üũ�� flag

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false; // �ߺ��� �߻����� ��
					break;
				}
			}
			if (flag) { // �ߺ��� �߻����� �ʾ��� ���
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++; //���� ���� ī����
			}
		}
		System.out.println();
		System.out.print("���� ���� : " + count);

	}
}
