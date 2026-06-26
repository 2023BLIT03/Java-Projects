import java.util.Scanner;
import java.util.Random;

public class Main{
    final static Scanner sc = new Scanner(System.in);
    final static Random random = new Random();

    public static void main(String[] args){
        input();
    }

    static void input(){
        String option;
        do{
            IO.print(">");
            //ystem.out.println();
            option = sc.next();
            switch(option){
                case "rock":
                    if(option.equals(compare())) {
                        System.out.println("There is a draw (" + option + ")");
                    }else if("paper".equals(compare())) {
                        System.out.println("Sorry, but the computer chose paper");
                    }else{
                        System.out.println("Well done. The computer chose scissors and failed");
                    }
                    break;
                case "paper":
                    if(option.equals(compare())) {
                        System.out.println("There is a draw (" + option + ")");
                    }else if("scissors".equals(compare())) {
                        System.out.println("Sorry, but the computer chose scissors");
                    }else{
                        System.out.println("Well done. The computer chose rock and failed");
                    }
                    break;
                case "scissors":
                    if(option.equals(compare())) {
                        System.out.println("There is a draw (" + option + ")");
                    }else if("rock".equals(compare())) {
                        System.out.println("Sorry, but the computer chose rock");
                    }else{
                        System.out.println("Well done. The computer chose paper and failed");
                    }
                    break;
                case "!exit":
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while(!option.equals("!exit"));

    }

    enum Color{
        rock, paper, scissors
    }

    static String compare(){
        Color[] color = Color.values();
        Color randomColor = color[random.nextInt(color.length)];
        return randomColor.toString();
    }
}