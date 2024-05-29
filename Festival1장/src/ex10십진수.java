import java.util.Scanner;

public class ex10십진수 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자입력>> ");
//		int N = scan.nextInt();
//		int[] B = new int[32];
//		
//		int i=0;
//		while(N != 1) {
//			B[i++] = N%2;
//			N/=2;
//		}
//		B[i] = N;
//		for(int j = i; j>=0; j--) {
//			System.out.print(B[j]+" ");
//		}
	Scanner scan = new Scanner(System.in);
	System.out.println("숫자입력>> ");
	int N = scan.nextInt();
	int[] B = new int[32];
	int i=0;
	
	while(N!=1) {
		B[i++] = N%2;
		N/=2;
	}
	B[i] = N;
	for(int j=i; j>=0; j--) {
		System.out.print(B[j]+" ");
	}
	
	
	
	
	
	
	
	
	
	}

}
