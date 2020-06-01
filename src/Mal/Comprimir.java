/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mal;

/**
 *
 * @author YEISON
 */
public class Comprimir {


    public Comprimir() {

    }

    public void comprimir(String texto, String formato) {
        switch (formato) {
            case "zip":
                System.out.println("Comprimiendo '" + texto + "' a ." + formato);
                break;
            case "rar":
                System.out.println("Comprimiendo '" + texto + "' a ." + formato);
                break;
            case "7zip":
                System.out.println("Comprimiendo '" + texto + "' a ." + formato);
                break;
            default:
                System.out.println("Formato no encontrado");
                break;
        }
    }

}
