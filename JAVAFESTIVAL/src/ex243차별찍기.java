import java.util.Scanner;

public class ex243차별찍기 {

	public static void main(String[] args) {
		//행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.print("행 개수>> ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
