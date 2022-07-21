public class ifElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1.Перевод псевдокода на язык Java");
        int age = 36;
        String sex = "male";
        double height = 1.75;

        if (age > 20) {
            System.out.println("Доступ открыт");
        } else {
            System.out.println("Доступ закрыт");
        }
        if (sex != "male") {
            System.out.println("Вход с другой стороны");
        }
        if (height < 1.80) {
            System.out.println("Вы не подходите для работы в охране");
        } else {
            System.out.println("Вы подходите для работы в охране");
        }
        char firstLetterName = "Jarat".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Пройдите в кабинет 15");
        } else if (firstLetterName == 'I') {
            System.out.println("Пройдите в кабинет 17");
        } else {
            System.out.println("Поднимитесь на 2й этаж");
        }

        System.out.println("\n2.Поиск max и min числа");
        int srcNum = 530;
        int srcNum2 = 201;
        if (srcNum > srcNum2) {
            System.out.println("Максимальное число:" + srcNum + " Минимальное число:" + srcNum2);
        } else if (srcNum == srcNum2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Максимальное число:" + srcNum2 + " Минимальное число:" + srcNum);
        }

        System.out.println("\n3.Работа с числом");
        srcNum = 1003;
        if (srcNum == 0) {
            System.out.println(srcNum + " число равно нулю");
        } else if (srcNum % 2 == 0 && srcNum > 0) {
            System.out.println(srcNum + " положительное четное число ");
        } else if (srcNum % 2 != 0 && srcNum > 0) {
            System.out.println(srcNum + " положительное нечетное число"); 
        } else  if (srcNum % 2 != 0 && srcNum < 0) {
            System.out.println(srcNum + " отрицательное нечетное число ");
        } else {
            System.out.println(srcNum + " отрицательное четное число");
        }
        System.out.println("\n4.Поиск одинаковых цифр в числах");
        srcNum = 143;
        int firstDigit = srcNum / 100;
        int secondDigit = srcNum % 100 / 10;
        int thirdDigit = srcNum % 10;
        srcNum2 = 432;
        int firstDigit2 = srcNum2 / 100;
        int secondDigit2 = srcNum2 % 100 /10;
        int thirdDigit2 = srcNum2 % 10;
        if (firstDigit == firstDigit2 && secondDigit == secondDigit2 && thirdDigit == thirdDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковые цифры " + firstDigit + "," + secondDigit + "," + thirdDigit + " стоят в разрядах сотен, десятков, единиц");
        } else if (firstDigit == firstDigit2 && secondDigit == secondDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковые цифры " + firstDigit + "," + secondDigit + " стоят в разрядах сотен, десятков");
        } else if (firstDigit == firstDigit2 && thirdDigit == thirdDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковые цифры " + firstDigit + "," + thirdDigit + " стоят в разрядах сотен,единиц");
        } else if (secondDigit == secondDigit2 && thirdDigit == thirdDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковые цифры " + secondDigit + "," + thirdDigit + " стоят в разрядах десятков, единиц");
        } else if (firstDigit == firstDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковая цифра " + firstDigit + " стоит в разряде сотен");
        } else if (secondDigit == secondDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковая цифра " + secondDigit + " стоит в разряде десятков");
        } else if (thirdDigit == thirdDigit2) {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " одинаковая цифра " + thirdDigit + " стоит в разряде единиц");
        } else {
            System.out.println("В числах " + srcNum + " и " + srcNum2 + " отсутствуют одинаковые цифры");
        }
        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char codeHex = '\u0057';
        int codeDec = codeHex;
        if (codeDec >= 65 && codeDec <= 90) {
            System.out.println("Это большая буква " + codeHex);
        } else if (codeDec >= 97 && codeDec <= 122) {
            System.out.println("Это маленькая буква " + codeHex);
        } else if (codeDec >=48 && codeDec <=57) {
            System.out.println("Это цифра " + codeHex);
        } else {
            System.out.println("Это не буква и не число " + codeHex);
        }
        System.out.println("\n6 Определение суммы вклада и начисленных банком %");
        int deposit = 400000;
        if (deposit < 100000) {
            int accruedInterest = deposit * 5 / 100;
            int sumDeposit = accruedInterest + deposit;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный процент %: " + accruedInterest);
            System.out.println("Итоговая сумма с %: " + sumDeposit);
        } else if (deposit >= 100000 && deposit <= 300000) {
            int accruedInterest = deposit * 7 / 100;
            int sumDeposit = accruedInterest + deposit;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный процент %: " + accruedInterest);
            System.out.println("Итоговая сумма с %: " + sumDeposit);
        }else if (deposit > 300000) {
            int accruedInterest = deposit * 10 / 100;
            int sumDeposit = accruedInterest + deposit;
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный процент %: " + accruedInterest);
            System.out.println("Итоговая сумма с %: " + sumDeposit);
        } 
        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int gradeHistory;
        if (history <= 60) {
            gradeHistory = 2;
            System.out.println(gradeHistory + " История");
        } else if (history > 60 && history <= 73) {
            gradeHistory = 3;
            System.out.println(gradeHistory + " История");
        } else if (history > 73 && history <= 91) {
            gradeHistory = 4;
            System.out.println(gradeHistory + " История");
        } else {
            gradeHistory = 5;
            System.out.println(gradeHistory + " История");
        }
        int programming = 91;
        int gradeProgramming;
        if (programming <= 60) {
            gradeProgramming = 2;
            System.out.println(gradeProgramming + " Программирование");
        } else if (programming > 60 && programming <= 73) {
            gradeProgramming = 3;
            System.out.println(gradeProgramming + " Программирование");
        } else if (programming > 73 && programming <= 91) {
            gradeProgramming = 4;
            System.out.println(gradeProgramming + " Программирование");
        } else {
            gradeProgramming = 5;
            System.out.println(gradeProgramming + " Программирование");
        }
        int avarageGrade = (gradeHistory + gradeProgramming) / 2;
        int avaragePercent = (history + programming) / 2;
        System.out.println(avarageGrade + " Средний бал оценок по предметам");
        System.out.println(avaragePercent + " Средний процент по предметам");

        System.out.println("\n8. Расчет прибыли");
        int rentMonth = 5000;
        int saleMonth = 13000;
        int costGoods = 9000;
        int profitMonth = saleMonth - costGoods - rentMonth;
        int annualProfit = profitMonth * 12;
        if (annualProfit < 0) {
            System.out.println("Убыток составил " + annualProfit);
        } else
            System.out.println("Годовая прибыль " + annualProfit);

        System.out.println("\n9.Определение существования треугольника");
        int side1 = 5;
        int side2 = 4;
        int side3 = 3;
        if (side1 * side1 == side2 * side2 + side3 * side3) {
            int areaTriangle = side2 * side3 / 2;
            System.out.println("Гипотенуза " + side1 + " Катеты: " + side2 + " и " + side3);
            System.out.println("Площадь = " + areaTriangle);                
        } else if (side2 * side2 == side1 * side1 + side3 * side3) {
            int areaTriangle = side1 * side3 / 2;
            System.out.println("Гипотенуза " + side2 + " Катеты: " + side1 + " и " + side3);
            System.out.println("Площадь = " + areaTriangle);
        } else if (side3 * side3 == side1 * side1 + side2 * side2) {
            int areaTriangle = side1 * side2 / 2;
            System.out.println("Гипотенуза " + side3 + " Катеты: " + side1 + " и " + side2);
            System.out.println("Площадь = " + areaTriangle);
        } else {
            System.out.println("Прямоугольный треугольник с такими длинами сторон не существует");
        }
    }   
}