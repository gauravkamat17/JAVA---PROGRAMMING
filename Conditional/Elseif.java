import java.util.Scanner;
public class Elseif{
    public static void main(String args[]){
        System.out.println("Else If Condition ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>18){
            System.out.println(" You Are Eligiable For Appering In Driving Test Exam");
        }
        else if(a<18){
            System.out.println(" You Are ot eligiable");
        }
        
        
        else{
            System.out.println("Better LuckNext Time");
        }
    }
}