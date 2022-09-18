package d_element;
import java.util.Scanner;
public class Delete_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		int size,loc,i;
		System.out.println("Enter array size => ");
		size = r.nextInt();
		System.out.println("Enter array element => ");
		int[] a =new int[size];
		for(i=0 ; i<size ; i++)
		{
				a[i]=r.nextInt();
		}
		System.out.println("Enter element which you want to delete => ");
		loc=r.nextInt();			//1
		for(i=loc ; i<size-1; i++)
		{
			a[i]=a[i+1];
		}
		size--;
		System.out.println("*****list of Array*****");
		for(i=0 ; i<size ; i++)
		{
				System.out.println(a[i]+" ");
		}
		
		
	}

}
