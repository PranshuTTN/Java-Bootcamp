package Question3;

public class Question3 {
    public static void main(String[] args){
//        Test t = new Test();
        try{
            Class.forName("Test");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
