public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите ОС: iOS или Android");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOS = 1;
        int clientDevice = 2000;

        switch (clientOS) {
            case 0:
                if (clientDevice <= clientDeviceYear) {
                    System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для iOS по ссылке");
                    break;
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            case 1:
                if (clientDevice <= clientDeviceYear) {
                    System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для Android по ссылке");
                    break;
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2100;
        boolean leapYear = false;

        if (year % 4 == 0 && year % 400 == 0)
        leapYear = true;
        else if (year % 100 == 0) {
            leapYear = false;
        }
        else leapYear = false;

        if (leapYear)
        System.out.println(year + " год является високосным");
        else
        System.out.println(year + " год НЕ является високосным");
    }

    public static void task4() {
        System.out.println("Задача 4");

        int deliveryDistance = 195;
        int deliveryDay = 1;

        if (deliveryDistance <= 20) {
            deliveryDay = deliveryDay + 0;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else System.out.println("Свыше 100 км доставки нет.");
    }

    public static void task5() {
        System.out.println("Задача 5");

        int monthNumber = 13;
        switch (monthNumber){
            case 12: case 1: case 2:
                System.out.println("Сейчас зима");
            break;
            case 3: case 4: case 5:
                System.out.println("Сейчас весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Сейчас лето");
                break;
            case 9: case 10: case 118:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }


    }


}