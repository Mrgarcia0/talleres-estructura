/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toro.e;

public class mainto {
    public static void main(String[] args){
        ToroE s1 = new ToroE("Guzman");
        Reloj s2 = new Reloj("Naranja");
        Bank s3 = new Bank("TD Ameritrade");
        System.out.println(s1.getNombre());
        System.out.println(s2.getColor());
        System.out.println(s3.getNombre());
        
    }
}
