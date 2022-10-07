package sum_of_primeno;
import java.util.Scanner;
public class Prime_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter number => ");
		int no = input.nextInt();
		for(int i=2 ; i<=no ; i++)
		{
			boolean isNumberPrime = true;
			for(int j=2 ; j<i ;j++)
			{
				if(i%j==0)
				{
				   isNumberPrime = false;
				   break;
				}
			}
			if(isNumberPrime)
			{
				System.out.println(i +" ");
				sum=sum+i;
			}
		}
		System.out.printf("sum of prime number =>%d",sum);
		
	}

}
