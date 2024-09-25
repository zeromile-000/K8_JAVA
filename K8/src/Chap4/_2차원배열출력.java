package Chap4;

public class _2차원배열출력 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < arr.length; i++) {
			int[] inArr = arr[i];
			for (int j = 0; j < inArr.length; j++) {
				System.out.print(inArr[j] + " ");
			}
			System.out.println();
		}

	}
}
