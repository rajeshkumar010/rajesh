import java.util.Scanner;
public class LeapYear {
public static void main(String args[]){
	 int year;
	 Scanner rk=new Scanner(System.in);
	 System.out.println("Enter the year");
	 year=rk.nextInt();
     if(year % 4 == 0)
     {
         System.out.println("It is a Leap Year");
     }
     else
     {
         System.out.println("It is Not Leap Year");
     }
     rk.close();
}
}
