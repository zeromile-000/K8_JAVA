package Chap4;

	public class _2차원배열_행_최대값_구하기 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 7, 2, 9, 5},
                {1, 8, 6, 4, 3},
                {5, 2, 9, 1, 7},
                {4, 6, 3, 8, 2},
                {9, 1, 5, 7, 3}
        };

        int rows = array.length; // 행의 수
        int cols = array[0].length; // 열의 수

        for (int i = 0; i < rows; i++) {
            int max = array[i][0]; // 각 행의 첫 번째 값을 초기값으로 설정
            for (int j = 1; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j]; // 더 큰 값을 찾으면 max에 저장
                }
            }
            System.out.println(i + "번째 행의 최대값: " + max);
        }
    }
}

