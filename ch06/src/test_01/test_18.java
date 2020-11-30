package test_01;

public class test_18 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i <arr.length; i++) { // 2점
			for (int j = 0; j <arr.length; j++) {// 3점
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
