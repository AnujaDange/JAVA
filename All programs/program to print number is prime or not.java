package prime_or_not;
import java.util.Scanner;
public class Num_prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter any positive number => ");
		int num = r.nextInt();
		for(int i=2 ; i<=num ; i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}
			if(cnt == 1)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		
	}

}
