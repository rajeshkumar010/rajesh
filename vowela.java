import java.util.Scanner;
public class Vowela 
{
public static void main(String args[]){
	char r;
	Scanner rk= new Scanner(System.in);
	System.out.println("Enter the Vowel ");
	r=rk.next().charAt(0);
	switch(r){
	case 'a':
        System.out.println("The given character "+r+" is vowel");
        break;

        case 'e':
        System.out.println("The given character "+r+" is vowel");
        break;

        case 'i':
        System.out.println("The given character "+r+" is vowel");
        break;

        case 'o':
        System.out.println("The given character "+r+" is vowel");
        break;

        case 'u':
        System.out.println("The given character "+r+" is vowel");
        break;

        default:
        System.out.println("The given character "+r+" is consonant");
        break;
	}
	rk.close();
}
}
