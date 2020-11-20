package ch04;

import java.io.IOException;
import java.util.Scanner;

public class WhileScannerConditionExample2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		int speed=0;
		int keyCode=0;
		
		while(run) {
			//메뉴출력
		
			System.out.println("------------------------");
			System.out.println("1.증속|2.감속|3.중지");
			System.out.println("------------------------");
			System.out.println("선택:");
			
			keyCode = scanner.nextInt();
			
			if(keyCode==1) {//ask ii 코드1
				speed++;
				System.out.println("현재속도="+speed);
			}else if(keyCode==2) {//ask ii 코드2
				speed++;
				System.out.println("현재속도="+speed);
			}else if(keyCode==3) {//ask ii 코드3
				speed++;
				run=!run;
			}
		}//while끝.
		System.out.println("종료");

	}

}
