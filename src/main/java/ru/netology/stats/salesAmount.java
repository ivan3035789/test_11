package ru.netology.stats;

public class salesAmount {
    public long salesAmount(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
}
