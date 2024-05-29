package festival2장;

import java.util.Random;

public class ex07로또당첨랜덤 {

	public static void main(String[] args) {
		Random rd = new Random();
		int [] B = new int [6];
		
		for(int i=0; i<B.length; i++) {
			int num = rd.nextInt(50)+1;
			B[i] = num;
			if(B[i]==num) {
				num--;
			}
			System.out.println("행운의 숫자: "+B[i]);
		}
		
	}

}
