package JavaProject;

public class Task9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?

        int number[] = new int[]
                {11,28,30,2,15,34,3,9,40,19};

        int minimum=number[0];
        int maximum=number[0];

        for (int j = 1; j < number.length; j++) {
            if(number[j]>maximum){
                maximum=number[j];
            }else if(number[j]<minimum){
                minimum=number[j];
            }
        }
        System.out.println("The smallest number is "+minimum);
        System.out.println("The largest number is "+maximum);

    }
}
