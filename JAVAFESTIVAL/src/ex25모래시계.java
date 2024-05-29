
public class ex25모래시계 {

	public static void main(String[] args) {
//		모래시계
//		알파벳 순서대로 다음과 같이 모래시계 모양대로 출력하는
//		코드를 작성하여 출력하시오.
		//A B C D E
		//  F G H
		//    I
		//  J K L
		//M N O P Q
		
			
			for(char A=65; A<=81; A++) {
				System.out.print(A+" ");
				if(A=='E') {
					System.out.println();
					System.out.print("  ");
				}else if(A=='H') {
					System.out.println();
					System.out.print("    ");
				}else if(A=='I') {
					System.out.println();
					System.out.print("  ");
				}else if(A=='L') {
					System.out.println();
				}
				
				
			}
			
		
		
		
		

	}

}
