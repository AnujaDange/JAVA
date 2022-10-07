package prime_number;
import java.util.Scanner;
public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cnt=0;
		int temp=0;
		System.out.println("Enter any number => ");
		int no = input.nextInt();
		for(int i=2 ; i<=no ; i++)
		{
			boolean isPrimeNumber = true;
			for(int j=2 ; j<i ; j++)
			{
				if(i%j==0)
				{
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber)
			{
				System.out.println(i+ " ");
			}
	}
	}

}
