import java.util.Scanner;

public class Chap7Part3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number, number1, sum;
        System.out.println("Enter the first number: ");
        number = input.nextInt();
        System.out.println("Enter the second number: ");
        number1 = input.nextInt();
        sum = number + number1;
        System.out.println("The sum is " + sum);
    }
}