package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
        String newString = "";
        Random rand = new Random();
        int value = 0;
        while (input.length() > 1) {
            value = rand.nextInt(input.length() - 1);
            newString += input.charAt(value);
            if (value == 0) {
                input = input.substring(1, input.length());
            } else if (value == input.length()) {
                input = input.substring(0, input.length() - 1);
            } else {
                input = input.substring(0, value) + input.substring(value + 1, input.length());
            }
        }
        newString += input;
        return newString;
    }
    /**
     * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
