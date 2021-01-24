package Example_Q_Array;

public class Exer_02 {
	// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
	// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요 
	// ex) 10 9 8 7 6 5 4 3 2 1 
		public static void main(String []args) {
			int[] numArr = new int[10];
			System.out.println("==== 방법 1 ====");
			
			for(int i = 0; i<numArr.length; i++) {
				numArr[i] = numArr.length-i;
				
				System.out.print(numArr[i]+" ");
			}
			System.out.println();
			System.out.println("==== 방법 2 ====");
			
			int number = 10;
			
			for (int i=0; i<numArr.length; i++) {
				numArr[i] = number;
				number--;
				System.out.print(numArr[i]+" ");
		}
	}
}
