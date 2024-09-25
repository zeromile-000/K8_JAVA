package Chap4;

public class _1차원배열_숫자처리 {
	public static void main(String[] args) {
		int[]score = {90,85,78,100,98}; //score 배열초기화
		int sum = 0; 
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		for(int i=0; i<score.length;i++) {
			sum+=score[i];
		if(max<score[i]) {
			max=score[i];
		} if(min>score[i]) {
			min=score[i];
		}
		
		avg=sum/score.length;
		}
		System.out.printf("총점: %d\n",sum);
		System.out.printf("최대값: %d\n",max);
		System.out.printf("최솟값: %d\n",max);
		System.out.printf("평균: %d\n",max);
	} 
}

		
		
		
		
		
		
