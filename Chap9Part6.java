public class Chap9Part6
{
    public static void main(String[] args)
    {
        double balance = 5000;
        double rate = 1.02;
        int i = 1;
        for(; i <= 10; ++i) {
            balance *= rate;
        }
        System.out.println("the balance after 10 years is " + balance);
    }
}