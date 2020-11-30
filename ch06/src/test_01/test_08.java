package test_01;

import java.util.Arrays;

public class test_08 {
	public static void main(String[] args) {
		 int[] intArr = {1,2,3,4,5};
		//int타입의 배열을 새로운 배열을 생성후 복사
		int[] newArr =new Arrays(intArr, intArr.length);  //배열을 다루는 API와 메소드로 원본을 새로운 배열로 복사하기 (5점)
		for(int i=0;i)
		System.out.println(newArr[i]);
		// int[] 새로운 배열객체 생성후 값을 복사 
		newArr[0]=9;
		System.out.println(intArr[0]);
		}
}
