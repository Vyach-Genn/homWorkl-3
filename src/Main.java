public class Main {
    public static void main(String[] args) {

        // Задача №1
        int a = 300000000;
        byte b = 54;
        short c = 2000;
        long d = 4000000000000000000L;
        float z = 2.2f;
        double x = 2.1111111111;
        System.out.println("Значение переменной 'a' с типом 'int' равно " + a);
        System.out.println("Значение переменной 'b' с типом 'byte' равно " + b);
        System.out.println("Значение переменной 'c' с типом 'short' равно " + c);
        System.out.println("Значение переменной 'd' с типом 'long' равно " + d);
        System.out.println("Значение переменной 'z' с типом 'float' равно " + z);
        System.out.println("Значение переменной 'x' с типом 'double' равно " + x);

        // Задача №2
        float a2 =  27.12f;
        long b2 = 987678965549L;
        float c2 = 2.786f;
        short d2 = 569;
        short z2 = -159;
        short x2 = 27897;
        byte q2 = 67;

        //Задача №3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalSheets = 480;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int eachSheets = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + eachSheets + " листов бумаги.");

        // Задача №4
        int controlTime = 16;
        System.out.println("За 2 минуты машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 10;
        System.out.println("За 20 минуты машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 72;
        System.out.println("За сутки машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 3;
        System.out.println("За 3 дня машина произвела " + controlTime + " штук бутылок.");
        controlTime = controlTime * 10;
        System.out.println("За месяц машина произвела " + controlTime + " штук бутылок.");

        // Задача №5
        byte totalCans = 120;
        int totalClasses = totalCans / 6;
        int whitePaint = totalClasses *2;
        int brownPaint = totalClasses *4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint
                + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        // Задача №6
        byte banana = 2;
        short milk = 200;
        byte iceCream =2;
        byte egg = 4;
        int weightBanana = banana * 80;
        int weightMilk = milk / 100 * 105;
        int weightIceCream = iceCream * 100;
        int weightEgg = egg * 70;
        int totalWweightice = weightBanana + weightMilk + weightIceCream + weightEgg;
        float totalWweighticeGram = (float) totalWweightice;
        float totalWweighticeKilogram = totalWweighticeGram / 1000;
        System.out.println("Вес спорзавтрака равен " + totalWweightice + " грамм, или "
                + totalWweighticeKilogram + " килограмм.");

        // Задача №7
        int twoHundredFifty = 7 * 1000 / 250;
        int fiveHundred = 7 * 1000 / 500;
        int averageDays = (twoHundredFifty + fiveHundred) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то похудеет на 7 кг за "
                + twoHundredFifty + " дней, а если на 500 грамм , то за " + fiveHundred + " дней. Среднее же количество "
                + averageDays + " день");

        // Задача №8
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        double mashaIncrease = masha + masha * 0.1;
        double denisIncrease = denis + denis * 0.1;
        double christinaIncrease = christina + christina * 0.1;
        double yearMasha = mashaIncrease * 12 - masha * 12;
        double yearDenis = denisIncrease * 12 - denis * 12;
        double yearChristina = christinaIncrease * 12 - christina * 12;
        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. Годовой доход вырос на "
                + yearMasha + " рублей");
        System.out.println("Денис теперь получает " + denisIncrease + " рублей. Годовой доход вырос на "
                + yearDenis + " рублей");
        System.out.println("Кристина теперь получает " + christinaIncrease + " рублей. Годовой доход вырос на "
                + yearChristina + " рублей");
    }
}