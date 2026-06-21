import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Converter.input();
    }
}
class Converter{
    final static Scanner sc = new Scanner(System.in);

    static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string:\n> ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println("The result:");
        encrypt(str);
    }

    static void encrypt(String str){
        for(int i=0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " = " + toBinary(str.charAt(i)));
        }
    }
    static String toBinary(char c){
        return Integer.toBinaryString(c);
    }
}