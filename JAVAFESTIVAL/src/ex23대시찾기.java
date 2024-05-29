import java.util.Scanner;

public class ex23대시찾기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫자리를 0을 제외한 숫자를 입력해주세요 >> ");
		String num = scan.next();
		
		int sum = 0;
		
		for(int i = 0; i < num.length(); i++) {							
			if(num.substring(i, i+1).equals("0") || num.substring(i, i+1).equals("6") || num.substring(i, i+1).equals("9") ) {
				sum += 6;
			} else if(num.substring(i, i+1).equals("1")) {
				sum += 2;
			} else if(num.substring(i, i+1).equals("2") || num.substring(i, i+1).equals("3") || num.substring(i, i+1).equals("5")) {
				sum += 5;
			} else if (num.substring(i, i+1).equals("4")) {
				sum += 4;
			} else if(num.substring(i, i+1).equals("8")) {
				sum += 7;
			} else {
				sum += 3;
			}
		}
		
		System.out.println("대시('-')의 총 합 >> " + sum);
		

	}

}
