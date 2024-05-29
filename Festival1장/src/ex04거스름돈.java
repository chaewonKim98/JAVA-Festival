import java.util.Scanner;

public class ex04거스름돈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("총금액 입력: ");
		int money = scan.nextInt();
		System.out.println();
		System.out.println("잔돈 : "+money);
		
		int man = money/10000;
		int och = (money%10000)/5000;
		int ch = ((money%10000)%5000)/1000;
		int obak = (((money%10000)%5000)%1000)/500;
		int bak = ((((money%10000)%5000)%1000)%500)/100;
		
		System.out.println("10000원: "+man+"개");
		System.out.println("5000원: "+och+"개");
		System.out.println("1000원: "+ch+"개");
		System.out.println("500원: "+obak+"개");
		System.out.println("100원: "+bak+"개");
	}

}
