import java.util.Scanner;

public class RegistroEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int edadMayor = Integer.MIN_VALUE;
        int edadMenor = Integer.MAX_VALUE;
        int mayoresDeEdad = 0;
        int menoresDeEdad = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();
            
            // Determinar la edad mayor
            if (edad > edadMayor) {
                edadMayor = edad;
            }
            
            // Determinar la edad menor
            if (edad < edadMenor) {
                edadMenor = edad;
            }
            
            // Contar mayores y menores de edad (considerando 18 años como límite)
            if (edad >= 18) {
                mayoresDeEdad++;
            } else {
                menoresDeEdad++;
            }
        }
        
        System.out.println("\nEdad mayor: " + edadMayor);
        System.out.println("Edad menor: " + edadMenor);
        System.out.println("Mayores de edad: " + mayoresDeEdad);
        System.out.println("Menores de edad: " + menoresDeEdad);
        
        scanner.close();
    }
}