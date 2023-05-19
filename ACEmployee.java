public class ACEmployee extends Employee{
    private String typeOfSW;

    public ACEmployee(){
        super();
    }

    public void getInput(){
        Scanner sc=new Scanner(System.in);
        super.getInput();
        System.out.print("\nEnter the type of software that is used by the accountance employee: ");
        typeOfSW=sc.nextLine();
    }

    public void calcSalary(){
        hourlySal=200;
        salary=hourlySal*workingHours;
    }

    public void calcMonthlyBonus(){
        if(workingHours>100){
            salary+=(workingHours-100)*50;
        }
    }


    public String toString(){
        return "\nAC Employee: "
                +super.toString()
                +"\nType of software: "+typeOfSW;
    }
}
