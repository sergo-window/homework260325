public class Main {
    public static String calculateLeapYear(int year) {
        if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
            return year + " год - високосный год";
        } else {
            return year + " год - невисокосный год";
        }
    }

    public static void offerAppVersion(byte clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static String calculateDeliveryDays(int distance) {
        int deliveryDays = 1;
        int result;
        if (distance <= 0) {
            return "Введите корректное расстояние";
        }
        if (distance <= 20) {
            result = deliveryDays;
        } else if (distance <= 60) {
            result = deliveryDays + 1;
        } else if (distance <= 100) {
            result = deliveryDays + 2;
        } else {
            return "Доставки нет";
        }
        return "Потребуется " + result + (result == 1 ? " день" : " дня");
    }


    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2025;
        System.out.println(calculateLeapYear(year));
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2010;
        offerAppVersion(clientOS, clientDeviceYear);
        System.out.println("Задача 3");
        int distance = 75;
        System.out.println(calculateDeliveryDays(distance));
    }
}