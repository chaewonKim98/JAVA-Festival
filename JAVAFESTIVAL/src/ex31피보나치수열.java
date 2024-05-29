                            
public class ex31피보나치수열 {

	public static void main(String[] args) {
//		정수형 변수 input을 선언하고 
//		피보나치 수열의 input번째 항까지 출력하시오.
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