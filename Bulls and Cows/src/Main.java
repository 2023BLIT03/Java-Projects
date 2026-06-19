import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner (System.in);
    static int bull = 0;
    static int cow = 0;
    static String code = "9305";
    static String str = "";
    static char[] arr;
    static long pseudoRandomNumber = System.nanoTime();
    static String num =  "" + pseudoRandomNumber;


    public static void main(){
        StringBuilder sb = new StringBuilder();
        System.out.print(">");
        //str = sc.next();
        //arr = str.toCharArray();
        String rev = "";
        int len = sc.nextInt();
        if(len > 10){
            System.out.printf("Error: can't generate a secret number with a length of %d because there aren't enough unique digits.\n", len);
            return;
        }
        String secret = "";

        while(secret.length() < len){
            for(int i=num.length()-1; i >= 0; i--){
                char digit = num.charAt(i);

                if(secret.indexOf(digit) == -1){
                    if(secret.isEmpty() && digit == '0'){
                        continue;
                    }
                    secret += digit;
                }
                if(secret.length() == len){
                    break;
                }
            }
        }

        System.out.printf("The random secret number is %s.\n", secret);

        //isBull();
        //isCow();
        //print();
    }
    static void isBull(){
        for(int i=0; i < code.length(); i++) {
            if (code.charAt(i) == (arr[i])) {
                bull++;
            }
        }
    }

    static void isCow(){
        for(int i=0; i < code.length(); i++){
            for(int j=0; j < code.length(); j++){
                if(i != j && code.charAt(i) == (arr[j]) && code.charAt(i) != (arr[i])){
                    cow++;
                }
            }
        }
    }
    static void print(){
        if(bull>0 && cow>0){
            System.out.printf("Grade: %d bull(s) and %d cow(s). The secret code is %s.\n", bull, cow, code);
        }else if(bull>0){
            System.out.printf("Grade: %d bull(s). The secret code is %s.\n", bull, code);
        }else if(cow>0){
            System.out.printf("Grade: %d cow(s). The secret code is %s.\n", cow, code);
        }else{
            System.out.printf("None. The secret code is %s.\n", code);
        }
    }

}