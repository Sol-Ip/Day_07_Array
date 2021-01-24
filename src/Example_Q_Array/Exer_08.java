package Example_Q_Array;

import java.util.Scanner;

public class Exer_08 {

//   문제08
//	3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 
//	오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여 
//	내림차순으로 값을 넣어 출력하세요. 
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 
//	“다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요.
//
//	ex)
//	정수: 4
//	다시입력하세요.
//	정수: -6
//	다시입력하세요.
//	정수: 5
//	1, 2, 3, 2, 1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if (num >= 3 && num % 2 == 1) { // 3이상인 홀수 자연수 입력 받을 경우
			
				int[] arr = new int[num]; // 입력한 정수 크기만큼의 배열 선언 및 할당
			
				int count = 0; // 값을 넣기 위한 변수
								// 오름차순 -> 1씩 증가시킴 , 내림차순 -> 1씩 감소시킴

				for (int i = 0; i < arr.length; i++) {
					if (i <= arr.length / 2) { // 배열의 중간까지 오름차순(+1)
						count++;
					} else { // 배열의 중간부터 내림차순(-1)
						count--;
					}
					arr[i] = count;
					System.out.print(arr[i] + " ");
				}
				break; // 제대로 실행 후 무한 반복문 빠져나가기

			} else { // 입력한 정수가 홀수가 아니거나 3 미만일 경우
				System.out.println("다시 입력하세요");
			}
		}
	}
}
