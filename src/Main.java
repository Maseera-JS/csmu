
public class Main {
	//{  logic body }
	//holds the data
	//container 
	//logic
	
	
	
	//execution starts from here
		public static void main(String[] args) {
		      
			//010100010 - binary
			
			//to generate output
			 System.out.println("I am learning Java");
			 System.out.println("At Anudip Foundation");
			 System.out.println(24567 * 345 +90 - 5 /2);
			 
			 
			 //to store some data i.e 245 ,89 we need a container
			 // variables -container
			 //rules to declare the container names:
//			 1) variable name cannot start with a digit
//             int 12age= 26;
			 
//			 2) variable name must not use keyword as it name
//              int int = 56;
			 
//			 3) for special character : only _ is allowed
              int is_eligible=0;
			  int _isEligible = 9;
			  int isEligible_ = 9;
			  
//			  4) you can use a-zA-Z also use camelCase
              int isValid = 3;
    
			 
			 
			 int firstNumber =800;  // firstNumber is the container 
			 int secondNum = 7;
			 
//	         System.out.println(firstNumber + secondNum);
//	         System.out.println(firstNumber - secondNum);
//	         System.out.println(firstNumber / secondNum);
	         
	         
	         //Data-types:
	         //1) primitive - can store  limited data, range
	         
	         //2) Integer - to store number 
	         // byte , short , int , long
	         
//	         1 byte = n = 8 bits 
	         //byte -> -128 to 127
	         byte b = 127;
	         System.out.println(Byte.MAX_VALUE);
	         System.out.println(Byte.MIN_VALUE);
	         
	         // short - 2 byte = 16 bits
	         short s = 32567;
	         System.out.println(Short.MAX_VALUE);
	         System.out.println(Short.MIN_VALUE);
	         
	         //int - 4 byte - 32 bits
	         int age = 1234566879;
	         System.out.println(Integer.MAX_VALUE);
	         System.out.println(Integer.MIN_VALUE);
	         
	         // long - 8 byte - 64 bits
	         long l = 123450987634574456l;
	         System.out.println(Long.MAX_VALUE);
	         System.out.println(Long.MIN_VALUE);
	         
	         // Boolean - true/false - 
	         boolean bool = false;
	         System.out.println(bool);
	         
	         //Float - decimal
	         // float - 4 byte - 32 bits
	         //double - 8 byte 
	         float pi = 3.145687647898967856f;
	         double p = 3.145687647898967856;
	         System.out.println(Float.MAX_VALUE + " "+Float.MIN_VALUE);
	         
	         System.out.println();
	         
	         //character - 2 bytes - 256 char
	         char c = '@';    //A-Z , a-z , 0-9 , special character - &*()%^!@#$
	         c = 'V';
	         System.out.println(c);
	         
	         // A=65 , Z = 90
	         System.out.println( (char)  43);
	         
	         // A => 
	        
	         
	         for(int i = 65; i <= 90; i++) {
	        	 System.out.print( (char) i + " ");
	         }
	         
	         double val = 3.0;
	         Double v  = val;
	         System.out.println( v instanceof Double);
	         
	         // calculate area and perimeter of circle , radius , pi = 3.1456
	         // calculate the area of square and rectangle
	         
	         
	         
	         
	         
	        // Non- primitive:  unlimited
	         // types : string , arrays , classs , object , interface
	         //String : 
	         String mail = "priyaQueen9867@gmail.com";
	         System.out.println(mail);
	         
	         //operation on string : + , - , * , /
	         String n = "Chaitanya";
	         String m = "Ritik";
	         System.out.println(100 *2 + n + 30 + 2);  // +- concatenation
//	         200Chaitanya302   
	        
	         //methods- function 
	       
	         
	        mail = "Hello ,  i am Ritik , I am learning Java , Hello";
	        // count total characters
	        System.out.println(mail.length());
	        
	        System.out.println(mail.contains("Python"));
	        
	        // to get a char from specific index
	        System.out.println(mail.charAt(15));
	        
	        // return the index number of charac/ word 
	        System.out.println(mail.indexOf("Hello"));
	        System.out.println(mail.indexOf('R'));
	        System.out.println(mail.lastIndexOf("Hello"));
	        
	        //concat - to add a new string
	        System.out.println(mail.concat(" ANUDIP FOUNDATION"));
	        
	        
	        // replace a word / char
	        mail = mail.replace("Hello", "hihihihi");
	        mail = mail.replace('h', 'x');
	        System.out.println(mail);
	        
	        //to check the equality of 2 string
	        mail = "Priya";
	        System.out.println(mail.equals("Ashwini"));
	        System.out.println(mail.equals("PRIYA"));
	        System.out.println(mail.equalsIgnoreCase("pRiYa"));
	        
	        
	        //split - breakdown the string
	        String list = "Apple , Peach , Strawberry , Dragon-fruit , Melons";
	        System.out.println(list);
	        
	        String[] arr = list.split(" , ");
	        for(String st : arr) {
	        	System.out.println(st);
	        }
	        
	        
	        
//	        Count number of characters (including spaces)
//	        Create a calculator to perform + , - , * , / 
	        
	        //substring() -  breaks string 
	        mail = "        Hi , i am still learning java, see you soon       ";
	        String sub = mail.substring(25);
//	        System.out.println(sub);
	        
//	        sub = mail.substring(0, 29);
	        System.out.println(sub);
	        
	        
	        // regex 
	        mail = "        Hi , i am677     still 789    learning   java, 5434  see 0000   you  soon       ";
	         //trim() - it remove extra spaces  - leading and trailing 
	        System.out.println(mail);
	        System.out.println(mail.trim());
	        
	        mail = mail.replaceAll("\\d+", ""); // to remove numbers
	        System.out.println(mail);
	        
	        
	        mail = "Java123Programming";
	        mail = mail.replaceAll("[a-zA-Z]", ""); // to remove char
	        System.out.println(mail);
	        
	        
	        // OPERATOR 	-  
//	        5  + 7 -> 5,7 are operands and + is the operator 
	        
//	        Arithmetic 
//	        Comparison
//	        Logical
	        
//	        Bitwise
	        
	        
		}
	
	
	
	
	

	
	
	
	
}
