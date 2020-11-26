package ch14;

public class SimpleTestMember {
	//필드
		static int seq;
		int sno;
		String name;
		String email;
		
		//생성자
		public SimpleTestMember() {
			sno = seq++;
		}
		
		//메소드
		static void total() {
			System.out.println(seq+"명");
		}
		
		//
		void STMemberInfo() {
			System.out.println(sno+",name"+name+",email :"+email);
		}
}
