
public class P6B {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		int rowSum = 0;
		int colSum = 0;
		int [][] numbers = new int [3][5];
		
		for(int row = 0; row < numbers.length; row ++)
		{
			for (int col = 0; col < numbers[0].length; col++)
			{
				
				count ++ ;
				numbers[row][col] = count;
				sum += numbers[row][col];
				
			System.out.print(numbers[row][col] + " ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();

		
		for(int row = 0; row < numbers.length; row ++)
		{
			for (int col = 0; col < numbers[0].length; col++)
			{
				
				rowSum += numbers[row][col];
			
				
				
			}
			
			System.out.println("Row " + row + " sum is " + rowSum);
			rowSum = 0;

		}
	
	System.out.println();
	
	for(int col = 0; col < numbers[0].length; col ++)
	{
		
		for (int row = 0; row < numbers.length; row++)
		{
			
			colSum += numbers[row][col];

		}
		
		System.out.println("Colum " + col + " sum" + " is " + colSum);
		colSum = 0;
	
	}
	System.out.println();
	System.out.println("Total value of Array:" + sum);

}

}
