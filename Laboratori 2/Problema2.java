import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int d = s.nextInt();   // Dígito a buscar (0-9)
        int n = s.nextInt();   // Número estrictamente positivo
        
        boolean encontrado = false;
        
        while (n > 0) {
            int digito = n % 10;
            if (digito == d) {
                encontrado = true;
                break;         // Podemos detener la búsqueda
            }
            n = n / 10;
        }
        
        if (encontrado) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        s.close();
    }
}