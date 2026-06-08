import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Bubblegum = 202;
        int Toffee = 118;
        int Ice_cream = 2250;
        int Milk_chocolate = 1680;
        int Doughnut = 1075;
        int Pancake = 80;
        double total = Bubblegum+Toffee+Ice_cream+Milk_chocolate+Doughnut+Pancake;


        String Text = String.format("""
                Bubblegum: $%d
                Toffee: $%d
                Ice cream: $%d
                Milk chocolate: $%d
                Doughnut: $%d
                Pancake: $%d""",Bubblegum, Toffee, Ice_cream, Milk_chocolate, Doughnut, Pancake);
        System.out.println("Earned amount:");
        System.out.println(Text);
        System.out.println("\nIncome: $" + total);
        System.out.print("Staff expenses:\n>");
        int se = sc.nextInt();
        System.out.print("Other expenses:\n>");
        int oe = sc.nextInt();
        System.out.println("Net income: $" + (int)(total - se - oe));
    }
}