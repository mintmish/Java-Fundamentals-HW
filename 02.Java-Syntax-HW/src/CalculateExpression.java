import java.util.Scanner;


public class CalculateExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		sc.close();
	
		double firstFormulae = Math.pow((a*a + b*b)/(a*a - b*b),(a+b+c)/Math.sqrt(c));
		
		double secondFormulae = Math.pow((a*a + b*b - c*c*c), a-b);
		
		double formulaeAvg = (firstFormulae + secondFormulae)/2;
		double numbersAvg = (a + b + c)/3;
		
		double result = Math.abs(formulaeAvg- numbersAvg);
		
		System.out.printf("%.2f", result);

	}

}
