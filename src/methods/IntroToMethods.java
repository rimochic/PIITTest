package methods;

public class IntroToMethods {
    /*
    - There are 2 types of methods
         1.Methods that perform an action and don't return anything
         2.Methods that perform some sort of operation/action and return some sort of value
    - Methode signature or methode declarations contain things:
         1. Access Modifier (Optional)
         2. Static (Optional)
         3. Return Type (Mandatory)
         4. Method Name (Mandatory)
         5. Parenthesis/Parameters (Mandatory)
         6. Code Block (Mandatory)
     */

    public static void main(String[] args) {
        doSomething();
        System.out.println(doSomethingElse());
    }

        static void doSomething(){
            System.out.println("This method is doing something");
        }

        static int doSomethingElse(){
        int x = 5, y = 10;
        return x + y;
        }
}
