// Basic Java Program

/**
 * Practice for LiveHack 3
 * @author: L. Wong 
 */

public class Main {
    public static void main(String[] args) {
        // make test calls to your methods here

        // add Test 1
        System.out.println("add Test for dateFashion");
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(10, 10));
        System.out.println(dateFashion(2, 10));
        System.out.println(dateFashion(2, 1));
        System.out.println(dateFashion(5, 7));

        // add Test 2
        System.out.println("add Test for sortaSum");
        System.out.println(sortaSum(3, 4)); 
        System.out.println(sortaSum(9, 4));

        // add Test 3 
        System.out.println("add Test for sortaSum");
        System.out.println(old35(15)); 
        System.out.println(old35(10)); 
        System.out.println(old35(9)); 

        // add Test 4
        System.out.println("add Test for teenSum");
        System.out.println(teenSum(4, 3)); 
        System.out.println(teenSum(10, 13)); 
       
        // add Test 5 
        System.out.println("add Test for doubleChar");
        System.out.println(doubleChar("hello")); 
        System.out.println(doubleChar("BBAA")); 

         // add Test 6 
        System.out.println("add Test for countCode");
        System.out.println(countCode("codecopecoaehsnc")); 
        System.out.println(countCode("BBAA")); 
        System.out.println(countCode("BBAcope")); 

        // add Test 7
        System.out.println("add Test for bobThere");
        System.out.println(bobThere("bobbbobbbb")); 
        System.out.println(bobThere("b9b")); 
        System.out.println(bobThere("bac")); 

    }

    /**
     * Calculates the likelihood of someone getting a table at a restuarant 
     * @param you the amount of style you have
     * @param date the amount of style your partner has
     * @return returns a number based on the chances of getting a table, 0 = no, 1 = maybe, 2 = yes
     */
    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            // Either of you has style 2 or less, result is 0 (no)
            return 0;
        } 
        else if (you >= 8 || date >= 8) {
            // Either of you is very stylish (8 or more), result is 2 (yes)
            return 2;
        } 
        else {
            // Otherwise, the result is 1 (maybe)
            return 1;
        }            
    }

    /**
     * Calculates the sum of a and b, however if the sum is in between 10 and 19 inclusive, return 20
     * @param a the first number 
     * @param b the second number 
     * @return the sum of the two numbers, or 20 if the sum is in between 10 and 19 inclusive 
     */
    public static int sortaSum(int a, int b){

        if (a + b >= 10 && a + b <= 19){
            return 20;
        } 
        else{
            return a + b;
        }
    }

    /**
     * If the number is a multiple of 5 or 3, return true
     * If the number is a multiple of 5 and 3, return false 
     * @param n the number 
     * @return true or false depending on if it is a multiple of 3 or 5, or a multiple of both. 
     */
    public static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 != 0){
            return true; 
        }
        else if (n % 5 == 0 && n % 3 != 0){
            return true;
        }
        else {
            return false; 
        }
    }
    /**
     * Given 2 ints, a and b, return their sum. 
     * However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
     * @param a first number 
     * @param b second number 
     * @return the sum or 19 
     */
    public static int teenSum(int a, int b) {
       // if (a < 13 && a > 19 && b < 13 && b > 19){
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    /**
     * Doubles each character in the string 
     * @param str the string 
     * @return returns the string with doubling each character 
     */
    public static String doubleChar(String str) {
       
        String strResult = ""; 
        for (int i = 0; i < str.length(); i++){
            strResult += str.charAt(i) + "" + str.charAt(i);
        }
        return strResult; 
  
    }

    /**
     * Counts the amount of times the word "code" is inside a string, but 'd' can be replaced by any letter. 
     * @param str
     * @return the amount "co*e" is inside a string 
     */
    public static int countCode(String str) {

        int intResult = 0;
        for (int i = 0; i < str.length() - 3; i++){

            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e'){
                intResult ++;
            }
            else {
                intResult += 0;
            }
        }
        return intResult; 
    }
    
   
   
    public static boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++){

            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                return true;
            }
        }
        return false; 

    }
   
    
    public static String repeatEnd(String str, int n) {
        
        int length = str.length();
        String result = "";
    
        for (int i = 0; i < n; i++) {
            result += str.substring(length - n);
        }
    
        return result;
    }
    
        
}

    




