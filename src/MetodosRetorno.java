public class MetodosRetorno {
    /**
     *  Metodos con valores de retorno
     *  Return se utiliza regresar valores primitivos, variables, contantes, objetos.
     *  El tipo del valor debe coincidir con el tipo se ha indicado en la declaración del método,
     */

    
    public static int multiplicacionMetodo(int x) {
        return 5 * x;
    }

    public static int sumaMetodo(int x, int y) {
        return x + y;
    }


    public static boolean validarEdadMetodo(int edad) {
        if (edad >= 18)
        return true;
    else     
        return false;
    }

    //Metodo sin valor de retorno que utiliza el valor regresado por Validar Edad
    public static void accesoMetodo(int edad, int x) {

        System.out.println(multiplicacionMetodo(x));
        boolean val= validarEdadMetodo(edad);
        if (val) {
            System.out.println("Tienes acceso al sistema");
        } else {
            System.out.println("No tienes acceso al sistema");
        }
    }

    //Metodo para sumar un arreglo
    public static int sumaArrMetodo(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum+=num[i];
        return sum;
    }


    public static void main(String[] args) {

/*         
        System.out.println(multiplicacionMetodo(5));
*/
/* 
        //Imprimiento al valor de retorno
        System.out.println(sumaMetodo(3, 7));
 */
/* 
        //Guardamos el valor en una variable
        int multiplicacion = multiplicacionMetodo(10); 
        System.out.println(multiplicacion);

        //Enviamos al metodo se suma el resultado del metodo multiplicacion en la variable multiplicacion
        int suma =sumaMetodo(multiplicacion, 90);
        System.out.println(suma); 

 */

/* 
        //Metodo vol (sin varlor de retorno) recibiendo un metodo con valor de retorno
        accesoMetodo(18, 5);
 */

        //Suma de arreglo retornando valor
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sumaArr = sumaArrMetodo(arr);
        //utilizamos el resultado de la suma del arreglo
        System.out.println(multiplicacionMetodo(sumaArr));


    }


// Realizar un metodo el cual se le envien 3 numeros enteros los compare y regrese el mayor. (utilizar if)

// validando que no soporte numeros repetidos 


}
