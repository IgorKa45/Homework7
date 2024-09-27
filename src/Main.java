public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        short month = 0;
        int savings = 0;
        while (savings < 2459000) {
            int savingsPercent = (int)(savings * 0.12f); // 12% выраженные в рублях
            month++;
            savings = savings + 15000 + savingsPercent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей.");
        }

        System.out.println("Задание 2");

        byte i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задание 3");

        byte year = 0;
        int population = 12000000;
        int bornOn1000 = 17;
        int deathOn1000 = 8;
        while (year <= 10) {
            year++;
            //Сначала высчитываем прирост населения на 1000 человек, а потом умножаем на 1000 чтобы просто найти прирост
            population = ((population / 1000) + bornOn1000 - deathOn1000) * 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population + ".");
        }

        System.out.println("Задание 4");

        short month2 = 0;
        int savings2 = 0;
        while (savings2 < 12000000) {
            month2++;
            savings2 = (int) (savings2 + 15000 + (savings2 * 0.07f));
            System.out.println("Месяц " + month2 + ", сумма накоплений равна " + savings2 + " рублей.");
        }

        System.out.println("Задание 5");

        short month3 = 0;
        int savings3 = 0;
        while (savings3 < 12000000) {
            month3++;
            savings3 = (int) (savings3 + 15000 + (savings3 * 0.07f));
            if (month3 % 6 == 0) { //Нужен каждый 6ой месяц поэтому мы пишем проверяем делится ли месяц на 6 без остатка
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + savings3 + " рублей.");
            }
        }

        System.out.println("Задание 6");

        short month4 = 0;
        int savings4 = 0;
        // 9 лет = 108 месяцев
        while (month4 < 108) {
            month4++;
            savings4 = (int) (savings4 + 15000 + (savings4 * 0.07f));
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + ", сумма накоплений равна " + savings4 + " рублей.");
            }
        }

        System.out.println("Задание 7");
        //День месяца (В условии не сказано, поэтому предположим что месяц начался с понедельника)
        int days = 0;
        int friday = 5;
        while (days < 31) {
            days++;
            if ((days - friday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + days + "-е число. Необходимо подготовить отчёт.");
            }
        }
        System.out.println("Задание 8");
        int year2 = 0;
        while (year2 < 2124) {
            year2++;
            if (year2 % 79 == 0 && year2 > (2024 - 200)) {
                System.out.println(year2);
            }
        }
    }

}