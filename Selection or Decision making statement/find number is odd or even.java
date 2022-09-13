package oddeven;
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner num = new Scanner(System.in);
       System.out.println("Enter any positive number =>");
       int no=num.nextInt();
       if(no % 2 == 0)
       
    	   System.out.println(no + " is even number");
       
       else
       
    	   System.out.println(no + " is odd number");
       
	}

}
