package Question2;

public class Question2 {
    public static void main(String[] args){
        try{
            int a[] = new int[7];
            System.out.println(a[20]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound Exception occurs");
        }catch (Exception e){
            System.out.println("Exception occurs");
        } finally {
            System.out.println("Code is executed");
        }
    }
}
