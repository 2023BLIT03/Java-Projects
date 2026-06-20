import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string:\n> ");
        String str = sc.nextLine();
        System.out.println();
        encrypt(str);
    }
    static void encrypt(String str){
        for(int i=0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}