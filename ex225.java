import java.util.Scanner;
public class ex225 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        if (secondInt == 0) {
                System.out.println("Số bị chia phải khác 0.");
            } else {
                System.out.println("Quotient of two integers: " + (float) firstInt / secondInt);
            }
        
    }
}
