
public class ex29�������� {

	public static void main(String[] args) {
//		�Ʒ��� ���� �л����� ���������� ���ڿ��� 
//		����Ǿ� ���� �� �� ���� �� �л� ���� ����Ͻÿ�.
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
		System.out.println("A: "+cnta+"��");
		System.out.println("B: "+cntb+"��");
		System.out.println("C: "+cntc+"��");
		System.out.println("D: "+cntd+"��");
		System.out.println("F: "+cntf+"��");

	}

}
