package ch05;

public class NextedLoopGuguExample {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			//가로,세로 2차원 형태로 값을 계산하ㅓㅏㄴ 출력할때 이중반복문 상요
			for(int j=1;j<10;j++) {//안쪽for문의 반복횟수=바깥쪽범위*안쪾범위
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}//안쪽 for문 블럭
			System.out.println();//공백출력후 한줄 아래로 내리기
		}//바깥쪽 for문 블럭

	}

}
