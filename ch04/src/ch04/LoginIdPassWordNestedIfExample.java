package ch04;

import java.util.Scanner;
//id가 "hong", pwd가 "1234"
public class LoginIdPassWordNestedIfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int count=1;
		
		do{	
			System.out.println("id를 입력하세요:");
			String id = scanner.next();
			
			System.out.println("password를 입력하세요:");
			String password = scanner.next();
				
			if(!id.equals("hong")) {
				System.out.println("id를 확인하세요.");
			}else {//로그인시 비번 확인처리
				if(password.equals("1234")) {
					System.out.println(id+"님 환영합니다.");
					break;
				}else {
						System.out.println("비밀번호를 확인하세요."+count+"회 틀리셨습니다.");
						count++;
				}
			}
		}while(count<=5);
		//사용한 스캐너 객체 자원 해제
		System.out.println("종료합니다.");
		scanner.close();
	}

}
