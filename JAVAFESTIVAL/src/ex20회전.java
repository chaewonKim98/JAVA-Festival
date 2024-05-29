import java.awt.Point;

public class ex20회전 {

	public static void main(String[] args) {
//		아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여 
//		출력하시오.
		
System.out.println("원본");
		
		int [][] arr = new int[5][5];
		
		int n = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		int n2 = 5;
		
		System.out.println();
		System.out.println("90도 회전");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n2;
				n2 += 5;
				System.out.print(arr[i][j] + "\t");
			}
			n2 = n2-26;
			System.out.println();
		}
		
		
		
		

	}

}
