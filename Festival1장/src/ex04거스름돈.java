import java.util.Scanner;

public class ex04�Ž����� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է�: ");
		int money = scan.nextInt();
		System.out.println();
		System.out.println("�ܵ� : "+money);
		
		int man = money/10000;
		int och = (money%10000)/5000;
		int ch = ((money%10000)%5000)/1000;
		int obak = (((money%10000)%5000)%1000)/500;
		int bak = ((((money%10000)%5000)%1000)%500)/100;
		
		System.out.println("10000��: "+man+"��");
		System.out.println("5000��: "+och+"��");
		System.out.println("1000��: "+ch+"��");
		System.out.println("500��: "+obak+"��");
		System.out.println("100��: "+bak+"��");
	}

}
