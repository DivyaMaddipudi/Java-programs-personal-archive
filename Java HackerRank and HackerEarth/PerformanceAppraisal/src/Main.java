import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    HashMap<String, Integer> ratings = new HashMap<String, Integer>();

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Id of " + i);
			String id = sc.next();
			System.out.println("rating");
			int rate = sc.nextInt();	
			ratings.put(id, rate);
		}
		
		String Id;
		int salary;
		char ch;
		
		do {
		System.out.println("Enter ID and Current sal:");
		 Id = sc.next();
		 salary = sc.nextInt();
		 
		 int rating = ratings.get(Id);
			
			int increment = 0;
			
				
			if(rating == 3) {
				
				increment = (salary * 15)/100;
			}
			
			System.out.println("Increment sal:" + increment);
		
		System.out.println("Do u want to continue Y/N");
		
		ch = sc.next().charAt(0);
		
		} while (ch != 'N');
		
		System.out.println("Thankyou");
	}
}
