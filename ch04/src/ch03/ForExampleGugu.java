package ch03;

import java.util.Scanner;

public class ForExampleGugu {

	public static void main(String[] args) {
		//실수로 반복시 10번이 아닌 9번 실행
		//카운트를 사용하는 값은 정수로 사용
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("출력을 원하는 단수를 입력하세요:(2~9)");
			int dan=scanner.nextInt();
			
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));/*탭을 원하면"\t"*/ 
			}

	}

}
