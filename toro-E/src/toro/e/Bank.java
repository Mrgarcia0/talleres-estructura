/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toro.e;
public class Bank {
   
    private String nombre;
    private String direccion;
    private int cantidadSucursales;
    private double fondosTotales;

    public Bank(String nombre, String direccion, int cantidadSucursales, double fondosTotales) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadSucursales = cantidadSucursales;
        this.fondosTotales = fondosTotales;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadSucursales() {
        return cantidadSucursales;
    }

    public void setCantidadSucursales(int cantidadSucursales) {
        this.cantidadSucursales = cantidadSucursales;
    }

    public double getFondosTotales() {
        return fondosTotales;
    }

    public void setFondosTotales(double fondosTotales) {
        this.fondosTotales = fondosTotales;
    }


    public void agregarFondos(double cantidad) {
        fondosTotales += cantidad;
    }

    public void retirarFondos(double cantidad) {
        if (cantidad <= fondosTotales) {
            fondosTotales -= cantidad;
        } else {
            System.out.println("No hay fondos suficientes en el banco.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del banco: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de sucursales: " + cantidadSucursales);
        System.out.println("Fondos totales: $" + fondosTotales);
    }
    public Bank(String n ){
        nombre=n;
    }
}