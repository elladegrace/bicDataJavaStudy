package ch03;

public class ForExample4 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
			System.out.print(i);//println=print new line
			
			if(i<=9) System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}
		}

	}

}