package by.mustWork_01;

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
