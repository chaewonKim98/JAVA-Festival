import java.util.Scanner;

public class ex09���μ����� {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���μ����� �� ���� �Է��ϼ���>> ");
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
	System.out.print("���μ����� �� ���� �Է��ϼ���.: ");
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
