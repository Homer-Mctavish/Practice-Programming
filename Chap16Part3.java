public class Chap16Part3
{
        /*
        do {
            set of statements;
        } while(relationsal expression);
        */
        public static void main(String[] args)
        {
            int number = 12;
            do {
                System.out.println(number);
                ++number;
            } while(number < 11); // (number <= 11, beginning number violating this still prints)
        }
} 