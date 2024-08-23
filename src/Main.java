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
        int controlTime2Minutes = 16; // за 2 минуты
        System.out.println("За 2 минуты машина произвела " + controlTime2Minutes + " штук бутылок.");
        int controlTime20Minutes = controlTime2Minutes * 10; // за 20 минут
        System.out.println("За 20 минуты машина произвела " + controlTime20Minutes + " штук бутылок.");
        int controlTimeDay = controlTime20Minutes * 72; // за 24 часа.
        System.out.println("За сутки машина произвела " + controlTimeDay + " штук бутылок.");
        int controlTime3Day = controlTimeDay * 3; // за 3 дня
        System.out.println("За 3 дня машина произвела " + controlTime3Day + " штук бутылок.");
        int controlTime30Day = controlTime3Day * 10; // за 30 дней
        System.out.println("За месяц машина произвела " + controlTime30Day + " штук бутылок.");

        // Задача №5
        byte totalCans = 120;
        int totalClasses = totalCans / 6;
        int whitePaint = totalClasses *2;
        int brownPaint = totalClasses *4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint
                + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        // Задача №6
        byte banana = 5; // была, ошибка в колличестве бананов.
        short milk = 200;
        byte iceCream =2;
        byte egg = 4;
        int weightBanana = banana * 80; // вес 2 бананов
        int weightMilk = milk / 100 * 105; // вес 200 ( 2 по 100 мг.) милилитров молока
        int weightIceCream = iceCream * 100; // вес 2 мороженого
        int weightEgg = egg * 70; // вес 4 яиц.
        int totalWweightice = weightBanana + weightMilk + weightIceCream + weightEgg;
        float totalWweighticeGram = (float) totalWweightice;
        float totalWweighticeKilogram = totalWweighticeGram / 1000;
        System.out.println("Вес спорзавтрака равен " + totalWweightice + " грамм, или "
                + totalWweighticeKilogram + " килограмм.");

        // Задача №7
        int days250Grams = 7 * 1000 / 250;
        int days500Grams = 7 * 1000 / 500;
        int averageDays = (days250Grams + days500Grams) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то похудеет на 7 кг за "
                + days250Grams + " дней, а если на 500 грамм , то за " + days500Grams + " дней. Среднее же количество "
                + averageDays + " день");

        // Задача №8
        int masha = 67760; // Зарплата до повышения
        int denis = 83690;
        int christina = 76230;
        int mashaIncrease = (int) (masha * 1.1); // Добавляем по 10%
        int denisIncrease = (int) (denis * 1.1);
        int christinaIncrease = (int) (christina * 1.1);
        int yearMasha = mashaIncrease * 12 - masha * 12; // Вычесляе разницу годовых доходов
        int yearDenis = denisIncrease * 12 - denis * 12;
        int yearChristina = christinaIncrease * 12 - christina * 12;
        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. Годовой доход вырос на "
                + yearMasha + " рублей");
        System.out.println("Денис теперь получает " + denisIncrease + " рублей. Годовой доход вырос на "
                + yearDenis + " рублей");
        System.out.println("Кристина теперь получает " + christinaIncrease + " рублей. Годовой доход вырос на "
                + yearChristina + " рублей");
    }
}