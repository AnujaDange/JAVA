package average;
import java.util.Scanner;
public class Arr_Avrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("Enter four array elements => ");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=input.nextInt();
		}
		int sum=0 ;
		for(int i=0 ; i<a.length ; i++)
		{
			sum=sum+a[i];
		}
		System.out.printf("Sum of elements=>%d",sum);
		int avg=0;
		avg=sum/4;
		System.out.printf("\nAverage of elements=>%d",avg);
		
	}

}
