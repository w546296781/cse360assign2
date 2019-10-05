/**
 * name: Xinkai Wang  Class#70642  assignment number: 2
 */
package cse360assign2;

/**
 * This class is used for adding and subtracting operations from zero 
 * and for recording and displaying historical operations.
 * @author Xinkai Wang
 *
 */
public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * get the total value
	 * @return total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * add input value to total and record to history.
	 * @param value the input value need to be add
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * minus value from total and record to history.
	 * @param value the input value need to be minus
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * return the history of opration.
	 */
	public String toString () {
		return history;
	}
	
   /**
    * clear the total value and history.
    */
	public void clear() {
		total = 0;
		history = "0";
	}
}
