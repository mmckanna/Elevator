import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class elevatorMain {

	public static void main(String[] args) throws InterruptedException {
		int floorOne = 1;
		int floorTwo = 2;
		int normalFloor = 0;;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Current Floor: B");
		System.out.println("For basement, please press 0");
		System.out.println("Please enter a floor number");
		Integer input1 = scan.nextInt();
		
		while (input1.equals(floorOne))
		{
			System.out.println("Current floor: 1");
			System.out.println("Door opening, please wait...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Door closing, please wait...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Please enter a floor number.");
			input1 = scan.nextInt();
			
		while (input1.equals(floorTwo)) {
			System.out.println("Current floor: 2");
			System.out.println("Please enter a floor number.");
			System.out.println("Door opening, please wait...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Door closing, please wait...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Please enter a floor number.");
			input1 = scan.nextInt();
		
		}
			
		while (input1.equals(normalFloor)) {
			System.out.println("Current floor: B");
			System.out.println("Please enter a floor number.");
			System.out.println("Door opening, please wait...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Door closing, please wait...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Please enter a floor number.");
			input1 = scan.nextInt();
		}
		}
	}
}

