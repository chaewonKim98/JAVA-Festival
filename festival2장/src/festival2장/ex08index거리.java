package festival2장;

public class ex08index거리 {
///이거 복습
	public static void main(String[] args) {
//		int[] point = {92,32,52,9,81,2,68};
//		int minindex = point[0]-point[1];
//		int num1 = 0;
//		int num2 = 0;
//		for (int i = 0; i < point.length; i++) {
//			for(int j=i+1; j<point.length; j++) {
//				if(Math.abs(point[i]-point[j])<minindex) {
//					minindex = Math.abs(point[i]-point[j]);
//					num1 = i;
//					num2 = j;
//				}
//			}
//		}
//		System.out.printf("result = [%d , %d]",num1, num2);
//		
	int[] point = {92,32,52,9,81,2,68};
	int minIndex = point[0]-point[1];
	int num1 = 0;
	int num2 = 0;
	for (int i = 0; i < point.length; i++) {
		for (int j = i+1; j < point.length; j++) {
			if(Math.abs(point[i]-point[j])<minIndex) {
				minIndex = point[i] - point[j];
				num1 = i;
				num2 = j;
			}
		}
	}
	System.out.printf("result = [%d, %d]",num1, num2);
		
		
		
		
		
		
		
		
		
	}

}
