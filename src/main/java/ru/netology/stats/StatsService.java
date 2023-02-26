package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;

        }
        return result;
    }

    public long average(long[] sales) {
        long result = sum(sales);

        return result / sales.length;
    }

    public int maximumSale(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month +=1;
        }
        return maxMonth +1;
    }
    public int minimumSale(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month +=1;
        }
        return minMonth +1;
    }
    public int countMonthMinSales(long[] sales) {
        long averageSale = average(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                countMonth += 1;

            }
        }
        return countMonth;
    }
    public int countMonthMaxSales(long[] sales) {
        long averageSale = average(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                countMonth += 1;

            }
        }
        return countMonth;
    }
}
