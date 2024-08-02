public class StringOperation{
    public static void main(String args[]){
        // To check whether the words or letters starts with give letter or word, we use :- (startsWith()) Syntax. It will and return the ture if it starts with given input or if not it will retur as false.
        String a = "Gaurav";
        System.out.println(a.startsWith("G"));//  For this the outpt will be "True".
        System.out.println(a.startsWith("H")); //  For this the output will be "False".
        
        // To check Whwther the word or letter ens with the given input or not we use:- (endsWith()) Syntax.
        System.out.println(a.endsWith("B")); // For this the output will be "False".
        System.out.println(a.endsWith("V")); // For this th eoutput will be " False".
        
        // To Check Charater at given index no we use :- (chatAt(indexno))
        System.out.println(a.charAt(2)); // Here the output will be "U".
        
        // To check the giver letter index no we use:- (ibdexOf(giveninput)). 
        System.out.println(a.indexOf("G")); // Here the out will be "0".
        
        // To check the given letter from the given index no we se:- (indexOf("givern letter",from index no))
        System.out.println(a.indexOf("u",1 )); // Here the output will be "2".
        
        // To check th e letter frm last we use :- (lastIndexOf(""))
        System.out.println(a.lastIndexOf("v")); // Here the output will be "5".
        
        // To check wheterthe given input is eqaual or not we use :- (equals()).
        System.out.println(a.equals("Amit")); // Here the output will be "False".
        
        // To check ignore the case sensitivity wheather the given input is equal or not we use:- (equasIgnoreCase()); 
        System.out.println(a.equalsIgnoreCase("GAURAV")); // Here the output will be "True".

    }
}
