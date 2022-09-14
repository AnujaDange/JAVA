package Ascending_order;
import java.util.Scanner;
public class Arranging_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array elements => ");
		int[] a = new int [5];
		int temp;
		for(int i=0 ;i<a.length ; i++)
		{
			a[i]=input.nextInt();
		}
		System.out.println("Array elements => ");
		for(int i=0 ;i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\n");
		System.out.println("___________After arranging in Ascending order___________");
		System.out.println("\n");
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i+1 ; j<a.length ; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0 ;i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
