package ch01;

import java.util.Scanner;

public class SuccessOrFail2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("id�� �Է��ϼ���:");
		String id = scanner.next();
		if(!id.equals("hong")) {
			System.out.println("id�� Ȯ���ϼ���.");
		}else {
			System.out.println("�α��� ����");
		}
		
		//System.out.println("�α��� ����");
		//����� ��ĳ�� ��ü �ڿ� ����
		scanner.close();
	}

}
