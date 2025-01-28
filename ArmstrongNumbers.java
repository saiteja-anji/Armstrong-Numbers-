import java.util.Scanner;

public class ArmstrongNumbers {

    
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();
        
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        
        return sum == originalNumber; 
    }

   
    public static void printArmstrongNumbersInRange(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        
       
        printArmstrongNumbersInRange(start, end);
        
       
        scanner.close();
    }
}