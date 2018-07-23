import java.util.Scanner;
public class StringWconcat {
	public static void main(String args[]){
	int i=0;
    String s1,s2;
    Scanner rk=new Scanner(System.in);
    System.out.print("Enter the first string:");
    s1=rk.nextLine();
    System.out.print("Enter the Second string:");
    s2=rk.nextLine();
    char s3[]=new char[s1.length()+s2.length()];
    for(;i<s1.length();i++)
        s3[i]=s1.charAt(i);
    for(int j=0;j<s2.length();j++)
        s3[i++]=s2.charAt(j);
    System.out.println("Result: "+new String(s3));
}
}
