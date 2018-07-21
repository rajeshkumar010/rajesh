import java.util.Scanner;
class EvenNumber {
	public static void main(String args[]) {
  int n;
  Scanner rk=new Scanner(System.in);
  n=rk.nextInt();
		System.out.println("The Even Numbers are: ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
