import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            
            // Verificar si el número es par o impar
            if (numero % 2 == 0) {
                cantidadPares++;
                sumaPares += numero;
            } else {
                cantidadImpares++;
            }
        }
        
        System.out.println("\nPares: " + cantidadPares);
        System.out.println("Impares: " + cantidadImpares);
        System.out.println("Suma de pares: " + sumaPares);
        
        scanner.close();
    }
}