/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class MasConcatenacionConCadenas {
    // mas formas de concatenacion de cadenas 
    public static void main(String[] args) {
        var cadena1 = "hola";
        var cadena2 = "mundo";
        //var cadena3 = cadena1 + cadena2;
        //metodo de concatenacion concat
        System.out.println("concatenacion con concat " + cadena1.concat(" ").concat(cadena2));            
        
        
        // concatenar con string builder 
        //no genera instanacias no genera varias cadenas en memoria
        
        var constructorDeCadenas =  new StringBuilder();
        constructorDeCadenas.append(cadena1);
        constructorDeCadenas.append(" ");
        constructorDeCadenas.append(cadena2);
        var resultado = constructorDeCadenas.toString();
        System.out.println(" usando StringBuilder  "+ resultado);
        
        // concatenacion con StringBuffer mejor con varios hilos mas recomendable 
        var variableStringBuffer = new StringBuffer();
        
        var ejemplo =  variableStringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("con StringBuffer  " + ejemplo);
        
        // metodo usando join 
        var resultado2 = String.join(" ", cadena1, cadena2);
        
        System.out.println("usndo join " + resultado2);
        
        
    }
    
}
