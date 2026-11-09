/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.devops.descuento;

/**
 *
 * @author benja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unidades = args.length >0 ?  Integer.parseInt(args[0]) : 500;
        System.out.println(unidades + " unidades-> "+ new Descuento().porcentaje(unidades) +"%");
    }
    
}
