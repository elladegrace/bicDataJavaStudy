package ch05_new;

public class CopyExam2 extends CopyExam{
	//String job;//내부적으로 존재
	//int seq;//내부적으로 존재
	//double d;//내부적으로 존재
	//속성확장(필드 추가)
	boolean ys;

	void method1() {
		System.out.println(seq+","+d);
	}
	//기능 확장(추가)
	void method2() {
		System.out.println(seq+","+ys);
	}
}
