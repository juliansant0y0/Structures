/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tad;

/**
 *
 * @author jsdiaz
 */
public class Nodo
{
    Object elemento; //es el elemento que guarda en la cola
    Nodo siguiente; //contiene la direccion del siguiente nodo en la cola

    public Nodo(Object dato)
    {
        elemento = dato;
        siguiente = null;
    }    
}