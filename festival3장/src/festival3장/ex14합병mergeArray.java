package festival3¿Â;

import java.util.Arrays;

public class ex14«’∫¥mergeArray {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[] = {2,4,6,8,10,12,14,16,18,20};
		int Merge[] = mergeArray(A,B);

	}
	public static int[] mergeArray(int[] A,int[] B) {
	int[] result = new int[A.length+B.length];
	for(int i=0; i<A.length; i++) {
		result[i] = A[i];
	}
	for(int j=A.length; j<result.length; j++) {
		result[j] = B[j-A.length];
	}
	Arrays.sort(result);
	System.out.print("merge: "+Arrays.toString(result));
	return result;
}
	}