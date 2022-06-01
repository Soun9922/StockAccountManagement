package stockaccountmanagement;

import java.util.Scanner;

public class StockAccountMain {
    public static void main(String[] args) {
        System.out.println("----Welcome to Stock Account Management Program----");
        StockPortfolio stockPortfolio = new StockPortfolio();
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        while (condition){
            System.out.println("1. Adding \n 2. Display \n 3. Calculate Price of Stocks \n 4. Withdraw money from account \n 5.Exit");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    stockPortfolio.stockAdd();
                    break;
                case 2:
                    stockPortfolio.displayStocks();
                    break;
                case 3:
                    stockPortfolio.calculatePrice();
                    break;
                case 4:
                    stockPortfolio.debit();
                    break;
                case 5:
                    condition = false;
                    System.out.println("Your Program is terminated");
                    break;
                default:
                    System.out.println("Input valid number");
            }
        }

    }
}
