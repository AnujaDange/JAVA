package even_odd_count;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter total no of count=> ");
      int t = sc.nextInt();
      int[] arr = new int[t];
      int even=0 , odd=0 , z_count=0;
     // int odd=0;
      for(int i=0 ; i<arr.length ; i++)
      {
    	  System.out.println("Enter array element => ");
    	  arr[i]=sc.nextInt();
      }
      System.out.println("\n******************List*******************");
	 for(int i=0 ; i<arr.length ; i++)
	 {
		System.out.println( "Array elements => "+arr[i]);
	 }
	  System.out.println("\n******************************************");
	  for(int i=0 ; i<arr.length ; i++)
	  {
		  if(arr[i]==0)
		  {
			 z_count++;
		  }
		  else if(arr[i]%2==0)
		  {
			 even++;
		  }
		  else
		  {
			  odd++;
		  }
	  }
	  System.out.println("\n Zero count => "+z_count);
	  System.out.println("\n Even count => "+even);
	  System.out.println("\n Odd count => "+odd);
	}

}
