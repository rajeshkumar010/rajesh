package rajesh;
import java.util.Scanner;
public class StringRepeat {
       public static void main(String args[]) {
    	   int a;
    	   String b;
    	   System.out.println("Enter the String:");
    	   Scanner rk=new Scanner(System.in);
    	   b=rk.nextLine();
    	   a=rk.nextInt();
    	 
    	   //System.out.println("Enter the print times: ");
    	   for (int i=0;i<=a;i++)
    	   {
    		   System.out.println(b);
    	   }
       }
}
