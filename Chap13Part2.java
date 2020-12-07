public class Chap13Part2
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Smith", 3000);
        Manager m1 = new Manager("Brown", 500, "IT");
        System.out.println(e1.displayEmpInfo());
        System.out.println(m1.displayEmpInfo());
    }


}