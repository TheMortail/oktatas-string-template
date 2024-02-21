import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();// variable, method, field
        example3();//arithmetic
        example4();//Double Quotes
        example5();//Multi-line Expressions
    }

    private static void example1(){
        String name= "Béla";
        String message = STR."Greetings \{ name }!";
        System.out.println(message);
    }

    private static void example2(){
        String name = "Józsi";
        Person person1 = new Person("Géza");

        //variable
        System.out.println(STR."Greetings \{name}!");

        //method
        System.out.println(STR."Greetings \{person1.getName()}!");

        //field
        System.out.println(STR."Greetings \{person1.name}!");
    }

    private static void example3(){
        int x = 10, y = 20;
        System.out.println(STR."\{x} + \{y} = \{x + y}");//"10 + 20 = 30"
    }

    private static void example4(){
        Boolean result = false;

        String name = "Pista";
        String msg = STR."\{name} \{result ? "benne van" : "nincs benne"} az adatbázisban!";

        System.out.println(msg);
    }
    private static void example5(){
        String time = STR."The current time is \{
        //sample comment - current time in HH:mm:ss
        DateTimeFormatter
                .ofPattern("HH:mm:ss")
                .format(LocalTime.now())
        }.";

        System.out.println(time);
    }
}