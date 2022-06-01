package stockaccountmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    List<Stock> stocks = new ArrayList<>();
    Stock stock = new Stock();

    void stockAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Stock: ");
        stock.setStockName(sc.next());
        System.out.println("Enter number of Stocks: ");
        stock.setNumberOfStocks(sc.nextInt());
        System.out.println("Enter price of share: ");
        stock.setSharePrice(sc.nextInt());
        System.out.println(stock.toString());
        stocks.add(stock);
    }

    void calculatePrice() {
        Scanner sc = new Scanner(System.in);
        Iterator<Stock> stockPortfolioIterator = stocks.listIterator();
        System.out.println("Enter the Stock Name: ");
        while (stockPortfolioIterator.hasNext()) {
            Stock stockPortfolioCalculate = stockPortfolioIterator.next();
            System.out.println("Enter number of shares you own: ");
            stock.setNumberOfShare(sc.nextInt());
            {
                int valueOfEachStock = stock.getSharePrice() * stock.getNumberOfShare();
                int totalValueOfStock = valueOfEachStock * stock.getNumberOfShare();
                System.out.println("-----------------------------------------");
                System.out.println("Value of each stock: " + valueOfEachStock);
                System.out.println("Total Value of Stocks: " + totalValueOfStock);
            }
        }
    }

    void debit() {
        int valueOfEachStock = stock.getSharePrice() * stock.getNumberOfShare();
        int totalValueOfStock = valueOfEachStock * stock.getNumberOfShare();
        int accountBalance = totalValueOfStock;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw: ");
        int amountWithdrawn = sc.nextInt();
        if (amountWithdrawn < accountBalance) {
            accountBalance = accountBalance - amountWithdrawn;
            System.out.println("You have withdrawn: " + accountBalance);
        } else
            System.out.println("Debit amount exceeded account balance.");
    }

    void displayStocks() {
        System.out.println(stocks);
    }
}
