import java.util.Scanner;

public class ex07최대공약수최소공배수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1입력>> ");
		int num1 = scan.nextInt();
		System.out.print("숫자2입력>> ");
		int num2 = scan.nextInt();
		int min = 0;
		int max = 0;
		for(int i=1; i<=num1&&i<=num2;i++) {
			if(num1%i==0&num2%i==0) {
				min = i;
			}
		}
		max = (num1*num2)/min;
		System.out.println("최대공약수: "+min);
		System.out.println("최소공배수: "+max);
		
	}

}
