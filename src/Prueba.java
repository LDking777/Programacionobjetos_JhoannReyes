import java.io.PrintStream;
import java.util.Scanner;

public class Prueba { 
	static Scanner input = new Scanner(System.in);
    static PrintStream output = System.out; 
    public static void main(String[] args) {
        int trimestre1 = 0;
        int trimestre2 = 0;
        int tri1tri2 = 0;

        System.out.println("Ingrese la nota del trimestre 1");
        trimestre1 = input.nextInt();
        System.out.println("Ingrese la nota del trimestre 2");
        trimestre2 = input.nextInt();

        output.println();

        tri1tri2 = trimestre1 + trimestre2;

        if (tri1tri2 >= 7) {
            System.out.println("USTED APROBO");
        } else {
            System.out.println("USTED PERDIO");
        }

         output.println();

        if (tri1tri2 >= 5 && tri1tri2 < 7) {
            System.out.println("TIENE DERECHO A SUPLETORIO");
        }
    }
}
