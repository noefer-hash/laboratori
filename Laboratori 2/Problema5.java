import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String palabra = s.next();               // Primera palabra
        int actual = 1;
        int maximo = 1;
        
        while (s.hasNext()) {
            String siguiente = s.next();
            if (siguiente.equals(".")) break;
            
            if (siguiente.equals(palabra)) {
                actual++;
                if (actual > maximo) maximo = actual;
            } else {
                actual = 1;
            }
        }
        
        System.out.println(maximo);
        s.close();
    }
}
