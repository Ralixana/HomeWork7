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
        System.out.println("Task 1");

        int cost = 15000;
        int all = 2459000;
        int i = 0;
        int moneySave = 0;
        while (moneySave < all) {
            i = i +1;
            moneySave = i * cost;
            System.out.println("Месяц " + i + " сумма накоплений равна " + moneySave + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (int j = 10; j > 0; j--) {
            System.out.print(" " + j);
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int born = 17;
        int died = 8;
        for (int year = 1; year < 10; year++) {
            Y += Y * (born - died) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + Y + " человек");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        double money = 15000;
        int i = 0;
        double bankPercent = 0.07;
        int all = 12_000_000;
        while (money < all) {
            i = i +1;
            money = money + money * bankPercent;
            System.out.println("Сумма " + money + ", количество месяцев " + i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double money = 15000;
        double bankPercent = 0.07;
        int all = 12_000_000;
        int period = 6;
        for (int i = 0; money < all; i++) {
            money = money + money * bankPercent;
            if (i % period == 0) {
                System.out.println("Сумма " + money + ", количество месяцев " + i);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        double money = 15000;
        int period = 6;
        int years = 9;
        int allMonth = years * 12;
        double bankPercent = 0.07;
        for (int i = 0; i <= allMonth; i++) {
            money = money + money * bankPercent;
            if (i % period == 0) {
                System.out.println("Сумма " + money + ", количество месяцев " + i);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int fr = 1; fr < 31; fr += 7) {
            System.out.println("Сегодня пятница " + fr + " необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        for (int i = 0; i < currentYear + 100; i = i + 79) {
            if (i > currentYear - 200) {
                System.out.println(i);
            }
        }
    }
}