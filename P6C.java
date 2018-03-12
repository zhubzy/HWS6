
public class P6C {

	public static void main(String[] args) {
		
		
		int[] even1D = new int[10];
		
		for(int index = 0; index < even1D.length; index ++) {
			
			even1D[index] = index *2;
			
			
		}
		
		System.out.println("Even1D");
		for(int number: even1D) {
			
			System.out.print(number + " ");
			
		}
		
		
		
		int[][] even2D = new int[4][5];
		int index = 0;
		
		for(int row = 0; row < even2D.length; row ++) {
		
			for(int col = 0; col < even2D[0].length; col ++) {
				
				if(index < even1D.length) {
					
					even2D[row][col] = even1D[index];
					
				} else {
					
					even2D[row][col] = -1;
					
				}
				
				index ++;
				
				
				
			}
			
			
			
		}
		System.out.println("\nEven2D");

		for(int[] row: even2D) {
			for(int col: row) {
			System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
