package Example_Q_Array;

public class Exer_01 {
	// ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
	// ������� �迭 �ε����� ���� �� �� ���� ����ϼ��� 
	// ex) 1 2 3 4 5 6 7 8 9 10
	public static void main(String []args) {
		int[] numArr = new int[10];
		
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = i+1;
			System.out.print(numArr[i]+" ");
		}
	}
}
