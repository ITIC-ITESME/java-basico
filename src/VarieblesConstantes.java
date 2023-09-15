public class VarieblesConstantes {
    /**
     * Variable: contiene un valor que puede cambiar a lo largo del programa. 
     * - datos primitivos (int, char, bool,etc)
     * - referencia (arreglos, objetos)
     * Constante: no puede ser modificado.
     */
    public static void main(String[] args) {
    //Declarando 
    //Variables
        int n1;
        double area = 0;
    //Constantes en MAYÚSCULAS
        final double PI = 3.1416;
        
    //Asignando variable
        n1 = 15;
    
    //Area circulo
        area=PI*n1*n1; // 3.14*15*15
        
        System.out.println("Area de circulo: "+area+" Valor "+n1);

        
    //Cambiando valor constante
       PI=5; 

    //Cambiando valor a variable
        n1=18;//
    
        area=PI*n1*n1; //3.14*18*18

        System.out.println("Area de circulo: "+area+" Valor "+n1);

    }
}
