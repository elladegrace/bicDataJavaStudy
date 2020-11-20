package ch03;

//문자 리터럴
//문자한개의 값
public class LiteralExample3 {
	public static void main(String[] args) {
		char a='A';
		char b='B';
		//특수문자 \다음오는 코드는 기능성문자이다.
		char c='\u0041';//unicode 0041에 해당하는 값 A가 저장
		char d='\uae00';//unicode  ae00에 해당하는 값 글이 저장
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		char fName='\uBC15';//성
		char midName='\uC18C';//중간이름
		char lName='\uC601';//마지막이름
		
		System.out.println("성:"+fName);
		System.out.println("중간:"+midName);
		System.out.println("끝:"+lName);
		
		//문자리터럴로 생성한 문자 배열을 arr변수에 저장
		char[] arr= {'\uBC15','\uC18C','\uC601'};
		//문자배열을 이용하여 문자열객체를 생성
		String myName=new String(arr);
		
		System.out.println(myName);
		
	}
}
