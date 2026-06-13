import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //String pencil = sc.nextLine();
        System.out.print("How many pencils would you like to use:\n> ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.print("Who will be the first (John, Jack):\n> ");
        String name = sc.nextLine();
        for(int i=0; i<count; i++){
            System.out.print("|");
        }
        System.out.println();
        System.out.println(name+ " is going first!");
    }
}