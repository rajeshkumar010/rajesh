import java.util.Scanner;
public class IntegerCount {
	public static void main(String[] args) {
		String r;
		System.out.println("Enter the String: ");
		Scanner rk=new Scanner(System.in);
		r=rk.nextLine();
		char[] ch = r.toCharArray();
		int num = 0;
		
		for(int i = 0; i < r.length(); i++){
			 if(Character.isDigit(ch[i])){
				num ++ ;
			}
		}
		
		System.out.println(num);
	
			}
}
