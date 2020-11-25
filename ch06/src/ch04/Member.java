package ch04;

//캡슐화
public class Member {

	// 속성-외부차단된 데이타 private
	private int sno;// 회원번호
	private String name;// 회원명
	private String jumin;// 주민번호

	// 기능-외부에 노출된 메소드 -private
	public void getInfo(int grade) {
		if (getGrade(grade) == 1) {
			System.out.println(sno + "," + name + "," + jumin);
		} else {
			System.out.println(sno);
		}
	}

	// 기능부분
	public int getGrade(int grade) {
		return grade;
	}

}
