package lab.colecciones;

import java.util.List;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        /*
        Las diferencias entre un array y un ArrayList son:
                1. Tamaño: Los arrays tienen un tamaño fijo, mientras que los ArrayLists pueden crecer o reducirse dinámicamente.
                2. Tipos de datos: Los arrays pueden contener tipos primitivos y objetos, mientras que los ArrayLists solo pueden contener objetos.
                3. Métodos: Los ArrayLists proporcionan métodos útiles como add(), remove(), y contains(), mientras que los arrays no.
                4. Rendimiento: Los arrays suelen ser más rápidos y eficientes en términos de memoria que los ArrayLists.
        */
        System.out.println("----------- Demostración de Arrays -----------");
        // Crear un array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Crear un array vacío especificando su tamaño:
        int[] otrosNumeros = new int[5];

        // Crear un array vacío y luego asignar valores a sus elementos
        String[] otrosNombresString = new String[5];
        otrosNombresString[0] = "Ana";
        otrosNombresString[1] = "Luis";
        otrosNombresString[2] = "Marta";
        otrosNombresString[3] = "Carlos";
        otrosNombresString[4] = "Elena";

        // Obtener el tamaño del array
        int tamaño = numeros.length;
        
        // Recorrer el array con un bucle for-each
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Recorrer el array con un bucle for tradicional
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        // Copiar un array con System.arraycopy()
        String[] nombres = {"Alfredo", "Pedro", "Juan"};
        String[] copiaNombres = new String[nombres.length];
        System.arraycopy(nombres, 0, copiaNombres, 0, nombres.length);
        // Argumentos:
        // - array de origen
        // - índice de inicio en el array de origen
        // - array de destino
        // - índice de inicio en el array de destino
        // - cantidad de elementos a copiar


        // Copiar un array con Arrays.copyOf()
        String[] copiaNombres2 = Arrays.copyOf(nombres, nombres.length);
        // Argumentos:
        // - array de origen
        // - cantidad de elementos a copiar (nuevo tamaño del array)

        // Transformar un array en una lista con Arrays.asList()
        List<String> listaNombres = Arrays.asList(nombres);

        // Verificar si la lista contiene un elemento con List.contains()
        listaNombres.contains("Pedro"); // Salida: true

        // Rellenar un array con un valor específico con Arrays.fill()
        int[] arrayLleno = new int[5];
        Arrays.fill(arrayLleno, 7); // Salida: [7, 7, 7, 7, 7]
 
        // Ordenar un array con Arrays.sort()
        int[] arrayDesordenado = {5, 3, 1, 4, 2};
        Arrays.sort(arrayDesordenado); // Salida: [1, 2, 3, 4, 5]

        // Buscar un elemento en un array con Arrays.binarySearch()
        Arrays.binarySearch(arrayDesordenado, 3); // Salida: 2

        // Comparar dos arrays con Arrays.equals() 
        Arrays.equals(nombres, copiaNombres); // Salida: true
    }
}
