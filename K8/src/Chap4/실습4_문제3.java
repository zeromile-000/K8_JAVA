package Chap4;

public class 실습4_문제3 {
	public static void main(String[] args) {
		
		String[] names =
		{ "홍길동", "김유신", "계백", "강감찬", "을지문덕" };
		String[] subjStrings =
		{ "수학", "국어", "영어", "과학", "역사" };
		int[] criteria =
		{ 50, 60, 70, 80, 80 };
		int[][] scores =
		{
				{ 85, 90, 78, 88, 92 },
				{ 75, 80, 85, 90, 95 },
				{ 65, 70, 75, 80, 85 },
				{ 95, 92, 88, 84, 91 },
				{ 88, 76, 85, 79, 90 } };
		String t1 = "";
		System.out.println(">>>학생별, 과목별 점수, 통과여부 출력");
		System.out.println("===============================");

		for (int i = 0; i < scores.length; i++) {
			System.out.println("[" + names[i] + "]");
			for (int j = 0; j < scores[i].length; j++) {
				t1 = (scores[i][j] >= criteria[j]) ? "통과" : "과락";
				System.out.println(subjStrings[j] + " : " + scores[i][j] + " => " + t1);

			}
			System.out.println();
		}
		System.out.println(">>> 과목 총점 및 평균 점수를 테이블로 출력");
		System.out.println("===================================================");
		System.out.println("이름" + "\t" + "수학" + "\t" + "국어" + "\t" + "영어" + "\t" + "과학" + "\t" + "역사" + "\t");
		System.out.println("------------------------------------------------");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("============================================================");
		System.out.println(">>> 과목별 최대, 최소 점수를 구하고, 해당 점수의 학생 이름을 테이블로 출력");
		System.out.println("============================================================");
		System.out.println("과목" + "\t" + "점수" + "\t" + "이름");
		System.out.println("-------------------------");
		for(int i=0; i<scores.length;i++) {
			int max = 0;
			String t2 = "";
			System.out.print(subjStrings[i]+"\t");
			for(int j=0; j<scores[i].length;j++) {
				if (scores[j][i]>max) {
					max=scores[j][i];
					t2 = names[j];
					
				}
				
			}
			System.out.println(max+"\t"+t2);
				
		}
		System.out.println("============================================================");
		System.out.println("End~~");
	}

}