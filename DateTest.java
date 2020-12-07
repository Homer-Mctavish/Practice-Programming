public class DateTest
{
    public static void main(String[] args)
    {
        Date today = new Date(3,16,2020);
        Date tomorrow = new Date(3,2020);
        System.out.println("today is " + today.toString());
        System.out.println("tomorrow is " + tomorrow.toString());
        tomorrow.setDay(5);
        System.out.println("tomorrow is " + tomorrow.toString());
        System.out.println("today is again " + today.getMonth() + "/" + today.getDay() + "/" + today.getYear());
    }
}
