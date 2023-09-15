public class Seleccion {
    /**
     * Estructuras de selección 
     * if, if-else, if-elseif
     * switch-case
     */
    public static void main(String[] args) {
   
/*     boolean b1 = true;     
    if (b1){
        System.out.println("Esto fue verdadero");
        System.out.println("Estoy dentro del if");
    }


    boolean b2= false;
    if(b2)
        System.out.println("Esto fue verdadero");
        System.out.println("No estoy dentro del if");
     */

/*     int i=6;
    if (i != 15)
        System.out.println("Es correcto");
 */
/*         int i=6;
        if (i < 15)
            System.out.println("i es menor que 15");
            //System.out.println("No estoy dentro del if"); error de sintaxis
        else
            System.out.println("i es mayor que 15");
   
        //Solo una linea

      */
/*         int i = 100;
        if (i >= 10)
            System.out.println("i es 10");
        else if (i == 5)
            System.out.println("i es 15 primero");
        else if (i == 1)
            System.out.println("i es 20 segundo");
        else
            System.out.println("i no esta dentro del if");
 */
   /*     
        //Con numeros
        int i = 0;
        switch (i)
        {
        case 0:
            System.out.println("i es cero.");
            break;
        case 1:
            System.out.println("i es uno.");
            break;
        case 2:
            System.out.println("i es dos.");
            break;
        default:
            System.out.println("i es mas grande que 2.");
        }
  */
        /*

        //Con dias
            
        int dia = 2;
        String diaString;
            
        switch (dia) {
        case 1:
            diaString = "Lunes";
            break;
        case 2:
            diaString = "Martes";
            break;
        case 3:
            diaString = "Miercoles";
            break;
        case 4:
            diaString = "Jueves";
            break;
        case 5:
            diaString = "Viernes";
            break;
        case 6:
            diaString = "Sabado";
            break;
        case 7:
            diaString = "Domingo";
            break;
        default:
            diaString = "Dia invalido";
        }
        System.out.println(diaString);
        
        //break es opcional, la ejecución continuará en el siguiente caso.
        String diaGrupo;
        // Casos multiples sin break
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                diaGrupo = "Entre semana";
                break;
            case 6:
            case 7:
                diaGrupo = "Fin de semana";
                break;
        
            default:
                diaGrupo = "Dia invalido";
            }
        
            System.out.println(diaString + " es " + diaGrupo);
        */
  
    //Con Letras
    // Case anidado
    String str = "Tres";
    char c ='c';
    switch(str)
    {
        case "Uno":
            System.out.println("Uno");
            break;
        case "Dos":
            System.out.println("Dos");
            break;
        case "Tres":
            switch (c) {
                case 'x':
                System.out.println("Tres y X");
                    break;
                default:
                System.out.println("Tres");
                    break;
            }
        break;
        default:
            System.out.println("No encontrado");
    }

    }
}
