import java.util.Scanner;
public class OddSum 
{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args)
    {
        int T = teclado.nextInt();
        int[] array = new int[T];
        for(int i = 0; i < array.length; i++) 
        {
            System.out.println("Case "+(i+1)+": "+sum());
        }
    }
    public static int sum()
    {
        int a=teclado.nextInt();
        int b = teclado.nextInt();
        int array[] = new int[1000000];
        for (int i = 0; i < array.length; i++) 
        {   
            if(a%2!=0)
            {               
                array[i]=a;
                if(array[i]==(b))
                {
                    break;
                }
            }   
            a++;    
        }
        int res=0;

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]==1 && array[2]==0)
            {
                return 1;
            }

            else
            {
            res = res + array[i];
            }
        }
        return res;
    }
}
