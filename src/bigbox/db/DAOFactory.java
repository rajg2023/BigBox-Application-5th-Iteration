package bigbox.db;

import bigbox.db.UserDB;
import bigbox.divisions.DivisionDAO;
import bigbox.store_sales.StoreSalesDAO;
import bigbox.stores.StoreDAO;
import bigbox.users.UserDAO;

/**
 * this method maps the ProductDAO interface to the appropriate data storage mechanism.
 */
public class DAOFactory {
	
	/**
	 * Gets the users DAO.
	 *
	 * @return the users DAO
	 */
	public static UserDAO getUsersDAO() {
		UserDAO uDAO = new UserDB();
		return uDAO;
	}

	/**
	 * Gets the store DAO.
	 *
	 * @return the store DAO
	 */
	public static StoreDAO getStoreDAO() {
		StoreDAO sDAO = new StoreDB();
		return sDAO;
	}

	/**
	 * Gets the division DAO.
	 *
	 * @return the division DAO
	 */
	public static DivisionDAO getDivisionDAO() {
		DivisionDAO dDAO = new DivisionDB();
		return dDAO;
	}

	/**
	 * Gets the store sales DAO.
	 *
	 * @return the store sales DAO
	 */
	public static StoreSalesDAO getStoreSalesDAO() {
		StoreSalesDAO ssDAO = new StoreSalesDB();
		return ssDAO;
	}

}
