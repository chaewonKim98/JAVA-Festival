
public class ex24180��ȸ�� {

	public static void main(String[] args) {
//		�Ʒ��� ���� 2���� �迭�� �������� 180�� ȸ���Ͽ� 
//		����Ͻÿ�.
		int [][] num = new int[5][5];
		int cnt = 1;
		System.out.println("����");
		
		for(int i =0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				num[i][j] = cnt;
				System.out.print(num[i][j]+"\t");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("180�� ȸ��");
		
		for(int i =num.length-1; i>=0; i--) {
			for(int j=num.length-1; j>=0; j--) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
