3package matrix_operation;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  int[][] mat1 = {{3,6},{1,2}} , mat2 = {{6,8},{2,5}};
      System.out.println("________Addition of Matrix_________");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter row size and column size => ");
      int m = input.nextInt();
      int n = input.nextInt(); 
      int[][] a = new int[m][n];
      int[][] b = new int[m][n];
      int[][] c = new int[m][n];
      int[][] mul = new int[m][n];
      System.out.println("Enter values for first matrix => ");
      for(int i=0 ;i<m ;i++)
      {
    	  for(int j=0 ; j<n ;j++)
    	  {
    		  a[i][j]= input.nextInt();
    	  }
    	  System.out.println();
      }
      System.out.println("Enter values for second matrix => ");
      for(int i=0 ;i<m ;i++)
      {
    	  for(int j=0 ; j<n ;j++)
    	  {
    		  b[i][j]=input.nextInt();
    	  }
    	  System.out.println();
      }
      System.out.println(" first matrix => ");
      for(int i=0 ;i<m ;i++)
      {
    	  for(int j=0 ; j<n ;j++)
    	  {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println(" second matrix => ");
      for(int i=0 ;i<m ;i++)
      {
    	  for(int j=0 ; j<n ;j++)
    	  {
    		  System.out.print(b[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println("**********Sum of matrix***********");
      for(int i=0 ;i<m ;i++)
      {
    	  for(int j=0 ; j<n ;j++)
    	  {
    		  c[i][j]=a[i][j] + b[i][j];
    		  System.out.print(c[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println("*******Multiplication of matrix*******");
		for(int i=0 ; i<m ;i++)
		{
			for(int j=0 ; j<n ;j++)
			     {
				mul[i][j]= a[i][j] * b[i][j];
				System.out.print(mul[i][j]+" ");
			      }
	  		System.out.println();
               }
      
	}

}
