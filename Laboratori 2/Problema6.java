import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Leemos toda la línea porque es una secuencia de caracteres
        String linea = s.nextLine();
        
        int contador = 0;
        boolean correcto = true;
        
        for (int i = 0; i < linea.length() && correcto; i++) {
            char c = linea.charAt(i);
            if (c == '(') {
                contador++;
            } else if (c == ')') {
                contador--;
                if (contador < 0) correcto = false;
            }
        }
        
        if (correcto && contador == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        s.close();
    }
}