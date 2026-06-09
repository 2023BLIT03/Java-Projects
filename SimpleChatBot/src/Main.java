import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String bot_name = "Jam";
        int year = 2026;
        System.out.println("Hello! My name is "+ bot_name+".");
        System.out.println("I was created in "+ year+".");
        System.out.print("Please, remind me your name.\n> ");

        // reading a name
        String name = sc.nextLine();

        System.out.println("What a great name you have, "+ name +"!");
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
        System.out.println("Now I will prove to you that I can count to any number you want.\n> ");

        // read a number and count to it here
        int num = sc.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(i+"!");
        }

        System.out.println("Completed, have a nice day!");

    }
}
