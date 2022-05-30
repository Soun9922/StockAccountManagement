package stockaccountmanagement;

public class StockPortfolio {
    private String stockName;
    private int numberOfShare;
    private int sharePrice;
    private int numberOfStocks;

    public String getStockName() {
        return stockName;
    }

    public String setStockName(String stockName) {
        this.stockName = stockName;
        return stockName;
    }

    public int getNumberOfShares() {
        return numberOfShare;
    }

    public int setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
        return numberOfShare;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public int setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
        return numberOfStocks;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public int setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
        return sharePrice;
    }
}
