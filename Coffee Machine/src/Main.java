import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int w = 200; //in ml
        int m = 50; // in ml
        int c = 15; // in gm
        System.out.print("Write how many ml of water the coffee machine has:\n> ");
        int water = sc.nextInt()/w;
        System.out.print("Write how many ml of milk the coffee machine has:\n> ");
        int milk = sc.nextInt()/m;
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n> ");
        int coffee = sc.nextInt()/c;
        System.out.print("Write how many cups of coffee you will need:\n> ");
        int cup = sc.nextInt();
        int capacity = Math.min(water, Math.min(milk, coffee));
        int extra = capacity - cup;

        if(capacity == cup){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(capacity > cup){
            System.out.println("Yes, I can make that amount of coffee (and even "+ extra +" more than that)");
        }else{
            System.out.println("No, I can make only "+ capacity +" cup(s) of coffee");
        }
    }
}