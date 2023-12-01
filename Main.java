// Basic Java Program

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


        System.out.println("add Test for sortaSum");
        System.out.println(sortaSum(3, 4)); 
        System.out.println(sortaSum(9, 4));

    }

    // define your methods here
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

   public static int sortaSum(int a, int b){

    if (a + b >= 10 && a + b <= 19){
        return 20;
    } 
    else{
        return a + b;
    }
}





} 

