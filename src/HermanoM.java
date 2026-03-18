/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 * declararlo como solo manejo de ciclos y verificando las concordancias de las cadenas de texto
 * aplicando charAT y length para el desarrollo 
 * 
 * 
 * LA COMPLEJIDAD SERIA IGUALA O(t) siendo t la cantidad de veces que se tomaran los input
 * lo demas del programa si bien son ciclos todos dependen del calculo del legth y y se
 * genera veririficacion para que solo se haga el recorrido de las cadenas si
 * el input es de de extension 3 o 5
 * 
 * 
 */

import java.util.Scanner;
public class HermanoM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int i;
        String uno = "one";
        String dos ="two";
        String tres="trhee";
        int contador = 0;
        for (i=0;i<t;i++){
            String palabra =  sc.nextLine();
            if (palabra.length()== 5){
            for (int j= 0;j < palabra.length(); j++){
                if (palabra.charAt(j)== tres.charAt(j)){
                contador++;
                    if(contador>=3){
                        System.out.println("3");
                        contador = 0;
                        break;
                    }
                }
            }
            }
                else if (palabra.length() == 3){

                    contador = 0;
                    for (int h=0; h<palabra.length(); h++){
                        if (palabra.charAt(h)== dos.charAt(h)){
                            contador++;
                        }
                    }
                    if(contador>=2){
                        System.out.println("2");
                    } else {
                        contador = 0;
                        for (int p=0; p<palabra.length(); p++){
                            if (palabra.charAt(p)== uno.charAt(p)){
                                contador++;
                            }
                        }
                        if(contador>=2){
                            System.out.println("1");
                        }
                    }
                }
        }
    }
    
}
