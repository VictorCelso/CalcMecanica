/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author v.tassinari
 */
@ManagedBean
@ViewScoped
public class Beancalc {
    
    private double torque;
    private double raioMenor;
    private double raioMaior;
    private double forca;
    private double alturaSup;
    private double baseSup;
    private double baseInf;
    private double alturaInf;
    private double alturaCent;
    private double baseCent;
    private double comprimento;

    /**
     * Creates a new instance of Beancalc
     */
    public Beancalc() {
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public double getRaioMenor() {
        return raioMenor;
    }

    public void setRaioMenor(double raioMenor) {
        this.raioMenor = raioMenor;
    }

    public double getRaioMaior() {
        return raioMaior;
    }

    public void setRaioMaior(double raioMaior) {
        this.raioMaior = raioMaior;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getAlturaSup() {
        return alturaSup;
    }

    public void setAlturaSup(double alturaSup) {
        this.alturaSup = alturaSup;
    }

    public double getBaseSup() {
        return baseSup;
    }

    public void setBaseSup(double baseSup) {
        this.baseSup = baseSup;
    }

    public double getBaseInf() {
        return baseInf;
    }

    public void setBaseInf(double baseInf) {
        this.baseInf = baseInf;
    }

    public double getAlturaInf() {
        return alturaInf;
    }

    public void setAlturaInf(double alturaInf) {
        this.alturaInf = alturaInf;
    }

    public double getAlturaCent() {
        return alturaCent;
    }

    public void setAlturaCent(double alturaCent) {
        this.alturaCent = alturaCent;
    }

    public double getBaseCent() {
        return baseCent;
    }

    public void setBaseCent(double baseCent) {
        this.baseCent = baseCent;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
}
