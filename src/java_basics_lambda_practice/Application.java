package java_basics_lambda_practice;

import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {

        Human tom = new Human();
//        tom.walk();
        walker(tom);
        Robot wale = new Robot();
//        wale.walk();
        walker(wale);

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

    }

    public static void walker(Walkable walkableEntity) {
        walkableEntity.walk();
    }
}
