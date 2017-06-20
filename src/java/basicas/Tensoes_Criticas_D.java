/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

public class Tensoes_Criticas_D extends Letra_D {

    private double momento_inercia;

    private double carga_C_pinos;

    private double carga_C_engast_livre;

    private double carga_C_pinos_engast;

    private double carga_C_engast;

    private double area_s_trans;

    private double result;

    private double result1;

    private double result2;

    private double result3;

    private double result4;

    private double result5;

    private double result6;

    private double result7;

    private double result8;

    private double result9;

    private double result10;

    private double result11;

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

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult1() {
        return result1;
    }

    public void setResult1(double result1) {
        this.result1 = result1;
    }

    public double getResult2() {
        return result2;
    }

    public void setResult2(double result2) {
        this.result2 = result2;
    }

    public double getResult3() {
        return result3;
    }

    public void setResult3(double result3) {
        this.result3 = result3;
    }

    public double getResult4() {
        return result4;
    }

    public void setResult4(double result4) {
        this.result4 = result4;
    }

    public double getResult5() {
        return result5;
    }

    public void setResult5(double result5) {
        this.result5 = result5;
    }

    public double getResult6() {
        return result6;
    }

    public void setResult6(double result6) {
        this.result6 = result6;
    }

    public double getResult7() {
        return result7;
    }

    public void setResult7(double result7) {
        this.result7 = result7;
    }

    public double getResult8() {
        return result8;
    }

    public void setResult8(double result8) {
        this.result8 = result8;
    }

    public double getResult9() {
        return result9;
    }

    public void setResult9(double result9) {
        this.result9 = result9;
    }

    public double getResult10() {
        return result10;
    }

    public void setResult10(double result10) {
        this.result10 = result10;
    }

    public double getResult11() {
        return result11;
    }

    public void setResult11(double result11) {
        this.result11 = result11;
    }

    public void calcular() {

        /**
         * CALCULANDO O MOMENTO IN�RCIA: *
         */
        setResult(Math.pow(getRaio_E(), 4));

        setResult1(Math.pow(getRaio_I(), 4));

        setMomento_inercia(3.1416 * (getResult() - getResult1()) / 4);

        /**
         * CALCULANDO A CARGA CR�TICA EM EXTREMIDADES PRESAS COM PINOS: *
         */
        setResult2(Math.pow(3.1416, 2));

        setResult6(Math.pow(getColuna(), 2));

        setCarga_C_pinos((getResult2() * getModuloElastico()) / getResult6());

        /**
         * CALCULANDO A CARGA CR�TICA EM EXTREMIDADES ENGASTADAS E OUTRA LIVRE:
         *
         */
        setResult3(Math.pow(3.1416, 2));

        setResult7(Math.pow((2 * getColuna()), 2));

        setCarga_C_engast_livre((getResult3() * getModuloElastico()) / getResult7());

        /**
         * CALCULANDO A CARGA CR�TICA EM EXTREMIDADES ENGASTADAS E PRESAS POR
         * PINOS:
         *
         */
        setResult4(Math.pow(3.1416, 2));

        setResult8(Math.pow((0.7 * getColuna()), 2));

        setCarga_C_pinos_engast((getResult4() * getModuloElastico()) / getResult8());

        /**
         * CALCULANDO A CARGA CR�TICA EM EXTREMIDADES ENGASTADAS: *
         */
        setResult5(Math.pow(3.1416, 2));

        setResult9(Math.pow((0.5 * getColuna()), 2));

        setCarga_C_engast((getResult5() * getModuloElastico()) / getResult9());

        /**
         * CALCULANDO A �REA DA SEC��O TRANSVERSAL: *
         */
        setResult10(Math.pow(getRaio_E(), 2));

        setResult11(Math.pow(getRaio_I(), 2));
        setArea_s_trans((3.1416 * getResult10()) - (3.1416 * getResult11()));

        /**
         * CALCULANDO A TENS�O CR�TICA EM UMA EXTREMIDADE COM PINOS PARA
         * DIVERSAS CONDI��ES DE CARREGAMENTO:
         *
         */
        setTensao_C_pinos(getCarga_C_pinos() / getArea_s_trans());

        /**
         * CALCULANDO A TENS�O CR�TICA EM UMA EXTREMIDADE ENGASTADA E OUTRA
         * EXTREMIDADE LIVRE PARA DIVERSAS CONDI��ES DE CARREGAMENTO:
         *
         */
        setTensao_C_engast_livre(getCarga_C_engast_livre() / getArea_s_trans());

        /**
         * CALCULANDO A TENS�O CR�TICA EM UMA EXTREMIDADE COM PINO E OUTRA
         * EXTREMIDADE ENGASTADA PARA DIVERSAS CONDI��ES DE CARREGAMENTO:
         *
         */
        setTensao_C_pino_engast(getCarga_C_pinos_engast() / getArea_s_trans());

        /**
         * CALCULANDO A CARGA CR�TICA EM EXTREMIDADES ENGASTADAS PARA DIVERSAS
         * CONDI��ES DE CARREGAMENTO:
         *
         */
        setTensao_C_engast(getCarga_C_engast() / getArea_s_trans());

    }

}
