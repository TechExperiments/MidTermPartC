package midtermexam_versiona_extensioncode;
import java.util.Scanner;

public class TestUserprofile {

 public static void main(String []args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Please input your name");
    String name = scan.nextLine();
    System.out.println("Do you want: Comedy,Drama,Action,Mystery");
    String genre = scan.nextLine();

    System.out.println("user profile sucessfully created");

 }
}
