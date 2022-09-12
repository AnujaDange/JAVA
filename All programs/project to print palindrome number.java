package palindrome;
import java.util.Scanner;
import java.lang.reflect.Array;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0,rev=0,n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive number => ");
		int num = input.nextInt();
		n=num;
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse number= "+rev);
		if(n==rev)
		{
			System.out.println(n+" is palindrome number");
		}
		else
		{
			System.out.println(n+" is not palindrome number");
		}
		
	}
}
