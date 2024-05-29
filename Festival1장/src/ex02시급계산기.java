import java.util.Scanner;

public class ex02시급계산기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요: ");
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
		System.out.println("총 임금은 "+result+"원 입니다.");
	}

}
