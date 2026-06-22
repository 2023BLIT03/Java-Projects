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
            String binary = toBinary(str.charAt(i));
            grouping(binary);
            //System.out.println(str.charAt(i) + " = " + binary);
        }
    }
    static String toBinary(char c){
        return Integer.toBinaryString(c);
    }
    static void grouping(String binary){
        for(int i = 0; i < binary.length(); i++){
            char current = binary.charAt(i);
            int count = 0;

            while(i < binary.length() && binary.charAt(i) == current){
                count++;
                i++;
            }

            if(current == '1'){
                System.out.print("0 ");
            }else{
                System.out.print("00 ");
            }
             System.out.print("0".repeat(count) + " ");
        }
    }
}