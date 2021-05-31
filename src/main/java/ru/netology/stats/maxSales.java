package ru.netology.stats;

public class maxSales {
    public long calculete(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        int maxMonth2 = 0;
        int month2 = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
                month += 1;
            }
            if (sale <= sales[maxMonth]) {
                maxMonth2 = month2;
                month2 += 1;
            }
        }
        return maxMonth2 + 1;
    }
}
