import java.util.Scanner;
public class WhileLoop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("While Loops");
        
        // While Loop
        
        System.out.println("Enter 1 number");
        int a =sc.nextInt();
        while(a<200){
            System.out.println(a);
            a++;
        }
        System.out.println("Enter 2 number");
        int b =sc.nextInt();
        while (b>=200){
            System.out.println(b);
            b++;
        }
    }
}