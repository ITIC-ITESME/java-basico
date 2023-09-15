public class MetodosSobrecarga {
    /**
     * Sobrecarga - overloading
     * sobrecarga de métodos, varios métodos pueden tener el mismo nombre con diferentes parametros
     * tipos o numeros de ellos.
     * 
     */
    //Método suma con 2 parámetros Int
    public static int sumaMetodo(int x, int y) {
        return x + y;
    }
    //Metodo suma con 2 parámetros Double
    public static double sumaMetodo(double x, double y) {
        return x + y;
    }

    //Método suma con 3 parámetros Int
    public static int sumaMetodo(int x, int y, int z) {
        return x + y + z;
    }

    //Metodo suma con 3 parámetros Double
    public static double sumaMetodo(double x, double y, double z) {
        return x + y + z;
    }


    //Metodo sobre cargado con cadena - solo es un ejemplo
    public static int sumaMetodo(String x, String y ) {
        if (x.length() > y.length())
        return 1;
    else     
        return 2;
    }

    public static String sumaMetodo(String x, String y, String z) {
        return x + y + z;
    }

    public static int sumaMetodo(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum+=num[i];
        return sum;
    }

        //? operador terciario - Si no
            //boolean_statement ? true result : false result; 
    public static int mayorN (int a, int b) {
        return a>b ? a : b;
    }

    public static int mayorN (int a, int b, int c) {
        return mayorN(mayorN(a, b), c);
    }


    //Mostrar ejemplo de multiplicación Metodo
    
    public static void main(String[] args) {
/* 
        int num1 = sumaMetodo(8, 5);
        double num2 = sumaMetodo(4.3, 6.26);
        System.out.println("int: " + num1);
        System.out.println("double: " + num2);


        int num3 = sumaMetodo(8, 5, 4);
        System.out.println("int con 3 parámetros: " + num3);
        double num4 = sumaMetodo(8.5, 5.5, 2.6);
        System.out.println("int con 3 parámetros: " + num4); 


        String retorno= sumaMetodo("Hola ", "Mundo","!");
        System.out.println(retorno);
 */
/* 
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int arrSuma = sumaMetodo(arr);
        //utilizamos el resultado de la suma del arreglo
        System.out.println(arrSuma);
 */

        //Demostración sin guardar valor
        System.out.println("El numero mayor es "+mayorN(8, 11));
        System.out.println("El numero mayor es "+mayorN(8,7,9));


    }

    // Realizar otro método de mayorN (sobrecargarlo) de 4 números, tomando como base el mostrado.


/* 
    TAREA
    Realizar un programa que utilice metodos que solicite la cantidad de elementos que tendra
    un arreglo y despues agregarlos por teclado, que se imprima el arreglo elementos por elemento
    tambien poder utilizar metodo de suma de arreglo con el arreglo creado e impreso.
*/

}
