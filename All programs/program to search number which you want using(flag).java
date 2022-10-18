package srch;
import java.util.Scanner;
public class Srch_Elee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		boolean flag=false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size for array element =>");
		size = input.nextInt();
		System.out.println("*************************");
		int[] a = new int[size];
		for(int i=0 ; i<a.length ; i++)
		{
		   a[i]=input.nextInt();
		}
		System.out.println("********Arry List********");
		for(int i=0 ; i<a.length ; i++)
		{
		   System.out.println((i+1)+" element = " +a[i]);
		}
		System.out.println("*************************");
		System.out.println("Enter element which you want to search => ");
		int ele = input.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i])
			{
			  System.out.println("Element found at index " +(i+1));	
			  flag = true;
			  break;
			}
		}
		if(!flag)
		{
			System.out.println("Element not found !!!");
		}
		
		
	}

}
