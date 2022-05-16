public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        byte core = 4;
        short ddr = 4096;
        int sector = 468_857_025;
        long hard = 240_057_409_536L;
        float cpu = 1.6f;
        double speed = 479.8;
        char name = '\u0068';
        char name1 = '\u0070';
        boolean bool = true;
        System.out.println(core);
        System.out.println(ddr);
        System.out.println(sector);
        System.out.println(hard);
        System.out.println(cpu);
        System.out.println(speed);
        System.out.print(name);
        System.out.println(name1);
        System.out.println(bool);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        int discount = (100 + 200) * 11 / 100;
        int discountPrice = (priceGoodsX + priceGoodsY - discount);
        System.out.println("Сумма скидки " + discount);
        System.out.println("Общая сумма со скидкой " + discountPrice);

        System.out.println("\n3.Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4.Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("byteMax = " + byteMax);
        System.out.println("shortMax = " + shortMax);
        System.out.println("intMax = " + intMax);
        System.out.println("longMax = " + longMax);
        System.out.println("\nИнкремент " + ++byteMax + " Декремент " + --byteMax);
        System.out.println("Инкремент " + ++shortMax + " Декремент " + --shortMax);
        System.out.println("Инкремент " + ++intMax + " Декремент " + --intMax);
        System.out.println("Инкремент " + ++longMax + " Декремент " + --longMax);

        System.out.println("\n5.Перестановка значений переменных");
        float a = 3.14f;
        float b = 5.17f;
        System.out.println("a " + a);
        System.out.println("b " + b);
        float c;
        c = a;
        a = b;
        b = c;
        System.out.println("a " + a);
        System.out.println("b " + b);

        System.out.println("\n6.Вывод символов и их кодов");
        int codeChar35 = 35;
        int codeChar38 = 38;
        int codeChar64 = 64;
        int codeChar94 = 94;
        int codeChar95 = 95;
        System.out.println("Код 35 соответствует символу " + (char) codeChar35);
        System.out.println("Код 38 соответствует символу " + (char) codeChar38);
        System.out.println("Код 64 соответствует символу " + (char) codeChar64);
        System.out.println("Код 94 соответствует символу " + (char) codeChar94);
        System.out.println("Код 95 соответствует символу " + (char) codeChar95);

        System.out.println("\n7.Произведение и сумма цифр числа 345");
        int srcNum = 345;
        int num3 = srcNum / 100;
        int num4 = srcNum % 100 / 10;
        int num5 = srcNum % 10;
        int sumDigits = num3 + num4 + num5;
        int productDigits = num3 * num4 * num5;
        System.out.println("Сумма цифр числа 345 = " + sumDigits);
        System.out.println("Произведение цифр числа 345 = " + productDigits);

        System.out.println("\n8.Вывод на консоль ASCII-арт Дюка");
        char horizontalTab = '\t';
        char slash = '/';
        char backSlash = '\\';
        char space = ' ';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("" + horizontalTab + slash + backSlash);
        System.out.println("" + space + space + space + space + space + space + space + slash + space + space + backSlash);
        System.out.println("" + space + space + space + space + space + space + slash + underscore + openBracket + space + closeBracket + backSlash);
        System.out.println("" + space + space + space + space + space + slash + space + space + space + space + space + space + backSlash);
        System.out.println("" + space + space + space + space + slash + underscore + underscore + underscore + slash + backSlash + underscore + underscore + underscore + backSlash);

        System.out.println("\n9.Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        int hundreds = srcNum / 100;
        int dozens = srcNum % 100 / 10;
        int units = srcNum % 10;
        System.out.println("Число 123 содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(dozens + " десятков");
        System.out.println(units + " единиц");

        System.out.println("\n10.Преобразование секунд");
        int scrSec = 86399;
        int hours = scrSec / 3600;
        int minutes = scrSec / 60 % 60;
        int secunds = scrSec % 60;
        System.out.println(hours + ":" + minutes + ":"+ secunds);
    }
}