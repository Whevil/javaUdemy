/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class ManejoDeCadenas {
    public static void main(String[] args) {
        String saludo = "hola mundo";
        System.out.println(saludo);
        System.out.println(saludo.length());
        System.out.println("cambiar caracteres " + saludo.replace("o", "i"));
        System.out.println("matusculas " + saludo.toUpperCase());
        System.out.println("minusculas " + saludo.toLowerCase());
        
        // elimina espacios en la char inicio y final
        var cadena1 = "   el amor es un perro del infierno   ";
        System.out.println(cadena1);
        System.out.println(cadena1.trim());
    }   
}
