package festival2��;

import java.util.Random;

public class ex07�ζǴ�÷���� {

	public static void main(String[] args) {
		Random rd = new Random();
		int [] B = new int [6];
		
		for(int i=0; i<B.length; i++) {
			int num = rd.nextInt(50)+1;
			B[i] = num;
			if(B[i]==num) {
				num--;
			}
			System.out.println("����� ����: "+B[i]);
		}
		
	}

}
