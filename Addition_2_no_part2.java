import java.util.Scanner;
public class Addition_2_no_part2 {
   public static void main(String[] args) {
     
    int x, y, sum;
    Scanner myObj = new Scanner(System.in); 

    System.out.println("Type a number:");
    x = myObj.nextInt(); 

    System.out.println("Type another number:");
    y = myObj.nextInt(); 

    sum = x + y;
    System.out.println("Sum is: " + sum); 
  }
} 
