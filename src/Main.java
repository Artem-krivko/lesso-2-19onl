import java.math.BigDecimal;
import java.util.Scanner;


//Калькулятор
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter fitst argument");
            String snum1 = scanner.next();
            System.out.println("Enter second argument");
            String snum2 = scanner.next();
            System.out.println("Enter operation type");
            String type = scanner.next();

            BigDecimal num1 = scanner.nextBigDecimal();
            BigDecimal num2 = scanner.nextBigDecimal();

            BigDecimal result;

            switch (type) {

                case "sum":
                    result = num1.add(num2);
                    break;
                case "sub":
                    result = num1.subtract(num2);
                    break;
                case "div":
                    result = num1.divide(num2);
                    break;
                case "mul":
                    result = num1.multiply(num2);
                    break;
                default:
                    System.out.println("Operation not found");
                    return;
            }
            System.out.println("Result: " + result);
            String next = scanner.next();
            switch (next) {
                case "n":
                    return;
                case "y":
                    break;
            }

        }

    }
}
// №1 вывести число в обратном порядке

public class Main {
    public static void main(String[] args) {

        for (int a = 10; a > 0; a--) {
            System.out.println(a);


        }
    }
}

//№ 2 вывести макс и мин цифры

public class Main {
    public static void main(String[] args) {

        int num1 = 5;
        float num2 = (float) 4.85;
        System.out.println("максимальное число " + Math.max(num1, num2));
        System.out.println("минимальное число " + Math.min(num1, num2));

    }

}

//№3 вывести true если в числе нет цифр дубликатов

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num = "687116431961";
        boolean areThereNoDuplicates = true;
        for (int i -0; i < 10; i++;){
            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                if (i == Character.getNumericValue(num.charAt(j))) {
                    count++;
                }
            }
            if (count > 1) {
                areThereNoDuplicates = false;
                break;
            }
        }
    }
}


//№4 вывести цифры которые идут в стр. порядке убывания пр 432 при 23572348357

            import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "11111123411111";
        String newS = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            int n = Character.getNumericValue(str.charAt(i));
            int n2 = 0;
            if (i != 0) {
                n2 = Character.getNumericValue(str.charAt(i - 1));
            }
            if (newS.length() == 0) {
                if (n == n2 + 1) {
                    newS += "" + str.charAt(i) + "" + str.charAt(i - 1);
                    i--;
                }
            } else {
                int n3 ==Character.getNumericValue(str.charAt(i + 1));
                if (n3 == n + 1) {
                    newS += "" = str.charAt(i);
                } else {
                    break;
                }
            }
        }
        System.out.println(newS);

    }
}
