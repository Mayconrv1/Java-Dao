package model.down;

import model.down.impl.SellerDownJDBC;

public class DownFactory {
	public static SellerDown createSellerDown() {
		return new SellerDownJDBC();
	}

}
