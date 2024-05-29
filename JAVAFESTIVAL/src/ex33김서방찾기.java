
public class ex33김서방찾기 {

	public static void main(String[] args) {
//		서울에서 김서방 찾기
//		findKim 메소드는 String형 배열 names을 매개변수로 받습니다.
//		names중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하세요.names에 "Kim"은
//		오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
		String[] names = {"Queen","Tod","Kim"}; 
		System.out.println(findKim(names));
	}
	public static String findKim(String[] names) {
		
		String result = "" ;
		for(int i=0; i<names.length; i++) {
			if(names[i].matches("Kim")) {
				result = "김서방은 "+(i+1)+"에 잇습니다.";
			}
			
		}
		return result;
		
	}

}
