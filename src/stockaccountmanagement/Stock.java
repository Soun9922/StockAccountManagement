package stockaccountmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Stock {
    List<StockPortfolio> stocks = new ArrayList<>();
    StockPortfolio stockPortfolio = new StockPortfolio();

    void stockCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Stock: ");
        String stockName = stockPortfolio.setStockName(sc.next());
        System.out.println("Enter number of Stocks: ");
        int numberOfStocks = stockPortfolio.setNumberOfStocks(sc.nextInt());
        System.out.println("Enter number of shares: ");
        int numberOfShares = stockPortfolio.setNumberOfShare(sc.nextInt());
        System.out.println("Enter price of share: ");
        System.out.println("Name of the Stock: " + stockPortfolio.getStockName() + "Number of stocks: " + stockPortfolio.getNumberOfStocks() + "Number of Share: " + stockPortfolio.getNumberOfShares() + "Share Price: " + stockPortfolio.getSharePrice());
        stocks.add(stockPortfolio);
        int sharePrice = stockPortfolio.setSharePrice(sc.nextInt());
        Iterator<StockPortfolio> stockPortfolioIterator = stocks.listIterator();
        while (stockPortfolioIterator.hasNext()) {
            StockPortfolio stockPortfolioCalculate = stockPortfolioIterator.next();
            if (stockName.equals(stockPortfolioCalculate.getStockName())) {
                int valueOfEachStock = sharePrice / numberOfStocks;
                int totalValueOfStock = sharePrice * numberOfShares;
                System.out.println("-----------------------------------------");
                System.out.println("Value of each stock: " + valueOfEachStock);
                System.out.println("Total Value of Stocks: " + totalValueOfStock);
            }
        }
    }
}
