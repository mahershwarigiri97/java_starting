 import java.util.Scanner;
 
public class UserInput{

    public static void main(){

        Scanner scanner= new Scanner(System.in);
        System.out.print("tell me your name");
        String name=scanner.nextLine();
        System.out.println("hello"+name+"!");
        scanner.close();
    }
}