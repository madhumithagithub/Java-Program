
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6,7}, {8,9,10}};
		
		int[][] c = new int[a.length][b[0].length];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b[0].length; j++) {
				for (int k=0; k<a.length; k++) {
					
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
					
				}
			}
		}
		
		System.out.println(Arrays.deepToString(c));

	}

}
