import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("> ");

        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println();
        System.out.println("_________");
        for(int i=0; i<3; i++){
            System.out.print("| ");
            for(int j=0; j<3; j++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("| \n");
            //System.out.println();
        }
        System.out.println("_________");


    }
}
