package application;

import model.down.DownFactory;
import model.down.SellerDown;
import model.entities.Seller;

public class Program{
	
	public static void main(String[] args) {
		SellerDown sellerDown = DownFactory.createSellerDown();
		Seller seller = sellerDown.findById(3);
		System.out.println(seller);
		
	}
}