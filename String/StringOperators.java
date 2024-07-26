// Strings
public class StringOperators {
    public static void main(String args[]){
         String a = "Gaurav";
         String b = "GauravKumarKamat";
         String c = "       Hi My Name is Gaurav        ";
         System.out.println(a);
         
         // To find how may letters are available in one word we use :- (a.length) syntax.
         System.out.println(a.length()); // Here the output will be "6".
         System.out.println(b.length()); // Here the output will be "16".
         
         // To  make lowercase all the letters in the word or sentence we use this synatx or function :- (a.toLowerCase()). It will create all the letters in lowercase. 
         System.out.println(a.toLowerCase()); // Here the output will be "gaurav".
         System.out.println(b.toLowerCase()); // Here the output will be "gauravkumarkamat".

        // To make UpperCase all the letter available in the word or sentence we use this syntax or function :- (a.toUpperrCase());
        System.out.println(a.toUpperCase()); // Here the output will be "GAURAV".
        System.out.println(b.toUpperCase()); // Here the output will "GAURAVKUMARKAMAT".
        
        // To delete the space form the word form backward and forward side we use this function or syntax :- (a.trim()).
        System.out.println(c); // Here no Space is Delete.
        System.out.println(c.trim()); // Here all the space are deleted and the output will be "Hi My Name is Gaurav".

        // Sub string is used to print new string after the index string to create a substring of the given string use use substring function or syntax :- (a.substring(startindexnumber)). 
        System.out.println(a.substring(2)); // Here the output will be "urav".
        System.out.println(b.substring(1)); // Here the output will be "auravKumarKamat".
        
        //Sub string is used to print new string after the index string to create a substring  from the start index but dont want ends index after wards  use substring function or syntax :- (a.substring(startindexnumber, end index number)). In this it will contain start index number but will delete all the all letter after end index .
        System.out.println(a.substring(2,5)); // Here the output will be "ura".
        System.out.println(b.substring(0,6)); // Here the output will be "Gaurav". 

        // For replacing the word or letter in serntence or word we use replace :- (a.replace('with whom you want to replace', 'what you want to replace' ))
        System.out.println(a.replace('a','u')); // Here the out put will be "Guuruv".
        System.out.println(b.replace("aur","ori")); // Here the output will be "GoriavKumarKamat".

        //  To check wheather the sentence start with the give input or not, we use (startsWith) function or syntax. It will check the word if the starts with the given input it return as true or f not it will return as false :- (a.starsWith("input")).
        System.out.println(a.startsWith("Gau")); // Here the output will be "ture" because the word starts with Gau.
        System.out.println(b.startsWith("Kam")); // Here the output will be "false" because the word starts with Gau insted of Kam.

        
        //  To check wheather the sentence ends with the give input or not, we use (endsWith) function or syntax. It will check the word if the ends with the given input it return as true or f not it will return as false :- (a.endsWith("input")).
        System.out.println(a.endsWith("rav")); // Here the output will be "ture" because the word ens with 'v'.
        System.out.println(b.endsWith("rut")); // Here the output will be "false" because it ends with "mat".

        // To  check the element at given index position we use (charAt()) syntax or function :- (a.charAt(indexposition))
        System.out.println(a.charAt(2)); // Here the output will be "u".
        System.out.println(b.charAt(3)); // Here the output will be "r".






    }

}