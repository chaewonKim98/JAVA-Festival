package festival2장;

import java.util.Scanner;

public class ex110입력하면종료 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("A 입력>> ");
		int A = scan.nextInt();
		System.out.print("B 입력>> ");
		int B = scan.nextInt();
		if(A==0&&B==0) {
			break;
		}else {
		System.out.println("결과>> "+(A-B));
		}
		}
		
		
		
	}

}
