package stockaccountmanagement;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String stockName;
    private int numberOfShare;
    private int sharePrice;
    private int numberOfStocks;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "stockName='" + stockName + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", numberOfStocks=" + numberOfStocks +
                '}';
    }
}



