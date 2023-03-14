
class Singleton{
    private static Singleton Database;
    private Singleton(){}
    public static Singleton getInstance(){
        if(Database==null){
            Database = new Singleton();
        }
        return Database;
    }
    public void getInfo(){
        System.out.println("Database connection established");
    }
}
public class Question5 {
    public static void main(String[] args) {
        Singleton Database;
        Database = Singleton.getInstance();
        Database.getInfo();
    }
}
