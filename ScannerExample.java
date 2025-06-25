import java.util.Scanner; // ✅ Correct import

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt(); 

        System.out.println("\nUSER DETAILS:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        sc.close(); 
    }
}
