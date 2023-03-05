import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("Enter first name: ");
            String fn = scn.nextLine();
            System.out.println("Enter last name: ");
            String ln = scn.nextLine();
            System.out.println("Enter age: ");
            int a = scn.nextInt();
            System.out.println("Enter phone number: ");
            long p = scn.nextLong();
            user s = new user(fn,ln,a,p);
            try{
                BufferedWriter bw=new BufferedWriter(new FileWriter("details.txt",true));
                bw.write(s.toString());
                bw.newLine();
                bw.close();
            }catch(IOException e){
                System.out.println("Unable to write data in file");
            }
            System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
            String inp = scn.next();

            if(inp.equalsIgnoreCase("QUIT"))
            {
                break;
            }
        }

    }
}
class user{
    private String firstName,lastName;
    private int age;
    private long phoneNumber;
    user(String firstName,String lastName,int age,long phoneNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }
    public String toString(){
        return "Name: " + firstName +" "+ lastName +
                ", Age: " + age + ", Phone Number is " + phoneNumber;
    }
}