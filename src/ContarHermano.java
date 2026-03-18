
import java.util.Scanner;


/**
 *
 * @author diego
 */
public class ContarHermano {
        public static int contarCoincidencias(String palabra, String referencia, int i) {
        if (i == palabra.length()) {
            return 0;
        }

        if (palabra.charAt(i) == referencia.charAt(i)) {
            return 1 + contarCoincidencias(palabra, referencia, i + 1);
        } else {
            return contarCoincidencias(palabra, referencia, i + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            String palabra = sc.nextLine();

            if (palabra.length() == 5) {
                System.out.println(3);
            } else {

                int coincidencias = contarCoincidencias(palabra, "one", 0);

                if (coincidencias >= 2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }

        sc.close();
    }
    

    
}
