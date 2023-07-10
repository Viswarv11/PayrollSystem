class Employee {
    String name;
    double salary;
    public void pay(double salary){
        this.salary=salary;
    }
    public void pay(double hourlyRate,double hoursWorked){
        this.salary=hourlyRate*hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        employee1.name="Viswa";
        employee1.pay(1000.0);
        System.out.println(employee1.name+" "+employee1.salary);
        employee2.name="Vignesh";
        employee2.pay(200.0,8.0);
        System.out.println(employee2.name+" "+employee2.salary);
    }

}
