import java.util.Scanner;

public class ex28getMiddle {

	public static void main(String[] args) {
//		��� ���� ���ϱ� 
//		getMiddle�޼ҵ�� �ϳ��� �ܾ �Է� �޽��ϴ�.
//		 �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������. 
//		�ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�, 
//		�Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�>> ");
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
