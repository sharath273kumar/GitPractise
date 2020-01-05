package AMZ;

import java.util.Arrays;

public class LongestSplSubSeq {
	public static void main(String args[]) {
		String a = "awofjoibewfc";
		int N = a.length();
		System.out.println(Solution(a,N,2));
	}
	
	public static int Solution(String A, int N, int k) {
		int ans = 0;
		int D[] = new int[N];
		Arrays.fill(D, 1);
		
		for(int i = 1;i < N;i++) {
			int a = A.charAt(i) - 'a';
			for(int j=0;j<i;j++) {
				int b = A.charAt(j) - 'a';
				if(Math.abs(a-b) <= k)
					
					D[i] = Math.max(D[i], D[j]+1);
			}
		}
		System.out.println(Arrays.toString(D));
		return D[N-1];
	}

}
