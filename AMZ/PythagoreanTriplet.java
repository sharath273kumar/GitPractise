package AMZ;

import java.util.Arrays;

public class PythagoreanTriplet {
	public static void main(String agrs[])
	{
		int arr[] = {3, 1, 4, 6, 5};
		find(arr);
	}

	public static void find(int A[])
	{
		int n=A.length;
		for(int i=0;i<n;i++)
			A[i]*=A[i];
		Arrays.sort(A);
		for(int i=n-1;i>=2;i--)
		{
			
			int l=0;
			int r=i-1;
			while(l<r)
			{
				if(A[l]+A[r]==A[i])
					System.out.println("Ans"+A[l]+" "+A[r]+" "+A[i]);
				
				if (A[l] + A[r] < A[i]) 
	                l++; 
	            else
	               r--;
			}
		}
	}
}
