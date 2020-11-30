package test_01;

public class test_15 {
	public static void main(String[] args) {
		int[] scores= {76,45,34,89,100,50,90,92};
		int temp;//임시 저장 변수
		int sum=0;//전체 값을 합을 저장하는 변수
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores.length; j++) {//안쪽 for문의 j값의 초기화 (2점) 
	        //비교로직
				if(scores[i]>scores[j] ) { //비교 연산, 왼쪽이 오른쪽보다 크면(1점)
					scores[i]=temp;//대입연산, 먼저 임시 변수에 왼쪽값 저장(1점)
					scores[i]=scores[j];//대입연산, 오른쪽값을 왼쪽에 저장(1점)
					scores[j]=temp;//대입연산, 임시변수의 값을 오른쪽에 저장(1점)
				}
			}//안쪽 for문
		//총합 로직
			sum+=sum;      //sum변수에 배열의 각 요소의 값을 더하여 합 구하기 (2점)
		}//바깥쪽 for문
System.out.println("합: "+sum+",평균: "+(double)sum /scores.length);//전체 합을 배열의 길이로 나눈값 계산 (2점)
for(int k:scores) { //결과 출력
  System.out.println(k);
  }
 }
}
