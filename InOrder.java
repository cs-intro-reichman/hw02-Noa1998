/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int min = 0;
		int max = 9;
		int num1 = -1;
		int num2;
		
		do{
			num2 = (int) (Math.random() * (max - min + 1));

			if (num2 >= num1) {
				System.out.print(num2 + " ");
				num1 = num2;
			} else {
				break;
			}

		}while(true);
        	

		}

    }

