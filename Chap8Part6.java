import java.util.Scanner;

/*
Temperature     Recommended activity
>85             Swimming
70-85           Tennis
32-69           golf
0-31            Dancing
*/


public class Chap8Part6
{
    public static void main(String [] args)
    {
        int Temperature;
        String activity = "";
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a Temperature: ");
        Temperature = input.nextInt();
        if(Temperature >= 85) {
            activity = "Swimming";
        }
        else if(Temperature >= 70) {
            activity = "Tennis";
        }
        else if(Temperature <= 69) {
            activity = "Golf";
        }
        else if(Temperature >= 32) {
            activity = "Golf";
        }
        else if(Temperature >= 31) {
            activity = "Dancing";
        }
        else if(Temperature >= 0) {
            activity = "Dancing";
        }
        else {
            System.out.println("Didn't recognize input."); 
        }
        System.out.println("Your Suggested Activity for the day is " + activity);
        
    }
}