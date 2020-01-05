package AMZ;

import java.util.Arrays;

public class MaxIntervalOverlap {
	public static void main(String args[]) {
		int arrl[] = {900, 940, 950, 1100, 1500, 1800}; 
        int exit[] = {910, 1200, 1120, 1130, 1900, 2000}; 
        int n = arrl.length; 
        System.out.println(Solution(arrl, exit, n));
	}
	
	/*public static int Solution(int A[], int B[], int N) {
		int min=A[0],max=B[N-1],result=0;
		int count[]=new int[max-min+1];
		for(int i=0;i<N;i++) {
			for(int j=A[i];j<B[i];j++) {
				count[j-min]++;
				result = count[j-min] > result ? count[j-min] : result;
			}
		}
		return result;
	}*/
	
	public static int Solution(int A[],int B[],int N) {
		Arrays.parallelSort(A);
		Arrays.parallelSort(B);
		int result=0,count=0,a=0,b=0;
		while(a<N && b<N) {
			if(A[a]<B[b]) {
				count++;
				a++;
			}
			else {
				count--;
				b++;
			}
			result = count > result ? count : result;
		}
		return result;
	}

}
