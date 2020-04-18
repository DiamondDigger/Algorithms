package by.mustWork_01;

/*
Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MultiplesOfTHREEAndFIVE {
    public static void main(String[] args) {


        int sum = 0;
        int sumOfFindNum = 0;
        int div3 = 3;
        int div5 = 5;
        int startNum = 10;

        for (int i = 0; i < startNum; i++) {
            if (i % div3 == 0) {
                sum++;
                sumOfFindNum += i;
                System.out.println("startNum % 3 =" + i);
            } else if (i % div5 == 0) {
                sum++;
                sumOfFindNum += i;
                System.out.println("startNum % 5 =" + i);
            }
        }

        System.out.println("Sum =" + sum);
        System.out.println("SumOfFindNum ="+sumOfFindNum);
    }
}
