package ch03;

import java.util.Scanner;

public class ForExampleGugu {

	public static void main(String[] args) {
		//�Ǽ��� �ݺ��� 10���� �ƴ� 9�� ����
		//ī��Ʈ�� ����ϴ� ���� ������ ���
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("����� ���ϴ� �ܼ��� �Է��ϼ���:(2~9)");
			int dan=scanner.nextInt();
			
			for(int i=1;i<=9;i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));/*���� ���ϸ�"\t"*/ 
			}

	}

}
