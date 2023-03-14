import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the file location:");
        String location=sc.nextLine();
        File f=new File(location);
        int count=0;
        String inp;
        try{
            BufferedReader br=new BufferedReader(new FileReader(f));
            System.out.println("Enter the Word to be Searched:");
            inp=sc.nextLine();
            String line;
            while((line= br.readLine())!=null){
                String words[]=line.split(" ");
                for(String word:words){
                    if(word.equalsIgnoreCase(inp)){
                        count++;
                    }
                }
            }
            System.out.println("Count of input word: "+count);
        }catch (IOException e) {
            System.out.println("File not found");;
        }
    }
}
