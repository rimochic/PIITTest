package methods;

public class Calculator {
    static int a = 18, b = 3;

    public static void main(String[] args) {

        System.out.println(doAddition());
        System.out.println(doSubtraction());
        System.out.println(doMultiplication());
        System.out.println(doDivision());

        String result =(doAddition()>=21) ? "The Total is" + " " + doAddition() : "Hello World";
        System.out.println(result);

        // if (doAddition() >= 23) {
        //    System.out.println("The total is" + " " + doAddition());
     //   }
      //  else if (doSubtraction()<14){
     //       System.out.println("There is an error");
    //    }
     //   else {
    //        System.out.println("Hello");
    //    }
    }

    static int doAddition(){
        return a + b;
    }
    static int doSubtraction(){
        return a - b;
    }
    static int doMultiplication(){
        return a * b;
    }
    static int doDivision(){
    return  a / b;
    }

}
