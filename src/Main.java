public class Main {
    public static void main(String[] args) {
        //Задание 1
        int cash = 29000;
        int totalSum = 0;
        for (int i = 0; totalSum <= 2_459_000; i++) {
            totalSum += totalSum / 100; // + 1%
            totalSum += cash;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
        }

        // Задание 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
        int n = 1;
        while (n < 11) {
            System.out.print(" " + n);
            n++;
        }


        //Задание 3
        System.out.println(" Задача 3");
        double fullCount = 12000000;
        int i = 0;
        int birthRate = 1000 / 17;
        int mortality = 1000 / 8;
        while (i <= 9) {
            fullCount = fullCount + (fullCount / birthRate) - (fullCount / mortality);
            i++;
            System.out.printf("Год" + i + " численность населения составлняет:  %.0f человек\n", fullCount);
        }

        //Задание 1.2
        System.out.println("Задача 1.2");

        int purpose = 12000000;
        double k = 0.07;
        int contribution = 15000;
        double account = 0;
        double accumulatedProfit = 0;
        int monthCount = 0;
        account = account + contribution;
        while (account <= 12000000) {
            monthCount++;
            account = account + (account * k);
            accumulatedProfit = account - contribution;
            System.out.printf("Баланс Василия на конец " + monthCount + " месяца  %.2f рублей\n", account);
        }
        System.out.printf("\nПо истечению " + monthCount + " месяцев Василию удалось накопить %.2f рублей ", account);


        //Задание 2.2
        System.out.println("Задание 2.2");
        int reportPeriod = 6;
        int purpose1 = 12000000;
        double k1 = 0.07;
        int contribution1 = 15000;
        double account1 = 0;
        double accumulatedProfit1 = 0;
        int monthCount1 = 0;
        account1 = account1 + contribution1;
        while (account1 <= 12000000) {
            monthCount1++;
            account1 = account1 + (account1 * k1);
            accumulatedProfit1 = account1 - contribution1;
            if (monthCount1 % reportPeriod == 0) {
                System.out.printf("Баланс Василия на конец " + monthCount1 + "  %.2f рублей\n", account1);
            }
        }
        System.out.printf("\nПо истечению " + monthCount1 +
                " месяцев \nВасилию удалось накопить %.2f рублей ", account1);


        // Задание 2.3
        System.out.println("Задание 2.3");
        int reportPeriod2 = 6;
        int purpose2 = 12*9;
        double k2 = 0.07;
        int contribution2 = 15000;
        double account2 = 0;
        double accumulatedProfit2 = 0;
        int monthCount2 = 0;
        account2 = account2 + contribution2;
        while (monthCount2 <  purpose2) {
            monthCount2++;
            account2 = account2 + (account2 * k2);
            accumulatedProfit2 = account2 - contribution2;
            if (monthCount2 % reportPeriod2 == 0) {
                System.out.printf("Баланс Василия на конец " + monthCount2 + " месяца   %.2f рублей\n", account2);
            }
        }
        System.out.printf("\nПо истечению " + monthCount2 +
                " месяцев  %.2f рублей ", account2);

        // Задание 2.4
        System.out.println( "Задача 2.4");
        // Задание 2.4
        System.out.println("Задание 2.4");
        int month1 = 0;
        for (int d = 7; d <= 31; d = d + 7) {
            if (month1 % 7 == 0)
                System.out.println("Сегодня пятница" + " " + d + " " + "число. Необходимо сдать отчет");}

        //Задание 2.5
        System.out.println( "Задача 2.5");
        for(int year1 = 2022-200;year1<2022+100;year1 = year1+79){
            if(year1 % 79 ==0){
                System.out.println( year1 ); }// не распечатывается в консоль
        }

        //Задание 2.6
        System.out.println("Задача 2.6");
        for(int m=1;m<=10;m++){
            for(int j=2;j<3;j++){

                System.out.print(j+"*"+m+"="+(m*j));
            }
            System.out.println();

        }
    }

}



