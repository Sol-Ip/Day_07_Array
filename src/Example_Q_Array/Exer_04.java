package Example_Q_Array;

public class Exer_04 {
	public static void main(String[] args) {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "���", "��", "����", "������", "����" �� �ʱ�ȭ �� ��
		// �迭 �ε����� Ȱ���ؼ� ���� ����ϼ���
		
		String[] fruits = { "���", "��", "����", "������", "����" };
		System.out.println("1��=========");
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("��")) {
				System.out.println(fruits[i]);
			}
		}
		System.out.println("2��=========");
		for (String fruit : fruits) {
			if (fruit.equals("��")) {
				System.out.println(fruit);
			}
		}
	}
}
