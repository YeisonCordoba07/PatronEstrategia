/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bien;

import BienEstrategia.EstrategiaCompresion7Zip;
import BienEstrategia.EstrategiaCompresionRar;
import BienEstrategia.EstrategiaCompresionZip;
import BienEstrategia.IEstrategiaCompresion;
import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEstrategiaCompresion comprimir = null;

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            System.out.println("Ingrese Texto");
            String texto = teclado.nextLine();
            System.out.println("Su texto es: " + texto);
            System.out.println("");
            System.out.println("A cual formato quiere comprimirlo:");
            System.out.println("1. rar");
            System.out.println("2. zip");
            System.out.println("3. 7zip");
            System.out.println("4. salir");
            String respuesta = teclado.nextLine();

            switch (respuesta) {
                case "1":
                    comprimir = new EstrategiaCompresionRar();
                    break;
                case "2":
                    comprimir = new EstrategiaCompresionZip();
                    break;
                case "3":
                    comprimir = new EstrategiaCompresion7Zip();
                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    break;
            }
            if (continuar) {
                comprimir.comprimir(texto);
            }
        }

    }

}
