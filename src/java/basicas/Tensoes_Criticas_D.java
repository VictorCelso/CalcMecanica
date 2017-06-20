/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

public class Tensoes_Criticas_D {

    private double coluna;

    private double raio_E;

    private double raio_I;

    private double moduloElastico;

    private double tensao_C_pinos;

    private double tensao_C_engast_livre;

    private double tensao_C_pino_engast;

    private double tensao_C_engast;

    private double momento_inercia;

    private double carga_C_pinos;

    private double carga_C_engast_livre;

    private double carga_C_pinos_engast;

    private double carga_C_engast;

    private double area_s_trans;

    public double getCarga_C_pinos() {
        return carga_C_pinos;
    }

    public void setCarga_C_pinos(double carga_C_pinos) {
        this.carga_C_pinos = carga_C_pinos;
    }

    public double getCarga_C_engast_livre() {
        return carga_C_engast_livre;
    }

    public void setCarga_C_engast_livre(double carga_C_engast_livre) {
        this.carga_C_engast_livre = carga_C_engast_livre;
    }

    public double getCarga_C_pinos_engast() {
        return carga_C_pinos_engast;
    }

    public void setCarga_C_pinos_engast(double carga_C_pinos_engast) {
        this.carga_C_pinos_engast = carga_C_pinos_engast;
    }

    public double getCarga_C_engast() {
        return carga_C_engast;
    }

    public void setCarga_C_engast(double carga_C_engast) {
        this.carga_C_engast = carga_C_engast;
    }

    public double getMomento_inercia() {
        return momento_inercia;
    }

    public void setMomento_inercia(double momento_inercia) {
        this.momento_inercia = momento_inercia;
    }

    public double getArea_s_trans() {
        return area_s_trans;
    }

    public void setArea_s_trans(double area_s_trans) {
        this.area_s_trans = area_s_trans;
    }

    public double getColuna() {
        return coluna;
    }

    public void setColuna(double coluna) {
        this.coluna = coluna;
    }

    public double getRaio_E() {
        return raio_E;
    }

    public void setRaio_E(double raio_E) {
        this.raio_E = raio_E;
    }

    public double getRaio_I() {
        return raio_I;
    }

    public void setRaio_I(double raio_I) {
        this.raio_I = raio_I;
    }

    public double getModuloElastico() {
        return moduloElastico;
    }

    public void setModuloElastico(double moduloElastico) {
        this.moduloElastico = moduloElastico;
    }

    public double getTensao_C_pinos() {
        return tensao_C_pinos;
    }

    public void setTensao_C_pinos(double tensao_C_pinos) {
        this.tensao_C_pinos = tensao_C_pinos;
    }

    public double getTensao_C_engast_livre() {
        return tensao_C_engast_livre;
    }

    public void setTensao_C_engast_livre(double tensao_C_engast_livre) {
        this.tensao_C_engast_livre = tensao_C_engast_livre;
    }

    public double getTensao_C_pino_engast() {
        return tensao_C_pino_engast;
    }

    public void setTensao_C_pino_engast(double tensao_C_pino_engast) {
        this.tensao_C_pino_engast = tensao_C_pino_engast;
    }

    public double getTensao_C_engast() {
        return tensao_C_engast;
    }

    public void setTensao_C_engast(double tensao_C_engast) {
        this.tensao_C_engast = tensao_C_engast;
    }
    
    public void calcular() {

        //Calculo da inercia
        double val1 = Math.pow(getRaio_E(), 4);

        double val2 = Math.pow(getRaio_I(), 4);

        setMomento_inercia(3.1416 * (val1 - val2) / 4);

        //Calculo das extremidades com pinos
        double piSqr = Math.pow(3.1416, 2);

        val2 = Math.pow(getColuna(), 2);

        setCarga_C_pinos((piSqr * getModuloElastico() * getMomento_inercia()) / val2);

        /**
         * CALCULANDO A CARGA CR�TICA EM EXTREMIDADES ENGASTADAS E OUTRA LIVRE:
         *
         */

        val1 = Math.pow((2 * getColuna()), 2);

        setCarga_C_engast_livre((piSqr * getModuloElastico() * getMomento_inercia()) / val1);

        //Calculo de extremidades fixadas com engastes e pinos
        val1 = Math.pow((0.7 * getColuna()), 2);

        setCarga_C_pinos_engast((piSqr * getModuloElastico() * getMomento_inercia()) / val1);

       //Calculo de extremidades com engaste
        
        val1 = Math.pow((0.5 * getColuna()), 2);

        setCarga_C_engast((piSqr * getModuloElastico() * getMomento_inercia()) / val1);

       //Calculo de secção transversal
        val1 = Math.pow(getRaio_E(), 2);

        val2 = Math.pow(getRaio_I(), 2);
        
        setArea_s_trans((3.1416 * val1) - (3.1416 * val2));

        //Calculo de tensão critica com pino
        setTensao_C_pinos(getCarga_C_pinos() / getArea_s_trans());

       //Calculo de tensão critica com engaste livre
        setTensao_C_engast_livre(getCarga_C_engast_livre() / getArea_s_trans());

        //Calculo de tensão critica com pino e engaste
        setTensao_C_pino_engast(getCarga_C_pinos_engast() / getArea_s_trans());

       //Calculo de tensão critica com engaste
        setTensao_C_engast(getCarga_C_engast() / getArea_s_trans());

    }
    
}
