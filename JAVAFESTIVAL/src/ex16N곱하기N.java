import java.util.Scanner;

public class ex16N곱하기N {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int num = 1;
		int[][] arr = new int[N][N];

		// 입력
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num++;
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
