package JavaProject;

public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array of integer values. Print the sum of all numbers.

        int[][] numbers={{20,30,40},{60,70,50,90},};
        int total=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                total=total+numbers[i][j];
            }
            System.out.println(total);

        }

    }
}
