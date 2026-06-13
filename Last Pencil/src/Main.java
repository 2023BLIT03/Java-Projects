import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //String pencil = sc.nextLine();
        System.out.print("How many pencils would you like to use:\n> ");
        int pencil = sc.nextInt();
        sc.nextLine();

        System.out.print("Who will be the first (John, Jack):\n> ");
        String name = sc.nextLine();
        System.out.println(name+ " is going first!");
        int remove = 0;
        do{
            for(int i=0; i<pencil; i++){
                System.out.print("|");
            }
            System.out.println();
            if(name.equals("John")){
                name = "Jack";
                System.out.print("Jack's turn\n> ");
            }else{
                System.out.print("John's turn\n> ");
                name = "John";
            }
            remove = sc.nextInt();
            pencil -= remove;
        }while(pencil!=0);

    }
}