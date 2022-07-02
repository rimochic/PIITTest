package variablesAndDataTypes;

import jdk.swing.interop.SwingInterOpUtils;
import testPackage.TestClass;

public class Concatenation {

   static String word1 = "Hello";
   static String word2 = "World";
   static String char1 = ",";
   static String exclam = "!";

   static int x = 5;
   static int y = 10;
   static String x1 = "5";
   static String y1 = "10";
   static String quote = "\"You miss 100% of the shots you don't take\"\n\t\t\t-Mostafa-\b\b\b"; // this is how to right quote

    // Concat
    public static void main(String[] args) {
        // String Concat
        System.out.println("Hello, World!");
        System.out.println("Hello" + ". " + "World!"); // This is Concatenation
        System.out.println(word1 + char1 + " " + word2+ exclam); // This is a Concatenation
        System.out.println(word1.toUpperCase() + char1 + " " + word2.toUpperCase() + exclam);

        // Numerical concat
        System.out.println(x+y); // 15 can't be concatenated
        System.out.println(x1 + " " + y1); // 5 10

        // Escape character
        System.out.println(quote);

    }

}
