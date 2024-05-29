import java.util.Scanner;

public class ex03답계산 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				System.out.print("-"+i+" ");
				num1+=i;
			}else {
				num2+=i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("결과: "+(num2-num1));
		
		
		
	}
}
