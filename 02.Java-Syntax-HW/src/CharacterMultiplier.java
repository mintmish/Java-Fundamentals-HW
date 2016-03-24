import java.util.Scanner;

public class CharacterMultiplier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String firstString = sc.next();
        String secondString = sc.next();
        sc.close();
        
        System.out.println(sumOfCharCodes(firstString, secondString));
        }
        
        public static int sumOfCharCodes(String firstString, String secondString) {
            
        	int sum = 0;
            int longerString = Math.max(firstString.length(), secondString.length());
            
            for (int i = 0; i < longerString; i++) {
                
            	int firstStringCode = 1;
                int secondStringCode = 1;
                
                if (i < firstString.length()) {
                	firstStringCode = firstString.charAt(i);
                }
                
                if (i < secondString.length()) {
                	secondStringCode = secondString.charAt(i);
                }
                sum += firstStringCode * secondStringCode;
            }
            
            return sum;
	}

}
