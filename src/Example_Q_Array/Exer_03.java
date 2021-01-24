package Example_Q_Array;

import java.util.Scanner;
	// 사용자에게 입력 받은 양의 정수만큼 
	// 배열 크기를 할당하고
	//	1부터 입력 받은 값까지 
	// 배열에 초기화한 후 출력하세요
	// ex ) 양의 정수 : 5
	//          1 2 3 4 5
public class Exer_03 {
	public static void main (String[] args) {
		// 입력 받은 양의 정수만큼 배열크기 할당
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int [] nums = new int[size];
		// 1부터 입력받은 값까지 초기화
		for (int i=0; i<nums.length; i++) {
			nums[i]=i+1;
			System.out.println(nums[i]);
		}
	}

	
}
