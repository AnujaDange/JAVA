package display_table;
import java.util.Scanner;
public class Mul_Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number => ");
		int no = input.nextInt();
		System.out.println("\n*************************TABLE***************************");
		for(int i=1 ; i<=10 ; i++)
		{
			for(int j=1 ; j<=no ;j++)
			{
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}
		
	}

}
