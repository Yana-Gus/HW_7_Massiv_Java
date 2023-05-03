package ru.netology.stats;

public class StatsService {
    public long getSummaSale(long[] sales) {
        long salesAmount = 0;
        for (long sale : sales) {
            salesAmount = salesAmount + sale;
        }
        return salesAmount;
    }

    public long averageSumma(long[] sales) {
        long salesAmount = getSummaSale(sales);
        return salesAmount / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int calculateMonthsBelowAverage(long[] sales) {
        int count = 0;
        long averageSale = averageSumma(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int calculateMonthsHigherAverage(long[] sales) {
        int count = 0;
        long averageSale = averageSumma(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}
