/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BienEstrategia;

/**
 *
 * @author YEISON
 */
public class EstrategiaCompresionRar implements IEstrategiaCompresion {

    @Override
    public void comprimir(String texto) {
        System.out.println("Comprimiendo '" + texto + "' a .rar  con Estrategia");
    }
}
