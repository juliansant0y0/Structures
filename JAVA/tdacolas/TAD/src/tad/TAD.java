/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tad;

import java.util.Scanner;

/**
 *
 * @author jsdiaz
 */
public class TAD {

    /**
     * @param args the command line arguments
     */
    static int Opcion, SubOpcion;

public static void main(String[] args) throws Exception
    {
        
        Cola Cola= new Cola();
Object Dato;
Scanner ler;

        do
                    {

                        SubOpcion=SubMenuCola();
                        switch (SubOpcion)
                        {
                            case 1:
                                    //insertar
                                    ler=new Scanner(System.in);
                                    System.out.println("Ingresar una letra: ");
                                    Dato=ler.nextLine();
                                    Cola.insertar(Dato);
                            break;
                            case 2:
                                    //extraer
                                    try
                                    {
                                        System.out.println("Extrayendo la letra de la cola: " + Cola.extraer());
                                    }
                                    catch (Exception er)
                                    {
                                        System.err.println(er);
                                    }
                            break;
                            case 3:
                                    //imprimir
                                     try
                                    {
                                        Cola.imprimir();
                                    }
                                    catch (Exception er)
                                    {
                                        System.err.println(er);
                                    }
                            break;
                            case 4:
                                    //frente y fondo
                                    try
                                    {
                                        Dato=Cola.FrenteCola();    //Obtengo el fondo de la Lista
                                        System.out.println("La frente de la cola es: " + Dato);
                                        Dato=Cola.FondoCola();    //Obtengo el fondo de la Lista
                                        System.out.println("El fondo de la cola es: " + Dato);
                                    }
                                    catch (Exception er)
                                    {
                                        System.err.println(er);
                                    }
                            break;

                            case 5:
                                    //numero de elementos
                                    System.out.println("Numero de elementos en la cola: " + Cola.getNumElementos());
                            break;
                        }//Fin del switch del SubMenu de cola
                    }
                    while(SubOpcion != 6);



    }

public static int SubMenuCola()
    {
        int opcion=0;
            System.out.println("***********SUBMENU**************");
            System.out.println("******1.-Insertar********");
            System.out.println("*****2.-Extraer***");
            System.out.println("*****3.-Imprimir*****");
            System.out.println("*****4.-Frente y fondo*************");
            System.out.println("*****5.-Numero de elementos*************");
            System.out.println("*****6.-Regresar al menu*************");
            System.out.println("****Ingrese una opcion*****");
            Scanner ler=new Scanner(System.in);
            opcion=ler.nextInt();
        return opcion;
    }
    
}
