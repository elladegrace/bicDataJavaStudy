package ch01;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		//Set set = new Set();
		Set set = new HashSet();
		
		set.add("홍길동");
		set.add("일지매");
		set.add("홍길동");// set은 중복저장하지 않음
		set.add("임꺽정");
		
		//내용출력
		System.out.println(set);

	}

}
