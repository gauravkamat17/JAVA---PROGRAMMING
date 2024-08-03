import java.util.Scanner;
public class Ifelse{
        public static void main(String args[]){
             System.out.println("If- else together represents the set of Conditional statements in Java.\n That are executed according to the condition which is true.");
            Scanner scan=new Scanner(System.in);
            int a=scan.nextInt();
            
            if(a>=25){
                System.out.println(" Yes you are eligible ");
            }else{
                System.out.println(" Better Luck Next Time");
            } 
        
    }
}