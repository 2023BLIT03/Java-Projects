import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Converter.input();
    }
}
class Converter {
    final static Scanner sc = new Scanner(System.in);

    static void input() {
        String option;
        String str = "";
        do {
            System.out.print("Please input operation (encode/decode/exit):\n> ");
            option = sc.nextLine();
            switch (option) {
                case "encode":
                    System.out.print("Input string:\n> ");
                    str = sc.nextLine();
                    System.out.println("Encoded string:");
                    encrypt(str);
                    System.out.println();
                    break;
                case "decode":
                    System.out.print("Input encoded string:\n> ");
                    str = sc.nextLine();
                    decrypt(str);
                    System.out.println();
                    break;
                case "exit":
                    System.out.print("Bye!");
                    break;
                default:
                    System.out.println("There is no '"+ option +"' operation");
            }
        } while (!option.equals("exit"));
        System.out.println();
    }

    static void encrypt(String str) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            binary.append(toBinary(str.charAt(i)));
            //System.out.print(binary);
        }
        grouping(binary.toString());
    }

    static String toBinary(char c) {
        return String.format("%7s", Integer.toBinaryString(c)).replace(' ', '0');
    }

    static void grouping(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            char current = binary.charAt(i);
            int count = 0;

            while (i < binary.length() && binary.charAt(i) == current) {
                count++;
                i++;
            }
            i--;

            if (current == '1') {
                System.out.print("0 ");
            } else {
                System.out.print("00 ");
            }
            System.out.print("0".repeat(count) + " ");
        }
    }

    static void decrypt(String str) {
        String[] arr = str.split(" ");
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < arr.length; i += 2) {
            String prefix = arr[i];
            String zeros = arr[i + 1];

            char bit = prefix.equals("0") ? '1' : '0';

            binary.append(String.valueOf(bit).repeat(zeros.length()));
        }
        for (int i = 0; i < binary.length(); i += 7) {
            String chunk = binary.substring(i, i + 7);
            int ascii = Integer.parseInt(chunk, 2);
            System.out.print((char) ascii);
        }
    }
}
