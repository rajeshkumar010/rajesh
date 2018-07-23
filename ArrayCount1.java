import java.util.Scanner;
public class ArrayCount1 {
	public static void main(String args[]) {
		String v;
		System.out.println("Enter the String: ");
		Scanner rk=new Scanner(System.in);
		v=rk.nextLine();
		String r[]=v.split(" ");
		System.out.println(r.length);
		rk.close();
	}

}
