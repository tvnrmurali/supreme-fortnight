package Service;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

import Entity.FoodAdmin;
import Validation.FoodAdminValidation;

public class FoodAdminServceImpl implements FoodAdminService{
	
	FoodAdmin fadmin = new FoodAdmin();

	@Override
	public void addFood() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Food Id");
		String fid = scanner.next();
		fadmin.setfId(fid);
		System.out.println("Enter the Food Price");
		String fprice = scanner.next();
		double d = Double.parseDouble(fprice);
		d.setfPrice(fprice);
		System.out.println("Enter the Food Quantity");
		int fquantity = scanner.nextInt();
		fadmin.setfQuantity(fquantity);
		scanner.close();
		FoodAdminValidation fadminval = new FoodAdminValidation();
		fadminval.foodItem(fid);
		fadminval.foodPrice(fprice);
		
		
		System.out.println(fid);
		System.out.println(fprice);
		System.out.println(fquantity);
		
	}

	@Override
	public void removeFood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllFood() {
		// TODO Auto-generated method stub
		
	}

}
