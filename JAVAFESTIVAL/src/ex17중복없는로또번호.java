import java.util.Random;

public class ex17중복없는로또번호 {

	public static void main(String[] args) {

		int A[] = new int[6];
		Random rd = new Random();

		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(99) + 1; // 1 ~ 99까지의 난수
			for (int j = 0; j < i; j++) {
				if (A[i] == A[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println("행운의 숫자 : " + A[i]);
		}

	}

}
