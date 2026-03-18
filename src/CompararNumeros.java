/**
 * @author diego
 * se aplica teorema 1 donde se definene todas las asignaciones como de O(1)
 * dado que existe un ciclo se calcula complejidad de este con 
 * teorema 3 definiendo que es de O(n)
 * aplicando teorema 2 se toma la complejidad mayor entre los bloques 
 * la cual seria la del ciclo for de O(n)
 * 
 * LA COMPLEJIDAD TOTAL SERIA DE O(n)CON UN CRECIMIENTO LINEAL
 */
import java.util.Scanner;
public class CompararNumeros {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);//asignacion O1
        int n = sc.nextInt();//asignacion O1
        for (int i = 0; i < n; i++){ // complejidad depende de t
        int a = sc.nextInt();//asignacion O1
        int b = sc.nextInt();//asignacion O1
        if (a < b){
        System.out.println("<");//asignacion O1
        } 
        else if (a>b){
        System.out.println(">");//asignacion O1
        }
        else{
        System.out.println("="); //asignacion O1
        }
    }
        sc.close();
    } 
}
