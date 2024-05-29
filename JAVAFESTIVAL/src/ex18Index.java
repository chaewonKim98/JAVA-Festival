
public class ex18Index {

	public static void main(String[] args) {
//		아래와 같이 1차원의 점들이 주어졌을 때, 
//		그 중 가장 거리가 짧은 점(index)들을 출력하시오.
//		(단, 점들 사이의 거리는 모두 다르다)
		int[] point = {92,32,52,9,81,2,68};
		int minIndex = point[0]-point[1];
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0;  i<point.length;i++) {
			for(int j=i+1; j<point.length; j++) {
				if(Math.abs(point[i]-point[j])<minIndex) {
					minIndex = Math.abs(point[i]-point[j]);
					num1 = i;
					num2 = j;
				}
			}
		}
		System.out.printf("result = [%d , %d]",num1, num2);
	}

}
