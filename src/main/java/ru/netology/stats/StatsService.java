package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }

        return minMonth + 1;
    }

    public int sumCalculate(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int count = 0;
        int average = 0;
        for (int sale : sales) {
            count += 1;
        }
        average = sumCalculate(sales) / count;
        return average;
    }

    public int maxSale(int[] sales) {
        int theBiggestSale = 0;
        int month = 0;
        int maxMonth = 0;
        for (int sale : sales) {
            if (sale >= theBiggestSale) {
                theBiggestSale = sale;

                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int countMonthSaleLessThenAverage(int[] sales) {

        int countMonth = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                countMonth = countMonth + 1;
            }


        }
        return countMonth;
    }

    public int countMonthSaleMoreAverage(int[] sales) {

        int countMonth = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

}


