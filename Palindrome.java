import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
			int n,r,sum=0,temp;
		System.out.print("enter the number      :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(sum+" YES ");
		else
			System.out.println(sum+" NO ");
	}
}
