import java.awt.image.RescaleOp;

import javax.naming.spi.DirStateFactory.Result;

public class ex27isDivide {

	public static void main(String[] args) {
//		�� ���� ������ �Ű������� �޾� ���� ������
//		 ���� ������ �������������� �Ǻ��ϴ� �޼ҵ� isDivide( ) �� �ۼ��ϼ���. �̶�, ���������� true, 
//		���������� ������ false�� ��ȯ��.
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("���Ȯ�� : "+result);

	}
	public static boolean isDivide(int num1,int num2) {
		boolean result ;
		if(num1%num2==0) {
			result = true;
		}else {
			result = false;
		}
		return result; 
	}

}
