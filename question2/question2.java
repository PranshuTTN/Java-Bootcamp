package question2;
interface createDefault{
    default void showInfo(){
        System.out.println("Default Method of an interface created");
    }
}
interface createStatic{
    static void showInfo(){
        System.out.println("Static Method of an interface created");
    }
}
public class question2 {
    public static void main(String[] args) {
        createDefault cd = new createDefault(){};
        cd.showInfo();
        createStatic.showInfo();
    }
}
