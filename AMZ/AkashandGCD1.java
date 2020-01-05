package AMZ;

import java.util.Scanner;
public class AkashandGCD1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
			a[i]=sc.nextInt();
		int Q=sc.nextInt();
		while(Q>0)
		{
			
			//String ch=sc.next();
			char c=sc.next().charAt(0);
			if(c=='C')
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				System.out.println(gcd(x-1,y-1,a));
			}
			Q--;
		}
	}
	public static int gcd(int x,int y,int A[])
	{
		int result=1;
		for(int i=x;i<=y;i++)
			result=gcdFinal(result,A[i]);
		return result;
	}
	public static int gcdFinal(int a,int b)
	{
		if(b==0)
			return a;
		return gcdFinal(b,a%b);
	}

}
