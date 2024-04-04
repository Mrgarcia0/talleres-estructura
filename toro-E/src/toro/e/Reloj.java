/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toro.e;
public class Reloj {
    private String hora;
    private String alarma;
    private String color;
    private int cronometro;

   
    public Reloj(String hora, String alarma, String color, int cronometro) {
        this.hora = hora;
        this.alarma = alarma;
        this.color = color;
        this.cronometro = cronometro;
    }

   
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCronometro() {
        return cronometro;
    }

    public void setCronometro(int cronometro) {
        this.cronometro = cronometro;
    }

    public void mostrarHora() {
        System.out.println("La hora actual es: " + hora);
    }

    public void activarAlarma() {
        System.out.println("¡Alarma activada para las " + alarma + "!");
    }

    public void iniciarCronometro() {
        System.out.println("Cronómetro iniciado.");
    }

    public static void main(String[] args) {
       
        Reloj miReloj = new Reloj("10:30", "11:00", "Rojo", 0);
        System.out.println("El color de mi reloj es: " + miReloj.getColor());
        miReloj.mostrarHora();
        miReloj.activarAlarma();
    }
    public Reloj(String n ){
        color=n;
    }
}