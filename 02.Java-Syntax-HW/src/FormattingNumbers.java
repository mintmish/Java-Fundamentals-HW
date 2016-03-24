import java.util.Scanner;


public class FormattingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		sc.close();
		String hexA = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);
        
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f| ", hexA, Integer.parseInt(binary), b, c);

	}

}
