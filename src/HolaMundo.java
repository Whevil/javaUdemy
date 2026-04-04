/**
 * @author diego
 * segun el teorema 1 la complejidad de todas las asignaciones es igual
 * a O(1)
 * segun el teorema dos se toma la mayor complejidad de entre los bloques
 * con lo cual se calcula la complejida del ciclo for como de O(n)
 * calculada con el teorema 3, asi pues la complejidad de todo el 
 * codigo es de O(n)
 * 
 * COMPLEJIDAD TOTAL DE O(n)
 */
import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// asignacion O1
        int n = sc.nextInt();// asignacion O1
        sc.nextLine();
        for(int j = 0; j < n; j++){// ciclo depende de J seria de O(n)
            String hermano = sc.nextLine();// asignacion O1
            if(hermano.length() == 5){// asignacion O1
                System.out.println(3);// asignacion O1
            }
            else{
                int concuerdan = 0;
                String uno = "one";
                for (int i = 0; i < 3; i++){// ciclo se repite siempre 3 veces O1

                    if(hermano.charAt(i) == uno.charAt(i)){
                        concuerdan++;// asignacion O1
                    }
                }
                if(concuerdan >= 2){
                    System.out.println(1);// asignacion O1
                }
                else{
                    System.out.println(2);// asignacion O1
                }
            }
        }
        sc.close();
    }
}

// comentario ejemplo para cambio

