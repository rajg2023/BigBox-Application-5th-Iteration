package bigbox.stores;


import bigbox.business.Store;

// TODO: Auto-generated Javadoc
/**
 * The Interface StoreWriter.
 */
public interface StoreWriter {

	/**
	 * Adds the store.
	 *
	 * @param s the s
	 * @return true, if successful
	 */
	boolean addStore(Store s);

	/*boolean updateStore(Store s);*/

	/**
	 * Delete store.
	 *
	 * @param s the s
	 * @return true, if successful
	 */
	boolean deleteStore(Store s);

}
