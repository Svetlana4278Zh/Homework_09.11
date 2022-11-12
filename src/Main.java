public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte peremByte = 10;
        short peremShort = 10000;
        int peremInt = 1000000;
        long peremLong = 1000000000L;
        float peremFloat = 1f/3f;
        double peremDouble = 1f/3f;
        System.out.println("Значение переменной peremByte c типом byte равно " + peremByte);
        System.out.println("Значение переменной peremShort c типом short равно " + peremShort);
        System.out.println("Значение переменной peremInt c типом int равно " + peremInt);
        System.out.println("Значение переменной peremLong c типом long равно " + peremLong);
        System.out.println("Значение переменной peremFloat c типом float равно " + peremFloat);
        System.out.println("Значение переменной peremDouble c типом double равно " + peremDouble);
        System.out.println(" ");
        System.out.println("Задача 2");
        float x1 = 27.12f;
        long x2 = 987678965549L;
        double x3 = 2.786;
        boolean x4 = false;
        short x5 = 569;
        short x6 = -159;
        int x7 = 27897;
        byte x8= 67;
        System.out.println(x1+", "+x2+", "+x3+", "+x4+", "+x5+", "+x6+", "+x7+", "+x8);
        System.out.println(" ");
        System.out.println("Задача 3");
        int studentLP = 23;
        int studentAS = 27;
        int studentEA = 30;
        int totalStudent = studentLP + studentAS + studentEA;
        int list = 480;
        int listForStudent = list/totalStudent;
        System.out.println("На каждого ученика рассчитано "+listForStudent+" листов бумаги");
        System.out.println(" ");
        System.out.println("Задача 4");
        int productivityPerMinute = 16/2;
        int productivity = productivityPerMinute*20;
        System.out.println("За 20 минут машина произвела бутылок "+productivity+" штук ");
        productivity = productivityPerMinute*(60*24);
        System.out.println("За сутки машина произвела бутылок "+productivity+" штук ");
        productivity = productivityPerMinute*(60*24*3);
        System.out.println("За три дня машина произвела бутылок "+productivity+" штук ");
        productivity = productivityPerMinute*(60*24*30);
        System.out.println("За 1 месяц машина произвела бутылок "+productivity+" штук ");
    }
}