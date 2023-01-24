package JavaProject;

public class Task8 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.

        int[] numbers = new int[10];
        numbers[0] = 0;
        numbers[1] = 1;
        System.out.println(numbers[0]+" ");
        System.out.println(numbers[1]+" ");
        for (int i = 2; i < 10; i++) {
            numbers[i] = numbers[i - 1] + numbers[i-2];
            System.out.println(numbers[i]+" ");

        }
    }
}
