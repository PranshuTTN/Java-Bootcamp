interface A{
    void show(String name);
}
class Print{
    Print(String name){
        System.out.println("Hello "+name);
    }
}
public class question4 {
    public static void main(String[] args) {
        A objA = Print::new;
        objA.show("Pranshu");
    }
}
