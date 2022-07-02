package variablesAndDataTypes;

public class Operators {

    public static void main(String[] args) {

        int x =5;
        int y = 10;
        /*
    Assignment Operators - used to assign a value to a variable
     - Equal sign (=)
     - Incremental operator (+=)
     - Decremental operator (-=)
         */

        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x -= 3;
        System.out.println(x);

    /*
    Comparison operators - Used to check if 2 values are equal/not equal
        - Equal to (==)
        - Is not equal to (!=)
        - Greater than (>)
        - Greater than or equal to (>=)
        - Less than(<)
        - Less than or equal to (<=)
     */
        boolean isEqual = x == y;
        System.out.println(x == y );
        System.out.println(isEqual);

        boolean isNotEqual = x != y;
        System.out.println(isNotEqual);

        boolean isGreaterThan;
        boolean isGreaterThanOrEqualTo;
        boolean isLessThan;
        boolean isLessThanOrEqualTo;

        // False
        isGreaterThan = x > y;
        System.out.println(isGreaterThan);
        // False
        isGreaterThanOrEqualTo = x >= y;
        System.out.println(isGreaterThanOrEqualTo);
        // True
        isLessThan = x < y;
        System.out.println(isLessThan);
        // True
        isLessThanOrEqualTo = x <= y;
        System.out.println(isLessThanOrEqualTo);

    /*
        Logical operators - Used to logically add two conditionals (and, or)
        - And (&&)
        - Or (||)
     */
        boolean twoConditionals, secondConditional;
        twoConditionals = isGreaterThan && isLessThanOrEqualTo;
        System.out.println("\n" + twoConditionals);

        secondConditional = isLessThan || isGreaterThanOrEqualTo;
        System.out.println(secondConditional);


        // Expressions always evaluate to some sort of value
        // exp : 1 + 2 is an expression evaluates to 3
    }
}
