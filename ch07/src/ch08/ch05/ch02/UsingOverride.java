package ch08.ch05.ch02;

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		// 객체 참조 변수가 대입되는 객체에 따라 달라짐
		// 객체의 다형성
		start = new Line();
			last = start;// Line객체 연결
			
			obj = new Rect();
			last.next = obj;// Rect객체 연결
			last.next = obj;
			
			obj = new Line();// Line 객체 연결
			last.next = new Line();
			last=obj;
			
			last = new Circle(); // Circle 객체 연결
			last.next = obj;
			
			// 모든 도형 출력
			Shape p=start;
			while(p!=null) {
				p.draw();
				p=p.next;
			}
			
			Shape[] shapes= {new Line(),new Rect(), new Line(), new Circle()};
			for(Shape s:shapes)
				s.draw();

	}
}
