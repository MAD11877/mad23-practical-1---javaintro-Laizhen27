import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int tries = in.nextInt();
   
    ArrayList <Integer> data = new ArrayList<>();
    for(int i = 0; i < tries; i++){
      System.out.print((i+1)+"): ");
      int numb = in.nextInt();
      data.add(numb);
      
    }
    int times = 0;
    int result = 0;
    for (Integer value : data) {
      int numberoftries = 0 ;
      for (Integer check : data) {      
        if (value == check)
        {
          numberoftries++;  
        }
      if (numberoftries > times){
        times = numberoftries ;
        result = value;
      }
    }
    
    
  }
  System.out.println(result);
}
}


  

