package switch_case;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in);
      System.out.println("\n 1.ARITHMATIC OPERATORS \n 2.LOGICAL OPERATORS \n 3.RELATIONAL OPERATORS(Choice=1)\n");
      System.out.println("\n Enter your choice => ");
      int val = value.nextInt();

      Operators r = new Operators();
      switch(val)
      {
      case 1 : r.Arithmetic();
      		break;
      		
      case 2 : r.Logical();
      		break;
    	  	   
      case 3 :  r.Relational();
      		break;
      }
     
	}
		 void Arithmetic()
	     {
			  Scanner input = new Scanner(System.in);
			  System.out.println("\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n");
		      System.out.println("\n\nEnter which operation you want to perform :: ");
		      int ch = input.nextInt();
		      System.out.println("\n Enter two number => ");
		      int a = input.nextInt();
		      int b = input.nextInt();
		      int c;
	      switch(ch)
	       {
	       case 1 :
	   	        c=a+b;
	   	        System.out.println("\n Addition = "+c);
	   	        break;
	       case 2 : 
	       	    c=a-b;
	       	    System.out.println("\n Substraction = "+c);
	       	    break;
	       	
	       case 3 : 
	   	        c=a*b;
	   	        System.out.println("\n Multiplication = "+c);
	   	        break;
	   	    
	       case 4 : 
	   	        c=a/b;
	   	        System.out.println("\n Division = "+c);
	   	        break;
	       	    
	   	        default:
	   	        System.out.println("\n Invalide choice !!!");
	   	         
	       }
	     }
		 void Logical()
		 {
			 Scanner ref = new Scanner(System.in);
			 System.out.println("\n 1.Logical AND \n 2.Logical OR \n 3.NOT Operator ");
			 System.out.println("\n Here so many operations are given ");
			 System.out.println("\nHere the comparision is in between 5 and 1 !!!");
			 System.out.println("\n\t(10>5) && (2>1)");
			 System.out.println("\n\t(10>5) && (2<1)");
			 System.out.println("\n\t(10<5) && (2<1)");
			 System.out.println("\n\t(10>5) || (2>1)");
			 System.out.println("\n\t(10>5) || (2<1)");
			 System.out.println("\n\t(10<5) || (2<1)");
			 
			 System.out.println("\n\t!(10<5)");
			 System.out.println("\n\t!(10>1)");
			 
			 System.out.println((10>5) && (2>1));
			 System.out.println((10>5) && (2<1));
			 System.out.println((10<5) && (2<1));
			 
			 System.out.println((10>5) || (2>1));
			 System.out.println((10>5) || (2<1));
			 System.out.println((10<5) || (2<1));
			 
			 System.out.println(!(10<5));
			 System.out.println(!(10>1));
			 
		 }
		 
	 	 void Relational()
		 {
			 Scanner re = new Scanner(System.in);
			 System.out.println("\n 1.Greater than operator\n 2.Less than operator\n 3.Greater than or equal operator\n 4.Less than or equal operator\n");
			System.out.println("\n Here so many operations are given ");
			 System.out.println("\n\t Enter two number => ");
		
	         int A =re.nextInt();
	         int B =re.nextInt();
	         
			          if (A>B)
			          {
			        	  System.out.println("\n value of "+A+" is greater than "+B);
			          }
			          else if(A<B)
			          {
			        	  System.out.println("\n value of "+A+" is less than "+B);
			          }
			          else if(A>=B)
			          {
			        	  System.out.println("\n value of "+A+" is greater than or equal to "+B);
			          }
			          else if(A<=B)
			          {
			        	  System.out.println("\n value of "+A+" is less than or equal to "+B);
			          }
		 
		 } 
	
}
