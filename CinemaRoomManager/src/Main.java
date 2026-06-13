import java.util.Scanner;


public class Main{
    final static Scanner sc = new Scanner(System.in);
    static char[][] arr;

    public static void main(String[] args){
        System.out.print("Enter the number of rows:\n> ");
        int r = sc.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        int s = sc.nextInt();
        System.out.println();
        plan(r, s);
        int option;
        do{
            System.out.print("""
                    1. Show the seats
                    2. Buy a ticket
                    0. Exit""");
            System.out.print("\n> ");
            option = sc.nextInt();
            System.out.println();
            if(option == 1){
                showSeats(r, s);
            } else if(option == 2){
                book();
            }else if(option > 2 || option < 0){
                System.out.println("Invalid Number");
            }
        }while(option != 0);
        /*
        System.out.println("Total income:");
        if(r * s <= 60){
            ticket(r,s);
        }else if(r % 2 == 0){
            ticketEven(r, s);
        }else{
            ticketOdd(r, s);
        }
        seatingPlan(r, s);
         */
    }

    static void plan(int r, int s){
        arr = new char[r][s];
        for(int i=0; i<r; i++){
            for(int j=0; j<s; j++){
                arr[i][j] = 'S';
            }
        }
    }
    static void showSeats(int r, int s){

        System.out.println("Cinema");
        System.out.print("  ");
        for(int i=1; i<=arr[0].length; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0; i<r; i++){
            System.out.print((i+1)+" ");
            for(int j=0; j<s; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

    static void book(){
        System.out.print("Enter a row number:\n> ");
        int row_num = sc.nextInt();
        System.out.print("Enter a seat number in that row:\n> ");
        int seat_num = sc.nextInt();
        ticketPrice();
        if(arr[row_num-1][seat_num-1] == 'B'){
            System.out.println("That ticket has already been purchased!");
        }else{
            arr[row_num-1][seat_num-1] = 'B';
        }
    }

    static void ticket(int r, int s){
        int income = r*s*10;
        System.out.println("$"+income);
    }

    static void ticketEven(int r, int s){
        int income = (r/2 * s * 10) + (r/2 * s * 8);
        System.out.println("$"+income);
    }

    static void ticketOdd(int r, int s){
        int income = (r/2 * s * 10) + ((r/2+1) * s * 8);
        System.out.println("$"+income);
    }

    static void ticketPrice(){
        System.out.println("Ticket price: $10\n");
    }
}