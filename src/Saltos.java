public class Saltos {
    /**
     * Saltos, trasfieren el control a otra parte del programa
     * break, continue, return
     */
    public static void main(String[] args) {
        

        //Break
        //brear detiene bucle
        // Ciclo de 0 a 9
        for (int i = 0; i < 10; i++)
        {
            // Termina el lopp en 5
            if (i == 1)
                break;

            System.out.println("i: " + i);
        }
        System.out.println("Ciclo Completado.");

/*      
        //break se utiliza como goto
        //Etiquetas para identificar bloques de codigo
        boolean t = true;
        // etiqueta
        primero:
        {
            // Illegal statement here as label second is not
            // introduced yet break second;
            segundo:
            {
                tercero:
                {
                    System.out.println("Antes del break");

                    // break will take the control out of
                    // second label
                    if (t)
                        break segundo; //cambiar
                    System.out.println("No se ejecutara.");
                }
                //Second bloque
                System.out.println("No se ejecutara");
            }

            // First bloque
            System.out.println("Esto es después del segundo bloque.");
        }
*/
/*
        //Continue - Salta ciclo actual
        for (int i = 0; i < 10; i++)
        {
            // Saltar numeros pares
            if (i%2 == 0) // 2,4,6,8,10
                continue;

            // Imprime numeros inpares
            System.out.print(i + " ");
        }
*/
/*
        //Return - Regresa el control al que llamo el metodo
        boolean b = true;
        System.out.println("Antes del regresar.");

        if (b)
            return;
            
        // El compilador omitirá todo después del return
        System.out.println("No se ejecutara.");
*/
    }

}
