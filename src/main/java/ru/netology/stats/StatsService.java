package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        salesAmount service = new salesAmount();
        long totalSales = service.calculete(sales);
        System.out.println("Сумма всех продаж: __________________________________" + totalSales);

        maxSales service1 = new maxSales();
        long maxSales = service1.calculete(sales);
        System.out.println("Номер месяца, в котором был пик продаж: _______________" + maxSales);

        minSales service2 = new minSales();
        long minSales = service2.calculete(sales);
        System.out.println("Номер месяца, в котором был минимум продаж: ___________" + minSales);

        averageAmountPerMonth service3 = new averageAmountPerMonth();
        long averageAmountPerMonth = service3.calculete( sales);
        System.out.println("Средняя сумма продаж в месяц: ________________________" + averageAmountPerMonth);

        numMonthsAboveAverageSales service4 = new numMonthsAboveAverageSales();
        long numMonthsAboveAverageSales = service4.calculete(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего:__" + numMonthsAboveAverageSales);

        numMonthsSalesBelowAverage service5 = new numMonthsSalesBelowAverage();
        long numMonthsSalesBelowAverage = service5.calculete(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:__" + numMonthsSalesBelowAverage);
    }
}