package ch01;

public class IfExample1 {
	public static void main(String[] args) {
		//
		int n;
		n=10;
		//���ǹ� (if)
		if(n%2==0) {//���ǹ��� true�϶��� �ҷ����� ��ɹ� ����{}
			System.out.println("¦���Դϴ�.");
		}
		
		//score�� 60�̻��� �л��鿡�Ը� pass���θ� �˷���.
		int score=67;
		if(score>=60) {
			System.out.println("pass");
		}

	}

}
