import java.util.Scanner;

public class AnalisisSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double planillaTotal = 0;
        double mayorSueldo = Double.MIN_VALUE;
        double menorSueldo = Double.MAX_VALUE;
        int contMasDe2500 = 0;
        
        // Bucle para registrar los sueldos de los 25 trabajadores
        for (int i = 1; i <= 25; i++) {
            System.out.print("Ingrese el sueldo del trabajador " + i + ": S/ ");
            double sueldo = scanner.nextDouble();
            
            // Acumular la planilla total
            planillaTotal += sueldo;
            
            // Determinar el mayor sueldo
            if (sueldo > mayorSueldo) {
                mayorSueldo = sueldo;
            }
            
            // Determinar el menor sueldo
            if (sueldo < menorSueldo) {
                menorSueldo = sueldo;
            }
            
            // Contar trabajadores que ganan más de S/ 2500
            if (sueldo > 2500) {
                contMasDe2500++;
            }
        }
        
        // Calcular el sueldo promedio
        double sueldoPromedio = planillaTotal / 25;
        
        // Mostrar los resultados finales
        System.out.println("\nPlanilla total: S/ " + planillaTotal);
        System.out.printf("Promedio: S/ %.2f\n", sueldoPromedio);
        System.out.println("Mayor sueldo: S/ " + mayorSueldo);
        System.out.println("Menor sueldo: S/ " + menorSueldo);
        System.out.println("Trabajadores con sueldo > S/2500: " + contMasDe2500);
        
        scanner.close();
    }
}