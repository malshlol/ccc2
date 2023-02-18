public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 11");
        int contribution = 15000;
        int total = 0;
        int ss = 2459000;
        int mon = 1;
        while (total < 2459000) {
            total = total + contribution;
            {
                System.out.println("Месяц " + mon + ", сумма накоплений равна " + total + "рублей");
                mon++;
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        {
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12000000;
        int year = 0;
        int birth = 17;
        int death = 8;
        while (year < 10) {
            year++;
            people = people / 1000 * (birth - death) + people;
            System.out.println("Год " + year + " численность населения составляет " + people);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int ww = 12000000;
        int total = 15000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < ww) {
            total = total + (int) (total * percent);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + "рублей");
            month++;
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int ww = 12000000;
        int total = 15000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < ww) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + "рублей");
            }
            month++;

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int year = 9;
        int month = 1;
        int monthYear = 9 * month * 12;
        int total = 15000;
        double percent = 7 / 100D;
        for (month = 1; month < monthYear; month++) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + "рублей");
            }

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fFriday = 3;
        for (int friday = fFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число" + " Необходимо подготовить отчет");

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cYear = 2023;
        int start = cYear - 200;
        int end = cYear + 100;
        int period = 79;
        int startPeriod = 0;
        for (int year = startPeriod; year <= end; year++) {
            if (year % 79 == 0 && year >= start) {
                System.out.println(year);
            }
        }
    }
}