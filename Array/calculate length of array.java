package array_length;
import java.util.Scanner;
public class A_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[3];
		System.out.println("Enter array elemants => ");
		for(int i=0 ; i<a.length ;i++)
		{
		  a[i] = input.nextInt();
		}
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Array Length => "+ a.length);
		
	}

}
