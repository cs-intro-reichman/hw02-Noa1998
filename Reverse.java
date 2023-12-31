/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String revword = "";

		for (int index = 0; index < word.length(); index++){
			char chr = word.charAt(index);
			revword = chr+revword;
		}
		System.out.println(revword);
		System.out.println(word.charAt(word.length() / 2));
	}
}
