package Example_Q_Array;

import java.util.Scanner;

/*
 * 입력한 값이 배열에 있으면 "OOO치킨 배달가능", 
 * 없으면 "OOO치킨은 없는 메뉴입니다" 를 출력하세요.

	(단, 치킨 메뉴가 있는 배열은 본인이 스스로 정하세요 )
*/


public class Exer_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 치킨 메뉴들이 들어있는 String 배열 선언, 할당 동시에 초기화
		String[] chickens = {"후라이드","양념","파닭","간장","반반"};
		
		// 2. 사용자에게 치킨 메뉴 입력받기
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		// 3. 반복문을 통해 배열의 0번 인덱스부터 마지막 인덱스까지 접근하여
		//    사용자가 입력한 메뉴와 동일한 메뉴가 있는지
		//    동일한 메뉴가 있는지 없는지 논리값을 받아주기 위한 변수 사용
		boolean flag = false; 
		
		for(int i=0; i<chickens.length; i++) { // 사용자가 입력한 메뉴와 동일한 메뉴일 경우
			if (chickens[i].equals(menu)) { // flag 값을 true로 바꿔주고
				flag = true;// 반복문을 빠져나간다. 
		//(생략가능하지만 true로 바뀐 후 더이상 반복문을 돌 필요가 없기때문에 효율적으로 사용한거임)
				break;
			}
		}
			if (flag) { // flag가 true일 경우 즉, 사용자가 입력한 메뉴가 존재할 경우
				System.out.println(menu +"치킨 배달 가능");
			} else {
				System.out.println(menu + "치킨은 없는 메뉴입니다.");
			}
	}
}
