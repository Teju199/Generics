package OOPSPracticeProblems;

import java.util.Scanner;

public class Stock {
    private String companyName;
    private String stockRating;
    private int price;
    private int numberOfShares;

    private static final int INVENTORY_SIZE = 12;
    private static Stock[] stocks;

    public Stock(String companyName, String stockRating, int stockPrice, int numberShares) {
        this.companyName = companyName;
        this.stockRating = stockRating;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }

    public Stock() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public String getStockRating() {
        return stockRating;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void StockInvetory() {
        stocks = new Stock[INVENTORY_SIZE];
    }

    private static void stockInventory() {
        for (int i = 0; i < INVENTORY_SIZE; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Stock's name:");
            String stockName = sc.next();

            System.out.println("Stock's rating");
            String stockRating = sc.next();

            System.out.println("Stock's price:");
            int stockPrice = sc.nextInt();

            System.out.println("Numbers of shares: ");
            int numberShares = sc.nextInt();

            stocks[i] = new Stock(stockName, stockRating, stockPrice, numberShares);
        }

    }

    public static void main(String[] args) {
        stockInventory();
    }
}