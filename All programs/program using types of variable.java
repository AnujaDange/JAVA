package variable_type;

public class Variable {

	int a=10;		//instance variable
    static int b=20;		//static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int c=30;  //local variable
        Variable obj = new Variable();
        System.out.printf("\nValue of A = %d",obj.a);
        System.out.printf("\nValue of B = %d",Variable.b);
        System.out.printf("\nValue of C = %d",c);
        
	}

}
