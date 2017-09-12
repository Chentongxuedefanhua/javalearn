import java.time.LocalDate;

/**
 * Created @ 2017-9-6.
 * Auther chenfan
 */
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public Employee(String n, Double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
public class EmployeeTest{
    public static void main(String args[]){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 2000.00,2017, 9,6);
        staff[1] = new Employee("Jerry", 3000.00,2017, 9,6);
        staff[2] = new Employee("Jack", 4000.00,2017, 9,6);

        for (Employee e : staff)
            System.out.println(
                    "name:" + e.getName() + ',' + "salary:" + e.getSalary() + ',' + "hireDay:" + e.getHireDay()
            );

        for (Employee e : staff)
            e.raiseSalary(5);

//        for (int i=0;i<staff.length;i++){
//            staff[i].raiseSalary(5);
//        }

        for (Employee e : staff)
            System.out.println(
                    "name:" + e.getName() + ',' + "salary:" + e.getSalary() + ',' + "hireDay:" + e.getHireDay()
            );

    }
}