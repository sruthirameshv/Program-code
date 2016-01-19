import java.util.Scanner;

public class LongestCsubstring {
	//implemented using dynamic programming
	public static int Lcs(int m,int n,char []s1,char []s2)
	{
		
		int [][]LcsStff=new int [m+1][n+1];
		int res=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0)
					LcsStff[i][j]=0;
				else if(s1[i-1]==s2[j-1])
				{
					LcsStff[i][j]=LcsStff[i-1][j-1]+1;
					res=max(res,LcsStff[i][j]);
				}
				else
					LcsStff[i][j]=0;
					
			}
		}
		return res;
		
	}
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String [] args)
	{
		
		Scanner in=new Scanner(System.in);
		String str1,str2;
		System.out.println("Please enter  string1");
		str1=in.next();
		System.out.println("Please enter  string2");
		str2=in.next();
		
		int m=str1.length();
		System.out.println(m);
		int n=str2.length();
		System.out.println(n);
		int res=Lcs(m,n,str1.toCharArray(),str2.toCharArray());
		System.out.println(res);
		
		
	}

}
