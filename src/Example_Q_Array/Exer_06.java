package Example_Q_Array;

import java.util.Scanner;

public class Exer_06 {
	// "��"~"��"���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 
	//0���� 6���� ���ڸ� �Է� �޾� �Է��� ���ڿ� 
	//���� �ε����� �ִ� ������ ����ϰ� ������ ���� ���ڸ� �Է� �� 
	//" �߸� �Է��ϼ̽��ϴ�."�� ����ϼ���.
	
	public static void main(String []args) {
		// 1. "��" ~ "��"���� �ʱ�ȭ�� ���ڿ� �迭 �����
		String [] arr = {"��","ȭ", "��", "��", "��", "��", "��"};
		
		// 2. ����ڿ��� 0���� 6������ ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0���� 6 �� ���� �Է� : ");
		int num = sc.nextInt();
		
		// 3. num���� 0 ~ 6 ������ �������� Ȯ�� --> �ƴ� ��� "�߸� �Է��ϼ̽��ϴ�." ���
		if(num>=0 && num <=6) {
			// �ش� ���� ���
			System.out.println(arr[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
