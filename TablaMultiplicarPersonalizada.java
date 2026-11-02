import java.util.Scanner;

public class TablaMultiplicarPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número para la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        int sumaTotal = 0;
        
        for (int i = 1; i <= 15; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            sumaTotal += resultado;
        }
        
        System.out.println("Suma total = " + sumaTotal);
        scanner.close();
    }
}