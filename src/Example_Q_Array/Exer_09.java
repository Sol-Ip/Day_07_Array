package Example_Q_Array;

import java.util.Scanner;

/*
 * �Է��� ���� �迭�� ������ "OOOġŲ ��ް���", 
 * ������ "OOOġŲ�� ���� �޴��Դϴ�" �� ����ϼ���.

	(��, ġŲ �޴��� �ִ� �迭�� ������ ������ ���ϼ��� )
*/


public class Exer_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ġŲ �޴����� ����ִ� String �迭 ����, �Ҵ� ���ÿ� �ʱ�ȭ
		String[] chickens = {"�Ķ��̵�","���","�Ĵ�","����","�ݹ�"};
		
		// 2. ����ڿ��� ġŲ �޴� �Է¹ޱ�
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String menu = sc.nextLine();
		
		// 3. �ݺ����� ���� �迭�� 0�� �ε������� ������ �ε������� �����Ͽ�
		//    ����ڰ� �Է��� �޴��� ������ �޴��� �ִ���
		//    ������ �޴��� �ִ��� ������ ������ �޾��ֱ� ���� ���� ���
		boolean flag = false; 
		
		for(int i=0; i<chickens.length; i++) { // ����ڰ� �Է��� �޴��� ������ �޴��� ���
			if (chickens[i].equals(menu)) { // flag ���� true�� �ٲ��ְ�
				flag = true;// �ݺ����� ����������. 
		//(�������������� true�� �ٲ� �� ���̻� �ݺ����� �� �ʿ䰡 ���⶧���� ȿ�������� ����Ѱ���)
				break;
			}
		}
			if (flag) { // flag�� true�� ��� ��, ����ڰ� �Է��� �޴��� ������ ���
				System.out.println(menu +"ġŲ ��� ����");
			} else {
				System.out.println(menu + "ġŲ�� ���� �޴��Դϴ�.");
			}
	}
}
