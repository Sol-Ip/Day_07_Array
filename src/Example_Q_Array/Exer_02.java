package Example_Q_Array;

public class Exer_02 {
	// ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
	// �������� �迭 �ε����� ���� �� �� ���� ����ϼ��� 
	// ex) 10 9 8 7 6 5 4 3 2 1 
		public static void main(String []args) {
			int[] numArr = new int[10];
			System.out.println("==== ��� 1 ====");
			
			for(int i = 0; i<numArr.length; i++) {
				numArr[i] = numArr.length-i;
				
				System.out.print(numArr[i]+" ");
			}
			System.out.println();
			System.out.println("==== ��� 2 ====");
			
			int number = 10;
			
			for (int i=0; i<numArr.length; i++) {
				numArr[i] = number;
				number--;
				System.out.print(numArr[i]+" ");
		}
	}
}
