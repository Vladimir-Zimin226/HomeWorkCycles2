public class Main {
    public static void main(String[] args) {
        //Task 1
        int contributions = 15_000;
        int needContributions = 2_459_000;
        int totalContributions = 0;
        int month = 0;
        while (totalContributions <= needContributions) {
            totalContributions += totalContributions / 100;
            totalContributions += contributions;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + totalContributions + " рублей");
        }
        System.out.println("Итого, сумма накоплений составила " + totalContributions + " рублей, понадобилось " + month + " месяцев");

        //Task 2
        int start = 10;
        while (start > 0) {
            System.out.print(start + " ");
            start = start - 1;
        }
        System.out.println();
        int finish = 1;
        while (finish <= 10) {
            System.out.print(finish + " ");
            finish = finish + 1;
        }
        System.out.println();

        //Task 3
        int populationsY = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            populationsY += populationsY * (birthRate - mortality) / 1000;
            year++;
            System.out.println("Год " + year + " , численность населения составляет " + populationsY + " человек.");
        }

        //Task 4 and 5
        int totalContribution = 15_000;
        int monthVasilyLife = 0;
        int needContribution = 12_000_000;
        int percentage;
        while (totalContribution <= needContribution) {
            percentage = (totalContribution * 7) / 100;
            totalContribution += percentage;
            monthVasilyLife++;
            if (monthVasilyLife % 6 == 0) {
                System.out.println("Месяц " + monthVasilyLife + " , накопления " + totalContribution + " рублей.");
            }
        }
        System.out.println("Итого, за " + monthVasilyLife + " месяцев Василий накопил " + totalContribution + " рублей.");

        //Task 6
        int vasilyContribution = 15_000;
        int monthLifeVasily = 0;
        int estimatedTime = 9 * 12;
        while (monthLifeVasily <= estimatedTime) {
            percentage = (vasilyContribution * 7) / 100;
            vasilyContribution += percentage;
            monthLifeVasily++;
            if (monthLifeVasily % 6 == 0) {
                System.out.println("За " + monthLifeVasily + " месяцев, Василий накопил " + vasilyContribution + " рублей.");
            }
        }

        /*
        //Task 7 (Мое решение задачи, позволяющее находить реальные пятницы в месяце)
        int day = 1;
        int monthCode = 6; //1 — январь, октябрь; 2 — май; 3 — август; 4 — февраль, март, ноябрь; 5 — июнь; 6 — декабрь, сентябрь; 0 — апрель, июль.
        int yearNow = 2023;
        int yearCode;
        int dayOfWeek;
        while (day < 31) {
            yearCode = (6 + yearNow - 2000 + (yearNow - 2000) / 4) % 7;
            dayOfWeek = (day + monthCode + yearCode) % 7;
            day++;
            {
                if (dayOfWeek == 5) {
                    System.out.println("Сегодня " + day + " -е число, пятница. Пора готовить отчет!");
                }
            }
        }
         */

        //Task 7 (Решение для условного месяца)
        int firstfriday = 1;
        for (int currentFriday = firstfriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница " + currentFriday + " -е число, пятница. Пора готовить отчет!");
        }

        /*
        //Task 8 (Старое решение)
        int yearFlyComet = 1817;
        while (yearFlyComet < 2060) {
            yearFlyComet = yearFlyComet + 79;
            if (yearFlyComet > 1850 && yearFlyComet < 2100) {
                System.out.println("В " + yearFlyComet + " году комета пролетала (-ет).");
            }
         */

        //Task 8 (Новое решение)
        int currentYear = 2023;
        int beggining = currentYear - 200;
        int ending = currentYear + 100;
        for (int flyYear = beggining; flyYear < ending; flyYear++) {
            if (flyYear % 79 == 0) {
                System.out.println("В " + flyYear + " году комета пролетала (-ет).");
            }
        }
    }
}
