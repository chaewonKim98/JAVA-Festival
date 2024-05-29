import java.util.Scanner;

public class ex15N°öÇÏ±âN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("NÀÔ·Â>> ");
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		int num = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				arr[j][i] = num;
				num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
