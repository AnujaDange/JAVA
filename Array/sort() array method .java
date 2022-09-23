package array_methods;
import java.util.Arrays;
import java.util.Scanner;
public class Array_methosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("Enter array element = ");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=r.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Element after sorting array => ");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
