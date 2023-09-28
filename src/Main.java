public class Main {
    public static void main(String[] args) {
        //Task 1
        int contributions = 15_000;
        int totalContributions = 0;
        int month = 0;
        while (totalContributions <= 2_459_000) {
            totalContributions = totalContributions + totalContributions / 100;
            totalContributions = totalContributions + contributions;
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
            populationsY = populationsY + (birthRate - mortality) * 1000;
            year = year + 1;
            System.out.println("Год " + year + " , численность населения составляет " + populationsY + " человек.");
        }

        //Task 4 and 5
        int totalContribution = 15_000;
        int monthVasilyLife = 0;
        while (totalContribution <= 12_000_000) {
            totalContribution = totalContribution + ((totalContribution * 7) / 100);
            monthVasilyLife = monthVasilyLife + 1;
            if (monthVasilyLife % 6 == 0) {
                System.out.println("Месяц " + monthVasilyLife + " , накопления " + totalContribution + " рублей.");
            }
        }
        System.out.println("Итого, за " + monthVasilyLife + " месяцев Василий накопил " + totalContribution + " рублей.");

        //Task 6
        int vasilyContribution = 15_000;
        int monthLifeVasily = 0;
        while (monthLifeVasily <= 9 * 12) {
            vasilyContribution = vasilyContribution + ((vasilyContribution * 7) / 100);
            monthLifeVasily = monthLifeVasily + 1;
            if (monthLifeVasily % 6 == 0) {
                System.out.println("За " + monthLifeVasily + " месяцев, Василий накопил " + vasilyContribution + " рублей.");
            }
        }

        //Task 7
        int day = 1;
        int monthCode = 6; //1 — январь, октябрь; 2 — май; 3 — август; 4 — февраль, март, ноябрь; 5 — июнь; 6 — декабрь, сентябрь; 0 — апрель, июль.
        int yearNow = 2023;
        int yearCode;
        int dayOfWeek;
        while (day < 31) {
            yearCode = (6 + yearNow - 2000 + (yearNow - 2000) / 4) % 7;
            dayOfWeek = (day + monthCode + yearCode) % 7;
            day = day + 1;
            {
                if (dayOfWeek == 5) {
                    System.out.println("Сегодня " + day + " -е число, пятница. Пора готовить отчет!");
                }
            }
        }

        //Task 8
        int yearFlyComet = 1817;
        while (yearFlyComet < 2060) {
            yearFlyComet = yearFlyComet + 79;
            if (yearFlyComet > 1850 && yearFlyComet < 2100) {
                System.out.println("В " + yearFlyComet + " году комета пролетала (-ет).");
            }
        }
    }
}
