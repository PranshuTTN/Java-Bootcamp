package question2;
interface create{
    default void showDefault(){
        System.out.println("Default Method of an interface created");
    }
    static void showStatic(){
        System.out.println("Static Method of an interface created");
    }
}
public class question2 {
    public static void main(String[] args) {
        create c = new create(){};
        c.showDefault();
        create.showStatic();
    }
}
