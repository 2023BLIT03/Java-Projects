import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);
    static char[][] arr;
    static char input = 'X';
//    static boolean xWin = false;
//    static boolean oWin = false;
//    static int x = 0;
//    static int o = 0;
//    static boolean hasEmpty = false;

    public static void main(String[] args) {


        //System.out.print("> ");
        //String str = sc.nextLine();
        //char[] arr = str.toCharArray();

        int k = 0;
        arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ' ';
                /*

                 */
            }
        }

        System.out.println();
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("| \n");
        }
        System.out.println("---------");
        int c1 = 0;
        int c2 = 0;

        while(true){
            System.out.print("> ");
            if(sc.hasNextInt()) {
                c1 = sc.nextInt();
                if(sc.hasNextInt()){
                    c2 = sc.nextInt();
                }else{
                    System.out.println("You should enter numbers!");
                    sc.next();
                    continue;
                }
            }else{
                System.out.println("You should enter numbers!");
                sc.next();
                continue;
            }
            if(c1 <= 0 || c2 <= 0 || c1 > 3 || c2 > 3){
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if(arr[c1-1][c2-1] == 'X' || arr[c1-1][c2-1] == 'O'){
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            arr[c1 - 1][c2 - 1] = input;
            show();

            char winner = checkWinner();

            if (winner == 'X') {
                System.out.println("X wins");
                break;
            }

            if (winner == 'O') {
                System.out.println("O wins");
                break;
            }

            if (isBoardFull()) {
                System.out.println("Draw");
                break;
            }

            input = (input == 'X') ? 'O' : 'X';

        }
    }
    static char checkWinner() {

        for (int i = 0; i < 3; i++) {
            if (arr[i][0] != ' ' &&
                    arr[i][0] == arr[i][1] &&
                    arr[i][1] == arr[i][2]) {
                return arr[i][0];
            }

            if (arr[0][i] != ' ' &&
                    arr[0][i] == arr[1][i] &&
                    arr[1][i] == arr[2][i]) {
                return arr[0][i];
            }
        }

        if (arr[0][0] != ' ' &&
                arr[0][0] == arr[1][1] &&
                arr[1][1] == arr[2][2]) {
            return arr[0][0];
        }

        if (arr[0][2] != ' ' &&
                arr[0][2] == arr[1][1] &&
                arr[1][1] == arr[2][0]) {
            return arr[0][2];
        }

        return ' ';
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    static void show(){
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("| \n");
        }
        System.out.println("---------");
    }
}
