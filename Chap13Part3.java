
public class Chap13Part3 {

    public static void main(String[] args)
    {
        Employee e1 = new Employee("Jones", 2000);
        Manager m1 = new Manager("Smith", 4000, "IT");
        System.out.println(e1.displayEmpInfo());
        m1.changeSalary(e1, 25000);
        System.out.println(e1.displayEmpInfo());
    }
}