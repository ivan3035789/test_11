package ru.netology.stats;

public class numMonthsSalesBelowAverage {
    public long numberOfMonthOfSalesBelowAverage(long[] sales) {
        long sum = 0;
        long average = 0;
        long numberOfSales = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        for (long sale : sales) {
            if (sale >= average) {
                numberOfSales += 1;
            }
        }
        return numberOfSales;

    }

}