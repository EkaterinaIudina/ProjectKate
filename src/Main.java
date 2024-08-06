public class Main {
    public static void main(String[] args) {
        printThreeWords(); // 1 задание
        checkSumSign();  // 2 задание
        printColor();  // 3 задание
        compareNumbers();  // 4 задание
        System.out.println(fiftTask(6, 5));  // 5 задание
        System.out.println(fiftTask(1, 0));  // 5 задание
        sixthTask(-5);  // 6 задание
        sixthTask(5);  // 6 задание
        System.out.println(seventhTask(-5));  // 7 задание
        System.out.println(seventhTask(5));  // 7 задание
        eightTask("Это восьмое задание", 3);   // 8 задание
        int year = 2024;
        boolean ninthTask = ninthTask(year);
        System.out.println(year + " год высокосный? " + ninthTask);  // 9 задание
        int[] ten = {0, 1, 0, 1, 1, 0, 0, 1};  // 10 задание
        System.out.println("Массив до цикла:");
        tenthTask(ten);
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == 0) {
                ten[i] = 1;
            } else
            { ten[i] = 0;
            }
        }
        System.out.println("Массив после цикла:");
        tenthTask(ten);
        int[] eleven = new int[100];  // 11 задание
        for (int i = 0; i < eleven.length; i++) {
            eleven[i] = i + 1;
        }
        eleventhTask(eleven);
        int[] twenty = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  // 12 задание
        for (int i = 0; i < twenty.length; i++) {
            if (twenty[i] < 6) {
                twenty[i] *= 2;
            }
        }
        twentiethTask(twenty);
        int size = 5; // 13 задание
        int[][] thirteen = new int[size][size];
        for (int i = 0; i < size; i++) {
            thirteen [i][i] = 1;
        }
        thirteenthTask(thirteen);
        int len = 5; // 14 задание
        int initialValue = 8;
        int[] fourteen = fourteenthTask(len, initialValue);
        printFourteenthTask(fourteen);
    }


    /* 1 задание */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /* 2 задание */
    public static void checkSumSign() {
        int a = -10;
        int b = 5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /* 3 задание */
    public static void printColor() {
        int value = 30;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    /* 4 задание */
    public static void compareNumbers() {
        int a = 2;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    /* 5 задание */
    public static boolean fiftTask(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /* 6 задание */
    public static void sixthTask(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /* 7 задание */
    public static boolean seventhTask(int number) {
        return number < 0;
    }

    /* 8 задание */
    public static void eightTask(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    /* 9 задание */
    public static boolean ninthTask(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    /* 10 задание */
    public static void tenthTask(int[] ten) {
        for (int value : ten) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    /* 11 задание */
    public static void eleventhTask(int[] eleven) {
        for (int value : eleven) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    /* 12 задание */
    public static void twentiethTask(int[] twenty) {
        for (int value : twenty) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    /* 13 задание */
    public static void thirteenthTask(int[][] thirteen) {
        for (int[] row : thirteen) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    /* 14 задание */
    public static int[] fourteenthTask(int len, int initialValue) {
        int[] fourteen = new int[len];
            for (int i = 0; i < len; i++) {
            fourteen[i] = initialValue;
        }
        return fourteen;
    }
    public static void printFourteenthTask(int[] fourteen) {
        for (int value : fourteen) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}




