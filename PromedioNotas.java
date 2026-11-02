import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumaNotas = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + i + ": ");
            double nota = scanner.nextDouble();
            
            sumaNotas += nota;
            
            // Evaluar si es la nota mayor
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            
            // Evaluar si es la nota menor
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        
        double promedio = sumaNotas / 10;
        
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Mayor nota: " + notaMayor);
        System.out.println("Menor nota: " + notaMenor);
        
        scanner.close();
    }
}