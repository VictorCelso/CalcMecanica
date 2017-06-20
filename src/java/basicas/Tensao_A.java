package basicas;

public class Tensao_A {

    private double tensao;

    private double forca;

    private double area;

    private double altura_S;

    private double base_S;

    private double altura_C;

    private double base_C;

    private double altura_I;

    private double base_I;

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

    public double getTensao() {
        return tensao;
    }

    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calcular(String opc) {

		/** CALCULANDO A �REA DA SEC��O TRANVERSAL: **/

		setArea((getBase_S() * getAltura_S()) + (getBase_C() * getAltura_C()) + (getBase_I() * getAltura_I()));
		
		/** CALCULANDO A TENS�O DE TRA��O PARA UMA FOR�A AXIAL CENTRADA: **/
		if(opc.equals("C"))
			setTensao(-(getForca() / getArea()));
		else if(opc.equals("T"))
			setTensao(getForca() / getArea());
	}
    
}
