package entities;

import calculator.MathOperations;

public class Stock {

    private String productName;
    private int stockMin;
    private int stockMax;

    public Stock() {
        super();
    }

    public Stock(String productName) {
        this.productName = productName;
    }

    public Stock(String productName, int storageMin, int storageMax) {
        this.productName = productName;
        this.stockMin = storageMin;
        this.stockMax = storageMax;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    public static double averageStock(double a, double b) {
        return MathOperations.averageOfTwo(a, b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product Name: ").append(productName).append("\n").append("Stock Min: ")
                .append(stockMin).append("\n").append("Stock Max: ").append(stockMax);
        return sb.toString();
    }
}
