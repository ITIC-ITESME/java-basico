import java.util.Scanner;
public class Teclado {
    /**
     * Scanner:
     * La clase Scanner permite leer flujos de bytes desde la entrada estándar, 
     * pero también puede hacerlo desde otra fuente. Pertenece al paquete java.util.
     */

     public static void main(String[] args) {
        String mensaje;
        int numero;

        Scanner teclado = new Scanner(System.in);
/* 
        System.out.println("Ingresa un mensaje por teclado:");
        mensaje = teclado.nextLine();
        System.out.println("> "+mensaje);
 */

        System.out.println("Ingresa un mensaje por teclado:");
        numero = teclado.nextInt();
        teclado.nextLine(); // genera un salto de linea
        System.out.println("> "+numero);
        teclado.close();
        
     }

}
