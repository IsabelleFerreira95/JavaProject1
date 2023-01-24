package JavaProject;

public class Task6 {
    public static void main(String[] args) {
        //Write a program to swap 2 numbers without a temporary variable?

        int num1 = 10;
        int num2 = 28;

        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
