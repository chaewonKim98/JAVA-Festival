package festival2��;

import java.util.Scanner;
import java.util.Stack;

public class ex13������ձ��ϱ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù�ڱ� 0�� ������ ���ڸ� �Է��ϼ���>> ");
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
		System.out.println("���('-')�� ����>> "+cnt);
	
	}

}
