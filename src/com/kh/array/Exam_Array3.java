package com.kh.array;

public class Exam_Array3 {
	public static void main(String [] args) {
		//�迭 - �ǽ����� 2
		// ���̰� 5�� String �迭�� �����ϰ�,
		// "����", "������", "Ű��", "���", "�ٳ���"
		// �� �ʱ�ȭ �� �� �迭 �ε����� �̿��ؼ�
		//�ٳ����� ����Ͻÿ�.
		
//		int []arrs = new int [5];
//		for(int i =0; i<5; i++) {
//			arrs[i] = i+1;
//		}
//		
		String [] fruits = {"����","������", "Ű��", "���", "�ٳ���"};
//			System.out.println(fruits[4]);
		 for (int i = 0; i<fruits.length; i++) {
			if (fruits[i].equals("�ٳ���")) { //���ڿ��� == ��� equals
				System.out.println(fruits[i]);
			}
		 }
		 
//		 if(fruits[0].equals("�ٳ���")); 
//		   {
//		  System.out.println(fruits[0]);
//			} else if (fruits[1].equals("�ٳ���")); {
//				  System.out.println(fruits[1]);
//					} else if (fruits[2].equals("�ٳ���")); {
//						  System.out.println(fruits[2]);
//					} else if (fruits[3].equals("�ٳ���")); {
//						  System.out.println(fruits[3]);
//					} else if (fruits[4].equals("�ٳ���")); {
//						  System.out.println(fruits[4]);
//					}
	           }
 
		}
	

