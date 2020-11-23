package ch01;

public class IfElseExample2 {

	public static void main(String[] args) {
		boolean b = true;
		
		//조건이 둘중 하나일때, 줄중 하나는 반드시 처리하고 지나가야 하는 경우 사용
		if(b) {
			System.out.println("b가 true이므로 현재 블럭 실행");
		}else {
			System.out.println("b가 false이므로 현재 블럭 실행");
		}
		
		System.out.println("if-else 다음 블럭 실행");

	}

}
