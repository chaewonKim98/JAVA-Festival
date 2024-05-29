import java.util.Scanner;

public class ex07공약공배수 {

	public static void main(String[] args) {

		// 최대공약수 = 작은수%큰수
		// 최소공배수 = 두 자연수의 곱 / 최대공약수
		// min = 최대 공약수
		// max = 최소 공배수
		Scanner scan = new Scanner(System.in);
		int max = 0, min = 0;
		System.out.print("숫자 1입력 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 2입력 : ");
		int num2 = scan.nextInt();
		for (int i = 2; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				min = i;
			}
		}

		max = num1 * num2 / min;

		System.out.println("최대 공약수 : " + min);
		System.out.println("최소 공배수 : " + max);

	}

}
