import java.util.Scanner;
public class Ad {
public static void main(String args []) {
		int a,temp=0;
		int i,j;
		Scanner rk= new Scanner(System.in);
		System.out.println(" enter the element: ");
		a=rk.nextInt();
		
		System.out.print("Enter the all elements:  ");
		int rv[] = new int[a];
		for(i=0;i<a;i++) {
			rv[i]=rk.nextInt();
		}
		for(i=0;i<a;i++) {
			for (j=i+1;j<a;j++) {
				if(rv[i]>rv[j]) {
					temp=rv[i];
					rv[i]=rv[j];
					rv[j]=temp;
				}
			}
		}
		for(i=0;i<a;i++){
		System.out.print(rv[i]);
		}
		rk.close();
	}
}
