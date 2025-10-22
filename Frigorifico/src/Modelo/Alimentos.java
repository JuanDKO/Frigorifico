/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Alimentos {
    String nombre;
    int cantidad;
    String fechaCaducidad;
    
    public Alimentos(){}
    
    public Alimentos(String n,int c, String fc) {
        this.nombre = n;
        this.cantidad = c;
        this.fechaCaducidad = fc;
    }
    
    public String getNombre() { return nombre; }
    public void setNombre(String n) { this.nombre = n; }
    
    public int getCantidad() { return cantidad; }
    public void setCantidad(int c) { this.cantidad = c; }
    
    public String getCaducidad() { return fechaCaducidad; }
    public void setCaducidad(String fc) { this.fechaCaducidad = fc; }
    
}
