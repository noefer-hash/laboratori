import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String p = s.next();                     // Palabra a buscar
        boolean encontrado = false;
        
        while (s.hasNext()) {
            String palabra = s.next();
            if (palabra.equals(".")) break;
            
            if (palabra.equals(p)) {
                encontrado = true;
                break;
            } else if (palabra.compareTo(p) > 0) {
                // Ya hemos pasado donde debería estar p → no existe
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        s.close();
    }
}
