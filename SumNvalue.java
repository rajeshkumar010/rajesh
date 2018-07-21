import java.util.Scanner;
public class SumNvalue {
	public static void main(String args[]) {
		int a;
		int sum=0;
		Scanner rk=new Scanner(System.in);
		a=rk.nextInt();
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		rk.close();
	}

}
