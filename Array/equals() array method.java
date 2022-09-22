package array_equal;
import java.util.Scanner;
import java.util.Arrays;
public class Equal_Arr_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		System.out.println("Enter array element for array 1 = ");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Enter array element for array 2 = ");
		for(int i=0 ; i<b.length ; i++)
		{
			b[i]=r.nextInt();
		}
		boolean B =Arrays.equals(a,b);
		System.out.println("Both arrays are equal :: "+B);
	}

}
