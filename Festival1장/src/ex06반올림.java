import java.util.Scanner;

public class ex06반올림 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = scan.nextInt();
		int result = 0;
		if(num%10<5) {
			result = num-(num%10);
		}else {
			result = num+(10-(num%10));
		}
		System.out.println("반올림 수 : "+result);
	}

}
