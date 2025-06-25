import java.util.Scanner; // ✅ Correct import

public class AddExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter first number:");
        Double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
       Double num2 = sc.nextDouble();

        double sum = num1 + num2;
        
        
        System.out.println("sum: " + sum);
        
        sc.close(); 
    }
}
