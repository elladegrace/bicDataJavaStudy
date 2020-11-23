package ch05;

public class BreakForExample2 {
	public static void main(String[] args) {	
		//바깥 반복문 앞에 라벨: 을 표시하고, 안쪽 반복문에서 break 라벨; 로 표시
		// 바깥
				a:for(int i=1;i<10;i++) {
					for(int j=1; j<=10; j++) {
						if(j==10) break a;
						System.out.print(i+"x"+j+"="+i*j+"\t");
					}
				System.out.println();
				}

	}

}
