import java.util.Scanner;

public class ex02money {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time = scan.nextInt();
		int money = 0;
		int bonus = 7500;
		int num = time - 8;
		if (time <= 8) {
			money = time * 5000;
		} else {
			money = (num * bonus) + 40000;
		}
		System.out.println("�� �ӱ��� " + money + "�� �Դϴ�.");
	}

}
