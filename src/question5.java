class Employee{
    String firstName;
    String lastName;
    int age;
    String designation;

    Employee(String fn,String ln,int a,String d){
        this.firstName=fn;
        this.lastName=ln;
        this.age=a;
        this.designation=d;
    }
    public String toString(){
        return firstName+" "+lastName+" is "+age+" years old.";
    }
    public void setFirstName(String fn){
        this.firstName=fn;
    }
    public void setLastName(String ln){
        this.lastName=ln;
    }
    public void setAge(int a){
        this.age=a;
    }
    public void setDesignation(String d){
        this.designation=d;
    }
}
public class question5 {
    public static void main(String[] args){
        Employee e=new Employee("Pranshu","Saluja",22,"Trainee");
        e.setAge(26);
        System.out.println(e.toString());
    }
}
