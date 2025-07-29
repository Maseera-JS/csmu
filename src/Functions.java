
public class Functions {
	
	// types: function without parameter , function with parameter
	
	// accountDetails , 
	
	//private : not visible outside the class 
//	 accessible : same class 
	private static String accountNumber ;
	
	
	
	
	
	
	
	
	

	// return 
	//function - block of a code 
	
//	visibility returnType funcName() {
//		// logic body
//	}
	
	// function without parameter
	public static void multiplicationTable() {
		int a = 19;
		for(int i = 1; i<=10;i++) {
			System.out.println(a + " x " + i + " = " + a*i);
		}
	}
	
	// function with parameters
	public  static int add(int a  , int b) { // a and b are parameter
//		int a  = 100;
//		int b = 20000;
		int add = a + b;
		return add;  // 20100
	}
	
	// palindrome ( parameters)
	
	
	public static void tea() {
		System.out.println("Take water and milk");
		System.out.println("Add sugar , tea powder , ginger powder");
		System.out.println("Boil");
	}
	
	
	public static float hello() {
		return 153663.63737f;
	}
	
	
	// calculator method
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplicationTable();
		tea();
		
		
	    System.out.println(add(50,100));  // 50 and 100 arguments
	    System.out.println(hello());
	    Functions.accountNumber = "234567888182";
	    System.out.println(Functions.accountNumber);

	}

}
