import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        greet("Jam", "2026");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String bot_name, String birthYear){
        System.out.println("Hello! My name is "+ bot_name+".");
        System.out.println("I was created in "+ birthYear+".");
        System.out.print("Please, remind me your name.\n> ");
    }

    static void remindName(){
        String name = sc.nextLine();
        System.out.println("What a great name you have, "+ name +"!");
    }

    static void guessAge(){
        System.out.println("Let me guess your age.");
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7.\n> ");

        // reading all remainders
        int remainder3 = sc.nextInt();
        System.out.print("> ");
        int remainder5 = sc.nextInt();
        System.out.print("> ");
        int remainder7 = sc.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Your age is "+age+" that's a good time to start programming!");
    }

    static void count(){
        System.out.print("Now I will prove to you that I can count to any number you want.\n> ");

        // read a number and count to it here
        int num = sc.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(i+"!");
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.print("4. To interrupt the execution of a program.\n> ");
        int ans;
        do {
            ans = sc.nextInt();
            if(ans == 1 || ans == 3 || ans == 4){
                System.out.print("Please, try again.\n> ");
            } else if(ans != 2){
                System.out.print("Invalid Number!\n> ");
            }
        }
        while (ans != 2);
    }

    static void end(){
        System.out.println("Congratulations, have a nice day!");
    }
}
