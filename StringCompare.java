import java.util.Scanner;
public class StringCompare {
	public static void main (String args []) {
		String a;
		String b;
	    Scanner rk=new Scanner(System.in);
	    System.out.println("Enter the two String: ");
		a=rk.nextLine();
		b=rk.nextLine();
		
		if(a.equals(b)) {
		System.out.println("equal" +a);
		}
		else{
			System.out.println("not equal ");
		}
		
	}

}
