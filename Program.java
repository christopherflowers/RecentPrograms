package uwstout.cs144.labs.lab08;

/**
 * This class is used by recent programs to get the program name and id.
 * 
 * @author FlowersC
 * @version 2016-11-15
 */
public class Program {
	/**
	 * This variable is the name of the program.
	 */
	private String name;

	/**
	 * This variable is the id of the program.
	 */
	private int id;

	/**
	 * This constructor creates a program with a name and an id.
	 * 
	 * @param newName
	 *            this is the name of the new program
	 * @param newId
	 *            this is this is the new id for the new program
	 */
	public Program(String newName, int newId) {
		name = newName;
		id = newId;
	}

	/**
	 * This getter gets the name of the program.
	 * 
	 * @return the name of the program
	 */
	public String getName() {
		return name;
	}

	/**
	 * This getter gets the id of the program.
	 * 
	 * @return the id of the program
	 */
	public int getId() {
		return id;
	}

}
