package fibonaccies_series;
import java.util.Scanner;
public class Fibonaccies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int c,a=0 ,b=1;
        System.out.println("Enter number from where you want fibonaccies series");
        int no = input.nextInt();
        System.out.println("*************Fibonaccies series**************");
        for(int i=0 ; i<=no ; i++)
        {
        	c=a+b;
        	a=b;
        	b=c;
        	System.out.print(" "+c);
        }
        
	}
}
