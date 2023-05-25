import java.util.ArrayList;

public class EmployeeSys {

    private static ArrayList<Employee> arr = new ArrayList<Employee>();
	
	
	
	public static void addEmployee() {
		ITEmployee ite;
		HREmployee hre;
		ACEmployee ace;
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many employee do you want to add : ");
        int number = sc.nextInt();
        
        for (int i = 1; i <= number; i++) {
            System.out.print("\nEnter type name of department: ");
            String type = sc.next();
            
            if(type.equalsIgnoreCase("IT")) {
                ite = new ITEmployee();
                ite.getInput();
                ite.calcMonthlyBonus();
                arr.add(ite);
            }
            if(type.equalsIgnoreCase("AC")) {
                ace = new ACEmployee();
                ace.getInput();
                ace.calcMonthlyBonus();
                arr.add(ace);
            }
            else {
                hre = new HREmployee();
                hre.getInput();
                hre.calcMonthlyBonus();
                arr.add(hre);
            }
        }   
    }
	 public static boolean removeEmployee(String name) {
	    	boolean removed = false;
	        for (int i = 0; i < arr.size(); i++) {
	            if (arr.get(i).findEmployee().equalsIgnoreCase(name)) {
	                arr.remove(i);
	                removed = true;
	                break;
	            }
	        }
	        return removed;
	    }
	
	
	}
public static Employee searchEmployee(String name) {
	Employee employee = null;
	for (Employee l : arr) {
		if (l.findEmployee(name)) {
			employee = l;
			break;
		}
	}
	return employee;
}

public static String display() {
    Employee temp;
    String out = "";
    
   
    for (Employee l : arr) {
        out += l.toString() + "\n\n";
    }

    return out;
}


    public void calculateEmployeeHolidays(){
        int legallyRequiredHolidays = 30; //base holiday days for everyone
        int earnedHolidays = 0;//employees have to work for 11(months)*22(days)*9(hours) hours a year if the employee does not fill the working hour quota they will get holidays removed as penalty
        //I probably would not be a great boss
        for (int i = 0; i < emp.size(); i++){
            if(emp.get(i).getWorkingHour()<2178){
                earnedHolidays = legallyRequiredHolidays - 5;
            } else if (emp.get(i).getWorkingHour()>2178) {
                earnedHolidays = legallyRequiredHolidays + 5; //over workers shall be rewarded with extra holidays therefore I am a great boss
            }
            else
                earnedHolidays = 30;
        }

    }

    public void calculateEmployeeEducationAverage(){
        double hsAvg = 0, bAvg = 0, mAvg = 0, phdAvg = 0;

        for(int i = 0; i < emp.size(); i++){
            if(emp.get(i).getEducationLevel() == "HS"){
                hsAvg++;
            } else if (emp.get(i).getEducationLevel() == "Bachelor") {
                bAvg++;
            } else if (emp.get(i).getEducationLevel() == "Master") {
                mAvg++;
            } else if (emp.get(i).getEducationLevel() == "PhD") {
                phdAvg++;
            }
        }
        System.out.println("\nEducation Level Avg: \nHigh School: " +hsAvg +"/" +all +"\nBachelor: " +bAvg +"/" +all +"\nMaster: " +mAvg +"/" +all +"\nPhD: " +phdAvg +"/" +all);
    }

    public void calculateEmployeeGenderAverage(){
        double femAvg = 0, mascAvg = 0;

        for (int i = 0; i < emp.size(); i++){
            if(emp.get(i).getGender().equalsIgnoreCase("F")){
                femAvg++;
            } else if (emp.get(i).getGender().equalsIgnoreCase("M")) {
                mascAvg++;
            }
        }
        System.out.println("\nGender Avg: \nFemale Avg: " +femAvg +"/" +all +"\nMale Avg: " +mascAvg +"/" +all);
    }

    public void addManagerSalary(){
        for (int i = 0; i < emp.size(); i++){
            if (emp.get(i).getIsManager()==true){
                emp.get(i).setSalary( emp.get(i).getSalary()+1500);
            }
        }
    }

}
