public class VariablesTheme {
    public static void main(String[] args) {
        byte core = 4; // количество ядер
        short ddr = 4096; //оперативная память мб
        int sector = 468_857_025; //количество секторов на жестком диске
        long hard = 240_057_409_536L; //размер жесткого диска в байтах
        float cpu = 1.6f; //частота процессора
        double speed = 479.8; //скорость ядра
        char name = '\u0068';
        char name1 = '\u0070';
        boolean bool = true;
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        System.out.println(core);
        System.out.println(ddr);
        System.out.println(sector);
        System.out.println(hard);
        System.out.println(cpu);
        System.out.println(speed);
        System.out.print(name);
        System.out.println(name1);
        System.out.println(bool);
        System.out.println("");

        int x = 100;
        int y = 200;
        int z = (100 + 200) * 11/100;
        int s = (x + y - z);
        System.out.println("2.Расчет стоимости товара со скидкой");
        System.out.println("Сумма скидки " + z);
        System.out.println("Общая сумма со скидкой " + s);
        System.out.println("");

        System.out.println("3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println(""); 

        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("4.Отображение min и max значений числовых типов данных");
        System.out.println("byteMax = " + byteMax);
        System.out.println("shortMax = " + shortMax);
        System.out.println("intMax = " + intMax);
        System.out.println("longMax = " + longMax);
        byteMax++;
        shortMax++;
        intMax++;
        longMax++;
        System.out.println("");
        System.out.println("Инкремент " + byteMax);
        System.out.println("Инкремент " + shortMax);
        System.out.println("Инкремент " + intMax);
        System.out.println("Инкремент " + longMax);
        byteMax--;
        shortMax--;
        intMax--;
        longMax--;
        System.out.println("");
        System.out.println("Декремент " + byteMax);
        System.out.println("Декремент " + shortMax);
        System.out.println("Декремент " + intMax);
        System.out.println("Декремент " + longMax);

        float a = 3.14f;
        float b = 5.17f;
        System.out.println("5.Перестановка значений переменных");
        System.out.println("a " + a);
        System.out.println("b " + b);
        float c;
        c = a;
        a = b;
        b = c;
        System.out.println("");
        System.out.println("a " + a);
        System.out.println("b " + b);

        int j1 = 35;
        int j2 = 38;
        int j3 = 64;
        int j4 = 94;
        int j5 = 95;
        char k1 = (char)j1;
        char k2 = (char)j2;
        char k3 = (char)j3;
        char k4 = (char)j4;
        char k5 = (char)j5;
        System.out.println(""); 
        System.out.println("6.Вывод символов и их кодов"); 
        System.out.println("Код 35 соответствует символу " + k1);
        System.out.println("Код 38 соответствует символу " + k2); 
        System.out.println("Код 64 соответствует символу " + k3); 
        System.out.println("Код 94 соответствует символу " + k4); 
        System.out.println("Код 95 соответствует символу " + k5); 

        int proiz = 3 * 4;
        int rezult1 = proiz * 5;
        int sum = 3 + 4;
        int rezult2 = sum + 5;
        System.out.println(""); 
        System.out.println("7.Произведение и сумма цифр числа 345"); 
        System.out.println("Произведение числа = " + rezult1);
        System.out.println("Сумма числа = " + rezult2);
        System.out.println("");
        char t1 = 0x2F;
        char t2 = 0x5c;
        char t3 = 0x20;
        char t4 = 0x5F;
        char t5 = 0x28;
        char t6 = 0x29;
        System.out.println("7.Вывод на консоль ASCII-арт Дюка");
        System.out.println("\t" + t1 + t2);
        System.out.println("" + t3 + t3 + t3 + t3 + t3 + t3 + t3 + t1 + t3 + t3 + t2);
        System.out.println("" + t3 + t3 + t3 + t3 + t3 + t3 + t1 + t4 + t5 + t3 + t6 + t2);
        System.out.println("" + t3 + t3 + t3 + t3 + t3 + t1 + t3 + t3 + t3 + t3 + t3 + t3 + t2);
        System.out.println("" + t3 + t3 + t3 + t3 + t1 + t4 + t4 + t4 + t1 + t2 + t4 + t4 + t4 + t2);

        int number = 123;
        int sotni = number / 100 *100;
        int desyatki = number % 100;
        int edinici = desyatki % 10;
        System.out.println("");
        System.out.println("8.Отображение количества сотен, десятков и единиц числа");
        System.out.println("Вычисляем сотни " + sotni);
        System.out.println("С помощью оператора % вычисляем остаток от сотни " + desyatki);
        System.out.println("С помощью оператора % вычисляем остаток от десятков " + edinici);

        int sumSec = 86399;
        int chas = sumSec / 3600;
        int minut = sumSec / 60 % 60;
        int secund = sumSec % 60;
        //double secund1 = 60 % secund;
        //int secund = hour / 60;
        System.out.println("");
        System.out.println("9.Преобразование секунд");
        System.out.println(chas + ":" + minut + ":"+ secund);
        }
}