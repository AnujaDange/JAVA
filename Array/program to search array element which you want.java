package search_array;
import java.util.Scanner;
public class Array_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.println("Enter size for array => ");
		int size = r.nextInt();
		System.out.println("Enter array elements => ");
		int[] a = new int[size];
		for(int i=0 ; i< a.length ; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("List of Array");
		for(int i=0 ; i< a.length ; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter element which you want search => ");
		int ele = r.nextInt();
		for(int i=0 ; i< a.length ; i++)
		{
			if(a[i]==ele)
			{
				System.out.printf(" Element" +a[i]+" found at location =>%d ",(i+1));
			}
		}
		
	}

}
