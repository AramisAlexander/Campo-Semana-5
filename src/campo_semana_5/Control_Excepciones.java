package campo_semana_5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Control_Excepciones {
    
    Scanner sc = new Scanner(System.in);
    String opcion;
    
    void Dividir() {
        
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.println("Ingresa el primer numero: ");
                int num1 = sc.nextInt();

                System.out.println("Ingresa el segundo numero: ");
                int num2 = sc.nextInt();

                int resultado = num1 / num2;
                System.out.println("El resultado de la division es: " + resultado);
                valido = true;

            } catch (ArithmeticException a) {
                System.out.println("ERROR: La division entre 0 es imposible. " + a);

            } catch (InputMismatchException i) {
                System.out.println("ERROR: Ingresaste texto en lugar de un numero. " + i);
                sc.nextLine();
            }
        }
    }
}