public class HREmployee extends Employee{
    public HashSet<CellPhone> cellPhoneHashSet= new HashSet();

    public HREmployee(){
        super();
    }

    public void getInput(){
        super.getInput();
        Scanner sc= new Scanner(System.in);
        System.out.print("\nHow many cell phones do you want to add?: ");
        int size=sc.nextInt();
        CellPhone cp;

        for(int i=0;i<size;i++){
            cp=new CellPhone();
            cp.getInput();
            cellPhoneHashSet.add(cp);
        }
    }

    public String toString(){
        String cpStr="";
        for(CellPhone cp: CellPhoneHashSet){
            cpStr+= "\n\tCellPhones: "
                    +cp.toString()+"\n";
        }
        return "\nHR Employee"
                +super.toString+
                cpStr;
    }

    public void calcSalary(){
        hourlySal=100;
        salary=hourlySal*workingHours;
    }

    public void calcMonthlyBonus(){
        if(workingHours>100){
            salary+=(workingHours-100)*50;

        }
