
/**
 * Write a description of class P68 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P6A
{
    
    
    public static void main(String args[]){
    
        
        int[][]numbers =  new int[3][4];
        for(int row = 0; row < numbers.length;row++){
            
            for(int col = 0; col < numbers[0].length; col++){
                
                numbers[row][col] = (int)( Math.random() * 9);
                System.out.print(numbers[row][col] + " ");
                
            
            
            }
            
            
            System.out.println("");
        
        
        }
        
        
         for(int row = 0; row < numbers.length;row++){
            
            for(int col = 0; col < numbers[0].length; col++){
                    
                if(numbers[row][col] == 5){
                    
                    
                    System.out.println("Number 5 found in row " + (row + 1) + " and column " + (col + 1));
                    
                
            
            
                }
            
            

        
        
        }
        
        
    
    
    }


  }
}
