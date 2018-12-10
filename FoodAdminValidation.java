package client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FoodAdminValidation {
		public boolean foodItem(String fid)
		{
			Pattern pattern = Pattern.compile("[A-Z][0-9]{4}");
			Matcher matcher = pattern.matcher(fid);
			return (matcher.matches());
		}
		public boolean foodPrice(String fprice)
		{
			Pattern pattern = Pattern.compile("[1-9][0-9]{3,4}");
			Matcher matcher = pattern.matcher(fprice);
			return (matcher.matches());
		}
		public boolean foodQuantity(String fquantity)
		{
			Pattern pattern = Pattern.compile("[1-9][0-9]{2}");
			Matcher matcher = pattern.matcher(fquantity);
			return (matcher.matches());
		}
		
	}

