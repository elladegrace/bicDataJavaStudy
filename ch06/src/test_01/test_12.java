package test_01;

import java.util.Scanner;

public class test_12 {
	public static void main(String[] args) {
		     System.out.println("메세지를 입력하세요");
		     System.out.println("프로그램을 종료하려면 q를 입력하세요");
		    Scanner scanner = new Scanner(System.in);
		    String inputString;
		  do {
		       System.out.print(">");
		      inputString = scanner.nextLine();
		      System.out.println(inputString);
		   } while(inputString!="q");//입력된 문자열이 "q"가 아닐(!) 동안 반복처리하도록 ,
		                                         //String클래스의 비교메소드와 부정논리 연산자를 이용하여 코드를 완성하시요(5점)
		   System.out.println();
		   System.out.println("프로그램 종료");
		}
}
