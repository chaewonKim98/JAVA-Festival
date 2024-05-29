import java.util.Scanner;

public class ex14N곱하기N역출력 {

	public static void main(String[] args) {
		// 정수 N을 입력받아 N * N 배열에
		// 다음과 같이 숫자를 저장하고 출력하시오
		// 1 4 7
		// 2 5 8
		// 3 6 9
		Scanner scan = new Scanner(System.in);
		System.out.print("N입력>> ");
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
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
