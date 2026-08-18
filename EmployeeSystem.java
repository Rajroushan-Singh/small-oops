class Employee{
    private int id;
    private String name;
    private double salary;
    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void displaydetails(){
        System.out.println(name);
        System.out.println(salary);
    }
    public void incsal(int p){
        if(p>0){
            salary=salary+salary*(p/100.0);
        }else{
            System.out.println("invalid percantage");
        }
    }
    public void decsal(int p){
        if(p>0){
            salary-=(salary*(p/100.0));
        }else{
            System.out.println("invalid percantage");
        }
    }
    public double getsal(){
        return salary;
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1=new Employee(1, "raj", 10000);
        e1.displaydetails();
        e1.incsal(50);
        e1.displaydetails();
        e1.decsal(45);
        e1.displaydetails();
    }
    
}
