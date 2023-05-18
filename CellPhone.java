public class CellPhone {
private String phoneBrand;
private int memory;

public CellPhone(){

}

public void getInput(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\nEnter the cell phone brand that is used by the HR Employee: ");
    phoneBrand=sc.next();
    System.out.print("\nEnter the memory of the cell: ");
    memory=sc.next();
}

public String toString(){
    return "\n\tPhone brand: "+phoneBrand
            +"\n\tMemory: "+memory;
}
}
