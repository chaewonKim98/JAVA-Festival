import java.util.Scanner;

public class ex210������ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("A�Է�>> ");
			int A = scan.nextInt();
			System.out.print("B�Է�>> ");
			int B = scan.nextInt();
			if (A == 0 && B == 0) {
				break;
			} else {
				System.out.println("���>> " + (A - B));
			}
		}

	}

}
