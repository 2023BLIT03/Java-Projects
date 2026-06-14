import java.util.Scanner;
import java.util.Random;

class Main{
    final static Scanner sc = new Scanner(System.in);
    static int pencil;
    static String name;
    static int move = 0;

    static void main(String[] args){
        pencil();
        name();
        show();
    }

    static void pencil(){
        System.out.print("How many pencils would you like to use:\n> ");
        do{
            if(sc.hasNextInt()){
                pencil = sc.nextInt();
                if(pencil == 0){
                    System.out.print("The number of pencils should be positive\n> ");
                }
            }else{
                System.out.print("The number of pencils should be numeric\n> ");
                sc.nextLine();
            }
        }while(pencil<=0);
        sc.nextLine();
    }

    static void name(){
        System.out.print("Who will be the first (John, Jack):\n> ");
        while(true) {
            name = sc.nextLine();
            if(!name.equals("John") && !name.equals("Jack")){
                System.out.print("Choose between 'John' and 'Jack'\n> ");
                continue;
            }
            System.out.println(name + " is going first!");
            break;
        }
    }

    static void show() {
        Random random = new Random();
        while (pencil > 0) {
            for (int i = 0; i < pencil; i++) {
                System.out.print("|");
            }
            System.out.println();
            if (name.equals("John")) {
                System.out.print("John's turn\n> ");
                if(pencil == 1){
                    move = 1;
                }else if(pencil % 4 == 0){
                    move = 3;
                }else if(pencil % 4 == 2){
                    move = 1;
                }else if(pencil % 4 == 3){
                    move = 2;
                }else{
                    move = random.nextInt(3) + 1;
                }
                System.out.println(move);
            } else {
                System.out.print("Jack's turn\n> ");
                if (!sc.hasNextInt()) {
                    System.out.print("Possible values: '1', '2' or '3'\n> ");
                    sc.nextLine();
                    continue;
                }
                move = sc.nextInt();

                if ((move < 1 || move > 3)) {
                    System.out.print("Possible values: '1', '2' or '3'\n> ");
                    continue;
                }
                if (move > pencil) {
                    System.out.print("Too many pencils were taken\n> ");
                    continue;
                }
            }
            pencil -= move;
            if (name.equals("John")) {
                name = "Jack";
            } else {
                name = "John";
            }
        }
        System.out.println(name+ " won!");
    }
}