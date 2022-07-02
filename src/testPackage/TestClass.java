package testPackage;
/*
What is the class?
    -Class is a blueprint or representation of a real world
    -Any object can be described using its attributes/characteristics, and the method that object can perform
 */

public class TestClass {
    // Global (Instance) variables - Accessible by all methods of the class
   static int a = 10;
   static int b = 5;

    public static void main(String[] args) {
        System.out.println(a + b);
        methodOne();
    }
        public static void methodOne() {
        // Local variables - Restricted to just one method that is declared inside of
            int x = 40;         // Called also Scope
            System.out.println(a + x);
        }
        void methodTwo(){
            System.out.println(b);

        }

        void methodThree(){
            System.out.println(a);
        }

}
