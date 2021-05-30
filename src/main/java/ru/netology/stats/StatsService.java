package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        maxSales service = new maxSales();
        long actual = service.maxSales(sales);
        System.out.println(actual);
    }
}
