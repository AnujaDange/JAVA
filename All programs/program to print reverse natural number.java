package reverse_n;
import java.util.Scanner;
public class Print_Reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number => ");
		int no = input.nextInt();
		System.out.println("************REVERSE***********");
		for(int i=no ;i>0 ; i--)
		{
			System.out.println( "      "+i);
		}
	}

}
