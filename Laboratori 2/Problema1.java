import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            boolean tienePar = false;                // Inicializamos como no encontrado
            
            while (s.hasNextInt()) {
                int x = s.nextInt();
                if (x == 0) break;                   // Fin de secuencia
                
                if (x % 2 == 0) {                    // Comprobamos propiedad
                    tienePar = true;
                    // Podemos hacer break aquí para optimizar, pero no es obligatorio
                    // break;
                }
            }
            
            if (tienePar) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
