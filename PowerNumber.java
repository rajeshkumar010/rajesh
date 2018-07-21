import java.util.Scanner;
public class PowerNumber {
	public static void main(String args[]) {
		 int n,p,result=1;
		 Scanner rk=new Scanner(System.in);
		 n=rk.nextInt();
		 p=rk.nextInt();
		    if(n>=0&&p==0)
		     {
		        result=1;
		     }
		    else if(n==0&&p>=1)
		      { 
		         result=0;
		      }
		    else
		     {
		         for(int i=1;i<=p;i++)
			 {
		            result=result*n;
		 	 }	    
		     }
		    System.out.println(n+"^"+p+"="+result);
	}

}
