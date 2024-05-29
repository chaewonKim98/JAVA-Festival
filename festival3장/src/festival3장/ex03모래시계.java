package festival3장;

public class ex03모래시계 {

	private static final char A = 0;

	public static void main(String[] args) {
//		for(char A=65; A<=81; A++) {
//			System.out.print(A+" ");
//			if(A=='E') {
//				System.out.println();
//				System.out.print("  ");
//			}else if(A=='H') {
//				System.out.println();
//				System.out.print("    ");
//			}else if(A=='I') {
//				System.out.println();
//				System.out.print("  ");
//			}else if(A=='L') {
//				System.out.println();
//			}
//	}
	for(char A = 65; A<=81; A++) {
		System.out.print(" "+A+" ");
		if(A=='E') {
			System.out.println();
			System.out.print("   ");
		}else if(A=='H') {
			System.out.println();
			System.out.print("      ");
		}else if(A=='I') {
			System.out.println();
			System.out.print("   ");
		}else if(A=='L') {
			System.out.println();
			System.out.print("");
		}
	}
	
}
}