public class Metodos {
/**
 *  Métodos o Funciones 
 *  Método, bloque de código que solo se ejecuta cuando se llama.
 *  Se utilizan para realizar ciertas "acciones"
 *  Puede pasar datos (parámetros) a un método y este regresar datos.
 * 
 *  REUTILIZACIÓN DE CÓDIGO: definir el código una vez y utilizarlo muchas veces.
 * 
 *  También se utilizan en POO
 */

        // static, método pertenece a la clase y no a un objeto de la clase.
        // void, este método no tiene un valor de retorno. 
        // nombre() nombre del método.
    public static void metodo(){
        System.out.println("Métodos en java");
    }

/*
    [Modificador de acceso] [Otros modificadores] Valor_retorno nombreMetodo (parámetros){
    Instrucciones
    [return valor;]
    }
*/  

    //  PARÁMETROS
        //  Información se puede pasar a los métodos como parámetro. 
        //  Los parámetros actúan como variables dentro del método.
    
    public static void metodoParametro(String nombre) {
        System.out.println("Hola " + nombre + " este metodo tiene un parametro");
    }

    // Multiples parametros
    public static void metodoParametros(String nombre, int n, boolean b) {
        System.out.println("Hola " + nombre + " este metodo tiene dos parametros. string y un numero "+n+" un bool "+b);
    }


    //Método con if
    public static void verificarEdad(int age) {
        if (age < 18){
            System.out.println("Acceso denegado");
            return;
        }
        else     
            System.out.println("Acceso concebido");
    }


    // Método que realiza una suma de arreglo
    public static void sumaArrMetodo(int[] num, int age){
        verificarEdad(age);
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum+=num[i];
        System.out.println("suma de valores de arreglo: " + sum);
    }


    public static void main(String[] args) {

        // Ejemplo de metodo
        metodo();

/* 
        // Metodo con un parametro
        metodoParametro("Ilse");
        metodoParametro("Jahaziel");
        metodoParametro("Leti");
        metodoParametro("Norberto"); 
 */

/* 
        
        // Metodo con varios parametros
        metodoParametros("Ilse", 1,false);
        metodoParametros("Jahaziel", 2,false);
        metodoParametros("Leti", 3,true);
        metodoParametros("Norberto", 4,false);
 */
/* 
        verificarEdad(15);
*/
/* 
        // Reutilizacion de codigo en arreglo
        int[] arr = {0,10};
        sumaArrMetodo(arr,10);

        int[] arr1 = {1,10};
        sumaArrMetodo(arr1,10);

        int[] arr2 = {2,10};
        sumaArrMetodo(arr2,10);

        int[] arr3 = {3,10};
        sumaArrMetodo(arr3,10);
 */
        

    }

    // Realizar un metodo el cual se le envié una dos parámetros enteros y realice una multiplicación con estos y los imprima.
}
