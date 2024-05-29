import java.util.Scanner;

public class ex04ÀÜµ· {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ÃÑ ±Ý¾× ÀÔ·Â: ");
		int money = scan.nextInt();

		int man = money / 10000;
		int oc = (money % 10000) / 5000;
		int ch = ((money % 10000) % 5000) / 1000;
		int ob = (((money % 10000) % 5000) % 1000) / 500;
		int b = ((((money % 10000) % 5000) % 1000) % 500) / 100;

		System.out.println();
		System.out.println("ÀÜµ·: " + money + "¿ø");
		System.out.println("10000¿ø: " + man + "°³");
		System.out.println("5000¿ø: " + oc + "°³");
		System.out.println("1000¿ø: " + ch + "°³");
		System.out.println("500¿ø: " + ob + "°³");
		System.out.println("100¿ø: " + b + "°³");

	}

}
