package Calcul;

import java.io.IOException;

    class Latin {
    String[] nums;

    public Latin(String[] value2) {
        nums = value2;
    }

    public int latinsk() {
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
                System.out.println("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
            return result;
        }
    }


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
