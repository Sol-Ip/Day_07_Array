package Example_Q_Array;

import java.util.Scanner;

public class Exer_06 {
	// "월"~"일"까지 초기화된 문자열 배열을 만들고 
	//0부터 6까지 숫자를 입력 받아 입력한 숫자와 
	//같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시 
	//" 잘못 입력하셨습니다."를 출력하세요.
	
	public static void main(String []args) {
		// 1. "월" ~ "일"까지 초기화된 문자열 배열 만들기
		String [] arr = {"월","화", "수", "목", "금", "토", "일"};
		
		// 2. 사용자에게 0부터 6까지의 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0부터 6 중 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 3. num값이 0 ~ 6 사이의 숫자인지 확인 --> 아닐 경우 "잘못 입력하셨습니다." 출력
		if(num>=0 && num <=6) {
			// 해당 요일 출력
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
