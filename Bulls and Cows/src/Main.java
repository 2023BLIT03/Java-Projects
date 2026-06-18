import java.util.Scanner;

class Main{
    final static Scanner sc = new Scanner (System.in);
    static int bull = 0;
    static int cow = 0;
    static String code = "9305";
    static String str = "";
    static char[] arr;
    static long pseudoRandomNumber = System.nanoTime();


    public static void main(){
        System.out.print(">");
        //str = sc.next();
        //arr = str.toCharArray();

        if(pseudoRandomNumber.)
        System.out.println(pseudoRandomNumber);
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