package bigbox.users;

import java.util.ArrayList;
import bigbox.business.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserReader.
 */
public interface UserReader {

	/**
	 * Login user.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	boolean loginUser(String username, String password);

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	public ArrayList<User> getUsers();
}
