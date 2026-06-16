import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int disposable = 9;
    static int income = 550;

    public static void main(String[] args){
        int w = 200; //in ml
        int m = 50; // in ml
        int c = 15; // in gm
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                """,water, milk, coffee, disposable, income);
        System.out.println();
        System.out.print("Write action (buy, fill, take): \n> ");
        String action = sc.next();
        switch(action){
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n> ");
                int type = sc.nextInt();
                switch(type){
                    case 1:
                        espresso();
                        break;
                    case 2:
                        latte();
                        break;
                    case 3:
                        cappuccino();
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
                System.out.print("I gave you $"+ income +"\n");
                income -= income;
                break;
            default:
                System.out.println("Selection Invalid");
        }
        System.out.println();
        ingredients();
    }

    static void espresso(){
        water -= 250;
        coffee -= 16;
        income += 4;
        disposable--;
    }

    static void latte(){
        water -= 350;
        milk -= 75;
        coffee -= 20;
        income += 7;
        disposable--;
    }

    static void cappuccino(){
        water -= 200;
        milk -= 100;
        coffee -= 12;
        income += 6;
        disposable--;
    }

    static void ingredients(){
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                """,water, milk, coffee, disposable, income);
    }
}