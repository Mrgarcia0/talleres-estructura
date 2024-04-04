/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package toro.e;
public class ToroE {
//atributos
private String Nombre;
private String Equipo;
private int Edad;
private int Altura;
//getters y setters
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getEquipo(){
        return Equipo;
    }
    public void setEquipo(String Equipo){
        this.Equipo = Equipo;
    }
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int Edad){
        this.Edad = Edad; 
    }
    public int getAltura(){
        return Altura;
    }
    public void setAltura(int Altura){
        this.Altura = Altura;
    }
    public void metodos(){
        System.out.println("encesntar" + Equipo);
        System.out.println("celebracion" + Nombre);
        System.out.println("tiempo" + Edad);
    }
    public ToroE(String n ){
        Nombre=n;
    }
   
    
                
    
     
}
