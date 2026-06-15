import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        int o = 0;
        boolean hasEmpty = false;
        System.out.print("> ");
        String str = sc.nextLine();
        //char[] arr = str.toCharArray();

        int k = 0;
        char[][] arr = new char[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = str.charAt(k++);
                if(arr[i][j] == 'X'){
                    x++;
                }else if(arr[i][j] == 'O'){
                    o++;
                }else if(arr[i][j] == '_'){
                    hasEmpty = true;
                }
            }
        }

        System.out.println();
        System.out.println("_________");
        for(int i=0; i<3; i++){
            System.out.print("| ");
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("| \n");
            //System.out.println();
        }
        System.out.println("_________");

        boolean xWin = false;
        boolean oWin = false;

        //rows
        for(int i=0; i<3; i++){
            if(arr[i][0] == arr[i][1] || arr[i][1] == arr[i][2]){
                if(arr[i][0] == 'X') xWin = true;
                if(arr[i][0] == 'O') oWin = true;
            }
        }
        //columns
        for(int i=0; i<3; i++){
            if(arr[0][i] == arr[1][i] || arr[1][i] == arr[2][i]){
                if(arr[0][i] == 'X') xWin = true;
                if(arr[0][i] == 'O') oWin = true;
            }
        }
        //diagonals
        for(int i=0; i<3; i++){
            if(arr[0][0] == arr[1][1] || arr[1][1] == arr[2][2]){
                if(arr[0][0] == 'X') xWin = true;
                if(arr[0][0] == 'O') oWin = true;
            }
        }
        for(int i=0; i<3; i++){
            if(arr[0][2] == arr[1][1] || arr[1][1] == arr[2][0]){
                if(arr[0][2] == 'X') xWin = true;
                if(arr[0][2] == 'O') oWin = true;
            }
        }

        if(x-o > 1 || o-x > 1 || (xWin && oWin)){
            System.out.println("Impossible");
        }else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (hasEmpty) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }

    }
}
