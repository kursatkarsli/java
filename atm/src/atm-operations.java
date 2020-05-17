/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

public class Atm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        double dolar = 6.02;
        String operations = "1. operation = Learning Balance    \n"
                + "2. operation = Withdraw Money      \n"
                + "3. operation = investment          \n"
                + "4. operation = Buy Foreign Currency\n"
                + "5. operation = Take credit         \n"
                + "Press q for EXİT";;

        while (true) {
            System.out.println(operations);
            System.out.print("Please choose operation ");
            String operation_input = scanner.nextLine();
            if (operation_input.equals("q") || operation_input.equals("Q")) {

                System.out.println("Exiting from program...");

                break;
            } else if (operation_input.equals("1")) {

                System.out.println("BALANCE : " + balance + "\n");
            } else if (operation_input.equals("2")) {
                System.out.println("Please enter to amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                if (balance - amount < 0) {
                    System.out.println("Insufficient fund " + "Balance : " + balance);
                } else {
                    balance -= amount;
                    System.out.println("Withdraw operation is completed \n" + "New Balance : " + balance + "\n");

                }
            } else if (operation_input.equals("3")) {
                System.out.println("Enter to the invest amount : ");
                int invest_amount = scanner.nextInt();
                scanner.nextLine();
                balance += invest_amount;
                System.out.println("Invest operation is completed \n " + "New Balance :  " + balance);

            } else if (operation_input.equals("4")) {
                System.out.println("Dolar rate : " + dolar);
                System.out.println("Enter the amount which you to buy in TL type ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                if (balance - amount <= 0) {
                    System.out.println("Not enough Balance" + "\n Please adjust your amount");

                } else {
                    System.out.println("Operation completed");
                    balance -= amount;
                    System.out.println("Current Amount :  " + balance);

                    double exchance= amount;

                    exchance = (double) (amount * dolar);

                    System.out.println("Dolar account" + exchance);
                }
            } else if (operation_input.equals("5")) {
                System.out.println("How much money do you want to get ");

                int amount_credit = scanner.nextInt();
                scanner.nextLine();

                if (amount_credit > (balance *= 50)) {

                    System.out.println("Sorry we can give up to 50 times your balance \n"
                            + "Please enter a value in valid ranges ");

                } else {
                    System.out.println("Your credit has been defined in your account");
                    balance /= 50;
                    balance += amount_credit;
                    System.out.println("New balance : " + balance);

                }

            } else {
                System.out.println("You chose wrong transaction ");
            }
        }
    }
}
