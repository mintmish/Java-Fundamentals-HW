import java.util.Scanner;


public class ConvertBase7ToDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String base7Number = sc.next();
		sc.close();
		
		Integer decNumber = Integer.valueOf(base7Number, 7);
        System.out.println(decNumber);

	}

}
