package ch04;

import java.util.Scanner;
//id�� "hong", pwd�� "1234"
public class LoginIdPassWordNestedIfExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int count=1;
		
		do{	
			System.out.println("id�� �Է��ϼ���:");
			String id = scanner.next();
			
			System.out.println("password�� �Է��ϼ���:");
			String password = scanner.next();
				
			if(!id.equals("hong")) {
				System.out.println("id�� Ȯ���ϼ���.");
			}else {//�α��ν� ��� Ȯ��ó��
				if(password.equals("1234")) {
					System.out.println(id+"�� ȯ���մϴ�.");
					break;
				}else {
						System.out.println("��й�ȣ�� Ȯ���ϼ���."+count+"ȸ Ʋ���̽��ϴ�.");
						count++;
				}
			}
		}while(count<=5);
		//����� ��ĳ�� ��ü �ڿ� ����
		System.out.println("�����մϴ�.");
		scanner.close();
	}

}
