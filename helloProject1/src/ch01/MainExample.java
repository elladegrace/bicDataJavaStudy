package ch01;

public class MainExample {
	public static void main(String[] args) {
		//��������
		// Ÿ�� ������ = new Ÿ�Ը�();
		MyClass instance=new MyClass();
		//������ ��ü(instance)�� �����ϴ� ������ ����Ű�� ��ü�� �Լ��� ����;
		 instance.printMyMessage();
		 
		 MyClass instance2=new MyClass();
		 instance2.printMyMessage();
	}
}
