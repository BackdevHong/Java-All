package ch13;

public class TwoDimentionTest {

	public static void main(String[] args) {
		int [][] arr = new int[4][4];
		int i,j;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + ",");
			}
			System.out.println("\t" + arr[i].length);
		}
	}
}
