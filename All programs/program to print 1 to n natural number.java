package print_n;
import java.util.Scanner;
public class print_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number => ");
		int no = input.nextInt();
		for(int i=1 ; i<no ; i++)
		{
			System.out.println(i);
		}
	}

}
