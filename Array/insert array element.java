package insert_array;
import java.util.Scanner;

public class Insert_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r =new Scanner(System.in);
		int size,loc,item,i;
		System.out.println("Enter size of array => ");
		size = r.nextInt();
		System.out.println("Enter array element => ");
		int[] a = new int[size+1];
		for(i=0 ; i<size ; i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Enter location where you want to store new item => ");
		loc = r.nextInt();
		System.out.println("Enter new item => ");
		item = r.nextInt();
		for(i=size ;i>loc ; i--)
		{
		  a[i]=a[i-1];					// to empty array index
		}
		a[loc] = item;
		size++;
		System.out.println("***********Array elements are***********");
		for(i=0 ; i<size ; i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
