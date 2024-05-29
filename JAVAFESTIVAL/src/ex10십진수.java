import java.util.Scanner;

public class ex10십진수 {

	public static void main(String[] args) {
		// 십진수

		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자입력>> ");
//		int N = scan.nextInt(); // 숫자 입력
//		int[] B = new int[32]; // 배열 생성
//
//		int i = 0;
//		while (N != 1) { // 입력한 값이 1이아니라면
//			B[i++] = N % 2; // 배열 0부터 1씩 증가하면서 입력한 숫자를 2로나눈 나머지를 배열에 넣는다(B에는
//			N = N / 2; // 입력한 수는 2로 나눈 몫을 가진다.
//		}
//		B[i] = N;
//		for (int j = i; j >= 0; --j) {
//			System.out.print(B[j] + " ");
//		}
		System.out.println("숫자입력>> ");
		int N = scan.nextInt();
		int [] B = new int[32];
		
		int i = 0;
		while(N != 1) {
			
				B[i++] = N%2;
				N /= 2;
		}
		B[i] = N;
		for(int j=i; j>=0; j--) {
			System.out.print(B[j]+" ");
		}
		
		
		
		
	}

}
