package festival3��;

public class ex05isDivideMethod {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1,num2);
		System.out.println("���Ȯ��: "+result);

	}
	public static boolean isDivide(int num1, int num2) {
		boolean result = true;
		if(num1%num2==0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	

}
