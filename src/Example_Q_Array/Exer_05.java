package Example_Q_Array;

import java.util.Scanner;
//문자열을 입력받아 문자 하나하나를 배열에 넣고 
//검색할 문자가 문자열에 몇 개 들어가있는지 갯수와 
//몇 번째 인덱스에 위치하는 지 인덱스를 출력하세요
//ex )
//문자열 : application
//문자 : i
//application에 i가 존재하는 위치(인덱스) : 4 8
//i 개수 : 2

public class Exer_05 {
	public static void main(String[] args) {

		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// 2. 사용자가 입력한 문자열(str)을
		// 문자 하나하나를 char배열에 넣기

		// 먼저 사용자가 입력한 문자열 길이만큼의
		// char배열을 할당
		char[] arr = new char[str.length()];
		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i); // arr : arr[0] -> a, arr[1] -> p
		}

		// 3. 검색할 문자가 문자열에 몇개가 들어있는지와
		// 어느 인덱스에 있는지 파악

		int count = 0;
		// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
		// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가 시켜줄 것

		// 반복문을 실행하기 위해 출력문 작성
		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스) : ");

		// 인덱스마다 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println(); // 개행
		System.out.println(ch + "개수 : " + count);
	}
}

		  
		
	