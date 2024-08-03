import java.util.Scanner;
/*  The switch statement in Java is a multi-way branch statement. In simple words, the Java switch statement executes one statement from multiple conditions.
It is an alternative to an if-else-if ladder statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 
The expression can be of type byte, short, char, int, long, enums, String, or wrapper classes (Integer, Short, Byte, Long).
Note: Java switch expression must be of byte, short, int, long.*/

public class SwitchCase{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age.");
        int age=scan.nextInt();
        
        switch(age){
            case 5:
            System.out.println(" You are is below 5 years");
            break;
            case 19:
            System.out.println("Your age is above 18 yeras");
            break;
            case 1:
            System.out.println(" Your age is above 25");
            break;
        
        default:
        System.out.println(" Live Your Life As You Want To Live");
        }
    }
}