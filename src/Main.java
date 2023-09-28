public class Main {
    public static void main(String[] args) {
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " итого " + total);
            }
        }
        System.out.println(total);

        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }

        int days = 10; // изначальное количество дней в Париже

        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            while (days > 0) {
                days = days - 1;
                System.out.println("До конца поездки осталось " + days + " дней.");
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }

        int fight = 5;
        do {System.out.println (fight);
            fight = fight - 1;
        }
        while (fight > 0);

        int x = 8;
        do {
            System.out.println(x);
            i++;
        } while (x < 7);

        // Объявляем переменную dayNumber, она равна номеру дня в месяце
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            // Каждый день проверяем, является ли он третьим (выходным)
            if (dayNumber % 3 == 0) {
                // Выводим сообщение
                System.out.println("Сегодня отдыхаем!");
                // Ждем следующий день
                continue;
            }
            System.out.println("Сегодня рабочий день");
            // Если день не выходной, выводим сообщение
        }
    }
}