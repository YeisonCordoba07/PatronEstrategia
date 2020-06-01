/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mal;

import java.util.Scanner;

/**
 *
 * @author YEISON
 */
public class ArchivoDeTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Comprimir comprimir = new Comprimir();

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
                    comprimir.comprimir("Soy un texto", "rar");
                    break;
                case "2":
                    comprimir.comprimir("Soy un texto", "zip");
                    break;
                case "3":
                    comprimir.comprimir("Soy un texto", "7zip");
                    break;
                case "4":
                    continuar = false;
                    break;
                default:
                    break;
            }

        }

    }
}
