package rajesh;
import java.util.Scanner;
public class Fibonaic {
	public static void main(String args[])
	    {
	       int a=0, b=1, c=0, limit;
	        Scanner scan = new Scanner(System.in);
		    System.out.print("Upto How Many Term ? ");
	        limit = scan.nextInt();  
	        System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
	        c = a + b;
	        limit = limit - 2;
		     while(limit>0)
	        {
	            System.out.print(c + "  ");
	            a = b;
	            b = c;
	            c = a + b;
	            limit--;
	        }
			
	    }
	}
