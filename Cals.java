import java.util.Scanner;

public class Cals 
{
    public static void main(String[] args) 
  {

    Scanner scan = new Scanner(System.in);
    int choice;
    
    do {
        System.out.println("Please enter A number");
        int a = scan.nextInt();
        System.out.println("Please enter B number");
        int b = scan.nextInt();
        System.out.println("Please select operaion");
        
        System.out.println("1. Addition");
        System.out.println("2. Substration");
        System.out.println("3. Mutiplication");
        System.out.println("4. Division");
        System.out.println("Press 5 for end");
        
        choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if(a == 0 || b == 0){
                    System.out.printf("Division will not workout");
                } else{
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    } while (choice != 5);
    
    System.out.println("Thanks for using calculator");
}
}
