package Question4;
class NewCustomException extends Exception{}
public class Question4 {
    public static void main(String[] args) throws NewCustomException {
        try{
            throw new NewCustomException();
        }catch (NewCustomException e){
            System.out.println("Exception occurred");
        }
        System.out.println("Code is executed");
    }
}
