import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to generate = ");

        int numT = sc.nextInt();
      
        System.out.println("Fibonacci sequence = ");

        // First two terms of the Fibonacci sequence to display

        int firstT = 0;

        int secondT = 1;

        System.out.print(firstT + " " + secondT + " ");

        for (int i = 3; i <= numT; i++) {

            int nextT = firstT + secondT;

            System.out.print(nextaT + " ");

            // Shift the previous terms

            firstT = secondT;

            secondT = nextT;

        }

        System.out.println();

    }

}

