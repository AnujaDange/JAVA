/*Perfect number is the positive interger that is equal 
  to the sum of its positive divisor,excluding the number itself
  means for eg. 6 =3*2*1
 */


package number;
import java.util.Scanner;
public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number => ");
		int no = input.nextInt();
		int sum=0;
		for(int i=1 ; i<=no/2 ; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println(no+" is perfect number ");
		}
		else
		{
			System.out.println(no+" is not perfect number ");
		}
	}

}
