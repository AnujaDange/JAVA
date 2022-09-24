package input_alphabets;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Starting point => ");
      String sp = input.next();
      System.out.println("Enter ending point => ");
      String ep = input.next();
      System.out.println("********Alphabets*********");
    	  if(sp.compareTo(ep)<12)
    	  {
    		  for(char ch=sp.charAt(0) ; ch<=ep.charAt(0) ; ch++)
    		  {
    			  System.out.println(ch);
    		  }
    		  
    	  }
    	  else
    	  {
    		  for(char ch=sp.charAt(0) ; ch>=ep.charAt(0) ; ch--)
    		  {
    			  System.out.println(ch);
    			  
    		  }
    		 
    	  }
    	  
      
      
	}

}
