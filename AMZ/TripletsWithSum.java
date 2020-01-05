package AMZ;

import java.util.Arrays;

public class TripletsWithSum {
	public static void main(String args[]) {
		Solution(new int[]{0, -1, 2, -3, 1});
	}
	
	public static void Solution(int A[]) {
		int N = A.length,left,right;
		Arrays.sort(A);
		for(int i=0;i<N-2;i++) {
			left=i+1;
			right=N-1;
			while(left < right) {
				if(A[i] + A[left] + A[right] == 0) {
					System.out.println(A[i]+" "+A[left]+" "+A[right]);
					break;
				}
				else if(A[i] + A[left] + A[right] > 0)
					right --;
				else left ++;
			}
		}
	}

}
