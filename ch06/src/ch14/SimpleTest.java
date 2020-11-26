package ch14;

public class SimpleTest {
	public static void main(String[] args) {
	SimpleTestMember m1 = new SimpleTestMember();
	m1.name="홍길동";
	m1.email="hong@naver.com";
	
	SimpleTestMember m2 = new SimpleTestMember();
	m2.name="일지매";
	m2.email="ilji@naver.com";
	
	SimpleTestMember m3 = new SimpleTestMember();
	m3.name="임꺽정";
	m3.email="im@naver.com";
	
	m1.STMemberInfo();
	m2.STMemberInfo();
	m3.STMemberInfo();
	
	SimpleTestMember.total();
}	
}
