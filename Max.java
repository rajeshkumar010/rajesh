package rajesh;
import java.util.Scanner;
public class SumA_P {
	public static void main(String args[]) {
		int max;
		int i,j,r;
		Scanner rk=new Scanner(System.in);
		r=rk.nextInt();
		int rv[]=new int[r];
		for(i=0;i<r;i++) {
			rv[i]=rk.nextInt();
			}
		max=rv[0];
			for(i=0;i<r;i++) {
				if(rv[i]>max) {
				 max=rv[i];
				}
			
			}
		System.out.print(max);
		rk.close();
	}

}
