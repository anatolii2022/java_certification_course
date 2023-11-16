package java_basics_lambda_practice;

import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {

        Human tom = new Human();
//        tom.walk();
//        walker(tom);
        Robot wale = new Robot();
//        wale.walk();
//        walker(wale);

        walker(new Walkable() {
            @Override
            public void walk() {
                System.out.println("Custom object walking");
            }
        });

        walker(() -> System.out.println("Lambda object walking ...."));

        walker(() -> {
            System.out.println("Lambda objects walking ....");
            System.out.println("Lambda objects walking ....");
        });

        // explanation how lambda concept works
        ALambdaInterface aLambdaInterface = () -> System.out.println("Hopla it works");
        aLambdaInterface.someMethod();

        /* - - - - - - - - - - - - - - - - - - - - - - - */
        ALambdaInterface helloVar = () -> System.out.println("hello there");
        helloVar.someMethod();

        /* - - - - - - - - - - - Converted methods into lambda expression- - - - - - - - - - - - */
        /* - - - - - - - - - - - - - - - - - - - - - - - */
        Calculate sumVar = (a, b) -> a + b;
        System.out.println(sumVar.compute(4, 6));

        /* - - - - - - - - - - - - - - - - - - - - - - - */
        Calculate nonZeroDevider = (a, b) -> {
            if (a == 0) {
                return 0;
            }
            return a / b;
        };
        System.out.println(nonZeroDevider.compute(10, 2));

        /* - - - - - - - - - - - - - - - - - - - - - - - */
        Spell reverseVar = (s) -> {
            String r = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                r = r + s.charAt(i);
            }
            return r;
        };
        System.out.println(reverseVar.print("Lambda"));

        /* - - - - - - - - - - - - - - - - - - - - - - - */
        Multiply factorialVar = (n) -> {
            int r = 1;
            for (int i = 1; i <= n; i++) {
                r = i * r;
            }
            return r;
        };
        System.out.println(factorialVar.increase(3));

        /* - - - - - - - - - - - - - - - - - - - - - - - */
        MyGenericInterface<Integer> computedNumber = (n) -> {
            int r = 1;
            for (int i = 1; i <= n; i++) {
                r = i * r;
            }
            return r;
        };
        System.out.println(computedNumber.work(4));

        /* - - - - - - - - - - - - - - - - - - - - - - - */
        MyGenericInterface<String> reversedVar = (s) -> {
            String r = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                r = r + s.charAt(i);
            }
            return r;
        };
        System.out.println(reversedVar.work("Application"));

    }

    // methods to convert into lambda expressions
    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }

    public void sayHello() {
        System.out.println("Hello there");
    }

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int nonZeroDevide(int arg1, int arg2) {
        if (arg1 == 0) {
            return 0;
        }
        return arg1 / arg2;
    }

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = i * result;
        }
        return result;
    }
}
