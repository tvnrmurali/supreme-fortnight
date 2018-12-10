package Main;

import java.util.Scanner;

import Service.FoodAdminServceImpl;
import Service.FoodAdminService;

public class FoodAdminMain {
	public static void main(String[] args) {
		FoodAdminService fadminser = new FoodAdminServceImpl();
		//fadminser.addFood();
		System.out.println("Select Your Option:");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1:
			fadminser.addFood();
			break;
		default:
			System.exit(0);
			
		}
		
		
	}
}
