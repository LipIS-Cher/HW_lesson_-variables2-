public class Main {
    public static void main(String[] args) {
        //zadanie 1
        int first = 1;
        System.out.println("Значение переменной first с типом int равно " + first);
        byte second = 2;
        System.out.println("Значение переменной second с типом byte равно " + second);
        short third = 3;
        System.out.println("Значение переменной third с типом short равно " + third);
        long fourth = 4;
        System.out.println("Значение переменной fourth с типом long равно " + fourth);
        float fifth = 5.0F;
        System.out.println("Значение переменной fifth с типом float равно " + fifth);
        double sixth = 6.0F;
        System.out.println("Значение переменной sixth с типом double равно " + sixth);

        System.out.println(" ");

        //zadanie 2
        double onePath = 27.12;
        long twoPath = 987678965549l;
        float threePath = 2.786f;
        boolean fourPath = false;
        char fivePath = 569;
        short sixPath = -159;
        int sevenPath = 27897;
        byte eightPath = 67;


        //zadanie 3
        int oneClassPeople = 23;
        int twoClassPeople = 27;
        int threeClassPeople = 30;

        int paperListAll = 480;

        int paperEveryPeople = paperListAll / (oneClassPeople + twoClassPeople + threeClassPeople);
        System.out.println("На каждого ученика рассчитано " + paperEveryPeople + " листов бумаги");

        System.out.println(" ");

        //zadanie 4
        int bottleForOneMin = 8; //за одну миннуту 8 бут
        System.out.println("За 20 минут машины произвела бутылок " + bottleForOneMin * 20);
        System.out.println("За сутки машины произвела бутылок " + bottleForOneMin * 1440);
        System.out.println("За 3 суток машины произвела бутылок " + bottleForOneMin * 4320);
        System.out.println("За месяц машины произвела бутылок " + bottleForOneMin * 43200);

        System.out.println(" ");

        //zadanie 5
        byte allBottle = 120;
        byte bottleForOneClass = 6;
        byte countClass = (byte) (allBottle / bottleForOneClass);
        System.out.println("В школе, где " + countClass + " классов, нужно " + countClass * 2 + " банок белой краски и " + countClass * 4 + " банок коричневой краски.");

        System.out.println(" ");

        //zadanie 6
        short oneBanan = 80;
        byte amountBanans = 5;
        short oneMilk = 105;
        byte amountMilks = 2;
        short oneIceCream = 100;
        byte amountIceCreams = 2;
        short oneEgg = 70;
        byte amountEggs = 4;

        double allCalories = (oneBanan * amountBanans) + (oneMilk * amountMilks) + (oneIceCream * amountIceCreams) + (oneEgg * amountEggs);
        System.out.println("Всего каллорий " + allCalories + " в граммах, и " + allCalories / 1000 + " в киллограммах.");

        System.out.println(" ");

        //zadanie 7
        short allCalories_7 = 7000;
        short inDay250 = (short) (allCalories_7 / 250);
        short inDay500 = (short) (allCalories_7 / 500);
        System.out.println("Потребуется " + inDay250 + " если сбрасывать по 250гр. в день");
        System.out.println("Потребуется " + inDay500 + " если сбрасывать по 500гр. в день");
        System.out.println("Потребуется " + (inDay250 + inDay500) / 2 + " если сбрасывать среднее количество");

        System.out.println(" ");

        //zadanie 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;

        int MashInterest = salaryMasha / 10;
        int DenisInterest = salaryDenis / 10;
        int KrisInterest = salaryKris / 10;

        System.out.println("Маша теперь получает " + (salaryMasha + MashInterest) + " рублей. Годовой доход вырос на " + (((salaryMasha + MashInterest) * 12) - (salaryMasha * 12)) + " рублей");
        System.out.println("Денис теперь получает " + (salaryDenis + DenisInterest) + " рублей. Годовой доход вырос на " + (((salaryDenis + DenisInterest) * 12) - (salaryDenis * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + (salaryKris + KrisInterest) + " рублей. Годовой доход вырос на " + (((salaryKris + KrisInterest) * 12) - (salaryKris * 12)) + " рублей");
    }
}