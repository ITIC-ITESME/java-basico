public class TiposDatos {
    /**
     * Este se considera un comentario de varias lineas.
     * El cual será de vital importancia cuando se pida a la
     * herramienta java.doc que genere la documentación
     * correspondiente a la clase que tenga este comentario.
     */
    public static void main(String[] args) {
        //Esto es un comentario de una linea

        System.out.println("Tipos de datos: ");
        
        /* Esto se considera un comentario de varias lineas,
        no importa que se haya cambiado de linea, continua
        el comentario  */ 
/*     
    //Byte, 1 byte (8 bits)
        byte b = 126;
        //Valores -128 to 127
        
        System.out.println("byte: " +b);
        b++; //+1
        System.out.println("byte: " +b);
        
        // Overflow
        b++;
        System.out.println("byte: " +b);
        // Loop
        b++;
        System.out.println("byte: " +b);

        // Se utiliza si la memoria es reducida.
        //los tipos de datos tienen este tope y loop


    //Short, 2 byte ( 16 bits )
        short s = 56;

    //Int, 4 byte ( 32 bits )
        // usado generalmente para valores numéricos
        int i = 89;
      
    //Long, 8 byte ( 64 bits )
        long l = 897;
  


        
    //Double, 8 byte ( 64 bits ), 
        //default para punto flotante en java
        double d = 4.355453532;
  
    //Float, 4 byte ( 32 bits )
        // se utiliza 'f' como sufijo
        float f = 4.7333434f;
  
        System.out.println("short: " + s);
        System.out.println("integer: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
 
     */
/*     //Boolean (true o false)
        boolean booleanVar = false;
        if (!booleanVar) {
            System.out.println(booleanVar);
            System.out.println("Esto fue verdadero");
        }
     */
/* 
    //Char, 2 byte ( 16 bits )
        // declaring character
        char c = 'A';
        System.out.println("char: " + c);
        c = '1';
        System.out.println("char: " + c);
 */

    //String, Memoria variable, No primitivo, se comporta como un objeto.

        String str = "Cadena de caracteres"; 
        System.out.println("string: " + str);
        System.out.println(str.length());

        for(int x=0;x <str.length(); x++){
            System.out.println("carácter "+str.charAt(x)+" indice "+str.indexOf(str.charAt(x)));
        }

    }
}
