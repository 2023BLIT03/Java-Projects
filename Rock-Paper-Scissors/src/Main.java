import java.util.Scanner;

public class Main{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        IO.print(">");
        String option = sc.next();
       switch(option){
           case "rock":
               System.out.println("Sorry, but the computer chose paper");
               break;
           case "paper":
               System.out.println("Sorry, but the computer chose scissors");
               break;
           case "scissors":
               System.out.println("Sorry, but the computer chose rock");
               break;
           default:
               System.out.println("Invalid Selection");
       }
    }
}