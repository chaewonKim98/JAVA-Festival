                            
public class ex31�Ǻ���ġ���� {

	public static void main(String[] args) {
//		������ ���� input�� �����ϰ� 
//		�Ǻ���ġ ������ input��° �ױ��� ����Ͻÿ�.
	     int input = 8;
	      for (int i = 1; i <= input; i++) {
	         System.out.print(fibo(i) + " ");
	      }
	   }

	   public static int fibo(int a) {
	      if (a==1 || a==2) {
	         return 1;
	      }
	      else if(a>2) {
	         return fibo(a-1)+fibo(a-2);
	      }
	      else {
	         return 0;
	      }
	   }
}