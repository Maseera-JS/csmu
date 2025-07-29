import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to take input from user
		Scanner sc = new Scanner(System.in); // keyboard = System.in
//		// for integer input
//		System.out.println("Enter age: ");
//		int age = sc.nextInt();
//		System.out.println("Enter your account number: ");
//		String name = sc.next();
////		float height = sc.nextFloat();
//		
//		System.out.println("Your age is :"+age);
//		System.out.println("Your name is :"+name);
		
		
		boolean flag= true;
		System.out.println("Welcome to Zomato");
		int choice;
		do {
			System.out.println("========Menu=======");
			
			System.out.println("1) Order main course");
			System.out.println("2) Order sweets");
			System.out.println("3) Add more...");
			System.out.println("4) Payment");
			System.out.println("5) Exit");
			
			System.out.println("Enter your choice :");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Ordering main course-> Indian Thaali");
				break;
			case 2:
				System.out.println("Ordering sweets -> Pasteries");
				break;
			case 3:
				System.out.println("Add more-> add mocktail");
				break;
			case 4:
				System.out.println("Total payment -> by card or cash");
				break;
			case 5:
				System.out.println("Exiting from the system, goodbye!🙋‍♂️🙋‍♀️");
				flag= false;
				break;
			default:
				System.out.println("Use option from 1-5");
		
			}
		}while(choice !=5);

	}

}
