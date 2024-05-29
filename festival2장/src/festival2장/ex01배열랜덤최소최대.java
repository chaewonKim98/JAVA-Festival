package festival2장;

import java.util.Random;

public class ex01배열랜덤최소최대 {

	public static void main(String[] args) {
//		Random rd = new Random();
//		int [] B = new int[8];
//		int max = 0;
//		int min = 100;
//		System.out.print("배열에 있는 모든 값: ");
//		
//		
//		for(int i=0; i<B.length; i++) {
//			B[i] = rd.nextInt(50)+1;
//			System.out.print(B[i]+" ");
//			if(B[i]>max) {
//				max = B[i];
//			}else if(B[i]<min) {
//				min = B[i];
//			}
//		}
//		System.out.println();
//		System.out.println("가장 큰 값: "+max);
//		System.out.println("가장 작은 값: "+min);
//		
		
		Random rd = new Random();
		int[] B = new int[8];
		System.out.print("배열에 있는 모든 값: ");
		int max = 0;
		int min = 100;
		
		for(int i=0; i<B.length; i++) {
			B[i] = rd.nextInt(100)+1;
			System.out.print(B[i]+" ");
		}
		for (int i = 0; i < B.length; i++) {
			if(B[i]>max) {
				max = B[i];
			}
			if(B[i]<min) {
				min = B[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰값: "+max);
		System.out.println("가장 작은 값: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
