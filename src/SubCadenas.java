/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class SubCadenas {
    public static void main(String[] args) {
        var cadena1 = "hola mundo amigos mios";
        
        System.out.println(cadena1); 
       System.out.println("con sub cadena ==" + cadena1.substring(0, 10));
    
        System.out.println("indice 2  == " + cadena1.lastIndexOf("mundo"));
        System.out.println("para cadena no encontrada  " + cadena1.indexOf("java"));
        System.out.println("last index" + cadena1.lastIndexOf("mundo"));
        System.out.println(" reemplazar cadena " + cadena1.replace("amigos mios", "buenas a todos guapisimos"));
        cadena1 = "nuevo mensaje";
        System.out.println(cadena1);

    }
    
    
    
}
