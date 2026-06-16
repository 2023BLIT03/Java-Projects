import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Write how many cups of coffee you will need:\n> ");
        int cup = sc.nextInt();
        System.out.println("For "+ cup +" cups of coffee you will need:");
        System.out.println(cup * 200 +" ml of water");
        System.out.println(cup * 50 +" ml of milk");
        System.out.println(cup * 15 +" g of coffee beans");
    }
}