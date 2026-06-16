import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int disposable = 9;
    static int income = 550;
    static int count = 0;

    public static void main(String[] args){


        String action = "";

        do {
            System.out.print("Write action (buy, fill, take, clean, remaining, exit): \n> ");
            action = sc.next();
            if (count >= 2 && !action.equals("clean") && !action.equals("exit")) {
                System.out.println("I need cleaning!");
                System.out.println();
                continue;
            }
            switch (action) {
                case "buy":
                    System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n> ");
                    String type = sc.next();
                    switch (type) {
                        case "1":
                            espresso();
                            break;
                        case "2":
                            latte();
                            break;
                        case "3":
                            cappuccino();
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Selection Invalid");
                    }
                    break;
                case "fill":
                    System.out.print("Write how many ml of water you want to add:\n> ");
                    int add_water = sc.nextInt();
                    water += add_water;
                    System.out.print("Write how many ml of milk you want to add:\n> ");
                    int add_milk = sc.nextInt();
                    milk += add_milk;
                    System.out.print("Write how many grams of coffee beans you want to add:\n> ");
                    int add_coffee = sc.nextInt();
                    coffee += add_coffee;
                    System.out.print("Write how many disposable cups you want to add:\n> ");
                    int add_disposable = sc.nextInt();
                    disposable += add_disposable;
                    break;
                case "take":
                    System.out.print("I gave you $" + income + "\n");
                    income -= income;
                    break;
                case "clean":
                    clean();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Selection Invalid");
            }
            System.out.println();
        }while(!action.equals("exit"));
    }

    static void espresso(){
        int w = 250; //in ml
        int m = 50; // in ml
        int c = 16; // in gm
        if(water < w){
            System.out.println("Sorry, not enough water!");
        }else if(coffee < c){
            System.out.println("Sorry, not enough coffee!");
        }else if(disposable < 1){
            System.out.println("Sorry, not enough disposable!");
        }else{
            System.out.println("I have enough resources, making you a coffee!");
            income += 4;
            count++;
        }
        water -= 250;
        coffee -= 16;
        disposable--;
    }

    static void latte(){
        int w = 350; //in ml
        int m = 75; // in ml
        int c = 20; // in gm
        if(water < 0){
            System.out.println("Sorry, not enough water!");
        }else if(milk < 0){
            System.out.println("Sorry, not enough milk!");
        }else if(coffee < 0){
            System.out.println("Sorry, not enough coffee!");
        }else if(disposable < 0){
            System.out.println("Sorry, not enough disposable!");
        }else{
            System.out.println("I have enough resources, making you a coffee!");
            income += 7;
            count++;
        }
        water -= 350;
        milk -= 75;
        coffee -= 20;
        disposable--;
    }

    static void cappuccino(){
        int w = 200; //in ml
        int m = 100; // in ml
        int c = 12; // in gm
        if(water < 0){
            System.out.println("Sorry, not enough water!");
        }else if(milk < 0){
            System.out.println("Sorry, not enough milk!");
        }else if(coffee < 0){
            System.out.println("Sorry, not enough coffee!");
        }else if(disposable < 0){
            System.out.println("Sorry, not enough disposable!");
        }else{
            System.out.println("I have enough resources, making you a coffee!");
            income += 6;
            count++;
        }
        water -= 200;
        milk -= 100;
        coffee -= 12;
        disposable--;
    }

    static void clean(){
        count = 0;
        System.out.println("I have been cleaned!");
    }

    static void remaining(){
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                %d
                """,water, milk, coffee, disposable, income, count);
    }
}