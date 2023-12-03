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

        System.out.println("add Test for teenSum");
        System.out.println(teenSum(4, 3)); 
        System.out.println(teenSum(10, 13)); 
       


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


    
} 


