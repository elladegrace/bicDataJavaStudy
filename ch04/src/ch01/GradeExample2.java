package ch01;

public class GradeExample2 {
	public static void main(String[] args) {
		char grade;
		
		//0~100������ ������ random�ϰ� ���		
		System.out.println("������ �Է��ϼ���(0~100)");
		int score=(int)(Math.random()*100);
		//if~else if~else : ��if�ܰ躰 ����Ȯ��, �������� ������ else���� ó��
		if(score>=90) {
			grade='A';
		}else if (score>=80) {
			grade='B';
		}else if (score>=70) {
			grade='C';
		}else if (score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("������"+score+", ������"+grade+"�Դϴ�.");
		
		
	}

}
