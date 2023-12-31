/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		boolean divisor = true;

		for (int count = 1; count <= x; count++){
			divisor = (x % count == 0);

		if (divisor){
		 	System.out.println(count);	
		}
			

		    }
		}
	}
