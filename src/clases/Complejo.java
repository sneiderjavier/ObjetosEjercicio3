/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author GABRIEL
 */
public class Complejo {
    
    private int parteR;
    private int parteI;
    
    public Complejo(int parteR, int parteI){
        this.parteR = parteR;
        this.parteI = parteI;
    }

    public int getParteR() {
        return parteR;
    }

    public void setParteR(int parteR) {
        this.parteR = parteR;
    }

    public int getParteI() {
        return parteI;
    }

    public void setParteI(int parteI) {
        this.parteI = parteI;
    }
    
    public Complejo sumar(Complejo z2){
        Complejo z;
        int  r, i;
        r = this.parteR + z2.parteR;
        i = this.parteI + z2.parteI;
        z = new Complejo(r, i);
        return z;
    }
    
    public Complejo restar(Complejo z2){
        Complejo z;
        int  r, i;
        r = this.parteR - z2.parteR;
        i = this.parteI - z2.parteI;
        z = new Complejo(r, i);
        return z;
    }
    
    public Complejo multiplicar(Complejo z2){
        Complejo z;
        int  r, i;
        r = (this.parteR * z2.parteR) - (this.parteI * z2.parteI);
        i = (this.parteR * z2.parteI) + (this.parteI * z2.parteR);
        z = new Complejo(r, i);
        return z;
    }
    
    public Complejo dividir(Complejo z2){
        Complejo z;
        int rNumerador, iNumerador;
        rNumerador = ((this.parteR * z2.parteR) + (this.parteI * z2.parteI));
        iNumerador = ((this.parteI * z2.parteR) - (this.parteR * z2.parteI));
        z = new Complejo(rNumerador, iNumerador);
        return z;
    }
    
    
}
