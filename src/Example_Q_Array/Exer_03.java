package Example_Q_Array;

import java.util.Scanner;
	// ����ڿ��� �Է� ���� ���� ������ŭ 
	// �迭 ũ�⸦ �Ҵ��ϰ�
	//	1���� �Է� ���� ������ 
	// �迭�� �ʱ�ȭ�� �� ����ϼ���
	// ex ) ���� ���� : 5
	//          1 2 3 4 5
public class Exer_03 {
	public static void main (String[] args) {
		// �Է� ���� ���� ������ŭ �迭ũ�� �Ҵ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		int [] nums = new int[size];
		// 1���� �Է¹��� ������ �ʱ�ȭ
		for (int i=0; i<nums.length; i++) {
			nums[i]=i+1;
			System.out.println(nums[i]);
		}
	}

	
}
