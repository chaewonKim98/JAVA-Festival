
public class ex30연산메소드 {

	public static void main(String[] args) {
//		num1, num2, op (+, -, *, /) 를 매개변수로 받아 num1과 num2를 op에 맞게 연산한 결과값을 
//		반환해주는 cal 메소드를 작성하세요. 
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
