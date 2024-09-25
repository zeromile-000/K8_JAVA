package Chap4;

public class 실습_4_2차원행렬더하기 {
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		int[][] B = { { 21, 22, 23, 24 }, { 25, 26, 27, 28 }, { 29, 30, 31, 32 }, { 33, 34, 35, 36 },{ 37, 38, 39, 40 } };
		int[][] C = new int[5][4];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
		}
		System.out.println();
		System.out.print("A = ");
		for(int i = 0;i < A.length;i++) {
			for(int j = 0;j<A[i].length;j++) {
				System.out.print(A[i][j]);
				if (j < A.length-1) {
					System.out.print(", ");
				}
			}
		}
		System.out.println();
		System.out.print("B = ");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print(B[i][j]);
				if (j < B[i].length) {
					System.out.print(", ");
				}
			}
		}
		System.out.println();
		System.out.print("C = ");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[i].length; j++) {
				System.out.print(C[i][j]);
				if (j < C[i].length) {
					System.out.print(", ");
				}
			}
		}
	}
}


							
						
					
				
				  //if(i< A[i].length)
					//System.out.print(", ");
				  
				
// 두 개의 2차원 배열 생성 및 초기화
/*
 * 행렬 [3][4] A, B를 정수로 선언하고 12개의 값을 초기화
 */

// 결과를 저장할 2차원 배열
/*
 * C = A + B => 행렬 A와 B를 더하여 C에 넣기 위한 정수 배열 C를 선언
 */

// 행렬 더하기
/*
 * A, B를 더한 결과를 저장하는 C를 구하는 for 문 구현
 */

// 결과 출력
/*
 * 행렬 A, B, C를 출력하는 코드 작성 출력 형태는 "A = 1,2,3,4,5,6,7 8,9, ... B =
 * 
 * C =
 */
