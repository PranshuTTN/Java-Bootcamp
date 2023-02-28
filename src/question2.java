import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inp="";
        while(true){
            System.out.println("Enter text: ");
            inp = scn.nextLine();
            if(inp.equals("XDONE")){
                break;
            }

        }
    }
}
