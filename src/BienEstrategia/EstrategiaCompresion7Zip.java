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
public class EstrategiaCompresion7Zip implements IEstrategiaCompresion {

    @Override
    public void comprimir(String texto) {
        System.out.println("Comprimiendo '" + texto + "' a .7zip con Estrategia");
    }
}
