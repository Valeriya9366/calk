package Calcul;

import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������, ����� ������� ��������, ����� ������� ������ �������");
        String input = scanner.nextLine();
        System.out.print("�����: " + calc(input));
    }

    public static String calc(String input) throws IOException {
        String[] nums = input.split(" ");
        int length = nums.length;
        if (length != 3) {
            //try {  //���� ����� �� ����� 3,�� ������
                //throw new IOException();
           // } catch (IOException e) {
                System.out.println("throws Exception //�.�. ������ �������������� �������� �� ������������� ������� - ��� �������� � ���� ��������");
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
                    System.out.println("throws Exception //�.�. ������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
                }
            }
        } else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //�.�. ���� ����� �� 1 �� 10");
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
//            try {  //���� ����� �� ����� 3,�� ������
//                throw new IOException();
//            } catch (IOException e) {
//                System.out.println("throws Exception //�.�. ������ �������������� �������� �� ������������� �������");
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
//                        System.out.println("throws Exception //�.�. ������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
//                    }
//                }
//            } else {
//                Rim rim = new Rim(nums);
//                rim.rimskie();
//            }
//            return String.valueOf(result);
        //}
//}


// ������ � ������� �� nums [0] ������ 1 ��� ������ 10 � ������ ���� �� �����





//        int length = word.length;
//        if (length != 3) {
//            try {  //���� ����� �� ����� 3,�� ������
//                throw new IOException();
//            } catch (IOException e) {
//                System.out.println("�.�. ������ �������������� �������� �� ������������� �������");
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
//                System.out.println("���������" + "�.�. ������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
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


