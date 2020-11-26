package ch14_exercise;

public class MemberMainExample {
	public static void main(String[] args) {
		Member m1=new Member("홍길동","hong@naver.com");
		Member m2=new Member("일지매","ilji@naver.com");
		Member m3=new Member("임꺽정","im@naver.com");
		
		m1.info();
		m2.info();
		m3.info();

		Member.total();
	}

}
