public class DivisibleNumber 
{
  public static void main(String args[])
  {
	 int a=1;
	 while(a<=150)
	 {
		 if(a%2==0 && a%3==0 && a%5==0)
		 {
			System.out.print("\t"+a);
	     }
		 a++;
	 }
  }
}
