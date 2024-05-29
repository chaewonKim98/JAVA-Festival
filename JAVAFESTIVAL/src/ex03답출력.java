
public class ex03답출력 {

	public static void main(String[] args) {
		int plus = 0;
		int minus = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("-" + i);
				minus += i;
			} else {
				System.out.print(" " + i + " ");
				plus += i;
			}
		}
		System.out.println();
		System.out.println("결과: " + (plus - minus));

	}

}
