package ch01;

import java.util.Scanner;

public class SuccessOrFail2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("id를 입력하세요:");
		String id = scanner.next();
		if(!id.equals("hong")) {
			System.out.println("id를 확인하세요.");
		}else {
			System.out.println("로그인 성공");
		}
		
		//System.out.println("로그인 성공");
		//사용한 스캐너 객체 자원 해제
		scanner.close();
	}

}
