package JavaProject;

public class Task11 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String[] arr = {"Isabelle", "Jorge", "David", "Steve","Amanda","Daniela","Javier","Isabelle","Jorge"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+ 1; j < arr.length; j++) {
                if(arr[j].equals(arr[i])){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
