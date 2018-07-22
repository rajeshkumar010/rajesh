import java.util.Scanner;
public class ArrayIndex {
	public static void main(String args[]) {
		int a;
		Scanner rk=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		a=rk.nextInt();
		int b[]=new int [a];
		System.out.println("Enter all Element: ");
		for(int i = 0 ; i < a ; i++){
			b[i] = rk.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+ " "+i);
		}
		rk.close();
	}

}
