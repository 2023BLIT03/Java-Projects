import java.util.Scanner;
import java.util.Random;

class Main{
    final static Scanner sc = new Scanner (System.in);
    static Random random = new Random();
    static int bull;
    static int cow;
    static String str = "";
    static char[] arr;
    static long pseudoRandomNumber;
    static String num;
    static StringBuilder secret = new StringBuilder();


    public static void main(String[] args){

        run();


    }

    static void run(){
        int turn = 1;
        System.out.println("Please, enter the secret code's length:");
        System.out.print(">");
        int len = sc.nextInt();
        generateSecretCode(len);
        System.out.println("Okay, let's start a game!");
        do {
            bull = 0;
            cow = 0;
            System.out.printf("Turn %d:\n> ", turn);
            turn++;
            str = sc.next();
            arr = str.toCharArray();
            isBull();
            isCow();
            print();

        }while(!secret.toString().equals(str));
        System.out.print("Congratulations! You guessed the secret code.");
    }

    static void generateSecretCode(int len){

        if(len > 10){
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.\n", len);
            return;
        }

        while(secret.length() < len){
            pseudoRandomNumber = random.nextLong();
            num =  "" + pseudoRandomNumber;

            for(int i=num.length()-1; i >= 0; i--){
                char digit = num.charAt(i);

                if(secret.indexOf(String.valueOf(digit)) == -1){
                    if(secret.isEmpty() && digit == '0'){
                        continue;
                    }
                    secret.append(digit);
                }
                if(secret.length() == len){
                    break;
                }
            }
        }
    }

    static void isBull(){
        for(int i=0; i < secret.length(); i++) {
            if (secret.charAt(i) == (arr[i])) {
                bull++;
            }
        }
    }

    static void isCow(){
        for(int i=0; i < secret.length(); i++){
            for(int j=0; j < secret.length(); j++){
                if(i != j && secret.charAt(i) == (arr[j]) && secret.charAt(i) != (arr[i])){
                    cow++;
                }
            }
        }
    }
    static void print(){
        if(bull>0 && cow>0){
            System.out.printf("Grade: %d bull(s) and %d cow(s).\n", bull, cow);
        }else if(bull>0){
            System.out.printf("Grade: %d bull(s).\n", bull);
        }else if(cow>0){
            System.out.printf("Grade: %d cow(s).\n", cow);
        }else {
            System.out.println("Grade: None.");
        }
    }
}