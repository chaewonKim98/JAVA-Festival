import java.util.Scanner;

public class ex28getMiddle {

	public static void main(String[] args) {
//		가운데 글자 구하기 
//		getMiddle메소드는 하나의 단어를 입력 받습니다.
//		 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요. 
//		단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 
//		입력받은 단어가 test라면 es를 반환하면 됩니다
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력>> ");
		String A = scan.next();
		System.out.println(getMiddle(A));
	}
	public static String getMiddle(String A) {
		if(A.length()%2==0) {
			return  A.substring(A.length()/2-1,A.length()/2+1);
		}else {
			return A.substring(A.length()/2,A.length()/2+1);
		}
	}

}
