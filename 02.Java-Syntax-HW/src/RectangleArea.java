import java.util.Scanner;


public class RectangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long rectangleArea = a * b;
		sc.close();
		
		System.out.print(rectangleArea);
		
	}

}
