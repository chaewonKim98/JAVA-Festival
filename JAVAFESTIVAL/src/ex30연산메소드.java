
public class ex30����޼ҵ� {

	public static void main(String[] args) {
//		num1, num2, op (+, -, *, /) �� �Ű������� �޾� num1�� num2�� op�� �°� ������ ������� 
//		��ȯ���ִ� cal �޼ҵ带 �ۼ��ϼ���. 
		int num1 = 30;
		int num2 = 23;
		String op = "-";
		System.out.println(cal(num1, num2, op));

	}
	public static int cal(int num1, int num2, String op) {
		int result = 0;
		if(op.equals("+")) {
			 result = num1+num2;
		}else if(op.equals("-")) {
			result = num1-num2;
		}else if(op.equals("*")) {
			result = num1*num2;
		}else if(op.equals("/")) {
			result = num1/num2;
		}
		return result;
	}

}
