package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();
<<<<<<< HEAD
		System.out.println("=== Teste1: seller findbyId");
=======
>>>>>>> 7062a852a4b6276ae7e875c0d671192cc913fe8b
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
	}

}
<<<<<<< HEAD

=======
>>>>>>> 7062a852a4b6276ae7e875c0d671192cc913fe8b
