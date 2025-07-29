
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 operation = operator + operands
//		operator : arithmetic , logical , comparison
		
//		Arithmetic : + , - , * , / , % , ++ , --
		int a  =12;
		int b = 29;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a /  b);
//		System.out.println(10 % 2); // gives remainder
		
		a = 1;
		System.out.println(a++); //
		//  assign the real value of a in c 
		int c = a++;  // ++ - increment the value by 1 
		
//		System.out.println(c++);
		
		
		
		// pre and post 
		int  x =  5;
		System.out.println(x);
		int y = --x;
		System.out.println(y);
		
		// 
		
		
		
		
		
		
		
//		Comparison/ Relational  (equality of 2 variables) :  < , > , <= , >= , != , ==
//		System.out.println(10 < 100);
//		System.out.println(a > b);
//		System.out.println(9 <= 9);
//		System.out.println(a  >=  b);
//		System.out.println(10 !=  2);
//		System.out.println(10 ==  2);
		
		
		
		// Assignment operator :  += , -= , *= , /= ,%=
		int i = 12;
		System.out.println(i);  // 12
		int p = 70;
		System.out.println(p); // 70
//		 i = i + p ;
//		 i += p;
		i -= p;
		 System.out.println(i); // 82
		 
		// logical operator : && - and  , || - or , !  - not : return result in boolean
//		 name , password 
		 String name = "Shruti";
		 String password  = "rit@123";
		 
		boolean  result = name.equalsIgnoreCase("Ritik") || password.equalsIgnoreCase("rit@123");
		 
		 System.out.println(result);
		 System.out.println(!true);
		 
          // Ternary - conditional statement (if - else)
		 
		 // Bitwise - it work on bits -  & | , 
		 System.out.println( 1 & 2);
		 
		 
		 
		 
		 
	}

}
