import java.util.Scanner;

public class ex243������� {

	public static void main(String[] args) {
		//�� ������ �Է� �޾� ������ ���� �ﰢ���� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ����>> ");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
