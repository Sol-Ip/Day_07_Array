package Example_Q_Array;

import java.util.Scanner;

public class Exer_10 {
	public static void mian(String[]args) {
		// 1. 사용자에게 주민등록번호 문자열 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		// 주민등록번호를 잘라서 문자배열에 저장
		// 한글자만 입력받기 위해서 사용하는 명령어 : charAt(자리수)
		// char 배열에 저장 (배열 복사 하기 위함)

		// 2. 반복문을 이용하여 char[]에 옮겨 담기
		char[] origin = new char[str.length()];// str.length()는 문자열 명령어

		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		// 3. 복사본 char[]에 성별자리 이후부터 *로 값이 들어가게끔 깊은 복사 후 바로 출력
		char[] copy = new char[origin.length];

		for (int i = 0; i < copy.length; i++) {

			if (i <= 7) { // 7번 인덱스 이하까지는
				copy[i] = origin[i]; // 기존의 주민번호들 복사
			} else { // 그 이후부터는 *값 들어가도록
				copy[i] = '*';
			}

			System.out.print(copy[i]);
		}

	}
}
