import java.util.Scanner;
/** THis program will calculate the dot product for a vector
 *
 * @author Isaac
 */
public class Main {
//x1 * x2 + y2* y1 + z1 *z2,
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int[] num = new int [3];
    System.out.println("Please enter the value for the first vector");
    for(int i = 0; i < num.length; i++){
     num[i] = input.nextInt();
    }
    int[] num2 = new int [3];
    System.out.println("Please enter the values for the second vector");
    for(int i = 0; i < num2.length; i++){
    num2[i] = input.nextInt();
    }
   for(int i = 0; i < num.length && i < num2.length; i++){
    int dp = num[0] * num2[0] + num[1] * num2[1] + num[2] * num2[2];
    System.out.print("The dot product is " + dp);
   }
  }
}
