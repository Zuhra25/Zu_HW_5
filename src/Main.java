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

        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
        //
        //Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        //Для Android: «Установите облегченную версию приложения для Android по ссылке».
        //Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
        //
        //Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
        int clientDeviceYear = 2015;
        int clientOS = 1;
        int clientDevice = 2020;

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

    }

    public static void task4() {
        System.out.println("Задача 4");

    }

    public static void task5() {
        System.out.println("Задача 5");

    }


}