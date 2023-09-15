public class Arreglos {
    /**
     * Array, Arreglo (Vector, Matriz)
     * Un Array es un grupo de variables con tipo similar a las que hace referencia un nombre común.
     * Puede contener datos primitivos (también String) y Objetos
     * Java las trata como objetos por eso tienen método
     */
    public static void main(String[] args) {

        //Arreglos
          //Declaracion y Asignacion de arreglo literal
        int[] intArreglo = new int[]{ 1,2,3,4,5,6,7,8,9,10,100};
            // int[] intArr = {1,2,3,4,5,6,7,8,9,10}; //Otra forma de declarar

        System.out.println("Elemento: "+intArreglo[0]); // ¿Que imprime?
        System.out.println("Elemento: "+intArreglo[9]); // ¿Que imprime?
        
        System.out.println("El arreglo tiene "+intArreglo.length+" elementos");

        //Ciclo for para recorrer arreglo
             System.out.println(""); // Espacio
        for (int i = 0; i < intArreglo.length; i++)
            System.out.println("Indice: " + i + " Elemento: "+ intArreglo[i]);

/*
       // Declaracion y Asignacion de arreglo vacio
        int[] arr = new int[5]; 

         // Inicializar primero elemento
        arr[0] = 10;

         // inicializar segundo elemento
        arr[1] = 20;

         //...3,4,5
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        
        //Para imprimir (solo lectura) colecciones y/o arreglos
            //variable: Coleccion
        for (int e:arr){
            System.out.println("Elemento: " + e);
        }

        System.out.println("Espacio");
        for (int i = 0; i < arr.length; i++){
            System.out.println("Indice: " + i + " Elemento: "+ arr[i]);
            }
*/
/*
        //Valores defaul de arreglos
        System.out.println("String array valor default:");
        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");
                
        System.out.println("\n\nInteger array valor default:");
        int num[] = new int[5];
        for (int val : num)
            System.out.print(val + " ");
                
        System.out.println("\n\nDouble array valor default:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");
                
        System.out.println("\n\nBoolean array valor default:");
        boolean bool[] = new boolean[5];
        for (boolean val : bool)
            System.out.print(val + " ");
*/              
/*
        //Agregar elementos arreglo e imprimirlo
        //Definimos un arreglo con 10 posiciones
        int num[]=new int [10];
        
        //Recorremos el array y agregamos elemetos
        for (int i=0, multiplo=5; i<num.length; i++, multiplo+=5){
            num[i]= multiplo;
            //System.out.println(num[i]);
        }


        // Suma de arreglo
        int sum = 0;

        for (int i = 0; i < num.length; i++)
            sum+=num[i];

        System.out.println("suma de valores en arreglo: " + sum);
*/
        //Capturar "n" numeros en un arreglo y otro para realizar la suma de estos "n" numeros, utilizar for
        //Preguntar la cantidad a ingresar,cual es el tamaño del arreglo

    }
}
