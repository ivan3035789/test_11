package ru.netology.stats;

public class salesAmount {
    public long calculete(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
}
