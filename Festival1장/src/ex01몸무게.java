import java.util.Scanner;

public class ex01������ {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("���������: ");
		int weight = scan.nextInt();
		System.out.print("��ǥ������: ");
		int goal = scan.nextInt();
		int cnt = 1;
		int sum = 0;
		
		while(true) {
			System.out.print(cnt+"���� ���� ������: ");
			int minus = scan.nextInt();
			cnt++;
			sum+=minus;
			if(weight-sum<goal) {
				System.out.println(weight-sum+"KG�޼�! �����մϴ�!");
				break;
			}
		}
	}

}
