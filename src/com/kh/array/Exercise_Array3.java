package com.kh.array;

import java.util.Scanner;

public class Exercise_Array3 {
	//	주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
	//	단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
	//	주민등록번호(-포함) : 180811-3142447
	//	180811-3******
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		// 주민등록번호 입력
		System.out.print("주민등록번호 입력(-포함) : ");
		String str = sc.next();
		// 주민등록번호를 잘라서 문자배열에 저장
		// 한글자만 입력받기 위해서 사용하는 명령어 : charAt(자리수)
		// char 배열에 저장 (배열 복사 하기 위함)
		char [] origin = new char[str.length()]; //str.length()는 문자열 명령어
		for(int i=0; i<origin.length; i++) {
			origin[i]=str.charAt(i);
		}
		// 복사본 배열에 성별자리 이후부터 *로 처리하여 저장 
		char [] copy = new char[origin.length]; // .length 은 배열 명령어
		for (int i=0; i<copy.length; i++) {
			// i가 7일 때 까지 복사
			if(i <= 7) {
				copy[i] = origin[i];
			} else {
				copy[i]= '*';
			}
		}
		// 출력
		for(char ch : copy) {
			System.out.print(ch);
		}
	}
}
