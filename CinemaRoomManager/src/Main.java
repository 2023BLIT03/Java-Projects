import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:\n> ");
        int r = sc.nextInt();
        System.out.print("Enter the number of seats in each row:\n> ");
        int s = sc.nextInt();
        System.out.println("Total income:");
        if(r * s <= 60){
            ticket(r,s);
        }else if(r % 2 == 0){
            ticketEven(r, s);
        }else{
            ticketOdd(r, s);
        }
        seatingPlan(r, s);
        System.out.print("Enter a row number:\n> ");
        int row_num = sc.nextInt();
        System.out.print("Enter a seat number in that row:\n> ");
        int seat_num = sc.nextInt();
        newSeatingPlan(r, s, row_num, seat_num);
    }

    static void seatingPlan(int r, int s){
        System.out.println("Cinema:");
        System.out.print("  ");
        for(int i = 1; i <= s; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= r; i++){
            System.out.print(i+" ");
            for(int j = 1; j <= s; j++){
                System.out.print("S ");
            }
            System.out.println();
        }
    }

    static void newSeatingPlan(int r, int s, int row_num, int seat_num){
        System.out.println("Cinema:");
        System.out.print("  ");
        for(int i = 1; i <= s; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 1; i <= r; i++){
            System.out.print(i+" ");
            for(int j = 1; j <= s; j++){
                if(i == row_num && j == seat_num){
                    System.out.print("B ");
                }else{
                    System.out.print("S ");
                }
            }
            System.out.println();
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
}