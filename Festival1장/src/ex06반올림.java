import java.util.Scanner;

public class ex06�ݿø� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = scan.nextInt();
		int result = 0;
		if(num%10<5) {
			result = num-(num%10);
		}else {
			result = num+(10-(num%10));
		}
		System.out.println("�ݿø� �� : "+result);
	}

}
