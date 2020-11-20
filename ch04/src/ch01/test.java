package ch01;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇주차 금액입니까 ?");
		
		int wk = scanner.nextInt();
		int money=1000;
		int sum=0;
		int i=0;
		int check = wk*money;
		
		for(i=1; i<=wk; i++) {
			int result = i*money;
			System.out.println(i+"주 적금 금액 :"+result);
			sum = sum+result;
		}
		//System.out.println(wk+"주차 입금액 :"+check+", 누적금액 :"+sum);
				
		System.out.println("총 누적금액 :"+sum);
	}

}
