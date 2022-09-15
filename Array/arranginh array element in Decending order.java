package Descending_order;
import java.util.Scanner;
public class Arranging_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array elements => ");
		Scanner input = new Scanner(System.in);
		int[] a = new int[5];
		int temp;
	    for(int i=0; i<a.length ; i++)
	    {
	    	a[i]=input.nextInt();
	    }
	    System.out.println("****************Array Elements Are****************");
	    for(int i=0 ; i<a.length ; i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	    System.out.println();
	    System.out.println("*********Elements Arranged In Descending order**********");
	    for(int i=0 ; i<a.length ; i++)
	    {
	    	for(int j=i+1 ;j<a.length ; j++)
	    	{
	    		if(a[i]>a[j])
	    		{
	    			temp=a[i];
		    		a[i]=a[j];
		    		a[j]=temp;
	    		}
	    	}
	    	System.out.println(a[i]+" ");
	    }
	    
	}

}
