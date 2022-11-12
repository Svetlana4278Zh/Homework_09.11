public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        byte peremByte = 10;
        short peremShort = 10000;
        int peremInt = 1000000;
        long peremLong = 10_000_000_000L;
        float peremFloat = 0.1F;
        double peremDouble = 0.12345678;
        System.out.println("Значение переменной peremByte c типом byte равно " + peremByte);
        System.out.println("Значение переменной peremShort c типом short равно " + peremShort);
        System.out.println("Значение переменной peremInt c типом int равно " + peremInt);
        System.out.println("Значение переменной peremLong c типом long равно " + peremLong);
        System.out.println("Значение переменной peremFloat c типом float равно " + peremFloat);
        System.out.println("Значение переменной peremDouble c типом double равно " + peremDouble);

        //Задача 2
        System.out.println(" ");
        System.out.println("Задача 2");
        float x1 = 27.12F;
        long x2 = 987678965549L;
        double x3 = 2.786;
        boolean x4 = false;
        char x5 = 569;
        short x6 = -159;
        int x7 = 27897;
        byte x8= 67;
        System.out.println(x1+", "+x2+", "+x3+", "+x4+", "+x5+", "+x6+", "+x7+", "+x8);

        //Задача 3
        System.out.println(" ");
        System.out.println("Задача 3");
        int studentInFirstClass = 23;
        int studentInSecondClass = 27;
        int studentInThirdClass = 30;
        int totalStudent = studentInFirstClass + studentInSecondClass + studentInThirdClass;
        int paper = 480;
        int paperForStudent = paper/totalStudent;
        System.out.println("На каждого ученика рассчитано "+paperForStudent+" листов бумаги");

        //Задача 4
        System.out.println(" ");
        System.out.println("Задача 4");
        int productivityPerMinute = 16/2;
        int twentyMinutes = 20;
        System.out.println("За 20 минут машина произвела бутылок "+productivityPerMinute*twentyMinutes+" штук ");
        int minutesInDay = 60*24;
        System.out.println("За сутки машина произвела бутылок "+productivityPerMinute*minutesInDay+" штук ");
        int minutesInTreeDays = 3*minutesInDay;
        System.out.println("За три дня машина произвела бутылок "+productivityPerMinute*minutesInTreeDays+" штук ");
        int minutesInMonth = 30*minutesInDay;
        System.out.println("За 1 месяц машина произвела бутылок "+productivityPerMinute*minutesInMonth+" штук ");

        //Задача 5
        System.out.println(" ");
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;
        int numberClass = totalCans/cansPerClass;
        int whiteCans = numberClass*whiteCansPerClass;
        int brownCans = numberClass*brownCansPerClass;
        System.out.println("В школе, где "+numberClass+" классов, нужно "+whiteCans+" банок белой краски и "+brownCans+" банок коричневой краски");

        //Задача 6
        System.out.println(" ");
        System.out.println("Задача 6");
        float bananaWeight = 80F;      // грамм
        float milk100mlWeight = 105F;  // грамм
        float iceCreamWeight = 100F;   // грамм
        float eggWeight = 70F;         // грамм
        int bananas = 5;
        int milk100ml = 2;
        int iceCream = 2;
        int eggs = 4;
        float totalWeight = (bananaWeight*bananas+iceCreamWeight*iceCream+milk100mlWeight*milk100ml+eggWeight*eggs)/1000;
        System.out.println("Вес такого спорт-завтрака "+totalWeight+" кг");

        //Задача 7
        System.out.println(" ");
        System.out.println("Задача 7");
        float loseWeight = 7000F;           // грамм нужно сбросить
        float lose1PerDay = 250F;           // количество грамм, которое сбрасывается в день, вариант 1
        float lose2PerDay = 500F;           // количество грамм, которое сбрасывается в день, вариант 2
        float days1 = loseWeight/lose1PerDay;
        System.out.println("Eсли в день терять "+lose1PerDay+" грамм, то потребуется "+days1+" дней");
        float days2 = loseWeight/lose2PerDay;
        System.out.println("Eсли в день терять "+lose2PerDay+" грамм, то потребуется "+days2+" дней");
        float averageDays = (days1+days2)/2;
        System.out.println("В среднем для похудения может потребоваться "+averageDays+" дней");

        //Задача 8
        System.out.println(" ");
        System.out.println("Задача 8");
        int salaryMasha = 67760;        //руб. в месяц
        int salaryDenis = 83690;        //руб. в месяц
        int salaryKristina = 76230;     //руб. в месяц
        int oldAnnualIncomeMasha = 12*salaryMasha;      //руб. в год
        int oldAnnualIncomeDenis = 12*salaryDenis;      //руб. в год
        int oldAnnualIncomeKristina = 12*salaryKristina;//руб. в год
        salaryMasha+=salaryMasha/10;
        salaryDenis+=salaryDenis/10;
        salaryKristina+=salaryKristina/10;
        int newAnnualIncomeMasha = 12*salaryMasha;      //руб. в год
        int newAnnualIncomeDenis = 12*salaryDenis;      //руб. в год
        int newAnnualIncomeKristina = 12*salaryKristina;//руб. в год
        System.out.println("Маша теперь получает "+salaryMasha+" рублей. Годовой доход вырос на "+(newAnnualIncomeMasha-oldAnnualIncomeMasha)+" рублей.");
        System.out.println("Маша теперь получает "+salaryDenis+" рублей. Годовой доход вырос на "+(newAnnualIncomeDenis-oldAnnualIncomeDenis)+" рублей.");
        System.out.println("Маша теперь получает "+salaryKristina+" рублей. Годовой доход вырос на "+(newAnnualIncomeKristina-oldAnnualIncomeKristina)+" рублей.");
    }
}