import java.util.Scanner;

public class ex04�ܵ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �ݾ� �Է�: ");
		int money = scan.nextInt();

		int man = money / 10000;
		int oc = (money % 10000) / 5000;
		int ch = ((money % 10000) % 5000) / 1000;
		int ob = (((money % 10000) % 5000) % 1000) / 500;
		int b = ((((money % 10000) % 5000) % 1000) % 500) / 100;

		System.out.println();
		System.out.println("�ܵ�: " + money + "��");
		System.out.println("10000��: " + man + "��");
		System.out.println("5000��: " + oc + "��");
		System.out.println("1000��: " + ch + "��");
		System.out.println("500��: " + ob + "��");
		System.out.println("100��: " + b + "��");

	}

}
