package application;

import java.util.Date;

import model.down.DownFactory;
import model.down.SellerDown;
import model.entities.Department;
import model.entities.Seller;

public class Program{
	
	public static void main(String[] args) {
		Department obj = new Department(1 , "Books");
		Seller seller = new Seller(21, "bob", "bob@gmail.com!", new Date(), 3000.00, obj);
		SellerDown sellerDown = DownFactory.createSellerDown();
		System.out.println(seller);
		
	}
}