import java.util.Scanner;

public class ex01weight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 몸무게: ");
		int weight = scan.nextInt();
		System.out.print("목표 몸무게: ");
		int goal = scan.nextInt();
		int cnt = 1;
		int sum = 0;

		while (true) {
			System.out.print(cnt + "주차 감량 몸무게: ");
			int minus = scan.nextInt();
			cnt++;
			sum += minus;

			if (weight - sum <= goal) {
				System.out.println((weight - sum) + "KG달성!!! 수고했어용!");
				break;
			}

		}

	}

}
