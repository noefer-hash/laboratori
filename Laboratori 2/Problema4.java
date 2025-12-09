import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int p = s.nextInt();
        boolean insertado = false;
        
        while (s.hasNext()) {
            if (!s.hasNextInt()) {               // Es el punto
                s.next();
                break;
            }
            
            int x = s.nextInt();
            
            if (!insertado && x >= p) {
                System.out.print(p + " ");
                insertado = true;
            }
            System.out.print(x + " ");
        }
        
        if (!insertado) {
            System.out.print(p);
        }
        System.out.println();                    // Nueva línea final
        s.close();
    }
}
