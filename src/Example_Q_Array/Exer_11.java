package Example_Q_Array;

/*문제11
로또 번호 자동 생성기 프로그램 작성하여 
중복 값 없이 오름차순으로 정렬하여 출력하세요
ex) 3 4 15 17 28 40
*/

public class Exer_11 {
	public static void main(String[] args) {
		// 1. 로또 번호 갯수 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];

		// 2.배열에 중복 값 없이 1 ~ 45 까지의 난수 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 3. 오름차순 정렬 (선택정렬)
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
