package festival2장;

import java.util.Scanner;
import java.util.Stack;

public class ex13대시총합구하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫자기 0을 제외한 숫자를 입력하세요>> ");
		String str = scan.next();
		String[] B = new String[str.length()];
		B = str.split("");
		
		int cnt = 0;
		for (int j = 0; j < B.length; j++) {
		
		switch (B[j]) {
		case "0":
		case "6":
		case "9":
			cnt+=6;
			break;
		case "1":
			cnt+=2;
			break;
		case "2":
		case "3":
		case "5":
			cnt+=5;
			break;
		case "4":
			cnt+=4;
			break;
		case "7":
			cnt+=3;
			break;
		case "8":
			cnt+=7;
			break;
		}
		
		}
		System.out.println("대시('-')의 총합>> "+cnt);
	
	}

}
