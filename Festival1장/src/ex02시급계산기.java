import java.util.Scanner;

public class ex02�ñް��� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ���: ");
		int time = scan.nextInt();
		int bonus = 7500;
		int money = 5000;
		int num = 40000;
		int result = 0;
		if(time<8) {
			result = money * time;
		}else {
			result = num+((time-8)*bonus);
		}
		System.out.println("�� �ӱ��� "+result+"�� �Դϴ�.");
	}

}
