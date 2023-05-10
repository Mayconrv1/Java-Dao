package model.down;

import db.DB;
import model.down.impl.SellerDownJDBC;

public class DownFactory {
	public static SellerDown createSellerDown() {
		return new SellerDownJDBC(DB.getConnection());
	}

}
