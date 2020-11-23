package ch05;

public class BreakWhileExample2 {

	public static void main(String[] args) {
		//초기값
		int i=1,j=1;
		
		b:while(i<10) {
			while(true) {
				if(j==10) break;//안쪽 for문 만 빠져나감
				System.out.println(i+"x"+j+"="+i*j+"\t");
				j++;
			}
		}
	}

}
