package ch05;

public class BreakForExample {
	public static void main(String[] args) {
		//초기값
		int i=1,j=1;
		
		while(i<10) {//빠져나가는 조건
			while(j<=10) {//빠져나가는 조건
				if(j==10) break;//안쪽 for문 만 빠져나감
				System.out.println(i+"x"+j+"="+i*j+"\t");
				j++;//j증가
			}
			System.out.println();
			i++;//i증가하고
			j=0;//j는 1로 초기화됨
		}
		

	}

}
