
import java.util.*;
public class Prog2 {
	
	public static void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		//int a=scan.nextInt();
		//int b=scan.nextInt();
		System.out.println("Sum is:"+(scan.nextInt() + scan.nextInt()));
	}
	public static void average() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Average is:"+((a+b)/2));
		
	}
	public static void evenOrOdd() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		if(n%2==0)
			System.out.println("It is an even number");
		else
			System.out.println("It is an odd number");
	}
	public static void positive() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		if(num<0)
			System.out.println("It is a negative number");
		else
			System.out.println("It is a positive number");
	}
	public static void prime() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=scan.nextInt();
		int count=0;
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==0)
				System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int opt;
		while(true) {
			System.out.println("1. Add two numbers");
	        System.out.println("2. Average of two numbers");
	        System.out.println("3. Even or odd");
	        System.out.println("4. Positive or negative number");
	        System.out.println("5. Prime number or not");
	        System.out.println("6. Exit");
	        System.out.print("Enter Your Choice : ");
	        opt=sc.nextInt();
	        switch(opt) {
	        case 1: add();
	        		break;
	        case 2: average();
	        		break;
	        case 3: evenOrOdd();
    				break;
	        case 4: positive();
					break;
	        case 5: prime();
	        		break;
	        case 6: System.exit(0);
	        
	        }
		}
	}

}
