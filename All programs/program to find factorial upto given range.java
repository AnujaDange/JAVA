package factorial_range;
import java.util.Scanner;
public class fact_range {

	static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number => ");
		int no = sc.nextInt();
		for(int i=0 ; i<=no ; i++)
		{
			System.out.println(fact(i));
		}
	}

}