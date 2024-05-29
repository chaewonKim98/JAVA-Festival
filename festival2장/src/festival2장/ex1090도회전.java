package festival2장;

public class ex1090도회전 {
	public static void main(String[] args) {
	
	int[][] B = new int[5][5];
	int num = 1;
	System.out.println("원본");
	for (int i = 0; i < B.length; i++) {
		for (int j = 0; j < B.length; j++) {
			B[i][j] = num;
			num++;
			System.out.print(B[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("90도 회전");
	for(int i=B.length-1; i>=0; i--) {
		for(int j=0; j<B.length; j++) {
			System.out.print(B[j][i]+"\t");
		}
		System.out.println();
	}
	}
}
