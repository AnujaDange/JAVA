package array_copy;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_Arr_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("Enter array element = ");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Array after copy element");
		int[] b = Arrays.copyOf(a,5);
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
