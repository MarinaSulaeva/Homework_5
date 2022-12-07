public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
        public static void task1 () {
            char clientIOS = 0;
            System.out.println("Задание №1");
            if (clientIOS == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        public static void task2 () {
            System.out.println("Задание №2");
            char clientIOS = 0;
            char clientDeviceYear = 2015;
            if (clientIOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            else if (clientIOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else if (clientIOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }
        public static void task3 () {
            System.out.println("Задание №3");
            int year = 2021;
            if  (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
            else if (year % 100 == 0 ) {
                System.out.println(year + " год не является високосным");
        }
            else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            }
            else {
                System.out.println(year + " год не является високосным");
            }

        }
        public static void task4 () {
            System.out.println("Задание №4");
            int deliveryDistance = 95;
            int daysOfDelivery = 1;
            if (deliveryDistance <= 20){
                System.out.println("На доставку потребуется "+daysOfDelivery + " день");
            }
            else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                daysOfDelivery = daysOfDelivery +1 ;
                System.out.println("На доставку потребуется "+daysOfDelivery + " дня");
            }
            else if (deliveryDistance >60 && deliveryDistance <= 100) {
                daysOfDelivery = daysOfDelivery + 2;
                System.out.println("На доставку потребуется "+daysOfDelivery + " дня");
            }
            else {
                System.out.println("В данную местность доставки нет");
            }
        }
        public static void task5 () {
            System.out.println("Задание №5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");

            }

        }

}