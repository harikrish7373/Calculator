import java.util.Scanner;


public class Cals {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter A number");

    int a = scan.nextInt();
    System.out.println("Please enter B number");
    int b = scan.nextInt();
    System.out.println("Please select operaion");
        
    System.out.println("1. Addition");
    System.out.println("2. Substration");
    
    

    int choice = scan.nextInt();

    
    switch (choice) {
        case 1:

                System.out.println(a + b);
            
            
            break;
    

        case 2:

                System.out.println( a - b);


        
            break;

            default:
    }




        
    }
}
