package ch01;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �ݾ��Դϱ� ?");
		
		int wk = scanner.nextInt();
		int money=1000;
		int sum=0;
		int i=0;
		int check = wk*money;
		
		for(i=1; i<=wk; i++) {
			int result = i*money;
			System.out.println(i+"�� ���� �ݾ� :"+result);
			sum = sum+result;
		}
		//System.out.println(wk+"���� �Աݾ� :"+check+", �����ݾ� :"+sum);
				
		System.out.println("�� �����ݾ� :"+sum);
	}

}
