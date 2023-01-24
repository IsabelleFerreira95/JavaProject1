package JavaProject;

public class Task5 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will
        // calculate the sum of even and odd numbers for that array.

        int[][] numbers={{11,15,23,33},
                         {60,20,34,56}
        };
        int totalEven=0;
        int totalOdds=0;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0) {
                    totalEven =totalEven+ numbers[i][j];
                } else {
                    totalOdds =totalOdds+ numbers[i][j];
                }
            }
        }
        System.out.println("The total of Even numbers is "+totalEven);
        System.out.println("The total of Odd numbers is "+totalOdds);

    }
}
