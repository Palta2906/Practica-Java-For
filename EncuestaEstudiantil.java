import java.util.Scanner;

public class EncuestaEstudiantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int votosExcelente = 0;
        int votosBueno = 0;
        int votosRegular = 0;
        int votosMalo = 0;
        
        for (int i = 1; i <= 30; i++) {
            System.out.print("Estudiante " + i + " - Ingrese su opción (1=Excelente, 2=Bueno, 3=Regular, 4=Malo): ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    votosExcelente++;
                    break;
                case 2:
                    votosBueno++;
                    break;
                case 3:
                    votosRegular++;
                    break;
                case 4:
                    votosMalo++;
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese un número del 1 al 4.");
                    i--; // Repetir la iteración para este estudiante si el valor es incorrecto
                    break;
            }
        }
        
        System.out.println("\n--- Resultados de la Encuesta ---");
        System.out.println("Excelente: " + votosExcelente);
        System.out.println("Bueno: " + votosBueno);
        System.out.println("Regular: " + votosRegular);
        System.out.println("Malo: " + votosMalo);
        
        // Determinar la opción más votada
        int maxVotos = Math.max(Math.max(votosExcelente, votosBueno), Math.max(votosRegular, votosMalo));
        
        System.out.print("\nOpción más votada: ");
        if (maxVotos == votosExcelente) {
            System.out.println("Excelente (" + votosExcelente + " votos)");
        }
        if (maxVotos == votosBueno) {
            System.out.println("Bueno (" + votosBueno + " votos)");
        }
        if (maxVotos == votosRegular) {
            System.out.println("Regular (" + votosRegular + " votos)");
        }
        if (maxVotos == votosMalo) {
            System.out.println("Malo (" + votosMalo + " votos)");
        }
        
        scanner.close();
    }
}