package ch03;

public class ForExampleCounter {
	//실수로 반복시 10번이 아닌 9번 실행
	//카운트를 사용하는 값은 정수로 사용
	public static void main(String[] args) {
		System.out.println("출력을 원하는 단수를 입력하세요:(2~9)");
		
		for(float x=0.1f; x<=1.0f ;x+=0.1f) {
			System.out.println(x);
		}

	}

}
