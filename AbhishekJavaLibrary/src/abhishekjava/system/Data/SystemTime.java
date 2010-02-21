package abhishekjava.system.Data;

import java.util.*;

public class SystemTime
{	
	/**
	 * Method Time
	 *
	 *
	 */
	public SystemTime()
	{
		// TODO: Add your code here
	}	

	/**
	 * Method Hour
         *
	 * @return
         * String Hour -> Hour component of Time
	 */
	public static String Hour()
	{
		Calendar c = Calendar.getInstance();
		return Integer.toString(c.get(Calendar.HOUR));
	}

	/**
	 * Method Minute
	 *
	 *
	 * @return
	 *
	 */
	public static String Minute()
	{
		Calendar c = Calendar.getInstance();
		return Integer.toString(c.get(Calendar.MINUTE));
	}

	/**
	 * Method Second
	 *
	 *
	 * @return
	 *
	 */
	public static String Second()
	{
		Calendar c = Calendar.getInstance();
		return Integer.toString(c.get(Calendar.SECOND));
	}

	/**
	 * Method Millisecond
	 *
	 *
	 * @return
	 *
	 */
	public static String Millisecond()
	{
		Calendar c = Calendar.getInstance();
		return Integer.toString(c.get(Calendar.MILLISECOND));
	}	
}
