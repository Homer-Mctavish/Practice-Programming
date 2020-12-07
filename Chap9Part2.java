public class Chap9Part2
{
    public static void main(String[] args)
    {
        // balance, rate number of years how much money do I have in my account if it has 2% interest rate and 
        double balance = 5000;
        double rate = 1.02;
        int years = 1;
        while (years <= 10) {
        balance = balance * rate;
        System.out.println("After year " + years + ", the balance is " + balance); 
        ++years;
        }
        System.out.println("after 10 years, the balance is equal to " + balance);
    }
}