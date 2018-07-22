import java.util.Scanner;
public class Numeric {
	public static void main(String[] args) {

        String string;
        Scanner rk=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        string=rk.nextLine();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println( " YES ");
        else
            System.out.println( " NO ");
        rk.close();
    }
}
