
import java.util.*;
public class OperacionesConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> conjunto2 = new HashSet<>();

        // 1. Pedir al usuario dos conjuntos de números enteros
        System.out.print("Ingrese la cantidad de elementos del primer conjunto: ");
        int cantidad1 = scanner.nextInt();
        System.out.println("Ingrese los elementos del primer conjunto:");
        for (int i = 0; i < cantidad1; i++) {
            conjunto1.add(scanner.nextInt());
        }

        System.out.print("Ingrese la cantidad de elementos del segundo conjunto: ");
        int cantidad2 = scanner.nextInt();
        System.out.println("Ingrese los elementos del segundo conjunto:");
        for (int i = 0; i < cantidad2; i++) {
            conjunto2.add(scanner.nextInt());
        }

        // 3. Calcular y mostrar la unión, intersección y diferencia
        HashSet<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);

        HashSet<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        HashSet<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);

        System.out.println("\nUnión de los conjuntos: " + union);
        System.out.println("Intersección de los conjuntos: " + interseccion);
        System.out.println("Diferencia (conjunto1 - conjunto2): " + diferencia);

        scanner.close();
    }
}
