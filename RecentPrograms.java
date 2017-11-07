package uwstout.cs144.labs.lab08;

/**
 * This class manipulates an array of recent programs and gives back information
 * on them.
 * 
 * @author FlowersC
 * @version 2016-11-15
 */
public class RecentPrograms {

	/**
	 * This is the array of recent programs.
	 */
	private Program[] programs;

	/**
	 * This is the number of recent programs in the array of programs.
	 */
	private int count;

	/**
	 * This is the maximum size of the array of programs.
	 */
	private static final int INIT_SIZE = 5;

	/**
	 * This constructor creates an array of recent programs with the size of 5,
	 * and sets the count of recent programs to 0.
	 */
	public RecentPrograms() {
		programs = new Program[INIT_SIZE];
		count = 0;
	}

	/**
	 * This getter gets the number of recent programs in the array.
	 * 
	 * @return the number of recent programs in the array
	 */
	public int getCount() {
		return count;
	}

	/**
	 * This getter gets the program at a specific location.
	 * 
	 * @param pos
	 *            this is the position in the array you are trying to access
	 * @return the program at that specific location
	 */
	public Program getProgram(int pos) {
		if (pos < count && pos >= 0) {
			return programs[pos];
		}

		return null;
	}

	/**
	 * This method finds the location of a program with a specific id.
	 * 
	 * @param id
	 *            this is the id you are looking for
	 * @return the position of the program with the specific id
	 */
	public int findId(int id) {
		for (int i = 0; i < count; i++) {
			if (programs[i].getId() == id) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * This method shifts the programs in your array down one position.
	 * 
	 * @param endPosition
	 *            the position you want to start your shift at
	 */
	private void shift(int endPosition) {
		for (int i = endPosition; i > 0; i--) {
			programs[i] = programs[i - 1];
		}
	}

	/**
	 * This method adds a new program to the array of recent programs.
	 * 
	 * @param newProg
	 *            the new program you are trying to insert
	 */
	public void insert(Program newProg) {
		if (newProg != null) {
			if (findId(newProg.getId()) > -1) {
				shift(findId(newProg.getId()));
			} else {
				if (count < INIT_SIZE) {

					count++;
				}
				shift(count - 1);
			}

			programs[0] = newProg;
		}

	}

	/**
	 * This method prints out the recent programs and their id's.
	 * 
	 * @return the recent programs in a list
	 */
	public String toString() {
		String result = "";
		for (int i = 0; i < count; i++) {
			result += getProgram(i).getName() + 
					" " + getProgram(i).getId() + " ";
		}

		return result;
	}
}
