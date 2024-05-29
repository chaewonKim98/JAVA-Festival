import java.util.Scanner;

public class ex09소인수분해 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("소인수분해 할 수를 입력하세요>> ");
//		int num = scan.nextInt();
//		System.out.print(num+" = ");
//		
//		for (int i = 2; i <= num; i++) {
//			if(num%i==0) {
//				System.out.print(i);
//				num/=i;
//				i--;
//			if(i<num){
//				System.out.print("*");
//			}else {
//				break;
//			}
//		}
//		
//		}
//		
	Scanner scan = new Scanner(System.in);
	System.out.print("소인수분해 할 수를 입력하세요.: ");
	int num = scan.nextInt();
	System.out.print(num+" = ");
	
	for (int i = 2; i <=num; i++) {
		if(num%i==0) {
			System.out.print(i);
			num/=i;
			i--;
			if(num>i) {
				System.out.print("*");
			}else {
				break;
				
			}
		}
	}
	
	}

}
