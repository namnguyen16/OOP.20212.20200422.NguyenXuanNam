import java.util.Scanner;
import java.text.DecimalFormat;
public class ex226 {
    public static void main(String[] args) {
        int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Number a: ");
        aNumber = scanner.nextInt();
        System.out.println("Number b: ");
        bNumber = scanner.nextInt();
        System.out.println("Equation: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("the equation has no solution.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;  
            System.out.println("the equation has a solutionx = " + decimalFormat.format(nghiem) + ".");
        }
    }
}
