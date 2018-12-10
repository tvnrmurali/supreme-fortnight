package client;

import java.util.Scanner;

import entity1.FoodAdmin;

public class MainClass {
	
	public static void main(String[] args) {
		FoodAdmin fadmin = new FoodAdmin();
		FoodAdminValidation fadminval = new FoodAdminValidation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the FoodId");
		String fid = scanner.nextLine();
		System.out.println("Enter the food Price");
		String fprice = scanner.nextLine();
		System.out.println("Enter the food quantity");
		String fquantity = scanner.next();

		
		boolean res1 = fadminval.foodItem(fid);
		boolean res2 = fadminval.foodPrice(fprice);
		boolean res3 = fadminval.foodQuantity(fquantity);
		
		if(res1 && res2 && res3)
		{
			int fooditem = Integer.parseInt(fid);
			int foodprice = Integer.parseInt(fprice);
			int foodquantity = Integer.parseInt(fquantity);
			fadmin.setfId(fid);
			
		}

	}
}
