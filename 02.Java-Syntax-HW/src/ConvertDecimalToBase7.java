import java.util.Scanner;

public class ConvertDecimalToBase7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		sc.close();
		String base7Number = Integer.toString(inputNumber,7);
		System.out.println(base7Number);

	}

}
