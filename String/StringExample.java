import java.util.Scanner;
// Import java.util.scanner is used to import scanner for taking user input. 
public class StringExample {
    public static void main(String args[]){
       // String name = new String("Gaurav");
    //String name = "Gaurav";
    // Types of Printing in Java 
    // System.out.println("Gaurav");// Println in used to print senntence in next line with sapcing.
    // System.out.print("Hi my name is Gaurav");// Print comman is used when we dont need to print the sentence in tnext line or we don't wantt any space between otput 
    // System.out.print("Gaurav");
    // int a = 10;
    // float b = 20f;

    //System.out.printf("the value of a is %d and the value of b is %f",a,b );
      //  System.out.println(name);
    //  System.out.format("The value of a is %d and the value of b is %f",a,b);
// We can also take input from the user to strore string.
            Scanner scan = new Scanner(System.in);
         //   String st = scan.next();
            String st = scan.nextLine();
            System.out.println(st);

    }
}