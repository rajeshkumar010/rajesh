import java.util.Scanner;
public class CountNrange {
public static void main(String args[]){
	 int count = 0,r;
	 System.out.println("Enter the Number:");
	 Scanner rk=new Scanner(System.in);
	 r=rk.nextInt();
     while(r != 0)
     {
         // r = r/10
         r /= 10;
         ++count;
     }
     System.out.println("Number of digits: " + count);
}
}
