package Example_Q_Array;

/*����11
�ζ� ��ȣ �ڵ� ������ ���α׷� �ۼ��Ͽ� 
�ߺ� �� ���� ������������ �����Ͽ� ����ϼ���
ex) 3 4 15 17 28 40
*/

public class Exer_11 {
	public static void main(String[] args) {
		// 1. �ζ� ��ȣ ���� 6�� ������ �迭 ���� �� �Ҵ�
		int[] lotto = new int[6];

		// 2.�迭�� �ߺ� �� ���� 1 ~ 45 ������ ���� �ʱ�ȭ
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 3. �������� ���� (��������)
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
	}

}
