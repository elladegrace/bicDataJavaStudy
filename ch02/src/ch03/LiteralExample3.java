package ch03;

//���� ���ͷ�
//�����Ѱ��� ��
public class LiteralExample3 {
	public static void main(String[] args) {
		char a='A';
		char b='B';
		//Ư������ \�������� �ڵ�� ��ɼ������̴�.
		char c='\u0041';//unicode 0041�� �ش��ϴ� �� A�� ����
		char d='\uae00';//unicode  ae00�� �ش��ϴ� �� ���� ����
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		char fName='\uBC15';//��
		char midName='\uC18C';//�߰��̸�
		char lName='\uC601';//�������̸�
		
		System.out.println("��:"+fName);
		System.out.println("�߰�:"+midName);
		System.out.println("��:"+lName);
		
		//���ڸ��ͷ��� ������ ���� �迭�� arr������ ����
		char[] arr= {'\uBC15','\uC18C','\uC601'};
		//���ڹ迭�� �̿��Ͽ� ���ڿ���ü�� ����
		String myName=new String(arr);
		
		System.out.println(myName);
		
	}
}
