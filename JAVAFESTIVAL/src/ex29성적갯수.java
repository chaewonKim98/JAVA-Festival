
public class ex29성적갯수 {

	public static void main(String[] args) {
//		아래와 같이 학생들의 성적정보가 문자열로 
//		선언되어 있을 때 각 성적 별 학생 수를 출력하시오.
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int cnta=0;
		int cntb=0;
		int cntc=0;
		int cntd=0;
		int cntf=0;
		for(int i=0; i<score.length(); i++) {
			char A = score.charAt(i);
			if(A=='A') {
				cnta++;
			}else if(A=='B') {
				cntb++;
			}
			else if(A=='C') {
				cntc++;
			}
			else if(A=='D') {
				cntd++;
			}
			else if(A=='F') {
				cntf++;
			}
			
		}
		System.out.println("A: "+cnta+"명");
		System.out.println("B: "+cntb+"명");
		System.out.println("C: "+cntc+"명");
		System.out.println("D: "+cntd+"명");
		System.out.println("F: "+cntf+"명");

	}

}
