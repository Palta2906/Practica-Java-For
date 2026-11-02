import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();
        
        int suma = 0;
        
        System.out.print("Secuencia: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            suma += i;
        }
        
        System.out.println("\n\nCantidad: " + n);
        System.out.println("Suma: " + suma);
        
        scanner.close();
    }
}