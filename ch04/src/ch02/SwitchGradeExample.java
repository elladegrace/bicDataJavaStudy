package ch02;

import java.util.Scanner;

public class SwitchGradeExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		
		switch(score/10) {
		case 10://score = 100;
		case 9://score=90~99
				grade='A'; break;
		case 8://score=80~89
				grade='B'; break;
		case 7://score=70~79
				grade='C'; break;
		case 6://score=60~69
				grade='D'; break;
		default ://score=0~59
				grade='F'; break;
		}
		System.out.println("학점은"+grade+"입니다.");
		
		scanner.close();

	}

}
