import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String shape = scn.next();

        switch (shape) {
            case "triangle":
                double a = scn.nextDouble();
                double c = scn.nextDouble();
                System.out.println((a/2)*c);
                break;
            case "rectangle":
                a = scn.nextDouble();
                double b = scn.nextDouble();
                System.out.println(a*b);
                break;
            case "circle":
                double r = scn.nextDouble();
                double power = Math.pow(r, 2);

                System.out.println(3.14 *power);

                break;
            default:
                System.out.println("error");
        }
    }
}
