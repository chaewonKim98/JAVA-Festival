
public class ex33�輭��ã�� {

	public static void main(String[] args) {
//		���￡�� �輭�� ã��
//		findKim �޼ҵ�� String�� �迭 names�� �Ű������� �޽��ϴ�.
//		names�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϼ���.names�� "Kim"��
//		���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
		String[] names = {"Queen","Tod","Kim"}; 
		System.out.println(findKim(names));
	}
	public static String findKim(String[] names) {
		
		String result = "" ;
		for(int i=0; i<names.length; i++) {
			if(names[i].matches("Kim")) {
				result = "�輭���� "+(i+1)+"�� �ս��ϴ�.";
			}
			
		}
		return result;
		
	}

}
