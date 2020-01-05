package AMZ;

import java.util.Arrays;

public class ClosestTo0 {
	public static void main(String args[]) {
		int A[] = {5,2,1,-10,2};
		int N = A.length;
		System.out.println(Solution(A,N));
	}
	
	public static int Solution(int A[],int N) {
		Arrays.parallelSort(A);
		int minDistance = Integer.MAX_VALUE,num=1000;
		for(int i = 0;i < N;i++) {
			if(Math.abs(A[i])<minDistance) {
				minDistance = Math.abs(0-A[i]);
				num=A[i];
			}
		}
		return num;
	}

}
