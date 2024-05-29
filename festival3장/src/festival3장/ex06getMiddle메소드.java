package festival3장;

public class ex06getMiddle메소드 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));

	}
	private static String getMiddle(String str) {
		String result = "";
		if(str.length()%2==0) {
			result = str.substring(str.length()/2-1,str.length()/2+1);
		}else {
			result =str.substring(str.length()/2,str.length()/2+1); 
		}
		return result;
	}

}
