package ch02;

public class NullExample {
	public static void main(String[] args) {
		String refVar1 = new String("hello");;
		String refVar2=null;//초기값 null

		refVar2=refVar1;//refVar2가 null->refVar1의 주소값을 가짐
		
		if(refVar1==refVar2)System.out.println("동일객체를 참조함");
		else System.out.println("다른 객체를 참조함");
		
		if(refVar1.contentEquals(refVar2)) System.out.println("내용이 같음");
		else System.out.println("내용이 다름");
		
		System.out.println(refVar2.length());
		
		//refVar2가 "hello"객체와 연결이 끊어지고, "hi"객체를 참조함.
		refVar2 = new String("hi");
		System.out.println(refVar2);
		System.out.println(refVar2.length());
		
		//refVar2가 "hi"객체와 연결이 끊어짐
		//참조하는 객체와의 연결이 끊어졌을때
		//내용을   NullPointException이 발생함.
		refVar2=null;//참조하는 객체와의 연결을 강제로 끊을 때 null사용.
		System.out.println(refVar2);
		System.out.println(refVar2.length());//length=문자열길이를 물어보는함수 -> 오류발생
		
	}

}
