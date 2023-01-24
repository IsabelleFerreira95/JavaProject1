package JavaProject;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not?

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number :");
        int num=scan.nextInt();
        for(int x = 2; x<= num/2; x++){
            if(num % x != 0){
                System.out.println(num + " is a prime number");break;
            }else{
                System.out.println(num + " is not a prime number");break;
            }
        }

    }
}
