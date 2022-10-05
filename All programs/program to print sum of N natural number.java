package snumber;
import java.util.Scanner;
public class Sun_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number => ");
		int no = input.nextInt();
		int sum=0;
		for(int i=1 ;i<=no ; i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of N number => "+sum);
	}

}
