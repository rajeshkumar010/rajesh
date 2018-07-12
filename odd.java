package rajesh;
import java.util.*;
import java.util.Scanner;
public class Odd {
	public static void main(String args[])
	{
		int a;
		Scanner rk=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=rk.nextInt();
		if(a%2==0)
		{
			System.out.println(" Even ");
		}
		else
		{
			System.out.println(" odd ");
		}
	}

}
