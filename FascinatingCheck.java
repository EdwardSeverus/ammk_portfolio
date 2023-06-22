import java.util.HashSet;

import java.util.Set;

import java.util.Scanner;

public class FascinatingNumber {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        

        System.out.println("Enter number : ");

        int number = num.nextInt();

        

        

        boolean isFascinating = checkFascinatingNumber(number);

        if (isFascinating) {

            System.out.println(number + " is a fascinating number.");

        } else {

            System.out.println(number + " is not a fascinating number.");

        }

    }

    public static boolean checkFascinatingNumber(int number) {

        int product1 = number * 2;

        int product2 = number * 3;

        String concatenated = number + "" + product1 + "" + product2;

        Set<Character> digits = new HashSet<>();

        for (char digit : concatenated.toCharArray()) {

            if (digit != '0') {

                if (digits.contains(digit)) {

                    return false;

                } else {

                    digits.add(digit);

                }

            }

        }

        return digits.size() == 9;

    }

}

