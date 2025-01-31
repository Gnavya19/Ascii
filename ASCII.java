import java.util.Scanner;
public class ASCII{
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("enter a character:");
        char character = Scanner.next().charAt(0);
        int ASCIIvalue =(int) character;
        System.out.println("the ASCII value of'"+ character + "' is;" + ASCIIvalue);
        Scanner.close();
    }
    
}
