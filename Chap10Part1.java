public class Chap10Part1
{
    public static void main(String[] args)
    {
        int num = 12;
        System.out.println(num + " Squared equals " + square(num));
    }
    
    static int square(int number) {
        return number * number;
    }
}