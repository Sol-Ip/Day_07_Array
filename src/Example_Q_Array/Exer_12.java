package Example_Q_Array;

import java.util.Scanner;

/*문제12
문자열을 입력받아 문자열에 
어떤 문자가 들어갔는지 배열에 저장하고, 
문자의 개수와 함께 출력하세요.

ex )
문자열: application
문자열에있는문자: a, p, l, i, c, t, o, n
문자개수: 8
*/

public class Exer_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 문자열에 어떤 문자가 들어갔는지 char[]에 저장
		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		// 3. char 배열에서 중복값 존재할 시 출력 X
		int count = 0; // 문자 갯수 카운트

		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true; // 중복 체크용 flag

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false; // 중복이 발생했을 때
					break;
				}
			}
			if (flag) { // 중복이 발생하지 않았을 경우
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++; //문자 갯수 카운팅
			}
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);

	}
}
