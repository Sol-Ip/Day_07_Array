package Example_Q_Array;

import java.util.Scanner;

//문제07
// 사용자가 배열의 길이를 직접 입력하여 그 값 만큼 정수형 배열을 
// 선언 및 할당 하고, 배열의 크기 만큼 사용자가 직접 값을 입력하여 
// 각각의 인덱스에 값을 초기화 하세요. 
// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의합 을 출력 하세요.
// ex)
// 정수: 5
// 배열 0번째 인덱스에 넣을 값: 4
// 배열 1번째 인덱스에 넣을 값: -4
// 배열 2번째 인덱스에 넣을 값: 3
// 배열 3번째 인덱스에 넣을 값: -3
// 배열 4번째 인덱스에 넣을 값: 2
// 4 -4 3 -3 2
// 총합: 2

public class Exer_07 {
	public static void main(String[] args) {
		// 1. 값을 직접 입력받고 (길이 직접 입력), 정수형 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		// 2. 배열의 크기 만큼 사용자가 직접 입력 + 각각 인덱스 값 초기화
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + " 번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		// 3. 배열 전체 값 나열 및 합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
}
