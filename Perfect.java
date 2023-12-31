/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args [0]);
		String str = (x+" is a perfect number since "+x+" = 1");
		int sum = 1;

		for (int count = 2; count < x; count++){
            if (x % count == 0) {
            	sum += count;
            	str = str + " + " + count;
            }
        }
        if (sum == x){
        	System.out.println(str);	
        } else {
        System.out.println(x+" is not a perfect number");
     
        
		}
		
	}
}
