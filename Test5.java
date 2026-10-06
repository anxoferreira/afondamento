import Biblioteca.Basicas;

public class Test5 {

    public static void main(String[] args) {

        System.out.println("Introduce la primera matriz:");
        int[][] array1 = Basicas.fillFromKeyboard(2, 2);
        System.out.println("Matriz 1:");
        Basicas.print2DArray(array1);
        System.out.println("Introduce la segunda matriz:");
        int[][] array2 = Basicas.fillFromKeyboard(2, 2);
        System.out.println("Matriz 2:");
        Basicas.print2DArray(array2);

        // hacer suma de 2 arrays
        int[][] suma = Basicas.sumaArrays(array1, array2);
        System.out.println("Suma de las matrices:");
        Basicas.print2DArray(suma);

        // hacer resta de 2 arrays
        int[][] resta = Basicas.restaArrays(array1, array2);
        System.out.println("Resta de las matrices:");
        Basicas.print2DArray(resta);

    }

}