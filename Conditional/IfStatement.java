import java.util.Scanner;
public class IfStatement {
    public static void main(String args[]){
        System.out.println("Java if statement is the most simple decision-making statement.\n It is used to decide whether a certain statement or block of statements will be executed or not.\n If a certain condition is true then a block of statement is executed otherwise not.");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println(" Yes");
        }
    }
}