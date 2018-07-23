import java.util.Scanner;
public class ArrayLength {
	public static void main(String args[]) {
		String v,r;
		Scanner rk=new Scanner(System.in);
		r=rk.nextLine();
		v=r.replaceAll(" ","");
		int l=v.length();
		System.out.println(l);
		rk.close();
	}

}
