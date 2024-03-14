import java.io.*;
import java.util.*;

class maxOfthre {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the num1: ");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.print("Enter the num2: ");
        int num2 = Integer.parseInt(reader.readLine());

        System.out.print("Enter the num3: ");
        int num3 = Integer.parseInt(reader.readLine());

        int maxNum = findMaxOfThreeNum(num1, num2, num3);
        System.out.println("The max of three num: " + maxNum);

        // Close the BufferedReader to avoid resource leaks
        reader.close();
    }

    // Function to find the maximum of two numbers
    private static int findmaxof2(int a, int b) {
        if (a > b) {
            System.out.println("The max of two num is: " + a);
            return a;
        } else {
            System.out.println("The max of two num is: " + b);
            return b;
        }
    }

    // Function to find the maximum of three numbers
    private static int findMaxOfThreeNum(int num1, int num2, int num3) {
        int maxOfFirstTwo = findmaxof2(num1, num2);
        return findmaxof2(maxOfFirstTwo, num3);
    }
}
