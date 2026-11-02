import java.util.Scanner;

public class TrianguloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();
        
        // Ciclo externo para las filas
        for (int i = 1; i <= n; i++) {
            // Ciclo interno para imprimir los números de 1 hasta i en cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Salto de línea al terminar cada fila
            System.out.println();
        }
        
        scanner.close();
    }
}