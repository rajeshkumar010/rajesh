import java.util.Scanner;
public class CountSpace {
     public static void main(String[] args) {
		String v;
		int c=0;
		System.out.println("Enter the String");
		Scanner rk=new Scanner(System.in);
		v=rk.nextLine();
		String r[]= new String[v.length()];
		for(int i=0;i<v.length();i++) {
			r[i]=v.substring(i,i+1);
			if(r[i].equals(" ")) {
				c++;
			}
		}
		System.out.println(c);

	}

}
