package com.kh.array;
	//깊은 복사 example
public class Exam_Array6 {
	public static void main(String []args) {
		// 두 개의 변수가 각각 다른 배열을 가리키고 있음 
		int [] arr1 = {1,2,3,4} ;
		int [] arr2 = new int[4]; // 새로운 공간 할당
		for(int i =0; i<arr1.length; i++) {
			arr2[i]=arr1[i]; // arr1의 값을 arr2로 복사
		}
		
		arr2[0]=5;
		
		System.out.println("변해도 되는 : "+ arr2[0]+" 변하면 안 되는 : "+ arr1[0]);
		
	}
}
