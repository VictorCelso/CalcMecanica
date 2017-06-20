/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

public class TracaoCompressaoB {
    
    private double comprimento;

    private double forca;

    private double flexao_comp;

    private double flexao_trac;

    private double momento_int;

    private double altura_S;

    private double base_S;

    private double altura_C;

    private double base_C;

    private double altura_I;

    private double base_I;

    private double a1;

    private double a2;

    private double a3;

    private double d1;

    private double d2;

    private double d3;

    private double momento_est;

    private double area_total;

    private double centroide;

    private double i1;

    private double i2;

    private double i3;

    private double inercia_total;

    private double dist_cent_sup;

    private double dist_cent_inf;

    private double result;

    private double result1;

    private double result2;

    private double result3;

    private double result4;

    private double result5;

    private double result6;

    public double getMomento_int() {
        return momento_int;
    }

    public void setMomento_int(double momento_int) {
        this.momento_int = momento_int;
    }

    public double getAltura_S() {
        return altura_S;
    }

    public void setAltura_S(double altura_S) {
        this.altura_S = altura_S;
    }

    public double getBase_S() {
        return base_S;
    }

    public void setBase_S(double base_S) {
        this.base_S = base_S;
    }

    public double getAltura_C() {
        return altura_C;
    }

    public void setAltura_C(double altura_C) {
        this.altura_C = altura_C;
    }

    public double getBase_C() {
        return base_C;
    }

    public void setBase_C(double base_C) {
        this.base_C = base_C;
    }

    public double getAltura_I() {
        return altura_I;
    }

    public void setAltura_I(double altura_I) {
        this.altura_I = altura_I;
    }

    public double getBase_I() {
        return base_I;
    }

    public void setBase_I(double base_I) {
        this.base_I = base_I;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getD3() {
        return d3;
    }

    public void setD3(double d3) {
        this.d3 = d3;
    }

    public double getMomento_est() {
        return momento_est;
    }

    public void setMomento_est(double momento_est) {
        this.momento_est = momento_est;
    }

    public double getArea_total() {
        return area_total;
    }

    public void setArea_total(double area_total) {
        this.area_total = area_total;
    }

    public double getI1() {
        return i1;
    }

    public void setI1(double i1) {
        this.i1 = i1;
    }

    public double getI2() {
        return i2;
    }

    public void setI2(double i2) {
        this.i2 = i2;
    }

    public double getI3() {
        return i3;
    }

    public void setI3(double i3) {
        this.i3 = i3;
    }

    public double getDist_cent_sup() {
        return dist_cent_sup;
    }

    public void setDist_cent_sup(double dist_cent_sup) {
        this.dist_cent_sup = dist_cent_sup;
    }

    public double getDist_cent_inf() {
        return dist_cent_inf;
    }

    public void setDist_cent_inf(double dist_cent_inf) {
        this.dist_cent_inf = dist_cent_inf;
    }

    public double getCentroide() {
        return centroide;
    }

    public void setCentroide(double centroide) {
        this.centroide = centroide;
    }

    public double getInercia_total() {
        return inercia_total;
    }

    public void setInercia_total(double inercia_total) {
        this.inercia_total = inercia_total;
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

    public void calcular() {

        /**
         * CALCULANDO O MOMENTO INTERNO: *
         */
        setResult(Math.pow(getComprimento(), 2));

        setMomento_int((getForca() * getResult()) / 8);

        /**
         * CALCULANDO A PRIMEIRA �REA: *
         */
        setA1(getBase_S() * getAltura_S());

        /**
         * CALCULANDO A SEGUNDA �REA: *
         */
        setA2(getBase_C() * getAltura_C());

        /**
         * CALCULANDO A TERCEIRA �REA: *
         */
        setA3(getBase_I() * getAltura_I());

        /**
         * CALCULANDO A DIST�NCIA DO PRIMEIRO CENTRO�DE AT� O EIXO DE
         * REFER�NCIA:
		 *
         */
        setD1((getBase_S() / 2) + getAltura_C() + getBase_I());

        /**
         * CALCULANDO A DIST�NCIA DO SEGUNDO CENTRO�DE AT� O EIXO DE REFER�NCIA:
		 *
         */
        setD2((getAltura_C() / 2) + getAltura_I());

        /**
         * CALCULANDO A DIST�NCIA DO TERCEIRO CENTRO�DE AT� O EIXO DE
         * REFER�NCIA:
		 *
         */
        setD3(getAltura_I() / 2);

        /**
         * CALCULANDO O MOMENTO EST�TICO: *
         */
        setMomento_est((getA1() * getD1()) + (getA2() * getD2()) + (getA3() * getD3()));

        /**
         * CALCULANDO A �REA TOTAL: *
         */
        setArea_total(getA1() + getA2() + getA3());

        /**
         * CALCULANDO O CENTRO�DE EM LINHA: *
         */
        setCentroide(getMomento_est() / getArea_total());

        /**
         * CALCULANDO A IN�RCIA DA PRIMEIRA �REA: *
         */
        setResult1(Math.pow(getBase_S(), 3));

        setResult4(Math.pow((getCentroide() - getD1()), 2));

        setI1((getAltura_S() * getResult1()) / 12 + getA1() * getResult4());

        /**
         * CALCULANDO A IN�RCIA DA SEGUNDA �REA: *
         */
        setResult2(Math.pow(getAltura_C(), 3));

        setResult5(Math.pow((getCentroide() - getD2()), 2));

        setI2((getBase_C() * getResult2()) / 12 + getA2() * getResult5());

        /**
         * CALCULANDO A IN�RCIA DA TERCEIRA �REA: *
         */
        setResult3(Math.pow(getBase_I(), 3));

        setResult6(Math.pow((getCentroide() - getD3()), 2));

        setI3((getAltura_I() * getResult3()) / 12 + getA3() * getResult6());

        /**
         * CALCULANDO A IN�RCIA TOTAL: *
         */
        setInercia_total(getI1() + getI2() + getI3());

        /**
         * CALCULANDO A DIST�NCIA DO CENTR�IDE AT� A PARTE SUPERIOR: *
         */
        setDist_cent_sup((getBase_S() + getAltura_C() + getBase_I()) - getCentroide());

        /**
         * CALCULANDO A DIST�NCIA DO CENTR�IDE AT� A PARTE INFERIOR: *
         */
        setDist_cent_inf(-getCentroide());

        /**
         * CALCULANDO A FLEX�O DE TRA��O PARA UMA FOR�A CENTRADA
         * TRANSVERSALMENTE:
		 *
         */
        setFlexao_trac((-getMomento_int() * getDist_cent_inf()) / getInercia_total());

        /**
         * CALCULANDO A FLEX�O DE COMPRESS�O PARA UMA FOR�A CENTRADA
         * TRANSVERSALMENTE:
		 *
         */
        setFlexao_comp((-getMomento_int() * getDist_cent_sup()) / getInercia_total());

    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getFlexao_comp() {
        return flexao_comp;
    }

    public void setFlexao_comp(double flexao_comp) {
        this.flexao_comp = flexao_comp;
    }

    public double getFlexao_trac() {
        return flexao_trac;
    }

    public void setFlexao_trac(double flexao_trac) {
        this.flexao_trac = flexao_trac;
    }

}
