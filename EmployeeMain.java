import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        EmployeeSys.addEmployee();
        EmployeeSys.calculateEmployeeHolidays();
        EmployeeSys.addManagerSalary();
        System.out.println("All Employees are added.");
        System.out.print("\nEnter the employee id you want to search: ");
        id= sc.nextInt();
        Employee emp=EmployeeSys.searchEmployee(id);
        if(emp!=null){
        emp.toString();
        }
        else{
        System.out.println("Employee you search has not found.");
        }
         boolean isRemoved;
        System.out.print("\nWould you like to delete an employee? ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("yes")) {
        	id=sc.nextInt();
            isRemoved=EmployeeSys.removeEmployee(id);
            if(isRemoved){
            System.out.println("Employee is deleted.");
            }
            else{
            System.out.println("Employee is not deleted");
            }
        }
        

        String out=null;
        System.out.println("\nThe Final List of Employees:");
        out=EmployeeSys.display();
        System.out.println(out);

        EmployeeSys.calculateEmployeeEducationRatio();
        EmployeeSys.calculateEmployeeGenderRatio();




    }
}