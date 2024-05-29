import java.util.Arrays;
import java.util.Scanner;

public class ex22버블정렬오름차순 {

	public static void main(String[] args) {
		// 버블정렬로 오름차순
		// 입력받은 값들을 정렬해준다.
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5]; // 5개의 방을 만든다.
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 수 입력>> ");
			int num = scan.nextInt();
			arr[i] = num;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
			// for each문 사용하시면 됩니당감사합니다 ㅜㅜㅜㅜ
			// for(배열 원소 형태(자료형) 임의 변수 : 배열명)
			// 파이썬에서 for i in arr
			// 했을때 i가 각각 arr의 원소들이 나오는 것과 같다고 보시면 될것같습니당
			// 감사해요ㅠㅠㅠㅠㅠ
		}

	}

}
