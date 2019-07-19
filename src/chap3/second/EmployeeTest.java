package chap3.second;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Dominic" ,"Sabastine" , 40.78);
        Employee employee2 = new Employee("Stephanie" , "vincent" , 80.78);

        System.out.printf(" the first employess details are :%s%n %s%n %.2f ", employee1.getFirstName(),employee1.getLastName(),employee1.getMonthlySalary());
        System.out.printf(" the first employess details are :%s%n %s%n %.2f ", employee2.getFirstName(),employee2.getLastName(),employee2.getMonthlySalary());

        System.out.printf(" the first employess details are :%s%n %s%n %.2f ", employee1.getFirstName(),employee1.getLastName(),employee1.raiseSalary());
        System.out.printf(" the first employess details are :%s%n %s%n %.2f ", employee2.getFirstName(),employee2.getLastName(),employee2.raiseSalary());
    }
}
