public class ITEmployee extends Employee{
    private String typeOfSW;
    private String typeOfProgrammingLanguage;

    public ITEmployee(){
        super();
    }

    public void getInput(){
        Scanner sc= new Scanner(System.in);
        super.getInput();
        System.out.print("\nEnter the type of software that is used by the IT employee: ");
        typeOfSW=sc.nextLine();
        System.out.print("\nEnter the type of programming language that is used by IT employee: ");
        typrOfProgrammingLanguage=sc.nextLine();
        Computer comp= new Computer();
        comp.getInput();

    }

    public String toString(){

        return "\nIT Employee: "
                +super.toString()
                +"\nType of SW: "+typeOfSW
                +"\nType of Programming Language: "+typeOfProgrammingLanguage
                +"\n\tComputer Information: "
                +comp.toString();
    }



}
