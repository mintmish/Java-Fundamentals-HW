import java.util.Scanner;


public class TriangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//area=(Ax(By−Cy)+Bx(Cy−Ay)+Cx(Ay−By))/2;
		
		Scanner sc = new Scanner(System.in);
		
		int aX = sc.nextInt();
		int aY = sc.nextInt();
		int bX = sc.nextInt();
		int bY = sc.nextInt();
		int cX = sc.nextInt();
		int cY = sc.nextInt();
		sc.close();
		int triangleArea = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY))/2);
		int wholeTriangleArea = Math.round(triangleArea);
		
		System.out.println(wholeTriangleArea);
	}

}
