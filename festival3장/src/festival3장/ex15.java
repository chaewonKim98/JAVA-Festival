package festival3장;

import java.util.Arrays;

public class ex15 {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[] = {2,4,6,8,10,12,14,16,18,20};
		int Merge[] = mergeArray(A,B);

	}
	public static int[] mergeArray(int[] A,int[]B) {
		int[] result = new int[A.length+B.length];
		
		//배열A 값 추가
		for(int i = 0; i<A.length; i++) {
			result[i] = A[i];
		}
		//배열 B겂 추가
		for (int i = A.length; i < result.length; i++) {
			result[i] = B[i-A.length];
		}
		//자동 정렬 해주기!->sort()
		Arrays.sort(result);
		
		System.out.print("merge: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"  ");
		}
		
		return result;
	}


	}


