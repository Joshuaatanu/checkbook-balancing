import java.util.Scanner;


public class CheckbookBalancingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0.0; // initial balance

        // keeps reading the input till the end of the file
        System.out.print("withdraw or deposit ");
        while (input.hasNext()) {


            String transaction = input.next();  //withDraw or deposit
            System.out.print("Amount ");
            double amount = input.nextDouble(); //amount

            if (transaction.equals("deposit")) {
                balance += amount;
            } else if (transaction.equals("withdraw")) {
                balance -= amount;
            }

            System.out.printf("balance: %2f\n", balance); // prints update balance
            System.out.print("withdraw or deposit ");
        }

    }
}