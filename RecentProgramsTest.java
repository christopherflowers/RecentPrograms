package uwstout.cs144.labs.lab08;

/**
 * This class tests RecentPrograms.
 * 
 * @author FlowersC
 * @version 2016-11-15
 */
public class RecentProgramsTest {

	/**
	 * This tests the class RecentPrograms.
	 * 
	 * @param args
	 *            command line parameters
	 */
	public static void main(String[] args) {
		RecentPrograms test1 = new RecentPrograms();
		Program prog1 = new Program("Runescape", 9876);
		Program prog2 = new Program("Warcraft", 54321);
		Program prog3 = new Program("CSGO", 2424);
		Program prog4 = new Program("Word", 10001);
		Program prog5 = new Program("Steam", 93281);
		Program prog6 = new Program("PowerPoint", 78);
		test1.insert(prog1);
		test1.insert(prog2);
		test1.insert(prog3);
		test1.insert(prog4);
		test1.insert(prog5);
		test1.insert(prog6);
		System.out.println(test1.getProgram(0).getName());
		System.out.println(test1.toString());
		System.out.println(test1.findId(2424));

	}

}
