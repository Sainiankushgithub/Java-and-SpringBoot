class Employee{
    static String comapny ="Infosys";
    String name;
    int empId;
    public void setName(String name){
        this.name=name;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public static void show(Employee e){
        System.out.println("EmpId : "+e.empId);
        System.out.println("Name : "+e.name);
        System.out.println("Company : "+comapny);
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(2207409);
        e.setName("Ankush");
//        'show' method belongs to class not to object
        Employee.show(e);
    }
}
