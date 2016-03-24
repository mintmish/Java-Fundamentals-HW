import java.util.*;


public class RandomizeNumbersFromNToM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int min = Math.min(a,b);
        int max = Math.max(a,b);
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = min; i <=max ; i++) {
            
        	list.add(i);
        }
        
        Collections.shuffle(list);
        
        for (int num:list) {
            
        	System.out.print(num + " ");

	    }
	}
}
