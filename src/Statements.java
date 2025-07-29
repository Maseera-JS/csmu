
public class Statements {
	
	//Statement - instruction , task 
	// types: 

	public static void main(String[] args) {
		
		//1)Declarative statement:
		int age;
		String name ;
		
       //2)Assignment statement (=)
		age = 24;
		name = "Sujata";
		
		//3)print statement
		System.out.println("Name is :"+ name);
		
/*       4) Control flow statement: 
 *      	types: 1) Conditional - if-else , nested if , switch
		              2) Iterative  - for , while , do-while 
                      3) Jump - continue , break , return
	*/	
		
		
		//Conditional statement
		// if- else , nested-if
		 age = 17;
		 if(age >18) {
			 //logic body if condition is true
			 System.out.println("You are eligible for voting!");
		 }else {
			 //logic body if condition is false
			 System.out.println("You are not eligible");
		 }
		 
		 // login and logout 
		
		 int marks = 50;
		 if(marks >45) {
			 System.out.println("Passed");
		 }else {
			 System.out.println("Failed");
		 }
		
		 String userName = "Chaitanya";
		 String password= "cha@123";
		 if(userName.equalsIgnoreCase("cHaiTaNya") && password.equals("cha@123")) {
			 System.out.println("Login successful");
		 }else {
			 System.out.println("Invalid credentials");
		 }
		 
		 //Compare three numbers 
		 int num1 = 500;
		 int num2 = 500;
		 int num3 = 500;
		  
//		 num1 -> num2 , num3 ,  num2-> num1 , num3 , num3-> num1 , num2
		 //nested - if
		 if(num1>num2 && num1> num3) {
			 System.out.println(num1 + " is greater");
		 }else if(num2> num1 && num2 > num3 ) {
			 System.out.println(num2 + " is greater");
		 }else if(num3> num1 && num3>num2) {
			 System.out.println(num3 + " is greater");
		 }else {
			 System.out.println(" all are equal");
		 }
		 
		 // Positive , Negative , Zero
//		 if(condition1) {
//			 //logic body
//		 }else if(condition2) {
//			 //logic body
//		 }else if(condition3) {
//			 //logic body
//		 }else if(condition4) {
//			 //logic body
//		 }else if(condition5) {
//			 //logic body
//		 }
//		 else {
//			 // logic
//		 }
		 
		 
		 //Switch statement : multiple condition
		 
//		 switch(var) {
//		 case 1:
//			 //logic body
//		 case 2:
//			 // logic body
//		.... case n:
//			// logic body
//		   default :
//			   //
//			
//			 
//		 }
		 int weekDay =10; // Wednesday
		 switch(weekDay) {
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			 System.out.println("Wed");
			 break;
		 case 4:
			 System.out.println("Thurs");
			 break;
		 case 5:
			 System.out.println("Fri");
			 break;
		 case 6:
			 System.out.println("Sat");
			 break;
		 case 7:
			 System.out.println("Sun");
			 break;
			 
		default:
			System.out.println("Pls select days from 1 - 7 only");
			 
		 }
		 
		 // Iterative - iteration 
		 // types : for , while , do-while
		 
		 
		 // 1) for loop - when you know the iteration count / limit
//		 5 x 1 = 5  ->  start = 1
//		5 x 2 = 10
//		5 x 3= 15
//		
//		
//		
//		5 x 10 = 50  -> end = 10
		 
//		 for(initialization ; condition ; incre/decre) {
//			 // logic body
//		 }
		 
		 
		 System.out.println(1);  // start point = 1
		 System.out.println(2);
		 System.out.println(3);
		 System.out.println(4);
		 System.out.println(5);
		 System.out.println(6);
		 System.out.println(7);
		 System.out.println(8);
		 System.out.println(9);
		 System.out.println(10);  // end point = 10
		 
		 int i;
		 int mul = 8;
		 for(i =1;  i <=10 ; i++) {
			 // multiplication table
			 System.out.println(mul + " x " +i  + " = "  + mul *i);
			 
			 //  even 
			 if( i % 2==0) {
				 System.out.println("Number is even :" + i);
			 }else {
				 System.out.println("Number is odd :" + i);
			 }
		 }
		 
		 //Jump - break , continue 
		 
		 for( int j = 10;  j <= 50 ; j++) {
			 if( j == 20) {
//				continue;  // skip a value
				break; // stop/terminate the loop
			 }else {
				 System.out.println(j);
			 }
		 }
		 
		 for(i =10;  i >=1 ; i--) {
			 // multiplication table
			 System.out.println(mul + " x " +i  + " = "  + mul *i);
		 }
		 
		 //Palindrome of a string 
//		 Madam  , level , radar
		 String word = "level";
		 String rev= "";
		 for(int k =  word.length() -1 ; k>=0 ; k--) {
			 //logic
		 }
		 
		 // write alphabets A-Z , a-z using for loop - typecasting , foor loop
//		 A-Z -> 65 - 90 , a-z -> 97 - 122
		 for(int k = 97; k<=122; k++) {
			 System.out.print((char)k + " ");
		 }
		 
		 //write squares and cubes of 1 to 15 
		 //where square should be of even numbers and cubes should be of odd number
		 
		 System.out.println("---------------------------");
		 for(int j = 1 ; j<=15 ; j++ ) {
			 if( j %2 == 0) {
				 System.out.println( "sq - " + j*j + " ");
			 }else {
				 System.out.println("cube - "+ j*j*j + " ");
			 }
			 
		 }
		 
		 int j= 2;
		 for(j= 4; j<=10;j++) {
			 System.out.println(j);
		 }
		 
		 //while - entry control loop
		 
//		 intialization
//		 while(condition) {
//			 
//			 //logic body		 
//			 // incre/decr
//		 }
		 
		 int x = 100;
		 while(x>=80) {
			 System.out.println(x + " Hello");
			 x--;
		 }
		 // even and odd number using while loop
		 //multiplication table using while loop
		 
		 
		 //do-while : exit control 
//		 initialization;
		 int a =5;
		 do {
			 //logic body
			 System.out.println(a);
			 
			 //incre/decre
			 a--;
		 }while(a>0);
		 
		 //multiplication table , even and odd
		 
		 Functions.multiplicationTable();
//		 System.out.println(Functions.accountNumber);
//		 The method multiplicationTable() from the type Functions is not visible
		 System.out.println(Functions.add(12,9));
		
		 
		
		 
	}
	
	

}
