import java.util.Scanner;

public class ex210나오게 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("A입력>> ");
			int A = scan.nextInt();
			System.out.print("B입력>> ");
			int B = scan.nextInt();
			if (A == 0 && B == 0) {
				break;
			} else {
				System.out.println("결과>> " + (A - B));
			}
		}

	}

}
