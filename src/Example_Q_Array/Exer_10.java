package Example_Q_Array;

import java.util.Scanner;

public class Exer_10 {
	public static void mian(String[]args) {
		// 1. ����ڿ��� �ֹε�Ϲ�ȣ ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		// �ֹε�Ϲ�ȣ�� �߶� ���ڹ迭�� ����
		// �ѱ��ڸ� �Է¹ޱ� ���ؼ� ����ϴ� ��ɾ� : charAt(�ڸ���)
		// char �迭�� ���� (�迭 ���� �ϱ� ����)

		// 2. �ݺ����� �̿��Ͽ� char[]�� �Ű� ���
		char[] origin = new char[str.length()];// str.length()�� ���ڿ� ��ɾ�

		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		// 3. ���纻 char[]�� �����ڸ� ���ĺ��� *�� ���� ���Բ� ���� ���� �� �ٷ� ���
		char[] copy = new char[origin.length];

		for (int i = 0; i < copy.length; i++) {

			if (i <= 7) { // 7�� �ε��� ���ϱ�����
				copy[i] = origin[i]; // ������ �ֹι�ȣ�� ����
			} else { // �� ���ĺ��ʹ� *�� ������
				copy[i] = '*';
			}

			System.out.print(copy[i]);
		}

	}
}
