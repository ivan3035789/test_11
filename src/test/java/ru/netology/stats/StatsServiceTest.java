package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void TotalSalesAmount() {
        salesAmount service = new salesAmount();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.salesAmount(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void AverageAmountSalesPerMonth() {
        averageAmountPerMonth service = new averageAmountPerMonth();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageAmountPerMonth(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void NumMonthWhichWasAMinSales() {
        minSales service = new minSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void NumMonthWhichSalesPeakOccurred() {
        maxSales service = new maxSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void NumMonthsWhichSalesBelowAverage() {
        numMonthsSalesBelowAverage service = new numMonthsSalesBelowAverage();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.numberOfMonthOfSalesBelowAverage(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void NumMonthsWhichSalesAboveAverage() {
        numMonthsAboveAverageSales service = new numMonthsAboveAverageSales();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberOfMonthsOfAboveAverageSales(sales);
        assertEquals(expected, actual);

    }
}

