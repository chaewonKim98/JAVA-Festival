import java.util.Scanner;

public class ex07�ִ������ּҰ���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
		System.out.print("����1�Է�>> ");
		int num1 = scan.nextInt();
		System.out.print("����2�Է�>> ");
		int num2 = scan.nextInt();
		int min = 0;
		int max = 0;
		for(int i=1; i<=num1&&i<=num2;i++) {
			if(num1%i==0&num2%i==0) {
				min = i;
			}
		}
		max = (num1*num2)/min;
		System.out.println("�ִ�����: "+min);
		System.out.println("�ּҰ����: "+max);
		
	}

}
