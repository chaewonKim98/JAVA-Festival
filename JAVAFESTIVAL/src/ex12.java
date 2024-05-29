import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// 다음과 같은 프로그램을 작성하시오.
		// N과 X를 입력 받는다.
		// N개의 정수를 입력 받는다.
		// N개의 숫자 중 X보다 작은 수만 출력 한다.
		Scanner scan = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int N = scan.nextInt();
		System.out.print("X 입력 : ");
		int X = scan.nextInt();

		// 입력
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			arr[i] = scan.nextInt();
		}

		System.out.print("결과 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
