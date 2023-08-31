import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Solve me first
        System.out.println(sum());
        transition();
        // Simple Array Sum
        System.out.println(sumOfAllElements(8));
        transition();
        // Compare the triplets
        int[] alice = {17, 28, 30};
        int[] bob = {99, 16, 8};
        System.out.println(Arrays.toString(compareIndexByIndex(alice, bob)));
        transition();
        // A very big sum
        long[] arrL = {1000000005, 1000000002, 1000000003, 1000000004, 1000000005};
        System.out.println(largeNumberSum(arrL));
        transition();
        // Diagonal Difference
        int[][] sqrMatrix = {{0,2,5},{1,6,5},{8,7,1}};
        System.out.println(diffOfDiagonals(sqrMatrix));
        transition();
        // Plus Minus
        ratioNumbers(bob);
    }

    public static void transition() {
        System.out.println("-".repeat(20));
    }

    public static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if (a >= 1 && a <= 1000 && b >= 1 && b <= 1000) {
            return a + b;
        } else {
            return 0;
        }
    }

    public static int sumOfAllElements(int arrLength) {
        int[] arrInts = new int[arrLength];
        Random ran = new Random();
        int sum = 0;
        for (int i = 0; i <= arrLength - 1; i++) {
            arrInts[i] = ran.nextInt(1, 1000);
            sum += i;
        }
        return sum;
    }

    public static int[] compareIndexByIndex(int[] aliceScore, int[] bobScore) {
        int[] finalScore = {0,0};
        for (int i = 0; i <= aliceScore.length -1; i++) {
            if (aliceScore[i] > bobScore[i]) {
                finalScore[0] += 1;
            } else if (aliceScore[i] < bobScore[i]){
                finalScore[1] += 1;
            } else {
                continue;
            }
        }
        return finalScore;
    }

    public static long largeNumberSum(long[] arrL) {
        long sum =0;
        for (long number : arrL) {
            sum += number;
        }
        return sum;
    }

    public static int diffOfDiagonals(int[][] matrix) {
        int len = matrix.length;
        int sDiagonal1 = 0;
        int sDiagonal2 = 0;
        for (int i = 0; i <= len -1; i ++) {
            for (int j = 0; j <= len -1; j++) {
                if (i == j) {
                    sDiagonal1 += matrix[i][j];
                } else if (i + j == len) {
                    sDiagonal2 += matrix[i][j];
                }
            }
        }
        int diff = sDiagonal1 - sDiagonal2;
        System.out.println(sDiagonal1 + " " + sDiagonal2);
        return diff;
    }

    public static void ratioNumbers(int[] arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double equalsTo0 = 0;
        int len = arr.length;
        for (int number : arr) {
           if (number > 0) {
               positiveCount ++;
           } else if (number == 0) {
               equalsTo0 ++;
           } else  {
               negativeCount ++;
           }
        }
        double positiveRatio = positiveCount / len;
        double negativeRatio = negativeCount / len;
        double equals0Ratio = equalsTo0 / len;
        System.out.printf("%.6f", positiveRatio);
        System.out.println();
        System.out.printf("%.6f", negativeRatio);
        System.out.println();
        System.out.printf("%.6f", equals0Ratio);
    }

}
