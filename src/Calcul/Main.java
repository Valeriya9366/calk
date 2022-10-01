package Calcul;

import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд, далее введите операцию, затем введите второй операнд");
        String input = scanner.nextLine();
        System.out.print("Ответ: " + calc(input));
    }

    public static String calc(String input) throws IOException {
        String[] nums = input.split(" ");
        int length = nums.length;
        if (length != 3) {
            //try {  //если длина не равно 3,то ошибка
                //throw new IOException();
           // } catch (IOException e) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор");
            }
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[2]);
        int result = 0;
        if (Integer.parseInt(nums[0]) <= 10 && Integer.parseInt(nums[0]) >= 1 && Integer.parseInt(nums[2]) <= 10 && Integer.parseInt(nums[2]) >= 1) {
            if (nums[1].equals("+")) {
                result = a + b;
            } else if (nums[1].equals("-")) {
                result = a - b;
            } else if (nums[1].equals("/")) {
                result = a / b;
            } else if (nums[1].equals("*")) {
                result = a * b;
            } else {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. ввод чисел от 1 до 10");
            }
        }
        if (nums[0].equals("I") || nums[0].equals("II") || nums[0].equals("III") || nums[0].equals("IV") || nums[0].equals("V") || nums[0].equals("VI") || nums[0].equals("VII") || nums[0].equals("VIII") || nums[0].equals("IX") || nums[0].equals("X") && nums[2].equals("I") || nums[2].equals("II") || nums[2].equals("III") || nums[2].equals("IV") || nums[2].equals("V") || nums[2].equals("VI") || nums[2].equals("VII") || nums[2].equals("VIII") || nums[2].equals("IX") || nums[2].equals("X")) {
            Rim rim = new Rim(nums);
            return String.valueOf(rim.rimskie());
        } else {
            return String.valueOf(result);
        }
    }
}
//        int a = Integer.parseInt(nums[0]);
//        int b = Integer.parseInt(nums[2]);
//        int result = 0;
//        int length = nums.length;
//
//        if (length != 3) {
//            try {  //если длина не равно 3,то ошибка
//                throw new IOException();
//            } catch (IOException e) {
//                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию");
//            }
//        }
//            if (Integer.parseInt(nums[0]) <= 10 && Integer.parseInt(nums[0]) >= 1 && Integer.parseInt(nums[2]) <= 10 && Integer.parseInt(nums[2]) >= 1) {
//                if (nums[1].equals("+")) {
//                    result = a + b;
//                } else if (nums[1].equals("-")) {
//                    result = a - b;
//                } else if (nums[1].equals("/")) {
//                    result = a / b;
//                } else if (nums[1].equals("*")) {
//                    result = a * b;
//                } else {
//                    try {
//                        throw new IOException();
//                    } catch (IOException e) {
//                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
//                    }
//                }
//            } else {
//                Rim rim = new Rim(nums);
//                rim.rimskie();
//            }
//            return String.valueOf(result);
        //}
//}


// ошибка с выводом иф nums [0] МЕНЬШЕ 1 ИЛИ БОЛЬШЕ 10 И ДРУГОЙ НУМС ТО ЕРРОР





//        int length = word.length;
//        if (length != 3) {
//            try {  //если длина не равно 3,то ошибка
//                throw new IOException();
//            } catch (IOException e) {
//                System.out.println("т.к. формат математической операции не удовлетворяет заданию");
//            }
//        }
//
//        int result = 0;
//        if (word[1].equals("+")) {
//            result = num + num2;
//        } else if (word[1].equals("-")) {
//            result = num - num2;
//        } else if (word[1].equals("/")) {
//            result = num / num2;
//        } else if (word[1].equals("*")) {
//            result = num * num2;
//        } else {
//            try {
//                throw new IOException();
//            } catch (IOException e) {
//                System.out.println("Результат" + "т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
//            }
//            return String.valueOf(result);
//        }

//        public static String rimKonverter(String element, String element1){
//            switch (element) {
//                case "I":
//                    word[0] = String.valueOf(1);
//                    break;
//                case "II":
//                    word[0] = String.valueOf(2);
//                case "III":
//                    word[0] = String.valueOf(3);
//                    break;
//                case "IV":
//                    word[0] = String.valueOf(4);
//                    break;
//                case "V":
//                    word[0] = String.valueOf(5);
//                    break;
//                case "VI":
//                    word[0] = String.valueOf(6);
//                    break;
//                case "VII":
//                    word[0] = String.valueOf(7);
//                    break;
//                case "VIII":
//                    word[0] = String.valueOf(8);
//                    break;
//                case "IX":
//                    word[0] = String.valueOf(9);
//                    break;
//                case "X":
//                    word[0] = String.valueOf(10);
//                    break;
//            }


