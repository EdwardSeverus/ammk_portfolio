import java.util.Scanner;

class RemoveDuplicate {

    public static void main(String args[]) {

        int arr[] = new int[50];

        int n, i, j, k;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");

        n = sc.nextInt();

        System.out.println("Enter " + n + " array elements: ");

        for (i = 0; i < n; i++)

            arr[i] = sc.nextInt();

        System.out.println("Content of the array - ");

        for (i = 0; i < n; i++)

            System.out.print(arr[i] + " ");

        // Find and remove duplicates

        for (i = 0; i < n; i++) {

            for (j = i + 1; j < n;) {

                if (arr[i] == arr[j]) {

                    for (k = j; k < n - 1; k++)

                        arr[k] = arr[k + 1];

                    n--; // Reduce the size of the array after removing duplicate

                } else {

                    j++;

                }

            }

        }

        System.out.println("\nContent of the array after duplicate removal - ");

        for (i = 0; i < n; i++)

            System.out.print(arr[i] + " ");

    }

}

