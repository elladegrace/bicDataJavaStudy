package verify.ch15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
class MemberService{
	boolean login(String id, String password) {
		/*
		boolean istrue1,istrue2;
		if(id.equals("hong")) istrue1=true;
		if(password.contentEquals("12345")) istrue2=true;
		*/ // 이렇게 써줘도 된다
		return id.equals("hong") && password.equals("12345");
	}
	void logout(String id) {
		
	}
}