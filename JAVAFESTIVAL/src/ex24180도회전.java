
public class ex24180도회전 {

	public static void main(String[] args) {
//		아래와 같은 2차원 배열을 왼쪽으로 180도 회전하여 
//		출력하시오.
		int [][] num = new int[5][5];
		int cnt = 1;
		System.out.println("원본");
		
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				num[i][j] = cnt;
				System.out.print(num[i][j]+"\t");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("180도 회전");
		
		for(int i =num.length-1; i>=0; i--) {
			for(int j=num.length-1; j>=0; j--) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
