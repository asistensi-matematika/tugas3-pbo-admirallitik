package packageAsistensi4;
import java.util.Scanner;

public class LinearEquationMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation lq = new LinearEquation(a, b, c, d, e, f);
        System.out.println("\nOutput : ");
        lq.printInfo();
        lq.cekSolusi();
    }
}
